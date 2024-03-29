package com.vitaxa.steamkit.types;

import com.vitaxa.steamkit.TestBase;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import uk.co.thomasc.steamkit.base.generated.enums.EChatPermission;
import uk.co.thomasc.steamkit.base.generated.enums.EResult;
import uk.co.thomasc.steamkit.types.KeyValue;
import uk.co.thomasc.steamkit.util.stream.MemoryStream;
import uk.co.thomasc.steamkit.util.stream.SeekOrigin;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.EnumSet;
import java.util.UUID;

import static org.junit.Assert.*;

public class KeyValueTest extends TestBase {

    public static final String TEST_OBJECT_HEX = "00546573744F626A65637400016B65790076616C7565000808";

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void keyValueInitializesCorrectly() {
        KeyValue kv = new KeyValue("name", "value");

        assertEquals("name", kv.getName());
        assertEquals("value", kv.getValue());
        assertTrue(kv.getChildren().isEmpty());
    }

    @Test
    public void keyValueIndexerReturnsValidAndInvalid() {
        KeyValue kv = new KeyValue();

        kv.getChildren().add(new KeyValue("exists", "value"));

        assertEquals("value", kv.get("exists").getValue());
        assertEquals(KeyValue.INVALID, kv.get("thiskeydoesntexist"));
    }

    @Test
    public void keyValueIndexerDoesntallowDuplicates() {
        KeyValue kv = new KeyValue();

        kv.set("key", new KeyValue());

        assertEquals(1, kv.getChildren().size());

        kv.set("key", new KeyValue());

        assertEquals(1, kv.getChildren().size());

        kv.set("key2", new KeyValue());

        assertEquals(2, kv.getChildren().size());
    }

    @Test
    public void keyValueIndexerUpdatesKey() {
        KeyValue kv = new KeyValue();

        KeyValue subkey = new KeyValue();

        assertNull(subkey.getName());

        kv.set("subkey", subkey);

        assertEquals("subkey", subkey.getName());
        assertEquals("subkey", kv.get("subkey").getName());
    }

    @Test
    public void keyValueLoadsFromString() {
        KeyValue kv = KeyValue.loadFromString("" +
                "\"root\"" +
                "{" +
                "    \"name\" \"value\"" +
                "    \"subkey\"" +
                "    {" +
                "        \"name2\" \"value2\"" +
                "    }" +
                "}");

        assertEquals("root", kv.getName());
        assertNull(kv.getValue());

        assertEquals("name", kv.get("name").getName());
        assertEquals("value", kv.get("name").getValue());
        assertEquals(0, kv.get("name").getChildren().size());

        KeyValue subKey = kv.get("subkey");

        assertEquals(1, subKey.getChildren().size());

        assertEquals("name2", subKey.get("name2").getName());
        assertEquals("value2", subKey.get("name2").getValue());
        assertEquals(0, subKey.get("name2").getChildren().size());
    }

    @Test
    public void keyValuesMissingKeysGiveInvalid() {
        KeyValue kv = new KeyValue();
        assertSame(KeyValue.INVALID, kv.get("missingkey"));
    }

    @Test
    public void keyValuesKeysAreCaseInsensitive() {
        KeyValue kv = KeyValue.loadFromString("" +
                "\"root\"" +
                "{" +
                "    \"name\" \"value\"" +
                "}");

        assertEquals("value", kv.get("name").getValue());
        assertEquals("value", kv.get("NAME").getValue());
        assertEquals("value", kv.get("NAme").getValue());
    }

    @Test
    public void keyValuesHandlesBool() {
        KeyValue kv = KeyValue.loadFromString("" +
                "\"root\"" +
                "{" +
                "    \"name\" \"1\"" +
                "}");

        assertTrue(kv.get("name").asBoolean());

        kv.get("name").setValue("0");
        assertFalse(kv.get("name").asBoolean());

        kv.get("name").setValue("1000");
        assertTrue("values other than 0 are truthy", kv.get("name").asBoolean());

        kv.get("name").setValue("inavlidbool");
        assertFalse("values that cannot be converted to integers are falsey", kv.get("name").asBoolean());
    }

