package uk.co.thomasc.steamkit.base.generated;

public final class SteammessagesClientserverLogin {
  private SteammessagesClientserverLogin() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CMsgClientHeartBeatOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CMsgClientHeartBeat)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code CMsgClientHeartBeat}
   */
  public  static final class CMsgClientHeartBeat extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CMsgClientHeartBeat)
      CMsgClientHeartBeatOrBuilder {
    // Use CMsgClientHeartBeat.newBuilder() to construct.
    private CMsgClientHeartBeat(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CMsgClientHeartBeat() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CMsgClientHeartBeat(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientHeartBeat_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientHeartBeat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat.class, uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat)) {
        return super.equals(obj);
      }
      uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat other = (uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat) obj;

      boolean result = true;
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code CMsgClientHeartBeat}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CMsgClientHeartBeat)
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeatOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientHeartBeat_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientHeartBeat_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat.class, uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat.Builder.class);
      }

      // Construct using uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientHeartBeat_descriptor;
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat getDefaultInstanceForType() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat.getDefaultInstance();
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat build() {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat buildPartial() {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat result = new uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat(this);
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat) {
          return mergeFrom((uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat other) {
        if (other == uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CMsgClientHeartBeat)
    }

    // @@protoc_insertion_point(class_scope:CMsgClientHeartBeat)
    private static final uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat();
    }

    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CMsgClientHeartBeat>
        PARSER = new com.google.protobuf.AbstractParser<CMsgClientHeartBeat>() {
      public CMsgClientHeartBeat parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CMsgClientHeartBeat(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CMsgClientHeartBeat> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CMsgClientHeartBeat> getParserForType() {
      return PARSER;
    }

    public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientHeartBeat getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CMsgClientServerTimestampRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CMsgClientServerTimestampRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint64 client_request_timestamp = 1;</code>
     */
    boolean hasClientRequestTimestamp();
    /**
     * <code>optional uint64 client_request_timestamp = 1;</code>
     */
    long getClientRequestTimestamp();
  }
  /**
   * Protobuf type {@code CMsgClientServerTimestampRequest}
   */
  public  static final class CMsgClientServerTimestampRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CMsgClientServerTimestampRequest)
      CMsgClientServerTimestampRequestOrBuilder {
    // Use CMsgClientServerTimestampRequest.newBuilder() to construct.
    private CMsgClientServerTimestampRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CMsgClientServerTimestampRequest() {
      clientRequestTimestamp_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CMsgClientServerTimestampRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              clientRequestTimestamp_ = input.readUInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientServerTimestampRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientServerTimestampRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest.class, uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest.Builder.class);
    }

    private int bitField0_;
    public static final int CLIENT_REQUEST_TIMESTAMP_FIELD_NUMBER = 1;
    private long clientRequestTimestamp_;
    /**
     * <code>optional uint64 client_request_timestamp = 1;</code>
     */
    public boolean hasClientRequestTimestamp() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint64 client_request_timestamp = 1;</code>
     */
    public long getClientRequestTimestamp() {
      return clientRequestTimestamp_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt64(1, clientRequestTimestamp_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, clientRequestTimestamp_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest)) {
        return super.equals(obj);
      }
      uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest other = (uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest) obj;

      boolean result = true;
      result = result && (hasClientRequestTimestamp() == other.hasClientRequestTimestamp());
      if (hasClientRequestTimestamp()) {
        result = result && (getClientRequestTimestamp()
            == other.getClientRequestTimestamp());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasClientRequestTimestamp()) {
        hash = (37 * hash) + CLIENT_REQUEST_TIMESTAMP_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getClientRequestTimestamp());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code CMsgClientServerTimestampRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CMsgClientServerTimestampRequest)
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientServerTimestampRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientServerTimestampRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest.class, uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest.Builder.class);
      }

      // Construct using uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        clientRequestTimestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientServerTimestampRequest_descriptor;
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest getDefaultInstanceForType() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest.getDefaultInstance();
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest build() {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest buildPartial() {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest result = new uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.clientRequestTimestamp_ = clientRequestTimestamp_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest) {
          return mergeFrom((uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest other) {
        if (other == uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest.getDefaultInstance()) return this;
        if (other.hasClientRequestTimestamp()) {
          setClientRequestTimestamp(other.getClientRequestTimestamp());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long clientRequestTimestamp_ ;
      /**
       * <code>optional uint64 client_request_timestamp = 1;</code>
       */
      public boolean hasClientRequestTimestamp() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional uint64 client_request_timestamp = 1;</code>
       */
      public long getClientRequestTimestamp() {
        return clientRequestTimestamp_;
      }
      /**
       * <code>optional uint64 client_request_timestamp = 1;</code>
       */
      public Builder setClientRequestTimestamp(long value) {
        bitField0_ |= 0x00000001;
        clientRequestTimestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 client_request_timestamp = 1;</code>
       */
      public Builder clearClientRequestTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000001);
        clientRequestTimestamp_ = 0L;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CMsgClientServerTimestampRequest)
    }

    // @@protoc_insertion_point(class_scope:CMsgClientServerTimestampRequest)
    private static final uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest();
    }

    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CMsgClientServerTimestampRequest>
        PARSER = new com.google.protobuf.AbstractParser<CMsgClientServerTimestampRequest>() {
      public CMsgClientServerTimestampRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CMsgClientServerTimestampRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CMsgClientServerTimestampRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CMsgClientServerTimestampRequest> getParserForType() {
      return PARSER;
    }

    public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CMsgClientServerTimestampResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CMsgClientServerTimestampResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint64 client_request_timestamp = 1;</code>
     */
    boolean hasClientRequestTimestamp();
    /**
     * <code>optional uint64 client_request_timestamp = 1;</code>
     */
    long getClientRequestTimestamp();

    /**
     * <code>optional uint64 server_timestamp_ms = 2;</code>
     */
    boolean hasServerTimestampMs();
    /**
     * <code>optional uint64 server_timestamp_ms = 2;</code>
     */
    long getServerTimestampMs();
  }
  /**
   * Protobuf type {@code CMsgClientServerTimestampResponse}
   */
  public  static final class CMsgClientServerTimestampResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CMsgClientServerTimestampResponse)
      CMsgClientServerTimestampResponseOrBuilder {
    // Use CMsgClientServerTimestampResponse.newBuilder() to construct.
    private CMsgClientServerTimestampResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CMsgClientServerTimestampResponse() {
      clientRequestTimestamp_ = 0L;
      serverTimestampMs_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CMsgClientServerTimestampResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              clientRequestTimestamp_ = input.readUInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              serverTimestampMs_ = input.readUInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientServerTimestampResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientServerTimestampResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse.class, uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse.Builder.class);
    }

    private int bitField0_;
    public static final int CLIENT_REQUEST_TIMESTAMP_FIELD_NUMBER = 1;
    private long clientRequestTimestamp_;
    /**
     * <code>optional uint64 client_request_timestamp = 1;</code>
     */
    public boolean hasClientRequestTimestamp() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint64 client_request_timestamp = 1;</code>
     */
    public long getClientRequestTimestamp() {
      return clientRequestTimestamp_;
    }

    public static final int SERVER_TIMESTAMP_MS_FIELD_NUMBER = 2;
    private long serverTimestampMs_;
    /**
     * <code>optional uint64 server_timestamp_ms = 2;</code>
     */
    public boolean hasServerTimestampMs() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint64 server_timestamp_ms = 2;</code>
     */
    public long getServerTimestampMs() {
      return serverTimestampMs_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt64(1, clientRequestTimestamp_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(2, serverTimestampMs_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, clientRequestTimestamp_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, serverTimestampMs_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse)) {
        return super.equals(obj);
      }
      uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse other = (uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse) obj;

      boolean result = true;
      result = result && (hasClientRequestTimestamp() == other.hasClientRequestTimestamp());
      if (hasClientRequestTimestamp()) {
        result = result && (getClientRequestTimestamp()
            == other.getClientRequestTimestamp());
      }
      result = result && (hasServerTimestampMs() == other.hasServerTimestampMs());
      if (hasServerTimestampMs()) {
        result = result && (getServerTimestampMs()
            == other.getServerTimestampMs());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasClientRequestTimestamp()) {
        hash = (37 * hash) + CLIENT_REQUEST_TIMESTAMP_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getClientRequestTimestamp());
      }
      if (hasServerTimestampMs()) {
        hash = (37 * hash) + SERVER_TIMESTAMP_MS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getServerTimestampMs());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code CMsgClientServerTimestampResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CMsgClientServerTimestampResponse)
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientServerTimestampResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientServerTimestampResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse.class, uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse.Builder.class);
      }

      // Construct using uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        clientRequestTimestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        serverTimestampMs_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientServerTimestampResponse_descriptor;
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse getDefaultInstanceForType() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse.getDefaultInstance();
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse build() {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse buildPartial() {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse result = new uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.clientRequestTimestamp_ = clientRequestTimestamp_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.serverTimestampMs_ = serverTimestampMs_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse) {
          return mergeFrom((uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse other) {
        if (other == uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse.getDefaultInstance()) return this;
        if (other.hasClientRequestTimestamp()) {
          setClientRequestTimestamp(other.getClientRequestTimestamp());
        }
        if (other.hasServerTimestampMs()) {
          setServerTimestampMs(other.getServerTimestampMs());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long clientRequestTimestamp_ ;
      /**
       * <code>optional uint64 client_request_timestamp = 1;</code>
       */
      public boolean hasClientRequestTimestamp() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional uint64 client_request_timestamp = 1;</code>
       */
      public long getClientRequestTimestamp() {
        return clientRequestTimestamp_;
      }
      /**
       * <code>optional uint64 client_request_timestamp = 1;</code>
       */
      public Builder setClientRequestTimestamp(long value) {
        bitField0_ |= 0x00000001;
        clientRequestTimestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 client_request_timestamp = 1;</code>
       */
      public Builder clearClientRequestTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000001);
        clientRequestTimestamp_ = 0L;
        onChanged();
        return this;
      }

      private long serverTimestampMs_ ;
      /**
       * <code>optional uint64 server_timestamp_ms = 2;</code>
       */
      public boolean hasServerTimestampMs() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint64 server_timestamp_ms = 2;</code>
       */
      public long getServerTimestampMs() {
        return serverTimestampMs_;
      }
      /**
       * <code>optional uint64 server_timestamp_ms = 2;</code>
       */
      public Builder setServerTimestampMs(long value) {
        bitField0_ |= 0x00000002;
        serverTimestampMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 server_timestamp_ms = 2;</code>
       */
      public Builder clearServerTimestampMs() {
        bitField0_ = (bitField0_ & ~0x00000002);
        serverTimestampMs_ = 0L;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CMsgClientServerTimestampResponse)
    }

    // @@protoc_insertion_point(class_scope:CMsgClientServerTimestampResponse)
    private static final uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse();
    }

    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CMsgClientServerTimestampResponse>
        PARSER = new com.google.protobuf.AbstractParser<CMsgClientServerTimestampResponse>() {
      public CMsgClientServerTimestampResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CMsgClientServerTimestampResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CMsgClientServerTimestampResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CMsgClientServerTimestampResponse> getParserForType() {
      return PARSER;
    }

    public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientServerTimestampResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CMsgClientLogonOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CMsgClientLogon)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint32 protocol_version = 1;</code>
     */
    boolean hasProtocolVersion();
    /**
     * <code>optional uint32 protocol_version = 1;</code>
     */
    int getProtocolVersion();

    /**
     * <code>optional uint32 obfustucated_private_ip = 2;</code>
     */
    boolean hasObfustucatedPrivateIp();
    /**
     * <code>optional uint32 obfustucated_private_ip = 2;</code>
     */
    int getObfustucatedPrivateIp();

    /**
     * <code>optional uint32 cell_id = 3;</code>
     */
    boolean hasCellId();
    /**
     * <code>optional uint32 cell_id = 3;</code>
     */
    int getCellId();

    /**
     * <code>optional uint32 last_session_id = 4;</code>
     */
    boolean hasLastSessionId();
    /**
     * <code>optional uint32 last_session_id = 4;</code>
     */
    int getLastSessionId();

    /**
     * <code>optional uint32 client_package_version = 5;</code>
     */
    boolean hasClientPackageVersion();
    /**
     * <code>optional uint32 client_package_version = 5;</code>
     */
    int getClientPackageVersion();

    /**
     * <code>optional string client_language = 6;</code>
     */
    boolean hasClientLanguage();
    /**
     * <code>optional string client_language = 6;</code>
     */
    java.lang.String getClientLanguage();
    /**
     * <code>optional string client_language = 6;</code>
     */
    com.google.protobuf.ByteString
        getClientLanguageBytes();

    /**
     * <code>optional uint32 client_os_type = 7;</code>
     */
    boolean hasClientOsType();
    /**
     * <code>optional uint32 client_os_type = 7;</code>
     */
    int getClientOsType();

    /**
     * <code>optional bool should_remember_password = 8 [default = false];</code>
     */
    boolean hasShouldRememberPassword();
    /**
     * <code>optional bool should_remember_password = 8 [default = false];</code>
     */
    boolean getShouldRememberPassword();

    /**
     * <code>optional string wine_version = 9;</code>
     */
    boolean hasWineVersion();
    /**
     * <code>optional string wine_version = 9;</code>
     */
    java.lang.String getWineVersion();
    /**
     * <code>optional string wine_version = 9;</code>
     */
    com.google.protobuf.ByteString
        getWineVersionBytes();

    /**
     * <code>optional uint32 ping_ms_from_cell_search = 10;</code>
     */
    boolean hasPingMsFromCellSearch();
    /**
     * <code>optional uint32 ping_ms_from_cell_search = 10;</code>
     */
    int getPingMsFromCellSearch();

    /**
     * <code>optional uint32 public_ip = 20;</code>
     */
    boolean hasPublicIp();
    /**
     * <code>optional uint32 public_ip = 20;</code>
     */
    int getPublicIp();

    /**
     * <code>optional uint32 qos_level = 21;</code>
     */
    boolean hasQosLevel();
    /**
     * <code>optional uint32 qos_level = 21;</code>
     */
    int getQosLevel();

    /**
     * <code>optional fixed64 client_supplied_steam_id = 22;</code>
     */
    boolean hasClientSuppliedSteamId();
    /**
     * <code>optional fixed64 client_supplied_steam_id = 22;</code>
     */
    long getClientSuppliedSteamId();

    /**
     * <code>optional bytes machine_id = 30;</code>
     */
    boolean hasMachineId();
    /**
     * <code>optional bytes machine_id = 30;</code>
     */
    com.google.protobuf.ByteString getMachineId();

    /**
     * <code>optional uint32 launcher_type = 31 [default = 0];</code>
     */
    boolean hasLauncherType();
    /**
     * <code>optional uint32 launcher_type = 31 [default = 0];</code>
     */
    int getLauncherType();

    /**
     * <code>optional uint32 ui_mode = 32 [default = 0];</code>
     */
    boolean hasUiMode();
    /**
     * <code>optional uint32 ui_mode = 32 [default = 0];</code>
     */
    int getUiMode();

    /**
     * <code>optional uint32 chat_mode = 33 [default = 0];</code>
     */
    boolean hasChatMode();
    /**
     * <code>optional uint32 chat_mode = 33 [default = 0];</code>
     */
    int getChatMode();

    /**
     * <code>optional bytes steam2_auth_ticket = 41;</code>
     */
    boolean hasSteam2AuthTicket();
    /**
     * <code>optional bytes steam2_auth_ticket = 41;</code>
     */
    com.google.protobuf.ByteString getSteam2AuthTicket();

    /**
     * <code>optional string email_address = 42;</code>
     */
    boolean hasEmailAddress();
    /**
     * <code>optional string email_address = 42;</code>
     */
    java.lang.String getEmailAddress();
    /**
     * <code>optional string email_address = 42;</code>
     */
    com.google.protobuf.ByteString
        getEmailAddressBytes();

    /**
     * <code>optional fixed32 rtime32_account_creation = 43;</code>
     */
    boolean hasRtime32AccountCreation();
    /**
     * <code>optional fixed32 rtime32_account_creation = 43;</code>
     */
    int getRtime32AccountCreation();

    /**
     * <code>optional string account_name = 50;</code>
     */
    boolean hasAccountName();
    /**
     * <code>optional string account_name = 50;</code>
     */
    java.lang.String getAccountName();
    /**
     * <code>optional string account_name = 50;</code>
     */
    com.google.protobuf.ByteString
        getAccountNameBytes();

    /**
     * <code>optional string password = 51;</code>
     */
    boolean hasPassword();
    /**
     * <code>optional string password = 51;</code>
     */
    java.lang.String getPassword();
    /**
     * <code>optional string password = 51;</code>
     */
    com.google.protobuf.ByteString
        getPasswordBytes();

    /**
     * <code>optional string game_server_token = 52;</code>
     */
    boolean hasGameServerToken();
    /**
     * <code>optional string game_server_token = 52;</code>
     */
    java.lang.String getGameServerToken();
    /**
     * <code>optional string game_server_token = 52;</code>
     */
    com.google.protobuf.ByteString
        getGameServerTokenBytes();

    /**
     * <code>optional string login_key = 60;</code>
     */
    boolean hasLoginKey();
    /**
     * <code>optional string login_key = 60;</code>
     */
    java.lang.String getLoginKey();
    /**
     * <code>optional string login_key = 60;</code>
     */
    com.google.protobuf.ByteString
        getLoginKeyBytes();

    /**
     * <code>optional bool was_converted_deprecated_msg = 70 [default = false];</code>
     */
    boolean hasWasConvertedDeprecatedMsg();
    /**
     * <code>optional bool was_converted_deprecated_msg = 70 [default = false];</code>
     */
    boolean getWasConvertedDeprecatedMsg();

    /**
     * <code>optional string anon_user_target_account_name = 80;</code>
     */
    boolean hasAnonUserTargetAccountName();
    /**
     * <code>optional string anon_user_target_account_name = 80;</code>
     */
    java.lang.String getAnonUserTargetAccountName();
    /**
     * <code>optional string anon_user_target_account_name = 80;</code>
     */
    com.google.protobuf.ByteString
        getAnonUserTargetAccountNameBytes();

    /**
     * <code>optional fixed64 resolved_user_steam_id = 81;</code>
     */
    boolean hasResolvedUserSteamId();
    /**
     * <code>optional fixed64 resolved_user_steam_id = 81;</code>
     */
    long getResolvedUserSteamId();

    /**
     * <code>optional int32 eresult_sentryfile = 82;</code>
     */
    boolean hasEresultSentryfile();
    /**
     * <code>optional int32 eresult_sentryfile = 82;</code>
     */
    int getEresultSentryfile();

    /**
     * <code>optional bytes sha_sentryfile = 83;</code>
     */
    boolean hasShaSentryfile();
    /**
     * <code>optional bytes sha_sentryfile = 83;</code>
     */
    com.google.protobuf.ByteString getShaSentryfile();

    /**
     * <code>optional string auth_code = 84;</code>
     */
    boolean hasAuthCode();
    /**
     * <code>optional string auth_code = 84;</code>
     */
    java.lang.String getAuthCode();
    /**
     * <code>optional string auth_code = 84;</code>
     */
    com.google.protobuf.ByteString
        getAuthCodeBytes();

    /**
     * <code>optional int32 otp_type = 85;</code>
     */
    boolean hasOtpType();
    /**
     * <code>optional int32 otp_type = 85;</code>
     */
    int getOtpType();

    /**
     * <code>optional uint32 otp_value = 86;</code>
     */
    boolean hasOtpValue();
    /**
     * <code>optional uint32 otp_value = 86;</code>
     */
    int getOtpValue();

    /**
     * <code>optional string otp_identifier = 87;</code>
     */
    boolean hasOtpIdentifier();
    /**
     * <code>optional string otp_identifier = 87;</code>
     */
    java.lang.String getOtpIdentifier();
    /**
     * <code>optional string otp_identifier = 87;</code>
     */
    com.google.protobuf.ByteString
        getOtpIdentifierBytes();

    /**
     * <code>optional bool steam2_ticket_request = 88;</code>
     */
    boolean hasSteam2TicketRequest();
    /**
     * <code>optional bool steam2_ticket_request = 88;</code>
     */
    boolean getSteam2TicketRequest();

    /**
     * <code>optional bytes sony_psn_ticket = 90;</code>
     */
    boolean hasSonyPsnTicket();
    /**
     * <code>optional bytes sony_psn_ticket = 90;</code>
     */
    com.google.protobuf.ByteString getSonyPsnTicket();

    /**
     * <code>optional string sony_psn_service_id = 91;</code>
     */
    boolean hasSonyPsnServiceId();
    /**
     * <code>optional string sony_psn_service_id = 91;</code>
     */
    java.lang.String getSonyPsnServiceId();
    /**
     * <code>optional string sony_psn_service_id = 91;</code>
     */
    com.google.protobuf.ByteString
        getSonyPsnServiceIdBytes();

    /**
     * <code>optional bool create_new_psn_linked_account_if_needed = 92 [default = false];</code>
     */
    boolean hasCreateNewPsnLinkedAccountIfNeeded();
    /**
     * <code>optional bool create_new_psn_linked_account_if_needed = 92 [default = false];</code>
     */
    boolean getCreateNewPsnLinkedAccountIfNeeded();

    /**
     * <code>optional string sony_psn_name = 93;</code>
     */
    boolean hasSonyPsnName();
    /**
     * <code>optional string sony_psn_name = 93;</code>
     */
    java.lang.String getSonyPsnName();
    /**
     * <code>optional string sony_psn_name = 93;</code>
     */
    com.google.protobuf.ByteString
        getSonyPsnNameBytes();

    /**
     * <code>optional int32 game_server_app_id = 94;</code>
     */
    boolean hasGameServerAppId();
    /**
     * <code>optional int32 game_server_app_id = 94;</code>
     */
    int getGameServerAppId();

    /**
     * <code>optional bool steamguard_dont_remember_computer = 95;</code>
     */
    boolean hasSteamguardDontRememberComputer();
    /**
     * <code>optional bool steamguard_dont_remember_computer = 95;</code>
     */
    boolean getSteamguardDontRememberComputer();

    /**
     * <code>optional string machine_name = 96;</code>
     */
    boolean hasMachineName();
    /**
     * <code>optional string machine_name = 96;</code>
     */
    java.lang.String getMachineName();
    /**
     * <code>optional string machine_name = 96;</code>
     */
    com.google.protobuf.ByteString
        getMachineNameBytes();

    /**
     * <code>optional string machine_name_userchosen = 97;</code>
     */
    boolean hasMachineNameUserchosen();
    /**
     * <code>optional string machine_name_userchosen = 97;</code>
     */
    java.lang.String getMachineNameUserchosen();
    /**
     * <code>optional string machine_name_userchosen = 97;</code>
     */
    com.google.protobuf.ByteString
        getMachineNameUserchosenBytes();

    /**
     * <code>optional string country_override = 98;</code>
     */
    boolean hasCountryOverride();
    /**
     * <code>optional string country_override = 98;</code>
     */
    java.lang.String getCountryOverride();
    /**
     * <code>optional string country_override = 98;</code>
     */
    com.google.protobuf.ByteString
        getCountryOverrideBytes();

    /**
     * <code>optional bool is_steam_box = 99;</code>
     */
    boolean hasIsSteamBox();
    /**
     * <code>optional bool is_steam_box = 99;</code>
     */
    boolean getIsSteamBox();

    /**
     * <code>optional uint64 client_instance_id = 100;</code>
     */
    boolean hasClientInstanceId();
    /**
     * <code>optional uint64 client_instance_id = 100;</code>
     */
    long getClientInstanceId();

    /**
     * <code>optional string two_factor_code = 101;</code>
     */
    boolean hasTwoFactorCode();
    /**
     * <code>optional string two_factor_code = 101;</code>
     */
    java.lang.String getTwoFactorCode();
    /**
     * <code>optional string two_factor_code = 101;</code>
     */
    com.google.protobuf.ByteString
        getTwoFactorCodeBytes();

    /**
     * <code>optional bool supports_rate_limit_response = 102;</code>
     */
    boolean hasSupportsRateLimitResponse();
    /**
     * <code>optional bool supports_rate_limit_response = 102;</code>
     */
    boolean getSupportsRateLimitResponse();

    /**
     * <code>optional string web_logon_nonce = 103;</code>
     */
    boolean hasWebLogonNonce();
    /**
     * <code>optional string web_logon_nonce = 103;</code>
     */
    java.lang.String getWebLogonNonce();
    /**
     * <code>optional string web_logon_nonce = 103;</code>
     */
    com.google.protobuf.ByteString
        getWebLogonNonceBytes();

    /**
     * <code>optional int32 priority_reason = 104;</code>
     */
    boolean hasPriorityReason();
    /**
     * <code>optional int32 priority_reason = 104;</code>
     */
    int getPriorityReason();
  }
  /**
   * Protobuf type {@code CMsgClientLogon}
   */
  public  static final class CMsgClientLogon extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CMsgClientLogon)
      CMsgClientLogonOrBuilder {
    // Use CMsgClientLogon.newBuilder() to construct.
    private CMsgClientLogon(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CMsgClientLogon() {
      protocolVersion_ = 0;
      obfustucatedPrivateIp_ = 0;
      cellId_ = 0;
      lastSessionId_ = 0;
      clientPackageVersion_ = 0;
      clientLanguage_ = "";
      clientOsType_ = 0;
      shouldRememberPassword_ = false;
      wineVersion_ = "";
      pingMsFromCellSearch_ = 0;
      publicIp_ = 0;
      qosLevel_ = 0;
      clientSuppliedSteamId_ = 0L;
      machineId_ = com.google.protobuf.ByteString.EMPTY;
      launcherType_ = 0;
      uiMode_ = 0;
      chatMode_ = 0;
      steam2AuthTicket_ = com.google.protobuf.ByteString.EMPTY;
      emailAddress_ = "";
      rtime32AccountCreation_ = 0;
      accountName_ = "";
      password_ = "";
      gameServerToken_ = "";
      loginKey_ = "";
      wasConvertedDeprecatedMsg_ = false;
      anonUserTargetAccountName_ = "";
      resolvedUserSteamId_ = 0L;
      eresultSentryfile_ = 0;
      shaSentryfile_ = com.google.protobuf.ByteString.EMPTY;
      authCode_ = "";
      otpType_ = 0;
      otpValue_ = 0;
      otpIdentifier_ = "";
      steam2TicketRequest_ = false;
      sonyPsnTicket_ = com.google.protobuf.ByteString.EMPTY;
      sonyPsnServiceId_ = "";
      createNewPsnLinkedAccountIfNeeded_ = false;
      sonyPsnName_ = "";
      gameServerAppId_ = 0;
      steamguardDontRememberComputer_ = false;
      machineName_ = "";
      machineNameUserchosen_ = "";
      countryOverride_ = "";
      isSteamBox_ = false;
      clientInstanceId_ = 0L;
      twoFactorCode_ = "";
      supportsRateLimitResponse_ = false;
      webLogonNonce_ = "";
      priorityReason_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CMsgClientLogon(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      int mutable_bitField1_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              protocolVersion_ = input.readUInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              obfustucatedPrivateIp_ = input.readUInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              cellId_ = input.readUInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              lastSessionId_ = input.readUInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              clientPackageVersion_ = input.readUInt32();
              break;
            }
            case 50: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000020;
              clientLanguage_ = bs;
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              clientOsType_ = input.readUInt32();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              shouldRememberPassword_ = input.readBool();
              break;
            }
            case 74: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000100;
              wineVersion_ = bs;
              break;
            }
            case 80: {
              bitField0_ |= 0x00000200;
              pingMsFromCellSearch_ = input.readUInt32();
              break;
            }
            case 160: {
              bitField0_ |= 0x00000400;
              publicIp_ = input.readUInt32();
              break;
            }
            case 168: {
              bitField0_ |= 0x00000800;
              qosLevel_ = input.readUInt32();
              break;
            }
            case 177: {
              bitField0_ |= 0x00001000;
              clientSuppliedSteamId_ = input.readFixed64();
              break;
            }
            case 242: {
              bitField0_ |= 0x00002000;
              machineId_ = input.readBytes();
              break;
            }
            case 248: {
              bitField0_ |= 0x00004000;
              launcherType_ = input.readUInt32();
              break;
            }
            case 256: {
              bitField0_ |= 0x00008000;
              uiMode_ = input.readUInt32();
              break;
            }
            case 264: {
              bitField0_ |= 0x00010000;
              chatMode_ = input.readUInt32();
              break;
            }
            case 330: {
              bitField0_ |= 0x00020000;
              steam2AuthTicket_ = input.readBytes();
              break;
            }
            case 338: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00040000;
              emailAddress_ = bs;
              break;
            }
            case 349: {
              bitField0_ |= 0x00080000;
              rtime32AccountCreation_ = input.readFixed32();
              break;
            }
            case 402: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00100000;
              accountName_ = bs;
              break;
            }
            case 410: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00200000;
              password_ = bs;
              break;
            }
            case 418: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00400000;
              gameServerToken_ = bs;
              break;
            }
            case 482: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00800000;
              loginKey_ = bs;
              break;
            }
            case 560: {
              bitField0_ |= 0x01000000;
              wasConvertedDeprecatedMsg_ = input.readBool();
              break;
            }
            case 642: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x02000000;
              anonUserTargetAccountName_ = bs;
              break;
            }
            case 649: {
              bitField0_ |= 0x04000000;
              resolvedUserSteamId_ = input.readFixed64();
              break;
            }
            case 656: {
              bitField0_ |= 0x08000000;
              eresultSentryfile_ = input.readInt32();
              break;
            }
            case 666: {
              bitField0_ |= 0x10000000;
              shaSentryfile_ = input.readBytes();
              break;
            }
            case 674: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x20000000;
              authCode_ = bs;
              break;
            }
            case 680: {
              bitField0_ |= 0x40000000;
              otpType_ = input.readInt32();
              break;
            }
            case 688: {
              bitField0_ |= 0x80000000;
              otpValue_ = input.readUInt32();
              break;
            }
            case 698: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField1_ |= 0x00000001;
              otpIdentifier_ = bs;
              break;
            }
            case 704: {
              bitField1_ |= 0x00000002;
              steam2TicketRequest_ = input.readBool();
              break;
            }
            case 722: {
              bitField1_ |= 0x00000004;
              sonyPsnTicket_ = input.readBytes();
              break;
            }
            case 730: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField1_ |= 0x00000008;
              sonyPsnServiceId_ = bs;
              break;
            }
            case 736: {
              bitField1_ |= 0x00000010;
              createNewPsnLinkedAccountIfNeeded_ = input.readBool();
              break;
            }
            case 746: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField1_ |= 0x00000020;
              sonyPsnName_ = bs;
              break;
            }
            case 752: {
              bitField1_ |= 0x00000040;
              gameServerAppId_ = input.readInt32();
              break;
            }
            case 760: {
              bitField1_ |= 0x00000080;
              steamguardDontRememberComputer_ = input.readBool();
              break;
            }
            case 770: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField1_ |= 0x00000100;
              machineName_ = bs;
              break;
            }
            case 778: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField1_ |= 0x00000200;
              machineNameUserchosen_ = bs;
              break;
            }
            case 786: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField1_ |= 0x00000400;
              countryOverride_ = bs;
              break;
            }
            case 792: {
              bitField1_ |= 0x00000800;
              isSteamBox_ = input.readBool();
              break;
            }
            case 800: {
              bitField1_ |= 0x00001000;
              clientInstanceId_ = input.readUInt64();
              break;
            }
            case 810: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField1_ |= 0x00002000;
              twoFactorCode_ = bs;
              break;
            }
            case 816: {
              bitField1_ |= 0x00004000;
              supportsRateLimitResponse_ = input.readBool();
              break;
            }
            case 826: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField1_ |= 0x00008000;
              webLogonNonce_ = bs;
              break;
            }
            case 832: {
              bitField1_ |= 0x00010000;
              priorityReason_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientLogon_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientLogon_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon.class, uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon.Builder.class);
    }

    private int bitField0_;
    private int bitField1_;
    public static final int PROTOCOL_VERSION_FIELD_NUMBER = 1;
    private int protocolVersion_;
    /**
     * <code>optional uint32 protocol_version = 1;</code>
     */
    public boolean hasProtocolVersion() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint32 protocol_version = 1;</code>
     */
    public int getProtocolVersion() {
      return protocolVersion_;
    }

    public static final int OBFUSTUCATED_PRIVATE_IP_FIELD_NUMBER = 2;
    private int obfustucatedPrivateIp_;
    /**
     * <code>optional uint32 obfustucated_private_ip = 2;</code>
     */
    public boolean hasObfustucatedPrivateIp() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint32 obfustucated_private_ip = 2;</code>
     */
    public int getObfustucatedPrivateIp() {
      return obfustucatedPrivateIp_;
    }

    public static final int CELL_ID_FIELD_NUMBER = 3;
    private int cellId_;
    /**
     * <code>optional uint32 cell_id = 3;</code>
     */
    public boolean hasCellId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint32 cell_id = 3;</code>
     */
    public int getCellId() {
      return cellId_;
    }

    public static final int LAST_SESSION_ID_FIELD_NUMBER = 4;
    private int lastSessionId_;
    /**
     * <code>optional uint32 last_session_id = 4;</code>
     */
    public boolean hasLastSessionId() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional uint32 last_session_id = 4;</code>
     */
    public int getLastSessionId() {
      return lastSessionId_;
    }

    public static final int CLIENT_PACKAGE_VERSION_FIELD_NUMBER = 5;
    private int clientPackageVersion_;
    /**
     * <code>optional uint32 client_package_version = 5;</code>
     */
    public boolean hasClientPackageVersion() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional uint32 client_package_version = 5;</code>
     */
    public int getClientPackageVersion() {
      return clientPackageVersion_;
    }

    public static final int CLIENT_LANGUAGE_FIELD_NUMBER = 6;
    private volatile java.lang.Object clientLanguage_;
    /**
     * <code>optional string client_language = 6;</code>
     */
    public boolean hasClientLanguage() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional string client_language = 6;</code>
     */
    public java.lang.String getClientLanguage() {
      java.lang.Object ref = clientLanguage_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          clientLanguage_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string client_language = 6;</code>
     */
    public com.google.protobuf.ByteString
        getClientLanguageBytes() {
      java.lang.Object ref = clientLanguage_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientLanguage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CLIENT_OS_TYPE_FIELD_NUMBER = 7;
    private int clientOsType_;
    /**
     * <code>optional uint32 client_os_type = 7;</code>
     */
    public boolean hasClientOsType() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional uint32 client_os_type = 7;</code>
     */
    public int getClientOsType() {
      return clientOsType_;
    }

    public static final int SHOULD_REMEMBER_PASSWORD_FIELD_NUMBER = 8;
    private boolean shouldRememberPassword_;
    /**
     * <code>optional bool should_remember_password = 8 [default = false];</code>
     */
    public boolean hasShouldRememberPassword() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional bool should_remember_password = 8 [default = false];</code>
     */
    public boolean getShouldRememberPassword() {
      return shouldRememberPassword_;
    }

    public static final int WINE_VERSION_FIELD_NUMBER = 9;
    private volatile java.lang.Object wineVersion_;
    /**
     * <code>optional string wine_version = 9;</code>
     */
    public boolean hasWineVersion() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional string wine_version = 9;</code>
     */
    public java.lang.String getWineVersion() {
      java.lang.Object ref = wineVersion_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          wineVersion_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string wine_version = 9;</code>
     */
    public com.google.protobuf.ByteString
        getWineVersionBytes() {
      java.lang.Object ref = wineVersion_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        wineVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PING_MS_FROM_CELL_SEARCH_FIELD_NUMBER = 10;
    private int pingMsFromCellSearch_;
    /**
     * <code>optional uint32 ping_ms_from_cell_search = 10;</code>
     */
    public boolean hasPingMsFromCellSearch() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    /**
     * <code>optional uint32 ping_ms_from_cell_search = 10;</code>
     */
    public int getPingMsFromCellSearch() {
      return pingMsFromCellSearch_;
    }

    public static final int PUBLIC_IP_FIELD_NUMBER = 20;
    private int publicIp_;
    /**
     * <code>optional uint32 public_ip = 20;</code>
     */
    public boolean hasPublicIp() {
      return ((bitField0_ & 0x00000400) == 0x00000400);
    }
    /**
     * <code>optional uint32 public_ip = 20;</code>
     */
    public int getPublicIp() {
      return publicIp_;
    }

    public static final int QOS_LEVEL_FIELD_NUMBER = 21;
    private int qosLevel_;
    /**
     * <code>optional uint32 qos_level = 21;</code>
     */
    public boolean hasQosLevel() {
      return ((bitField0_ & 0x00000800) == 0x00000800);
    }
    /**
     * <code>optional uint32 qos_level = 21;</code>
     */
    public int getQosLevel() {
      return qosLevel_;
    }

    public static final int CLIENT_SUPPLIED_STEAM_ID_FIELD_NUMBER = 22;
    private long clientSuppliedSteamId_;
    /**
     * <code>optional fixed64 client_supplied_steam_id = 22;</code>
     */
    public boolean hasClientSuppliedSteamId() {
      return ((bitField0_ & 0x00001000) == 0x00001000);
    }
    /**
     * <code>optional fixed64 client_supplied_steam_id = 22;</code>
     */
    public long getClientSuppliedSteamId() {
      return clientSuppliedSteamId_;
    }

    public static final int MACHINE_ID_FIELD_NUMBER = 30;
    private com.google.protobuf.ByteString machineId_;
    /**
     * <code>optional bytes machine_id = 30;</code>
     */
    public boolean hasMachineId() {
      return ((bitField0_ & 0x00002000) == 0x00002000);
    }
    /**
     * <code>optional bytes machine_id = 30;</code>
     */
    public com.google.protobuf.ByteString getMachineId() {
      return machineId_;
    }

    public static final int LAUNCHER_TYPE_FIELD_NUMBER = 31;
    private int launcherType_;
    /**
     * <code>optional uint32 launcher_type = 31 [default = 0];</code>
     */
    public boolean hasLauncherType() {
      return ((bitField0_ & 0x00004000) == 0x00004000);
    }
    /**
     * <code>optional uint32 launcher_type = 31 [default = 0];</code>
     */
    public int getLauncherType() {
      return launcherType_;
    }

    public static final int UI_MODE_FIELD_NUMBER = 32;
    private int uiMode_;
    /**
     * <code>optional uint32 ui_mode = 32 [default = 0];</code>
     */
    public boolean hasUiMode() {
      return ((bitField0_ & 0x00008000) == 0x00008000);
    }
    /**
     * <code>optional uint32 ui_mode = 32 [default = 0];</code>
     */
    public int getUiMode() {
      return uiMode_;
    }

    public static final int CHAT_MODE_FIELD_NUMBER = 33;
    private int chatMode_;
    /**
     * <code>optional uint32 chat_mode = 33 [default = 0];</code>
     */
    public boolean hasChatMode() {
      return ((bitField0_ & 0x00010000) == 0x00010000);
    }
    /**
     * <code>optional uint32 chat_mode = 33 [default = 0];</code>
     */
    public int getChatMode() {
      return chatMode_;
    }

    public static final int STEAM2_AUTH_TICKET_FIELD_NUMBER = 41;
    private com.google.protobuf.ByteString steam2AuthTicket_;
    /**
     * <code>optional bytes steam2_auth_ticket = 41;</code>
     */
    public boolean hasSteam2AuthTicket() {
      return ((bitField0_ & 0x00020000) == 0x00020000);
    }
    /**
     * <code>optional bytes steam2_auth_ticket = 41;</code>
     */
    public com.google.protobuf.ByteString getSteam2AuthTicket() {
      return steam2AuthTicket_;
    }

    public static final int EMAIL_ADDRESS_FIELD_NUMBER = 42;
    private volatile java.lang.Object emailAddress_;
    /**
     * <code>optional string email_address = 42;</code>
     */
    public boolean hasEmailAddress() {
      return ((bitField0_ & 0x00040000) == 0x00040000);
    }
    /**
     * <code>optional string email_address = 42;</code>
     */
    public java.lang.String getEmailAddress() {
      java.lang.Object ref = emailAddress_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          emailAddress_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string email_address = 42;</code>
     */
    public com.google.protobuf.ByteString
        getEmailAddressBytes() {
      java.lang.Object ref = emailAddress_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        emailAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RTIME32_ACCOUNT_CREATION_FIELD_NUMBER = 43;
    private int rtime32AccountCreation_;
    /**
     * <code>optional fixed32 rtime32_account_creation = 43;</code>
     */
    public boolean hasRtime32AccountCreation() {
      return ((bitField0_ & 0x00080000) == 0x00080000);
    }
    /**
     * <code>optional fixed32 rtime32_account_creation = 43;</code>
     */
    public int getRtime32AccountCreation() {
      return rtime32AccountCreation_;
    }

    public static final int ACCOUNT_NAME_FIELD_NUMBER = 50;
    private volatile java.lang.Object accountName_;
    /**
     * <code>optional string account_name = 50;</code>
     */
    public boolean hasAccountName() {
      return ((bitField0_ & 0x00100000) == 0x00100000);
    }
    /**
     * <code>optional string account_name = 50;</code>
     */
    public java.lang.String getAccountName() {
      java.lang.Object ref = accountName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          accountName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string account_name = 50;</code>
     */
    public com.google.protobuf.ByteString
        getAccountNameBytes() {
      java.lang.Object ref = accountName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accountName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PASSWORD_FIELD_NUMBER = 51;
    private volatile java.lang.Object password_;
    /**
     * <code>optional string password = 51;</code>
     */
    public boolean hasPassword() {
      return ((bitField0_ & 0x00200000) == 0x00200000);
    }
    /**
     * <code>optional string password = 51;</code>
     */
    public java.lang.String getPassword() {
      java.lang.Object ref = password_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          password_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string password = 51;</code>
     */
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      java.lang.Object ref = password_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int GAME_SERVER_TOKEN_FIELD_NUMBER = 52;
    private volatile java.lang.Object gameServerToken_;
    /**
     * <code>optional string game_server_token = 52;</code>
     */
    public boolean hasGameServerToken() {
      return ((bitField0_ & 0x00400000) == 0x00400000);
    }
    /**
     * <code>optional string game_server_token = 52;</code>
     */
    public java.lang.String getGameServerToken() {
      java.lang.Object ref = gameServerToken_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          gameServerToken_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string game_server_token = 52;</code>
     */
    public com.google.protobuf.ByteString
        getGameServerTokenBytes() {
      java.lang.Object ref = gameServerToken_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gameServerToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LOGIN_KEY_FIELD_NUMBER = 60;
    private volatile java.lang.Object loginKey_;
    /**
     * <code>optional string login_key = 60;</code>
     */
    public boolean hasLoginKey() {
      return ((bitField0_ & 0x00800000) == 0x00800000);
    }
    /**
     * <code>optional string login_key = 60;</code>
     */
    public java.lang.String getLoginKey() {
      java.lang.Object ref = loginKey_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          loginKey_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string login_key = 60;</code>
     */
    public com.google.protobuf.ByteString
        getLoginKeyBytes() {
      java.lang.Object ref = loginKey_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        loginKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int WAS_CONVERTED_DEPRECATED_MSG_FIELD_NUMBER = 70;
    private boolean wasConvertedDeprecatedMsg_;
    /**
     * <code>optional bool was_converted_deprecated_msg = 70 [default = false];</code>
     */
    public boolean hasWasConvertedDeprecatedMsg() {
      return ((bitField0_ & 0x01000000) == 0x01000000);
    }
    /**
     * <code>optional bool was_converted_deprecated_msg = 70 [default = false];</code>
     */
    public boolean getWasConvertedDeprecatedMsg() {
      return wasConvertedDeprecatedMsg_;
    }

    public static final int ANON_USER_TARGET_ACCOUNT_NAME_FIELD_NUMBER = 80;
    private volatile java.lang.Object anonUserTargetAccountName_;
    /**
     * <code>optional string anon_user_target_account_name = 80;</code>
     */
    public boolean hasAnonUserTargetAccountName() {
      return ((bitField0_ & 0x02000000) == 0x02000000);
    }
    /**
     * <code>optional string anon_user_target_account_name = 80;</code>
     */
    public java.lang.String getAnonUserTargetAccountName() {
      java.lang.Object ref = anonUserTargetAccountName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          anonUserTargetAccountName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string anon_user_target_account_name = 80;</code>
     */
    public com.google.protobuf.ByteString
        getAnonUserTargetAccountNameBytes() {
      java.lang.Object ref = anonUserTargetAccountName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        anonUserTargetAccountName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RESOLVED_USER_STEAM_ID_FIELD_NUMBER = 81;
    private long resolvedUserSteamId_;
    /**
     * <code>optional fixed64 resolved_user_steam_id = 81;</code>
     */
    public boolean hasResolvedUserSteamId() {
      return ((bitField0_ & 0x04000000) == 0x04000000);
    }
    /**
     * <code>optional fixed64 resolved_user_steam_id = 81;</code>
     */
    public long getResolvedUserSteamId() {
      return resolvedUserSteamId_;
    }

    public static final int ERESULT_SENTRYFILE_FIELD_NUMBER = 82;
    private int eresultSentryfile_;
    /**
     * <code>optional int32 eresult_sentryfile = 82;</code>
     */
    public boolean hasEresultSentryfile() {
      return ((bitField0_ & 0x08000000) == 0x08000000);
    }
    /**
     * <code>optional int32 eresult_sentryfile = 82;</code>
     */
    public int getEresultSentryfile() {
      return eresultSentryfile_;
    }

    public static final int SHA_SENTRYFILE_FIELD_NUMBER = 83;
    private com.google.protobuf.ByteString shaSentryfile_;
    /**
     * <code>optional bytes sha_sentryfile = 83;</code>
     */
    public boolean hasShaSentryfile() {
      return ((bitField0_ & 0x10000000) == 0x10000000);
    }
    /**
     * <code>optional bytes sha_sentryfile = 83;</code>
     */
    public com.google.protobuf.ByteString getShaSentryfile() {
      return shaSentryfile_;
    }

    public static final int AUTH_CODE_FIELD_NUMBER = 84;
    private volatile java.lang.Object authCode_;
    /**
     * <code>optional string auth_code = 84;</code>
     */
    public boolean hasAuthCode() {
      return ((bitField0_ & 0x20000000) == 0x20000000);
    }
    /**
     * <code>optional string auth_code = 84;</code>
     */
    public java.lang.String getAuthCode() {
      java.lang.Object ref = authCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          authCode_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string auth_code = 84;</code>
     */
    public com.google.protobuf.ByteString
        getAuthCodeBytes() {
      java.lang.Object ref = authCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        authCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int OTP_TYPE_FIELD_NUMBER = 85;
    private int otpType_;
    /**
     * <code>optional int32 otp_type = 85;</code>
     */
    public boolean hasOtpType() {
      return ((bitField0_ & 0x40000000) == 0x40000000);
    }
    /**
     * <code>optional int32 otp_type = 85;</code>
     */
    public int getOtpType() {
      return otpType_;
    }

    public static final int OTP_VALUE_FIELD_NUMBER = 86;
    private int otpValue_;
    /**
     * <code>optional uint32 otp_value = 86;</code>
     */
    public boolean hasOtpValue() {
      return ((bitField0_ & 0x80000000) == 0x80000000);
    }
    /**
     * <code>optional uint32 otp_value = 86;</code>
     */
    public int getOtpValue() {
      return otpValue_;
    }

    public static final int OTP_IDENTIFIER_FIELD_NUMBER = 87;
    private volatile java.lang.Object otpIdentifier_;
    /**
     * <code>optional string otp_identifier = 87;</code>
     */
    public boolean hasOtpIdentifier() {
      return ((bitField1_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string otp_identifier = 87;</code>
     */
    public java.lang.String getOtpIdentifier() {
      java.lang.Object ref = otpIdentifier_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          otpIdentifier_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string otp_identifier = 87;</code>
     */
    public com.google.protobuf.ByteString
        getOtpIdentifierBytes() {
      java.lang.Object ref = otpIdentifier_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        otpIdentifier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STEAM2_TICKET_REQUEST_FIELD_NUMBER = 88;
    private boolean steam2TicketRequest_;
    /**
     * <code>optional bool steam2_ticket_request = 88;</code>
     */
    public boolean hasSteam2TicketRequest() {
      return ((bitField1_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bool steam2_ticket_request = 88;</code>
     */
    public boolean getSteam2TicketRequest() {
      return steam2TicketRequest_;
    }

    public static final int SONY_PSN_TICKET_FIELD_NUMBER = 90;
    private com.google.protobuf.ByteString sonyPsnTicket_;
    /**
     * <code>optional bytes sony_psn_ticket = 90;</code>
     */
    public boolean hasSonyPsnTicket() {
      return ((bitField1_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bytes sony_psn_ticket = 90;</code>
     */
    public com.google.protobuf.ByteString getSonyPsnTicket() {
      return sonyPsnTicket_;
    }

    public static final int SONY_PSN_SERVICE_ID_FIELD_NUMBER = 91;
    private volatile java.lang.Object sonyPsnServiceId_;
    /**
     * <code>optional string sony_psn_service_id = 91;</code>
     */
    public boolean hasSonyPsnServiceId() {
      return ((bitField1_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string sony_psn_service_id = 91;</code>
     */
    public java.lang.String getSonyPsnServiceId() {
      java.lang.Object ref = sonyPsnServiceId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          sonyPsnServiceId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string sony_psn_service_id = 91;</code>
     */
    public com.google.protobuf.ByteString
        getSonyPsnServiceIdBytes() {
      java.lang.Object ref = sonyPsnServiceId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sonyPsnServiceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CREATE_NEW_PSN_LINKED_ACCOUNT_IF_NEEDED_FIELD_NUMBER = 92;
    private boolean createNewPsnLinkedAccountIfNeeded_;
    /**
     * <code>optional bool create_new_psn_linked_account_if_needed = 92 [default = false];</code>
     */
    public boolean hasCreateNewPsnLinkedAccountIfNeeded() {
      return ((bitField1_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional bool create_new_psn_linked_account_if_needed = 92 [default = false];</code>
     */
    public boolean getCreateNewPsnLinkedAccountIfNeeded() {
      return createNewPsnLinkedAccountIfNeeded_;
    }

    public static final int SONY_PSN_NAME_FIELD_NUMBER = 93;
    private volatile java.lang.Object sonyPsnName_;
    /**
     * <code>optional string sony_psn_name = 93;</code>
     */
    public boolean hasSonyPsnName() {
      return ((bitField1_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional string sony_psn_name = 93;</code>
     */
    public java.lang.String getSonyPsnName() {
      java.lang.Object ref = sonyPsnName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          sonyPsnName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string sony_psn_name = 93;</code>
     */
    public com.google.protobuf.ByteString
        getSonyPsnNameBytes() {
      java.lang.Object ref = sonyPsnName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sonyPsnName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int GAME_SERVER_APP_ID_FIELD_NUMBER = 94;
    private int gameServerAppId_;
    /**
     * <code>optional int32 game_server_app_id = 94;</code>
     */
    public boolean hasGameServerAppId() {
      return ((bitField1_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional int32 game_server_app_id = 94;</code>
     */
    public int getGameServerAppId() {
      return gameServerAppId_;
    }

    public static final int STEAMGUARD_DONT_REMEMBER_COMPUTER_FIELD_NUMBER = 95;
    private boolean steamguardDontRememberComputer_;
    /**
     * <code>optional bool steamguard_dont_remember_computer = 95;</code>
     */
    public boolean hasSteamguardDontRememberComputer() {
      return ((bitField1_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional bool steamguard_dont_remember_computer = 95;</code>
     */
    public boolean getSteamguardDontRememberComputer() {
      return steamguardDontRememberComputer_;
    }

    public static final int MACHINE_NAME_FIELD_NUMBER = 96;
    private volatile java.lang.Object machineName_;
    /**
     * <code>optional string machine_name = 96;</code>
     */
    public boolean hasMachineName() {
      return ((bitField1_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional string machine_name = 96;</code>
     */
    public java.lang.String getMachineName() {
      java.lang.Object ref = machineName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          machineName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string machine_name = 96;</code>
     */
    public com.google.protobuf.ByteString
        getMachineNameBytes() {
      java.lang.Object ref = machineName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        machineName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MACHINE_NAME_USERCHOSEN_FIELD_NUMBER = 97;
    private volatile java.lang.Object machineNameUserchosen_;
    /**
     * <code>optional string machine_name_userchosen = 97;</code>
     */
    public boolean hasMachineNameUserchosen() {
      return ((bitField1_ & 0x00000200) == 0x00000200);
    }
    /**
     * <code>optional string machine_name_userchosen = 97;</code>
     */
    public java.lang.String getMachineNameUserchosen() {
      java.lang.Object ref = machineNameUserchosen_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          machineNameUserchosen_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string machine_name_userchosen = 97;</code>
     */
    public com.google.protobuf.ByteString
        getMachineNameUserchosenBytes() {
      java.lang.Object ref = machineNameUserchosen_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        machineNameUserchosen_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int COUNTRY_OVERRIDE_FIELD_NUMBER = 98;
    private volatile java.lang.Object countryOverride_;
    /**
     * <code>optional string country_override = 98;</code>
     */
    public boolean hasCountryOverride() {
      return ((bitField1_ & 0x00000400) == 0x00000400);
    }
    /**
     * <code>optional string country_override = 98;</code>
     */
    public java.lang.String getCountryOverride() {
      java.lang.Object ref = countryOverride_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          countryOverride_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string country_override = 98;</code>
     */
    public com.google.protobuf.ByteString
        getCountryOverrideBytes() {
      java.lang.Object ref = countryOverride_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        countryOverride_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IS_STEAM_BOX_FIELD_NUMBER = 99;
    private boolean isSteamBox_;
    /**
     * <code>optional bool is_steam_box = 99;</code>
     */
    public boolean hasIsSteamBox() {
      return ((bitField1_ & 0x00000800) == 0x00000800);
    }
    /**
     * <code>optional bool is_steam_box = 99;</code>
     */
    public boolean getIsSteamBox() {
      return isSteamBox_;
    }

    public static final int CLIENT_INSTANCE_ID_FIELD_NUMBER = 100;
    private long clientInstanceId_;
    /**
     * <code>optional uint64 client_instance_id = 100;</code>
     */
    public boolean hasClientInstanceId() {
      return ((bitField1_ & 0x00001000) == 0x00001000);
    }
    /**
     * <code>optional uint64 client_instance_id = 100;</code>
     */
    public long getClientInstanceId() {
      return clientInstanceId_;
    }

    public static final int TWO_FACTOR_CODE_FIELD_NUMBER = 101;
    private volatile java.lang.Object twoFactorCode_;
    /**
     * <code>optional string two_factor_code = 101;</code>
     */
    public boolean hasTwoFactorCode() {
      return ((bitField1_ & 0x00002000) == 0x00002000);
    }
    /**
     * <code>optional string two_factor_code = 101;</code>
     */
    public java.lang.String getTwoFactorCode() {
      java.lang.Object ref = twoFactorCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          twoFactorCode_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string two_factor_code = 101;</code>
     */
    public com.google.protobuf.ByteString
        getTwoFactorCodeBytes() {
      java.lang.Object ref = twoFactorCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        twoFactorCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SUPPORTS_RATE_LIMIT_RESPONSE_FIELD_NUMBER = 102;
    private boolean supportsRateLimitResponse_;
    /**
     * <code>optional bool supports_rate_limit_response = 102;</code>
     */
    public boolean hasSupportsRateLimitResponse() {
      return ((bitField1_ & 0x00004000) == 0x00004000);
    }
    /**
     * <code>optional bool supports_rate_limit_response = 102;</code>
     */
    public boolean getSupportsRateLimitResponse() {
      return supportsRateLimitResponse_;
    }

    public static final int WEB_LOGON_NONCE_FIELD_NUMBER = 103;
    private volatile java.lang.Object webLogonNonce_;
    /**
     * <code>optional string web_logon_nonce = 103;</code>
     */
    public boolean hasWebLogonNonce() {
      return ((bitField1_ & 0x00008000) == 0x00008000);
    }
    /**
     * <code>optional string web_logon_nonce = 103;</code>
     */
    public java.lang.String getWebLogonNonce() {
      java.lang.Object ref = webLogonNonce_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          webLogonNonce_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string web_logon_nonce = 103;</code>
     */
    public com.google.protobuf.ByteString
        getWebLogonNonceBytes() {
      java.lang.Object ref = webLogonNonce_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        webLogonNonce_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PRIORITY_REASON_FIELD_NUMBER = 104;
    private int priorityReason_;
    /**
     * <code>optional int32 priority_reason = 104;</code>
     */
    public boolean hasPriorityReason() {
      return ((bitField1_ & 0x00010000) == 0x00010000);
    }
    /**
     * <code>optional int32 priority_reason = 104;</code>
     */
    public int getPriorityReason() {
      return priorityReason_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt32(1, protocolVersion_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, obfustucatedPrivateIp_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(3, cellId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt32(4, lastSessionId_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeUInt32(5, clientPackageVersion_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, clientLanguage_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeUInt32(7, clientOsType_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeBool(8, shouldRememberPassword_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 9, wineVersion_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeUInt32(10, pingMsFromCellSearch_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        output.writeUInt32(20, publicIp_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        output.writeUInt32(21, qosLevel_);
      }
      if (((bitField0_ & 0x00001000) == 0x00001000)) {
        output.writeFixed64(22, clientSuppliedSteamId_);
      }
      if (((bitField0_ & 0x00002000) == 0x00002000)) {
        output.writeBytes(30, machineId_);
      }
      if (((bitField0_ & 0x00004000) == 0x00004000)) {
        output.writeUInt32(31, launcherType_);
      }
      if (((bitField0_ & 0x00008000) == 0x00008000)) {
        output.writeUInt32(32, uiMode_);
      }
      if (((bitField0_ & 0x00010000) == 0x00010000)) {
        output.writeUInt32(33, chatMode_);
      }
      if (((bitField0_ & 0x00020000) == 0x00020000)) {
        output.writeBytes(41, steam2AuthTicket_);
      }
      if (((bitField0_ & 0x00040000) == 0x00040000)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 42, emailAddress_);
      }
      if (((bitField0_ & 0x00080000) == 0x00080000)) {
        output.writeFixed32(43, rtime32AccountCreation_);
      }
      if (((bitField0_ & 0x00100000) == 0x00100000)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 50, accountName_);
      }
      if (((bitField0_ & 0x00200000) == 0x00200000)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 51, password_);
      }
      if (((bitField0_ & 0x00400000) == 0x00400000)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 52, gameServerToken_);
      }
      if (((bitField0_ & 0x00800000) == 0x00800000)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 60, loginKey_);
      }
      if (((bitField0_ & 0x01000000) == 0x01000000)) {
        output.writeBool(70, wasConvertedDeprecatedMsg_);
      }
      if (((bitField0_ & 0x02000000) == 0x02000000)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 80, anonUserTargetAccountName_);
      }
      if (((bitField0_ & 0x04000000) == 0x04000000)) {
        output.writeFixed64(81, resolvedUserSteamId_);
      }
      if (((bitField0_ & 0x08000000) == 0x08000000)) {
        output.writeInt32(82, eresultSentryfile_);
      }
      if (((bitField0_ & 0x10000000) == 0x10000000)) {
        output.writeBytes(83, shaSentryfile_);
      }
      if (((bitField0_ & 0x20000000) == 0x20000000)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 84, authCode_);
      }
      if (((bitField0_ & 0x40000000) == 0x40000000)) {
        output.writeInt32(85, otpType_);
      }
      if (((bitField0_ & 0x80000000) == 0x80000000)) {
        output.writeUInt32(86, otpValue_);
      }
      if (((bitField1_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 87, otpIdentifier_);
      }
      if (((bitField1_ & 0x00000002) == 0x00000002)) {
        output.writeBool(88, steam2TicketRequest_);
      }
      if (((bitField1_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(90, sonyPsnTicket_);
      }
      if (((bitField1_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 91, sonyPsnServiceId_);
      }
      if (((bitField1_ & 0x00000010) == 0x00000010)) {
        output.writeBool(92, createNewPsnLinkedAccountIfNeeded_);
      }
      if (((bitField1_ & 0x00000020) == 0x00000020)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 93, sonyPsnName_);
      }
      if (((bitField1_ & 0x00000040) == 0x00000040)) {
        output.writeInt32(94, gameServerAppId_);
      }
      if (((bitField1_ & 0x00000080) == 0x00000080)) {
        output.writeBool(95, steamguardDontRememberComputer_);
      }
      if (((bitField1_ & 0x00000100) == 0x00000100)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 96, machineName_);
      }
      if (((bitField1_ & 0x00000200) == 0x00000200)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 97, machineNameUserchosen_);
      }
      if (((bitField1_ & 0x00000400) == 0x00000400)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 98, countryOverride_);
      }
      if (((bitField1_ & 0x00000800) == 0x00000800)) {
        output.writeBool(99, isSteamBox_);
      }
      if (((bitField1_ & 0x00001000) == 0x00001000)) {
        output.writeUInt64(100, clientInstanceId_);
      }
      if (((bitField1_ & 0x00002000) == 0x00002000)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 101, twoFactorCode_);
      }
      if (((bitField1_ & 0x00004000) == 0x00004000)) {
        output.writeBool(102, supportsRateLimitResponse_);
      }
      if (((bitField1_ & 0x00008000) == 0x00008000)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 103, webLogonNonce_);
      }
      if (((bitField1_ & 0x00010000) == 0x00010000)) {
        output.writeInt32(104, priorityReason_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, protocolVersion_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, obfustucatedPrivateIp_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, cellId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, lastSessionId_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, clientPackageVersion_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, clientLanguage_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, clientOsType_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, shouldRememberPassword_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, wineVersion_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, pingMsFromCellSearch_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(20, publicIp_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(21, qosLevel_);
      }
      if (((bitField0_ & 0x00001000) == 0x00001000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed64Size(22, clientSuppliedSteamId_);
      }
      if (((bitField0_ & 0x00002000) == 0x00002000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(30, machineId_);
      }
      if (((bitField0_ & 0x00004000) == 0x00004000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(31, launcherType_);
      }
      if (((bitField0_ & 0x00008000) == 0x00008000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(32, uiMode_);
      }
      if (((bitField0_ & 0x00010000) == 0x00010000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(33, chatMode_);
      }
      if (((bitField0_ & 0x00020000) == 0x00020000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(41, steam2AuthTicket_);
      }
      if (((bitField0_ & 0x00040000) == 0x00040000)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(42, emailAddress_);
      }
      if (((bitField0_ & 0x00080000) == 0x00080000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(43, rtime32AccountCreation_);
      }
      if (((bitField0_ & 0x00100000) == 0x00100000)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(50, accountName_);
      }
      if (((bitField0_ & 0x00200000) == 0x00200000)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(51, password_);
      }
      if (((bitField0_ & 0x00400000) == 0x00400000)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(52, gameServerToken_);
      }
      if (((bitField0_ & 0x00800000) == 0x00800000)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(60, loginKey_);
      }
      if (((bitField0_ & 0x01000000) == 0x01000000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(70, wasConvertedDeprecatedMsg_);
      }
      if (((bitField0_ & 0x02000000) == 0x02000000)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(80, anonUserTargetAccountName_);
      }
      if (((bitField0_ & 0x04000000) == 0x04000000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed64Size(81, resolvedUserSteamId_);
      }
      if (((bitField0_ & 0x08000000) == 0x08000000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(82, eresultSentryfile_);
      }
      if (((bitField0_ & 0x10000000) == 0x10000000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(83, shaSentryfile_);
      }
      if (((bitField0_ & 0x20000000) == 0x20000000)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(84, authCode_);
      }
      if (((bitField0_ & 0x40000000) == 0x40000000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(85, otpType_);
      }
      if (((bitField0_ & 0x80000000) == 0x80000000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(86, otpValue_);
      }
      if (((bitField1_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(87, otpIdentifier_);
      }
      if (((bitField1_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(88, steam2TicketRequest_);
      }
      if (((bitField1_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(90, sonyPsnTicket_);
      }
      if (((bitField1_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(91, sonyPsnServiceId_);
      }
      if (((bitField1_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(92, createNewPsnLinkedAccountIfNeeded_);
      }
      if (((bitField1_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(93, sonyPsnName_);
      }
      if (((bitField1_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(94, gameServerAppId_);
      }
      if (((bitField1_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(95, steamguardDontRememberComputer_);
      }
      if (((bitField1_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(96, machineName_);
      }
      if (((bitField1_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(97, machineNameUserchosen_);
      }
      if (((bitField1_ & 0x00000400) == 0x00000400)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(98, countryOverride_);
      }
      if (((bitField1_ & 0x00000800) == 0x00000800)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(99, isSteamBox_);
      }
      if (((bitField1_ & 0x00001000) == 0x00001000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(100, clientInstanceId_);
      }
      if (((bitField1_ & 0x00002000) == 0x00002000)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(101, twoFactorCode_);
      }
      if (((bitField1_ & 0x00004000) == 0x00004000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(102, supportsRateLimitResponse_);
      }
      if (((bitField1_ & 0x00008000) == 0x00008000)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(103, webLogonNonce_);
      }
      if (((bitField1_ & 0x00010000) == 0x00010000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(104, priorityReason_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon)) {
        return super.equals(obj);
      }
      uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon other = (uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon) obj;

      boolean result = true;
      result = result && (hasProtocolVersion() == other.hasProtocolVersion());
      if (hasProtocolVersion()) {
        result = result && (getProtocolVersion()
            == other.getProtocolVersion());
      }
      result = result && (hasObfustucatedPrivateIp() == other.hasObfustucatedPrivateIp());
      if (hasObfustucatedPrivateIp()) {
        result = result && (getObfustucatedPrivateIp()
            == other.getObfustucatedPrivateIp());
      }
      result = result && (hasCellId() == other.hasCellId());
      if (hasCellId()) {
        result = result && (getCellId()
            == other.getCellId());
      }
      result = result && (hasLastSessionId() == other.hasLastSessionId());
      if (hasLastSessionId()) {
        result = result && (getLastSessionId()
            == other.getLastSessionId());
      }
      result = result && (hasClientPackageVersion() == other.hasClientPackageVersion());
      if (hasClientPackageVersion()) {
        result = result && (getClientPackageVersion()
            == other.getClientPackageVersion());
      }
      result = result && (hasClientLanguage() == other.hasClientLanguage());
      if (hasClientLanguage()) {
        result = result && getClientLanguage()
            .equals(other.getClientLanguage());
      }
      result = result && (hasClientOsType() == other.hasClientOsType());
      if (hasClientOsType()) {
        result = result && (getClientOsType()
            == other.getClientOsType());
      }
      result = result && (hasShouldRememberPassword() == other.hasShouldRememberPassword());
      if (hasShouldRememberPassword()) {
        result = result && (getShouldRememberPassword()
            == other.getShouldRememberPassword());
      }
      result = result && (hasWineVersion() == other.hasWineVersion());
      if (hasWineVersion()) {
        result = result && getWineVersion()
            .equals(other.getWineVersion());
      }
      result = result && (hasPingMsFromCellSearch() == other.hasPingMsFromCellSearch());
      if (hasPingMsFromCellSearch()) {
        result = result && (getPingMsFromCellSearch()
            == other.getPingMsFromCellSearch());
      }
      result = result && (hasPublicIp() == other.hasPublicIp());
      if (hasPublicIp()) {
        result = result && (getPublicIp()
            == other.getPublicIp());
      }
      result = result && (hasQosLevel() == other.hasQosLevel());
      if (hasQosLevel()) {
        result = result && (getQosLevel()
            == other.getQosLevel());
      }
      result = result && (hasClientSuppliedSteamId() == other.hasClientSuppliedSteamId());
      if (hasClientSuppliedSteamId()) {
        result = result && (getClientSuppliedSteamId()
            == other.getClientSuppliedSteamId());
      }
      result = result && (hasMachineId() == other.hasMachineId());
      if (hasMachineId()) {
        result = result && getMachineId()
            .equals(other.getMachineId());
      }
      result = result && (hasLauncherType() == other.hasLauncherType());
      if (hasLauncherType()) {
        result = result && (getLauncherType()
            == other.getLauncherType());
      }
      result = result && (hasUiMode() == other.hasUiMode());
      if (hasUiMode()) {
        result = result && (getUiMode()
            == other.getUiMode());
      }
      result = result && (hasChatMode() == other.hasChatMode());
      if (hasChatMode()) {
        result = result && (getChatMode()
            == other.getChatMode());
      }
      result = result && (hasSteam2AuthTicket() == other.hasSteam2AuthTicket());
      if (hasSteam2AuthTicket()) {
        result = result && getSteam2AuthTicket()
            .equals(other.getSteam2AuthTicket());
      }
      result = result && (hasEmailAddress() == other.hasEmailAddress());
      if (hasEmailAddress()) {
        result = result && getEmailAddress()
            .equals(other.getEmailAddress());
      }
      result = result && (hasRtime32AccountCreation() == other.hasRtime32AccountCreation());
      if (hasRtime32AccountCreation()) {
        result = result && (getRtime32AccountCreation()
            == other.getRtime32AccountCreation());
      }
      result = result && (hasAccountName() == other.hasAccountName());
      if (hasAccountName()) {
        result = result && getAccountName()
            .equals(other.getAccountName());
      }
      result = result && (hasPassword() == other.hasPassword());
      if (hasPassword()) {
        result = result && getPassword()
            .equals(other.getPassword());
      }
      result = result && (hasGameServerToken() == other.hasGameServerToken());
      if (hasGameServerToken()) {
        result = result && getGameServerToken()
            .equals(other.getGameServerToken());
      }
      result = result && (hasLoginKey() == other.hasLoginKey());
      if (hasLoginKey()) {
        result = result && getLoginKey()
            .equals(other.getLoginKey());
      }
      result = result && (hasWasConvertedDeprecatedMsg() == other.hasWasConvertedDeprecatedMsg());
      if (hasWasConvertedDeprecatedMsg()) {
        result = result && (getWasConvertedDeprecatedMsg()
            == other.getWasConvertedDeprecatedMsg());
      }
      result = result && (hasAnonUserTargetAccountName() == other.hasAnonUserTargetAccountName());
      if (hasAnonUserTargetAccountName()) {
        result = result && getAnonUserTargetAccountName()
            .equals(other.getAnonUserTargetAccountName());
      }
      result = result && (hasResolvedUserSteamId() == other.hasResolvedUserSteamId());
      if (hasResolvedUserSteamId()) {
        result = result && (getResolvedUserSteamId()
            == other.getResolvedUserSteamId());
      }
      result = result && (hasEresultSentryfile() == other.hasEresultSentryfile());
      if (hasEresultSentryfile()) {
        result = result && (getEresultSentryfile()
            == other.getEresultSentryfile());
      }
      result = result && (hasShaSentryfile() == other.hasShaSentryfile());
      if (hasShaSentryfile()) {
        result = result && getShaSentryfile()
            .equals(other.getShaSentryfile());
      }
      result = result && (hasAuthCode() == other.hasAuthCode());
      if (hasAuthCode()) {
        result = result && getAuthCode()
            .equals(other.getAuthCode());
      }
      result = result && (hasOtpType() == other.hasOtpType());
      if (hasOtpType()) {
        result = result && (getOtpType()
            == other.getOtpType());
      }
      result = result && (hasOtpValue() == other.hasOtpValue());
      if (hasOtpValue()) {
        result = result && (getOtpValue()
            == other.getOtpValue());
      }
      result = result && (hasOtpIdentifier() == other.hasOtpIdentifier());
      if (hasOtpIdentifier()) {
        result = result && getOtpIdentifier()
            .equals(other.getOtpIdentifier());
      }
      result = result && (hasSteam2TicketRequest() == other.hasSteam2TicketRequest());
      if (hasSteam2TicketRequest()) {
        result = result && (getSteam2TicketRequest()
            == other.getSteam2TicketRequest());
      }
      result = result && (hasSonyPsnTicket() == other.hasSonyPsnTicket());
      if (hasSonyPsnTicket()) {
        result = result && getSonyPsnTicket()
            .equals(other.getSonyPsnTicket());
      }
      result = result && (hasSonyPsnServiceId() == other.hasSonyPsnServiceId());
      if (hasSonyPsnServiceId()) {
        result = result && getSonyPsnServiceId()
            .equals(other.getSonyPsnServiceId());
      }
      result = result && (hasCreateNewPsnLinkedAccountIfNeeded() == other.hasCreateNewPsnLinkedAccountIfNeeded());
      if (hasCreateNewPsnLinkedAccountIfNeeded()) {
        result = result && (getCreateNewPsnLinkedAccountIfNeeded()
            == other.getCreateNewPsnLinkedAccountIfNeeded());
      }
      result = result && (hasSonyPsnName() == other.hasSonyPsnName());
      if (hasSonyPsnName()) {
        result = result && getSonyPsnName()
            .equals(other.getSonyPsnName());
      }
      result = result && (hasGameServerAppId() == other.hasGameServerAppId());
      if (hasGameServerAppId()) {
        result = result && (getGameServerAppId()
            == other.getGameServerAppId());
      }
      result = result && (hasSteamguardDontRememberComputer() == other.hasSteamguardDontRememberComputer());
      if (hasSteamguardDontRememberComputer()) {
        result = result && (getSteamguardDontRememberComputer()
            == other.getSteamguardDontRememberComputer());
      }
      result = result && (hasMachineName() == other.hasMachineName());
      if (hasMachineName()) {
        result = result && getMachineName()
            .equals(other.getMachineName());
      }
      result = result && (hasMachineNameUserchosen() == other.hasMachineNameUserchosen());
      if (hasMachineNameUserchosen()) {
        result = result && getMachineNameUserchosen()
            .equals(other.getMachineNameUserchosen());
      }
      result = result && (hasCountryOverride() == other.hasCountryOverride());
      if (hasCountryOverride()) {
        result = result && getCountryOverride()
            .equals(other.getCountryOverride());
      }
      result = result && (hasIsSteamBox() == other.hasIsSteamBox());
      if (hasIsSteamBox()) {
        result = result && (getIsSteamBox()
            == other.getIsSteamBox());
      }
      result = result && (hasClientInstanceId() == other.hasClientInstanceId());
      if (hasClientInstanceId()) {
        result = result && (getClientInstanceId()
            == other.getClientInstanceId());
      }
      result = result && (hasTwoFactorCode() == other.hasTwoFactorCode());
      if (hasTwoFactorCode()) {
        result = result && getTwoFactorCode()
            .equals(other.getTwoFactorCode());
      }
      result = result && (hasSupportsRateLimitResponse() == other.hasSupportsRateLimitResponse());
      if (hasSupportsRateLimitResponse()) {
        result = result && (getSupportsRateLimitResponse()
            == other.getSupportsRateLimitResponse());
      }
      result = result && (hasWebLogonNonce() == other.hasWebLogonNonce());
      if (hasWebLogonNonce()) {
        result = result && getWebLogonNonce()
            .equals(other.getWebLogonNonce());
      }
      result = result && (hasPriorityReason() == other.hasPriorityReason());
      if (hasPriorityReason()) {
        result = result && (getPriorityReason()
            == other.getPriorityReason());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasProtocolVersion()) {
        hash = (37 * hash) + PROTOCOL_VERSION_FIELD_NUMBER;
        hash = (53 * hash) + getProtocolVersion();
      }
      if (hasObfustucatedPrivateIp()) {
        hash = (37 * hash) + OBFUSTUCATED_PRIVATE_IP_FIELD_NUMBER;
        hash = (53 * hash) + getObfustucatedPrivateIp();
      }
      if (hasCellId()) {
        hash = (37 * hash) + CELL_ID_FIELD_NUMBER;
        hash = (53 * hash) + getCellId();
      }
      if (hasLastSessionId()) {
        hash = (37 * hash) + LAST_SESSION_ID_FIELD_NUMBER;
        hash = (53 * hash) + getLastSessionId();
      }
      if (hasClientPackageVersion()) {
        hash = (37 * hash) + CLIENT_PACKAGE_VERSION_FIELD_NUMBER;
        hash = (53 * hash) + getClientPackageVersion();
      }
      if (hasClientLanguage()) {
        hash = (37 * hash) + CLIENT_LANGUAGE_FIELD_NUMBER;
        hash = (53 * hash) + getClientLanguage().hashCode();
      }
      if (hasClientOsType()) {
        hash = (37 * hash) + CLIENT_OS_TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getClientOsType();
      }
      if (hasShouldRememberPassword()) {
        hash = (37 * hash) + SHOULD_REMEMBER_PASSWORD_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getShouldRememberPassword());
      }
      if (hasWineVersion()) {
        hash = (37 * hash) + WINE_VERSION_FIELD_NUMBER;
        hash = (53 * hash) + getWineVersion().hashCode();
      }
      if (hasPingMsFromCellSearch()) {
        hash = (37 * hash) + PING_MS_FROM_CELL_SEARCH_FIELD_NUMBER;
        hash = (53 * hash) + getPingMsFromCellSearch();
      }
      if (hasPublicIp()) {
        hash = (37 * hash) + PUBLIC_IP_FIELD_NUMBER;
        hash = (53 * hash) + getPublicIp();
      }
      if (hasQosLevel()) {
        hash = (37 * hash) + QOS_LEVEL_FIELD_NUMBER;
        hash = (53 * hash) + getQosLevel();
      }
      if (hasClientSuppliedSteamId()) {
        hash = (37 * hash) + CLIENT_SUPPLIED_STEAM_ID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getClientSuppliedSteamId());
      }
      if (hasMachineId()) {
        hash = (37 * hash) + MACHINE_ID_FIELD_NUMBER;
        hash = (53 * hash) + getMachineId().hashCode();
      }
      if (hasLauncherType()) {
        hash = (37 * hash) + LAUNCHER_TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getLauncherType();
      }
      if (hasUiMode()) {
        hash = (37 * hash) + UI_MODE_FIELD_NUMBER;
        hash = (53 * hash) + getUiMode();
      }
      if (hasChatMode()) {
        hash = (37 * hash) + CHAT_MODE_FIELD_NUMBER;
        hash = (53 * hash) + getChatMode();
      }
      if (hasSteam2AuthTicket()) {
        hash = (37 * hash) + STEAM2_AUTH_TICKET_FIELD_NUMBER;
        hash = (53 * hash) + getSteam2AuthTicket().hashCode();
      }
      if (hasEmailAddress()) {
        hash = (37 * hash) + EMAIL_ADDRESS_FIELD_NUMBER;
        hash = (53 * hash) + getEmailAddress().hashCode();
      }
      if (hasRtime32AccountCreation()) {
        hash = (37 * hash) + RTIME32_ACCOUNT_CREATION_FIELD_NUMBER;
        hash = (53 * hash) + getRtime32AccountCreation();
      }
      if (hasAccountName()) {
        hash = (37 * hash) + ACCOUNT_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getAccountName().hashCode();
      }
      if (hasPassword()) {
        hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
        hash = (53 * hash) + getPassword().hashCode();
      }
      if (hasGameServerToken()) {
        hash = (37 * hash) + GAME_SERVER_TOKEN_FIELD_NUMBER;
        hash = (53 * hash) + getGameServerToken().hashCode();
      }
      if (hasLoginKey()) {
        hash = (37 * hash) + LOGIN_KEY_FIELD_NUMBER;
        hash = (53 * hash) + getLoginKey().hashCode();
      }
      if (hasWasConvertedDeprecatedMsg()) {
        hash = (37 * hash) + WAS_CONVERTED_DEPRECATED_MSG_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getWasConvertedDeprecatedMsg());
      }
      if (hasAnonUserTargetAccountName()) {
        hash = (37 * hash) + ANON_USER_TARGET_ACCOUNT_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getAnonUserTargetAccountName().hashCode();
      }
      if (hasResolvedUserSteamId()) {
        hash = (37 * hash) + RESOLVED_USER_STEAM_ID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getResolvedUserSteamId());
      }
      if (hasEresultSentryfile()) {
        hash = (37 * hash) + ERESULT_SENTRYFILE_FIELD_NUMBER;
        hash = (53 * hash) + getEresultSentryfile();
      }
      if (hasShaSentryfile()) {
        hash = (37 * hash) + SHA_SENTRYFILE_FIELD_NUMBER;
        hash = (53 * hash) + getShaSentryfile().hashCode();
      }
      if (hasAuthCode()) {
        hash = (37 * hash) + AUTH_CODE_FIELD_NUMBER;
        hash = (53 * hash) + getAuthCode().hashCode();
      }
      if (hasOtpType()) {
        hash = (37 * hash) + OTP_TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getOtpType();
      }
      if (hasOtpValue()) {
        hash = (37 * hash) + OTP_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getOtpValue();
      }
      if (hasOtpIdentifier()) {
        hash = (37 * hash) + OTP_IDENTIFIER_FIELD_NUMBER;
        hash = (53 * hash) + getOtpIdentifier().hashCode();
      }
      if (hasSteam2TicketRequest()) {
        hash = (37 * hash) + STEAM2_TICKET_REQUEST_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getSteam2TicketRequest());
      }
      if (hasSonyPsnTicket()) {
        hash = (37 * hash) + SONY_PSN_TICKET_FIELD_NUMBER;
        hash = (53 * hash) + getSonyPsnTicket().hashCode();
      }
      if (hasSonyPsnServiceId()) {
        hash = (37 * hash) + SONY_PSN_SERVICE_ID_FIELD_NUMBER;
        hash = (53 * hash) + getSonyPsnServiceId().hashCode();
      }
      if (hasCreateNewPsnLinkedAccountIfNeeded()) {
        hash = (37 * hash) + CREATE_NEW_PSN_LINKED_ACCOUNT_IF_NEEDED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getCreateNewPsnLinkedAccountIfNeeded());
      }
      if (hasSonyPsnName()) {
        hash = (37 * hash) + SONY_PSN_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getSonyPsnName().hashCode();
      }
      if (hasGameServerAppId()) {
        hash = (37 * hash) + GAME_SERVER_APP_ID_FIELD_NUMBER;
        hash = (53 * hash) + getGameServerAppId();
      }
      if (hasSteamguardDontRememberComputer()) {
        hash = (37 * hash) + STEAMGUARD_DONT_REMEMBER_COMPUTER_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getSteamguardDontRememberComputer());
      }
      if (hasMachineName()) {
        hash = (37 * hash) + MACHINE_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getMachineName().hashCode();
      }
      if (hasMachineNameUserchosen()) {
        hash = (37 * hash) + MACHINE_NAME_USERCHOSEN_FIELD_NUMBER;
        hash = (53 * hash) + getMachineNameUserchosen().hashCode();
      }
      if (hasCountryOverride()) {
        hash = (37 * hash) + COUNTRY_OVERRIDE_FIELD_NUMBER;
        hash = (53 * hash) + getCountryOverride().hashCode();
      }
      if (hasIsSteamBox()) {
        hash = (37 * hash) + IS_STEAM_BOX_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getIsSteamBox());
      }
      if (hasClientInstanceId()) {
        hash = (37 * hash) + CLIENT_INSTANCE_ID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getClientInstanceId());
      }
      if (hasTwoFactorCode()) {
        hash = (37 * hash) + TWO_FACTOR_CODE_FIELD_NUMBER;
        hash = (53 * hash) + getTwoFactorCode().hashCode();
      }
      if (hasSupportsRateLimitResponse()) {
        hash = (37 * hash) + SUPPORTS_RATE_LIMIT_RESPONSE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getSupportsRateLimitResponse());
      }
      if (hasWebLogonNonce()) {
        hash = (37 * hash) + WEB_LOGON_NONCE_FIELD_NUMBER;
        hash = (53 * hash) + getWebLogonNonce().hashCode();
      }
      if (hasPriorityReason()) {
        hash = (37 * hash) + PRIORITY_REASON_FIELD_NUMBER;
        hash = (53 * hash) + getPriorityReason();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code CMsgClientLogon}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CMsgClientLogon)
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientLogon_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientLogon_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon.class, uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon.Builder.class);
      }

      // Construct using uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        protocolVersion_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        obfustucatedPrivateIp_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        cellId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        lastSessionId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        clientPackageVersion_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        clientLanguage_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        clientOsType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        shouldRememberPassword_ = false;
        bitField0_ = (bitField0_ & ~0x00000080);
        wineVersion_ = "";
        bitField0_ = (bitField0_ & ~0x00000100);
        pingMsFromCellSearch_ = 0;
        bitField0_ = (bitField0_ & ~0x00000200);
        publicIp_ = 0;
        bitField0_ = (bitField0_ & ~0x00000400);
        qosLevel_ = 0;
        bitField0_ = (bitField0_ & ~0x00000800);
        clientSuppliedSteamId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00001000);
        machineId_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00002000);
        launcherType_ = 0;
        bitField0_ = (bitField0_ & ~0x00004000);
        uiMode_ = 0;
        bitField0_ = (bitField0_ & ~0x00008000);
        chatMode_ = 0;
        bitField0_ = (bitField0_ & ~0x00010000);
        steam2AuthTicket_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00020000);
        emailAddress_ = "";
        bitField0_ = (bitField0_ & ~0x00040000);
        rtime32AccountCreation_ = 0;
        bitField0_ = (bitField0_ & ~0x00080000);
        accountName_ = "";
        bitField0_ = (bitField0_ & ~0x00100000);
        password_ = "";
        bitField0_ = (bitField0_ & ~0x00200000);
        gameServerToken_ = "";
        bitField0_ = (bitField0_ & ~0x00400000);
        loginKey_ = "";
        bitField0_ = (bitField0_ & ~0x00800000);
        wasConvertedDeprecatedMsg_ = false;
        bitField0_ = (bitField0_ & ~0x01000000);
        anonUserTargetAccountName_ = "";
        bitField0_ = (bitField0_ & ~0x02000000);
        resolvedUserSteamId_ = 0L;
        bitField0_ = (bitField0_ & ~0x04000000);
        eresultSentryfile_ = 0;
        bitField0_ = (bitField0_ & ~0x08000000);
        shaSentryfile_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x10000000);
        authCode_ = "";
        bitField0_ = (bitField0_ & ~0x20000000);
        otpType_ = 0;
        bitField0_ = (bitField0_ & ~0x40000000);
        otpValue_ = 0;
        bitField0_ = (bitField0_ & ~0x80000000);
        otpIdentifier_ = "";
        bitField1_ = (bitField1_ & ~0x00000001);
        steam2TicketRequest_ = false;
        bitField1_ = (bitField1_ & ~0x00000002);
        sonyPsnTicket_ = com.google.protobuf.ByteString.EMPTY;
        bitField1_ = (bitField1_ & ~0x00000004);
        sonyPsnServiceId_ = "";
        bitField1_ = (bitField1_ & ~0x00000008);
        createNewPsnLinkedAccountIfNeeded_ = false;
        bitField1_ = (bitField1_ & ~0x00000010);
        sonyPsnName_ = "";
        bitField1_ = (bitField1_ & ~0x00000020);
        gameServerAppId_ = 0;
        bitField1_ = (bitField1_ & ~0x00000040);
        steamguardDontRememberComputer_ = false;
        bitField1_ = (bitField1_ & ~0x00000080);
        machineName_ = "";
        bitField1_ = (bitField1_ & ~0x00000100);
        machineNameUserchosen_ = "";
        bitField1_ = (bitField1_ & ~0x00000200);
        countryOverride_ = "";
        bitField1_ = (bitField1_ & ~0x00000400);
        isSteamBox_ = false;
        bitField1_ = (bitField1_ & ~0x00000800);
        clientInstanceId_ = 0L;
        bitField1_ = (bitField1_ & ~0x00001000);
        twoFactorCode_ = "";
        bitField1_ = (bitField1_ & ~0x00002000);
        supportsRateLimitResponse_ = false;
        bitField1_ = (bitField1_ & ~0x00004000);
        webLogonNonce_ = "";
        bitField1_ = (bitField1_ & ~0x00008000);
        priorityReason_ = 0;
        bitField1_ = (bitField1_ & ~0x00010000);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientLogon_descriptor;
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon getDefaultInstanceForType() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon.getDefaultInstance();
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon build() {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon buildPartial() {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon result = new uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon(this);
        int from_bitField0_ = bitField0_;
        int from_bitField1_ = bitField1_;
        int to_bitField0_ = 0;
        int to_bitField1_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.protocolVersion_ = protocolVersion_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.obfustucatedPrivateIp_ = obfustucatedPrivateIp_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.cellId_ = cellId_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.lastSessionId_ = lastSessionId_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.clientPackageVersion_ = clientPackageVersion_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.clientLanguage_ = clientLanguage_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.clientOsType_ = clientOsType_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.shouldRememberPassword_ = shouldRememberPassword_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.wineVersion_ = wineVersion_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.pingMsFromCellSearch_ = pingMsFromCellSearch_;
        if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
          to_bitField0_ |= 0x00000400;
        }
        result.publicIp_ = publicIp_;
        if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
          to_bitField0_ |= 0x00000800;
        }
        result.qosLevel_ = qosLevel_;
        if (((from_bitField0_ & 0x00001000) == 0x00001000)) {
          to_bitField0_ |= 0x00001000;
        }
        result.clientSuppliedSteamId_ = clientSuppliedSteamId_;
        if (((from_bitField0_ & 0x00002000) == 0x00002000)) {
          to_bitField0_ |= 0x00002000;
        }
        result.machineId_ = machineId_;
        if (((from_bitField0_ & 0x00004000) == 0x00004000)) {
          to_bitField0_ |= 0x00004000;
        }
        result.launcherType_ = launcherType_;
        if (((from_bitField0_ & 0x00008000) == 0x00008000)) {
          to_bitField0_ |= 0x00008000;
        }
        result.uiMode_ = uiMode_;
        if (((from_bitField0_ & 0x00010000) == 0x00010000)) {
          to_bitField0_ |= 0x00010000;
        }
        result.chatMode_ = chatMode_;
        if (((from_bitField0_ & 0x00020000) == 0x00020000)) {
          to_bitField0_ |= 0x00020000;
        }
        result.steam2AuthTicket_ = steam2AuthTicket_;
        if (((from_bitField0_ & 0x00040000) == 0x00040000)) {
          to_bitField0_ |= 0x00040000;
        }
        result.emailAddress_ = emailAddress_;
        if (((from_bitField0_ & 0x00080000) == 0x00080000)) {
          to_bitField0_ |= 0x00080000;
        }
        result.rtime32AccountCreation_ = rtime32AccountCreation_;
        if (((from_bitField0_ & 0x00100000) == 0x00100000)) {
          to_bitField0_ |= 0x00100000;
        }
        result.accountName_ = accountName_;
        if (((from_bitField0_ & 0x00200000) == 0x00200000)) {
          to_bitField0_ |= 0x00200000;
        }
        result.password_ = password_;
        if (((from_bitField0_ & 0x00400000) == 0x00400000)) {
          to_bitField0_ |= 0x00400000;
        }
        result.gameServerToken_ = gameServerToken_;
        if (((from_bitField0_ & 0x00800000) == 0x00800000)) {
          to_bitField0_ |= 0x00800000;
        }
        result.loginKey_ = loginKey_;
        if (((from_bitField0_ & 0x01000000) == 0x01000000)) {
          to_bitField0_ |= 0x01000000;
        }
        result.wasConvertedDeprecatedMsg_ = wasConvertedDeprecatedMsg_;
        if (((from_bitField0_ & 0x02000000) == 0x02000000)) {
          to_bitField0_ |= 0x02000000;
        }
        result.anonUserTargetAccountName_ = anonUserTargetAccountName_;
        if (((from_bitField0_ & 0x04000000) == 0x04000000)) {
          to_bitField0_ |= 0x04000000;
        }
        result.resolvedUserSteamId_ = resolvedUserSteamId_;
        if (((from_bitField0_ & 0x08000000) == 0x08000000)) {
          to_bitField0_ |= 0x08000000;
        }
        result.eresultSentryfile_ = eresultSentryfile_;
        if (((from_bitField0_ & 0x10000000) == 0x10000000)) {
          to_bitField0_ |= 0x10000000;
        }
        result.shaSentryfile_ = shaSentryfile_;
        if (((from_bitField0_ & 0x20000000) == 0x20000000)) {
          to_bitField0_ |= 0x20000000;
        }
        result.authCode_ = authCode_;
        if (((from_bitField0_ & 0x40000000) == 0x40000000)) {
          to_bitField0_ |= 0x40000000;
        }
        result.otpType_ = otpType_;
        if (((from_bitField0_ & 0x80000000) == 0x80000000)) {
          to_bitField0_ |= 0x80000000;
        }
        result.otpValue_ = otpValue_;
        if (((from_bitField1_ & 0x00000001) == 0x00000001)) {
          to_bitField1_ |= 0x00000001;
        }
        result.otpIdentifier_ = otpIdentifier_;
        if (((from_bitField1_ & 0x00000002) == 0x00000002)) {
          to_bitField1_ |= 0x00000002;
        }
        result.steam2TicketRequest_ = steam2TicketRequest_;
        if (((from_bitField1_ & 0x00000004) == 0x00000004)) {
          to_bitField1_ |= 0x00000004;
        }
        result.sonyPsnTicket_ = sonyPsnTicket_;
        if (((from_bitField1_ & 0x00000008) == 0x00000008)) {
          to_bitField1_ |= 0x00000008;
        }
        result.sonyPsnServiceId_ = sonyPsnServiceId_;
        if (((from_bitField1_ & 0x00000010) == 0x00000010)) {
          to_bitField1_ |= 0x00000010;
        }
        result.createNewPsnLinkedAccountIfNeeded_ = createNewPsnLinkedAccountIfNeeded_;
        if (((from_bitField1_ & 0x00000020) == 0x00000020)) {
          to_bitField1_ |= 0x00000020;
        }
        result.sonyPsnName_ = sonyPsnName_;
        if (((from_bitField1_ & 0x00000040) == 0x00000040)) {
          to_bitField1_ |= 0x00000040;
        }
        result.gameServerAppId_ = gameServerAppId_;
        if (((from_bitField1_ & 0x00000080) == 0x00000080)) {
          to_bitField1_ |= 0x00000080;
        }
        result.steamguardDontRememberComputer_ = steamguardDontRememberComputer_;
        if (((from_bitField1_ & 0x00000100) == 0x00000100)) {
          to_bitField1_ |= 0x00000100;
        }
        result.machineName_ = machineName_;
        if (((from_bitField1_ & 0x00000200) == 0x00000200)) {
          to_bitField1_ |= 0x00000200;
        }
        result.machineNameUserchosen_ = machineNameUserchosen_;
        if (((from_bitField1_ & 0x00000400) == 0x00000400)) {
          to_bitField1_ |= 0x00000400;
        }
        result.countryOverride_ = countryOverride_;
        if (((from_bitField1_ & 0x00000800) == 0x00000800)) {
          to_bitField1_ |= 0x00000800;
        }
        result.isSteamBox_ = isSteamBox_;
        if (((from_bitField1_ & 0x00001000) == 0x00001000)) {
          to_bitField1_ |= 0x00001000;
        }
        result.clientInstanceId_ = clientInstanceId_;
        if (((from_bitField1_ & 0x00002000) == 0x00002000)) {
          to_bitField1_ |= 0x00002000;
        }
        result.twoFactorCode_ = twoFactorCode_;
        if (((from_bitField1_ & 0x00004000) == 0x00004000)) {
          to_bitField1_ |= 0x00004000;
        }
        result.supportsRateLimitResponse_ = supportsRateLimitResponse_;
        if (((from_bitField1_ & 0x00008000) == 0x00008000)) {
          to_bitField1_ |= 0x00008000;
        }
        result.webLogonNonce_ = webLogonNonce_;
        if (((from_bitField1_ & 0x00010000) == 0x00010000)) {
          to_bitField1_ |= 0x00010000;
        }
        result.priorityReason_ = priorityReason_;
        result.bitField0_ = to_bitField0_;
        result.bitField1_ = to_bitField1_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon) {
          return mergeFrom((uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon other) {
        if (other == uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon.getDefaultInstance()) return this;
        if (other.hasProtocolVersion()) {
          setProtocolVersion(other.getProtocolVersion());
        }
        if (other.hasObfustucatedPrivateIp()) {
          setObfustucatedPrivateIp(other.getObfustucatedPrivateIp());
        }
        if (other.hasCellId()) {
          setCellId(other.getCellId());
        }
        if (other.hasLastSessionId()) {
          setLastSessionId(other.getLastSessionId());
        }
        if (other.hasClientPackageVersion()) {
          setClientPackageVersion(other.getClientPackageVersion());
        }
        if (other.hasClientLanguage()) {
          bitField0_ |= 0x00000020;
          clientLanguage_ = other.clientLanguage_;
          onChanged();
        }
        if (other.hasClientOsType()) {
          setClientOsType(other.getClientOsType());
        }
        if (other.hasShouldRememberPassword()) {
          setShouldRememberPassword(other.getShouldRememberPassword());
        }
        if (other.hasWineVersion()) {
          bitField0_ |= 0x00000100;
          wineVersion_ = other.wineVersion_;
          onChanged();
        }
        if (other.hasPingMsFromCellSearch()) {
          setPingMsFromCellSearch(other.getPingMsFromCellSearch());
        }
        if (other.hasPublicIp()) {
          setPublicIp(other.getPublicIp());
        }
        if (other.hasQosLevel()) {
          setQosLevel(other.getQosLevel());
        }
        if (other.hasClientSuppliedSteamId()) {
          setClientSuppliedSteamId(other.getClientSuppliedSteamId());
        }
        if (other.hasMachineId()) {
          setMachineId(other.getMachineId());
        }
        if (other.hasLauncherType()) {
          setLauncherType(other.getLauncherType());
        }
        if (other.hasUiMode()) {
          setUiMode(other.getUiMode());
        }
        if (other.hasChatMode()) {
          setChatMode(other.getChatMode());
        }
        if (other.hasSteam2AuthTicket()) {
          setSteam2AuthTicket(other.getSteam2AuthTicket());
        }
        if (other.hasEmailAddress()) {
          bitField0_ |= 0x00040000;
          emailAddress_ = other.emailAddress_;
          onChanged();
        }
        if (other.hasRtime32AccountCreation()) {
          setRtime32AccountCreation(other.getRtime32AccountCreation());
        }
        if (other.hasAccountName()) {
          bitField0_ |= 0x00100000;
          accountName_ = other.accountName_;
          onChanged();
        }
        if (other.hasPassword()) {
          bitField0_ |= 0x00200000;
          password_ = other.password_;
          onChanged();
        }
        if (other.hasGameServerToken()) {
          bitField0_ |= 0x00400000;
          gameServerToken_ = other.gameServerToken_;
          onChanged();
        }
        if (other.hasLoginKey()) {
          bitField0_ |= 0x00800000;
          loginKey_ = other.loginKey_;
          onChanged();
        }
        if (other.hasWasConvertedDeprecatedMsg()) {
          setWasConvertedDeprecatedMsg(other.getWasConvertedDeprecatedMsg());
        }
        if (other.hasAnonUserTargetAccountName()) {
          bitField0_ |= 0x02000000;
          anonUserTargetAccountName_ = other.anonUserTargetAccountName_;
          onChanged();
        }
        if (other.hasResolvedUserSteamId()) {
          setResolvedUserSteamId(other.getResolvedUserSteamId());
        }
        if (other.hasEresultSentryfile()) {
          setEresultSentryfile(other.getEresultSentryfile());
        }
        if (other.hasShaSentryfile()) {
          setShaSentryfile(other.getShaSentryfile());
        }
        if (other.hasAuthCode()) {
          bitField0_ |= 0x20000000;
          authCode_ = other.authCode_;
          onChanged();
        }
        if (other.hasOtpType()) {
          setOtpType(other.getOtpType());
        }
        if (other.hasOtpValue()) {
          setOtpValue(other.getOtpValue());
        }
        if (other.hasOtpIdentifier()) {
          bitField1_ |= 0x00000001;
          otpIdentifier_ = other.otpIdentifier_;
          onChanged();
        }
        if (other.hasSteam2TicketRequest()) {
          setSteam2TicketRequest(other.getSteam2TicketRequest());
        }
        if (other.hasSonyPsnTicket()) {
          setSonyPsnTicket(other.getSonyPsnTicket());
        }
        if (other.hasSonyPsnServiceId()) {
          bitField1_ |= 0x00000008;
          sonyPsnServiceId_ = other.sonyPsnServiceId_;
          onChanged();
        }
        if (other.hasCreateNewPsnLinkedAccountIfNeeded()) {
          setCreateNewPsnLinkedAccountIfNeeded(other.getCreateNewPsnLinkedAccountIfNeeded());
        }
        if (other.hasSonyPsnName()) {
          bitField1_ |= 0x00000020;
          sonyPsnName_ = other.sonyPsnName_;
          onChanged();
        }
        if (other.hasGameServerAppId()) {
          setGameServerAppId(other.getGameServerAppId());
        }
        if (other.hasSteamguardDontRememberComputer()) {
          setSteamguardDontRememberComputer(other.getSteamguardDontRememberComputer());
        }
        if (other.hasMachineName()) {
          bitField1_ |= 0x00000100;
          machineName_ = other.machineName_;
          onChanged();
        }
        if (other.hasMachineNameUserchosen()) {
          bitField1_ |= 0x00000200;
          machineNameUserchosen_ = other.machineNameUserchosen_;
          onChanged();
        }
        if (other.hasCountryOverride()) {
          bitField1_ |= 0x00000400;
          countryOverride_ = other.countryOverride_;
          onChanged();
        }
        if (other.hasIsSteamBox()) {
          setIsSteamBox(other.getIsSteamBox());
        }
        if (other.hasClientInstanceId()) {
          setClientInstanceId(other.getClientInstanceId());
        }
        if (other.hasTwoFactorCode()) {
          bitField1_ |= 0x00002000;
          twoFactorCode_ = other.twoFactorCode_;
          onChanged();
        }
        if (other.hasSupportsRateLimitResponse()) {
          setSupportsRateLimitResponse(other.getSupportsRateLimitResponse());
        }
        if (other.hasWebLogonNonce()) {
          bitField1_ |= 0x00008000;
          webLogonNonce_ = other.webLogonNonce_;
          onChanged();
        }
        if (other.hasPriorityReason()) {
          setPriorityReason(other.getPriorityReason());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;
      private int bitField1_;

      private int protocolVersion_ ;
      /**
       * <code>optional uint32 protocol_version = 1;</code>
       */
      public boolean hasProtocolVersion() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional uint32 protocol_version = 1;</code>
       */
      public int getProtocolVersion() {
        return protocolVersion_;
      }
      /**
       * <code>optional uint32 protocol_version = 1;</code>
       */
      public Builder setProtocolVersion(int value) {
        bitField0_ |= 0x00000001;
        protocolVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 protocol_version = 1;</code>
       */
      public Builder clearProtocolVersion() {
        bitField0_ = (bitField0_ & ~0x00000001);
        protocolVersion_ = 0;
        onChanged();
        return this;
      }

      private int obfustucatedPrivateIp_ ;
      /**
       * <code>optional uint32 obfustucated_private_ip = 2;</code>
       */
      public boolean hasObfustucatedPrivateIp() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint32 obfustucated_private_ip = 2;</code>
       */
      public int getObfustucatedPrivateIp() {
        return obfustucatedPrivateIp_;
      }
      /**
       * <code>optional uint32 obfustucated_private_ip = 2;</code>
       */
      public Builder setObfustucatedPrivateIp(int value) {
        bitField0_ |= 0x00000002;
        obfustucatedPrivateIp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 obfustucated_private_ip = 2;</code>
       */
      public Builder clearObfustucatedPrivateIp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        obfustucatedPrivateIp_ = 0;
        onChanged();
        return this;
      }

      private int cellId_ ;
      /**
       * <code>optional uint32 cell_id = 3;</code>
       */
      public boolean hasCellId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional uint32 cell_id = 3;</code>
       */
      public int getCellId() {
        return cellId_;
      }
      /**
       * <code>optional uint32 cell_id = 3;</code>
       */
      public Builder setCellId(int value) {
        bitField0_ |= 0x00000004;
        cellId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 cell_id = 3;</code>
       */
      public Builder clearCellId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        cellId_ = 0;
        onChanged();
        return this;
      }

      private int lastSessionId_ ;
      /**
       * <code>optional uint32 last_session_id = 4;</code>
       */
      public boolean hasLastSessionId() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional uint32 last_session_id = 4;</code>
       */
      public int getLastSessionId() {
        return lastSessionId_;
      }
      /**
       * <code>optional uint32 last_session_id = 4;</code>
       */
      public Builder setLastSessionId(int value) {
        bitField0_ |= 0x00000008;
        lastSessionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 last_session_id = 4;</code>
       */
      public Builder clearLastSessionId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        lastSessionId_ = 0;
        onChanged();
        return this;
      }

      private int clientPackageVersion_ ;
      /**
       * <code>optional uint32 client_package_version = 5;</code>
       */
      public boolean hasClientPackageVersion() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional uint32 client_package_version = 5;</code>
       */
      public int getClientPackageVersion() {
        return clientPackageVersion_;
      }
      /**
       * <code>optional uint32 client_package_version = 5;</code>
       */
      public Builder setClientPackageVersion(int value) {
        bitField0_ |= 0x00000010;
        clientPackageVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 client_package_version = 5;</code>
       */
      public Builder clearClientPackageVersion() {
        bitField0_ = (bitField0_ & ~0x00000010);
        clientPackageVersion_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object clientLanguage_ = "";
      /**
       * <code>optional string client_language = 6;</code>
       */
      public boolean hasClientLanguage() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional string client_language = 6;</code>
       */
      public java.lang.String getClientLanguage() {
        java.lang.Object ref = clientLanguage_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            clientLanguage_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string client_language = 6;</code>
       */
      public com.google.protobuf.ByteString
          getClientLanguageBytes() {
        java.lang.Object ref = clientLanguage_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clientLanguage_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string client_language = 6;</code>
       */
      public Builder setClientLanguage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        clientLanguage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string client_language = 6;</code>
       */
      public Builder clearClientLanguage() {
        bitField0_ = (bitField0_ & ~0x00000020);
        clientLanguage_ = getDefaultInstance().getClientLanguage();
        onChanged();
        return this;
      }
      /**
       * <code>optional string client_language = 6;</code>
       */
      public Builder setClientLanguageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        clientLanguage_ = value;
        onChanged();
        return this;
      }

      private int clientOsType_ ;
      /**
       * <code>optional uint32 client_os_type = 7;</code>
       */
      public boolean hasClientOsType() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional uint32 client_os_type = 7;</code>
       */
      public int getClientOsType() {
        return clientOsType_;
      }
      /**
       * <code>optional uint32 client_os_type = 7;</code>
       */
      public Builder setClientOsType(int value) {
        bitField0_ |= 0x00000040;
        clientOsType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 client_os_type = 7;</code>
       */
      public Builder clearClientOsType() {
        bitField0_ = (bitField0_ & ~0x00000040);
        clientOsType_ = 0;
        onChanged();
        return this;
      }

      private boolean shouldRememberPassword_ ;
      /**
       * <code>optional bool should_remember_password = 8 [default = false];</code>
       */
      public boolean hasShouldRememberPassword() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional bool should_remember_password = 8 [default = false];</code>
       */
      public boolean getShouldRememberPassword() {
        return shouldRememberPassword_;
      }
      /**
       * <code>optional bool should_remember_password = 8 [default = false];</code>
       */
      public Builder setShouldRememberPassword(boolean value) {
        bitField0_ |= 0x00000080;
        shouldRememberPassword_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool should_remember_password = 8 [default = false];</code>
       */
      public Builder clearShouldRememberPassword() {
        bitField0_ = (bitField0_ & ~0x00000080);
        shouldRememberPassword_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object wineVersion_ = "";
      /**
       * <code>optional string wine_version = 9;</code>
       */
      public boolean hasWineVersion() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>optional string wine_version = 9;</code>
       */
      public java.lang.String getWineVersion() {
        java.lang.Object ref = wineVersion_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            wineVersion_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string wine_version = 9;</code>
       */
      public com.google.protobuf.ByteString
          getWineVersionBytes() {
        java.lang.Object ref = wineVersion_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          wineVersion_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string wine_version = 9;</code>
       */
      public Builder setWineVersion(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        wineVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string wine_version = 9;</code>
       */
      public Builder clearWineVersion() {
        bitField0_ = (bitField0_ & ~0x00000100);
        wineVersion_ = getDefaultInstance().getWineVersion();
        onChanged();
        return this;
      }
      /**
       * <code>optional string wine_version = 9;</code>
       */
      public Builder setWineVersionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        wineVersion_ = value;
        onChanged();
        return this;
      }

      private int pingMsFromCellSearch_ ;
      /**
       * <code>optional uint32 ping_ms_from_cell_search = 10;</code>
       */
      public boolean hasPingMsFromCellSearch() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      /**
       * <code>optional uint32 ping_ms_from_cell_search = 10;</code>
       */
      public int getPingMsFromCellSearch() {
        return pingMsFromCellSearch_;
      }
      /**
       * <code>optional uint32 ping_ms_from_cell_search = 10;</code>
       */
      public Builder setPingMsFromCellSearch(int value) {
        bitField0_ |= 0x00000200;
        pingMsFromCellSearch_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 ping_ms_from_cell_search = 10;</code>
       */
      public Builder clearPingMsFromCellSearch() {
        bitField0_ = (bitField0_ & ~0x00000200);
        pingMsFromCellSearch_ = 0;
        onChanged();
        return this;
      }

      private int publicIp_ ;
      /**
       * <code>optional uint32 public_ip = 20;</code>
       */
      public boolean hasPublicIp() {
        return ((bitField0_ & 0x00000400) == 0x00000400);
      }
      /**
       * <code>optional uint32 public_ip = 20;</code>
       */
      public int getPublicIp() {
        return publicIp_;
      }
      /**
       * <code>optional uint32 public_ip = 20;</code>
       */
      public Builder setPublicIp(int value) {
        bitField0_ |= 0x00000400;
        publicIp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 public_ip = 20;</code>
       */
      public Builder clearPublicIp() {
        bitField0_ = (bitField0_ & ~0x00000400);
        publicIp_ = 0;
        onChanged();
        return this;
      }

      private int qosLevel_ ;
      /**
       * <code>optional uint32 qos_level = 21;</code>
       */
      public boolean hasQosLevel() {
        return ((bitField0_ & 0x00000800) == 0x00000800);
      }
      /**
       * <code>optional uint32 qos_level = 21;</code>
       */
      public int getQosLevel() {
        return qosLevel_;
      }
      /**
       * <code>optional uint32 qos_level = 21;</code>
       */
      public Builder setQosLevel(int value) {
        bitField0_ |= 0x00000800;
        qosLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 qos_level = 21;</code>
       */
      public Builder clearQosLevel() {
        bitField0_ = (bitField0_ & ~0x00000800);
        qosLevel_ = 0;
        onChanged();
        return this;
      }

      private long clientSuppliedSteamId_ ;
      /**
       * <code>optional fixed64 client_supplied_steam_id = 22;</code>
       */
      public boolean hasClientSuppliedSteamId() {
        return ((bitField0_ & 0x00001000) == 0x00001000);
      }
      /**
       * <code>optional fixed64 client_supplied_steam_id = 22;</code>
       */
      public long getClientSuppliedSteamId() {
        return clientSuppliedSteamId_;
      }
      /**
       * <code>optional fixed64 client_supplied_steam_id = 22;</code>
       */
      public Builder setClientSuppliedSteamId(long value) {
        bitField0_ |= 0x00001000;
        clientSuppliedSteamId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional fixed64 client_supplied_steam_id = 22;</code>
       */
      public Builder clearClientSuppliedSteamId() {
        bitField0_ = (bitField0_ & ~0x00001000);
        clientSuppliedSteamId_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString machineId_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes machine_id = 30;</code>
       */
      public boolean hasMachineId() {
        return ((bitField0_ & 0x00002000) == 0x00002000);
      }
      /**
       * <code>optional bytes machine_id = 30;</code>
       */
      public com.google.protobuf.ByteString getMachineId() {
        return machineId_;
      }
      /**
       * <code>optional bytes machine_id = 30;</code>
       */
      public Builder setMachineId(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00002000;
        machineId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes machine_id = 30;</code>
       */
      public Builder clearMachineId() {
        bitField0_ = (bitField0_ & ~0x00002000);
        machineId_ = getDefaultInstance().getMachineId();
        onChanged();
        return this;
      }

      private int launcherType_ ;
      /**
       * <code>optional uint32 launcher_type = 31 [default = 0];</code>
       */
      public boolean hasLauncherType() {
        return ((bitField0_ & 0x00004000) == 0x00004000);
      }
      /**
       * <code>optional uint32 launcher_type = 31 [default = 0];</code>
       */
      public int getLauncherType() {
        return launcherType_;
      }
      /**
       * <code>optional uint32 launcher_type = 31 [default = 0];</code>
       */
      public Builder setLauncherType(int value) {
        bitField0_ |= 0x00004000;
        launcherType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 launcher_type = 31 [default = 0];</code>
       */
      public Builder clearLauncherType() {
        bitField0_ = (bitField0_ & ~0x00004000);
        launcherType_ = 0;
        onChanged();
        return this;
      }

      private int uiMode_ ;
      /**
       * <code>optional uint32 ui_mode = 32 [default = 0];</code>
       */
      public boolean hasUiMode() {
        return ((bitField0_ & 0x00008000) == 0x00008000);
      }
      /**
       * <code>optional uint32 ui_mode = 32 [default = 0];</code>
       */
      public int getUiMode() {
        return uiMode_;
      }
      /**
       * <code>optional uint32 ui_mode = 32 [default = 0];</code>
       */
      public Builder setUiMode(int value) {
        bitField0_ |= 0x00008000;
        uiMode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 ui_mode = 32 [default = 0];</code>
       */
      public Builder clearUiMode() {
        bitField0_ = (bitField0_ & ~0x00008000);
        uiMode_ = 0;
        onChanged();
        return this;
      }

      private int chatMode_ ;
      /**
       * <code>optional uint32 chat_mode = 33 [default = 0];</code>
       */
      public boolean hasChatMode() {
        return ((bitField0_ & 0x00010000) == 0x00010000);
      }
      /**
       * <code>optional uint32 chat_mode = 33 [default = 0];</code>
       */
      public int getChatMode() {
        return chatMode_;
      }
      /**
       * <code>optional uint32 chat_mode = 33 [default = 0];</code>
       */
      public Builder setChatMode(int value) {
        bitField0_ |= 0x00010000;
        chatMode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 chat_mode = 33 [default = 0];</code>
       */
      public Builder clearChatMode() {
        bitField0_ = (bitField0_ & ~0x00010000);
        chatMode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString steam2AuthTicket_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes steam2_auth_ticket = 41;</code>
       */
      public boolean hasSteam2AuthTicket() {
        return ((bitField0_ & 0x00020000) == 0x00020000);
      }
      /**
       * <code>optional bytes steam2_auth_ticket = 41;</code>
       */
      public com.google.protobuf.ByteString getSteam2AuthTicket() {
        return steam2AuthTicket_;
      }
      /**
       * <code>optional bytes steam2_auth_ticket = 41;</code>
       */
      public Builder setSteam2AuthTicket(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00020000;
        steam2AuthTicket_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes steam2_auth_ticket = 41;</code>
       */
      public Builder clearSteam2AuthTicket() {
        bitField0_ = (bitField0_ & ~0x00020000);
        steam2AuthTicket_ = getDefaultInstance().getSteam2AuthTicket();
        onChanged();
        return this;
      }

      private java.lang.Object emailAddress_ = "";
      /**
       * <code>optional string email_address = 42;</code>
       */
      public boolean hasEmailAddress() {
        return ((bitField0_ & 0x00040000) == 0x00040000);
      }
      /**
       * <code>optional string email_address = 42;</code>
       */
      public java.lang.String getEmailAddress() {
        java.lang.Object ref = emailAddress_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            emailAddress_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string email_address = 42;</code>
       */
      public com.google.protobuf.ByteString
          getEmailAddressBytes() {
        java.lang.Object ref = emailAddress_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          emailAddress_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string email_address = 42;</code>
       */
      public Builder setEmailAddress(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00040000;
        emailAddress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string email_address = 42;</code>
       */
      public Builder clearEmailAddress() {
        bitField0_ = (bitField0_ & ~0x00040000);
        emailAddress_ = getDefaultInstance().getEmailAddress();
        onChanged();
        return this;
      }
      /**
       * <code>optional string email_address = 42;</code>
       */
      public Builder setEmailAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00040000;
        emailAddress_ = value;
        onChanged();
        return this;
      }

      private int rtime32AccountCreation_ ;
      /**
       * <code>optional fixed32 rtime32_account_creation = 43;</code>
       */
      public boolean hasRtime32AccountCreation() {
        return ((bitField0_ & 0x00080000) == 0x00080000);
      }
      /**
       * <code>optional fixed32 rtime32_account_creation = 43;</code>
       */
      public int getRtime32AccountCreation() {
        return rtime32AccountCreation_;
      }
      /**
       * <code>optional fixed32 rtime32_account_creation = 43;</code>
       */
      public Builder setRtime32AccountCreation(int value) {
        bitField0_ |= 0x00080000;
        rtime32AccountCreation_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional fixed32 rtime32_account_creation = 43;</code>
       */
      public Builder clearRtime32AccountCreation() {
        bitField0_ = (bitField0_ & ~0x00080000);
        rtime32AccountCreation_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object accountName_ = "";
      /**
       * <code>optional string account_name = 50;</code>
       */
      public boolean hasAccountName() {
        return ((bitField0_ & 0x00100000) == 0x00100000);
      }
      /**
       * <code>optional string account_name = 50;</code>
       */
      public java.lang.String getAccountName() {
        java.lang.Object ref = accountName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            accountName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string account_name = 50;</code>
       */
      public com.google.protobuf.ByteString
          getAccountNameBytes() {
        java.lang.Object ref = accountName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          accountName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string account_name = 50;</code>
       */
      public Builder setAccountName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00100000;
        accountName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string account_name = 50;</code>
       */
      public Builder clearAccountName() {
        bitField0_ = (bitField0_ & ~0x00100000);
        accountName_ = getDefaultInstance().getAccountName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string account_name = 50;</code>
       */
      public Builder setAccountNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00100000;
        accountName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object password_ = "";
      /**
       * <code>optional string password = 51;</code>
       */
      public boolean hasPassword() {
        return ((bitField0_ & 0x00200000) == 0x00200000);
      }
      /**
       * <code>optional string password = 51;</code>
       */
      public java.lang.String getPassword() {
        java.lang.Object ref = password_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            password_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string password = 51;</code>
       */
      public com.google.protobuf.ByteString
          getPasswordBytes() {
        java.lang.Object ref = password_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          password_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string password = 51;</code>
       */
      public Builder setPassword(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00200000;
        password_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string password = 51;</code>
       */
      public Builder clearPassword() {
        bitField0_ = (bitField0_ & ~0x00200000);
        password_ = getDefaultInstance().getPassword();
        onChanged();
        return this;
      }
      /**
       * <code>optional string password = 51;</code>
       */
      public Builder setPasswordBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00200000;
        password_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object gameServerToken_ = "";
      /**
       * <code>optional string game_server_token = 52;</code>
       */
      public boolean hasGameServerToken() {
        return ((bitField0_ & 0x00400000) == 0x00400000);
      }
      /**
       * <code>optional string game_server_token = 52;</code>
       */
      public java.lang.String getGameServerToken() {
        java.lang.Object ref = gameServerToken_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            gameServerToken_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string game_server_token = 52;</code>
       */
      public com.google.protobuf.ByteString
          getGameServerTokenBytes() {
        java.lang.Object ref = gameServerToken_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          gameServerToken_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string game_server_token = 52;</code>
       */
      public Builder setGameServerToken(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00400000;
        gameServerToken_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string game_server_token = 52;</code>
       */
      public Builder clearGameServerToken() {
        bitField0_ = (bitField0_ & ~0x00400000);
        gameServerToken_ = getDefaultInstance().getGameServerToken();
        onChanged();
        return this;
      }
      /**
       * <code>optional string game_server_token = 52;</code>
       */
      public Builder setGameServerTokenBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00400000;
        gameServerToken_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object loginKey_ = "";
      /**
       * <code>optional string login_key = 60;</code>
       */
      public boolean hasLoginKey() {
        return ((bitField0_ & 0x00800000) == 0x00800000);
      }
      /**
       * <code>optional string login_key = 60;</code>
       */
      public java.lang.String getLoginKey() {
        java.lang.Object ref = loginKey_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            loginKey_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string login_key = 60;</code>
       */
      public com.google.protobuf.ByteString
          getLoginKeyBytes() {
        java.lang.Object ref = loginKey_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          loginKey_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string login_key = 60;</code>
       */
      public Builder setLoginKey(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00800000;
        loginKey_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string login_key = 60;</code>
       */
      public Builder clearLoginKey() {
        bitField0_ = (bitField0_ & ~0x00800000);
        loginKey_ = getDefaultInstance().getLoginKey();
        onChanged();
        return this;
      }
      /**
       * <code>optional string login_key = 60;</code>
       */
      public Builder setLoginKeyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00800000;
        loginKey_ = value;
        onChanged();
        return this;
      }

      private boolean wasConvertedDeprecatedMsg_ ;
      /**
       * <code>optional bool was_converted_deprecated_msg = 70 [default = false];</code>
       */
      public boolean hasWasConvertedDeprecatedMsg() {
        return ((bitField0_ & 0x01000000) == 0x01000000);
      }
      /**
       * <code>optional bool was_converted_deprecated_msg = 70 [default = false];</code>
       */
      public boolean getWasConvertedDeprecatedMsg() {
        return wasConvertedDeprecatedMsg_;
      }
      /**
       * <code>optional bool was_converted_deprecated_msg = 70 [default = false];</code>
       */
      public Builder setWasConvertedDeprecatedMsg(boolean value) {
        bitField0_ |= 0x01000000;
        wasConvertedDeprecatedMsg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool was_converted_deprecated_msg = 70 [default = false];</code>
       */
      public Builder clearWasConvertedDeprecatedMsg() {
        bitField0_ = (bitField0_ & ~0x01000000);
        wasConvertedDeprecatedMsg_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object anonUserTargetAccountName_ = "";
      /**
       * <code>optional string anon_user_target_account_name = 80;</code>
       */
      public boolean hasAnonUserTargetAccountName() {
        return ((bitField0_ & 0x02000000) == 0x02000000);
      }
      /**
       * <code>optional string anon_user_target_account_name = 80;</code>
       */
      public java.lang.String getAnonUserTargetAccountName() {
        java.lang.Object ref = anonUserTargetAccountName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            anonUserTargetAccountName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string anon_user_target_account_name = 80;</code>
       */
      public com.google.protobuf.ByteString
          getAnonUserTargetAccountNameBytes() {
        java.lang.Object ref = anonUserTargetAccountName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          anonUserTargetAccountName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string anon_user_target_account_name = 80;</code>
       */
      public Builder setAnonUserTargetAccountName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x02000000;
        anonUserTargetAccountName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string anon_user_target_account_name = 80;</code>
       */
      public Builder clearAnonUserTargetAccountName() {
        bitField0_ = (bitField0_ & ~0x02000000);
        anonUserTargetAccountName_ = getDefaultInstance().getAnonUserTargetAccountName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string anon_user_target_account_name = 80;</code>
       */
      public Builder setAnonUserTargetAccountNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x02000000;
        anonUserTargetAccountName_ = value;
        onChanged();
        return this;
      }

      private long resolvedUserSteamId_ ;
      /**
       * <code>optional fixed64 resolved_user_steam_id = 81;</code>
       */
      public boolean hasResolvedUserSteamId() {
        return ((bitField0_ & 0x04000000) == 0x04000000);
      }
      /**
       * <code>optional fixed64 resolved_user_steam_id = 81;</code>
       */
      public long getResolvedUserSteamId() {
        return resolvedUserSteamId_;
      }
      /**
       * <code>optional fixed64 resolved_user_steam_id = 81;</code>
       */
      public Builder setResolvedUserSteamId(long value) {
        bitField0_ |= 0x04000000;
        resolvedUserSteamId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional fixed64 resolved_user_steam_id = 81;</code>
       */
      public Builder clearResolvedUserSteamId() {
        bitField0_ = (bitField0_ & ~0x04000000);
        resolvedUserSteamId_ = 0L;
        onChanged();
        return this;
      }

      private int eresultSentryfile_ ;
      /**
       * <code>optional int32 eresult_sentryfile = 82;</code>
       */
      public boolean hasEresultSentryfile() {
        return ((bitField0_ & 0x08000000) == 0x08000000);
      }
      /**
       * <code>optional int32 eresult_sentryfile = 82;</code>
       */
      public int getEresultSentryfile() {
        return eresultSentryfile_;
      }
      /**
       * <code>optional int32 eresult_sentryfile = 82;</code>
       */
      public Builder setEresultSentryfile(int value) {
        bitField0_ |= 0x08000000;
        eresultSentryfile_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 eresult_sentryfile = 82;</code>
       */
      public Builder clearEresultSentryfile() {
        bitField0_ = (bitField0_ & ~0x08000000);
        eresultSentryfile_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString shaSentryfile_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes sha_sentryfile = 83;</code>
       */
      public boolean hasShaSentryfile() {
        return ((bitField0_ & 0x10000000) == 0x10000000);
      }
      /**
       * <code>optional bytes sha_sentryfile = 83;</code>
       */
      public com.google.protobuf.ByteString getShaSentryfile() {
        return shaSentryfile_;
      }
      /**
       * <code>optional bytes sha_sentryfile = 83;</code>
       */
      public Builder setShaSentryfile(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x10000000;
        shaSentryfile_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes sha_sentryfile = 83;</code>
       */
      public Builder clearShaSentryfile() {
        bitField0_ = (bitField0_ & ~0x10000000);
        shaSentryfile_ = getDefaultInstance().getShaSentryfile();
        onChanged();
        return this;
      }

      private java.lang.Object authCode_ = "";
      /**
       * <code>optional string auth_code = 84;</code>
       */
      public boolean hasAuthCode() {
        return ((bitField0_ & 0x20000000) == 0x20000000);
      }
      /**
       * <code>optional string auth_code = 84;</code>
       */
      public java.lang.String getAuthCode() {
        java.lang.Object ref = authCode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            authCode_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string auth_code = 84;</code>
       */
      public com.google.protobuf.ByteString
          getAuthCodeBytes() {
        java.lang.Object ref = authCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          authCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string auth_code = 84;</code>
       */
      public Builder setAuthCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x20000000;
        authCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string auth_code = 84;</code>
       */
      public Builder clearAuthCode() {
        bitField0_ = (bitField0_ & ~0x20000000);
        authCode_ = getDefaultInstance().getAuthCode();
        onChanged();
        return this;
      }
      /**
       * <code>optional string auth_code = 84;</code>
       */
      public Builder setAuthCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x20000000;
        authCode_ = value;
        onChanged();
        return this;
      }

      private int otpType_ ;
      /**
       * <code>optional int32 otp_type = 85;</code>
       */
      public boolean hasOtpType() {
        return ((bitField0_ & 0x40000000) == 0x40000000);
      }
      /**
       * <code>optional int32 otp_type = 85;</code>
       */
      public int getOtpType() {
        return otpType_;
      }
      /**
       * <code>optional int32 otp_type = 85;</code>
       */
      public Builder setOtpType(int value) {
        bitField0_ |= 0x40000000;
        otpType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 otp_type = 85;</code>
       */
      public Builder clearOtpType() {
        bitField0_ = (bitField0_ & ~0x40000000);
        otpType_ = 0;
        onChanged();
        return this;
      }

      private int otpValue_ ;
      /**
       * <code>optional uint32 otp_value = 86;</code>
       */
      public boolean hasOtpValue() {
        return ((bitField0_ & 0x80000000) == 0x80000000);
      }
      /**
       * <code>optional uint32 otp_value = 86;</code>
       */
      public int getOtpValue() {
        return otpValue_;
      }
      /**
       * <code>optional uint32 otp_value = 86;</code>
       */
      public Builder setOtpValue(int value) {
        bitField0_ |= 0x80000000;
        otpValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 otp_value = 86;</code>
       */
      public Builder clearOtpValue() {
        bitField0_ = (bitField0_ & ~0x80000000);
        otpValue_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object otpIdentifier_ = "";
      /**
       * <code>optional string otp_identifier = 87;</code>
       */
      public boolean hasOtpIdentifier() {
        return ((bitField1_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string otp_identifier = 87;</code>
       */
      public java.lang.String getOtpIdentifier() {
        java.lang.Object ref = otpIdentifier_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            otpIdentifier_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string otp_identifier = 87;</code>
       */
      public com.google.protobuf.ByteString
          getOtpIdentifierBytes() {
        java.lang.Object ref = otpIdentifier_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          otpIdentifier_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string otp_identifier = 87;</code>
       */
      public Builder setOtpIdentifier(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField1_ |= 0x00000001;
        otpIdentifier_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string otp_identifier = 87;</code>
       */
      public Builder clearOtpIdentifier() {
        bitField1_ = (bitField1_ & ~0x00000001);
        otpIdentifier_ = getDefaultInstance().getOtpIdentifier();
        onChanged();
        return this;
      }
      /**
       * <code>optional string otp_identifier = 87;</code>
       */
      public Builder setOtpIdentifierBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField1_ |= 0x00000001;
        otpIdentifier_ = value;
        onChanged();
        return this;
      }

      private boolean steam2TicketRequest_ ;
      /**
       * <code>optional bool steam2_ticket_request = 88;</code>
       */
      public boolean hasSteam2TicketRequest() {
        return ((bitField1_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional bool steam2_ticket_request = 88;</code>
       */
      public boolean getSteam2TicketRequest() {
        return steam2TicketRequest_;
      }
      /**
       * <code>optional bool steam2_ticket_request = 88;</code>
       */
      public Builder setSteam2TicketRequest(boolean value) {
        bitField1_ |= 0x00000002;
        steam2TicketRequest_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool steam2_ticket_request = 88;</code>
       */
      public Builder clearSteam2TicketRequest() {
        bitField1_ = (bitField1_ & ~0x00000002);
        steam2TicketRequest_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString sonyPsnTicket_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes sony_psn_ticket = 90;</code>
       */
      public boolean hasSonyPsnTicket() {
        return ((bitField1_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional bytes sony_psn_ticket = 90;</code>
       */
      public com.google.protobuf.ByteString getSonyPsnTicket() {
        return sonyPsnTicket_;
      }
      /**
       * <code>optional bytes sony_psn_ticket = 90;</code>
       */
      public Builder setSonyPsnTicket(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField1_ |= 0x00000004;
        sonyPsnTicket_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes sony_psn_ticket = 90;</code>
       */
      public Builder clearSonyPsnTicket() {
        bitField1_ = (bitField1_ & ~0x00000004);
        sonyPsnTicket_ = getDefaultInstance().getSonyPsnTicket();
        onChanged();
        return this;
      }

      private java.lang.Object sonyPsnServiceId_ = "";
      /**
       * <code>optional string sony_psn_service_id = 91;</code>
       */
      public boolean hasSonyPsnServiceId() {
        return ((bitField1_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string sony_psn_service_id = 91;</code>
       */
      public java.lang.String getSonyPsnServiceId() {
        java.lang.Object ref = sonyPsnServiceId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            sonyPsnServiceId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string sony_psn_service_id = 91;</code>
       */
      public com.google.protobuf.ByteString
          getSonyPsnServiceIdBytes() {
        java.lang.Object ref = sonyPsnServiceId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          sonyPsnServiceId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string sony_psn_service_id = 91;</code>
       */
      public Builder setSonyPsnServiceId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField1_ |= 0x00000008;
        sonyPsnServiceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string sony_psn_service_id = 91;</code>
       */
      public Builder clearSonyPsnServiceId() {
        bitField1_ = (bitField1_ & ~0x00000008);
        sonyPsnServiceId_ = getDefaultInstance().getSonyPsnServiceId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string sony_psn_service_id = 91;</code>
       */
      public Builder setSonyPsnServiceIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField1_ |= 0x00000008;
        sonyPsnServiceId_ = value;
        onChanged();
        return this;
      }

      private boolean createNewPsnLinkedAccountIfNeeded_ ;
      /**
       * <code>optional bool create_new_psn_linked_account_if_needed = 92 [default = false];</code>
       */
      public boolean hasCreateNewPsnLinkedAccountIfNeeded() {
        return ((bitField1_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional bool create_new_psn_linked_account_if_needed = 92 [default = false];</code>
       */
      public boolean getCreateNewPsnLinkedAccountIfNeeded() {
        return createNewPsnLinkedAccountIfNeeded_;
      }
      /**
       * <code>optional bool create_new_psn_linked_account_if_needed = 92 [default = false];</code>
       */
      public Builder setCreateNewPsnLinkedAccountIfNeeded(boolean value) {
        bitField1_ |= 0x00000010;
        createNewPsnLinkedAccountIfNeeded_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool create_new_psn_linked_account_if_needed = 92 [default = false];</code>
       */
      public Builder clearCreateNewPsnLinkedAccountIfNeeded() {
        bitField1_ = (bitField1_ & ~0x00000010);
        createNewPsnLinkedAccountIfNeeded_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object sonyPsnName_ = "";
      /**
       * <code>optional string sony_psn_name = 93;</code>
       */
      public boolean hasSonyPsnName() {
        return ((bitField1_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional string sony_psn_name = 93;</code>
       */
      public java.lang.String getSonyPsnName() {
        java.lang.Object ref = sonyPsnName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            sonyPsnName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string sony_psn_name = 93;</code>
       */
      public com.google.protobuf.ByteString
          getSonyPsnNameBytes() {
        java.lang.Object ref = sonyPsnName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          sonyPsnName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string sony_psn_name = 93;</code>
       */
      public Builder setSonyPsnName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField1_ |= 0x00000020;
        sonyPsnName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string sony_psn_name = 93;</code>
       */
      public Builder clearSonyPsnName() {
        bitField1_ = (bitField1_ & ~0x00000020);
        sonyPsnName_ = getDefaultInstance().getSonyPsnName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string sony_psn_name = 93;</code>
       */
      public Builder setSonyPsnNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField1_ |= 0x00000020;
        sonyPsnName_ = value;
        onChanged();
        return this;
      }

      private int gameServerAppId_ ;
      /**
       * <code>optional int32 game_server_app_id = 94;</code>
       */
      public boolean hasGameServerAppId() {
        return ((bitField1_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional int32 game_server_app_id = 94;</code>
       */
      public int getGameServerAppId() {
        return gameServerAppId_;
      }
      /**
       * <code>optional int32 game_server_app_id = 94;</code>
       */
      public Builder setGameServerAppId(int value) {
        bitField1_ |= 0x00000040;
        gameServerAppId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 game_server_app_id = 94;</code>
       */
      public Builder clearGameServerAppId() {
        bitField1_ = (bitField1_ & ~0x00000040);
        gameServerAppId_ = 0;
        onChanged();
        return this;
      }

      private boolean steamguardDontRememberComputer_ ;
      /**
       * <code>optional bool steamguard_dont_remember_computer = 95;</code>
       */
      public boolean hasSteamguardDontRememberComputer() {
        return ((bitField1_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional bool steamguard_dont_remember_computer = 95;</code>
       */
      public boolean getSteamguardDontRememberComputer() {
        return steamguardDontRememberComputer_;
      }
      /**
       * <code>optional bool steamguard_dont_remember_computer = 95;</code>
       */
      public Builder setSteamguardDontRememberComputer(boolean value) {
        bitField1_ |= 0x00000080;
        steamguardDontRememberComputer_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool steamguard_dont_remember_computer = 95;</code>
       */
      public Builder clearSteamguardDontRememberComputer() {
        bitField1_ = (bitField1_ & ~0x00000080);
        steamguardDontRememberComputer_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object machineName_ = "";
      /**
       * <code>optional string machine_name = 96;</code>
       */
      public boolean hasMachineName() {
        return ((bitField1_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>optional string machine_name = 96;</code>
       */
      public java.lang.String getMachineName() {
        java.lang.Object ref = machineName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            machineName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string machine_name = 96;</code>
       */
      public com.google.protobuf.ByteString
          getMachineNameBytes() {
        java.lang.Object ref = machineName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          machineName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string machine_name = 96;</code>
       */
      public Builder setMachineName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField1_ |= 0x00000100;
        machineName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string machine_name = 96;</code>
       */
      public Builder clearMachineName() {
        bitField1_ = (bitField1_ & ~0x00000100);
        machineName_ = getDefaultInstance().getMachineName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string machine_name = 96;</code>
       */
      public Builder setMachineNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField1_ |= 0x00000100;
        machineName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object machineNameUserchosen_ = "";
      /**
       * <code>optional string machine_name_userchosen = 97;</code>
       */
      public boolean hasMachineNameUserchosen() {
        return ((bitField1_ & 0x00000200) == 0x00000200);
      }
      /**
       * <code>optional string machine_name_userchosen = 97;</code>
       */
      public java.lang.String getMachineNameUserchosen() {
        java.lang.Object ref = machineNameUserchosen_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            machineNameUserchosen_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string machine_name_userchosen = 97;</code>
       */
      public com.google.protobuf.ByteString
          getMachineNameUserchosenBytes() {
        java.lang.Object ref = machineNameUserchosen_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          machineNameUserchosen_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string machine_name_userchosen = 97;</code>
       */
      public Builder setMachineNameUserchosen(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField1_ |= 0x00000200;
        machineNameUserchosen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string machine_name_userchosen = 97;</code>
       */
      public Builder clearMachineNameUserchosen() {
        bitField1_ = (bitField1_ & ~0x00000200);
        machineNameUserchosen_ = getDefaultInstance().getMachineNameUserchosen();
        onChanged();
        return this;
      }
      /**
       * <code>optional string machine_name_userchosen = 97;</code>
       */
      public Builder setMachineNameUserchosenBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField1_ |= 0x00000200;
        machineNameUserchosen_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object countryOverride_ = "";
      /**
       * <code>optional string country_override = 98;</code>
       */
      public boolean hasCountryOverride() {
        return ((bitField1_ & 0x00000400) == 0x00000400);
      }
      /**
       * <code>optional string country_override = 98;</code>
       */
      public java.lang.String getCountryOverride() {
        java.lang.Object ref = countryOverride_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            countryOverride_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string country_override = 98;</code>
       */
      public com.google.protobuf.ByteString
          getCountryOverrideBytes() {
        java.lang.Object ref = countryOverride_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          countryOverride_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string country_override = 98;</code>
       */
      public Builder setCountryOverride(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField1_ |= 0x00000400;
        countryOverride_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string country_override = 98;</code>
       */
      public Builder clearCountryOverride() {
        bitField1_ = (bitField1_ & ~0x00000400);
        countryOverride_ = getDefaultInstance().getCountryOverride();
        onChanged();
        return this;
      }
      /**
       * <code>optional string country_override = 98;</code>
       */
      public Builder setCountryOverrideBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField1_ |= 0x00000400;
        countryOverride_ = value;
        onChanged();
        return this;
      }

      private boolean isSteamBox_ ;
      /**
       * <code>optional bool is_steam_box = 99;</code>
       */
      public boolean hasIsSteamBox() {
        return ((bitField1_ & 0x00000800) == 0x00000800);
      }
      /**
       * <code>optional bool is_steam_box = 99;</code>
       */
      public boolean getIsSteamBox() {
        return isSteamBox_;
      }
      /**
       * <code>optional bool is_steam_box = 99;</code>
       */
      public Builder setIsSteamBox(boolean value) {
        bitField1_ |= 0x00000800;
        isSteamBox_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool is_steam_box = 99;</code>
       */
      public Builder clearIsSteamBox() {
        bitField1_ = (bitField1_ & ~0x00000800);
        isSteamBox_ = false;
        onChanged();
        return this;
      }

      private long clientInstanceId_ ;
      /**
       * <code>optional uint64 client_instance_id = 100;</code>
       */
      public boolean hasClientInstanceId() {
        return ((bitField1_ & 0x00001000) == 0x00001000);
      }
      /**
       * <code>optional uint64 client_instance_id = 100;</code>
       */
      public long getClientInstanceId() {
        return clientInstanceId_;
      }
      /**
       * <code>optional uint64 client_instance_id = 100;</code>
       */
      public Builder setClientInstanceId(long value) {
        bitField1_ |= 0x00001000;
        clientInstanceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 client_instance_id = 100;</code>
       */
      public Builder clearClientInstanceId() {
        bitField1_ = (bitField1_ & ~0x00001000);
        clientInstanceId_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object twoFactorCode_ = "";
      /**
       * <code>optional string two_factor_code = 101;</code>
       */
      public boolean hasTwoFactorCode() {
        return ((bitField1_ & 0x00002000) == 0x00002000);
      }
      /**
       * <code>optional string two_factor_code = 101;</code>
       */
      public java.lang.String getTwoFactorCode() {
        java.lang.Object ref = twoFactorCode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            twoFactorCode_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string two_factor_code = 101;</code>
       */
      public com.google.protobuf.ByteString
          getTwoFactorCodeBytes() {
        java.lang.Object ref = twoFactorCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          twoFactorCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string two_factor_code = 101;</code>
       */
      public Builder setTwoFactorCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField1_ |= 0x00002000;
        twoFactorCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string two_factor_code = 101;</code>
       */
      public Builder clearTwoFactorCode() {
        bitField1_ = (bitField1_ & ~0x00002000);
        twoFactorCode_ = getDefaultInstance().getTwoFactorCode();
        onChanged();
        return this;
      }
      /**
       * <code>optional string two_factor_code = 101;</code>
       */
      public Builder setTwoFactorCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField1_ |= 0x00002000;
        twoFactorCode_ = value;
        onChanged();
        return this;
      }

      private boolean supportsRateLimitResponse_ ;
      /**
       * <code>optional bool supports_rate_limit_response = 102;</code>
       */
      public boolean hasSupportsRateLimitResponse() {
        return ((bitField1_ & 0x00004000) == 0x00004000);
      }
      /**
       * <code>optional bool supports_rate_limit_response = 102;</code>
       */
      public boolean getSupportsRateLimitResponse() {
        return supportsRateLimitResponse_;
      }
      /**
       * <code>optional bool supports_rate_limit_response = 102;</code>
       */
      public Builder setSupportsRateLimitResponse(boolean value) {
        bitField1_ |= 0x00004000;
        supportsRateLimitResponse_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool supports_rate_limit_response = 102;</code>
       */
      public Builder clearSupportsRateLimitResponse() {
        bitField1_ = (bitField1_ & ~0x00004000);
        supportsRateLimitResponse_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object webLogonNonce_ = "";
      /**
       * <code>optional string web_logon_nonce = 103;</code>
       */
      public boolean hasWebLogonNonce() {
        return ((bitField1_ & 0x00008000) == 0x00008000);
      }
      /**
       * <code>optional string web_logon_nonce = 103;</code>
       */
      public java.lang.String getWebLogonNonce() {
        java.lang.Object ref = webLogonNonce_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            webLogonNonce_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string web_logon_nonce = 103;</code>
       */
      public com.google.protobuf.ByteString
          getWebLogonNonceBytes() {
        java.lang.Object ref = webLogonNonce_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          webLogonNonce_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string web_logon_nonce = 103;</code>
       */
      public Builder setWebLogonNonce(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField1_ |= 0x00008000;
        webLogonNonce_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string web_logon_nonce = 103;</code>
       */
      public Builder clearWebLogonNonce() {
        bitField1_ = (bitField1_ & ~0x00008000);
        webLogonNonce_ = getDefaultInstance().getWebLogonNonce();
        onChanged();
        return this;
      }
      /**
       * <code>optional string web_logon_nonce = 103;</code>
       */
      public Builder setWebLogonNonceBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField1_ |= 0x00008000;
        webLogonNonce_ = value;
        onChanged();
        return this;
      }

      private int priorityReason_ ;
      /**
       * <code>optional int32 priority_reason = 104;</code>
       */
      public boolean hasPriorityReason() {
        return ((bitField1_ & 0x00010000) == 0x00010000);
      }
      /**
       * <code>optional int32 priority_reason = 104;</code>
       */
      public int getPriorityReason() {
        return priorityReason_;
      }
      /**
       * <code>optional int32 priority_reason = 104;</code>
       */
      public Builder setPriorityReason(int value) {
        bitField1_ |= 0x00010000;
        priorityReason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 priority_reason = 104;</code>
       */
      public Builder clearPriorityReason() {
        bitField1_ = (bitField1_ & ~0x00010000);
        priorityReason_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CMsgClientLogon)
    }

    // @@protoc_insertion_point(class_scope:CMsgClientLogon)
    private static final uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon();
    }

    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CMsgClientLogon>
        PARSER = new com.google.protobuf.AbstractParser<CMsgClientLogon>() {
      public CMsgClientLogon parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CMsgClientLogon(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CMsgClientLogon> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CMsgClientLogon> getParserForType() {
      return PARSER;
    }

    public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CMsgClientLogonResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CMsgClientLogonResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 eresult = 1 [default = 2];</code>
     */
    boolean hasEresult();
    /**
     * <code>optional int32 eresult = 1 [default = 2];</code>
     */
    int getEresult();

    /**
     * <code>optional int32 out_of_game_heartbeat_seconds = 2;</code>
     */
    boolean hasOutOfGameHeartbeatSeconds();
    /**
     * <code>optional int32 out_of_game_heartbeat_seconds = 2;</code>
     */
    int getOutOfGameHeartbeatSeconds();

    /**
     * <code>optional int32 in_game_heartbeat_seconds = 3;</code>
     */
    boolean hasInGameHeartbeatSeconds();
    /**
     * <code>optional int32 in_game_heartbeat_seconds = 3;</code>
     */
    int getInGameHeartbeatSeconds();

    /**
     * <code>optional uint32 public_ip = 4;</code>
     */
    boolean hasPublicIp();
    /**
     * <code>optional uint32 public_ip = 4;</code>
     */
    int getPublicIp();

    /**
     * <code>optional fixed32 rtime32_server_time = 5;</code>
     */
    boolean hasRtime32ServerTime();
    /**
     * <code>optional fixed32 rtime32_server_time = 5;</code>
     */
    int getRtime32ServerTime();

    /**
     * <code>optional uint32 account_flags = 6;</code>
     */
    boolean hasAccountFlags();
    /**
     * <code>optional uint32 account_flags = 6;</code>
     */
    int getAccountFlags();

    /**
     * <code>optional uint32 cell_id = 7;</code>
     */
    boolean hasCellId();
    /**
     * <code>optional uint32 cell_id = 7;</code>
     */
    int getCellId();

    /**
     * <code>optional string email_domain = 8;</code>
     */
    boolean hasEmailDomain();
    /**
     * <code>optional string email_domain = 8;</code>
     */
    java.lang.String getEmailDomain();
    /**
     * <code>optional string email_domain = 8;</code>
     */
    com.google.protobuf.ByteString
        getEmailDomainBytes();

    /**
     * <code>optional bytes steam2_ticket = 9;</code>
     */
    boolean hasSteam2Ticket();
    /**
     * <code>optional bytes steam2_ticket = 9;</code>
     */
    com.google.protobuf.ByteString getSteam2Ticket();

    /**
     * <code>optional int32 eresult_extended = 10;</code>
     */
    boolean hasEresultExtended();
    /**
     * <code>optional int32 eresult_extended = 10;</code>
     */
    int getEresultExtended();

    /**
     * <code>optional string webapi_authenticate_user_nonce = 11;</code>
     */
    boolean hasWebapiAuthenticateUserNonce();
    /**
     * <code>optional string webapi_authenticate_user_nonce = 11;</code>
     */
    java.lang.String getWebapiAuthenticateUserNonce();
    /**
     * <code>optional string webapi_authenticate_user_nonce = 11;</code>
     */
    com.google.protobuf.ByteString
        getWebapiAuthenticateUserNonceBytes();

    /**
     * <code>optional uint32 cell_id_ping_threshold = 12;</code>
     */
    boolean hasCellIdPingThreshold();
    /**
     * <code>optional uint32 cell_id_ping_threshold = 12;</code>
     */
    int getCellIdPingThreshold();

    /**
     * <code>optional bool use_pics = 13;</code>
     */
    boolean hasUsePics();
    /**
     * <code>optional bool use_pics = 13;</code>
     */
    boolean getUsePics();

    /**
     * <code>optional string vanity_url = 14;</code>
     */
    boolean hasVanityUrl();
    /**
     * <code>optional string vanity_url = 14;</code>
     */
    java.lang.String getVanityUrl();
    /**
     * <code>optional string vanity_url = 14;</code>
     */
    com.google.protobuf.ByteString
        getVanityUrlBytes();

    /**
     * <code>optional fixed64 client_supplied_steamid = 20;</code>
     */
    boolean hasClientSuppliedSteamid();
    /**
     * <code>optional fixed64 client_supplied_steamid = 20;</code>
     */
    long getClientSuppliedSteamid();

    /**
     * <code>optional string ip_country_code = 21;</code>
     */
    boolean hasIpCountryCode();
    /**
     * <code>optional string ip_country_code = 21;</code>
     */
    java.lang.String getIpCountryCode();
    /**
     * <code>optional string ip_country_code = 21;</code>
     */
    com.google.protobuf.ByteString
        getIpCountryCodeBytes();

    /**
     * <code>optional bytes parental_settings = 22;</code>
     */
    boolean hasParentalSettings();
    /**
     * <code>optional bytes parental_settings = 22;</code>
     */
    com.google.protobuf.ByteString getParentalSettings();

    /**
     * <code>optional bytes parental_setting_signature = 23;</code>
     */
    boolean hasParentalSettingSignature();
    /**
     * <code>optional bytes parental_setting_signature = 23;</code>
     */
    com.google.protobuf.ByteString getParentalSettingSignature();

    /**
     * <code>optional int32 count_loginfailures_to_migrate = 24;</code>
     */
    boolean hasCountLoginfailuresToMigrate();
    /**
     * <code>optional int32 count_loginfailures_to_migrate = 24;</code>
     */
    int getCountLoginfailuresToMigrate();

    /**
     * <code>optional int32 count_disconnects_to_migrate = 25;</code>
     */
    boolean hasCountDisconnectsToMigrate();
    /**
     * <code>optional int32 count_disconnects_to_migrate = 25;</code>
     */
    int getCountDisconnectsToMigrate();

    /**
     * <code>optional int32 ogs_data_report_time_window = 26;</code>
     */
    boolean hasOgsDataReportTimeWindow();
    /**
     * <code>optional int32 ogs_data_report_time_window = 26;</code>
     */
    int getOgsDataReportTimeWindow();

    /**
     * <code>optional uint64 client_instance_id = 27;</code>
     */
    boolean hasClientInstanceId();
    /**
     * <code>optional uint64 client_instance_id = 27;</code>
     */
    long getClientInstanceId();

    /**
     * <code>optional bool force_client_update_check = 28;</code>
     */
    boolean hasForceClientUpdateCheck();
    /**
     * <code>optional bool force_client_update_check = 28;</code>
     */
    boolean getForceClientUpdateCheck();
  }
  /**
   * Protobuf type {@code CMsgClientLogonResponse}
   */
  public  static final class CMsgClientLogonResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CMsgClientLogonResponse)
      CMsgClientLogonResponseOrBuilder {
    // Use CMsgClientLogonResponse.newBuilder() to construct.
    private CMsgClientLogonResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CMsgClientLogonResponse() {
      eresult_ = 2;
      outOfGameHeartbeatSeconds_ = 0;
      inGameHeartbeatSeconds_ = 0;
      publicIp_ = 0;
      rtime32ServerTime_ = 0;
      accountFlags_ = 0;
      cellId_ = 0;
      emailDomain_ = "";
      steam2Ticket_ = com.google.protobuf.ByteString.EMPTY;
      eresultExtended_ = 0;
      webapiAuthenticateUserNonce_ = "";
      cellIdPingThreshold_ = 0;
      usePics_ = false;
      vanityUrl_ = "";
      clientSuppliedSteamid_ = 0L;
      ipCountryCode_ = "";
      parentalSettings_ = com.google.protobuf.ByteString.EMPTY;
      parentalSettingSignature_ = com.google.protobuf.ByteString.EMPTY;
      countLoginfailuresToMigrate_ = 0;
      countDisconnectsToMigrate_ = 0;
      ogsDataReportTimeWindow_ = 0;
      clientInstanceId_ = 0L;
      forceClientUpdateCheck_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CMsgClientLogonResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              eresult_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              outOfGameHeartbeatSeconds_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              inGameHeartbeatSeconds_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              publicIp_ = input.readUInt32();
              break;
            }
            case 45: {
              bitField0_ |= 0x00000010;
              rtime32ServerTime_ = input.readFixed32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              accountFlags_ = input.readUInt32();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              cellId_ = input.readUInt32();
              break;
            }
            case 66: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000080;
              emailDomain_ = bs;
              break;
            }
            case 74: {
              bitField0_ |= 0x00000100;
              steam2Ticket_ = input.readBytes();
              break;
            }
            case 80: {
              bitField0_ |= 0x00000200;
              eresultExtended_ = input.readInt32();
              break;
            }
            case 90: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000400;
              webapiAuthenticateUserNonce_ = bs;
              break;
            }
            case 96: {
              bitField0_ |= 0x00000800;
              cellIdPingThreshold_ = input.readUInt32();
              break;
            }
            case 104: {
              bitField0_ |= 0x00001000;
              usePics_ = input.readBool();
              break;
            }
            case 114: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00002000;
              vanityUrl_ = bs;
              break;
            }
            case 161: {
              bitField0_ |= 0x00004000;
              clientSuppliedSteamid_ = input.readFixed64();
              break;
            }
            case 170: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00008000;
              ipCountryCode_ = bs;
              break;
            }
            case 178: {
              bitField0_ |= 0x00010000;
              parentalSettings_ = input.readBytes();
              break;
            }
            case 186: {
              bitField0_ |= 0x00020000;
              parentalSettingSignature_ = input.readBytes();
              break;
            }
            case 192: {
              bitField0_ |= 0x00040000;
              countLoginfailuresToMigrate_ = input.readInt32();
              break;
            }
            case 200: {
              bitField0_ |= 0x00080000;
              countDisconnectsToMigrate_ = input.readInt32();
              break;
            }
            case 208: {
              bitField0_ |= 0x00100000;
              ogsDataReportTimeWindow_ = input.readInt32();
              break;
            }
            case 216: {
              bitField0_ |= 0x00200000;
              clientInstanceId_ = input.readUInt64();
              break;
            }
            case 224: {
              bitField0_ |= 0x00400000;
              forceClientUpdateCheck_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientLogonResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientLogonResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse.class, uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse.Builder.class);
    }

    private int bitField0_;
    public static final int ERESULT_FIELD_NUMBER = 1;
    private int eresult_;
    /**
     * <code>optional int32 eresult = 1 [default = 2];</code>
     */
    public boolean hasEresult() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 eresult = 1 [default = 2];</code>
     */
    public int getEresult() {
      return eresult_;
    }

    public static final int OUT_OF_GAME_HEARTBEAT_SECONDS_FIELD_NUMBER = 2;
    private int outOfGameHeartbeatSeconds_;
    /**
     * <code>optional int32 out_of_game_heartbeat_seconds = 2;</code>
     */
    public boolean hasOutOfGameHeartbeatSeconds() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 out_of_game_heartbeat_seconds = 2;</code>
     */
    public int getOutOfGameHeartbeatSeconds() {
      return outOfGameHeartbeatSeconds_;
    }

    public static final int IN_GAME_HEARTBEAT_SECONDS_FIELD_NUMBER = 3;
    private int inGameHeartbeatSeconds_;
    /**
     * <code>optional int32 in_game_heartbeat_seconds = 3;</code>
     */
    public boolean hasInGameHeartbeatSeconds() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 in_game_heartbeat_seconds = 3;</code>
     */
    public int getInGameHeartbeatSeconds() {
      return inGameHeartbeatSeconds_;
    }

    public static final int PUBLIC_IP_FIELD_NUMBER = 4;
    private int publicIp_;
    /**
     * <code>optional uint32 public_ip = 4;</code>
     */
    public boolean hasPublicIp() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional uint32 public_ip = 4;</code>
     */
    public int getPublicIp() {
      return publicIp_;
    }

    public static final int RTIME32_SERVER_TIME_FIELD_NUMBER = 5;
    private int rtime32ServerTime_;
    /**
     * <code>optional fixed32 rtime32_server_time = 5;</code>
     */
    public boolean hasRtime32ServerTime() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional fixed32 rtime32_server_time = 5;</code>
     */
    public int getRtime32ServerTime() {
      return rtime32ServerTime_;
    }

    public static final int ACCOUNT_FLAGS_FIELD_NUMBER = 6;
    private int accountFlags_;
    /**
     * <code>optional uint32 account_flags = 6;</code>
     */
    public boolean hasAccountFlags() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional uint32 account_flags = 6;</code>
     */
    public int getAccountFlags() {
      return accountFlags_;
    }

    public static final int CELL_ID_FIELD_NUMBER = 7;
    private int cellId_;
    /**
     * <code>optional uint32 cell_id = 7;</code>
     */
    public boolean hasCellId() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional uint32 cell_id = 7;</code>
     */
    public int getCellId() {
      return cellId_;
    }

    public static final int EMAIL_DOMAIN_FIELD_NUMBER = 8;
    private volatile java.lang.Object emailDomain_;
    /**
     * <code>optional string email_domain = 8;</code>
     */
    public boolean hasEmailDomain() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional string email_domain = 8;</code>
     */
    public java.lang.String getEmailDomain() {
      java.lang.Object ref = emailDomain_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          emailDomain_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string email_domain = 8;</code>
     */
    public com.google.protobuf.ByteString
        getEmailDomainBytes() {
      java.lang.Object ref = emailDomain_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        emailDomain_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STEAM2_TICKET_FIELD_NUMBER = 9;
    private com.google.protobuf.ByteString steam2Ticket_;
    /**
     * <code>optional bytes steam2_ticket = 9;</code>
     */
    public boolean hasSteam2Ticket() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional bytes steam2_ticket = 9;</code>
     */
    public com.google.protobuf.ByteString getSteam2Ticket() {
      return steam2Ticket_;
    }

    public static final int ERESULT_EXTENDED_FIELD_NUMBER = 10;
    private int eresultExtended_;
    /**
     * <code>optional int32 eresult_extended = 10;</code>
     */
    public boolean hasEresultExtended() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    /**
     * <code>optional int32 eresult_extended = 10;</code>
     */
    public int getEresultExtended() {
      return eresultExtended_;
    }

    public static final int WEBAPI_AUTHENTICATE_USER_NONCE_FIELD_NUMBER = 11;
    private volatile java.lang.Object webapiAuthenticateUserNonce_;
    /**
     * <code>optional string webapi_authenticate_user_nonce = 11;</code>
     */
    public boolean hasWebapiAuthenticateUserNonce() {
      return ((bitField0_ & 0x00000400) == 0x00000400);
    }
    /**
     * <code>optional string webapi_authenticate_user_nonce = 11;</code>
     */
    public java.lang.String getWebapiAuthenticateUserNonce() {
      java.lang.Object ref = webapiAuthenticateUserNonce_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          webapiAuthenticateUserNonce_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string webapi_authenticate_user_nonce = 11;</code>
     */
    public com.google.protobuf.ByteString
        getWebapiAuthenticateUserNonceBytes() {
      java.lang.Object ref = webapiAuthenticateUserNonce_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        webapiAuthenticateUserNonce_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CELL_ID_PING_THRESHOLD_FIELD_NUMBER = 12;
    private int cellIdPingThreshold_;
    /**
     * <code>optional uint32 cell_id_ping_threshold = 12;</code>
     */
    public boolean hasCellIdPingThreshold() {
      return ((bitField0_ & 0x00000800) == 0x00000800);
    }
    /**
     * <code>optional uint32 cell_id_ping_threshold = 12;</code>
     */
    public int getCellIdPingThreshold() {
      return cellIdPingThreshold_;
    }

    public static final int USE_PICS_FIELD_NUMBER = 13;
    private boolean usePics_;
    /**
     * <code>optional bool use_pics = 13;</code>
     */
    public boolean hasUsePics() {
      return ((bitField0_ & 0x00001000) == 0x00001000);
    }
    /**
     * <code>optional bool use_pics = 13;</code>
     */
    public boolean getUsePics() {
      return usePics_;
    }

    public static final int VANITY_URL_FIELD_NUMBER = 14;
    private volatile java.lang.Object vanityUrl_;
    /**
     * <code>optional string vanity_url = 14;</code>
     */
    public boolean hasVanityUrl() {
      return ((bitField0_ & 0x00002000) == 0x00002000);
    }
    /**
     * <code>optional string vanity_url = 14;</code>
     */
    public java.lang.String getVanityUrl() {
      java.lang.Object ref = vanityUrl_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          vanityUrl_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string vanity_url = 14;</code>
     */
    public com.google.protobuf.ByteString
        getVanityUrlBytes() {
      java.lang.Object ref = vanityUrl_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vanityUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CLIENT_SUPPLIED_STEAMID_FIELD_NUMBER = 20;
    private long clientSuppliedSteamid_;
    /**
     * <code>optional fixed64 client_supplied_steamid = 20;</code>
     */
    public boolean hasClientSuppliedSteamid() {
      return ((bitField0_ & 0x00004000) == 0x00004000);
    }
    /**
     * <code>optional fixed64 client_supplied_steamid = 20;</code>
     */
    public long getClientSuppliedSteamid() {
      return clientSuppliedSteamid_;
    }

    public static final int IP_COUNTRY_CODE_FIELD_NUMBER = 21;
    private volatile java.lang.Object ipCountryCode_;
    /**
     * <code>optional string ip_country_code = 21;</code>
     */
    public boolean hasIpCountryCode() {
      return ((bitField0_ & 0x00008000) == 0x00008000);
    }
    /**
     * <code>optional string ip_country_code = 21;</code>
     */
    public java.lang.String getIpCountryCode() {
      java.lang.Object ref = ipCountryCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          ipCountryCode_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string ip_country_code = 21;</code>
     */
    public com.google.protobuf.ByteString
        getIpCountryCodeBytes() {
      java.lang.Object ref = ipCountryCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ipCountryCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PARENTAL_SETTINGS_FIELD_NUMBER = 22;
    private com.google.protobuf.ByteString parentalSettings_;
    /**
     * <code>optional bytes parental_settings = 22;</code>
     */
    public boolean hasParentalSettings() {
      return ((bitField0_ & 0x00010000) == 0x00010000);
    }
    /**
     * <code>optional bytes parental_settings = 22;</code>
     */
    public com.google.protobuf.ByteString getParentalSettings() {
      return parentalSettings_;
    }

    public static final int PARENTAL_SETTING_SIGNATURE_FIELD_NUMBER = 23;
    private com.google.protobuf.ByteString parentalSettingSignature_;
    /**
     * <code>optional bytes parental_setting_signature = 23;</code>
     */
    public boolean hasParentalSettingSignature() {
      return ((bitField0_ & 0x00020000) == 0x00020000);
    }
    /**
     * <code>optional bytes parental_setting_signature = 23;</code>
     */
    public com.google.protobuf.ByteString getParentalSettingSignature() {
      return parentalSettingSignature_;
    }

    public static final int COUNT_LOGINFAILURES_TO_MIGRATE_FIELD_NUMBER = 24;
    private int countLoginfailuresToMigrate_;
    /**
     * <code>optional int32 count_loginfailures_to_migrate = 24;</code>
     */
    public boolean hasCountLoginfailuresToMigrate() {
      return ((bitField0_ & 0x00040000) == 0x00040000);
    }
    /**
     * <code>optional int32 count_loginfailures_to_migrate = 24;</code>
     */
    public int getCountLoginfailuresToMigrate() {
      return countLoginfailuresToMigrate_;
    }

    public static final int COUNT_DISCONNECTS_TO_MIGRATE_FIELD_NUMBER = 25;
    private int countDisconnectsToMigrate_;
    /**
     * <code>optional int32 count_disconnects_to_migrate = 25;</code>
     */
    public boolean hasCountDisconnectsToMigrate() {
      return ((bitField0_ & 0x00080000) == 0x00080000);
    }
    /**
     * <code>optional int32 count_disconnects_to_migrate = 25;</code>
     */
    public int getCountDisconnectsToMigrate() {
      return countDisconnectsToMigrate_;
    }

    public static final int OGS_DATA_REPORT_TIME_WINDOW_FIELD_NUMBER = 26;
    private int ogsDataReportTimeWindow_;
    /**
     * <code>optional int32 ogs_data_report_time_window = 26;</code>
     */
    public boolean hasOgsDataReportTimeWindow() {
      return ((bitField0_ & 0x00100000) == 0x00100000);
    }
    /**
     * <code>optional int32 ogs_data_report_time_window = 26;</code>
     */
    public int getOgsDataReportTimeWindow() {
      return ogsDataReportTimeWindow_;
    }

    public static final int CLIENT_INSTANCE_ID_FIELD_NUMBER = 27;
    private long clientInstanceId_;
    /**
     * <code>optional uint64 client_instance_id = 27;</code>
     */
    public boolean hasClientInstanceId() {
      return ((bitField0_ & 0x00200000) == 0x00200000);
    }
    /**
     * <code>optional uint64 client_instance_id = 27;</code>
     */
    public long getClientInstanceId() {
      return clientInstanceId_;
    }

    public static final int FORCE_CLIENT_UPDATE_CHECK_FIELD_NUMBER = 28;
    private boolean forceClientUpdateCheck_;
    /**
     * <code>optional bool force_client_update_check = 28;</code>
     */
    public boolean hasForceClientUpdateCheck() {
      return ((bitField0_ & 0x00400000) == 0x00400000);
    }
    /**
     * <code>optional bool force_client_update_check = 28;</code>
     */
    public boolean getForceClientUpdateCheck() {
      return forceClientUpdateCheck_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, eresult_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, outOfGameHeartbeatSeconds_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, inGameHeartbeatSeconds_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt32(4, publicIp_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeFixed32(5, rtime32ServerTime_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeUInt32(6, accountFlags_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeUInt32(7, cellId_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, emailDomain_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeBytes(9, steam2Ticket_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeInt32(10, eresultExtended_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 11, webapiAuthenticateUserNonce_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        output.writeUInt32(12, cellIdPingThreshold_);
      }
      if (((bitField0_ & 0x00001000) == 0x00001000)) {
        output.writeBool(13, usePics_);
      }
      if (((bitField0_ & 0x00002000) == 0x00002000)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 14, vanityUrl_);
      }
      if (((bitField0_ & 0x00004000) == 0x00004000)) {
        output.writeFixed64(20, clientSuppliedSteamid_);
      }
      if (((bitField0_ & 0x00008000) == 0x00008000)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 21, ipCountryCode_);
      }
      if (((bitField0_ & 0x00010000) == 0x00010000)) {
        output.writeBytes(22, parentalSettings_);
      }
      if (((bitField0_ & 0x00020000) == 0x00020000)) {
        output.writeBytes(23, parentalSettingSignature_);
      }
      if (((bitField0_ & 0x00040000) == 0x00040000)) {
        output.writeInt32(24, countLoginfailuresToMigrate_);
      }
      if (((bitField0_ & 0x00080000) == 0x00080000)) {
        output.writeInt32(25, countDisconnectsToMigrate_);
      }
      if (((bitField0_ & 0x00100000) == 0x00100000)) {
        output.writeInt32(26, ogsDataReportTimeWindow_);
      }
      if (((bitField0_ & 0x00200000) == 0x00200000)) {
        output.writeUInt64(27, clientInstanceId_);
      }
      if (((bitField0_ & 0x00400000) == 0x00400000)) {
        output.writeBool(28, forceClientUpdateCheck_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, eresult_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, outOfGameHeartbeatSeconds_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, inGameHeartbeatSeconds_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, publicIp_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(5, rtime32ServerTime_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, accountFlags_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, cellId_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, emailDomain_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(9, steam2Ticket_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, eresultExtended_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, webapiAuthenticateUserNonce_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, cellIdPingThreshold_);
      }
      if (((bitField0_ & 0x00001000) == 0x00001000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, usePics_);
      }
      if (((bitField0_ & 0x00002000) == 0x00002000)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(14, vanityUrl_);
      }
      if (((bitField0_ & 0x00004000) == 0x00004000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed64Size(20, clientSuppliedSteamid_);
      }
      if (((bitField0_ & 0x00008000) == 0x00008000)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(21, ipCountryCode_);
      }
      if (((bitField0_ & 0x00010000) == 0x00010000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(22, parentalSettings_);
      }
      if (((bitField0_ & 0x00020000) == 0x00020000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(23, parentalSettingSignature_);
      }
      if (((bitField0_ & 0x00040000) == 0x00040000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(24, countLoginfailuresToMigrate_);
      }
      if (((bitField0_ & 0x00080000) == 0x00080000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(25, countDisconnectsToMigrate_);
      }
      if (((bitField0_ & 0x00100000) == 0x00100000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(26, ogsDataReportTimeWindow_);
      }
      if (((bitField0_ & 0x00200000) == 0x00200000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(27, clientInstanceId_);
      }
      if (((bitField0_ & 0x00400000) == 0x00400000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(28, forceClientUpdateCheck_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse)) {
        return super.equals(obj);
      }
      uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse other = (uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse) obj;

      boolean result = true;
      result = result && (hasEresult() == other.hasEresult());
      if (hasEresult()) {
        result = result && (getEresult()
            == other.getEresult());
      }
      result = result && (hasOutOfGameHeartbeatSeconds() == other.hasOutOfGameHeartbeatSeconds());
      if (hasOutOfGameHeartbeatSeconds()) {
        result = result && (getOutOfGameHeartbeatSeconds()
            == other.getOutOfGameHeartbeatSeconds());
      }
      result = result && (hasInGameHeartbeatSeconds() == other.hasInGameHeartbeatSeconds());
      if (hasInGameHeartbeatSeconds()) {
        result = result && (getInGameHeartbeatSeconds()
            == other.getInGameHeartbeatSeconds());
      }
      result = result && (hasPublicIp() == other.hasPublicIp());
      if (hasPublicIp()) {
        result = result && (getPublicIp()
            == other.getPublicIp());
      }
      result = result && (hasRtime32ServerTime() == other.hasRtime32ServerTime());
      if (hasRtime32ServerTime()) {
        result = result && (getRtime32ServerTime()
            == other.getRtime32ServerTime());
      }
      result = result && (hasAccountFlags() == other.hasAccountFlags());
      if (hasAccountFlags()) {
        result = result && (getAccountFlags()
            == other.getAccountFlags());
      }
      result = result && (hasCellId() == other.hasCellId());
      if (hasCellId()) {
        result = result && (getCellId()
            == other.getCellId());
      }
      result = result && (hasEmailDomain() == other.hasEmailDomain());
      if (hasEmailDomain()) {
        result = result && getEmailDomain()
            .equals(other.getEmailDomain());
      }
      result = result && (hasSteam2Ticket() == other.hasSteam2Ticket());
      if (hasSteam2Ticket()) {
        result = result && getSteam2Ticket()
            .equals(other.getSteam2Ticket());
      }
      result = result && (hasEresultExtended() == other.hasEresultExtended());
      if (hasEresultExtended()) {
        result = result && (getEresultExtended()
            == other.getEresultExtended());
      }
      result = result && (hasWebapiAuthenticateUserNonce() == other.hasWebapiAuthenticateUserNonce());
      if (hasWebapiAuthenticateUserNonce()) {
        result = result && getWebapiAuthenticateUserNonce()
            .equals(other.getWebapiAuthenticateUserNonce());
      }
      result = result && (hasCellIdPingThreshold() == other.hasCellIdPingThreshold());
      if (hasCellIdPingThreshold()) {
        result = result && (getCellIdPingThreshold()
            == other.getCellIdPingThreshold());
      }
      result = result && (hasUsePics() == other.hasUsePics());
      if (hasUsePics()) {
        result = result && (getUsePics()
            == other.getUsePics());
      }
      result = result && (hasVanityUrl() == other.hasVanityUrl());
      if (hasVanityUrl()) {
        result = result && getVanityUrl()
            .equals(other.getVanityUrl());
      }
      result = result && (hasClientSuppliedSteamid() == other.hasClientSuppliedSteamid());
      if (hasClientSuppliedSteamid()) {
        result = result && (getClientSuppliedSteamid()
            == other.getClientSuppliedSteamid());
      }
      result = result && (hasIpCountryCode() == other.hasIpCountryCode());
      if (hasIpCountryCode()) {
        result = result && getIpCountryCode()
            .equals(other.getIpCountryCode());
      }
      result = result && (hasParentalSettings() == other.hasParentalSettings());
      if (hasParentalSettings()) {
        result = result && getParentalSettings()
            .equals(other.getParentalSettings());
      }
      result = result && (hasParentalSettingSignature() == other.hasParentalSettingSignature());
      if (hasParentalSettingSignature()) {
        result = result && getParentalSettingSignature()
            .equals(other.getParentalSettingSignature());
      }
      result = result && (hasCountLoginfailuresToMigrate() == other.hasCountLoginfailuresToMigrate());
      if (hasCountLoginfailuresToMigrate()) {
        result = result && (getCountLoginfailuresToMigrate()
            == other.getCountLoginfailuresToMigrate());
      }
      result = result && (hasCountDisconnectsToMigrate() == other.hasCountDisconnectsToMigrate());
      if (hasCountDisconnectsToMigrate()) {
        result = result && (getCountDisconnectsToMigrate()
            == other.getCountDisconnectsToMigrate());
      }
      result = result && (hasOgsDataReportTimeWindow() == other.hasOgsDataReportTimeWindow());
      if (hasOgsDataReportTimeWindow()) {
        result = result && (getOgsDataReportTimeWindow()
            == other.getOgsDataReportTimeWindow());
      }
      result = result && (hasClientInstanceId() == other.hasClientInstanceId());
      if (hasClientInstanceId()) {
        result = result && (getClientInstanceId()
            == other.getClientInstanceId());
      }
      result = result && (hasForceClientUpdateCheck() == other.hasForceClientUpdateCheck());
      if (hasForceClientUpdateCheck()) {
        result = result && (getForceClientUpdateCheck()
            == other.getForceClientUpdateCheck());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasEresult()) {
        hash = (37 * hash) + ERESULT_FIELD_NUMBER;
        hash = (53 * hash) + getEresult();
      }
      if (hasOutOfGameHeartbeatSeconds()) {
        hash = (37 * hash) + OUT_OF_GAME_HEARTBEAT_SECONDS_FIELD_NUMBER;
        hash = (53 * hash) + getOutOfGameHeartbeatSeconds();
      }
      if (hasInGameHeartbeatSeconds()) {
        hash = (37 * hash) + IN_GAME_HEARTBEAT_SECONDS_FIELD_NUMBER;
        hash = (53 * hash) + getInGameHeartbeatSeconds();
      }
      if (hasPublicIp()) {
        hash = (37 * hash) + PUBLIC_IP_FIELD_NUMBER;
        hash = (53 * hash) + getPublicIp();
      }
      if (hasRtime32ServerTime()) {
        hash = (37 * hash) + RTIME32_SERVER_TIME_FIELD_NUMBER;
        hash = (53 * hash) + getRtime32ServerTime();
      }
      if (hasAccountFlags()) {
        hash = (37 * hash) + ACCOUNT_FLAGS_FIELD_NUMBER;
        hash = (53 * hash) + getAccountFlags();
      }
      if (hasCellId()) {
        hash = (37 * hash) + CELL_ID_FIELD_NUMBER;
        hash = (53 * hash) + getCellId();
      }
      if (hasEmailDomain()) {
        hash = (37 * hash) + EMAIL_DOMAIN_FIELD_NUMBER;
        hash = (53 * hash) + getEmailDomain().hashCode();
      }
      if (hasSteam2Ticket()) {
        hash = (37 * hash) + STEAM2_TICKET_FIELD_NUMBER;
        hash = (53 * hash) + getSteam2Ticket().hashCode();
      }
      if (hasEresultExtended()) {
        hash = (37 * hash) + ERESULT_EXTENDED_FIELD_NUMBER;
        hash = (53 * hash) + getEresultExtended();
      }
      if (hasWebapiAuthenticateUserNonce()) {
        hash = (37 * hash) + WEBAPI_AUTHENTICATE_USER_NONCE_FIELD_NUMBER;
        hash = (53 * hash) + getWebapiAuthenticateUserNonce().hashCode();
      }
      if (hasCellIdPingThreshold()) {
        hash = (37 * hash) + CELL_ID_PING_THRESHOLD_FIELD_NUMBER;
        hash = (53 * hash) + getCellIdPingThreshold();
      }
      if (hasUsePics()) {
        hash = (37 * hash) + USE_PICS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getUsePics());
      }
      if (hasVanityUrl()) {
        hash = (37 * hash) + VANITY_URL_FIELD_NUMBER;
        hash = (53 * hash) + getVanityUrl().hashCode();
      }
      if (hasClientSuppliedSteamid()) {
        hash = (37 * hash) + CLIENT_SUPPLIED_STEAMID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getClientSuppliedSteamid());
      }
      if (hasIpCountryCode()) {
        hash = (37 * hash) + IP_COUNTRY_CODE_FIELD_NUMBER;
        hash = (53 * hash) + getIpCountryCode().hashCode();
      }
      if (hasParentalSettings()) {
        hash = (37 * hash) + PARENTAL_SETTINGS_FIELD_NUMBER;
        hash = (53 * hash) + getParentalSettings().hashCode();
      }
      if (hasParentalSettingSignature()) {
        hash = (37 * hash) + PARENTAL_SETTING_SIGNATURE_FIELD_NUMBER;
        hash = (53 * hash) + getParentalSettingSignature().hashCode();
      }
      if (hasCountLoginfailuresToMigrate()) {
        hash = (37 * hash) + COUNT_LOGINFAILURES_TO_MIGRATE_FIELD_NUMBER;
        hash = (53 * hash) + getCountLoginfailuresToMigrate();
      }
      if (hasCountDisconnectsToMigrate()) {
        hash = (37 * hash) + COUNT_DISCONNECTS_TO_MIGRATE_FIELD_NUMBER;
        hash = (53 * hash) + getCountDisconnectsToMigrate();
      }
      if (hasOgsDataReportTimeWindow()) {
        hash = (37 * hash) + OGS_DATA_REPORT_TIME_WINDOW_FIELD_NUMBER;
        hash = (53 * hash) + getOgsDataReportTimeWindow();
      }
      if (hasClientInstanceId()) {
        hash = (37 * hash) + CLIENT_INSTANCE_ID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getClientInstanceId());
      }
      if (hasForceClientUpdateCheck()) {
        hash = (37 * hash) + FORCE_CLIENT_UPDATE_CHECK_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getForceClientUpdateCheck());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code CMsgClientLogonResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CMsgClientLogonResponse)
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientLogonResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientLogonResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse.class, uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse.Builder.class);
      }

      // Construct using uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        eresult_ = 2;
        bitField0_ = (bitField0_ & ~0x00000001);
        outOfGameHeartbeatSeconds_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        inGameHeartbeatSeconds_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        publicIp_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        rtime32ServerTime_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        accountFlags_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        cellId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        emailDomain_ = "";
        bitField0_ = (bitField0_ & ~0x00000080);
        steam2Ticket_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000100);
        eresultExtended_ = 0;
        bitField0_ = (bitField0_ & ~0x00000200);
        webapiAuthenticateUserNonce_ = "";
        bitField0_ = (bitField0_ & ~0x00000400);
        cellIdPingThreshold_ = 0;
        bitField0_ = (bitField0_ & ~0x00000800);
        usePics_ = false;
        bitField0_ = (bitField0_ & ~0x00001000);
        vanityUrl_ = "";
        bitField0_ = (bitField0_ & ~0x00002000);
        clientSuppliedSteamid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00004000);
        ipCountryCode_ = "";
        bitField0_ = (bitField0_ & ~0x00008000);
        parentalSettings_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00010000);
        parentalSettingSignature_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00020000);
        countLoginfailuresToMigrate_ = 0;
        bitField0_ = (bitField0_ & ~0x00040000);
        countDisconnectsToMigrate_ = 0;
        bitField0_ = (bitField0_ & ~0x00080000);
        ogsDataReportTimeWindow_ = 0;
        bitField0_ = (bitField0_ & ~0x00100000);
        clientInstanceId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00200000);
        forceClientUpdateCheck_ = false;
        bitField0_ = (bitField0_ & ~0x00400000);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientLogonResponse_descriptor;
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse getDefaultInstanceForType() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse.getDefaultInstance();
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse build() {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse buildPartial() {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse result = new uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.eresult_ = eresult_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.outOfGameHeartbeatSeconds_ = outOfGameHeartbeatSeconds_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.inGameHeartbeatSeconds_ = inGameHeartbeatSeconds_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.publicIp_ = publicIp_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.rtime32ServerTime_ = rtime32ServerTime_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.accountFlags_ = accountFlags_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.cellId_ = cellId_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.emailDomain_ = emailDomain_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.steam2Ticket_ = steam2Ticket_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.eresultExtended_ = eresultExtended_;
        if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
          to_bitField0_ |= 0x00000400;
        }
        result.webapiAuthenticateUserNonce_ = webapiAuthenticateUserNonce_;
        if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
          to_bitField0_ |= 0x00000800;
        }
        result.cellIdPingThreshold_ = cellIdPingThreshold_;
        if (((from_bitField0_ & 0x00001000) == 0x00001000)) {
          to_bitField0_ |= 0x00001000;
        }
        result.usePics_ = usePics_;
        if (((from_bitField0_ & 0x00002000) == 0x00002000)) {
          to_bitField0_ |= 0x00002000;
        }
        result.vanityUrl_ = vanityUrl_;
        if (((from_bitField0_ & 0x00004000) == 0x00004000)) {
          to_bitField0_ |= 0x00004000;
        }
        result.clientSuppliedSteamid_ = clientSuppliedSteamid_;
        if (((from_bitField0_ & 0x00008000) == 0x00008000)) {
          to_bitField0_ |= 0x00008000;
        }
        result.ipCountryCode_ = ipCountryCode_;
        if (((from_bitField0_ & 0x00010000) == 0x00010000)) {
          to_bitField0_ |= 0x00010000;
        }
        result.parentalSettings_ = parentalSettings_;
        if (((from_bitField0_ & 0x00020000) == 0x00020000)) {
          to_bitField0_ |= 0x00020000;
        }
        result.parentalSettingSignature_ = parentalSettingSignature_;
        if (((from_bitField0_ & 0x00040000) == 0x00040000)) {
          to_bitField0_ |= 0x00040000;
        }
        result.countLoginfailuresToMigrate_ = countLoginfailuresToMigrate_;
        if (((from_bitField0_ & 0x00080000) == 0x00080000)) {
          to_bitField0_ |= 0x00080000;
        }
        result.countDisconnectsToMigrate_ = countDisconnectsToMigrate_;
        if (((from_bitField0_ & 0x00100000) == 0x00100000)) {
          to_bitField0_ |= 0x00100000;
        }
        result.ogsDataReportTimeWindow_ = ogsDataReportTimeWindow_;
        if (((from_bitField0_ & 0x00200000) == 0x00200000)) {
          to_bitField0_ |= 0x00200000;
        }
        result.clientInstanceId_ = clientInstanceId_;
        if (((from_bitField0_ & 0x00400000) == 0x00400000)) {
          to_bitField0_ |= 0x00400000;
        }
        result.forceClientUpdateCheck_ = forceClientUpdateCheck_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse) {
          return mergeFrom((uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse other) {
        if (other == uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse.getDefaultInstance()) return this;
        if (other.hasEresult()) {
          setEresult(other.getEresult());
        }
        if (other.hasOutOfGameHeartbeatSeconds()) {
          setOutOfGameHeartbeatSeconds(other.getOutOfGameHeartbeatSeconds());
        }
        if (other.hasInGameHeartbeatSeconds()) {
          setInGameHeartbeatSeconds(other.getInGameHeartbeatSeconds());
        }
        if (other.hasPublicIp()) {
          setPublicIp(other.getPublicIp());
        }
        if (other.hasRtime32ServerTime()) {
          setRtime32ServerTime(other.getRtime32ServerTime());
        }
        if (other.hasAccountFlags()) {
          setAccountFlags(other.getAccountFlags());
        }
        if (other.hasCellId()) {
          setCellId(other.getCellId());
        }
        if (other.hasEmailDomain()) {
          bitField0_ |= 0x00000080;
          emailDomain_ = other.emailDomain_;
          onChanged();
        }
        if (other.hasSteam2Ticket()) {
          setSteam2Ticket(other.getSteam2Ticket());
        }
        if (other.hasEresultExtended()) {
          setEresultExtended(other.getEresultExtended());
        }
        if (other.hasWebapiAuthenticateUserNonce()) {
          bitField0_ |= 0x00000400;
          webapiAuthenticateUserNonce_ = other.webapiAuthenticateUserNonce_;
          onChanged();
        }
        if (other.hasCellIdPingThreshold()) {
          setCellIdPingThreshold(other.getCellIdPingThreshold());
        }
        if (other.hasUsePics()) {
          setUsePics(other.getUsePics());
        }
        if (other.hasVanityUrl()) {
          bitField0_ |= 0x00002000;
          vanityUrl_ = other.vanityUrl_;
          onChanged();
        }
        if (other.hasClientSuppliedSteamid()) {
          setClientSuppliedSteamid(other.getClientSuppliedSteamid());
        }
        if (other.hasIpCountryCode()) {
          bitField0_ |= 0x00008000;
          ipCountryCode_ = other.ipCountryCode_;
          onChanged();
        }
        if (other.hasParentalSettings()) {
          setParentalSettings(other.getParentalSettings());
        }
        if (other.hasParentalSettingSignature()) {
          setParentalSettingSignature(other.getParentalSettingSignature());
        }
        if (other.hasCountLoginfailuresToMigrate()) {
          setCountLoginfailuresToMigrate(other.getCountLoginfailuresToMigrate());
        }
        if (other.hasCountDisconnectsToMigrate()) {
          setCountDisconnectsToMigrate(other.getCountDisconnectsToMigrate());
        }
        if (other.hasOgsDataReportTimeWindow()) {
          setOgsDataReportTimeWindow(other.getOgsDataReportTimeWindow());
        }
        if (other.hasClientInstanceId()) {
          setClientInstanceId(other.getClientInstanceId());
        }
        if (other.hasForceClientUpdateCheck()) {
          setForceClientUpdateCheck(other.getForceClientUpdateCheck());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int eresult_ = 2;
      /**
       * <code>optional int32 eresult = 1 [default = 2];</code>
       */
      public boolean hasEresult() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 eresult = 1 [default = 2];</code>
       */
      public int getEresult() {
        return eresult_;
      }
      /**
       * <code>optional int32 eresult = 1 [default = 2];</code>
       */
      public Builder setEresult(int value) {
        bitField0_ |= 0x00000001;
        eresult_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 eresult = 1 [default = 2];</code>
       */
      public Builder clearEresult() {
        bitField0_ = (bitField0_ & ~0x00000001);
        eresult_ = 2;
        onChanged();
        return this;
      }

      private int outOfGameHeartbeatSeconds_ ;
      /**
       * <code>optional int32 out_of_game_heartbeat_seconds = 2;</code>
       */
      public boolean hasOutOfGameHeartbeatSeconds() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 out_of_game_heartbeat_seconds = 2;</code>
       */
      public int getOutOfGameHeartbeatSeconds() {
        return outOfGameHeartbeatSeconds_;
      }
      /**
       * <code>optional int32 out_of_game_heartbeat_seconds = 2;</code>
       */
      public Builder setOutOfGameHeartbeatSeconds(int value) {
        bitField0_ |= 0x00000002;
        outOfGameHeartbeatSeconds_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 out_of_game_heartbeat_seconds = 2;</code>
       */
      public Builder clearOutOfGameHeartbeatSeconds() {
        bitField0_ = (bitField0_ & ~0x00000002);
        outOfGameHeartbeatSeconds_ = 0;
        onChanged();
        return this;
      }

      private int inGameHeartbeatSeconds_ ;
      /**
       * <code>optional int32 in_game_heartbeat_seconds = 3;</code>
       */
      public boolean hasInGameHeartbeatSeconds() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 in_game_heartbeat_seconds = 3;</code>
       */
      public int getInGameHeartbeatSeconds() {
        return inGameHeartbeatSeconds_;
      }
      /**
       * <code>optional int32 in_game_heartbeat_seconds = 3;</code>
       */
      public Builder setInGameHeartbeatSeconds(int value) {
        bitField0_ |= 0x00000004;
        inGameHeartbeatSeconds_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 in_game_heartbeat_seconds = 3;</code>
       */
      public Builder clearInGameHeartbeatSeconds() {
        bitField0_ = (bitField0_ & ~0x00000004);
        inGameHeartbeatSeconds_ = 0;
        onChanged();
        return this;
      }

      private int publicIp_ ;
      /**
       * <code>optional uint32 public_ip = 4;</code>
       */
      public boolean hasPublicIp() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional uint32 public_ip = 4;</code>
       */
      public int getPublicIp() {
        return publicIp_;
      }
      /**
       * <code>optional uint32 public_ip = 4;</code>
       */
      public Builder setPublicIp(int value) {
        bitField0_ |= 0x00000008;
        publicIp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 public_ip = 4;</code>
       */
      public Builder clearPublicIp() {
        bitField0_ = (bitField0_ & ~0x00000008);
        publicIp_ = 0;
        onChanged();
        return this;
      }

      private int rtime32ServerTime_ ;
      /**
       * <code>optional fixed32 rtime32_server_time = 5;</code>
       */
      public boolean hasRtime32ServerTime() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional fixed32 rtime32_server_time = 5;</code>
       */
      public int getRtime32ServerTime() {
        return rtime32ServerTime_;
      }
      /**
       * <code>optional fixed32 rtime32_server_time = 5;</code>
       */
      public Builder setRtime32ServerTime(int value) {
        bitField0_ |= 0x00000010;
        rtime32ServerTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional fixed32 rtime32_server_time = 5;</code>
       */
      public Builder clearRtime32ServerTime() {
        bitField0_ = (bitField0_ & ~0x00000010);
        rtime32ServerTime_ = 0;
        onChanged();
        return this;
      }

      private int accountFlags_ ;
      /**
       * <code>optional uint32 account_flags = 6;</code>
       */
      public boolean hasAccountFlags() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional uint32 account_flags = 6;</code>
       */
      public int getAccountFlags() {
        return accountFlags_;
      }
      /**
       * <code>optional uint32 account_flags = 6;</code>
       */
      public Builder setAccountFlags(int value) {
        bitField0_ |= 0x00000020;
        accountFlags_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 account_flags = 6;</code>
       */
      public Builder clearAccountFlags() {
        bitField0_ = (bitField0_ & ~0x00000020);
        accountFlags_ = 0;
        onChanged();
        return this;
      }

      private int cellId_ ;
      /**
       * <code>optional uint32 cell_id = 7;</code>
       */
      public boolean hasCellId() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional uint32 cell_id = 7;</code>
       */
      public int getCellId() {
        return cellId_;
      }
      /**
       * <code>optional uint32 cell_id = 7;</code>
       */
      public Builder setCellId(int value) {
        bitField0_ |= 0x00000040;
        cellId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 cell_id = 7;</code>
       */
      public Builder clearCellId() {
        bitField0_ = (bitField0_ & ~0x00000040);
        cellId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object emailDomain_ = "";
      /**
       * <code>optional string email_domain = 8;</code>
       */
      public boolean hasEmailDomain() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional string email_domain = 8;</code>
       */
      public java.lang.String getEmailDomain() {
        java.lang.Object ref = emailDomain_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            emailDomain_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string email_domain = 8;</code>
       */
      public com.google.protobuf.ByteString
          getEmailDomainBytes() {
        java.lang.Object ref = emailDomain_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          emailDomain_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string email_domain = 8;</code>
       */
      public Builder setEmailDomain(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        emailDomain_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string email_domain = 8;</code>
       */
      public Builder clearEmailDomain() {
        bitField0_ = (bitField0_ & ~0x00000080);
        emailDomain_ = getDefaultInstance().getEmailDomain();
        onChanged();
        return this;
      }
      /**
       * <code>optional string email_domain = 8;</code>
       */
      public Builder setEmailDomainBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        emailDomain_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString steam2Ticket_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes steam2_ticket = 9;</code>
       */
      public boolean hasSteam2Ticket() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>optional bytes steam2_ticket = 9;</code>
       */
      public com.google.protobuf.ByteString getSteam2Ticket() {
        return steam2Ticket_;
      }
      /**
       * <code>optional bytes steam2_ticket = 9;</code>
       */
      public Builder setSteam2Ticket(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        steam2Ticket_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes steam2_ticket = 9;</code>
       */
      public Builder clearSteam2Ticket() {
        bitField0_ = (bitField0_ & ~0x00000100);
        steam2Ticket_ = getDefaultInstance().getSteam2Ticket();
        onChanged();
        return this;
      }

      private int eresultExtended_ ;
      /**
       * <code>optional int32 eresult_extended = 10;</code>
       */
      public boolean hasEresultExtended() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      /**
       * <code>optional int32 eresult_extended = 10;</code>
       */
      public int getEresultExtended() {
        return eresultExtended_;
      }
      /**
       * <code>optional int32 eresult_extended = 10;</code>
       */
      public Builder setEresultExtended(int value) {
        bitField0_ |= 0x00000200;
        eresultExtended_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 eresult_extended = 10;</code>
       */
      public Builder clearEresultExtended() {
        bitField0_ = (bitField0_ & ~0x00000200);
        eresultExtended_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object webapiAuthenticateUserNonce_ = "";
      /**
       * <code>optional string webapi_authenticate_user_nonce = 11;</code>
       */
      public boolean hasWebapiAuthenticateUserNonce() {
        return ((bitField0_ & 0x00000400) == 0x00000400);
      }
      /**
       * <code>optional string webapi_authenticate_user_nonce = 11;</code>
       */
      public java.lang.String getWebapiAuthenticateUserNonce() {
        java.lang.Object ref = webapiAuthenticateUserNonce_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            webapiAuthenticateUserNonce_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string webapi_authenticate_user_nonce = 11;</code>
       */
      public com.google.protobuf.ByteString
          getWebapiAuthenticateUserNonceBytes() {
        java.lang.Object ref = webapiAuthenticateUserNonce_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          webapiAuthenticateUserNonce_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string webapi_authenticate_user_nonce = 11;</code>
       */
      public Builder setWebapiAuthenticateUserNonce(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000400;
        webapiAuthenticateUserNonce_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string webapi_authenticate_user_nonce = 11;</code>
       */
      public Builder clearWebapiAuthenticateUserNonce() {
        bitField0_ = (bitField0_ & ~0x00000400);
        webapiAuthenticateUserNonce_ = getDefaultInstance().getWebapiAuthenticateUserNonce();
        onChanged();
        return this;
      }
      /**
       * <code>optional string webapi_authenticate_user_nonce = 11;</code>
       */
      public Builder setWebapiAuthenticateUserNonceBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000400;
        webapiAuthenticateUserNonce_ = value;
        onChanged();
        return this;
      }

      private int cellIdPingThreshold_ ;
      /**
       * <code>optional uint32 cell_id_ping_threshold = 12;</code>
       */
      public boolean hasCellIdPingThreshold() {
        return ((bitField0_ & 0x00000800) == 0x00000800);
      }
      /**
       * <code>optional uint32 cell_id_ping_threshold = 12;</code>
       */
      public int getCellIdPingThreshold() {
        return cellIdPingThreshold_;
      }
      /**
       * <code>optional uint32 cell_id_ping_threshold = 12;</code>
       */
      public Builder setCellIdPingThreshold(int value) {
        bitField0_ |= 0x00000800;
        cellIdPingThreshold_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 cell_id_ping_threshold = 12;</code>
       */
      public Builder clearCellIdPingThreshold() {
        bitField0_ = (bitField0_ & ~0x00000800);
        cellIdPingThreshold_ = 0;
        onChanged();
        return this;
      }

      private boolean usePics_ ;
      /**
       * <code>optional bool use_pics = 13;</code>
       */
      public boolean hasUsePics() {
        return ((bitField0_ & 0x00001000) == 0x00001000);
      }
      /**
       * <code>optional bool use_pics = 13;</code>
       */
      public boolean getUsePics() {
        return usePics_;
      }
      /**
       * <code>optional bool use_pics = 13;</code>
       */
      public Builder setUsePics(boolean value) {
        bitField0_ |= 0x00001000;
        usePics_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool use_pics = 13;</code>
       */
      public Builder clearUsePics() {
        bitField0_ = (bitField0_ & ~0x00001000);
        usePics_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object vanityUrl_ = "";
      /**
       * <code>optional string vanity_url = 14;</code>
       */
      public boolean hasVanityUrl() {
        return ((bitField0_ & 0x00002000) == 0x00002000);
      }
      /**
       * <code>optional string vanity_url = 14;</code>
       */
      public java.lang.String getVanityUrl() {
        java.lang.Object ref = vanityUrl_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            vanityUrl_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string vanity_url = 14;</code>
       */
      public com.google.protobuf.ByteString
          getVanityUrlBytes() {
        java.lang.Object ref = vanityUrl_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          vanityUrl_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string vanity_url = 14;</code>
       */
      public Builder setVanityUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00002000;
        vanityUrl_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string vanity_url = 14;</code>
       */
      public Builder clearVanityUrl() {
        bitField0_ = (bitField0_ & ~0x00002000);
        vanityUrl_ = getDefaultInstance().getVanityUrl();
        onChanged();
        return this;
      }
      /**
       * <code>optional string vanity_url = 14;</code>
       */
      public Builder setVanityUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00002000;
        vanityUrl_ = value;
        onChanged();
        return this;
      }

      private long clientSuppliedSteamid_ ;
      /**
       * <code>optional fixed64 client_supplied_steamid = 20;</code>
       */
      public boolean hasClientSuppliedSteamid() {
        return ((bitField0_ & 0x00004000) == 0x00004000);
      }
      /**
       * <code>optional fixed64 client_supplied_steamid = 20;</code>
       */
      public long getClientSuppliedSteamid() {
        return clientSuppliedSteamid_;
      }
      /**
       * <code>optional fixed64 client_supplied_steamid = 20;</code>
       */
      public Builder setClientSuppliedSteamid(long value) {
        bitField0_ |= 0x00004000;
        clientSuppliedSteamid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional fixed64 client_supplied_steamid = 20;</code>
       */
      public Builder clearClientSuppliedSteamid() {
        bitField0_ = (bitField0_ & ~0x00004000);
        clientSuppliedSteamid_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object ipCountryCode_ = "";
      /**
       * <code>optional string ip_country_code = 21;</code>
       */
      public boolean hasIpCountryCode() {
        return ((bitField0_ & 0x00008000) == 0x00008000);
      }
      /**
       * <code>optional string ip_country_code = 21;</code>
       */
      public java.lang.String getIpCountryCode() {
        java.lang.Object ref = ipCountryCode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            ipCountryCode_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string ip_country_code = 21;</code>
       */
      public com.google.protobuf.ByteString
          getIpCountryCodeBytes() {
        java.lang.Object ref = ipCountryCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ipCountryCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string ip_country_code = 21;</code>
       */
      public Builder setIpCountryCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00008000;
        ipCountryCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string ip_country_code = 21;</code>
       */
      public Builder clearIpCountryCode() {
        bitField0_ = (bitField0_ & ~0x00008000);
        ipCountryCode_ = getDefaultInstance().getIpCountryCode();
        onChanged();
        return this;
      }
      /**
       * <code>optional string ip_country_code = 21;</code>
       */
      public Builder setIpCountryCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00008000;
        ipCountryCode_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString parentalSettings_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes parental_settings = 22;</code>
       */
      public boolean hasParentalSettings() {
        return ((bitField0_ & 0x00010000) == 0x00010000);
      }
      /**
       * <code>optional bytes parental_settings = 22;</code>
       */
      public com.google.protobuf.ByteString getParentalSettings() {
        return parentalSettings_;
      }
      /**
       * <code>optional bytes parental_settings = 22;</code>
       */
      public Builder setParentalSettings(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00010000;
        parentalSettings_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes parental_settings = 22;</code>
       */
      public Builder clearParentalSettings() {
        bitField0_ = (bitField0_ & ~0x00010000);
        parentalSettings_ = getDefaultInstance().getParentalSettings();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString parentalSettingSignature_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes parental_setting_signature = 23;</code>
       */
      public boolean hasParentalSettingSignature() {
        return ((bitField0_ & 0x00020000) == 0x00020000);
      }
      /**
       * <code>optional bytes parental_setting_signature = 23;</code>
       */
      public com.google.protobuf.ByteString getParentalSettingSignature() {
        return parentalSettingSignature_;
      }
      /**
       * <code>optional bytes parental_setting_signature = 23;</code>
       */
      public Builder setParentalSettingSignature(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00020000;
        parentalSettingSignature_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes parental_setting_signature = 23;</code>
       */
      public Builder clearParentalSettingSignature() {
        bitField0_ = (bitField0_ & ~0x00020000);
        parentalSettingSignature_ = getDefaultInstance().getParentalSettingSignature();
        onChanged();
        return this;
      }

      private int countLoginfailuresToMigrate_ ;
      /**
       * <code>optional int32 count_loginfailures_to_migrate = 24;</code>
       */
      public boolean hasCountLoginfailuresToMigrate() {
        return ((bitField0_ & 0x00040000) == 0x00040000);
      }
      /**
       * <code>optional int32 count_loginfailures_to_migrate = 24;</code>
       */
      public int getCountLoginfailuresToMigrate() {
        return countLoginfailuresToMigrate_;
      }
      /**
       * <code>optional int32 count_loginfailures_to_migrate = 24;</code>
       */
      public Builder setCountLoginfailuresToMigrate(int value) {
        bitField0_ |= 0x00040000;
        countLoginfailuresToMigrate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 count_loginfailures_to_migrate = 24;</code>
       */
      public Builder clearCountLoginfailuresToMigrate() {
        bitField0_ = (bitField0_ & ~0x00040000);
        countLoginfailuresToMigrate_ = 0;
        onChanged();
        return this;
      }

      private int countDisconnectsToMigrate_ ;
      /**
       * <code>optional int32 count_disconnects_to_migrate = 25;</code>
       */
      public boolean hasCountDisconnectsToMigrate() {
        return ((bitField0_ & 0x00080000) == 0x00080000);
      }
      /**
       * <code>optional int32 count_disconnects_to_migrate = 25;</code>
       */
      public int getCountDisconnectsToMigrate() {
        return countDisconnectsToMigrate_;
      }
      /**
       * <code>optional int32 count_disconnects_to_migrate = 25;</code>
       */
      public Builder setCountDisconnectsToMigrate(int value) {
        bitField0_ |= 0x00080000;
        countDisconnectsToMigrate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 count_disconnects_to_migrate = 25;</code>
       */
      public Builder clearCountDisconnectsToMigrate() {
        bitField0_ = (bitField0_ & ~0x00080000);
        countDisconnectsToMigrate_ = 0;
        onChanged();
        return this;
      }

      private int ogsDataReportTimeWindow_ ;
      /**
       * <code>optional int32 ogs_data_report_time_window = 26;</code>
       */
      public boolean hasOgsDataReportTimeWindow() {
        return ((bitField0_ & 0x00100000) == 0x00100000);
      }
      /**
       * <code>optional int32 ogs_data_report_time_window = 26;</code>
       */
      public int getOgsDataReportTimeWindow() {
        return ogsDataReportTimeWindow_;
      }
      /**
       * <code>optional int32 ogs_data_report_time_window = 26;</code>
       */
      public Builder setOgsDataReportTimeWindow(int value) {
        bitField0_ |= 0x00100000;
        ogsDataReportTimeWindow_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 ogs_data_report_time_window = 26;</code>
       */
      public Builder clearOgsDataReportTimeWindow() {
        bitField0_ = (bitField0_ & ~0x00100000);
        ogsDataReportTimeWindow_ = 0;
        onChanged();
        return this;
      }

      private long clientInstanceId_ ;
      /**
       * <code>optional uint64 client_instance_id = 27;</code>
       */
      public boolean hasClientInstanceId() {
        return ((bitField0_ & 0x00200000) == 0x00200000);
      }
      /**
       * <code>optional uint64 client_instance_id = 27;</code>
       */
      public long getClientInstanceId() {
        return clientInstanceId_;
      }
      /**
       * <code>optional uint64 client_instance_id = 27;</code>
       */
      public Builder setClientInstanceId(long value) {
        bitField0_ |= 0x00200000;
        clientInstanceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 client_instance_id = 27;</code>
       */
      public Builder clearClientInstanceId() {
        bitField0_ = (bitField0_ & ~0x00200000);
        clientInstanceId_ = 0L;
        onChanged();
        return this;
      }

      private boolean forceClientUpdateCheck_ ;
      /**
       * <code>optional bool force_client_update_check = 28;</code>
       */
      public boolean hasForceClientUpdateCheck() {
        return ((bitField0_ & 0x00400000) == 0x00400000);
      }
      /**
       * <code>optional bool force_client_update_check = 28;</code>
       */
      public boolean getForceClientUpdateCheck() {
        return forceClientUpdateCheck_;
      }
      /**
       * <code>optional bool force_client_update_check = 28;</code>
       */
      public Builder setForceClientUpdateCheck(boolean value) {
        bitField0_ |= 0x00400000;
        forceClientUpdateCheck_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool force_client_update_check = 28;</code>
       */
      public Builder clearForceClientUpdateCheck() {
        bitField0_ = (bitField0_ & ~0x00400000);
        forceClientUpdateCheck_ = false;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CMsgClientLogonResponse)
    }

    // @@protoc_insertion_point(class_scope:CMsgClientLogonResponse)
    private static final uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse();
    }

    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CMsgClientLogonResponse>
        PARSER = new com.google.protobuf.AbstractParser<CMsgClientLogonResponse>() {
      public CMsgClientLogonResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CMsgClientLogonResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CMsgClientLogonResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CMsgClientLogonResponse> getParserForType() {
      return PARSER;
    }

    public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CMsgClientRequestWebAPIAuthenticateUserNonceOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CMsgClientRequestWebAPIAuthenticateUserNonce)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 token_type = 1 [default = -1];</code>
     */
    boolean hasTokenType();
    /**
     * <code>optional int32 token_type = 1 [default = -1];</code>
     */
    int getTokenType();
  }
  /**
   * Protobuf type {@code CMsgClientRequestWebAPIAuthenticateUserNonce}
   */
  public  static final class CMsgClientRequestWebAPIAuthenticateUserNonce extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CMsgClientRequestWebAPIAuthenticateUserNonce)
      CMsgClientRequestWebAPIAuthenticateUserNonceOrBuilder {
    // Use CMsgClientRequestWebAPIAuthenticateUserNonce.newBuilder() to construct.
    private CMsgClientRequestWebAPIAuthenticateUserNonce(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CMsgClientRequestWebAPIAuthenticateUserNonce() {
      tokenType_ = -1;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CMsgClientRequestWebAPIAuthenticateUserNonce(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              tokenType_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientRequestWebAPIAuthenticateUserNonce_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientRequestWebAPIAuthenticateUserNonce_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce.class, uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce.Builder.class);
    }

    private int bitField0_;
    public static final int TOKEN_TYPE_FIELD_NUMBER = 1;
    private int tokenType_;
    /**
     * <code>optional int32 token_type = 1 [default = -1];</code>
     */
    public boolean hasTokenType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 token_type = 1 [default = -1];</code>
     */
    public int getTokenType() {
      return tokenType_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, tokenType_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, tokenType_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce)) {
        return super.equals(obj);
      }
      uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce other = (uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce) obj;

      boolean result = true;
      result = result && (hasTokenType() == other.hasTokenType());
      if (hasTokenType()) {
        result = result && (getTokenType()
            == other.getTokenType());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasTokenType()) {
        hash = (37 * hash) + TOKEN_TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getTokenType();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code CMsgClientRequestWebAPIAuthenticateUserNonce}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CMsgClientRequestWebAPIAuthenticateUserNonce)
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientRequestWebAPIAuthenticateUserNonce_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientRequestWebAPIAuthenticateUserNonce_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce.class, uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce.Builder.class);
      }

      // Construct using uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        tokenType_ = -1;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientRequestWebAPIAuthenticateUserNonce_descriptor;
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce getDefaultInstanceForType() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce.getDefaultInstance();
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce build() {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce buildPartial() {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce result = new uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.tokenType_ = tokenType_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce) {
          return mergeFrom((uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce other) {
        if (other == uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce.getDefaultInstance()) return this;
        if (other.hasTokenType()) {
          setTokenType(other.getTokenType());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int tokenType_ = -1;
      /**
       * <code>optional int32 token_type = 1 [default = -1];</code>
       */
      public boolean hasTokenType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 token_type = 1 [default = -1];</code>
       */
      public int getTokenType() {
        return tokenType_;
      }
      /**
       * <code>optional int32 token_type = 1 [default = -1];</code>
       */
      public Builder setTokenType(int value) {
        bitField0_ |= 0x00000001;
        tokenType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 token_type = 1 [default = -1];</code>
       */
      public Builder clearTokenType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        tokenType_ = -1;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CMsgClientRequestWebAPIAuthenticateUserNonce)
    }

    // @@protoc_insertion_point(class_scope:CMsgClientRequestWebAPIAuthenticateUserNonce)
    private static final uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce();
    }

    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CMsgClientRequestWebAPIAuthenticateUserNonce>
        PARSER = new com.google.protobuf.AbstractParser<CMsgClientRequestWebAPIAuthenticateUserNonce>() {
      public CMsgClientRequestWebAPIAuthenticateUserNonce parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CMsgClientRequestWebAPIAuthenticateUserNonce(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CMsgClientRequestWebAPIAuthenticateUserNonce> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CMsgClientRequestWebAPIAuthenticateUserNonce> getParserForType() {
      return PARSER;
    }

    public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CMsgClientRequestWebAPIAuthenticateUserNonceResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CMsgClientRequestWebAPIAuthenticateUserNonceResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 eresult = 1 [default = 2];</code>
     */
    boolean hasEresult();
    /**
     * <code>optional int32 eresult = 1 [default = 2];</code>
     */
    int getEresult();

    /**
     * <code>optional string webapi_authenticate_user_nonce = 11;</code>
     */
    boolean hasWebapiAuthenticateUserNonce();
    /**
     * <code>optional string webapi_authenticate_user_nonce = 11;</code>
     */
    java.lang.String getWebapiAuthenticateUserNonce();
    /**
     * <code>optional string webapi_authenticate_user_nonce = 11;</code>
     */
    com.google.protobuf.ByteString
        getWebapiAuthenticateUserNonceBytes();

    /**
     * <code>optional int32 token_type = 3 [default = -1];</code>
     */
    boolean hasTokenType();
    /**
     * <code>optional int32 token_type = 3 [default = -1];</code>
     */
    int getTokenType();
  }
  /**
   * Protobuf type {@code CMsgClientRequestWebAPIAuthenticateUserNonceResponse}
   */
  public  static final class CMsgClientRequestWebAPIAuthenticateUserNonceResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CMsgClientRequestWebAPIAuthenticateUserNonceResponse)
      CMsgClientRequestWebAPIAuthenticateUserNonceResponseOrBuilder {
    // Use CMsgClientRequestWebAPIAuthenticateUserNonceResponse.newBuilder() to construct.
    private CMsgClientRequestWebAPIAuthenticateUserNonceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CMsgClientRequestWebAPIAuthenticateUserNonceResponse() {
      eresult_ = 2;
      webapiAuthenticateUserNonce_ = "";
      tokenType_ = -1;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CMsgClientRequestWebAPIAuthenticateUserNonceResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              eresult_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              tokenType_ = input.readInt32();
              break;
            }
            case 90: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              webapiAuthenticateUserNonce_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientRequestWebAPIAuthenticateUserNonceResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientRequestWebAPIAuthenticateUserNonceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse.class, uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse.Builder.class);
    }

    private int bitField0_;
    public static final int ERESULT_FIELD_NUMBER = 1;
    private int eresult_;
    /**
     * <code>optional int32 eresult = 1 [default = 2];</code>
     */
    public boolean hasEresult() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 eresult = 1 [default = 2];</code>
     */
    public int getEresult() {
      return eresult_;
    }

    public static final int WEBAPI_AUTHENTICATE_USER_NONCE_FIELD_NUMBER = 11;
    private volatile java.lang.Object webapiAuthenticateUserNonce_;
    /**
     * <code>optional string webapi_authenticate_user_nonce = 11;</code>
     */
    public boolean hasWebapiAuthenticateUserNonce() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string webapi_authenticate_user_nonce = 11;</code>
     */
    public java.lang.String getWebapiAuthenticateUserNonce() {
      java.lang.Object ref = webapiAuthenticateUserNonce_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          webapiAuthenticateUserNonce_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string webapi_authenticate_user_nonce = 11;</code>
     */
    public com.google.protobuf.ByteString
        getWebapiAuthenticateUserNonceBytes() {
      java.lang.Object ref = webapiAuthenticateUserNonce_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        webapiAuthenticateUserNonce_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TOKEN_TYPE_FIELD_NUMBER = 3;
    private int tokenType_;
    /**
     * <code>optional int32 token_type = 3 [default = -1];</code>
     */
    public boolean hasTokenType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 token_type = 3 [default = -1];</code>
     */
    public int getTokenType() {
      return tokenType_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, eresult_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, tokenType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 11, webapiAuthenticateUserNonce_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, eresult_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, tokenType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, webapiAuthenticateUserNonce_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse)) {
        return super.equals(obj);
      }
      uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse other = (uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse) obj;

      boolean result = true;
      result = result && (hasEresult() == other.hasEresult());
      if (hasEresult()) {
        result = result && (getEresult()
            == other.getEresult());
      }
      result = result && (hasWebapiAuthenticateUserNonce() == other.hasWebapiAuthenticateUserNonce());
      if (hasWebapiAuthenticateUserNonce()) {
        result = result && getWebapiAuthenticateUserNonce()
            .equals(other.getWebapiAuthenticateUserNonce());
      }
      result = result && (hasTokenType() == other.hasTokenType());
      if (hasTokenType()) {
        result = result && (getTokenType()
            == other.getTokenType());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasEresult()) {
        hash = (37 * hash) + ERESULT_FIELD_NUMBER;
        hash = (53 * hash) + getEresult();
      }
      if (hasWebapiAuthenticateUserNonce()) {
        hash = (37 * hash) + WEBAPI_AUTHENTICATE_USER_NONCE_FIELD_NUMBER;
        hash = (53 * hash) + getWebapiAuthenticateUserNonce().hashCode();
      }
      if (hasTokenType()) {
        hash = (37 * hash) + TOKEN_TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getTokenType();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code CMsgClientRequestWebAPIAuthenticateUserNonceResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CMsgClientRequestWebAPIAuthenticateUserNonceResponse)
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientRequestWebAPIAuthenticateUserNonceResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientRequestWebAPIAuthenticateUserNonceResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse.class, uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse.Builder.class);
      }

      // Construct using uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        eresult_ = 2;
        bitField0_ = (bitField0_ & ~0x00000001);
        webapiAuthenticateUserNonce_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        tokenType_ = -1;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientRequestWebAPIAuthenticateUserNonceResponse_descriptor;
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse getDefaultInstanceForType() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse.getDefaultInstance();
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse build() {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse buildPartial() {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse result = new uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.eresult_ = eresult_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.webapiAuthenticateUserNonce_ = webapiAuthenticateUserNonce_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.tokenType_ = tokenType_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse) {
          return mergeFrom((uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse other) {
        if (other == uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse.getDefaultInstance()) return this;
        if (other.hasEresult()) {
          setEresult(other.getEresult());
        }
        if (other.hasWebapiAuthenticateUserNonce()) {
          bitField0_ |= 0x00000002;
          webapiAuthenticateUserNonce_ = other.webapiAuthenticateUserNonce_;
          onChanged();
        }
        if (other.hasTokenType()) {
          setTokenType(other.getTokenType());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int eresult_ = 2;
      /**
       * <code>optional int32 eresult = 1 [default = 2];</code>
       */
      public boolean hasEresult() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 eresult = 1 [default = 2];</code>
       */
      public int getEresult() {
        return eresult_;
      }
      /**
       * <code>optional int32 eresult = 1 [default = 2];</code>
       */
      public Builder setEresult(int value) {
        bitField0_ |= 0x00000001;
        eresult_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 eresult = 1 [default = 2];</code>
       */
      public Builder clearEresult() {
        bitField0_ = (bitField0_ & ~0x00000001);
        eresult_ = 2;
        onChanged();
        return this;
      }

      private java.lang.Object webapiAuthenticateUserNonce_ = "";
      /**
       * <code>optional string webapi_authenticate_user_nonce = 11;</code>
       */
      public boolean hasWebapiAuthenticateUserNonce() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string webapi_authenticate_user_nonce = 11;</code>
       */
      public java.lang.String getWebapiAuthenticateUserNonce() {
        java.lang.Object ref = webapiAuthenticateUserNonce_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            webapiAuthenticateUserNonce_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string webapi_authenticate_user_nonce = 11;</code>
       */
      public com.google.protobuf.ByteString
          getWebapiAuthenticateUserNonceBytes() {
        java.lang.Object ref = webapiAuthenticateUserNonce_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          webapiAuthenticateUserNonce_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string webapi_authenticate_user_nonce = 11;</code>
       */
      public Builder setWebapiAuthenticateUserNonce(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        webapiAuthenticateUserNonce_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string webapi_authenticate_user_nonce = 11;</code>
       */
      public Builder clearWebapiAuthenticateUserNonce() {
        bitField0_ = (bitField0_ & ~0x00000002);
        webapiAuthenticateUserNonce_ = getDefaultInstance().getWebapiAuthenticateUserNonce();
        onChanged();
        return this;
      }
      /**
       * <code>optional string webapi_authenticate_user_nonce = 11;</code>
       */
      public Builder setWebapiAuthenticateUserNonceBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        webapiAuthenticateUserNonce_ = value;
        onChanged();
        return this;
      }

      private int tokenType_ = -1;
      /**
       * <code>optional int32 token_type = 3 [default = -1];</code>
       */
      public boolean hasTokenType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 token_type = 3 [default = -1];</code>
       */
      public int getTokenType() {
        return tokenType_;
      }
      /**
       * <code>optional int32 token_type = 3 [default = -1];</code>
       */
      public Builder setTokenType(int value) {
        bitField0_ |= 0x00000004;
        tokenType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 token_type = 3 [default = -1];</code>
       */
      public Builder clearTokenType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        tokenType_ = -1;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CMsgClientRequestWebAPIAuthenticateUserNonceResponse)
    }

    // @@protoc_insertion_point(class_scope:CMsgClientRequestWebAPIAuthenticateUserNonceResponse)
    private static final uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse();
    }

    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CMsgClientRequestWebAPIAuthenticateUserNonceResponse>
        PARSER = new com.google.protobuf.AbstractParser<CMsgClientRequestWebAPIAuthenticateUserNonceResponse>() {
      public CMsgClientRequestWebAPIAuthenticateUserNonceResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CMsgClientRequestWebAPIAuthenticateUserNonceResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CMsgClientRequestWebAPIAuthenticateUserNonceResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CMsgClientRequestWebAPIAuthenticateUserNonceResponse> getParserForType() {
      return PARSER;
    }

    public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CMsgClientLogOffOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CMsgClientLogOff)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code CMsgClientLogOff}
   */
  public  static final class CMsgClientLogOff extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CMsgClientLogOff)
      CMsgClientLogOffOrBuilder {
    // Use CMsgClientLogOff.newBuilder() to construct.
    private CMsgClientLogOff(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CMsgClientLogOff() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CMsgClientLogOff(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientLogOff_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientLogOff_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff.class, uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff)) {
        return super.equals(obj);
      }
      uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff other = (uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff) obj;

      boolean result = true;
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code CMsgClientLogOff}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CMsgClientLogOff)
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOffOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientLogOff_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientLogOff_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff.class, uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff.Builder.class);
      }

      // Construct using uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientLogOff_descriptor;
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff getDefaultInstanceForType() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff.getDefaultInstance();
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff build() {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff buildPartial() {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff result = new uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff(this);
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff) {
          return mergeFrom((uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff other) {
        if (other == uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CMsgClientLogOff)
    }

    // @@protoc_insertion_point(class_scope:CMsgClientLogOff)
    private static final uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff();
    }

    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CMsgClientLogOff>
        PARSER = new com.google.protobuf.AbstractParser<CMsgClientLogOff>() {
      public CMsgClientLogOff parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CMsgClientLogOff(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CMsgClientLogOff> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CMsgClientLogOff> getParserForType() {
      return PARSER;
    }

    public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CMsgClientLoggedOffOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CMsgClientLoggedOff)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 eresult = 1 [default = 2];</code>
     */
    boolean hasEresult();
    /**
     * <code>optional int32 eresult = 1 [default = 2];</code>
     */
    int getEresult();
  }
  /**
   * Protobuf type {@code CMsgClientLoggedOff}
   */
  public  static final class CMsgClientLoggedOff extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CMsgClientLoggedOff)
      CMsgClientLoggedOffOrBuilder {
    // Use CMsgClientLoggedOff.newBuilder() to construct.
    private CMsgClientLoggedOff(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CMsgClientLoggedOff() {
      eresult_ = 2;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CMsgClientLoggedOff(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              eresult_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientLoggedOff_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientLoggedOff_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff.class, uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff.Builder.class);
    }

    private int bitField0_;
    public static final int ERESULT_FIELD_NUMBER = 1;
    private int eresult_;
    /**
     * <code>optional int32 eresult = 1 [default = 2];</code>
     */
    public boolean hasEresult() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 eresult = 1 [default = 2];</code>
     */
    public int getEresult() {
      return eresult_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, eresult_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, eresult_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff)) {
        return super.equals(obj);
      }
      uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff other = (uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff) obj;

      boolean result = true;
      result = result && (hasEresult() == other.hasEresult());
      if (hasEresult()) {
        result = result && (getEresult()
            == other.getEresult());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasEresult()) {
        hash = (37 * hash) + ERESULT_FIELD_NUMBER;
        hash = (53 * hash) + getEresult();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code CMsgClientLoggedOff}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CMsgClientLoggedOff)
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOffOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientLoggedOff_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientLoggedOff_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff.class, uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff.Builder.class);
      }

      // Construct using uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        eresult_ = 2;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientLoggedOff_descriptor;
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff getDefaultInstanceForType() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff.getDefaultInstance();
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff build() {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff buildPartial() {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff result = new uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.eresult_ = eresult_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff) {
          return mergeFrom((uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff other) {
        if (other == uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff.getDefaultInstance()) return this;
        if (other.hasEresult()) {
          setEresult(other.getEresult());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int eresult_ = 2;
      /**
       * <code>optional int32 eresult = 1 [default = 2];</code>
       */
      public boolean hasEresult() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 eresult = 1 [default = 2];</code>
       */
      public int getEresult() {
        return eresult_;
      }
      /**
       * <code>optional int32 eresult = 1 [default = 2];</code>
       */
      public Builder setEresult(int value) {
        bitField0_ |= 0x00000001;
        eresult_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 eresult = 1 [default = 2];</code>
       */
      public Builder clearEresult() {
        bitField0_ = (bitField0_ & ~0x00000001);
        eresult_ = 2;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CMsgClientLoggedOff)
    }

    // @@protoc_insertion_point(class_scope:CMsgClientLoggedOff)
    private static final uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff();
    }

    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CMsgClientLoggedOff>
        PARSER = new com.google.protobuf.AbstractParser<CMsgClientLoggedOff>() {
      public CMsgClientLoggedOff parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CMsgClientLoggedOff(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CMsgClientLoggedOff> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CMsgClientLoggedOff> getParserForType() {
      return PARSER;
    }

    public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLoggedOff getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CMsgClientNewLoginKeyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CMsgClientNewLoginKey)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint32 unique_id = 1;</code>
     */
    boolean hasUniqueId();
    /**
     * <code>optional uint32 unique_id = 1;</code>
     */
    int getUniqueId();

    /**
     * <code>optional string login_key = 2;</code>
     */
    boolean hasLoginKey();
    /**
     * <code>optional string login_key = 2;</code>
     */
    java.lang.String getLoginKey();
    /**
     * <code>optional string login_key = 2;</code>
     */
    com.google.protobuf.ByteString
        getLoginKeyBytes();
  }
  /**
   * Protobuf type {@code CMsgClientNewLoginKey}
   */
  public  static final class CMsgClientNewLoginKey extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CMsgClientNewLoginKey)
      CMsgClientNewLoginKeyOrBuilder {
    // Use CMsgClientNewLoginKey.newBuilder() to construct.
    private CMsgClientNewLoginKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CMsgClientNewLoginKey() {
      uniqueId_ = 0;
      loginKey_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CMsgClientNewLoginKey(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              uniqueId_ = input.readUInt32();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              loginKey_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientNewLoginKey_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientNewLoginKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey.class, uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey.Builder.class);
    }

    private int bitField0_;
    public static final int UNIQUE_ID_FIELD_NUMBER = 1;
    private int uniqueId_;
    /**
     * <code>optional uint32 unique_id = 1;</code>
     */
    public boolean hasUniqueId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint32 unique_id = 1;</code>
     */
    public int getUniqueId() {
      return uniqueId_;
    }

    public static final int LOGIN_KEY_FIELD_NUMBER = 2;
    private volatile java.lang.Object loginKey_;
    /**
     * <code>optional string login_key = 2;</code>
     */
    public boolean hasLoginKey() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string login_key = 2;</code>
     */
    public java.lang.String getLoginKey() {
      java.lang.Object ref = loginKey_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          loginKey_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string login_key = 2;</code>
     */
    public com.google.protobuf.ByteString
        getLoginKeyBytes() {
      java.lang.Object ref = loginKey_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        loginKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt32(1, uniqueId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, loginKey_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, uniqueId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, loginKey_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey)) {
        return super.equals(obj);
      }
      uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey other = (uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey) obj;

      boolean result = true;
      result = result && (hasUniqueId() == other.hasUniqueId());
      if (hasUniqueId()) {
        result = result && (getUniqueId()
            == other.getUniqueId());
      }
      result = result && (hasLoginKey() == other.hasLoginKey());
      if (hasLoginKey()) {
        result = result && getLoginKey()
            .equals(other.getLoginKey());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasUniqueId()) {
        hash = (37 * hash) + UNIQUE_ID_FIELD_NUMBER;
        hash = (53 * hash) + getUniqueId();
      }
      if (hasLoginKey()) {
        hash = (37 * hash) + LOGIN_KEY_FIELD_NUMBER;
        hash = (53 * hash) + getLoginKey().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code CMsgClientNewLoginKey}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CMsgClientNewLoginKey)
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientNewLoginKey_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientNewLoginKey_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey.class, uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey.Builder.class);
      }

      // Construct using uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        uniqueId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        loginKey_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientNewLoginKey_descriptor;
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey getDefaultInstanceForType() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey.getDefaultInstance();
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey build() {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey buildPartial() {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey result = new uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.uniqueId_ = uniqueId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.loginKey_ = loginKey_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey) {
          return mergeFrom((uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey other) {
        if (other == uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey.getDefaultInstance()) return this;
        if (other.hasUniqueId()) {
          setUniqueId(other.getUniqueId());
        }
        if (other.hasLoginKey()) {
          bitField0_ |= 0x00000002;
          loginKey_ = other.loginKey_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int uniqueId_ ;
      /**
       * <code>optional uint32 unique_id = 1;</code>
       */
      public boolean hasUniqueId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional uint32 unique_id = 1;</code>
       */
      public int getUniqueId() {
        return uniqueId_;
      }
      /**
       * <code>optional uint32 unique_id = 1;</code>
       */
      public Builder setUniqueId(int value) {
        bitField0_ |= 0x00000001;
        uniqueId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 unique_id = 1;</code>
       */
      public Builder clearUniqueId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        uniqueId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object loginKey_ = "";
      /**
       * <code>optional string login_key = 2;</code>
       */
      public boolean hasLoginKey() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string login_key = 2;</code>
       */
      public java.lang.String getLoginKey() {
        java.lang.Object ref = loginKey_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            loginKey_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string login_key = 2;</code>
       */
      public com.google.protobuf.ByteString
          getLoginKeyBytes() {
        java.lang.Object ref = loginKey_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          loginKey_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string login_key = 2;</code>
       */
      public Builder setLoginKey(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        loginKey_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string login_key = 2;</code>
       */
      public Builder clearLoginKey() {
        bitField0_ = (bitField0_ & ~0x00000002);
        loginKey_ = getDefaultInstance().getLoginKey();
        onChanged();
        return this;
      }
      /**
       * <code>optional string login_key = 2;</code>
       */
      public Builder setLoginKeyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        loginKey_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CMsgClientNewLoginKey)
    }

    // @@protoc_insertion_point(class_scope:CMsgClientNewLoginKey)
    private static final uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey();
    }

    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CMsgClientNewLoginKey>
        PARSER = new com.google.protobuf.AbstractParser<CMsgClientNewLoginKey>() {
      public CMsgClientNewLoginKey parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CMsgClientNewLoginKey(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CMsgClientNewLoginKey> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CMsgClientNewLoginKey> getParserForType() {
      return PARSER;
    }

    public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKey getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CMsgClientNewLoginKeyAcceptedOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CMsgClientNewLoginKeyAccepted)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint32 unique_id = 1;</code>
     */
    boolean hasUniqueId();
    /**
     * <code>optional uint32 unique_id = 1;</code>
     */
    int getUniqueId();
  }
  /**
   * Protobuf type {@code CMsgClientNewLoginKeyAccepted}
   */
  public  static final class CMsgClientNewLoginKeyAccepted extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CMsgClientNewLoginKeyAccepted)
      CMsgClientNewLoginKeyAcceptedOrBuilder {
    // Use CMsgClientNewLoginKeyAccepted.newBuilder() to construct.
    private CMsgClientNewLoginKeyAccepted(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CMsgClientNewLoginKeyAccepted() {
      uniqueId_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CMsgClientNewLoginKeyAccepted(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              uniqueId_ = input.readUInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientNewLoginKeyAccepted_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientNewLoginKeyAccepted_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted.class, uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted.Builder.class);
    }

    private int bitField0_;
    public static final int UNIQUE_ID_FIELD_NUMBER = 1;
    private int uniqueId_;
    /**
     * <code>optional uint32 unique_id = 1;</code>
     */
    public boolean hasUniqueId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint32 unique_id = 1;</code>
     */
    public int getUniqueId() {
      return uniqueId_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt32(1, uniqueId_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, uniqueId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted)) {
        return super.equals(obj);
      }
      uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted other = (uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted) obj;

      boolean result = true;
      result = result && (hasUniqueId() == other.hasUniqueId());
      if (hasUniqueId()) {
        result = result && (getUniqueId()
            == other.getUniqueId());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasUniqueId()) {
        hash = (37 * hash) + UNIQUE_ID_FIELD_NUMBER;
        hash = (53 * hash) + getUniqueId();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code CMsgClientNewLoginKeyAccepted}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CMsgClientNewLoginKeyAccepted)
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAcceptedOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientNewLoginKeyAccepted_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientNewLoginKeyAccepted_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted.class, uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted.Builder.class);
      }

      // Construct using uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        uniqueId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientNewLoginKeyAccepted_descriptor;
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted getDefaultInstanceForType() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted.getDefaultInstance();
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted build() {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted buildPartial() {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted result = new uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.uniqueId_ = uniqueId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted) {
          return mergeFrom((uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted other) {
        if (other == uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted.getDefaultInstance()) return this;
        if (other.hasUniqueId()) {
          setUniqueId(other.getUniqueId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int uniqueId_ ;
      /**
       * <code>optional uint32 unique_id = 1;</code>
       */
      public boolean hasUniqueId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional uint32 unique_id = 1;</code>
       */
      public int getUniqueId() {
        return uniqueId_;
      }
      /**
       * <code>optional uint32 unique_id = 1;</code>
       */
      public Builder setUniqueId(int value) {
        bitField0_ |= 0x00000001;
        uniqueId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 unique_id = 1;</code>
       */
      public Builder clearUniqueId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        uniqueId_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CMsgClientNewLoginKeyAccepted)
    }

    // @@protoc_insertion_point(class_scope:CMsgClientNewLoginKeyAccepted)
    private static final uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted();
    }

    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CMsgClientNewLoginKeyAccepted>
        PARSER = new com.google.protobuf.AbstractParser<CMsgClientNewLoginKeyAccepted>() {
      public CMsgClientNewLoginKeyAccepted parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CMsgClientNewLoginKeyAccepted(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CMsgClientNewLoginKeyAccepted> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CMsgClientNewLoginKeyAccepted> getParserForType() {
      return PARSER;
    }

    public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CMsgClientAccountInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CMsgClientAccountInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string persona_name = 1;</code>
     */
    boolean hasPersonaName();
    /**
     * <code>optional string persona_name = 1;</code>
     */
    java.lang.String getPersonaName();
    /**
     * <code>optional string persona_name = 1;</code>
     */
    com.google.protobuf.ByteString
        getPersonaNameBytes();

    /**
     * <code>optional string ip_country = 2;</code>
     */
    boolean hasIpCountry();
    /**
     * <code>optional string ip_country = 2;</code>
     */
    java.lang.String getIpCountry();
    /**
     * <code>optional string ip_country = 2;</code>
     */
    com.google.protobuf.ByteString
        getIpCountryBytes();

    /**
     * <code>optional int32 count_authed_computers = 5;</code>
     */
    boolean hasCountAuthedComputers();
    /**
     * <code>optional int32 count_authed_computers = 5;</code>
     */
    int getCountAuthedComputers();

    /**
     * <code>optional uint32 account_flags = 7;</code>
     */
    boolean hasAccountFlags();
    /**
     * <code>optional uint32 account_flags = 7;</code>
     */
    int getAccountFlags();

    /**
     * <code>optional uint64 facebook_id = 8;</code>
     */
    boolean hasFacebookId();
    /**
     * <code>optional uint64 facebook_id = 8;</code>
     */
    long getFacebookId();

    /**
     * <code>optional string facebook_name = 9;</code>
     */
    boolean hasFacebookName();
    /**
     * <code>optional string facebook_name = 9;</code>
     */
    java.lang.String getFacebookName();
    /**
     * <code>optional string facebook_name = 9;</code>
     */
    com.google.protobuf.ByteString
        getFacebookNameBytes();

    /**
     * <code>optional bool steamguard_notify_newmachines = 14;</code>
     */
    boolean hasSteamguardNotifyNewmachines();
    /**
     * <code>optional bool steamguard_notify_newmachines = 14;</code>
     */
    boolean getSteamguardNotifyNewmachines();

    /**
     * <code>optional string steamguard_machine_name_user_chosen = 15;</code>
     */
    boolean hasSteamguardMachineNameUserChosen();
    /**
     * <code>optional string steamguard_machine_name_user_chosen = 15;</code>
     */
    java.lang.String getSteamguardMachineNameUserChosen();
    /**
     * <code>optional string steamguard_machine_name_user_chosen = 15;</code>
     */
    com.google.protobuf.ByteString
        getSteamguardMachineNameUserChosenBytes();

    /**
     * <code>optional bool is_phone_verified = 16;</code>
     */
    boolean hasIsPhoneVerified();
    /**
     * <code>optional bool is_phone_verified = 16;</code>
     */
    boolean getIsPhoneVerified();

    /**
     * <code>optional uint32 two_factor_state = 17;</code>
     */
    boolean hasTwoFactorState();
    /**
     * <code>optional uint32 two_factor_state = 17;</code>
     */
    int getTwoFactorState();

    /**
     * <code>optional bool is_phone_identifying = 18;</code>
     */
    boolean hasIsPhoneIdentifying();
    /**
     * <code>optional bool is_phone_identifying = 18;</code>
     */
    boolean getIsPhoneIdentifying();

    /**
     * <code>optional bool is_phone_needing_reverify = 19;</code>
     */
    boolean hasIsPhoneNeedingReverify();
    /**
     * <code>optional bool is_phone_needing_reverify = 19;</code>
     */
    boolean getIsPhoneNeedingReverify();
  }
  /**
   * Protobuf type {@code CMsgClientAccountInfo}
   */
  public  static final class CMsgClientAccountInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CMsgClientAccountInfo)
      CMsgClientAccountInfoOrBuilder {
    // Use CMsgClientAccountInfo.newBuilder() to construct.
    private CMsgClientAccountInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CMsgClientAccountInfo() {
      personaName_ = "";
      ipCountry_ = "";
      countAuthedComputers_ = 0;
      accountFlags_ = 0;
      facebookId_ = 0L;
      facebookName_ = "";
      steamguardNotifyNewmachines_ = false;
      steamguardMachineNameUserChosen_ = "";
      isPhoneVerified_ = false;
      twoFactorState_ = 0;
      isPhoneIdentifying_ = false;
      isPhoneNeedingReverify_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CMsgClientAccountInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              personaName_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              ipCountry_ = bs;
              break;
            }
            case 40: {
              bitField0_ |= 0x00000004;
              countAuthedComputers_ = input.readInt32();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000008;
              accountFlags_ = input.readUInt32();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000010;
              facebookId_ = input.readUInt64();
              break;
            }
            case 74: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000020;
              facebookName_ = bs;
              break;
            }
            case 112: {
              bitField0_ |= 0x00000040;
              steamguardNotifyNewmachines_ = input.readBool();
              break;
            }
            case 122: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000080;
              steamguardMachineNameUserChosen_ = bs;
              break;
            }
            case 128: {
              bitField0_ |= 0x00000100;
              isPhoneVerified_ = input.readBool();
              break;
            }
            case 136: {
              bitField0_ |= 0x00000200;
              twoFactorState_ = input.readUInt32();
              break;
            }
            case 144: {
              bitField0_ |= 0x00000400;
              isPhoneIdentifying_ = input.readBool();
              break;
            }
            case 152: {
              bitField0_ |= 0x00000800;
              isPhoneNeedingReverify_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientAccountInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientAccountInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo.class, uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo.Builder.class);
    }

    private int bitField0_;
    public static final int PERSONA_NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object personaName_;
    /**
     * <code>optional string persona_name = 1;</code>
     */
    public boolean hasPersonaName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string persona_name = 1;</code>
     */
    public java.lang.String getPersonaName() {
      java.lang.Object ref = personaName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          personaName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string persona_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPersonaNameBytes() {
      java.lang.Object ref = personaName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        personaName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IP_COUNTRY_FIELD_NUMBER = 2;
    private volatile java.lang.Object ipCountry_;
    /**
     * <code>optional string ip_country = 2;</code>
     */
    public boolean hasIpCountry() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string ip_country = 2;</code>
     */
    public java.lang.String getIpCountry() {
      java.lang.Object ref = ipCountry_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          ipCountry_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string ip_country = 2;</code>
     */
    public com.google.protobuf.ByteString
        getIpCountryBytes() {
      java.lang.Object ref = ipCountry_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ipCountry_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int COUNT_AUTHED_COMPUTERS_FIELD_NUMBER = 5;
    private int countAuthedComputers_;
    /**
     * <code>optional int32 count_authed_computers = 5;</code>
     */
    public boolean hasCountAuthedComputers() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 count_authed_computers = 5;</code>
     */
    public int getCountAuthedComputers() {
      return countAuthedComputers_;
    }

    public static final int ACCOUNT_FLAGS_FIELD_NUMBER = 7;
    private int accountFlags_;
    /**
     * <code>optional uint32 account_flags = 7;</code>
     */
    public boolean hasAccountFlags() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional uint32 account_flags = 7;</code>
     */
    public int getAccountFlags() {
      return accountFlags_;
    }

    public static final int FACEBOOK_ID_FIELD_NUMBER = 8;
    private long facebookId_;
    /**
     * <code>optional uint64 facebook_id = 8;</code>
     */
    public boolean hasFacebookId() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional uint64 facebook_id = 8;</code>
     */
    public long getFacebookId() {
      return facebookId_;
    }

    public static final int FACEBOOK_NAME_FIELD_NUMBER = 9;
    private volatile java.lang.Object facebookName_;
    /**
     * <code>optional string facebook_name = 9;</code>
     */
    public boolean hasFacebookName() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional string facebook_name = 9;</code>
     */
    public java.lang.String getFacebookName() {
      java.lang.Object ref = facebookName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          facebookName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string facebook_name = 9;</code>
     */
    public com.google.protobuf.ByteString
        getFacebookNameBytes() {
      java.lang.Object ref = facebookName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        facebookName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STEAMGUARD_NOTIFY_NEWMACHINES_FIELD_NUMBER = 14;
    private boolean steamguardNotifyNewmachines_;
    /**
     * <code>optional bool steamguard_notify_newmachines = 14;</code>
     */
    public boolean hasSteamguardNotifyNewmachines() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional bool steamguard_notify_newmachines = 14;</code>
     */
    public boolean getSteamguardNotifyNewmachines() {
      return steamguardNotifyNewmachines_;
    }

    public static final int STEAMGUARD_MACHINE_NAME_USER_CHOSEN_FIELD_NUMBER = 15;
    private volatile java.lang.Object steamguardMachineNameUserChosen_;
    /**
     * <code>optional string steamguard_machine_name_user_chosen = 15;</code>
     */
    public boolean hasSteamguardMachineNameUserChosen() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional string steamguard_machine_name_user_chosen = 15;</code>
     */
    public java.lang.String getSteamguardMachineNameUserChosen() {
      java.lang.Object ref = steamguardMachineNameUserChosen_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          steamguardMachineNameUserChosen_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string steamguard_machine_name_user_chosen = 15;</code>
     */
    public com.google.protobuf.ByteString
        getSteamguardMachineNameUserChosenBytes() {
      java.lang.Object ref = steamguardMachineNameUserChosen_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        steamguardMachineNameUserChosen_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IS_PHONE_VERIFIED_FIELD_NUMBER = 16;
    private boolean isPhoneVerified_;
    /**
     * <code>optional bool is_phone_verified = 16;</code>
     */
    public boolean hasIsPhoneVerified() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional bool is_phone_verified = 16;</code>
     */
    public boolean getIsPhoneVerified() {
      return isPhoneVerified_;
    }

    public static final int TWO_FACTOR_STATE_FIELD_NUMBER = 17;
    private int twoFactorState_;
    /**
     * <code>optional uint32 two_factor_state = 17;</code>
     */
    public boolean hasTwoFactorState() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    /**
     * <code>optional uint32 two_factor_state = 17;</code>
     */
    public int getTwoFactorState() {
      return twoFactorState_;
    }

    public static final int IS_PHONE_IDENTIFYING_FIELD_NUMBER = 18;
    private boolean isPhoneIdentifying_;
    /**
     * <code>optional bool is_phone_identifying = 18;</code>
     */
    public boolean hasIsPhoneIdentifying() {
      return ((bitField0_ & 0x00000400) == 0x00000400);
    }
    /**
     * <code>optional bool is_phone_identifying = 18;</code>
     */
    public boolean getIsPhoneIdentifying() {
      return isPhoneIdentifying_;
    }

    public static final int IS_PHONE_NEEDING_REVERIFY_FIELD_NUMBER = 19;
    private boolean isPhoneNeedingReverify_;
    /**
     * <code>optional bool is_phone_needing_reverify = 19;</code>
     */
    public boolean hasIsPhoneNeedingReverify() {
      return ((bitField0_ & 0x00000800) == 0x00000800);
    }
    /**
     * <code>optional bool is_phone_needing_reverify = 19;</code>
     */
    public boolean getIsPhoneNeedingReverify() {
      return isPhoneNeedingReverify_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, personaName_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ipCountry_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(5, countAuthedComputers_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt32(7, accountFlags_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeUInt64(8, facebookId_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 9, facebookName_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBool(14, steamguardNotifyNewmachines_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 15, steamguardMachineNameUserChosen_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeBool(16, isPhoneVerified_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeUInt32(17, twoFactorState_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        output.writeBool(18, isPhoneIdentifying_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        output.writeBool(19, isPhoneNeedingReverify_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, personaName_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ipCountry_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, countAuthedComputers_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, accountFlags_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(8, facebookId_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, facebookName_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, steamguardNotifyNewmachines_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(15, steamguardMachineNameUserChosen_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(16, isPhoneVerified_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(17, twoFactorState_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(18, isPhoneIdentifying_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(19, isPhoneNeedingReverify_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo)) {
        return super.equals(obj);
      }
      uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo other = (uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo) obj;

      boolean result = true;
      result = result && (hasPersonaName() == other.hasPersonaName());
      if (hasPersonaName()) {
        result = result && getPersonaName()
            .equals(other.getPersonaName());
      }
      result = result && (hasIpCountry() == other.hasIpCountry());
      if (hasIpCountry()) {
        result = result && getIpCountry()
            .equals(other.getIpCountry());
      }
      result = result && (hasCountAuthedComputers() == other.hasCountAuthedComputers());
      if (hasCountAuthedComputers()) {
        result = result && (getCountAuthedComputers()
            == other.getCountAuthedComputers());
      }
      result = result && (hasAccountFlags() == other.hasAccountFlags());
      if (hasAccountFlags()) {
        result = result && (getAccountFlags()
            == other.getAccountFlags());
      }
      result = result && (hasFacebookId() == other.hasFacebookId());
      if (hasFacebookId()) {
        result = result && (getFacebookId()
            == other.getFacebookId());
      }
      result = result && (hasFacebookName() == other.hasFacebookName());
      if (hasFacebookName()) {
        result = result && getFacebookName()
            .equals(other.getFacebookName());
      }
      result = result && (hasSteamguardNotifyNewmachines() == other.hasSteamguardNotifyNewmachines());
      if (hasSteamguardNotifyNewmachines()) {
        result = result && (getSteamguardNotifyNewmachines()
            == other.getSteamguardNotifyNewmachines());
      }
      result = result && (hasSteamguardMachineNameUserChosen() == other.hasSteamguardMachineNameUserChosen());
      if (hasSteamguardMachineNameUserChosen()) {
        result = result && getSteamguardMachineNameUserChosen()
            .equals(other.getSteamguardMachineNameUserChosen());
      }
      result = result && (hasIsPhoneVerified() == other.hasIsPhoneVerified());
      if (hasIsPhoneVerified()) {
        result = result && (getIsPhoneVerified()
            == other.getIsPhoneVerified());
      }
      result = result && (hasTwoFactorState() == other.hasTwoFactorState());
      if (hasTwoFactorState()) {
        result = result && (getTwoFactorState()
            == other.getTwoFactorState());
      }
      result = result && (hasIsPhoneIdentifying() == other.hasIsPhoneIdentifying());
      if (hasIsPhoneIdentifying()) {
        result = result && (getIsPhoneIdentifying()
            == other.getIsPhoneIdentifying());
      }
      result = result && (hasIsPhoneNeedingReverify() == other.hasIsPhoneNeedingReverify());
      if (hasIsPhoneNeedingReverify()) {
        result = result && (getIsPhoneNeedingReverify()
            == other.getIsPhoneNeedingReverify());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasPersonaName()) {
        hash = (37 * hash) + PERSONA_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getPersonaName().hashCode();
      }
      if (hasIpCountry()) {
        hash = (37 * hash) + IP_COUNTRY_FIELD_NUMBER;
        hash = (53 * hash) + getIpCountry().hashCode();
      }
      if (hasCountAuthedComputers()) {
        hash = (37 * hash) + COUNT_AUTHED_COMPUTERS_FIELD_NUMBER;
        hash = (53 * hash) + getCountAuthedComputers();
      }
      if (hasAccountFlags()) {
        hash = (37 * hash) + ACCOUNT_FLAGS_FIELD_NUMBER;
        hash = (53 * hash) + getAccountFlags();
      }
      if (hasFacebookId()) {
        hash = (37 * hash) + FACEBOOK_ID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getFacebookId());
      }
      if (hasFacebookName()) {
        hash = (37 * hash) + FACEBOOK_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getFacebookName().hashCode();
      }
      if (hasSteamguardNotifyNewmachines()) {
        hash = (37 * hash) + STEAMGUARD_NOTIFY_NEWMACHINES_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getSteamguardNotifyNewmachines());
      }
      if (hasSteamguardMachineNameUserChosen()) {
        hash = (37 * hash) + STEAMGUARD_MACHINE_NAME_USER_CHOSEN_FIELD_NUMBER;
        hash = (53 * hash) + getSteamguardMachineNameUserChosen().hashCode();
      }
      if (hasIsPhoneVerified()) {
        hash = (37 * hash) + IS_PHONE_VERIFIED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getIsPhoneVerified());
      }
      if (hasTwoFactorState()) {
        hash = (37 * hash) + TWO_FACTOR_STATE_FIELD_NUMBER;
        hash = (53 * hash) + getTwoFactorState();
      }
      if (hasIsPhoneIdentifying()) {
        hash = (37 * hash) + IS_PHONE_IDENTIFYING_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getIsPhoneIdentifying());
      }
      if (hasIsPhoneNeedingReverify()) {
        hash = (37 * hash) + IS_PHONE_NEEDING_REVERIFY_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getIsPhoneNeedingReverify());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code CMsgClientAccountInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CMsgClientAccountInfo)
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientAccountInfo_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientAccountInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo.class, uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo.Builder.class);
      }

      // Construct using uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        personaName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        ipCountry_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        countAuthedComputers_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        accountFlags_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        facebookId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        facebookName_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        steamguardNotifyNewmachines_ = false;
        bitField0_ = (bitField0_ & ~0x00000040);
        steamguardMachineNameUserChosen_ = "";
        bitField0_ = (bitField0_ & ~0x00000080);
        isPhoneVerified_ = false;
        bitField0_ = (bitField0_ & ~0x00000100);
        twoFactorState_ = 0;
        bitField0_ = (bitField0_ & ~0x00000200);
        isPhoneIdentifying_ = false;
        bitField0_ = (bitField0_ & ~0x00000400);
        isPhoneNeedingReverify_ = false;
        bitField0_ = (bitField0_ & ~0x00000800);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.internal_static_CMsgClientAccountInfo_descriptor;
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo getDefaultInstanceForType() {
        return uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo.getDefaultInstance();
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo build() {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo buildPartial() {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo result = new uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.personaName_ = personaName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.ipCountry_ = ipCountry_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.countAuthedComputers_ = countAuthedComputers_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.accountFlags_ = accountFlags_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.facebookId_ = facebookId_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.facebookName_ = facebookName_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.steamguardNotifyNewmachines_ = steamguardNotifyNewmachines_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.steamguardMachineNameUserChosen_ = steamguardMachineNameUserChosen_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.isPhoneVerified_ = isPhoneVerified_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.twoFactorState_ = twoFactorState_;
        if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
          to_bitField0_ |= 0x00000400;
        }
        result.isPhoneIdentifying_ = isPhoneIdentifying_;
        if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
          to_bitField0_ |= 0x00000800;
        }
        result.isPhoneNeedingReverify_ = isPhoneNeedingReverify_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo) {
          return mergeFrom((uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo other) {
        if (other == uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo.getDefaultInstance()) return this;
        if (other.hasPersonaName()) {
          bitField0_ |= 0x00000001;
          personaName_ = other.personaName_;
          onChanged();
        }
        if (other.hasIpCountry()) {
          bitField0_ |= 0x00000002;
          ipCountry_ = other.ipCountry_;
          onChanged();
        }
        if (other.hasCountAuthedComputers()) {
          setCountAuthedComputers(other.getCountAuthedComputers());
        }
        if (other.hasAccountFlags()) {
          setAccountFlags(other.getAccountFlags());
        }
        if (other.hasFacebookId()) {
          setFacebookId(other.getFacebookId());
        }
        if (other.hasFacebookName()) {
          bitField0_ |= 0x00000020;
          facebookName_ = other.facebookName_;
          onChanged();
        }
        if (other.hasSteamguardNotifyNewmachines()) {
          setSteamguardNotifyNewmachines(other.getSteamguardNotifyNewmachines());
        }
        if (other.hasSteamguardMachineNameUserChosen()) {
          bitField0_ |= 0x00000080;
          steamguardMachineNameUserChosen_ = other.steamguardMachineNameUserChosen_;
          onChanged();
        }
        if (other.hasIsPhoneVerified()) {
          setIsPhoneVerified(other.getIsPhoneVerified());
        }
        if (other.hasTwoFactorState()) {
          setTwoFactorState(other.getTwoFactorState());
        }
        if (other.hasIsPhoneIdentifying()) {
          setIsPhoneIdentifying(other.getIsPhoneIdentifying());
        }
        if (other.hasIsPhoneNeedingReverify()) {
          setIsPhoneNeedingReverify(other.getIsPhoneNeedingReverify());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object personaName_ = "";
      /**
       * <code>optional string persona_name = 1;</code>
       */
      public boolean hasPersonaName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string persona_name = 1;</code>
       */
      public java.lang.String getPersonaName() {
        java.lang.Object ref = personaName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            personaName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string persona_name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getPersonaNameBytes() {
        java.lang.Object ref = personaName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          personaName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string persona_name = 1;</code>
       */
      public Builder setPersonaName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        personaName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string persona_name = 1;</code>
       */
      public Builder clearPersonaName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        personaName_ = getDefaultInstance().getPersonaName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string persona_name = 1;</code>
       */
      public Builder setPersonaNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        personaName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object ipCountry_ = "";
      /**
       * <code>optional string ip_country = 2;</code>
       */
      public boolean hasIpCountry() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string ip_country = 2;</code>
       */
      public java.lang.String getIpCountry() {
        java.lang.Object ref = ipCountry_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            ipCountry_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string ip_country = 2;</code>
       */
      public com.google.protobuf.ByteString
          getIpCountryBytes() {
        java.lang.Object ref = ipCountry_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ipCountry_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string ip_country = 2;</code>
       */
      public Builder setIpCountry(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        ipCountry_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string ip_country = 2;</code>
       */
      public Builder clearIpCountry() {
        bitField0_ = (bitField0_ & ~0x00000002);
        ipCountry_ = getDefaultInstance().getIpCountry();
        onChanged();
        return this;
      }
      /**
       * <code>optional string ip_country = 2;</code>
       */
      public Builder setIpCountryBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        ipCountry_ = value;
        onChanged();
        return this;
      }

      private int countAuthedComputers_ ;
      /**
       * <code>optional int32 count_authed_computers = 5;</code>
       */
      public boolean hasCountAuthedComputers() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 count_authed_computers = 5;</code>
       */
      public int getCountAuthedComputers() {
        return countAuthedComputers_;
      }
      /**
       * <code>optional int32 count_authed_computers = 5;</code>
       */
      public Builder setCountAuthedComputers(int value) {
        bitField0_ |= 0x00000004;
        countAuthedComputers_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 count_authed_computers = 5;</code>
       */
      public Builder clearCountAuthedComputers() {
        bitField0_ = (bitField0_ & ~0x00000004);
        countAuthedComputers_ = 0;
        onChanged();
        return this;
      }

      private int accountFlags_ ;
      /**
       * <code>optional uint32 account_flags = 7;</code>
       */
      public boolean hasAccountFlags() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional uint32 account_flags = 7;</code>
       */
      public int getAccountFlags() {
        return accountFlags_;
      }
      /**
       * <code>optional uint32 account_flags = 7;</code>
       */
      public Builder setAccountFlags(int value) {
        bitField0_ |= 0x00000008;
        accountFlags_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 account_flags = 7;</code>
       */
      public Builder clearAccountFlags() {
        bitField0_ = (bitField0_ & ~0x00000008);
        accountFlags_ = 0;
        onChanged();
        return this;
      }

      private long facebookId_ ;
      /**
       * <code>optional uint64 facebook_id = 8;</code>
       */
      public boolean hasFacebookId() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional uint64 facebook_id = 8;</code>
       */
      public long getFacebookId() {
        return facebookId_;
      }
      /**
       * <code>optional uint64 facebook_id = 8;</code>
       */
      public Builder setFacebookId(long value) {
        bitField0_ |= 0x00000010;
        facebookId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 facebook_id = 8;</code>
       */
      public Builder clearFacebookId() {
        bitField0_ = (bitField0_ & ~0x00000010);
        facebookId_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object facebookName_ = "";
      /**
       * <code>optional string facebook_name = 9;</code>
       */
      public boolean hasFacebookName() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional string facebook_name = 9;</code>
       */
      public java.lang.String getFacebookName() {
        java.lang.Object ref = facebookName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            facebookName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string facebook_name = 9;</code>
       */
      public com.google.protobuf.ByteString
          getFacebookNameBytes() {
        java.lang.Object ref = facebookName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          facebookName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string facebook_name = 9;</code>
       */
      public Builder setFacebookName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        facebookName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string facebook_name = 9;</code>
       */
      public Builder clearFacebookName() {
        bitField0_ = (bitField0_ & ~0x00000020);
        facebookName_ = getDefaultInstance().getFacebookName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string facebook_name = 9;</code>
       */
      public Builder setFacebookNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        facebookName_ = value;
        onChanged();
        return this;
      }

      private boolean steamguardNotifyNewmachines_ ;
      /**
       * <code>optional bool steamguard_notify_newmachines = 14;</code>
       */
      public boolean hasSteamguardNotifyNewmachines() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional bool steamguard_notify_newmachines = 14;</code>
       */
      public boolean getSteamguardNotifyNewmachines() {
        return steamguardNotifyNewmachines_;
      }
      /**
       * <code>optional bool steamguard_notify_newmachines = 14;</code>
       */
      public Builder setSteamguardNotifyNewmachines(boolean value) {
        bitField0_ |= 0x00000040;
        steamguardNotifyNewmachines_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool steamguard_notify_newmachines = 14;</code>
       */
      public Builder clearSteamguardNotifyNewmachines() {
        bitField0_ = (bitField0_ & ~0x00000040);
        steamguardNotifyNewmachines_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object steamguardMachineNameUserChosen_ = "";
      /**
       * <code>optional string steamguard_machine_name_user_chosen = 15;</code>
       */
      public boolean hasSteamguardMachineNameUserChosen() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional string steamguard_machine_name_user_chosen = 15;</code>
       */
      public java.lang.String getSteamguardMachineNameUserChosen() {
        java.lang.Object ref = steamguardMachineNameUserChosen_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            steamguardMachineNameUserChosen_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string steamguard_machine_name_user_chosen = 15;</code>
       */
      public com.google.protobuf.ByteString
          getSteamguardMachineNameUserChosenBytes() {
        java.lang.Object ref = steamguardMachineNameUserChosen_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          steamguardMachineNameUserChosen_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string steamguard_machine_name_user_chosen = 15;</code>
       */
      public Builder setSteamguardMachineNameUserChosen(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        steamguardMachineNameUserChosen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string steamguard_machine_name_user_chosen = 15;</code>
       */
      public Builder clearSteamguardMachineNameUserChosen() {
        bitField0_ = (bitField0_ & ~0x00000080);
        steamguardMachineNameUserChosen_ = getDefaultInstance().getSteamguardMachineNameUserChosen();
        onChanged();
        return this;
      }
      /**
       * <code>optional string steamguard_machine_name_user_chosen = 15;</code>
       */
      public Builder setSteamguardMachineNameUserChosenBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        steamguardMachineNameUserChosen_ = value;
        onChanged();
        return this;
      }

      private boolean isPhoneVerified_ ;
      /**
       * <code>optional bool is_phone_verified = 16;</code>
       */
      public boolean hasIsPhoneVerified() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>optional bool is_phone_verified = 16;</code>
       */
      public boolean getIsPhoneVerified() {
        return isPhoneVerified_;
      }
      /**
       * <code>optional bool is_phone_verified = 16;</code>
       */
      public Builder setIsPhoneVerified(boolean value) {
        bitField0_ |= 0x00000100;
        isPhoneVerified_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool is_phone_verified = 16;</code>
       */
      public Builder clearIsPhoneVerified() {
        bitField0_ = (bitField0_ & ~0x00000100);
        isPhoneVerified_ = false;
        onChanged();
        return this;
      }

      private int twoFactorState_ ;
      /**
       * <code>optional uint32 two_factor_state = 17;</code>
       */
      public boolean hasTwoFactorState() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      /**
       * <code>optional uint32 two_factor_state = 17;</code>
       */
      public int getTwoFactorState() {
        return twoFactorState_;
      }
      /**
       * <code>optional uint32 two_factor_state = 17;</code>
       */
      public Builder setTwoFactorState(int value) {
        bitField0_ |= 0x00000200;
        twoFactorState_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 two_factor_state = 17;</code>
       */
      public Builder clearTwoFactorState() {
        bitField0_ = (bitField0_ & ~0x00000200);
        twoFactorState_ = 0;
        onChanged();
        return this;
      }

      private boolean isPhoneIdentifying_ ;
      /**
       * <code>optional bool is_phone_identifying = 18;</code>
       */
      public boolean hasIsPhoneIdentifying() {
        return ((bitField0_ & 0x00000400) == 0x00000400);
      }
      /**
       * <code>optional bool is_phone_identifying = 18;</code>
       */
      public boolean getIsPhoneIdentifying() {
        return isPhoneIdentifying_;
      }
      /**
       * <code>optional bool is_phone_identifying = 18;</code>
       */
      public Builder setIsPhoneIdentifying(boolean value) {
        bitField0_ |= 0x00000400;
        isPhoneIdentifying_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool is_phone_identifying = 18;</code>
       */
      public Builder clearIsPhoneIdentifying() {
        bitField0_ = (bitField0_ & ~0x00000400);
        isPhoneIdentifying_ = false;
        onChanged();
        return this;
      }

      private boolean isPhoneNeedingReverify_ ;
      /**
       * <code>optional bool is_phone_needing_reverify = 19;</code>
       */
      public boolean hasIsPhoneNeedingReverify() {
        return ((bitField0_ & 0x00000800) == 0x00000800);
      }
      /**
       * <code>optional bool is_phone_needing_reverify = 19;</code>
       */
      public boolean getIsPhoneNeedingReverify() {
        return isPhoneNeedingReverify_;
      }
      /**
       * <code>optional bool is_phone_needing_reverify = 19;</code>
       */
      public Builder setIsPhoneNeedingReverify(boolean value) {
        bitField0_ |= 0x00000800;
        isPhoneNeedingReverify_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool is_phone_needing_reverify = 19;</code>
       */
      public Builder clearIsPhoneNeedingReverify() {
        bitField0_ = (bitField0_ & ~0x00000800);
        isPhoneNeedingReverify_ = false;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CMsgClientAccountInfo)
    }

    // @@protoc_insertion_point(class_scope:CMsgClientAccountInfo)
    private static final uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo();
    }

    public static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CMsgClientAccountInfo>
        PARSER = new com.google.protobuf.AbstractParser<CMsgClientAccountInfo>() {
      public CMsgClientAccountInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CMsgClientAccountInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CMsgClientAccountInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CMsgClientAccountInfo> getParserForType() {
      return PARSER;
    }

    public uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CMsgClientHeartBeat_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CMsgClientHeartBeat_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CMsgClientServerTimestampRequest_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CMsgClientServerTimestampRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CMsgClientServerTimestampResponse_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CMsgClientServerTimestampResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CMsgClientLogon_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CMsgClientLogon_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CMsgClientLogonResponse_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CMsgClientLogonResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CMsgClientRequestWebAPIAuthenticateUserNonce_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CMsgClientRequestWebAPIAuthenticateUserNonce_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CMsgClientRequestWebAPIAuthenticateUserNonceResponse_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CMsgClientRequestWebAPIAuthenticateUserNonceResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CMsgClientLogOff_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CMsgClientLogOff_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CMsgClientLoggedOff_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CMsgClientLoggedOff_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CMsgClientNewLoginKey_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CMsgClientNewLoginKey_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CMsgClientNewLoginKeyAccepted_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CMsgClientNewLoginKeyAccepted_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CMsgClientAccountInfo_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CMsgClientAccountInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nSin/dragonbra/javasteam/protobufs/steam" +
      "client/steammessages_clientserver_login." +
      "proto\032Ein/dragonbra/javasteam/protobufs/" +
      "steamclient/steammessages_base.proto\"\025\n\023" +
      "CMsgClientHeartBeat\"D\n CMsgClientServerT" +
      "imestampRequest\022 \n\030client_request_timest" +
      "amp\030\001 \001(\004\"b\n!CMsgClientServerTimestampRe" +
      "sponse\022 \n\030client_request_timestamp\030\001 \001(\004" +
      "\022\033\n\023server_timestamp_ms\030\002 \001(\004\"\312\n\n\017CMsgCl" +
      "ientLogon\022\030\n\020protocol_version\030\001 \001(\r\022\037\n\027o",
      "bfustucated_private_ip\030\002 \001(\r\022\017\n\007cell_id\030" +
      "\003 \001(\r\022\027\n\017last_session_id\030\004 \001(\r\022\036\n\026client" +
      "_package_version\030\005 \001(\r\022\027\n\017client_languag" +
      "e\030\006 \001(\t\022\026\n\016client_os_type\030\007 \001(\r\022\'\n\030shoul" +
      "d_remember_password\030\010 \001(\010:\005false\022\024\n\014wine" +
      "_version\030\t \001(\t\022 \n\030ping_ms_from_cell_sear" +
      "ch\030\n \001(\r\022\021\n\tpublic_ip\030\024 \001(\r\022\021\n\tqos_level" +
      "\030\025 \001(\r\022 \n\030client_supplied_steam_id\030\026 \001(\006" +
      "\022\022\n\nmachine_id\030\036 \001(\014\022\030\n\rlauncher_type\030\037 " +
      "\001(\r:\0010\022\022\n\007ui_mode\030  \001(\r:\0010\022\024\n\tchat_mode\030",
      "! \001(\r:\0010\022\032\n\022steam2_auth_ticket\030) \001(\014\022\025\n\r" +
      "email_address\030* \001(\t\022 \n\030rtime32_account_c" +
      "reation\030+ \001(\007\022\024\n\014account_name\0302 \001(\t\022\020\n\010p" +
      "assword\0303 \001(\t\022\031\n\021game_server_token\0304 \001(\t" +
      "\022\021\n\tlogin_key\030< \001(\t\022+\n\034was_converted_dep" +
      "recated_msg\030F \001(\010:\005false\022%\n\035anon_user_ta" +
      "rget_account_name\030P \001(\t\022\036\n\026resolved_user" +
      "_steam_id\030Q \001(\006\022\032\n\022eresult_sentryfile\030R " +
      "\001(\005\022\026\n\016sha_sentryfile\030S \001(\014\022\021\n\tauth_code" +
      "\030T \001(\t\022\020\n\010otp_type\030U \001(\005\022\021\n\totp_value\030V ",
      "\001(\r\022\026\n\016otp_identifier\030W \001(\t\022\035\n\025steam2_ti" +
      "cket_request\030X \001(\010\022\027\n\017sony_psn_ticket\030Z " +
      "\001(\014\022\033\n\023sony_psn_service_id\030[ \001(\t\0226\n\'crea" +
      "te_new_psn_linked_account_if_needed\030\\ \001(" +
      "\010:\005false\022\025\n\rsony_psn_name\030] \001(\t\022\032\n\022game_" +
      "server_app_id\030^ \001(\005\022)\n!steamguard_dont_r" +
      "emember_computer\030_ \001(\010\022\024\n\014machine_name\030`" +
      " \001(\t\022\037\n\027machine_name_userchosen\030a \001(\t\022\030\n" +
      "\020country_override\030b \001(\t\022\024\n\014is_steam_box\030" +
      "c \001(\010\022\032\n\022client_instance_id\030d \001(\004\022\027\n\017two",
      "_factor_code\030e \001(\t\022$\n\034supports_rate_limi" +
      "t_response\030f \001(\010\022\027\n\017web_logon_nonce\030g \001(" +
      "\t\022\027\n\017priority_reason\030h \001(\005\"\257\005\n\027CMsgClien" +
      "tLogonResponse\022\022\n\007eresult\030\001 \001(\005:\0012\022%\n\035ou" +
      "t_of_game_heartbeat_seconds\030\002 \001(\005\022!\n\031in_" +
      "game_heartbeat_seconds\030\003 \001(\005\022\021\n\tpublic_i" +
      "p\030\004 \001(\r\022\033\n\023rtime32_server_time\030\005 \001(\007\022\025\n\r" +
      "account_flags\030\006 \001(\r\022\017\n\007cell_id\030\007 \001(\r\022\024\n\014" +
      "email_domain\030\010 \001(\t\022\025\n\rsteam2_ticket\030\t \001(" +
      "\014\022\030\n\020eresult_extended\030\n \001(\005\022&\n\036webapi_au",
      "thenticate_user_nonce\030\013 \001(\t\022\036\n\026cell_id_p" +
      "ing_threshold\030\014 \001(\r\022\020\n\010use_pics\030\r \001(\010\022\022\n" +
      "\nvanity_url\030\016 \001(\t\022\037\n\027client_supplied_ste" +
      "amid\030\024 \001(\006\022\027\n\017ip_country_code\030\025 \001(\t\022\031\n\021p" +
      "arental_settings\030\026 \001(\014\022\"\n\032parental_setti" +
      "ng_signature\030\027 \001(\014\022&\n\036count_loginfailure" +
      "s_to_migrate\030\030 \001(\005\022$\n\034count_disconnects_" +
      "to_migrate\030\031 \001(\005\022#\n\033ogs_data_report_time" +
      "_window\030\032 \001(\005\022\032\n\022client_instance_id\030\033 \001(" +
      "\004\022!\n\031force_client_update_check\030\034 \001(\010\"F\n,",
      "CMsgClientRequestWebAPIAuthenticateUserN" +
      "once\022\026\n\ntoken_type\030\001 \001(\005:\002-1\"\212\001\n4CMsgCli" +
      "entRequestWebAPIAuthenticateUserNonceRes" +
      "ponse\022\022\n\007eresult\030\001 \001(\005:\0012\022&\n\036webapi_auth" +
      "enticate_user_nonce\030\013 \001(\t\022\026\n\ntoken_type\030" +
      "\003 \001(\005:\002-1\"\022\n\020CMsgClientLogOff\")\n\023CMsgCli" +
      "entLoggedOff\022\022\n\007eresult\030\001 \001(\005:\0012\"=\n\025CMsg" +
      "ClientNewLoginKey\022\021\n\tunique_id\030\001 \001(\r\022\021\n\t" +
      "login_key\030\002 \001(\t\"2\n\035CMsgClientNewLoginKey" +
      "Accepted\022\021\n\tunique_id\030\001 \001(\r\"\356\002\n\025CMsgClie",
      "ntAccountInfo\022\024\n\014persona_name\030\001 \001(\t\022\022\n\ni" +
      "p_country\030\002 \001(\t\022\036\n\026count_authed_computer" +
      "s\030\005 \001(\005\022\025\n\raccount_flags\030\007 \001(\r\022\023\n\013facebo" +
      "ok_id\030\010 \001(\004\022\025\n\rfacebook_name\030\t \001(\t\022%\n\035st" +
      "eamguard_notify_newmachines\030\016 \001(\010\022+\n#ste" +
      "amguard_machine_name_user_chosen\030\017 \001(\t\022\031" +
      "\n\021is_phone_verified\030\020 \001(\010\022\030\n\020two_factor_" +
      "state\030\021 \001(\r\022\034\n\024is_phone_identifying\030\022 \001(" +
      "\010\022!\n\031is_phone_needing_reverify\030\023 \001(\010B3\n," +
      "in.dragonbra.javasteam.protobufs.steamcl",
      "ientH\001\200\001\000"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          uk.co.thomasc.steamkit.base.generated.SteammessagesBase.getDescriptor(),
        }, assigner);
    internal_static_CMsgClientHeartBeat_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CMsgClientHeartBeat_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CMsgClientHeartBeat_descriptor,
        new java.lang.String[] { });
    internal_static_CMsgClientServerTimestampRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_CMsgClientServerTimestampRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CMsgClientServerTimestampRequest_descriptor,
        new java.lang.String[] { "ClientRequestTimestamp", });
    internal_static_CMsgClientServerTimestampResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_CMsgClientServerTimestampResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CMsgClientServerTimestampResponse_descriptor,
        new java.lang.String[] { "ClientRequestTimestamp", "ServerTimestampMs", });
    internal_static_CMsgClientLogon_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_CMsgClientLogon_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CMsgClientLogon_descriptor,
        new java.lang.String[] { "ProtocolVersion", "ObfustucatedPrivateIp", "CellId", "LastSessionId", "ClientPackageVersion", "ClientLanguage", "ClientOsType", "ShouldRememberPassword", "WineVersion", "PingMsFromCellSearch", "PublicIp", "QosLevel", "ClientSuppliedSteamId", "MachineId", "LauncherType", "UiMode", "ChatMode", "Steam2AuthTicket", "EmailAddress", "Rtime32AccountCreation", "AccountName", "Password", "GameServerToken", "LoginKey", "WasConvertedDeprecatedMsg", "AnonUserTargetAccountName", "ResolvedUserSteamId", "EresultSentryfile", "ShaSentryfile", "AuthCode", "OtpType", "OtpValue", "OtpIdentifier", "Steam2TicketRequest", "SonyPsnTicket", "SonyPsnServiceId", "CreateNewPsnLinkedAccountIfNeeded", "SonyPsnName", "GameServerAppId", "SteamguardDontRememberComputer", "MachineName", "MachineNameUserchosen", "CountryOverride", "IsSteamBox", "ClientInstanceId", "TwoFactorCode", "SupportsRateLimitResponse", "WebLogonNonce", "PriorityReason", });
    internal_static_CMsgClientLogonResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_CMsgClientLogonResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CMsgClientLogonResponse_descriptor,
        new java.lang.String[] { "Eresult", "OutOfGameHeartbeatSeconds", "InGameHeartbeatSeconds", "PublicIp", "Rtime32ServerTime", "AccountFlags", "CellId", "EmailDomain", "Steam2Ticket", "EresultExtended", "WebapiAuthenticateUserNonce", "CellIdPingThreshold", "UsePics", "VanityUrl", "ClientSuppliedSteamid", "IpCountryCode", "ParentalSettings", "ParentalSettingSignature", "CountLoginfailuresToMigrate", "CountDisconnectsToMigrate", "OgsDataReportTimeWindow", "ClientInstanceId", "ForceClientUpdateCheck", });
    internal_static_CMsgClientRequestWebAPIAuthenticateUserNonce_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_CMsgClientRequestWebAPIAuthenticateUserNonce_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CMsgClientRequestWebAPIAuthenticateUserNonce_descriptor,
        new java.lang.String[] { "TokenType", });
    internal_static_CMsgClientRequestWebAPIAuthenticateUserNonceResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_CMsgClientRequestWebAPIAuthenticateUserNonceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CMsgClientRequestWebAPIAuthenticateUserNonceResponse_descriptor,
        new java.lang.String[] { "Eresult", "WebapiAuthenticateUserNonce", "TokenType", });
    internal_static_CMsgClientLogOff_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_CMsgClientLogOff_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CMsgClientLogOff_descriptor,
        new java.lang.String[] { });
    internal_static_CMsgClientLoggedOff_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_CMsgClientLoggedOff_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CMsgClientLoggedOff_descriptor,
        new java.lang.String[] { "Eresult", });
    internal_static_CMsgClientNewLoginKey_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_CMsgClientNewLoginKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CMsgClientNewLoginKey_descriptor,
        new java.lang.String[] { "UniqueId", "LoginKey", });
    internal_static_CMsgClientNewLoginKeyAccepted_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_CMsgClientNewLoginKeyAccepted_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CMsgClientNewLoginKeyAccepted_descriptor,
        new java.lang.String[] { "UniqueId", });
    internal_static_CMsgClientAccountInfo_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_CMsgClientAccountInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CMsgClientAccountInfo_descriptor,
        new java.lang.String[] { "PersonaName", "IpCountry", "CountAuthedComputers", "AccountFlags", "FacebookId", "FacebookName", "SteamguardNotifyNewmachines", "SteamguardMachineNameUserChosen", "IsPhoneVerified", "TwoFactorState", "IsPhoneIdentifying", "IsPhoneNeedingReverify", });
    uk.co.thomasc.steamkit.base.generated.SteammessagesBase.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
