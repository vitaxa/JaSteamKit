package com.vitaxa.steamkit.util;

import org.junit.Test;
import uk.co.thomasc.steamkit.util.util.Utils;

import static org.junit.Assert.assertEquals;

public class UtilsTest {

    @Test
    public void crc32() {
        long result = Utils.crc32("test_string");
        assertEquals(0x0967B587, result);
    }
}