    @Test
    public void keyValuesHandlesFloat() {
        KeyValue kv = KeyValue.loadFromString("" +
                "\"root\"" +
                "{" +
                "    \"name\" \"123.456\"" +
                "}");

        assertEquals(123.456f, kv.get("name").asFloat(), 0.0f);

        kv.get("name").setValue("invalidfloat");

        assertEquals(654.321f, kv.get("name").asFloat(654.321f), 0.0f);
    }

    @Test
    public void keyValuesHandlesInteger() {
        KeyValue kv = KeyValue.loadFromString("" +
                "\"root\"" +
                "{" +
                "    \"name\" \"123\"" +
                "}");

        assertEquals(123, kv.get("name").asInteger());

        kv.get("name").setValue("invalidint");

        assertEquals(321, kv.get("name").asInteger(321));
    }

    @Test
    public void keyValuesHandlesLong() {
        KeyValue kv = KeyValue.loadFromString("" +
                "\"root\"" +
                "{" +
                "    \"name\" \"-5001050759734897745\"" +
                "}");

        assertEquals(-5001050759734897745L, kv.get("name").asLong());

        kv.get("name").setValue("invalidint");

        assertEquals(678L, kv.get("name").asLong(678L));
    }

    @Test
    public void keyValuesHandlesString() {
        KeyValue kv = KeyValue.loadFromString("" +
                "\"root\"" +
                "{" +
                "    \"name\" \"stringvalue\"" +
                "}");

        assertEquals("stringvalue", kv.get("name").asString());
        assertEquals("stringvalue", kv.get("name").getValue());
    }

    @Test
    public void keyValuesWritesBinaryToFile() throws IOException {
        String expectedHexValue = "00525000017374617475730023444F54415F52505F424F54505241435449434500016E756D5F706172616D730030000" +
                "17761746368696E675F736572766572005B413A313A323130383933353136393A353431325D00017761746368696E675F66726F6D5F73" +
                "6572766572005B413A313A3836343436383939343A353431325D000808";

        KeyValue kv = new KeyValue("RP");
        kv.getChildren().add(new KeyValue("status", "#DOTA_RP_BOTPRACTICE"));
        kv.getChildren().add(new KeyValue("num_params", "0"));
        kv.getChildren().add(new KeyValue("watching_server", "[A:1:2108935169:5412]"));
        kv.getChildren().add(new KeyValue("watching_from_server", "[A:1:864468994:5412]"));

        File tempFile;
        tempFile = folder.newFile();

        kv.saveToFile(tempFile, true);

        byte[] binaryValue = Files.readAllBytes(Paths.get(tempFile.getPath()));
        String hexValue = Hex.encodeHexString(binaryValue, false).replaceAll("-", "");

        assertEquals(expectedHexValue, hexValue);
    }

    @Test
    public void keyValuesWritesBinaryToStream() throws IOException {
        String expectedHexValue = "00525000017374617475730023444F54415F52505F424F54505241435449434500016E756D5F706172616D730030000" +
                "17761746368696E675F736572766572005B413A313A323130383933353136393A353431325D00017761746368696E675F66726F6D5F73" +
                "6572766572005B413A313A3836343436383939343A353431325D000808";

        KeyValue kv = new KeyValue("RP");
        kv.getChildren().add(new KeyValue("status", "#DOTA_RP_BOTPRACTICE"));
        kv.getChildren().add(new KeyValue("num_params", "0"));
        kv.getChildren().add(new KeyValue("watching_server", "[A:1:2108935169:5412]"));
        kv.getChildren().add(new KeyValue("watching_from_server", "[A:1:864468994:5412]"));

        MemoryStream ms = new MemoryStream();
        kv.saveToStream(ms.asOutputStream(), true);

        String hexValue = Hex.encodeHexString(ms.toByteArray(), false).replaceAll("-", "");

        assertEquals(expectedHexValue, hexValue);
    }

    @Test
    public void keyValueBinarySerializationIsSymmetric() throws IOException {
        KeyValue kv = new KeyValue("MessageObject");
        kv.getChildren().add(new KeyValue("key", "value"));

        KeyValue deserializedKv = new KeyValue();
        boolean loaded;

        MemoryStream ms = new MemoryStream();
        kv.saveToStream(ms.asOutputStream(), true);
        ms.seek(0, SeekOrigin.BEGIN);
        loaded = deserializedKv.tryReadAsBinary(ms);

        assertTrue(loaded);

        assertEquals(kv.getName(), deserializedKv.getName());
        assertEquals(kv.getChildren().size(), deserializedKv.getChildren().size());

        for (int i = 0; i < kv.getChildren().size(); i++) {
            KeyValue originalChild = kv.getChildren().get(i);
            KeyValue deserializedChild = deserializedKv.getChildren().get(i);

            assertEquals(originalChild.getName(), deserializedChild.getName());
            assertEquals(originalChild.getValue(), deserializedChild.getValue());
        }
    }

    @Test
    public void keyValues_TryReadAsBinary_ReadsBinary() throws IOException, DecoderException {
        byte[] binary = Hex.decodeHex(TEST_OBJECT_HEX);
        KeyValue kv = new KeyValue();
        boolean success;

        MemoryStream ms = new MemoryStream(binary);
        success = kv.tryReadAsBinary(ms);
        assertEquals(ms.getLength(), ms.getPosition());

        assertTrue("Should have read test object.", success);
        assertEquals("TestObject", kv.getName());
        assertEquals(1, kv.getChildren().size());
        assertEquals("key", kv.getChildren().get(0).getName());
        assertEquals("value", kv.getChildren().get(0).getValue());
    }

    @Test
    public void keyValuesReadsBinaryWithLeftoverData() throws IOException, DecoderException {
        byte[] binary = Hex.decodeHex(TEST_OBJECT_HEX + UUID.randomUUID().toString().replaceAll("-", ""));
        KeyValue kv = new KeyValue();
        boolean success;

        MemoryStream ms = new MemoryStream(binary);
        success = kv.tryReadAsBinary(ms);
        assertEquals(TEST_OBJECT_HEX.length() / 2, ms.getPosition());
        assertEquals(16, ms.getLength() - ms.getPosition());

        assertTrue("Should have read test object.", success);
        assertEquals("TestObject", kv.getName());
        assertEquals(1, kv.getChildren().size());
        assertEquals("key", kv.getChildren().get(0).getName());
        assertEquals("value", kv.getChildren().get(0).getValue());
    }

    @Test
    public void keyValuesFailsToReadTruncatedBinary() throws IOException, DecoderException {
        // Test every possible truncation boundary we have.
        for (int i = 0; i < TEST_OBJECT_HEX.length(); i += 2) {
            byte[] binary = Hex.decodeHex(TEST_OBJECT_HEX.substring(0, i));
            KeyValue kv = new KeyValue();
            boolean success = false;

            MemoryStream ms = new MemoryStream(binary);
            try {
                success = kv.tryReadAsBinary(ms);
                assertFalse(true);
            } catch (EOFException ignored) {
            }
            assertEquals(ms.getLength(), ms.getPosition());

            assertFalse("Should not have read test object.", success);
        }
    }

    @Test
    public void keyValuesReadsBinaryWithMultipleChildren() throws IOException, DecoderException {
        String hex = "00546573744f626a65637400016b6579310076616c75653100016b6579320076616c756532000808";
        byte[] binary = Hex.decodeHex(hex);
        KeyValue kv = new KeyValue();
        boolean success;
        MemoryStream ms = new MemoryStream(binary);
        success = kv.tryReadAsBinary(ms);

        assertTrue(success);

        assertEquals("TestObject", kv.getName());
        assertEquals(2, kv.getChildren().size());
        assertEquals("key1", kv.getChildren().get(0).getName());
        assertEquals("value1", kv.getChildren().get(0).getValue());
        assertEquals("key2", kv.getChildren().get(1).getName());
        assertEquals("value2", kv.getChildren().get(1).getValue());
    }

    @Test
    public void keyValuesSavesTextToFile() throws IOException {
        String expected = "\"RootNode\"\n{\n\t\"key1\"\t\t\"value1\"\n\t\"key2\"\n\t{\n\t\t\"ChildKey\"\t\t\"ChildValue\"\n\t}\n}\n";

        KeyValue kv = new KeyValue("RootNode");
        KeyValue kv2 = new KeyValue("key2");
        kv2.getChildren().add(new KeyValue("ChildKey", "ChildValue"));

        kv.getChildren().add(new KeyValue("key1", "value1"));
        kv.getChildren().add(kv2);

        String text;
        File temporaryFile = folder.newFile();
        kv.saveToFile(temporaryFile, false );
        text = new String(Files.readAllBytes(Paths.get(temporaryFile.getPath())));

        assertEquals(expected, text);
    }

    @Test
    public void keyValuesSavesTextToStream() throws IOException {
        String expected = "\"RootNode\"\n{\n\t\"key1\"\t\t\"value1\"\n\t\"key2\"\n\t{\n\t\t\"ChildKey\"\t\t\"ChildValue\"\n\t}\n}\n";

        KeyValue kv = new KeyValue("RootNode");
        KeyValue kv2 = new KeyValue("key2");
        kv2.getChildren().add(new KeyValue("ChildKey", "ChildValue"));

        kv.getChildren().add(new KeyValue("key1", "value1"));
        kv.getChildren().add(kv2);

        String text;
        MemoryStream ms = new MemoryStream();
        kv.saveToStream(ms.asOutputStream(), false);
        ms.seek(0, SeekOrigin.BEGIN);

        text = new String(ms.toByteArray());

        assertEquals(expected, text);
    }

    @Test
    public void keyValuesUnsignedByteConversion() {
        byte expectedValue = 37;

        KeyValue kv = new KeyValue("key", "37");
        assertEquals(expectedValue, kv.asByte());

        kv.setValue("256");

        assertEquals(expectedValue, kv.asByte(expectedValue));
    }

    @Test
    public void keyValuesUnsignedShortConversion() {
        short expectedValue = 1337;

        KeyValue kv = new KeyValue("key", "1337");
        assertEquals(expectedValue, kv.asShort());

        kv.setValue("123456");

        assertEquals(expectedValue, kv.asShort(expectedValue));
    }

    @Test
    public void keyValuesEscapesTextWhenSerializing() throws IOException {
        KeyValue kv = new KeyValue("key");
        kv.getChildren().add(new KeyValue("slashes", "\\o/"));
        kv.getChildren().add(new KeyValue("newline", "\r\n"));

        String text;
        MemoryStream ms = new MemoryStream();
        kv.saveToStream(ms.asOutputStream(), false);
        ms.seek(0, SeekOrigin.BEGIN);

        text = new String(ms.toByteArray());

        String expectedValue = "\"key\"\n{\n\t\"slashes\"\t\t\"\\\\o/\"\n\t\"newline\"\t\t\"\\r\\n\"\n}\n";
        assertEquals(expectedValue, text);
    }

    @Test
    public void DecodesBinaryWithFieldType10() throws IOException, DecoderException {
        String hex = "00546573744F626A656374000A6B65790001020304050607080808";
        byte[] binary = Hex.decodeHex(hex);
        KeyValue kv = new KeyValue();
        MemoryStream ms = new MemoryStream(binary);
        boolean read = kv.tryReadAsBinary(ms);
        assertTrue(read);

        assertEquals(0x0807060504030201L, kv.get("key").asLong());
    }

    @Test
    public void keyValuesHandlesEnum() {
        KeyValue kv = KeyValue.loadFromString("" +
                "\"root\"" +
                "{" +
                "    \"name\" \"Talk\"" +
                "}");

        assertEquals(EnumSet.of(EChatPermission.Talk), kv.get("name").asEnum(EChatPermission.class, EChatPermission.EveryoneDefault));

        kv.get("name").setValue("8");

        assertEquals(EnumSet.of(EChatPermission.Talk), kv.get("name").asEnum(EChatPermission.class, EChatPermission.EveryoneDefault));

        kv.get("name").setValue("10");

        assertEquals(EnumSet.of(EChatPermission.Talk, EChatPermission.Invite), kv.get("name").asEnum(EChatPermission.class, EChatPermission.EveryoneDefault));
        assertEquals(EnumSet.of(EResult.Busy), kv.get("name").asEnum(EResult.class, EResult.Invalid));

        kv.get("name").setValue("OwnerDefault");

        assertEquals(EChatPermission.OwnerDefault, kv.get("name").asEnum(EChatPermission.class, EChatPermission.EveryoneDefault));
    }
}

