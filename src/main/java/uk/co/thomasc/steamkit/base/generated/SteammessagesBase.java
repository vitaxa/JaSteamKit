package uk.co.thomasc.steamkit.base.generated;

public final class SteammessagesBase {
  private SteammessagesBase() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(SteammessagesBase.msgpoolSoftLimit);
    registry.add(SteammessagesBase.msgpoolHardLimit);
    registry.add(SteammessagesBase.forcePhpGeneration);
    registry.add(SteammessagesBase.phpOutputAlwaysNumber);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CMsgProtoBufHeaderOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CMsgProtoBufHeader)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional fixed64 steamid = 1;</code>
     */
    boolean hasSteamid();
    /**
     * <code>optional fixed64 steamid = 1;</code>
     */
    long getSteamid();

    /**
     * <code>optional int32 client_sessionid = 2;</code>
     */
    boolean hasClientSessionid();
    /**
     * <code>optional int32 client_sessionid = 2;</code>
     */
    int getClientSessionid();

    /**
     * <code>optional uint32 routing_appid = 3;</code>
     */
    boolean hasRoutingAppid();
    /**
     * <code>optional uint32 routing_appid = 3;</code>
     */
    int getRoutingAppid();

    /**
     * <code>optional fixed64 jobid_source = 10 [default = 18446744073709551615];</code>
     */
    boolean hasJobidSource();
    /**
     * <code>optional fixed64 jobid_source = 10 [default = 18446744073709551615];</code>
     */
    long getJobidSource();

    /**
     * <code>optional fixed64 jobid_target = 11 [default = 18446744073709551615];</code>
     */
    boolean hasJobidTarget();
    /**
     * <code>optional fixed64 jobid_target = 11 [default = 18446744073709551615];</code>
     */
    long getJobidTarget();

    /**
     * <code>optional string target_job_name = 12;</code>
     */
    boolean hasTargetJobName();
    /**
     * <code>optional string target_job_name = 12;</code>
     */
    java.lang.String getTargetJobName();
    /**
     * <code>optional string target_job_name = 12;</code>
     */
    com.google.protobuf.ByteString
        getTargetJobNameBytes();

    /**
     * <code>optional int32 seq_num = 24;</code>
     */
    boolean hasSeqNum();
    /**
     * <code>optional int32 seq_num = 24;</code>
     */
    int getSeqNum();

    /**
     * <code>optional int32 eresult = 13 [default = 2];</code>
     */
    boolean hasEresult();
    /**
     * <code>optional int32 eresult = 13 [default = 2];</code>
     */
    int getEresult();

    /**
     * <code>optional string error_message = 14;</code>
     */
    boolean hasErrorMessage();
    /**
     * <code>optional string error_message = 14;</code>
     */
    java.lang.String getErrorMessage();
    /**
     * <code>optional string error_message = 14;</code>
     */
    com.google.protobuf.ByteString
        getErrorMessageBytes();

    /**
     * <code>optional uint32 ip = 15;</code>
     */
    boolean hasIp();
    /**
     * <code>optional uint32 ip = 15;</code>
     */
    int getIp();

    /**
     * <code>optional uint32 auth_account_flags = 16;</code>
     */
    boolean hasAuthAccountFlags();
    /**
     * <code>optional uint32 auth_account_flags = 16;</code>
     */
    int getAuthAccountFlags();

    /**
     * <code>optional uint32 token_source = 22;</code>
     */
    boolean hasTokenSource();
    /**
     * <code>optional uint32 token_source = 22;</code>
     */
    int getTokenSource();

    /**
     * <code>optional bool admin_spoofing_user = 23;</code>
     */
    boolean hasAdminSpoofingUser();
    /**
     * <code>optional bool admin_spoofing_user = 23;</code>
     */
    boolean getAdminSpoofingUser();

    /**
     * <code>optional int32 transport_error = 17 [default = 1];</code>
     */
    boolean hasTransportError();
    /**
     * <code>optional int32 transport_error = 17 [default = 1];</code>
     */
    int getTransportError();

    /**
     * <code>optional uint64 messageid = 18 [default = 18446744073709551615];</code>
     */
    boolean hasMessageid();
    /**
     * <code>optional uint64 messageid = 18 [default = 18446744073709551615];</code>
     */
    long getMessageid();

    /**
     * <code>optional uint32 publisher_group_id = 19;</code>
     */
    boolean hasPublisherGroupId();
    /**
     * <code>optional uint32 publisher_group_id = 19;</code>
     */
    int getPublisherGroupId();

    /**
     * <code>optional uint32 sysid = 20;</code>
     */
    boolean hasSysid();
    /**
     * <code>optional uint32 sysid = 20;</code>
     */
    int getSysid();

    /**
     * <code>optional uint64 trace_tag = 21;</code>
     */
    boolean hasTraceTag();
    /**
     * <code>optional uint64 trace_tag = 21;</code>
     */
    long getTraceTag();

    /**
     * <code>optional uint32 webapi_key_id = 25;</code>
     */
    boolean hasWebapiKeyId();
    /**
     * <code>optional uint32 webapi_key_id = 25;</code>
     */
    int getWebapiKeyId();

    /**
     * <code>optional bool is_from_external_source = 26;</code>
     */
    boolean hasIsFromExternalSource();
    /**
     * <code>optional bool is_from_external_source = 26;</code>
     */
    boolean getIsFromExternalSource();

    /**
     * <code>repeated uint32 forward_to_sysid = 27;</code>
     */
    java.util.List<java.lang.Integer> getForwardToSysidList();
    /**
     * <code>repeated uint32 forward_to_sysid = 27;</code>
     */
    int getForwardToSysidCount();
    /**
     * <code>repeated uint32 forward_to_sysid = 27;</code>
     */
    int getForwardToSysid(int index);
  }
  /**
   * Protobuf type {@code CMsgProtoBufHeader}
   */
  public  static final class CMsgProtoBufHeader extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CMsgProtoBufHeader)
      CMsgProtoBufHeaderOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CMsgProtoBufHeader.newBuilder() to construct.
    private CMsgProtoBufHeader(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CMsgProtoBufHeader() {
      steamid_ = 0L;
      clientSessionid_ = 0;
      routingAppid_ = 0;
      jobidSource_ = -1L;
      jobidTarget_ = -1L;
      targetJobName_ = "";
      seqNum_ = 0;
      eresult_ = 2;
      errorMessage_ = "";
      ip_ = 0;
      authAccountFlags_ = 0;
      tokenSource_ = 0;
      adminSpoofingUser_ = false;
      transportError_ = 1;
      messageid_ = -1L;
      publisherGroupId_ = 0;
      sysid_ = 0;
      traceTag_ = 0L;
      webapiKeyId_ = 0;
      isFromExternalSource_ = false;
      forwardToSysid_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CMsgProtoBufHeader(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 9: {
              bitField0_ |= 0x00000001;
              steamid_ = input.readFixed64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              clientSessionid_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              routingAppid_ = input.readUInt32();
              break;
            }
            case 81: {
              bitField0_ |= 0x00000008;
              jobidSource_ = input.readFixed64();
              break;
            }
            case 89: {
              bitField0_ |= 0x00000010;
              jobidTarget_ = input.readFixed64();
              break;
            }
            case 98: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000020;
              targetJobName_ = bs;
              break;
            }
            case 104: {
              bitField0_ |= 0x00000080;
              eresult_ = input.readInt32();
              break;
            }
            case 114: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000100;
              errorMessage_ = bs;
              break;
            }
            case 120: {
              bitField0_ |= 0x00000200;
              ip_ = input.readUInt32();
              break;
            }
            case 128: {
              bitField0_ |= 0x00000400;
              authAccountFlags_ = input.readUInt32();
              break;
            }
            case 136: {
              bitField0_ |= 0x00002000;
              transportError_ = input.readInt32();
              break;
            }
            case 144: {
              bitField0_ |= 0x00004000;
              messageid_ = input.readUInt64();
              break;
            }
            case 152: {
              bitField0_ |= 0x00008000;
              publisherGroupId_ = input.readUInt32();
              break;
            }
            case 160: {
              bitField0_ |= 0x00010000;
              sysid_ = input.readUInt32();
              break;
            }
            case 168: {
              bitField0_ |= 0x00020000;
              traceTag_ = input.readUInt64();
              break;
            }
            case 176: {
              bitField0_ |= 0x00000800;
              tokenSource_ = input.readUInt32();
              break;
            }
            case 184: {
              bitField0_ |= 0x00001000;
              adminSpoofingUser_ = input.readBool();
              break;
            }
            case 192: {
              bitField0_ |= 0x00000040;
              seqNum_ = input.readInt32();
              break;
            }
            case 200: {
              bitField0_ |= 0x00040000;
              webapiKeyId_ = input.readUInt32();
              break;
            }
            case 208: {
              bitField0_ |= 0x00080000;
              isFromExternalSource_ = input.readBool();
              break;
            }
            case 216: {
              if (!((mutable_bitField0_ & 0x00100000) == 0x00100000)) {
                forwardToSysid_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00100000;
              }
              forwardToSysid_.add(input.readUInt32());
              break;
            }
            case 218: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00100000) == 0x00100000) && input.getBytesUntilLimit() > 0) {
                forwardToSysid_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00100000;
              }
              while (input.getBytesUntilLimit() > 0) {
                forwardToSysid_.add(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00100000) == 0x00100000)) {
          forwardToSysid_ = java.util.Collections.unmodifiableList(forwardToSysid_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SteammessagesBase.internal_static_CMsgProtoBufHeader_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SteammessagesBase.internal_static_CMsgProtoBufHeader_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SteammessagesBase.CMsgProtoBufHeader.class, SteammessagesBase.CMsgProtoBufHeader.Builder.class);
    }

    private int bitField0_;
    public static final int STEAMID_FIELD_NUMBER = 1;
    private long steamid_;
    /**
     * <code>optional fixed64 steamid = 1;</code>
     */
    public boolean hasSteamid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional fixed64 steamid = 1;</code>
     */
    public long getSteamid() {
      return steamid_;
    }

    public static final int CLIENT_SESSIONID_FIELD_NUMBER = 2;
    private int clientSessionid_;
    /**
     * <code>optional int32 client_sessionid = 2;</code>
     */
    public boolean hasClientSessionid() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 client_sessionid = 2;</code>
     */
    public int getClientSessionid() {
      return clientSessionid_;
    }

    public static final int ROUTING_APPID_FIELD_NUMBER = 3;
    private int routingAppid_;
    /**
     * <code>optional uint32 routing_appid = 3;</code>
     */
    public boolean hasRoutingAppid() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint32 routing_appid = 3;</code>
     */
    public int getRoutingAppid() {
      return routingAppid_;
    }

    public static final int JOBID_SOURCE_FIELD_NUMBER = 10;
    private long jobidSource_;
    /**
     * <code>optional fixed64 jobid_source = 10 [default = 18446744073709551615];</code>
     */
    public boolean hasJobidSource() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional fixed64 jobid_source = 10 [default = 18446744073709551615];</code>
     */
    public long getJobidSource() {
      return jobidSource_;
    }

    public static final int JOBID_TARGET_FIELD_NUMBER = 11;
    private long jobidTarget_;
    /**
     * <code>optional fixed64 jobid_target = 11 [default = 18446744073709551615];</code>
     */
    public boolean hasJobidTarget() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional fixed64 jobid_target = 11 [default = 18446744073709551615];</code>
     */
    public long getJobidTarget() {
      return jobidTarget_;
    }

    public static final int TARGET_JOB_NAME_FIELD_NUMBER = 12;
    private volatile java.lang.Object targetJobName_;
    /**
     * <code>optional string target_job_name = 12;</code>
     */
    public boolean hasTargetJobName() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional string target_job_name = 12;</code>
     */
    public java.lang.String getTargetJobName() {
      java.lang.Object ref = targetJobName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          targetJobName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string target_job_name = 12;</code>
     */
    public com.google.protobuf.ByteString
        getTargetJobNameBytes() {
      java.lang.Object ref = targetJobName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        targetJobName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SEQ_NUM_FIELD_NUMBER = 24;
    private int seqNum_;
    /**
     * <code>optional int32 seq_num = 24;</code>
     */
    public boolean hasSeqNum() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional int32 seq_num = 24;</code>
     */
    public int getSeqNum() {
      return seqNum_;
    }

    public static final int ERESULT_FIELD_NUMBER = 13;
    private int eresult_;
    /**
     * <code>optional int32 eresult = 13 [default = 2];</code>
     */
    public boolean hasEresult() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional int32 eresult = 13 [default = 2];</code>
     */
    public int getEresult() {
      return eresult_;
    }

    public static final int ERROR_MESSAGE_FIELD_NUMBER = 14;
    private volatile java.lang.Object errorMessage_;
    /**
     * <code>optional string error_message = 14;</code>
     */
    public boolean hasErrorMessage() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional string error_message = 14;</code>
     */
    public java.lang.String getErrorMessage() {
      java.lang.Object ref = errorMessage_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          errorMessage_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string error_message = 14;</code>
     */
    public com.google.protobuf.ByteString
        getErrorMessageBytes() {
      java.lang.Object ref = errorMessage_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IP_FIELD_NUMBER = 15;
    private int ip_;
    /**
     * <code>optional uint32 ip = 15;</code>
     */
    public boolean hasIp() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    /**
     * <code>optional uint32 ip = 15;</code>
     */
    public int getIp() {
      return ip_;
    }

    public static final int AUTH_ACCOUNT_FLAGS_FIELD_NUMBER = 16;
    private int authAccountFlags_;
    /**
     * <code>optional uint32 auth_account_flags = 16;</code>
     */
    public boolean hasAuthAccountFlags() {
      return ((bitField0_ & 0x00000400) == 0x00000400);
    }
    /**
     * <code>optional uint32 auth_account_flags = 16;</code>
     */
    public int getAuthAccountFlags() {
      return authAccountFlags_;
    }

    public static final int TOKEN_SOURCE_FIELD_NUMBER = 22;
    private int tokenSource_;
    /**
     * <code>optional uint32 token_source = 22;</code>
     */
    public boolean hasTokenSource() {
      return ((bitField0_ & 0x00000800) == 0x00000800);
    }
    /**
     * <code>optional uint32 token_source = 22;</code>
     */
    public int getTokenSource() {
      return tokenSource_;
    }

    public static final int ADMIN_SPOOFING_USER_FIELD_NUMBER = 23;
    private boolean adminSpoofingUser_;
    /**
     * <code>optional bool admin_spoofing_user = 23;</code>
     */
    public boolean hasAdminSpoofingUser() {
      return ((bitField0_ & 0x00001000) == 0x00001000);
    }
    /**
     * <code>optional bool admin_spoofing_user = 23;</code>
     */
    public boolean getAdminSpoofingUser() {
      return adminSpoofingUser_;
    }

    public static final int TRANSPORT_ERROR_FIELD_NUMBER = 17;
    private int transportError_;
    /**
     * <code>optional int32 transport_error = 17 [default = 1];</code>
     */
    public boolean hasTransportError() {
      return ((bitField0_ & 0x00002000) == 0x00002000);
    }
    /**
     * <code>optional int32 transport_error = 17 [default = 1];</code>
     */
    public int getTransportError() {
      return transportError_;
    }

    public static final int MESSAGEID_FIELD_NUMBER = 18;
    private long messageid_;
    /**
     * <code>optional uint64 messageid = 18 [default = 18446744073709551615];</code>
     */
    public boolean hasMessageid() {
      return ((bitField0_ & 0x00004000) == 0x00004000);
    }
    /**
     * <code>optional uint64 messageid = 18 [default = 18446744073709551615];</code>
     */
    public long getMessageid() {
      return messageid_;
    }

    public static final int PUBLISHER_GROUP_ID_FIELD_NUMBER = 19;
    private int publisherGroupId_;
    /**
     * <code>optional uint32 publisher_group_id = 19;</code>
     */
    public boolean hasPublisherGroupId() {
      return ((bitField0_ & 0x00008000) == 0x00008000);
    }
    /**
     * <code>optional uint32 publisher_group_id = 19;</code>
     */
    public int getPublisherGroupId() {
      return publisherGroupId_;
    }

    public static final int SYSID_FIELD_NUMBER = 20;
    private int sysid_;
    /**
     * <code>optional uint32 sysid = 20;</code>
     */
    public boolean hasSysid() {
      return ((bitField0_ & 0x00010000) == 0x00010000);
    }
    /**
     * <code>optional uint32 sysid = 20;</code>
     */
    public int getSysid() {
      return sysid_;
    }

    public static final int TRACE_TAG_FIELD_NUMBER = 21;
    private long traceTag_;
    /**
     * <code>optional uint64 trace_tag = 21;</code>
     */
    public boolean hasTraceTag() {
      return ((bitField0_ & 0x00020000) == 0x00020000);
    }
    /**
     * <code>optional uint64 trace_tag = 21;</code>
     */
    public long getTraceTag() {
      return traceTag_;
    }

    public static final int WEBAPI_KEY_ID_FIELD_NUMBER = 25;
    private int webapiKeyId_;
    /**
     * <code>optional uint32 webapi_key_id = 25;</code>
     */
    public boolean hasWebapiKeyId() {
      return ((bitField0_ & 0x00040000) == 0x00040000);
    }
    /**
     * <code>optional uint32 webapi_key_id = 25;</code>
     */
    public int getWebapiKeyId() {
      return webapiKeyId_;
    }

    public static final int IS_FROM_EXTERNAL_SOURCE_FIELD_NUMBER = 26;
    private boolean isFromExternalSource_;
    /**
     * <code>optional bool is_from_external_source = 26;</code>
     */
    public boolean hasIsFromExternalSource() {
      return ((bitField0_ & 0x00080000) == 0x00080000);
    }
    /**
     * <code>optional bool is_from_external_source = 26;</code>
     */
    public boolean getIsFromExternalSource() {
      return isFromExternalSource_;
    }

    public static final int FORWARD_TO_SYSID_FIELD_NUMBER = 27;
    private java.util.List<java.lang.Integer> forwardToSysid_;
    /**
     * <code>repeated uint32 forward_to_sysid = 27;</code>
     */
    public java.util.List<java.lang.Integer>
        getForwardToSysidList() {
      return forwardToSysid_;
    }
    /**
     * <code>repeated uint32 forward_to_sysid = 27;</code>
     */
    public int getForwardToSysidCount() {
      return forwardToSysid_.size();
    }
    /**
     * <code>repeated uint32 forward_to_sysid = 27;</code>
     */
    public int getForwardToSysid(int index) {
      return forwardToSysid_.get(index);
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
        output.writeFixed64(1, steamid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, clientSessionid_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(3, routingAppid_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeFixed64(10, jobidSource_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeFixed64(11, jobidTarget_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 12, targetJobName_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeInt32(13, eresult_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 14, errorMessage_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeUInt32(15, ip_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        output.writeUInt32(16, authAccountFlags_);
      }
      if (((bitField0_ & 0x00002000) == 0x00002000)) {
        output.writeInt32(17, transportError_);
      }
      if (((bitField0_ & 0x00004000) == 0x00004000)) {
        output.writeUInt64(18, messageid_);
      }
      if (((bitField0_ & 0x00008000) == 0x00008000)) {
        output.writeUInt32(19, publisherGroupId_);
      }
      if (((bitField0_ & 0x00010000) == 0x00010000)) {
        output.writeUInt32(20, sysid_);
      }
      if (((bitField0_ & 0x00020000) == 0x00020000)) {
        output.writeUInt64(21, traceTag_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        output.writeUInt32(22, tokenSource_);
      }
      if (((bitField0_ & 0x00001000) == 0x00001000)) {
        output.writeBool(23, adminSpoofingUser_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt32(24, seqNum_);
      }
      if (((bitField0_ & 0x00040000) == 0x00040000)) {
        output.writeUInt32(25, webapiKeyId_);
      }
      if (((bitField0_ & 0x00080000) == 0x00080000)) {
        output.writeBool(26, isFromExternalSource_);
      }
      for (int i = 0; i < forwardToSysid_.size(); i++) {
        output.writeUInt32(27, forwardToSysid_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed64Size(1, steamid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, clientSessionid_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, routingAppid_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed64Size(10, jobidSource_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed64Size(11, jobidTarget_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, targetJobName_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(13, eresult_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(14, errorMessage_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, ip_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(16, authAccountFlags_);
      }
      if (((bitField0_ & 0x00002000) == 0x00002000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(17, transportError_);
      }
      if (((bitField0_ & 0x00004000) == 0x00004000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(18, messageid_);
      }
      if (((bitField0_ & 0x00008000) == 0x00008000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(19, publisherGroupId_);
      }
      if (((bitField0_ & 0x00010000) == 0x00010000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(20, sysid_);
      }
      if (((bitField0_ & 0x00020000) == 0x00020000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(21, traceTag_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(22, tokenSource_);
      }
      if (((bitField0_ & 0x00001000) == 0x00001000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(23, adminSpoofingUser_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(24, seqNum_);
      }
      if (((bitField0_ & 0x00040000) == 0x00040000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(25, webapiKeyId_);
      }
      if (((bitField0_ & 0x00080000) == 0x00080000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(26, isFromExternalSource_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < forwardToSysid_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(forwardToSysid_.get(i));
        }
        size += dataSize;
        size += 2 * getForwardToSysidList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SteammessagesBase.CMsgProtoBufHeader)) {
        return super.equals(obj);
      }
      SteammessagesBase.CMsgProtoBufHeader other = (SteammessagesBase.CMsgProtoBufHeader) obj;

      boolean result = true;
      result = result && (hasSteamid() == other.hasSteamid());
      if (hasSteamid()) {
        result = result && (getSteamid()
            == other.getSteamid());
      }
      result = result && (hasClientSessionid() == other.hasClientSessionid());
      if (hasClientSessionid()) {
        result = result && (getClientSessionid()
            == other.getClientSessionid());
      }
      result = result && (hasRoutingAppid() == other.hasRoutingAppid());
      if (hasRoutingAppid()) {
        result = result && (getRoutingAppid()
            == other.getRoutingAppid());
      }
      result = result && (hasJobidSource() == other.hasJobidSource());
      if (hasJobidSource()) {
        result = result && (getJobidSource()
            == other.getJobidSource());
      }
      result = result && (hasJobidTarget() == other.hasJobidTarget());
      if (hasJobidTarget()) {
        result = result && (getJobidTarget()
            == other.getJobidTarget());
      }
      result = result && (hasTargetJobName() == other.hasTargetJobName());
      if (hasTargetJobName()) {
        result = result && getTargetJobName()
            .equals(other.getTargetJobName());
      }
      result = result && (hasSeqNum() == other.hasSeqNum());
      if (hasSeqNum()) {
        result = result && (getSeqNum()
            == other.getSeqNum());
      }
      result = result && (hasEresult() == other.hasEresult());
      if (hasEresult()) {
        result = result && (getEresult()
            == other.getEresult());
      }
      result = result && (hasErrorMessage() == other.hasErrorMessage());
      if (hasErrorMessage()) {
        result = result && getErrorMessage()
            .equals(other.getErrorMessage());
      }
      result = result && (hasIp() == other.hasIp());
      if (hasIp()) {
        result = result && (getIp()
            == other.getIp());
      }
      result = result && (hasAuthAccountFlags() == other.hasAuthAccountFlags());
      if (hasAuthAccountFlags()) {
        result = result && (getAuthAccountFlags()
            == other.getAuthAccountFlags());
      }
      result = result && (hasTokenSource() == other.hasTokenSource());
      if (hasTokenSource()) {
        result = result && (getTokenSource()
            == other.getTokenSource());
      }
      result = result && (hasAdminSpoofingUser() == other.hasAdminSpoofingUser());
      if (hasAdminSpoofingUser()) {
        result = result && (getAdminSpoofingUser()
            == other.getAdminSpoofingUser());
      }
      result = result && (hasTransportError() == other.hasTransportError());
      if (hasTransportError()) {
        result = result && (getTransportError()
            == other.getTransportError());
      }
      result = result && (hasMessageid() == other.hasMessageid());
      if (hasMessageid()) {
        result = result && (getMessageid()
            == other.getMessageid());
      }
      result = result && (hasPublisherGroupId() == other.hasPublisherGroupId());
      if (hasPublisherGroupId()) {
        result = result && (getPublisherGroupId()
            == other.getPublisherGroupId());
      }
      result = result && (hasSysid() == other.hasSysid());
      if (hasSysid()) {
        result = result && (getSysid()
            == other.getSysid());
      }
      result = result && (hasTraceTag() == other.hasTraceTag());
      if (hasTraceTag()) {
        result = result && (getTraceTag()
            == other.getTraceTag());
      }
      result = result && (hasWebapiKeyId() == other.hasWebapiKeyId());
      if (hasWebapiKeyId()) {
        result = result && (getWebapiKeyId()
            == other.getWebapiKeyId());
      }
      result = result && (hasIsFromExternalSource() == other.hasIsFromExternalSource());
      if (hasIsFromExternalSource()) {
        result = result && (getIsFromExternalSource()
            == other.getIsFromExternalSource());
      }
      result = result && getForwardToSysidList()
          .equals(other.getForwardToSysidList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSteamid()) {
        hash = (37 * hash) + STEAMID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getSteamid());
      }
      if (hasClientSessionid()) {
        hash = (37 * hash) + CLIENT_SESSIONID_FIELD_NUMBER;
        hash = (53 * hash) + getClientSessionid();
      }
      if (hasRoutingAppid()) {
        hash = (37 * hash) + ROUTING_APPID_FIELD_NUMBER;
        hash = (53 * hash) + getRoutingAppid();
      }
      if (hasJobidSource()) {
        hash = (37 * hash) + JOBID_SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getJobidSource());
      }
      if (hasJobidTarget()) {
        hash = (37 * hash) + JOBID_TARGET_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getJobidTarget());
      }
      if (hasTargetJobName()) {
        hash = (37 * hash) + TARGET_JOB_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getTargetJobName().hashCode();
      }
      if (hasSeqNum()) {
        hash = (37 * hash) + SEQ_NUM_FIELD_NUMBER;
        hash = (53 * hash) + getSeqNum();
      }
      if (hasEresult()) {
        hash = (37 * hash) + ERESULT_FIELD_NUMBER;
        hash = (53 * hash) + getEresult();
      }
      if (hasErrorMessage()) {
        hash = (37 * hash) + ERROR_MESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getErrorMessage().hashCode();
      }
      if (hasIp()) {
        hash = (37 * hash) + IP_FIELD_NUMBER;
        hash = (53 * hash) + getIp();
      }
      if (hasAuthAccountFlags()) {
        hash = (37 * hash) + AUTH_ACCOUNT_FLAGS_FIELD_NUMBER;
        hash = (53 * hash) + getAuthAccountFlags();
      }
      if (hasTokenSource()) {
        hash = (37 * hash) + TOKEN_SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getTokenSource();
      }
      if (hasAdminSpoofingUser()) {
        hash = (37 * hash) + ADMIN_SPOOFING_USER_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getAdminSpoofingUser());
      }
      if (hasTransportError()) {
        hash = (37 * hash) + TRANSPORT_ERROR_FIELD_NUMBER;
        hash = (53 * hash) + getTransportError();
      }
      if (hasMessageid()) {
        hash = (37 * hash) + MESSAGEID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getMessageid());
      }
      if (hasPublisherGroupId()) {
        hash = (37 * hash) + PUBLISHER_GROUP_ID_FIELD_NUMBER;
        hash = (53 * hash) + getPublisherGroupId();
      }
      if (hasSysid()) {
        hash = (37 * hash) + SYSID_FIELD_NUMBER;
        hash = (53 * hash) + getSysid();
      }
      if (hasTraceTag()) {
        hash = (37 * hash) + TRACE_TAG_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getTraceTag());
      }
      if (hasWebapiKeyId()) {
        hash = (37 * hash) + WEBAPI_KEY_ID_FIELD_NUMBER;
        hash = (53 * hash) + getWebapiKeyId();
      }
      if (hasIsFromExternalSource()) {
        hash = (37 * hash) + IS_FROM_EXTERNAL_SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getIsFromExternalSource());
      }
      if (getForwardToSysidCount() > 0) {
        hash = (37 * hash) + FORWARD_TO_SYSID_FIELD_NUMBER;
        hash = (53 * hash) + getForwardToSysidList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SteammessagesBase.CMsgProtoBufHeader parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesBase.CMsgProtoBufHeader parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesBase.CMsgProtoBufHeader parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesBase.CMsgProtoBufHeader parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesBase.CMsgProtoBufHeader parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesBase.CMsgProtoBufHeader parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesBase.CMsgProtoBufHeader parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesBase.CMsgProtoBufHeader parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesBase.CMsgProtoBufHeader parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SteammessagesBase.CMsgProtoBufHeader parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesBase.CMsgProtoBufHeader parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesBase.CMsgProtoBufHeader parseFrom(
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
    public static Builder newBuilder(SteammessagesBase.CMsgProtoBufHeader prototype) {
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
     * Protobuf type {@code CMsgProtoBufHeader}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CMsgProtoBufHeader)
        SteammessagesBase.CMsgProtoBufHeaderOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SteammessagesBase.internal_static_CMsgProtoBufHeader_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SteammessagesBase.internal_static_CMsgProtoBufHeader_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SteammessagesBase.CMsgProtoBufHeader.class, SteammessagesBase.CMsgProtoBufHeader.Builder.class);
      }

      // Construct using SteammessagesBase.CMsgProtoBufHeader.newBuilder()
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
        steamid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        clientSessionid_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        routingAppid_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        jobidSource_ = -1L;
        bitField0_ = (bitField0_ & ~0x00000008);
        jobidTarget_ = -1L;
        bitField0_ = (bitField0_ & ~0x00000010);
        targetJobName_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        seqNum_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        eresult_ = 2;
        bitField0_ = (bitField0_ & ~0x00000080);
        errorMessage_ = "";
        bitField0_ = (bitField0_ & ~0x00000100);
        ip_ = 0;
        bitField0_ = (bitField0_ & ~0x00000200);
        authAccountFlags_ = 0;
        bitField0_ = (bitField0_ & ~0x00000400);
        tokenSource_ = 0;
        bitField0_ = (bitField0_ & ~0x00000800);
        adminSpoofingUser_ = false;
        bitField0_ = (bitField0_ & ~0x00001000);
        transportError_ = 1;
        bitField0_ = (bitField0_ & ~0x00002000);
        messageid_ = -1L;
        bitField0_ = (bitField0_ & ~0x00004000);
        publisherGroupId_ = 0;
        bitField0_ = (bitField0_ & ~0x00008000);
        sysid_ = 0;
        bitField0_ = (bitField0_ & ~0x00010000);
        traceTag_ = 0L;
        bitField0_ = (bitField0_ & ~0x00020000);
        webapiKeyId_ = 0;
        bitField0_ = (bitField0_ & ~0x00040000);
        isFromExternalSource_ = false;
        bitField0_ = (bitField0_ & ~0x00080000);
        forwardToSysid_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00100000);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SteammessagesBase.internal_static_CMsgProtoBufHeader_descriptor;
      }

      public SteammessagesBase.CMsgProtoBufHeader getDefaultInstanceForType() {
        return SteammessagesBase.CMsgProtoBufHeader.getDefaultInstance();
      }

      public SteammessagesBase.CMsgProtoBufHeader build() {
        SteammessagesBase.CMsgProtoBufHeader result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SteammessagesBase.CMsgProtoBufHeader buildPartial() {
        SteammessagesBase.CMsgProtoBufHeader result = new SteammessagesBase.CMsgProtoBufHeader(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.steamid_ = steamid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.clientSessionid_ = clientSessionid_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.routingAppid_ = routingAppid_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.jobidSource_ = jobidSource_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.jobidTarget_ = jobidTarget_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.targetJobName_ = targetJobName_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.seqNum_ = seqNum_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.eresult_ = eresult_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.errorMessage_ = errorMessage_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.ip_ = ip_;
        if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
          to_bitField0_ |= 0x00000400;
        }
        result.authAccountFlags_ = authAccountFlags_;
        if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
          to_bitField0_ |= 0x00000800;
        }
        result.tokenSource_ = tokenSource_;
        if (((from_bitField0_ & 0x00001000) == 0x00001000)) {
          to_bitField0_ |= 0x00001000;
        }
        result.adminSpoofingUser_ = adminSpoofingUser_;
        if (((from_bitField0_ & 0x00002000) == 0x00002000)) {
          to_bitField0_ |= 0x00002000;
        }
        result.transportError_ = transportError_;
        if (((from_bitField0_ & 0x00004000) == 0x00004000)) {
          to_bitField0_ |= 0x00004000;
        }
        result.messageid_ = messageid_;
        if (((from_bitField0_ & 0x00008000) == 0x00008000)) {
          to_bitField0_ |= 0x00008000;
        }
        result.publisherGroupId_ = publisherGroupId_;
        if (((from_bitField0_ & 0x00010000) == 0x00010000)) {
          to_bitField0_ |= 0x00010000;
        }
        result.sysid_ = sysid_;
        if (((from_bitField0_ & 0x00020000) == 0x00020000)) {
          to_bitField0_ |= 0x00020000;
        }
        result.traceTag_ = traceTag_;
        if (((from_bitField0_ & 0x00040000) == 0x00040000)) {
          to_bitField0_ |= 0x00040000;
        }
        result.webapiKeyId_ = webapiKeyId_;
        if (((from_bitField0_ & 0x00080000) == 0x00080000)) {
          to_bitField0_ |= 0x00080000;
        }
        result.isFromExternalSource_ = isFromExternalSource_;
        if (((bitField0_ & 0x00100000) == 0x00100000)) {
          forwardToSysid_ = java.util.Collections.unmodifiableList(forwardToSysid_);
          bitField0_ = (bitField0_ & ~0x00100000);
        }
        result.forwardToSysid_ = forwardToSysid_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
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
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SteammessagesBase.CMsgProtoBufHeader) {
          return mergeFrom((SteammessagesBase.CMsgProtoBufHeader)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SteammessagesBase.CMsgProtoBufHeader other) {
        if (other == SteammessagesBase.CMsgProtoBufHeader.getDefaultInstance()) return this;
        if (other.hasSteamid()) {
          setSteamid(other.getSteamid());
        }
        if (other.hasClientSessionid()) {
          setClientSessionid(other.getClientSessionid());
        }
        if (other.hasRoutingAppid()) {
          setRoutingAppid(other.getRoutingAppid());
        }
        if (other.hasJobidSource()) {
          setJobidSource(other.getJobidSource());
        }
        if (other.hasJobidTarget()) {
          setJobidTarget(other.getJobidTarget());
        }
        if (other.hasTargetJobName()) {
          bitField0_ |= 0x00000020;
          targetJobName_ = other.targetJobName_;
          onChanged();
        }
        if (other.hasSeqNum()) {
          setSeqNum(other.getSeqNum());
        }
        if (other.hasEresult()) {
          setEresult(other.getEresult());
        }
        if (other.hasErrorMessage()) {
          bitField0_ |= 0x00000100;
          errorMessage_ = other.errorMessage_;
          onChanged();
        }
        if (other.hasIp()) {
          setIp(other.getIp());
        }
        if (other.hasAuthAccountFlags()) {
          setAuthAccountFlags(other.getAuthAccountFlags());
        }
        if (other.hasTokenSource()) {
          setTokenSource(other.getTokenSource());
        }
        if (other.hasAdminSpoofingUser()) {
          setAdminSpoofingUser(other.getAdminSpoofingUser());
        }
        if (other.hasTransportError()) {
          setTransportError(other.getTransportError());
        }
        if (other.hasMessageid()) {
          setMessageid(other.getMessageid());
        }
        if (other.hasPublisherGroupId()) {
          setPublisherGroupId(other.getPublisherGroupId());
        }
        if (other.hasSysid()) {
          setSysid(other.getSysid());
        }
        if (other.hasTraceTag()) {
          setTraceTag(other.getTraceTag());
        }
        if (other.hasWebapiKeyId()) {
          setWebapiKeyId(other.getWebapiKeyId());
        }
        if (other.hasIsFromExternalSource()) {
          setIsFromExternalSource(other.getIsFromExternalSource());
        }
        if (!other.forwardToSysid_.isEmpty()) {
          if (forwardToSysid_.isEmpty()) {
            forwardToSysid_ = other.forwardToSysid_;
            bitField0_ = (bitField0_ & ~0x00100000);
          } else {
            ensureForwardToSysidIsMutable();
            forwardToSysid_.addAll(other.forwardToSysid_);
          }
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
        SteammessagesBase.CMsgProtoBufHeader parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SteammessagesBase.CMsgProtoBufHeader) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long steamid_ ;
      /**
       * <code>optional fixed64 steamid = 1;</code>
       */
      public boolean hasSteamid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional fixed64 steamid = 1;</code>
       */
      public long getSteamid() {
        return steamid_;
      }
      /**
       * <code>optional fixed64 steamid = 1;</code>
       */
      public Builder setSteamid(long value) {
        bitField0_ |= 0x00000001;
        steamid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional fixed64 steamid = 1;</code>
       */
      public Builder clearSteamid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        steamid_ = 0L;
        onChanged();
        return this;
      }

      private int clientSessionid_ ;
      /**
       * <code>optional int32 client_sessionid = 2;</code>
       */
      public boolean hasClientSessionid() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 client_sessionid = 2;</code>
       */
      public int getClientSessionid() {
        return clientSessionid_;
      }
      /**
       * <code>optional int32 client_sessionid = 2;</code>
       */
      public Builder setClientSessionid(int value) {
        bitField0_ |= 0x00000002;
        clientSessionid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 client_sessionid = 2;</code>
       */
      public Builder clearClientSessionid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        clientSessionid_ = 0;
        onChanged();
        return this;
      }

      private int routingAppid_ ;
      /**
       * <code>optional uint32 routing_appid = 3;</code>
       */
      public boolean hasRoutingAppid() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional uint32 routing_appid = 3;</code>
       */
      public int getRoutingAppid() {
        return routingAppid_;
      }
      /**
       * <code>optional uint32 routing_appid = 3;</code>
       */
      public Builder setRoutingAppid(int value) {
        bitField0_ |= 0x00000004;
        routingAppid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 routing_appid = 3;</code>
       */
      public Builder clearRoutingAppid() {
        bitField0_ = (bitField0_ & ~0x00000004);
        routingAppid_ = 0;
        onChanged();
        return this;
      }

      private long jobidSource_ = -1L;
      /**
       * <code>optional fixed64 jobid_source = 10 [default = 18446744073709551615];</code>
       */
      public boolean hasJobidSource() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional fixed64 jobid_source = 10 [default = 18446744073709551615];</code>
       */
      public long getJobidSource() {
        return jobidSource_;
      }
      /**
       * <code>optional fixed64 jobid_source = 10 [default = 18446744073709551615];</code>
       */
      public Builder setJobidSource(long value) {
        bitField0_ |= 0x00000008;
        jobidSource_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional fixed64 jobid_source = 10 [default = 18446744073709551615];</code>
       */
      public Builder clearJobidSource() {
        bitField0_ = (bitField0_ & ~0x00000008);
        jobidSource_ = -1L;
        onChanged();
        return this;
      }

      private long jobidTarget_ = -1L;
      /**
       * <code>optional fixed64 jobid_target = 11 [default = 18446744073709551615];</code>
       */
      public boolean hasJobidTarget() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional fixed64 jobid_target = 11 [default = 18446744073709551615];</code>
       */
      public long getJobidTarget() {
        return jobidTarget_;
      }
      /**
       * <code>optional fixed64 jobid_target = 11 [default = 18446744073709551615];</code>
       */
      public Builder setJobidTarget(long value) {
        bitField0_ |= 0x00000010;
        jobidTarget_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional fixed64 jobid_target = 11 [default = 18446744073709551615];</code>
       */
      public Builder clearJobidTarget() {
        bitField0_ = (bitField0_ & ~0x00000010);
        jobidTarget_ = -1L;
        onChanged();
        return this;
      }

      private java.lang.Object targetJobName_ = "";
      /**
       * <code>optional string target_job_name = 12;</code>
       */
      public boolean hasTargetJobName() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional string target_job_name = 12;</code>
       */
      public java.lang.String getTargetJobName() {
        java.lang.Object ref = targetJobName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            targetJobName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string target_job_name = 12;</code>
       */
      public com.google.protobuf.ByteString
          getTargetJobNameBytes() {
        java.lang.Object ref = targetJobName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          targetJobName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string target_job_name = 12;</code>
       */
      public Builder setTargetJobName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        targetJobName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string target_job_name = 12;</code>
       */
      public Builder clearTargetJobName() {
        bitField0_ = (bitField0_ & ~0x00000020);
        targetJobName_ = getDefaultInstance().getTargetJobName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string target_job_name = 12;</code>
       */
      public Builder setTargetJobNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        targetJobName_ = value;
        onChanged();
        return this;
      }

      private int seqNum_ ;
      /**
       * <code>optional int32 seq_num = 24;</code>
       */
      public boolean hasSeqNum() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional int32 seq_num = 24;</code>
       */
      public int getSeqNum() {
        return seqNum_;
      }
      /**
       * <code>optional int32 seq_num = 24;</code>
       */
      public Builder setSeqNum(int value) {
        bitField0_ |= 0x00000040;
        seqNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 seq_num = 24;</code>
       */
      public Builder clearSeqNum() {
        bitField0_ = (bitField0_ & ~0x00000040);
        seqNum_ = 0;
        onChanged();
        return this;
      }

      private int eresult_ = 2;
      /**
       * <code>optional int32 eresult = 13 [default = 2];</code>
       */
      public boolean hasEresult() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional int32 eresult = 13 [default = 2];</code>
       */
      public int getEresult() {
        return eresult_;
      }
      /**
       * <code>optional int32 eresult = 13 [default = 2];</code>
       */
      public Builder setEresult(int value) {
        bitField0_ |= 0x00000080;
        eresult_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 eresult = 13 [default = 2];</code>
       */
      public Builder clearEresult() {
        bitField0_ = (bitField0_ & ~0x00000080);
        eresult_ = 2;
        onChanged();
        return this;
      }

      private java.lang.Object errorMessage_ = "";
      /**
       * <code>optional string error_message = 14;</code>
       */
      public boolean hasErrorMessage() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>optional string error_message = 14;</code>
       */
      public java.lang.String getErrorMessage() {
        java.lang.Object ref = errorMessage_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            errorMessage_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string error_message = 14;</code>
       */
      public com.google.protobuf.ByteString
          getErrorMessageBytes() {
        java.lang.Object ref = errorMessage_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          errorMessage_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string error_message = 14;</code>
       */
      public Builder setErrorMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        errorMessage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string error_message = 14;</code>
       */
      public Builder clearErrorMessage() {
        bitField0_ = (bitField0_ & ~0x00000100);
        errorMessage_ = getDefaultInstance().getErrorMessage();
        onChanged();
        return this;
      }
      /**
       * <code>optional string error_message = 14;</code>
       */
      public Builder setErrorMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        errorMessage_ = value;
        onChanged();
        return this;
      }

      private int ip_ ;
      /**
       * <code>optional uint32 ip = 15;</code>
       */
      public boolean hasIp() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      /**
       * <code>optional uint32 ip = 15;</code>
       */
      public int getIp() {
        return ip_;
      }
      /**
       * <code>optional uint32 ip = 15;</code>
       */
      public Builder setIp(int value) {
        bitField0_ |= 0x00000200;
        ip_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 ip = 15;</code>
       */
      public Builder clearIp() {
        bitField0_ = (bitField0_ & ~0x00000200);
        ip_ = 0;
        onChanged();
        return this;
      }

      private int authAccountFlags_ ;
      /**
       * <code>optional uint32 auth_account_flags = 16;</code>
       */
      public boolean hasAuthAccountFlags() {
        return ((bitField0_ & 0x00000400) == 0x00000400);
      }
      /**
       * <code>optional uint32 auth_account_flags = 16;</code>
       */
      public int getAuthAccountFlags() {
        return authAccountFlags_;
      }
      /**
       * <code>optional uint32 auth_account_flags = 16;</code>
       */
      public Builder setAuthAccountFlags(int value) {
        bitField0_ |= 0x00000400;
        authAccountFlags_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 auth_account_flags = 16;</code>
       */
      public Builder clearAuthAccountFlags() {
        bitField0_ = (bitField0_ & ~0x00000400);
        authAccountFlags_ = 0;
        onChanged();
        return this;
      }

      private int tokenSource_ ;
      /**
       * <code>optional uint32 token_source = 22;</code>
       */
      public boolean hasTokenSource() {
        return ((bitField0_ & 0x00000800) == 0x00000800);
      }
      /**
       * <code>optional uint32 token_source = 22;</code>
       */
      public int getTokenSource() {
        return tokenSource_;
      }
      /**
       * <code>optional uint32 token_source = 22;</code>
       */
      public Builder setTokenSource(int value) {
        bitField0_ |= 0x00000800;
        tokenSource_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 token_source = 22;</code>
       */
      public Builder clearTokenSource() {
        bitField0_ = (bitField0_ & ~0x00000800);
        tokenSource_ = 0;
        onChanged();
        return this;
      }

      private boolean adminSpoofingUser_ ;
      /**
       * <code>optional bool admin_spoofing_user = 23;</code>
       */
      public boolean hasAdminSpoofingUser() {
        return ((bitField0_ & 0x00001000) == 0x00001000);
      }
      /**
       * <code>optional bool admin_spoofing_user = 23;</code>
       */
      public boolean getAdminSpoofingUser() {
        return adminSpoofingUser_;
      }
      /**
       * <code>optional bool admin_spoofing_user = 23;</code>
       */
      public Builder setAdminSpoofingUser(boolean value) {
        bitField0_ |= 0x00001000;
        adminSpoofingUser_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool admin_spoofing_user = 23;</code>
       */
      public Builder clearAdminSpoofingUser() {
        bitField0_ = (bitField0_ & ~0x00001000);
        adminSpoofingUser_ = false;
        onChanged();
        return this;
      }

      private int transportError_ = 1;
      /**
       * <code>optional int32 transport_error = 17 [default = 1];</code>
       */
      public boolean hasTransportError() {
        return ((bitField0_ & 0x00002000) == 0x00002000);
      }
      /**
       * <code>optional int32 transport_error = 17 [default = 1];</code>
       */
      public int getTransportError() {
        return transportError_;
      }
      /**
       * <code>optional int32 transport_error = 17 [default = 1];</code>
       */
      public Builder setTransportError(int value) {
        bitField0_ |= 0x00002000;
        transportError_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 transport_error = 17 [default = 1];</code>
       */
      public Builder clearTransportError() {
        bitField0_ = (bitField0_ & ~0x00002000);
        transportError_ = 1;
        onChanged();
        return this;
      }

      private long messageid_ = -1L;
      /**
       * <code>optional uint64 messageid = 18 [default = 18446744073709551615];</code>
       */
      public boolean hasMessageid() {
        return ((bitField0_ & 0x00004000) == 0x00004000);
      }
      /**
       * <code>optional uint64 messageid = 18 [default = 18446744073709551615];</code>
       */
      public long getMessageid() {
        return messageid_;
      }
      /**
       * <code>optional uint64 messageid = 18 [default = 18446744073709551615];</code>
       */
      public Builder setMessageid(long value) {
        bitField0_ |= 0x00004000;
        messageid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 messageid = 18 [default = 18446744073709551615];</code>
       */
      public Builder clearMessageid() {
        bitField0_ = (bitField0_ & ~0x00004000);
        messageid_ = -1L;
        onChanged();
        return this;
      }

      private int publisherGroupId_ ;
      /**
       * <code>optional uint32 publisher_group_id = 19;</code>
       */
      public boolean hasPublisherGroupId() {
        return ((bitField0_ & 0x00008000) == 0x00008000);
      }
      /**
       * <code>optional uint32 publisher_group_id = 19;</code>
       */
      public int getPublisherGroupId() {
        return publisherGroupId_;
      }
      /**
       * <code>optional uint32 publisher_group_id = 19;</code>
       */
      public Builder setPublisherGroupId(int value) {
        bitField0_ |= 0x00008000;
        publisherGroupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 publisher_group_id = 19;</code>
       */
      public Builder clearPublisherGroupId() {
        bitField0_ = (bitField0_ & ~0x00008000);
        publisherGroupId_ = 0;
        onChanged();
        return this;
      }

      private int sysid_ ;
      /**
       * <code>optional uint32 sysid = 20;</code>
       */
      public boolean hasSysid() {
        return ((bitField0_ & 0x00010000) == 0x00010000);
      }
      /**
       * <code>optional uint32 sysid = 20;</code>
       */
      public int getSysid() {
        return sysid_;
      }
      /**
       * <code>optional uint32 sysid = 20;</code>
       */
      public Builder setSysid(int value) {
        bitField0_ |= 0x00010000;
        sysid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 sysid = 20;</code>
       */
      public Builder clearSysid() {
        bitField0_ = (bitField0_ & ~0x00010000);
        sysid_ = 0;
        onChanged();
        return this;
      }

      private long traceTag_ ;
      /**
       * <code>optional uint64 trace_tag = 21;</code>
       */
      public boolean hasTraceTag() {
        return ((bitField0_ & 0x00020000) == 0x00020000);
      }
      /**
       * <code>optional uint64 trace_tag = 21;</code>
       */
      public long getTraceTag() {
        return traceTag_;
      }
      /**
       * <code>optional uint64 trace_tag = 21;</code>
       */
      public Builder setTraceTag(long value) {
        bitField0_ |= 0x00020000;
        traceTag_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 trace_tag = 21;</code>
       */
      public Builder clearTraceTag() {
        bitField0_ = (bitField0_ & ~0x00020000);
        traceTag_ = 0L;
        onChanged();
        return this;
      }

      private int webapiKeyId_ ;
      /**
       * <code>optional uint32 webapi_key_id = 25;</code>
       */
      public boolean hasWebapiKeyId() {
        return ((bitField0_ & 0x00040000) == 0x00040000);
      }
      /**
       * <code>optional uint32 webapi_key_id = 25;</code>
       */
      public int getWebapiKeyId() {
        return webapiKeyId_;
      }
      /**
       * <code>optional uint32 webapi_key_id = 25;</code>
       */
      public Builder setWebapiKeyId(int value) {
        bitField0_ |= 0x00040000;
        webapiKeyId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 webapi_key_id = 25;</code>
       */
      public Builder clearWebapiKeyId() {
        bitField0_ = (bitField0_ & ~0x00040000);
        webapiKeyId_ = 0;
        onChanged();
        return this;
      }

      private boolean isFromExternalSource_ ;
      /**
       * <code>optional bool is_from_external_source = 26;</code>
       */
      public boolean hasIsFromExternalSource() {
        return ((bitField0_ & 0x00080000) == 0x00080000);
      }
      /**
       * <code>optional bool is_from_external_source = 26;</code>
       */
      public boolean getIsFromExternalSource() {
        return isFromExternalSource_;
      }
      /**
       * <code>optional bool is_from_external_source = 26;</code>
       */
      public Builder setIsFromExternalSource(boolean value) {
        bitField0_ |= 0x00080000;
        isFromExternalSource_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool is_from_external_source = 26;</code>
       */
      public Builder clearIsFromExternalSource() {
        bitField0_ = (bitField0_ & ~0x00080000);
        isFromExternalSource_ = false;
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Integer> forwardToSysid_ = java.util.Collections.emptyList();
      private void ensureForwardToSysidIsMutable() {
        if (!((bitField0_ & 0x00100000) == 0x00100000)) {
          forwardToSysid_ = new java.util.ArrayList<java.lang.Integer>(forwardToSysid_);
          bitField0_ |= 0x00100000;
         }
      }
      /**
       * <code>repeated uint32 forward_to_sysid = 27;</code>
       */
      public java.util.List<java.lang.Integer>
          getForwardToSysidList() {
        return java.util.Collections.unmodifiableList(forwardToSysid_);
      }
      /**
       * <code>repeated uint32 forward_to_sysid = 27;</code>
       */
      public int getForwardToSysidCount() {
        return forwardToSysid_.size();
      }
      /**
       * <code>repeated uint32 forward_to_sysid = 27;</code>
       */
      public int getForwardToSysid(int index) {
        return forwardToSysid_.get(index);
      }
      /**
       * <code>repeated uint32 forward_to_sysid = 27;</code>
       */
      public Builder setForwardToSysid(
          int index, int value) {
        ensureForwardToSysidIsMutable();
        forwardToSysid_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 forward_to_sysid = 27;</code>
       */
      public Builder addForwardToSysid(int value) {
        ensureForwardToSysidIsMutable();
        forwardToSysid_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 forward_to_sysid = 27;</code>
       */
      public Builder addAllForwardToSysid(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureForwardToSysidIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, forwardToSysid_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 forward_to_sysid = 27;</code>
       */
      public Builder clearForwardToSysid() {
        forwardToSysid_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00100000);
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


      // @@protoc_insertion_point(builder_scope:CMsgProtoBufHeader)
    }

    // @@protoc_insertion_point(class_scope:CMsgProtoBufHeader)
    private static final SteammessagesBase.CMsgProtoBufHeader DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SteammessagesBase.CMsgProtoBufHeader();
    }

    public static SteammessagesBase.CMsgProtoBufHeader getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CMsgProtoBufHeader>
        PARSER = new com.google.protobuf.AbstractParser<CMsgProtoBufHeader>() {
      public CMsgProtoBufHeader parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CMsgProtoBufHeader(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CMsgProtoBufHeader> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CMsgProtoBufHeader> getParserForType() {
      return PARSER;
    }

    public SteammessagesBase.CMsgProtoBufHeader getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CMsgMultiOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CMsgMulti)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint32 size_unzipped = 1;</code>
     */
    boolean hasSizeUnzipped();
    /**
     * <code>optional uint32 size_unzipped = 1;</code>
     */
    int getSizeUnzipped();

    /**
     * <code>optional bytes message_body = 2;</code>
     */
    boolean hasMessageBody();
    /**
     * <code>optional bytes message_body = 2;</code>
     */
    com.google.protobuf.ByteString getMessageBody();
  }
  /**
   * Protobuf type {@code CMsgMulti}
   */
  public  static final class CMsgMulti extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CMsgMulti)
      CMsgMultiOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CMsgMulti.newBuilder() to construct.
    private CMsgMulti(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CMsgMulti() {
      sizeUnzipped_ = 0;
      messageBody_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CMsgMulti(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              sizeUnzipped_ = input.readUInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              messageBody_ = input.readBytes();
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
      return SteammessagesBase.internal_static_CMsgMulti_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SteammessagesBase.internal_static_CMsgMulti_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SteammessagesBase.CMsgMulti.class, SteammessagesBase.CMsgMulti.Builder.class);
    }

    private int bitField0_;
    public static final int SIZE_UNZIPPED_FIELD_NUMBER = 1;
    private int sizeUnzipped_;
    /**
     * <code>optional uint32 size_unzipped = 1;</code>
     */
    public boolean hasSizeUnzipped() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint32 size_unzipped = 1;</code>
     */
    public int getSizeUnzipped() {
      return sizeUnzipped_;
    }

    public static final int MESSAGE_BODY_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString messageBody_;
    /**
     * <code>optional bytes message_body = 2;</code>
     */
    public boolean hasMessageBody() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bytes message_body = 2;</code>
     */
    public com.google.protobuf.ByteString getMessageBody() {
      return messageBody_;
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
        output.writeUInt32(1, sizeUnzipped_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, messageBody_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, sizeUnzipped_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, messageBody_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SteammessagesBase.CMsgMulti)) {
        return super.equals(obj);
      }
      SteammessagesBase.CMsgMulti other = (SteammessagesBase.CMsgMulti) obj;

      boolean result = true;
      result = result && (hasSizeUnzipped() == other.hasSizeUnzipped());
      if (hasSizeUnzipped()) {
        result = result && (getSizeUnzipped()
            == other.getSizeUnzipped());
      }
      result = result && (hasMessageBody() == other.hasMessageBody());
      if (hasMessageBody()) {
        result = result && getMessageBody()
            .equals(other.getMessageBody());
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
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSizeUnzipped()) {
        hash = (37 * hash) + SIZE_UNZIPPED_FIELD_NUMBER;
        hash = (53 * hash) + getSizeUnzipped();
      }
      if (hasMessageBody()) {
        hash = (37 * hash) + MESSAGE_BODY_FIELD_NUMBER;
        hash = (53 * hash) + getMessageBody().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SteammessagesBase.CMsgMulti parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesBase.CMsgMulti parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesBase.CMsgMulti parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesBase.CMsgMulti parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesBase.CMsgMulti parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesBase.CMsgMulti parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesBase.CMsgMulti parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesBase.CMsgMulti parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesBase.CMsgMulti parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SteammessagesBase.CMsgMulti parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesBase.CMsgMulti parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesBase.CMsgMulti parseFrom(
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
    public static Builder newBuilder(SteammessagesBase.CMsgMulti prototype) {
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
     * Protobuf type {@code CMsgMulti}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CMsgMulti)
        SteammessagesBase.CMsgMultiOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SteammessagesBase.internal_static_CMsgMulti_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SteammessagesBase.internal_static_CMsgMulti_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SteammessagesBase.CMsgMulti.class, SteammessagesBase.CMsgMulti.Builder.class);
      }

      // Construct using SteammessagesBase.CMsgMulti.newBuilder()
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
        sizeUnzipped_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        messageBody_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SteammessagesBase.internal_static_CMsgMulti_descriptor;
      }

      public SteammessagesBase.CMsgMulti getDefaultInstanceForType() {
        return SteammessagesBase.CMsgMulti.getDefaultInstance();
      }

      public SteammessagesBase.CMsgMulti build() {
        SteammessagesBase.CMsgMulti result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SteammessagesBase.CMsgMulti buildPartial() {
        SteammessagesBase.CMsgMulti result = new SteammessagesBase.CMsgMulti(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.sizeUnzipped_ = sizeUnzipped_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.messageBody_ = messageBody_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
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
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SteammessagesBase.CMsgMulti) {
          return mergeFrom((SteammessagesBase.CMsgMulti)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SteammessagesBase.CMsgMulti other) {
        if (other == SteammessagesBase.CMsgMulti.getDefaultInstance()) return this;
        if (other.hasSizeUnzipped()) {
          setSizeUnzipped(other.getSizeUnzipped());
        }
        if (other.hasMessageBody()) {
          setMessageBody(other.getMessageBody());
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
        SteammessagesBase.CMsgMulti parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SteammessagesBase.CMsgMulti) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int sizeUnzipped_ ;
      /**
       * <code>optional uint32 size_unzipped = 1;</code>
       */
      public boolean hasSizeUnzipped() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional uint32 size_unzipped = 1;</code>
       */
      public int getSizeUnzipped() {
        return sizeUnzipped_;
      }
      /**
       * <code>optional uint32 size_unzipped = 1;</code>
       */
      public Builder setSizeUnzipped(int value) {
        bitField0_ |= 0x00000001;
        sizeUnzipped_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 size_unzipped = 1;</code>
       */
      public Builder clearSizeUnzipped() {
        bitField0_ = (bitField0_ & ~0x00000001);
        sizeUnzipped_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString messageBody_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes message_body = 2;</code>
       */
      public boolean hasMessageBody() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional bytes message_body = 2;</code>
       */
      public com.google.protobuf.ByteString getMessageBody() {
        return messageBody_;
      }
      /**
       * <code>optional bytes message_body = 2;</code>
       */
      public Builder setMessageBody(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        messageBody_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes message_body = 2;</code>
       */
      public Builder clearMessageBody() {
        bitField0_ = (bitField0_ & ~0x00000002);
        messageBody_ = getDefaultInstance().getMessageBody();
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


      // @@protoc_insertion_point(builder_scope:CMsgMulti)
    }

    // @@protoc_insertion_point(class_scope:CMsgMulti)
    private static final SteammessagesBase.CMsgMulti DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SteammessagesBase.CMsgMulti();
    }

    public static SteammessagesBase.CMsgMulti getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CMsgMulti>
        PARSER = new com.google.protobuf.AbstractParser<CMsgMulti>() {
      public CMsgMulti parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CMsgMulti(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CMsgMulti> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CMsgMulti> getParserForType() {
      return PARSER;
    }

    public SteammessagesBase.CMsgMulti getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CMsgProtobufWrappedOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CMsgProtobufWrapped)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bytes message_body = 1;</code>
     */
    boolean hasMessageBody();
    /**
     * <code>optional bytes message_body = 1;</code>
     */
    com.google.protobuf.ByteString getMessageBody();
  }
  /**
   * Protobuf type {@code CMsgProtobufWrapped}
   */
  public  static final class CMsgProtobufWrapped extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CMsgProtobufWrapped)
      CMsgProtobufWrappedOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CMsgProtobufWrapped.newBuilder() to construct.
    private CMsgProtobufWrapped(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CMsgProtobufWrapped() {
      messageBody_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CMsgProtobufWrapped(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              messageBody_ = input.readBytes();
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
      return SteammessagesBase.internal_static_CMsgProtobufWrapped_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SteammessagesBase.internal_static_CMsgProtobufWrapped_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SteammessagesBase.CMsgProtobufWrapped.class, SteammessagesBase.CMsgProtobufWrapped.Builder.class);
    }

    private int bitField0_;
    public static final int MESSAGE_BODY_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString messageBody_;
    /**
     * <code>optional bytes message_body = 1;</code>
     */
    public boolean hasMessageBody() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bytes message_body = 1;</code>
     */
    public com.google.protobuf.ByteString getMessageBody() {
      return messageBody_;
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
        output.writeBytes(1, messageBody_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, messageBody_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SteammessagesBase.CMsgProtobufWrapped)) {
        return super.equals(obj);
      }
      SteammessagesBase.CMsgProtobufWrapped other = (SteammessagesBase.CMsgProtobufWrapped) obj;

      boolean result = true;
      result = result && (hasMessageBody() == other.hasMessageBody());
      if (hasMessageBody()) {
        result = result && getMessageBody()
            .equals(other.getMessageBody());
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
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMessageBody()) {
        hash = (37 * hash) + MESSAGE_BODY_FIELD_NUMBER;
        hash = (53 * hash) + getMessageBody().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SteammessagesBase.CMsgProtobufWrapped parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesBase.CMsgProtobufWrapped parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesBase.CMsgProtobufWrapped parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesBase.CMsgProtobufWrapped parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesBase.CMsgProtobufWrapped parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesBase.CMsgProtobufWrapped parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesBase.CMsgProtobufWrapped parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesBase.CMsgProtobufWrapped parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesBase.CMsgProtobufWrapped parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SteammessagesBase.CMsgProtobufWrapped parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesBase.CMsgProtobufWrapped parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesBase.CMsgProtobufWrapped parseFrom(
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
    public static Builder newBuilder(SteammessagesBase.CMsgProtobufWrapped prototype) {
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
     * Protobuf type {@code CMsgProtobufWrapped}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CMsgProtobufWrapped)
        SteammessagesBase.CMsgProtobufWrappedOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SteammessagesBase.internal_static_CMsgProtobufWrapped_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SteammessagesBase.internal_static_CMsgProtobufWrapped_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SteammessagesBase.CMsgProtobufWrapped.class, SteammessagesBase.CMsgProtobufWrapped.Builder.class);
      }

      // Construct using SteammessagesBase.CMsgProtobufWrapped.newBuilder()
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
        messageBody_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SteammessagesBase.internal_static_CMsgProtobufWrapped_descriptor;
      }

      public SteammessagesBase.CMsgProtobufWrapped getDefaultInstanceForType() {
        return SteammessagesBase.CMsgProtobufWrapped.getDefaultInstance();
      }

      public SteammessagesBase.CMsgProtobufWrapped build() {
        SteammessagesBase.CMsgProtobufWrapped result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SteammessagesBase.CMsgProtobufWrapped buildPartial() {
        SteammessagesBase.CMsgProtobufWrapped result = new SteammessagesBase.CMsgProtobufWrapped(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.messageBody_ = messageBody_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
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
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SteammessagesBase.CMsgProtobufWrapped) {
          return mergeFrom((SteammessagesBase.CMsgProtobufWrapped)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SteammessagesBase.CMsgProtobufWrapped other) {
        if (other == SteammessagesBase.CMsgProtobufWrapped.getDefaultInstance()) return this;
        if (other.hasMessageBody()) {
          setMessageBody(other.getMessageBody());
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
        SteammessagesBase.CMsgProtobufWrapped parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SteammessagesBase.CMsgProtobufWrapped) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.ByteString messageBody_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes message_body = 1;</code>
       */
      public boolean hasMessageBody() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional bytes message_body = 1;</code>
       */
      public com.google.protobuf.ByteString getMessageBody() {
        return messageBody_;
      }
      /**
       * <code>optional bytes message_body = 1;</code>
       */
      public Builder setMessageBody(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        messageBody_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes message_body = 1;</code>
       */
      public Builder clearMessageBody() {
        bitField0_ = (bitField0_ & ~0x00000001);
        messageBody_ = getDefaultInstance().getMessageBody();
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


      // @@protoc_insertion_point(builder_scope:CMsgProtobufWrapped)
    }

    // @@protoc_insertion_point(class_scope:CMsgProtobufWrapped)
    private static final SteammessagesBase.CMsgProtobufWrapped DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SteammessagesBase.CMsgProtobufWrapped();
    }

    public static SteammessagesBase.CMsgProtobufWrapped getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CMsgProtobufWrapped>
        PARSER = new com.google.protobuf.AbstractParser<CMsgProtobufWrapped>() {
      public CMsgProtobufWrapped parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CMsgProtobufWrapped(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CMsgProtobufWrapped> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CMsgProtobufWrapped> getParserForType() {
      return PARSER;
    }

    public SteammessagesBase.CMsgProtobufWrapped getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CMsgAuthTicketOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CMsgAuthTicket)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint32 estate = 1;</code>
     */
    boolean hasEstate();
    /**
     * <code>optional uint32 estate = 1;</code>
     */
    int getEstate();

    /**
     * <code>optional uint32 eresult = 2 [default = 2];</code>
     */
    boolean hasEresult();
    /**
     * <code>optional uint32 eresult = 2 [default = 2];</code>
     */
    int getEresult();

    /**
     * <code>optional fixed64 steamid = 3;</code>
     */
    boolean hasSteamid();
    /**
     * <code>optional fixed64 steamid = 3;</code>
     */
    long getSteamid();

    /**
     * <code>optional fixed64 gameid = 4;</code>
     */
    boolean hasGameid();
    /**
     * <code>optional fixed64 gameid = 4;</code>
     */
    long getGameid();

    /**
     * <code>optional uint32 h_steam_pipe = 5;</code>
     */
    boolean hasHSteamPipe();
    /**
     * <code>optional uint32 h_steam_pipe = 5;</code>
     */
    int getHSteamPipe();

    /**
     * <code>optional uint32 ticket_crc = 6;</code>
     */
    boolean hasTicketCrc();
    /**
     * <code>optional uint32 ticket_crc = 6;</code>
     */
    int getTicketCrc();

    /**
     * <code>optional bytes ticket = 7;</code>
     */
    boolean hasTicket();
    /**
     * <code>optional bytes ticket = 7;</code>
     */
    com.google.protobuf.ByteString getTicket();
  }
  /**
   * Protobuf type {@code CMsgAuthTicket}
   */
  public  static final class CMsgAuthTicket extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CMsgAuthTicket)
      CMsgAuthTicketOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CMsgAuthTicket.newBuilder() to construct.
    private CMsgAuthTicket(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CMsgAuthTicket() {
      estate_ = 0;
      eresult_ = 2;
      steamid_ = 0L;
      gameid_ = 0L;
      hSteamPipe_ = 0;
      ticketCrc_ = 0;
      ticket_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CMsgAuthTicket(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              estate_ = input.readUInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              eresult_ = input.readUInt32();
              break;
            }
            case 25: {
              bitField0_ |= 0x00000004;
              steamid_ = input.readFixed64();
              break;
            }
            case 33: {
              bitField0_ |= 0x00000008;
              gameid_ = input.readFixed64();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              hSteamPipe_ = input.readUInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              ticketCrc_ = input.readUInt32();
              break;
            }
            case 58: {
              bitField0_ |= 0x00000040;
              ticket_ = input.readBytes();
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
      return SteammessagesBase.internal_static_CMsgAuthTicket_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SteammessagesBase.internal_static_CMsgAuthTicket_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SteammessagesBase.CMsgAuthTicket.class, SteammessagesBase.CMsgAuthTicket.Builder.class);
    }

    private int bitField0_;
    public static final int ESTATE_FIELD_NUMBER = 1;
    private int estate_;
    /**
     * <code>optional uint32 estate = 1;</code>
     */
    public boolean hasEstate() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint32 estate = 1;</code>
     */
    public int getEstate() {
      return estate_;
    }

    public static final int ERESULT_FIELD_NUMBER = 2;
    private int eresult_;
    /**
     * <code>optional uint32 eresult = 2 [default = 2];</code>
     */
    public boolean hasEresult() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint32 eresult = 2 [default = 2];</code>
     */
    public int getEresult() {
      return eresult_;
    }

    public static final int STEAMID_FIELD_NUMBER = 3;
    private long steamid_;
    /**
     * <code>optional fixed64 steamid = 3;</code>
     */
    public boolean hasSteamid() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional fixed64 steamid = 3;</code>
     */
    public long getSteamid() {
      return steamid_;
    }

    public static final int GAMEID_FIELD_NUMBER = 4;
    private long gameid_;
    /**
     * <code>optional fixed64 gameid = 4;</code>
     */
    public boolean hasGameid() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional fixed64 gameid = 4;</code>
     */
    public long getGameid() {
      return gameid_;
    }

    public static final int H_STEAM_PIPE_FIELD_NUMBER = 5;
    private int hSteamPipe_;
    /**
     * <code>optional uint32 h_steam_pipe = 5;</code>
     */
    public boolean hasHSteamPipe() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional uint32 h_steam_pipe = 5;</code>
     */
    public int getHSteamPipe() {
      return hSteamPipe_;
    }

    public static final int TICKET_CRC_FIELD_NUMBER = 6;
    private int ticketCrc_;
    /**
     * <code>optional uint32 ticket_crc = 6;</code>
     */
    public boolean hasTicketCrc() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional uint32 ticket_crc = 6;</code>
     */
    public int getTicketCrc() {
      return ticketCrc_;
    }

    public static final int TICKET_FIELD_NUMBER = 7;
    private com.google.protobuf.ByteString ticket_;
    /**
     * <code>optional bytes ticket = 7;</code>
     */
    public boolean hasTicket() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional bytes ticket = 7;</code>
     */
    public com.google.protobuf.ByteString getTicket() {
      return ticket_;
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
        output.writeUInt32(1, estate_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, eresult_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeFixed64(3, steamid_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeFixed64(4, gameid_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeUInt32(5, hSteamPipe_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeUInt32(6, ticketCrc_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBytes(7, ticket_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, estate_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, eresult_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed64Size(3, steamid_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed64Size(4, gameid_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, hSteamPipe_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, ticketCrc_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(7, ticket_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SteammessagesBase.CMsgAuthTicket)) {
        return super.equals(obj);
      }
      SteammessagesBase.CMsgAuthTicket other = (SteammessagesBase.CMsgAuthTicket) obj;

      boolean result = true;
      result = result && (hasEstate() == other.hasEstate());
      if (hasEstate()) {
        result = result && (getEstate()
            == other.getEstate());
      }
      result = result && (hasEresult() == other.hasEresult());
      if (hasEresult()) {
        result = result && (getEresult()
            == other.getEresult());
      }
      result = result && (hasSteamid() == other.hasSteamid());
      if (hasSteamid()) {
        result = result && (getSteamid()
            == other.getSteamid());
      }
      result = result && (hasGameid() == other.hasGameid());
      if (hasGameid()) {
        result = result && (getGameid()
            == other.getGameid());
      }
      result = result && (hasHSteamPipe() == other.hasHSteamPipe());
      if (hasHSteamPipe()) {
        result = result && (getHSteamPipe()
            == other.getHSteamPipe());
      }
      result = result && (hasTicketCrc() == other.hasTicketCrc());
      if (hasTicketCrc()) {
        result = result && (getTicketCrc()
            == other.getTicketCrc());
      }
      result = result && (hasTicket() == other.hasTicket());
      if (hasTicket()) {
        result = result && getTicket()
            .equals(other.getTicket());
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
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasEstate()) {
        hash = (37 * hash) + ESTATE_FIELD_NUMBER;
        hash = (53 * hash) + getEstate();
      }
      if (hasEresult()) {
        hash = (37 * hash) + ERESULT_FIELD_NUMBER;
        hash = (53 * hash) + getEresult();
      }
      if (hasSteamid()) {
        hash = (37 * hash) + STEAMID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getSteamid());
      }
      if (hasGameid()) {
        hash = (37 * hash) + GAMEID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getGameid());
      }
      if (hasHSteamPipe()) {
        hash = (37 * hash) + H_STEAM_PIPE_FIELD_NUMBER;
        hash = (53 * hash) + getHSteamPipe();
      }
      if (hasTicketCrc()) {
        hash = (37 * hash) + TICKET_CRC_FIELD_NUMBER;
        hash = (53 * hash) + getTicketCrc();
      }
      if (hasTicket()) {
        hash = (37 * hash) + TICKET_FIELD_NUMBER;
        hash = (53 * hash) + getTicket().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SteammessagesBase.CMsgAuthTicket parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesBase.CMsgAuthTicket parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesBase.CMsgAuthTicket parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesBase.CMsgAuthTicket parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesBase.CMsgAuthTicket parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesBase.CMsgAuthTicket parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesBase.CMsgAuthTicket parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesBase.CMsgAuthTicket parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesBase.CMsgAuthTicket parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SteammessagesBase.CMsgAuthTicket parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesBase.CMsgAuthTicket parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesBase.CMsgAuthTicket parseFrom(
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
    public static Builder newBuilder(SteammessagesBase.CMsgAuthTicket prototype) {
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
     * Protobuf type {@code CMsgAuthTicket}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CMsgAuthTicket)
        SteammessagesBase.CMsgAuthTicketOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SteammessagesBase.internal_static_CMsgAuthTicket_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SteammessagesBase.internal_static_CMsgAuthTicket_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SteammessagesBase.CMsgAuthTicket.class, SteammessagesBase.CMsgAuthTicket.Builder.class);
      }

      // Construct using SteammessagesBase.CMsgAuthTicket.newBuilder()
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
        estate_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        eresult_ = 2;
        bitField0_ = (bitField0_ & ~0x00000002);
        steamid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        gameid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        hSteamPipe_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        ticketCrc_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        ticket_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SteammessagesBase.internal_static_CMsgAuthTicket_descriptor;
      }

      public SteammessagesBase.CMsgAuthTicket getDefaultInstanceForType() {
        return SteammessagesBase.CMsgAuthTicket.getDefaultInstance();
      }

      public SteammessagesBase.CMsgAuthTicket build() {
        SteammessagesBase.CMsgAuthTicket result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SteammessagesBase.CMsgAuthTicket buildPartial() {
        SteammessagesBase.CMsgAuthTicket result = new SteammessagesBase.CMsgAuthTicket(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.estate_ = estate_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.eresult_ = eresult_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.steamid_ = steamid_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.gameid_ = gameid_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.hSteamPipe_ = hSteamPipe_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.ticketCrc_ = ticketCrc_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.ticket_ = ticket_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
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
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SteammessagesBase.CMsgAuthTicket) {
          return mergeFrom((SteammessagesBase.CMsgAuthTicket)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SteammessagesBase.CMsgAuthTicket other) {
        if (other == SteammessagesBase.CMsgAuthTicket.getDefaultInstance()) return this;
        if (other.hasEstate()) {
          setEstate(other.getEstate());
        }
        if (other.hasEresult()) {
          setEresult(other.getEresult());
        }
        if (other.hasSteamid()) {
          setSteamid(other.getSteamid());
        }
        if (other.hasGameid()) {
          setGameid(other.getGameid());
        }
        if (other.hasHSteamPipe()) {
          setHSteamPipe(other.getHSteamPipe());
        }
        if (other.hasTicketCrc()) {
          setTicketCrc(other.getTicketCrc());
        }
        if (other.hasTicket()) {
          setTicket(other.getTicket());
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
        SteammessagesBase.CMsgAuthTicket parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SteammessagesBase.CMsgAuthTicket) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int estate_ ;
      /**
       * <code>optional uint32 estate = 1;</code>
       */
      public boolean hasEstate() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional uint32 estate = 1;</code>
       */
      public int getEstate() {
        return estate_;
      }
      /**
       * <code>optional uint32 estate = 1;</code>
       */
      public Builder setEstate(int value) {
        bitField0_ |= 0x00000001;
        estate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 estate = 1;</code>
       */
      public Builder clearEstate() {
        bitField0_ = (bitField0_ & ~0x00000001);
        estate_ = 0;
        onChanged();
        return this;
      }

      private int eresult_ = 2;
      /**
       * <code>optional uint32 eresult = 2 [default = 2];</code>
       */
      public boolean hasEresult() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint32 eresult = 2 [default = 2];</code>
       */
      public int getEresult() {
        return eresult_;
      }
      /**
       * <code>optional uint32 eresult = 2 [default = 2];</code>
       */
      public Builder setEresult(int value) {
        bitField0_ |= 0x00000002;
        eresult_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 eresult = 2 [default = 2];</code>
       */
      public Builder clearEresult() {
        bitField0_ = (bitField0_ & ~0x00000002);
        eresult_ = 2;
        onChanged();
        return this;
      }

      private long steamid_ ;
      /**
       * <code>optional fixed64 steamid = 3;</code>
       */
      public boolean hasSteamid() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional fixed64 steamid = 3;</code>
       */
      public long getSteamid() {
        return steamid_;
      }
      /**
       * <code>optional fixed64 steamid = 3;</code>
       */
      public Builder setSteamid(long value) {
        bitField0_ |= 0x00000004;
        steamid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional fixed64 steamid = 3;</code>
       */
      public Builder clearSteamid() {
        bitField0_ = (bitField0_ & ~0x00000004);
        steamid_ = 0L;
        onChanged();
        return this;
      }

      private long gameid_ ;
      /**
       * <code>optional fixed64 gameid = 4;</code>
       */
      public boolean hasGameid() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional fixed64 gameid = 4;</code>
       */
      public long getGameid() {
        return gameid_;
      }
      /**
       * <code>optional fixed64 gameid = 4;</code>
       */
      public Builder setGameid(long value) {
        bitField0_ |= 0x00000008;
        gameid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional fixed64 gameid = 4;</code>
       */
      public Builder clearGameid() {
        bitField0_ = (bitField0_ & ~0x00000008);
        gameid_ = 0L;
        onChanged();
        return this;
      }

      private int hSteamPipe_ ;
      /**
       * <code>optional uint32 h_steam_pipe = 5;</code>
       */
      public boolean hasHSteamPipe() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional uint32 h_steam_pipe = 5;</code>
       */
      public int getHSteamPipe() {
        return hSteamPipe_;
      }
      /**
       * <code>optional uint32 h_steam_pipe = 5;</code>
       */
      public Builder setHSteamPipe(int value) {
        bitField0_ |= 0x00000010;
        hSteamPipe_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 h_steam_pipe = 5;</code>
       */
      public Builder clearHSteamPipe() {
        bitField0_ = (bitField0_ & ~0x00000010);
        hSteamPipe_ = 0;
        onChanged();
        return this;
      }

      private int ticketCrc_ ;
      /**
       * <code>optional uint32 ticket_crc = 6;</code>
       */
      public boolean hasTicketCrc() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional uint32 ticket_crc = 6;</code>
       */
      public int getTicketCrc() {
        return ticketCrc_;
      }
      /**
       * <code>optional uint32 ticket_crc = 6;</code>
       */
      public Builder setTicketCrc(int value) {
        bitField0_ |= 0x00000020;
        ticketCrc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 ticket_crc = 6;</code>
       */
      public Builder clearTicketCrc() {
        bitField0_ = (bitField0_ & ~0x00000020);
        ticketCrc_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString ticket_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes ticket = 7;</code>
       */
      public boolean hasTicket() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional bytes ticket = 7;</code>
       */
      public com.google.protobuf.ByteString getTicket() {
        return ticket_;
      }
      /**
       * <code>optional bytes ticket = 7;</code>
       */
      public Builder setTicket(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        ticket_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes ticket = 7;</code>
       */
      public Builder clearTicket() {
        bitField0_ = (bitField0_ & ~0x00000040);
        ticket_ = getDefaultInstance().getTicket();
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


      // @@protoc_insertion_point(builder_scope:CMsgAuthTicket)
    }

    // @@protoc_insertion_point(class_scope:CMsgAuthTicket)
    private static final SteammessagesBase.CMsgAuthTicket DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SteammessagesBase.CMsgAuthTicket();
    }

    public static SteammessagesBase.CMsgAuthTicket getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CMsgAuthTicket>
        PARSER = new com.google.protobuf.AbstractParser<CMsgAuthTicket>() {
      public CMsgAuthTicket parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CMsgAuthTicket(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CMsgAuthTicket> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CMsgAuthTicket> getParserForType() {
      return PARSER;
    }

    public SteammessagesBase.CMsgAuthTicket getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CCDDBAppDetailCommonOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CCDDBAppDetailCommon)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint32 appid = 1;</code>
     */
    boolean hasAppid();
    /**
     * <code>optional uint32 appid = 1;</code>
     */
    int getAppid();

    /**
     * <code>optional string name = 2;</code>
     */
    boolean hasName();
    /**
     * <code>optional string name = 2;</code>
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 2;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>optional string icon = 3;</code>
     */
    boolean hasIcon();
    /**
     * <code>optional string icon = 3;</code>
     */
    java.lang.String getIcon();
    /**
     * <code>optional string icon = 3;</code>
     */
    com.google.protobuf.ByteString
        getIconBytes();

    /**
     * <code>optional string logo = 4;</code>
     */
    boolean hasLogo();
    /**
     * <code>optional string logo = 4;</code>
     */
    java.lang.String getLogo();
    /**
     * <code>optional string logo = 4;</code>
     */
    com.google.protobuf.ByteString
        getLogoBytes();

    /**
     * <code>optional string logo_small = 5;</code>
     */
    boolean hasLogoSmall();
    /**
     * <code>optional string logo_small = 5;</code>
     */
    java.lang.String getLogoSmall();
    /**
     * <code>optional string logo_small = 5;</code>
     */
    com.google.protobuf.ByteString
        getLogoSmallBytes();

    /**
     * <code>optional bool tool = 6;</code>
     */
    boolean hasTool();
    /**
     * <code>optional bool tool = 6;</code>
     */
    boolean getTool();

    /**
     * <code>optional bool demo = 7;</code>
     */
    boolean hasDemo();
    /**
     * <code>optional bool demo = 7;</code>
     */
    boolean getDemo();

    /**
     * <code>optional bool media = 8;</code>
     */
    boolean hasMedia();
    /**
     * <code>optional bool media = 8;</code>
     */
    boolean getMedia();

    /**
     * <code>optional bool community_visible_stats = 9;</code>
     */
    boolean hasCommunityVisibleStats();
    /**
     * <code>optional bool community_visible_stats = 9;</code>
     */
    boolean getCommunityVisibleStats();

    /**
     * <code>optional string friendly_name = 10;</code>
     */
    boolean hasFriendlyName();
    /**
     * <code>optional string friendly_name = 10;</code>
     */
    java.lang.String getFriendlyName();
    /**
     * <code>optional string friendly_name = 10;</code>
     */
    com.google.protobuf.ByteString
        getFriendlyNameBytes();

    /**
     * <code>optional string propagation = 11;</code>
     */
    boolean hasPropagation();
    /**
     * <code>optional string propagation = 11;</code>
     */
    java.lang.String getPropagation();
    /**
     * <code>optional string propagation = 11;</code>
     */
    com.google.protobuf.ByteString
        getPropagationBytes();

    /**
     * <code>optional bool has_adult_content = 12;</code>
     */
    boolean hasHasAdultContent();
    /**
     * <code>optional bool has_adult_content = 12;</code>
     */
    boolean getHasAdultContent();
  }
  /**
   * Protobuf type {@code CCDDBAppDetailCommon}
   */
  public  static final class CCDDBAppDetailCommon extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CCDDBAppDetailCommon)
      CCDDBAppDetailCommonOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CCDDBAppDetailCommon.newBuilder() to construct.
    private CCDDBAppDetailCommon(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CCDDBAppDetailCommon() {
      appid_ = 0;
      name_ = "";
      icon_ = "";
      logo_ = "";
      logoSmall_ = "";
      tool_ = false;
      demo_ = false;
      media_ = false;
      communityVisibleStats_ = false;
      friendlyName_ = "";
      propagation_ = "";
      hasAdultContent_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CCDDBAppDetailCommon(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              appid_ = input.readUInt32();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              name_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              icon_ = bs;
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              logo_ = bs;
              break;
            }
            case 42: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000010;
              logoSmall_ = bs;
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              tool_ = input.readBool();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              demo_ = input.readBool();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              media_ = input.readBool();
              break;
            }
            case 72: {
              bitField0_ |= 0x00000100;
              communityVisibleStats_ = input.readBool();
              break;
            }
            case 82: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000200;
              friendlyName_ = bs;
              break;
            }
            case 90: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000400;
              propagation_ = bs;
              break;
            }
            case 96: {
              bitField0_ |= 0x00000800;
              hasAdultContent_ = input.readBool();
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
      return SteammessagesBase.internal_static_CCDDBAppDetailCommon_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SteammessagesBase.internal_static_CCDDBAppDetailCommon_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SteammessagesBase.CCDDBAppDetailCommon.class, SteammessagesBase.CCDDBAppDetailCommon.Builder.class);
    }

    private int bitField0_;
    public static final int APPID_FIELD_NUMBER = 1;
    private int appid_;
    /**
     * <code>optional uint32 appid = 1;</code>
     */
    public boolean hasAppid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint32 appid = 1;</code>
     */
    public int getAppid() {
      return appid_;
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object name_;
    /**
     * <code>optional string name = 2;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ICON_FIELD_NUMBER = 3;
    private volatile java.lang.Object icon_;
    /**
     * <code>optional string icon = 3;</code>
     */
    public boolean hasIcon() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string icon = 3;</code>
     */
    public java.lang.String getIcon() {
      java.lang.Object ref = icon_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          icon_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string icon = 3;</code>
     */
    public com.google.protobuf.ByteString
        getIconBytes() {
      java.lang.Object ref = icon_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        icon_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LOGO_FIELD_NUMBER = 4;
    private volatile java.lang.Object logo_;
    /**
     * <code>optional string logo = 4;</code>
     */
    public boolean hasLogo() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string logo = 4;</code>
     */
    public java.lang.String getLogo() {
      java.lang.Object ref = logo_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          logo_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string logo = 4;</code>
     */
    public com.google.protobuf.ByteString
        getLogoBytes() {
      java.lang.Object ref = logo_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        logo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LOGO_SMALL_FIELD_NUMBER = 5;
    private volatile java.lang.Object logoSmall_;
    /**
     * <code>optional string logo_small = 5;</code>
     */
    public boolean hasLogoSmall() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string logo_small = 5;</code>
     */
    public java.lang.String getLogoSmall() {
      java.lang.Object ref = logoSmall_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          logoSmall_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string logo_small = 5;</code>
     */
    public com.google.protobuf.ByteString
        getLogoSmallBytes() {
      java.lang.Object ref = logoSmall_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        logoSmall_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TOOL_FIELD_NUMBER = 6;
    private boolean tool_;
    /**
     * <code>optional bool tool = 6;</code>
     */
    public boolean hasTool() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional bool tool = 6;</code>
     */
    public boolean getTool() {
      return tool_;
    }

    public static final int DEMO_FIELD_NUMBER = 7;
    private boolean demo_;
    /**
     * <code>optional bool demo = 7;</code>
     */
    public boolean hasDemo() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional bool demo = 7;</code>
     */
    public boolean getDemo() {
      return demo_;
    }

    public static final int MEDIA_FIELD_NUMBER = 8;
    private boolean media_;
    /**
     * <code>optional bool media = 8;</code>
     */
    public boolean hasMedia() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional bool media = 8;</code>
     */
    public boolean getMedia() {
      return media_;
    }

    public static final int COMMUNITY_VISIBLE_STATS_FIELD_NUMBER = 9;
    private boolean communityVisibleStats_;
    /**
     * <code>optional bool community_visible_stats = 9;</code>
     */
    public boolean hasCommunityVisibleStats() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional bool community_visible_stats = 9;</code>
     */
    public boolean getCommunityVisibleStats() {
      return communityVisibleStats_;
    }

    public static final int FRIENDLY_NAME_FIELD_NUMBER = 10;
    private volatile java.lang.Object friendlyName_;
    /**
     * <code>optional string friendly_name = 10;</code>
     */
    public boolean hasFriendlyName() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    /**
     * <code>optional string friendly_name = 10;</code>
     */
    public java.lang.String getFriendlyName() {
      java.lang.Object ref = friendlyName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          friendlyName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string friendly_name = 10;</code>
     */
    public com.google.protobuf.ByteString
        getFriendlyNameBytes() {
      java.lang.Object ref = friendlyName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        friendlyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PROPAGATION_FIELD_NUMBER = 11;
    private volatile java.lang.Object propagation_;
    /**
     * <code>optional string propagation = 11;</code>
     */
    public boolean hasPropagation() {
      return ((bitField0_ & 0x00000400) == 0x00000400);
    }
    /**
     * <code>optional string propagation = 11;</code>
     */
    public java.lang.String getPropagation() {
      java.lang.Object ref = propagation_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          propagation_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string propagation = 11;</code>
     */
    public com.google.protobuf.ByteString
        getPropagationBytes() {
      java.lang.Object ref = propagation_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        propagation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int HAS_ADULT_CONTENT_FIELD_NUMBER = 12;
    private boolean hasAdultContent_;
    /**
     * <code>optional bool has_adult_content = 12;</code>
     */
    public boolean hasHasAdultContent() {
      return ((bitField0_ & 0x00000800) == 0x00000800);
    }
    /**
     * <code>optional bool has_adult_content = 12;</code>
     */
    public boolean getHasAdultContent() {
      return hasAdultContent_;
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
        output.writeUInt32(1, appid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, icon_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, logo_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, logoSmall_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBool(6, tool_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBool(7, demo_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeBool(8, media_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeBool(9, communityVisibleStats_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 10, friendlyName_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 11, propagation_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        output.writeBool(12, hasAdultContent_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, appid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, icon_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, logo_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, logoSmall_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, tool_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, demo_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, media_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, communityVisibleStats_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, friendlyName_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, propagation_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, hasAdultContent_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SteammessagesBase.CCDDBAppDetailCommon)) {
        return super.equals(obj);
      }
      SteammessagesBase.CCDDBAppDetailCommon other = (SteammessagesBase.CCDDBAppDetailCommon) obj;

      boolean result = true;
      result = result && (hasAppid() == other.hasAppid());
      if (hasAppid()) {
        result = result && (getAppid()
            == other.getAppid());
      }
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName()
            .equals(other.getName());
      }
      result = result && (hasIcon() == other.hasIcon());
      if (hasIcon()) {
        result = result && getIcon()
            .equals(other.getIcon());
      }
      result = result && (hasLogo() == other.hasLogo());
      if (hasLogo()) {
        result = result && getLogo()
            .equals(other.getLogo());
      }
      result = result && (hasLogoSmall() == other.hasLogoSmall());
      if (hasLogoSmall()) {
        result = result && getLogoSmall()
            .equals(other.getLogoSmall());
      }
      result = result && (hasTool() == other.hasTool());
      if (hasTool()) {
        result = result && (getTool()
            == other.getTool());
      }
      result = result && (hasDemo() == other.hasDemo());
      if (hasDemo()) {
        result = result && (getDemo()
            == other.getDemo());
      }
      result = result && (hasMedia() == other.hasMedia());
      if (hasMedia()) {
        result = result && (getMedia()
            == other.getMedia());
      }
      result = result && (hasCommunityVisibleStats() == other.hasCommunityVisibleStats());
      if (hasCommunityVisibleStats()) {
        result = result && (getCommunityVisibleStats()
            == other.getCommunityVisibleStats());
      }
      result = result && (hasFriendlyName() == other.hasFriendlyName());
      if (hasFriendlyName()) {
        result = result && getFriendlyName()
            .equals(other.getFriendlyName());
      }
      result = result && (hasPropagation() == other.hasPropagation());
      if (hasPropagation()) {
        result = result && getPropagation()
            .equals(other.getPropagation());
      }
      result = result && (hasHasAdultContent() == other.hasHasAdultContent());
      if (hasHasAdultContent()) {
        result = result && (getHasAdultContent()
            == other.getHasAdultContent());
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
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasAppid()) {
        hash = (37 * hash) + APPID_FIELD_NUMBER;
        hash = (53 * hash) + getAppid();
      }
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasIcon()) {
        hash = (37 * hash) + ICON_FIELD_NUMBER;
        hash = (53 * hash) + getIcon().hashCode();
      }
      if (hasLogo()) {
        hash = (37 * hash) + LOGO_FIELD_NUMBER;
        hash = (53 * hash) + getLogo().hashCode();
      }
      if (hasLogoSmall()) {
        hash = (37 * hash) + LOGO_SMALL_FIELD_NUMBER;
        hash = (53 * hash) + getLogoSmall().hashCode();
      }
      if (hasTool()) {
        hash = (37 * hash) + TOOL_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getTool());
      }
      if (hasDemo()) {
        hash = (37 * hash) + DEMO_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getDemo());
      }
      if (hasMedia()) {
        hash = (37 * hash) + MEDIA_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getMedia());
      }
      if (hasCommunityVisibleStats()) {
        hash = (37 * hash) + COMMUNITY_VISIBLE_STATS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getCommunityVisibleStats());
      }
      if (hasFriendlyName()) {
        hash = (37 * hash) + FRIENDLY_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getFriendlyName().hashCode();
      }
      if (hasPropagation()) {
        hash = (37 * hash) + PROPAGATION_FIELD_NUMBER;
        hash = (53 * hash) + getPropagation().hashCode();
      }
      if (hasHasAdultContent()) {
        hash = (37 * hash) + HAS_ADULT_CONTENT_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getHasAdultContent());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SteammessagesBase.CCDDBAppDetailCommon parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesBase.CCDDBAppDetailCommon parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesBase.CCDDBAppDetailCommon parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesBase.CCDDBAppDetailCommon parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesBase.CCDDBAppDetailCommon parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesBase.CCDDBAppDetailCommon parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesBase.CCDDBAppDetailCommon parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesBase.CCDDBAppDetailCommon parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesBase.CCDDBAppDetailCommon parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SteammessagesBase.CCDDBAppDetailCommon parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesBase.CCDDBAppDetailCommon parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesBase.CCDDBAppDetailCommon parseFrom(
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
    public static Builder newBuilder(SteammessagesBase.CCDDBAppDetailCommon prototype) {
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
     * Protobuf type {@code CCDDBAppDetailCommon}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CCDDBAppDetailCommon)
        SteammessagesBase.CCDDBAppDetailCommonOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SteammessagesBase.internal_static_CCDDBAppDetailCommon_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SteammessagesBase.internal_static_CCDDBAppDetailCommon_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SteammessagesBase.CCDDBAppDetailCommon.class, SteammessagesBase.CCDDBAppDetailCommon.Builder.class);
      }

      // Construct using SteammessagesBase.CCDDBAppDetailCommon.newBuilder()
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
        appid_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        icon_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        logo_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        logoSmall_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        tool_ = false;
        bitField0_ = (bitField0_ & ~0x00000020);
        demo_ = false;
        bitField0_ = (bitField0_ & ~0x00000040);
        media_ = false;
        bitField0_ = (bitField0_ & ~0x00000080);
        communityVisibleStats_ = false;
        bitField0_ = (bitField0_ & ~0x00000100);
        friendlyName_ = "";
        bitField0_ = (bitField0_ & ~0x00000200);
        propagation_ = "";
        bitField0_ = (bitField0_ & ~0x00000400);
        hasAdultContent_ = false;
        bitField0_ = (bitField0_ & ~0x00000800);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SteammessagesBase.internal_static_CCDDBAppDetailCommon_descriptor;
      }

      public SteammessagesBase.CCDDBAppDetailCommon getDefaultInstanceForType() {
        return SteammessagesBase.CCDDBAppDetailCommon.getDefaultInstance();
      }

      public SteammessagesBase.CCDDBAppDetailCommon build() {
        SteammessagesBase.CCDDBAppDetailCommon result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SteammessagesBase.CCDDBAppDetailCommon buildPartial() {
        SteammessagesBase.CCDDBAppDetailCommon result = new SteammessagesBase.CCDDBAppDetailCommon(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.appid_ = appid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.icon_ = icon_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.logo_ = logo_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.logoSmall_ = logoSmall_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.tool_ = tool_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.demo_ = demo_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.media_ = media_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.communityVisibleStats_ = communityVisibleStats_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.friendlyName_ = friendlyName_;
        if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
          to_bitField0_ |= 0x00000400;
        }
        result.propagation_ = propagation_;
        if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
          to_bitField0_ |= 0x00000800;
        }
        result.hasAdultContent_ = hasAdultContent_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
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
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SteammessagesBase.CCDDBAppDetailCommon) {
          return mergeFrom((SteammessagesBase.CCDDBAppDetailCommon)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SteammessagesBase.CCDDBAppDetailCommon other) {
        if (other == SteammessagesBase.CCDDBAppDetailCommon.getDefaultInstance()) return this;
        if (other.hasAppid()) {
          setAppid(other.getAppid());
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000002;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasIcon()) {
          bitField0_ |= 0x00000004;
          icon_ = other.icon_;
          onChanged();
        }
        if (other.hasLogo()) {
          bitField0_ |= 0x00000008;
          logo_ = other.logo_;
          onChanged();
        }
        if (other.hasLogoSmall()) {
          bitField0_ |= 0x00000010;
          logoSmall_ = other.logoSmall_;
          onChanged();
        }
        if (other.hasTool()) {
          setTool(other.getTool());
        }
        if (other.hasDemo()) {
          setDemo(other.getDemo());
        }
        if (other.hasMedia()) {
          setMedia(other.getMedia());
        }
        if (other.hasCommunityVisibleStats()) {
          setCommunityVisibleStats(other.getCommunityVisibleStats());
        }
        if (other.hasFriendlyName()) {
          bitField0_ |= 0x00000200;
          friendlyName_ = other.friendlyName_;
          onChanged();
        }
        if (other.hasPropagation()) {
          bitField0_ |= 0x00000400;
          propagation_ = other.propagation_;
          onChanged();
        }
        if (other.hasHasAdultContent()) {
          setHasAdultContent(other.getHasAdultContent());
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
        SteammessagesBase.CCDDBAppDetailCommon parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SteammessagesBase.CCDDBAppDetailCommon) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int appid_ ;
      /**
       * <code>optional uint32 appid = 1;</code>
       */
      public boolean hasAppid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional uint32 appid = 1;</code>
       */
      public int getAppid() {
        return appid_;
      }
      /**
       * <code>optional uint32 appid = 1;</code>
       */
      public Builder setAppid(int value) {
        bitField0_ |= 0x00000001;
        appid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 appid = 1;</code>
       */
      public Builder clearAppid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        appid_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 2;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object icon_ = "";
      /**
       * <code>optional string icon = 3;</code>
       */
      public boolean hasIcon() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string icon = 3;</code>
       */
      public java.lang.String getIcon() {
        java.lang.Object ref = icon_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            icon_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string icon = 3;</code>
       */
      public com.google.protobuf.ByteString
          getIconBytes() {
        java.lang.Object ref = icon_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          icon_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string icon = 3;</code>
       */
      public Builder setIcon(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        icon_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string icon = 3;</code>
       */
      public Builder clearIcon() {
        bitField0_ = (bitField0_ & ~0x00000004);
        icon_ = getDefaultInstance().getIcon();
        onChanged();
        return this;
      }
      /**
       * <code>optional string icon = 3;</code>
       */
      public Builder setIconBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        icon_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object logo_ = "";
      /**
       * <code>optional string logo = 4;</code>
       */
      public boolean hasLogo() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string logo = 4;</code>
       */
      public java.lang.String getLogo() {
        java.lang.Object ref = logo_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            logo_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string logo = 4;</code>
       */
      public com.google.protobuf.ByteString
          getLogoBytes() {
        java.lang.Object ref = logo_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          logo_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string logo = 4;</code>
       */
      public Builder setLogo(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        logo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string logo = 4;</code>
       */
      public Builder clearLogo() {
        bitField0_ = (bitField0_ & ~0x00000008);
        logo_ = getDefaultInstance().getLogo();
        onChanged();
        return this;
      }
      /**
       * <code>optional string logo = 4;</code>
       */
      public Builder setLogoBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        logo_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object logoSmall_ = "";
      /**
       * <code>optional string logo_small = 5;</code>
       */
      public boolean hasLogoSmall() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional string logo_small = 5;</code>
       */
      public java.lang.String getLogoSmall() {
        java.lang.Object ref = logoSmall_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            logoSmall_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string logo_small = 5;</code>
       */
      public com.google.protobuf.ByteString
          getLogoSmallBytes() {
        java.lang.Object ref = logoSmall_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          logoSmall_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string logo_small = 5;</code>
       */
      public Builder setLogoSmall(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        logoSmall_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string logo_small = 5;</code>
       */
      public Builder clearLogoSmall() {
        bitField0_ = (bitField0_ & ~0x00000010);
        logoSmall_ = getDefaultInstance().getLogoSmall();
        onChanged();
        return this;
      }
      /**
       * <code>optional string logo_small = 5;</code>
       */
      public Builder setLogoSmallBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        logoSmall_ = value;
        onChanged();
        return this;
      }

      private boolean tool_ ;
      /**
       * <code>optional bool tool = 6;</code>
       */
      public boolean hasTool() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional bool tool = 6;</code>
       */
      public boolean getTool() {
        return tool_;
      }
      /**
       * <code>optional bool tool = 6;</code>
       */
      public Builder setTool(boolean value) {
        bitField0_ |= 0x00000020;
        tool_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool tool = 6;</code>
       */
      public Builder clearTool() {
        bitField0_ = (bitField0_ & ~0x00000020);
        tool_ = false;
        onChanged();
        return this;
      }

      private boolean demo_ ;
      /**
       * <code>optional bool demo = 7;</code>
       */
      public boolean hasDemo() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional bool demo = 7;</code>
       */
      public boolean getDemo() {
        return demo_;
      }
      /**
       * <code>optional bool demo = 7;</code>
       */
      public Builder setDemo(boolean value) {
        bitField0_ |= 0x00000040;
        demo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool demo = 7;</code>
       */
      public Builder clearDemo() {
        bitField0_ = (bitField0_ & ~0x00000040);
        demo_ = false;
        onChanged();
        return this;
      }

      private boolean media_ ;
      /**
       * <code>optional bool media = 8;</code>
       */
      public boolean hasMedia() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional bool media = 8;</code>
       */
      public boolean getMedia() {
        return media_;
      }
      /**
       * <code>optional bool media = 8;</code>
       */
      public Builder setMedia(boolean value) {
        bitField0_ |= 0x00000080;
        media_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool media = 8;</code>
       */
      public Builder clearMedia() {
        bitField0_ = (bitField0_ & ~0x00000080);
        media_ = false;
        onChanged();
        return this;
      }

      private boolean communityVisibleStats_ ;
      /**
       * <code>optional bool community_visible_stats = 9;</code>
       */
      public boolean hasCommunityVisibleStats() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>optional bool community_visible_stats = 9;</code>
       */
      public boolean getCommunityVisibleStats() {
        return communityVisibleStats_;
      }
      /**
       * <code>optional bool community_visible_stats = 9;</code>
       */
      public Builder setCommunityVisibleStats(boolean value) {
        bitField0_ |= 0x00000100;
        communityVisibleStats_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool community_visible_stats = 9;</code>
       */
      public Builder clearCommunityVisibleStats() {
        bitField0_ = (bitField0_ & ~0x00000100);
        communityVisibleStats_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object friendlyName_ = "";
      /**
       * <code>optional string friendly_name = 10;</code>
       */
      public boolean hasFriendlyName() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      /**
       * <code>optional string friendly_name = 10;</code>
       */
      public java.lang.String getFriendlyName() {
        java.lang.Object ref = friendlyName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            friendlyName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string friendly_name = 10;</code>
       */
      public com.google.protobuf.ByteString
          getFriendlyNameBytes() {
        java.lang.Object ref = friendlyName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          friendlyName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string friendly_name = 10;</code>
       */
      public Builder setFriendlyName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000200;
        friendlyName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string friendly_name = 10;</code>
       */
      public Builder clearFriendlyName() {
        bitField0_ = (bitField0_ & ~0x00000200);
        friendlyName_ = getDefaultInstance().getFriendlyName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string friendly_name = 10;</code>
       */
      public Builder setFriendlyNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000200;
        friendlyName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object propagation_ = "";
      /**
       * <code>optional string propagation = 11;</code>
       */
      public boolean hasPropagation() {
        return ((bitField0_ & 0x00000400) == 0x00000400);
      }
      /**
       * <code>optional string propagation = 11;</code>
       */
      public java.lang.String getPropagation() {
        java.lang.Object ref = propagation_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            propagation_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string propagation = 11;</code>
       */
      public com.google.protobuf.ByteString
          getPropagationBytes() {
        java.lang.Object ref = propagation_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          propagation_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string propagation = 11;</code>
       */
      public Builder setPropagation(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000400;
        propagation_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string propagation = 11;</code>
       */
      public Builder clearPropagation() {
        bitField0_ = (bitField0_ & ~0x00000400);
        propagation_ = getDefaultInstance().getPropagation();
        onChanged();
        return this;
      }
      /**
       * <code>optional string propagation = 11;</code>
       */
      public Builder setPropagationBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000400;
        propagation_ = value;
        onChanged();
        return this;
      }

      private boolean hasAdultContent_ ;
      /**
       * <code>optional bool has_adult_content = 12;</code>
       */
      public boolean hasHasAdultContent() {
        return ((bitField0_ & 0x00000800) == 0x00000800);
      }
      /**
       * <code>optional bool has_adult_content = 12;</code>
       */
      public boolean getHasAdultContent() {
        return hasAdultContent_;
      }
      /**
       * <code>optional bool has_adult_content = 12;</code>
       */
      public Builder setHasAdultContent(boolean value) {
        bitField0_ |= 0x00000800;
        hasAdultContent_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool has_adult_content = 12;</code>
       */
      public Builder clearHasAdultContent() {
        bitField0_ = (bitField0_ & ~0x00000800);
        hasAdultContent_ = false;
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


      // @@protoc_insertion_point(builder_scope:CCDDBAppDetailCommon)
    }

    // @@protoc_insertion_point(class_scope:CCDDBAppDetailCommon)
    private static final SteammessagesBase.CCDDBAppDetailCommon DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SteammessagesBase.CCDDBAppDetailCommon();
    }

    public static SteammessagesBase.CCDDBAppDetailCommon getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CCDDBAppDetailCommon>
        PARSER = new com.google.protobuf.AbstractParser<CCDDBAppDetailCommon>() {
      public CCDDBAppDetailCommon parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CCDDBAppDetailCommon(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CCDDBAppDetailCommon> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CCDDBAppDetailCommon> getParserForType() {
      return PARSER;
    }

    public SteammessagesBase.CCDDBAppDetailCommon getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CMsgAppRightsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CMsgAppRights)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bool edit_info = 1;</code>
     */
    boolean hasEditInfo();
    /**
     * <code>optional bool edit_info = 1;</code>
     */
    boolean getEditInfo();

    /**
     * <code>optional bool publish = 2;</code>
     */
    boolean hasPublish();
    /**
     * <code>optional bool publish = 2;</code>
     */
    boolean getPublish();

    /**
     * <code>optional bool view_error_data = 3;</code>
     */
    boolean hasViewErrorData();
    /**
     * <code>optional bool view_error_data = 3;</code>
     */
    boolean getViewErrorData();

    /**
     * <code>optional bool download = 4;</code>
     */
    boolean hasDownload();
    /**
     * <code>optional bool download = 4;</code>
     */
    boolean getDownload();

    /**
     * <code>optional bool upload_cdkeys = 5;</code>
     */
    boolean hasUploadCdkeys();
    /**
     * <code>optional bool upload_cdkeys = 5;</code>
     */
    boolean getUploadCdkeys();

    /**
     * <code>optional bool generate_cdkeys = 6;</code>
     */
    boolean hasGenerateCdkeys();
    /**
     * <code>optional bool generate_cdkeys = 6;</code>
     */
    boolean getGenerateCdkeys();

    /**
     * <code>optional bool view_financials = 7;</code>
     */
    boolean hasViewFinancials();
    /**
     * <code>optional bool view_financials = 7;</code>
     */
    boolean getViewFinancials();

    /**
     * <code>optional bool manage_ceg = 8;</code>
     */
    boolean hasManageCeg();
    /**
     * <code>optional bool manage_ceg = 8;</code>
     */
    boolean getManageCeg();

    /**
     * <code>optional bool manage_signing = 9;</code>
     */
    boolean hasManageSigning();
    /**
     * <code>optional bool manage_signing = 9;</code>
     */
    boolean getManageSigning();

    /**
     * <code>optional bool manage_cdkeys = 10;</code>
     */
    boolean hasManageCdkeys();
    /**
     * <code>optional bool manage_cdkeys = 10;</code>
     */
    boolean getManageCdkeys();

    /**
     * <code>optional bool edit_marketing = 11;</code>
     */
    boolean hasEditMarketing();
    /**
     * <code>optional bool edit_marketing = 11;</code>
     */
    boolean getEditMarketing();

    /**
     * <code>optional bool economy_support = 12;</code>
     */
    boolean hasEconomySupport();
    /**
     * <code>optional bool economy_support = 12;</code>
     */
    boolean getEconomySupport();

    /**
     * <code>optional bool economy_support_supervisor = 13;</code>
     */
    boolean hasEconomySupportSupervisor();
    /**
     * <code>optional bool economy_support_supervisor = 13;</code>
     */
    boolean getEconomySupportSupervisor();

    /**
     * <code>optional bool manage_pricing = 14;</code>
     */
    boolean hasManagePricing();
    /**
     * <code>optional bool manage_pricing = 14;</code>
     */
    boolean getManagePricing();

    /**
     * <code>optional bool broadcast_live = 15;</code>
     */
    boolean hasBroadcastLive();
    /**
     * <code>optional bool broadcast_live = 15;</code>
     */
    boolean getBroadcastLive();
  }
  /**
   * Protobuf type {@code CMsgAppRights}
   */
  public  static final class CMsgAppRights extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CMsgAppRights)
      CMsgAppRightsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CMsgAppRights.newBuilder() to construct.
    private CMsgAppRights(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CMsgAppRights() {
      editInfo_ = false;
      publish_ = false;
      viewErrorData_ = false;
      download_ = false;
      uploadCdkeys_ = false;
      generateCdkeys_ = false;
      viewFinancials_ = false;
      manageCeg_ = false;
      manageSigning_ = false;
      manageCdkeys_ = false;
      editMarketing_ = false;
      economySupport_ = false;
      economySupportSupervisor_ = false;
      managePricing_ = false;
      broadcastLive_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CMsgAppRights(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              editInfo_ = input.readBool();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              publish_ = input.readBool();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              viewErrorData_ = input.readBool();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              download_ = input.readBool();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              uploadCdkeys_ = input.readBool();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              generateCdkeys_ = input.readBool();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              viewFinancials_ = input.readBool();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              manageCeg_ = input.readBool();
              break;
            }
            case 72: {
              bitField0_ |= 0x00000100;
              manageSigning_ = input.readBool();
              break;
            }
            case 80: {
              bitField0_ |= 0x00000200;
              manageCdkeys_ = input.readBool();
              break;
            }
            case 88: {
              bitField0_ |= 0x00000400;
              editMarketing_ = input.readBool();
              break;
            }
            case 96: {
              bitField0_ |= 0x00000800;
              economySupport_ = input.readBool();
              break;
            }
            case 104: {
              bitField0_ |= 0x00001000;
              economySupportSupervisor_ = input.readBool();
              break;
            }
            case 112: {
              bitField0_ |= 0x00002000;
              managePricing_ = input.readBool();
              break;
            }
            case 120: {
              bitField0_ |= 0x00004000;
              broadcastLive_ = input.readBool();
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
      return SteammessagesBase.internal_static_CMsgAppRights_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SteammessagesBase.internal_static_CMsgAppRights_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SteammessagesBase.CMsgAppRights.class, SteammessagesBase.CMsgAppRights.Builder.class);
    }

    private int bitField0_;
    public static final int EDIT_INFO_FIELD_NUMBER = 1;
    private boolean editInfo_;
    /**
     * <code>optional bool edit_info = 1;</code>
     */
    public boolean hasEditInfo() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bool edit_info = 1;</code>
     */
    public boolean getEditInfo() {
      return editInfo_;
    }

    public static final int PUBLISH_FIELD_NUMBER = 2;
    private boolean publish_;
    /**
     * <code>optional bool publish = 2;</code>
     */
    public boolean hasPublish() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bool publish = 2;</code>
     */
    public boolean getPublish() {
      return publish_;
    }

    public static final int VIEW_ERROR_DATA_FIELD_NUMBER = 3;
    private boolean viewErrorData_;
    /**
     * <code>optional bool view_error_data = 3;</code>
     */
    public boolean hasViewErrorData() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bool view_error_data = 3;</code>
     */
    public boolean getViewErrorData() {
      return viewErrorData_;
    }

    public static final int DOWNLOAD_FIELD_NUMBER = 4;
    private boolean download_;
    /**
     * <code>optional bool download = 4;</code>
     */
    public boolean hasDownload() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional bool download = 4;</code>
     */
    public boolean getDownload() {
      return download_;
    }

    public static final int UPLOAD_CDKEYS_FIELD_NUMBER = 5;
    private boolean uploadCdkeys_;
    /**
     * <code>optional bool upload_cdkeys = 5;</code>
     */
    public boolean hasUploadCdkeys() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional bool upload_cdkeys = 5;</code>
     */
    public boolean getUploadCdkeys() {
      return uploadCdkeys_;
    }

    public static final int GENERATE_CDKEYS_FIELD_NUMBER = 6;
    private boolean generateCdkeys_;
    /**
     * <code>optional bool generate_cdkeys = 6;</code>
     */
    public boolean hasGenerateCdkeys() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional bool generate_cdkeys = 6;</code>
     */
    public boolean getGenerateCdkeys() {
      return generateCdkeys_;
    }

    public static final int VIEW_FINANCIALS_FIELD_NUMBER = 7;
    private boolean viewFinancials_;
    /**
     * <code>optional bool view_financials = 7;</code>
     */
    public boolean hasViewFinancials() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional bool view_financials = 7;</code>
     */
    public boolean getViewFinancials() {
      return viewFinancials_;
    }

    public static final int MANAGE_CEG_FIELD_NUMBER = 8;
    private boolean manageCeg_;
    /**
     * <code>optional bool manage_ceg = 8;</code>
     */
    public boolean hasManageCeg() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional bool manage_ceg = 8;</code>
     */
    public boolean getManageCeg() {
      return manageCeg_;
    }

    public static final int MANAGE_SIGNING_FIELD_NUMBER = 9;
    private boolean manageSigning_;
    /**
     * <code>optional bool manage_signing = 9;</code>
     */
    public boolean hasManageSigning() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional bool manage_signing = 9;</code>
     */
    public boolean getManageSigning() {
      return manageSigning_;
    }

    public static final int MANAGE_CDKEYS_FIELD_NUMBER = 10;
    private boolean manageCdkeys_;
    /**
     * <code>optional bool manage_cdkeys = 10;</code>
     */
    public boolean hasManageCdkeys() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    /**
     * <code>optional bool manage_cdkeys = 10;</code>
     */
    public boolean getManageCdkeys() {
      return manageCdkeys_;
    }

    public static final int EDIT_MARKETING_FIELD_NUMBER = 11;
    private boolean editMarketing_;
    /**
     * <code>optional bool edit_marketing = 11;</code>
     */
    public boolean hasEditMarketing() {
      return ((bitField0_ & 0x00000400) == 0x00000400);
    }
    /**
     * <code>optional bool edit_marketing = 11;</code>
     */
    public boolean getEditMarketing() {
      return editMarketing_;
    }

    public static final int ECONOMY_SUPPORT_FIELD_NUMBER = 12;
    private boolean economySupport_;
    /**
     * <code>optional bool economy_support = 12;</code>
     */
    public boolean hasEconomySupport() {
      return ((bitField0_ & 0x00000800) == 0x00000800);
    }
    /**
     * <code>optional bool economy_support = 12;</code>
     */
    public boolean getEconomySupport() {
      return economySupport_;
    }

    public static final int ECONOMY_SUPPORT_SUPERVISOR_FIELD_NUMBER = 13;
    private boolean economySupportSupervisor_;
    /**
     * <code>optional bool economy_support_supervisor = 13;</code>
     */
    public boolean hasEconomySupportSupervisor() {
      return ((bitField0_ & 0x00001000) == 0x00001000);
    }
    /**
     * <code>optional bool economy_support_supervisor = 13;</code>
     */
    public boolean getEconomySupportSupervisor() {
      return economySupportSupervisor_;
    }

    public static final int MANAGE_PRICING_FIELD_NUMBER = 14;
    private boolean managePricing_;
    /**
     * <code>optional bool manage_pricing = 14;</code>
     */
    public boolean hasManagePricing() {
      return ((bitField0_ & 0x00002000) == 0x00002000);
    }
    /**
     * <code>optional bool manage_pricing = 14;</code>
     */
    public boolean getManagePricing() {
      return managePricing_;
    }

    public static final int BROADCAST_LIVE_FIELD_NUMBER = 15;
    private boolean broadcastLive_;
    /**
     * <code>optional bool broadcast_live = 15;</code>
     */
    public boolean hasBroadcastLive() {
      return ((bitField0_ & 0x00004000) == 0x00004000);
    }
    /**
     * <code>optional bool broadcast_live = 15;</code>
     */
    public boolean getBroadcastLive() {
      return broadcastLive_;
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
        output.writeBool(1, editInfo_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, publish_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(3, viewErrorData_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBool(4, download_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBool(5, uploadCdkeys_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBool(6, generateCdkeys_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBool(7, viewFinancials_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeBool(8, manageCeg_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeBool(9, manageSigning_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeBool(10, manageCdkeys_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        output.writeBool(11, editMarketing_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        output.writeBool(12, economySupport_);
      }
      if (((bitField0_ & 0x00001000) == 0x00001000)) {
        output.writeBool(13, economySupportSupervisor_);
      }
      if (((bitField0_ & 0x00002000) == 0x00002000)) {
        output.writeBool(14, managePricing_);
      }
      if (((bitField0_ & 0x00004000) == 0x00004000)) {
        output.writeBool(15, broadcastLive_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, editInfo_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, publish_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, viewErrorData_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, download_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, uploadCdkeys_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, generateCdkeys_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, viewFinancials_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, manageCeg_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, manageSigning_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, manageCdkeys_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, editMarketing_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, economySupport_);
      }
      if (((bitField0_ & 0x00001000) == 0x00001000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, economySupportSupervisor_);
      }
      if (((bitField0_ & 0x00002000) == 0x00002000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, managePricing_);
      }
      if (((bitField0_ & 0x00004000) == 0x00004000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, broadcastLive_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SteammessagesBase.CMsgAppRights)) {
        return super.equals(obj);
      }
      SteammessagesBase.CMsgAppRights other = (SteammessagesBase.CMsgAppRights) obj;

      boolean result = true;
      result = result && (hasEditInfo() == other.hasEditInfo());
      if (hasEditInfo()) {
        result = result && (getEditInfo()
            == other.getEditInfo());
      }
      result = result && (hasPublish() == other.hasPublish());
      if (hasPublish()) {
        result = result && (getPublish()
            == other.getPublish());
      }
      result = result && (hasViewErrorData() == other.hasViewErrorData());
      if (hasViewErrorData()) {
        result = result && (getViewErrorData()
            == other.getViewErrorData());
      }
      result = result && (hasDownload() == other.hasDownload());
      if (hasDownload()) {
        result = result && (getDownload()
            == other.getDownload());
      }
      result = result && (hasUploadCdkeys() == other.hasUploadCdkeys());
      if (hasUploadCdkeys()) {
        result = result && (getUploadCdkeys()
            == other.getUploadCdkeys());
      }
      result = result && (hasGenerateCdkeys() == other.hasGenerateCdkeys());
      if (hasGenerateCdkeys()) {
        result = result && (getGenerateCdkeys()
            == other.getGenerateCdkeys());
      }
      result = result && (hasViewFinancials() == other.hasViewFinancials());
      if (hasViewFinancials()) {
        result = result && (getViewFinancials()
            == other.getViewFinancials());
      }
      result = result && (hasManageCeg() == other.hasManageCeg());
      if (hasManageCeg()) {
        result = result && (getManageCeg()
            == other.getManageCeg());
      }
      result = result && (hasManageSigning() == other.hasManageSigning());
      if (hasManageSigning()) {
        result = result && (getManageSigning()
            == other.getManageSigning());
      }
      result = result && (hasManageCdkeys() == other.hasManageCdkeys());
      if (hasManageCdkeys()) {
        result = result && (getManageCdkeys()
            == other.getManageCdkeys());
      }
      result = result && (hasEditMarketing() == other.hasEditMarketing());
      if (hasEditMarketing()) {
        result = result && (getEditMarketing()
            == other.getEditMarketing());
      }
      result = result && (hasEconomySupport() == other.hasEconomySupport());
      if (hasEconomySupport()) {
        result = result && (getEconomySupport()
            == other.getEconomySupport());
      }
      result = result && (hasEconomySupportSupervisor() == other.hasEconomySupportSupervisor());
      if (hasEconomySupportSupervisor()) {
        result = result && (getEconomySupportSupervisor()
            == other.getEconomySupportSupervisor());
      }
      result = result && (hasManagePricing() == other.hasManagePricing());
      if (hasManagePricing()) {
        result = result && (getManagePricing()
            == other.getManagePricing());
      }
      result = result && (hasBroadcastLive() == other.hasBroadcastLive());
      if (hasBroadcastLive()) {
        result = result && (getBroadcastLive()
            == other.getBroadcastLive());
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
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasEditInfo()) {
        hash = (37 * hash) + EDIT_INFO_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getEditInfo());
      }
      if (hasPublish()) {
        hash = (37 * hash) + PUBLISH_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getPublish());
      }
      if (hasViewErrorData()) {
        hash = (37 * hash) + VIEW_ERROR_DATA_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getViewErrorData());
      }
      if (hasDownload()) {
        hash = (37 * hash) + DOWNLOAD_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getDownload());
      }
      if (hasUploadCdkeys()) {
        hash = (37 * hash) + UPLOAD_CDKEYS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getUploadCdkeys());
      }
      if (hasGenerateCdkeys()) {
        hash = (37 * hash) + GENERATE_CDKEYS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getGenerateCdkeys());
      }
      if (hasViewFinancials()) {
        hash = (37 * hash) + VIEW_FINANCIALS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getViewFinancials());
      }
      if (hasManageCeg()) {
        hash = (37 * hash) + MANAGE_CEG_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getManageCeg());
      }
      if (hasManageSigning()) {
        hash = (37 * hash) + MANAGE_SIGNING_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getManageSigning());
      }
      if (hasManageCdkeys()) {
        hash = (37 * hash) + MANAGE_CDKEYS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getManageCdkeys());
      }
      if (hasEditMarketing()) {
        hash = (37 * hash) + EDIT_MARKETING_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getEditMarketing());
      }
      if (hasEconomySupport()) {
        hash = (37 * hash) + ECONOMY_SUPPORT_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getEconomySupport());
      }
      if (hasEconomySupportSupervisor()) {
        hash = (37 * hash) + ECONOMY_SUPPORT_SUPERVISOR_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getEconomySupportSupervisor());
      }
      if (hasManagePricing()) {
        hash = (37 * hash) + MANAGE_PRICING_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getManagePricing());
      }
      if (hasBroadcastLive()) {
        hash = (37 * hash) + BROADCAST_LIVE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getBroadcastLive());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SteammessagesBase.CMsgAppRights parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesBase.CMsgAppRights parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesBase.CMsgAppRights parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesBase.CMsgAppRights parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesBase.CMsgAppRights parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesBase.CMsgAppRights parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesBase.CMsgAppRights parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesBase.CMsgAppRights parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesBase.CMsgAppRights parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SteammessagesBase.CMsgAppRights parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesBase.CMsgAppRights parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesBase.CMsgAppRights parseFrom(
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
    public static Builder newBuilder(SteammessagesBase.CMsgAppRights prototype) {
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
     * Protobuf type {@code CMsgAppRights}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CMsgAppRights)
        SteammessagesBase.CMsgAppRightsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SteammessagesBase.internal_static_CMsgAppRights_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SteammessagesBase.internal_static_CMsgAppRights_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SteammessagesBase.CMsgAppRights.class, SteammessagesBase.CMsgAppRights.Builder.class);
      }

      // Construct using SteammessagesBase.CMsgAppRights.newBuilder()
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
        editInfo_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        publish_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        viewErrorData_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        download_ = false;
        bitField0_ = (bitField0_ & ~0x00000008);
        uploadCdkeys_ = false;
        bitField0_ = (bitField0_ & ~0x00000010);
        generateCdkeys_ = false;
        bitField0_ = (bitField0_ & ~0x00000020);
        viewFinancials_ = false;
        bitField0_ = (bitField0_ & ~0x00000040);
        manageCeg_ = false;
        bitField0_ = (bitField0_ & ~0x00000080);
        manageSigning_ = false;
        bitField0_ = (bitField0_ & ~0x00000100);
        manageCdkeys_ = false;
        bitField0_ = (bitField0_ & ~0x00000200);
        editMarketing_ = false;
        bitField0_ = (bitField0_ & ~0x00000400);
        economySupport_ = false;
        bitField0_ = (bitField0_ & ~0x00000800);
        economySupportSupervisor_ = false;
        bitField0_ = (bitField0_ & ~0x00001000);
        managePricing_ = false;
        bitField0_ = (bitField0_ & ~0x00002000);
        broadcastLive_ = false;
        bitField0_ = (bitField0_ & ~0x00004000);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SteammessagesBase.internal_static_CMsgAppRights_descriptor;
      }

      public SteammessagesBase.CMsgAppRights getDefaultInstanceForType() {
        return SteammessagesBase.CMsgAppRights.getDefaultInstance();
      }

      public SteammessagesBase.CMsgAppRights build() {
        SteammessagesBase.CMsgAppRights result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SteammessagesBase.CMsgAppRights buildPartial() {
        SteammessagesBase.CMsgAppRights result = new SteammessagesBase.CMsgAppRights(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.editInfo_ = editInfo_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.publish_ = publish_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.viewErrorData_ = viewErrorData_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.download_ = download_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.uploadCdkeys_ = uploadCdkeys_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.generateCdkeys_ = generateCdkeys_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.viewFinancials_ = viewFinancials_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.manageCeg_ = manageCeg_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.manageSigning_ = manageSigning_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.manageCdkeys_ = manageCdkeys_;
        if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
          to_bitField0_ |= 0x00000400;
        }
        result.editMarketing_ = editMarketing_;
        if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
          to_bitField0_ |= 0x00000800;
        }
        result.economySupport_ = economySupport_;
        if (((from_bitField0_ & 0x00001000) == 0x00001000)) {
          to_bitField0_ |= 0x00001000;
        }
        result.economySupportSupervisor_ = economySupportSupervisor_;
        if (((from_bitField0_ & 0x00002000) == 0x00002000)) {
          to_bitField0_ |= 0x00002000;
        }
        result.managePricing_ = managePricing_;
        if (((from_bitField0_ & 0x00004000) == 0x00004000)) {
          to_bitField0_ |= 0x00004000;
        }
        result.broadcastLive_ = broadcastLive_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
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
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SteammessagesBase.CMsgAppRights) {
          return mergeFrom((SteammessagesBase.CMsgAppRights)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SteammessagesBase.CMsgAppRights other) {
        if (other == SteammessagesBase.CMsgAppRights.getDefaultInstance()) return this;
        if (other.hasEditInfo()) {
          setEditInfo(other.getEditInfo());
        }
        if (other.hasPublish()) {
          setPublish(other.getPublish());
        }
        if (other.hasViewErrorData()) {
          setViewErrorData(other.getViewErrorData());
        }
        if (other.hasDownload()) {
          setDownload(other.getDownload());
        }
        if (other.hasUploadCdkeys()) {
          setUploadCdkeys(other.getUploadCdkeys());
        }
        if (other.hasGenerateCdkeys()) {
          setGenerateCdkeys(other.getGenerateCdkeys());
        }
        if (other.hasViewFinancials()) {
          setViewFinancials(other.getViewFinancials());
        }
        if (other.hasManageCeg()) {
          setManageCeg(other.getManageCeg());
        }
        if (other.hasManageSigning()) {
          setManageSigning(other.getManageSigning());
        }
        if (other.hasManageCdkeys()) {
          setManageCdkeys(other.getManageCdkeys());
        }
        if (other.hasEditMarketing()) {
          setEditMarketing(other.getEditMarketing());
        }
        if (other.hasEconomySupport()) {
          setEconomySupport(other.getEconomySupport());
        }
        if (other.hasEconomySupportSupervisor()) {
          setEconomySupportSupervisor(other.getEconomySupportSupervisor());
        }
        if (other.hasManagePricing()) {
          setManagePricing(other.getManagePricing());
        }
        if (other.hasBroadcastLive()) {
          setBroadcastLive(other.getBroadcastLive());
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
        SteammessagesBase.CMsgAppRights parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SteammessagesBase.CMsgAppRights) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean editInfo_ ;
      /**
       * <code>optional bool edit_info = 1;</code>
       */
      public boolean hasEditInfo() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional bool edit_info = 1;</code>
       */
      public boolean getEditInfo() {
        return editInfo_;
      }
      /**
       * <code>optional bool edit_info = 1;</code>
       */
      public Builder setEditInfo(boolean value) {
        bitField0_ |= 0x00000001;
        editInfo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool edit_info = 1;</code>
       */
      public Builder clearEditInfo() {
        bitField0_ = (bitField0_ & ~0x00000001);
        editInfo_ = false;
        onChanged();
        return this;
      }

      private boolean publish_ ;
      /**
       * <code>optional bool publish = 2;</code>
       */
      public boolean hasPublish() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional bool publish = 2;</code>
       */
      public boolean getPublish() {
        return publish_;
      }
      /**
       * <code>optional bool publish = 2;</code>
       */
      public Builder setPublish(boolean value) {
        bitField0_ |= 0x00000002;
        publish_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool publish = 2;</code>
       */
      public Builder clearPublish() {
        bitField0_ = (bitField0_ & ~0x00000002);
        publish_ = false;
        onChanged();
        return this;
      }

      private boolean viewErrorData_ ;
      /**
       * <code>optional bool view_error_data = 3;</code>
       */
      public boolean hasViewErrorData() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional bool view_error_data = 3;</code>
       */
      public boolean getViewErrorData() {
        return viewErrorData_;
      }
      /**
       * <code>optional bool view_error_data = 3;</code>
       */
      public Builder setViewErrorData(boolean value) {
        bitField0_ |= 0x00000004;
        viewErrorData_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool view_error_data = 3;</code>
       */
      public Builder clearViewErrorData() {
        bitField0_ = (bitField0_ & ~0x00000004);
        viewErrorData_ = false;
        onChanged();
        return this;
      }

      private boolean download_ ;
      /**
       * <code>optional bool download = 4;</code>
       */
      public boolean hasDownload() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional bool download = 4;</code>
       */
      public boolean getDownload() {
        return download_;
      }
      /**
       * <code>optional bool download = 4;</code>
       */
      public Builder setDownload(boolean value) {
        bitField0_ |= 0x00000008;
        download_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool download = 4;</code>
       */
      public Builder clearDownload() {
        bitField0_ = (bitField0_ & ~0x00000008);
        download_ = false;
        onChanged();
        return this;
      }

      private boolean uploadCdkeys_ ;
      /**
       * <code>optional bool upload_cdkeys = 5;</code>
       */
      public boolean hasUploadCdkeys() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional bool upload_cdkeys = 5;</code>
       */
      public boolean getUploadCdkeys() {
        return uploadCdkeys_;
      }
      /**
       * <code>optional bool upload_cdkeys = 5;</code>
       */
      public Builder setUploadCdkeys(boolean value) {
        bitField0_ |= 0x00000010;
        uploadCdkeys_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool upload_cdkeys = 5;</code>
       */
      public Builder clearUploadCdkeys() {
        bitField0_ = (bitField0_ & ~0x00000010);
        uploadCdkeys_ = false;
        onChanged();
        return this;
      }

      private boolean generateCdkeys_ ;
      /**
       * <code>optional bool generate_cdkeys = 6;</code>
       */
      public boolean hasGenerateCdkeys() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional bool generate_cdkeys = 6;</code>
       */
      public boolean getGenerateCdkeys() {
        return generateCdkeys_;
      }
      /**
       * <code>optional bool generate_cdkeys = 6;</code>
       */
      public Builder setGenerateCdkeys(boolean value) {
        bitField0_ |= 0x00000020;
        generateCdkeys_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool generate_cdkeys = 6;</code>
       */
      public Builder clearGenerateCdkeys() {
        bitField0_ = (bitField0_ & ~0x00000020);
        generateCdkeys_ = false;
        onChanged();
        return this;
      }

      private boolean viewFinancials_ ;
      /**
       * <code>optional bool view_financials = 7;</code>
       */
      public boolean hasViewFinancials() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional bool view_financials = 7;</code>
       */
      public boolean getViewFinancials() {
        return viewFinancials_;
      }
      /**
       * <code>optional bool view_financials = 7;</code>
       */
      public Builder setViewFinancials(boolean value) {
        bitField0_ |= 0x00000040;
        viewFinancials_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool view_financials = 7;</code>
       */
      public Builder clearViewFinancials() {
        bitField0_ = (bitField0_ & ~0x00000040);
        viewFinancials_ = false;
        onChanged();
        return this;
      }

      private boolean manageCeg_ ;
      /**
       * <code>optional bool manage_ceg = 8;</code>
       */
      public boolean hasManageCeg() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional bool manage_ceg = 8;</code>
       */
      public boolean getManageCeg() {
        return manageCeg_;
      }
      /**
       * <code>optional bool manage_ceg = 8;</code>
       */
      public Builder setManageCeg(boolean value) {
        bitField0_ |= 0x00000080;
        manageCeg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool manage_ceg = 8;</code>
       */
      public Builder clearManageCeg() {
        bitField0_ = (bitField0_ & ~0x00000080);
        manageCeg_ = false;
        onChanged();
        return this;
      }

      private boolean manageSigning_ ;
      /**
       * <code>optional bool manage_signing = 9;</code>
       */
      public boolean hasManageSigning() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>optional bool manage_signing = 9;</code>
       */
      public boolean getManageSigning() {
        return manageSigning_;
      }
      /**
       * <code>optional bool manage_signing = 9;</code>
       */
      public Builder setManageSigning(boolean value) {
        bitField0_ |= 0x00000100;
        manageSigning_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool manage_signing = 9;</code>
       */
      public Builder clearManageSigning() {
        bitField0_ = (bitField0_ & ~0x00000100);
        manageSigning_ = false;
        onChanged();
        return this;
      }

      private boolean manageCdkeys_ ;
      /**
       * <code>optional bool manage_cdkeys = 10;</code>
       */
      public boolean hasManageCdkeys() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      /**
       * <code>optional bool manage_cdkeys = 10;</code>
       */
      public boolean getManageCdkeys() {
        return manageCdkeys_;
      }
      /**
       * <code>optional bool manage_cdkeys = 10;</code>
       */
      public Builder setManageCdkeys(boolean value) {
        bitField0_ |= 0x00000200;
        manageCdkeys_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool manage_cdkeys = 10;</code>
       */
      public Builder clearManageCdkeys() {
        bitField0_ = (bitField0_ & ~0x00000200);
        manageCdkeys_ = false;
        onChanged();
        return this;
      }

      private boolean editMarketing_ ;
      /**
       * <code>optional bool edit_marketing = 11;</code>
       */
      public boolean hasEditMarketing() {
        return ((bitField0_ & 0x00000400) == 0x00000400);
      }
      /**
       * <code>optional bool edit_marketing = 11;</code>
       */
      public boolean getEditMarketing() {
        return editMarketing_;
      }
      /**
       * <code>optional bool edit_marketing = 11;</code>
       */
      public Builder setEditMarketing(boolean value) {
        bitField0_ |= 0x00000400;
        editMarketing_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool edit_marketing = 11;</code>
       */
      public Builder clearEditMarketing() {
        bitField0_ = (bitField0_ & ~0x00000400);
        editMarketing_ = false;
        onChanged();
        return this;
      }

      private boolean economySupport_ ;
      /**
       * <code>optional bool economy_support = 12;</code>
       */
      public boolean hasEconomySupport() {
        return ((bitField0_ & 0x00000800) == 0x00000800);
      }
      /**
       * <code>optional bool economy_support = 12;</code>
       */
      public boolean getEconomySupport() {
        return economySupport_;
      }
      /**
       * <code>optional bool economy_support = 12;</code>
       */
      public Builder setEconomySupport(boolean value) {
        bitField0_ |= 0x00000800;
        economySupport_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool economy_support = 12;</code>
       */
      public Builder clearEconomySupport() {
        bitField0_ = (bitField0_ & ~0x00000800);
        economySupport_ = false;
        onChanged();
        return this;
      }

      private boolean economySupportSupervisor_ ;
      /**
       * <code>optional bool economy_support_supervisor = 13;</code>
       */
      public boolean hasEconomySupportSupervisor() {
        return ((bitField0_ & 0x00001000) == 0x00001000);
      }
      /**
       * <code>optional bool economy_support_supervisor = 13;</code>
       */
      public boolean getEconomySupportSupervisor() {
        return economySupportSupervisor_;
      }
      /**
       * <code>optional bool economy_support_supervisor = 13;</code>
       */
      public Builder setEconomySupportSupervisor(boolean value) {
        bitField0_ |= 0x00001000;
        economySupportSupervisor_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool economy_support_supervisor = 13;</code>
       */
      public Builder clearEconomySupportSupervisor() {
        bitField0_ = (bitField0_ & ~0x00001000);
        economySupportSupervisor_ = false;
        onChanged();
        return this;
      }

      private boolean managePricing_ ;
      /**
       * <code>optional bool manage_pricing = 14;</code>
       */
      public boolean hasManagePricing() {
        return ((bitField0_ & 0x00002000) == 0x00002000);
      }
      /**
       * <code>optional bool manage_pricing = 14;</code>
       */
      public boolean getManagePricing() {
        return managePricing_;
      }
      /**
       * <code>optional bool manage_pricing = 14;</code>
       */
      public Builder setManagePricing(boolean value) {
        bitField0_ |= 0x00002000;
        managePricing_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool manage_pricing = 14;</code>
       */
      public Builder clearManagePricing() {
        bitField0_ = (bitField0_ & ~0x00002000);
        managePricing_ = false;
        onChanged();
        return this;
      }

      private boolean broadcastLive_ ;
      /**
       * <code>optional bool broadcast_live = 15;</code>
       */
      public boolean hasBroadcastLive() {
        return ((bitField0_ & 0x00004000) == 0x00004000);
      }
      /**
       * <code>optional bool broadcast_live = 15;</code>
       */
      public boolean getBroadcastLive() {
        return broadcastLive_;
      }
      /**
       * <code>optional bool broadcast_live = 15;</code>
       */
      public Builder setBroadcastLive(boolean value) {
        bitField0_ |= 0x00004000;
        broadcastLive_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool broadcast_live = 15;</code>
       */
      public Builder clearBroadcastLive() {
        bitField0_ = (bitField0_ & ~0x00004000);
        broadcastLive_ = false;
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


      // @@protoc_insertion_point(builder_scope:CMsgAppRights)
    }

    // @@protoc_insertion_point(class_scope:CMsgAppRights)
    private static final SteammessagesBase.CMsgAppRights DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SteammessagesBase.CMsgAppRights();
    }

    public static SteammessagesBase.CMsgAppRights getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CMsgAppRights>
        PARSER = new com.google.protobuf.AbstractParser<CMsgAppRights>() {
      public CMsgAppRights parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CMsgAppRights(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CMsgAppRights> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CMsgAppRights> getParserForType() {
      return PARSER;
    }

    public SteammessagesBase.CMsgAppRights getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CCuratorPreferencesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CCuratorPreferences)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint32 supported_languages = 1;</code>
     */
    boolean hasSupportedLanguages();
    /**
     * <code>optional uint32 supported_languages = 1;</code>
     */
    int getSupportedLanguages();

    /**
     * <code>optional bool platform_windows = 2;</code>
     */
    boolean hasPlatformWindows();
    /**
     * <code>optional bool platform_windows = 2;</code>
     */
    boolean getPlatformWindows();

    /**
     * <code>optional bool platform_mac = 3;</code>
     */
    boolean hasPlatformMac();
    /**
     * <code>optional bool platform_mac = 3;</code>
     */
    boolean getPlatformMac();

    /**
     * <code>optional bool platform_linux = 4;</code>
     */
    boolean hasPlatformLinux();
    /**
     * <code>optional bool platform_linux = 4;</code>
     */
    boolean getPlatformLinux();

    /**
     * <code>optional bool vr_content = 5;</code>
     */
    boolean hasVrContent();
    /**
     * <code>optional bool vr_content = 5;</code>
     */
    boolean getVrContent();

    /**
     * <code>optional bool adult_content_violence = 6;</code>
     */
    boolean hasAdultContentViolence();
    /**
     * <code>optional bool adult_content_violence = 6;</code>
     */
    boolean getAdultContentViolence();

    /**
     * <code>optional bool adult_content_sex = 7;</code>
     */
    boolean hasAdultContentSex();
    /**
     * <code>optional bool adult_content_sex = 7;</code>
     */
    boolean getAdultContentSex();

    /**
     * <code>optional uint32 timestamp_updated = 8;</code>
     */
    boolean hasTimestampUpdated();
    /**
     * <code>optional uint32 timestamp_updated = 8;</code>
     */
    int getTimestampUpdated();

    /**
     * <code>repeated uint32 tagids_curated = 9;</code>
     */
    java.util.List<java.lang.Integer> getTagidsCuratedList();
    /**
     * <code>repeated uint32 tagids_curated = 9;</code>
     */
    int getTagidsCuratedCount();
    /**
     * <code>repeated uint32 tagids_curated = 9;</code>
     */
    int getTagidsCurated(int index);

    /**
     * <code>repeated uint32 tagids_filtered = 10;</code>
     */
    java.util.List<java.lang.Integer> getTagidsFilteredList();
    /**
     * <code>repeated uint32 tagids_filtered = 10;</code>
     */
    int getTagidsFilteredCount();
    /**
     * <code>repeated uint32 tagids_filtered = 10;</code>
     */
    int getTagidsFiltered(int index);

    /**
     * <code>optional string website_title = 11;</code>
     */
    boolean hasWebsiteTitle();
    /**
     * <code>optional string website_title = 11;</code>
     */
    java.lang.String getWebsiteTitle();
    /**
     * <code>optional string website_title = 11;</code>
     */
    com.google.protobuf.ByteString
        getWebsiteTitleBytes();

    /**
     * <code>optional string website_url = 12;</code>
     */
    boolean hasWebsiteUrl();
    /**
     * <code>optional string website_url = 12;</code>
     */
    java.lang.String getWebsiteUrl();
    /**
     * <code>optional string website_url = 12;</code>
     */
    com.google.protobuf.ByteString
        getWebsiteUrlBytes();

    /**
     * <code>optional string discussion_url = 13;</code>
     */
    boolean hasDiscussionUrl();
    /**
     * <code>optional string discussion_url = 13;</code>
     */
    java.lang.String getDiscussionUrl();
    /**
     * <code>optional string discussion_url = 13;</code>
     */
    com.google.protobuf.ByteString
        getDiscussionUrlBytes();

    /**
     * <code>optional bool show_broadcast = 14;</code>
     */
    boolean hasShowBroadcast();
    /**
     * <code>optional bool show_broadcast = 14;</code>
     */
    boolean getShowBroadcast();
  }
  /**
   * Protobuf type {@code CCuratorPreferences}
   */
  public  static final class CCuratorPreferences extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CCuratorPreferences)
      CCuratorPreferencesOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CCuratorPreferences.newBuilder() to construct.
    private CCuratorPreferences(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CCuratorPreferences() {
      supportedLanguages_ = 0;
      platformWindows_ = false;
      platformMac_ = false;
      platformLinux_ = false;
      vrContent_ = false;
      adultContentViolence_ = false;
      adultContentSex_ = false;
      timestampUpdated_ = 0;
      tagidsCurated_ = java.util.Collections.emptyList();
      tagidsFiltered_ = java.util.Collections.emptyList();
      websiteTitle_ = "";
      websiteUrl_ = "";
      discussionUrl_ = "";
      showBroadcast_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CCuratorPreferences(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              supportedLanguages_ = input.readUInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              platformWindows_ = input.readBool();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              platformMac_ = input.readBool();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              platformLinux_ = input.readBool();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              vrContent_ = input.readBool();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              adultContentViolence_ = input.readBool();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              adultContentSex_ = input.readBool();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              timestampUpdated_ = input.readUInt32();
              break;
            }
            case 72: {
              if (!((mutable_bitField0_ & 0x00000100) == 0x00000100)) {
                tagidsCurated_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000100;
              }
              tagidsCurated_.add(input.readUInt32());
              break;
            }
            case 74: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000100) == 0x00000100) && input.getBytesUntilLimit() > 0) {
                tagidsCurated_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000100;
              }
              while (input.getBytesUntilLimit() > 0) {
                tagidsCurated_.add(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 80: {
              if (!((mutable_bitField0_ & 0x00000200) == 0x00000200)) {
                tagidsFiltered_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000200;
              }
              tagidsFiltered_.add(input.readUInt32());
              break;
            }
            case 82: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000200) == 0x00000200) && input.getBytesUntilLimit() > 0) {
                tagidsFiltered_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000200;
              }
              while (input.getBytesUntilLimit() > 0) {
                tagidsFiltered_.add(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 90: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000100;
              websiteTitle_ = bs;
              break;
            }
            case 98: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000200;
              websiteUrl_ = bs;
              break;
            }
            case 106: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000400;
              discussionUrl_ = bs;
              break;
            }
            case 112: {
              bitField0_ |= 0x00000800;
              showBroadcast_ = input.readBool();
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
        if (((mutable_bitField0_ & 0x00000100) == 0x00000100)) {
          tagidsCurated_ = java.util.Collections.unmodifiableList(tagidsCurated_);
        }
        if (((mutable_bitField0_ & 0x00000200) == 0x00000200)) {
          tagidsFiltered_ = java.util.Collections.unmodifiableList(tagidsFiltered_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SteammessagesBase.internal_static_CCuratorPreferences_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SteammessagesBase.internal_static_CCuratorPreferences_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SteammessagesBase.CCuratorPreferences.class, SteammessagesBase.CCuratorPreferences.Builder.class);
    }

    private int bitField0_;
    public static final int SUPPORTED_LANGUAGES_FIELD_NUMBER = 1;
    private int supportedLanguages_;
    /**
     * <code>optional uint32 supported_languages = 1;</code>
     */
    public boolean hasSupportedLanguages() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint32 supported_languages = 1;</code>
     */
    public int getSupportedLanguages() {
      return supportedLanguages_;
    }

    public static final int PLATFORM_WINDOWS_FIELD_NUMBER = 2;
    private boolean platformWindows_;
    /**
     * <code>optional bool platform_windows = 2;</code>
     */
    public boolean hasPlatformWindows() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bool platform_windows = 2;</code>
     */
    public boolean getPlatformWindows() {
      return platformWindows_;
    }

    public static final int PLATFORM_MAC_FIELD_NUMBER = 3;
    private boolean platformMac_;
    /**
     * <code>optional bool platform_mac = 3;</code>
     */
    public boolean hasPlatformMac() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bool platform_mac = 3;</code>
     */
    public boolean getPlatformMac() {
      return platformMac_;
    }

    public static final int PLATFORM_LINUX_FIELD_NUMBER = 4;
    private boolean platformLinux_;
    /**
     * <code>optional bool platform_linux = 4;</code>
     */
    public boolean hasPlatformLinux() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional bool platform_linux = 4;</code>
     */
    public boolean getPlatformLinux() {
      return platformLinux_;
    }

    public static final int VR_CONTENT_FIELD_NUMBER = 5;
    private boolean vrContent_;
    /**
     * <code>optional bool vr_content = 5;</code>
     */
    public boolean hasVrContent() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional bool vr_content = 5;</code>
     */
    public boolean getVrContent() {
      return vrContent_;
    }

    public static final int ADULT_CONTENT_VIOLENCE_FIELD_NUMBER = 6;
    private boolean adultContentViolence_;
    /**
     * <code>optional bool adult_content_violence = 6;</code>
     */
    public boolean hasAdultContentViolence() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional bool adult_content_violence = 6;</code>
     */
    public boolean getAdultContentViolence() {
      return adultContentViolence_;
    }

    public static final int ADULT_CONTENT_SEX_FIELD_NUMBER = 7;
    private boolean adultContentSex_;
    /**
     * <code>optional bool adult_content_sex = 7;</code>
     */
    public boolean hasAdultContentSex() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional bool adult_content_sex = 7;</code>
     */
    public boolean getAdultContentSex() {
      return adultContentSex_;
    }

    public static final int TIMESTAMP_UPDATED_FIELD_NUMBER = 8;
    private int timestampUpdated_;
    /**
     * <code>optional uint32 timestamp_updated = 8;</code>
     */
    public boolean hasTimestampUpdated() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional uint32 timestamp_updated = 8;</code>
     */
    public int getTimestampUpdated() {
      return timestampUpdated_;
    }

    public static final int TAGIDS_CURATED_FIELD_NUMBER = 9;
    private java.util.List<java.lang.Integer> tagidsCurated_;
    /**
     * <code>repeated uint32 tagids_curated = 9;</code>
     */
    public java.util.List<java.lang.Integer>
        getTagidsCuratedList() {
      return tagidsCurated_;
    }
    /**
     * <code>repeated uint32 tagids_curated = 9;</code>
     */
    public int getTagidsCuratedCount() {
      return tagidsCurated_.size();
    }
    /**
     * <code>repeated uint32 tagids_curated = 9;</code>
     */
    public int getTagidsCurated(int index) {
      return tagidsCurated_.get(index);
    }

    public static final int TAGIDS_FILTERED_FIELD_NUMBER = 10;
    private java.util.List<java.lang.Integer> tagidsFiltered_;
    /**
     * <code>repeated uint32 tagids_filtered = 10;</code>
     */
    public java.util.List<java.lang.Integer>
        getTagidsFilteredList() {
      return tagidsFiltered_;
    }
    /**
     * <code>repeated uint32 tagids_filtered = 10;</code>
     */
    public int getTagidsFilteredCount() {
      return tagidsFiltered_.size();
    }
    /**
     * <code>repeated uint32 tagids_filtered = 10;</code>
     */
    public int getTagidsFiltered(int index) {
      return tagidsFiltered_.get(index);
    }

    public static final int WEBSITE_TITLE_FIELD_NUMBER = 11;
    private volatile java.lang.Object websiteTitle_;
    /**
     * <code>optional string website_title = 11;</code>
     */
    public boolean hasWebsiteTitle() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional string website_title = 11;</code>
     */
    public java.lang.String getWebsiteTitle() {
      java.lang.Object ref = websiteTitle_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          websiteTitle_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string website_title = 11;</code>
     */
    public com.google.protobuf.ByteString
        getWebsiteTitleBytes() {
      java.lang.Object ref = websiteTitle_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        websiteTitle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int WEBSITE_URL_FIELD_NUMBER = 12;
    private volatile java.lang.Object websiteUrl_;
    /**
     * <code>optional string website_url = 12;</code>
     */
    public boolean hasWebsiteUrl() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    /**
     * <code>optional string website_url = 12;</code>
     */
    public java.lang.String getWebsiteUrl() {
      java.lang.Object ref = websiteUrl_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          websiteUrl_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string website_url = 12;</code>
     */
    public com.google.protobuf.ByteString
        getWebsiteUrlBytes() {
      java.lang.Object ref = websiteUrl_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        websiteUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DISCUSSION_URL_FIELD_NUMBER = 13;
    private volatile java.lang.Object discussionUrl_;
    /**
     * <code>optional string discussion_url = 13;</code>
     */
    public boolean hasDiscussionUrl() {
      return ((bitField0_ & 0x00000400) == 0x00000400);
    }
    /**
     * <code>optional string discussion_url = 13;</code>
     */
    public java.lang.String getDiscussionUrl() {
      java.lang.Object ref = discussionUrl_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          discussionUrl_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string discussion_url = 13;</code>
     */
    public com.google.protobuf.ByteString
        getDiscussionUrlBytes() {
      java.lang.Object ref = discussionUrl_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        discussionUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SHOW_BROADCAST_FIELD_NUMBER = 14;
    private boolean showBroadcast_;
    /**
     * <code>optional bool show_broadcast = 14;</code>
     */
    public boolean hasShowBroadcast() {
      return ((bitField0_ & 0x00000800) == 0x00000800);
    }
    /**
     * <code>optional bool show_broadcast = 14;</code>
     */
    public boolean getShowBroadcast() {
      return showBroadcast_;
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
        output.writeUInt32(1, supportedLanguages_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, platformWindows_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(3, platformMac_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBool(4, platformLinux_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBool(5, vrContent_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBool(6, adultContentViolence_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBool(7, adultContentSex_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeUInt32(8, timestampUpdated_);
      }
      for (int i = 0; i < tagidsCurated_.size(); i++) {
        output.writeUInt32(9, tagidsCurated_.get(i));
      }
      for (int i = 0; i < tagidsFiltered_.size(); i++) {
        output.writeUInt32(10, tagidsFiltered_.get(i));
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 11, websiteTitle_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 12, websiteUrl_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 13, discussionUrl_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        output.writeBool(14, showBroadcast_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, supportedLanguages_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, platformWindows_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, platformMac_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, platformLinux_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, vrContent_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, adultContentViolence_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, adultContentSex_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, timestampUpdated_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < tagidsCurated_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(tagidsCurated_.get(i));
        }
        size += dataSize;
        size += 1 * getTagidsCuratedList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < tagidsFiltered_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(tagidsFiltered_.get(i));
        }
        size += dataSize;
        size += 1 * getTagidsFilteredList().size();
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, websiteTitle_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, websiteUrl_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(13, discussionUrl_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, showBroadcast_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SteammessagesBase.CCuratorPreferences)) {
        return super.equals(obj);
      }
      SteammessagesBase.CCuratorPreferences other = (SteammessagesBase.CCuratorPreferences) obj;

      boolean result = true;
      result = result && (hasSupportedLanguages() == other.hasSupportedLanguages());
      if (hasSupportedLanguages()) {
        result = result && (getSupportedLanguages()
            == other.getSupportedLanguages());
      }
      result = result && (hasPlatformWindows() == other.hasPlatformWindows());
      if (hasPlatformWindows()) {
        result = result && (getPlatformWindows()
            == other.getPlatformWindows());
      }
      result = result && (hasPlatformMac() == other.hasPlatformMac());
      if (hasPlatformMac()) {
        result = result && (getPlatformMac()
            == other.getPlatformMac());
      }
      result = result && (hasPlatformLinux() == other.hasPlatformLinux());
      if (hasPlatformLinux()) {
        result = result && (getPlatformLinux()
            == other.getPlatformLinux());
      }
      result = result && (hasVrContent() == other.hasVrContent());
      if (hasVrContent()) {
        result = result && (getVrContent()
            == other.getVrContent());
      }
      result = result && (hasAdultContentViolence() == other.hasAdultContentViolence());
      if (hasAdultContentViolence()) {
        result = result && (getAdultContentViolence()
            == other.getAdultContentViolence());
      }
      result = result && (hasAdultContentSex() == other.hasAdultContentSex());
      if (hasAdultContentSex()) {
        result = result && (getAdultContentSex()
            == other.getAdultContentSex());
      }
      result = result && (hasTimestampUpdated() == other.hasTimestampUpdated());
      if (hasTimestampUpdated()) {
        result = result && (getTimestampUpdated()
            == other.getTimestampUpdated());
      }
      result = result && getTagidsCuratedList()
          .equals(other.getTagidsCuratedList());
      result = result && getTagidsFilteredList()
          .equals(other.getTagidsFilteredList());
      result = result && (hasWebsiteTitle() == other.hasWebsiteTitle());
      if (hasWebsiteTitle()) {
        result = result && getWebsiteTitle()
            .equals(other.getWebsiteTitle());
      }
      result = result && (hasWebsiteUrl() == other.hasWebsiteUrl());
      if (hasWebsiteUrl()) {
        result = result && getWebsiteUrl()
            .equals(other.getWebsiteUrl());
      }
      result = result && (hasDiscussionUrl() == other.hasDiscussionUrl());
      if (hasDiscussionUrl()) {
        result = result && getDiscussionUrl()
            .equals(other.getDiscussionUrl());
      }
      result = result && (hasShowBroadcast() == other.hasShowBroadcast());
      if (hasShowBroadcast()) {
        result = result && (getShowBroadcast()
            == other.getShowBroadcast());
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
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSupportedLanguages()) {
        hash = (37 * hash) + SUPPORTED_LANGUAGES_FIELD_NUMBER;
        hash = (53 * hash) + getSupportedLanguages();
      }
      if (hasPlatformWindows()) {
        hash = (37 * hash) + PLATFORM_WINDOWS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getPlatformWindows());
      }
      if (hasPlatformMac()) {
        hash = (37 * hash) + PLATFORM_MAC_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getPlatformMac());
      }
      if (hasPlatformLinux()) {
        hash = (37 * hash) + PLATFORM_LINUX_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getPlatformLinux());
      }
      if (hasVrContent()) {
        hash = (37 * hash) + VR_CONTENT_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getVrContent());
      }
      if (hasAdultContentViolence()) {
        hash = (37 * hash) + ADULT_CONTENT_VIOLENCE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getAdultContentViolence());
      }
      if (hasAdultContentSex()) {
        hash = (37 * hash) + ADULT_CONTENT_SEX_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getAdultContentSex());
      }
      if (hasTimestampUpdated()) {
        hash = (37 * hash) + TIMESTAMP_UPDATED_FIELD_NUMBER;
        hash = (53 * hash) + getTimestampUpdated();
      }
      if (getTagidsCuratedCount() > 0) {
        hash = (37 * hash) + TAGIDS_CURATED_FIELD_NUMBER;
        hash = (53 * hash) + getTagidsCuratedList().hashCode();
      }
      if (getTagidsFilteredCount() > 0) {
        hash = (37 * hash) + TAGIDS_FILTERED_FIELD_NUMBER;
        hash = (53 * hash) + getTagidsFilteredList().hashCode();
      }
      if (hasWebsiteTitle()) {
        hash = (37 * hash) + WEBSITE_TITLE_FIELD_NUMBER;
        hash = (53 * hash) + getWebsiteTitle().hashCode();
      }
      if (hasWebsiteUrl()) {
        hash = (37 * hash) + WEBSITE_URL_FIELD_NUMBER;
        hash = (53 * hash) + getWebsiteUrl().hashCode();
      }
      if (hasDiscussionUrl()) {
        hash = (37 * hash) + DISCUSSION_URL_FIELD_NUMBER;
        hash = (53 * hash) + getDiscussionUrl().hashCode();
      }
      if (hasShowBroadcast()) {
        hash = (37 * hash) + SHOW_BROADCAST_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getShowBroadcast());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SteammessagesBase.CCuratorPreferences parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesBase.CCuratorPreferences parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesBase.CCuratorPreferences parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesBase.CCuratorPreferences parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesBase.CCuratorPreferences parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesBase.CCuratorPreferences parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesBase.CCuratorPreferences parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesBase.CCuratorPreferences parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesBase.CCuratorPreferences parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SteammessagesBase.CCuratorPreferences parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesBase.CCuratorPreferences parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesBase.CCuratorPreferences parseFrom(
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
    public static Builder newBuilder(SteammessagesBase.CCuratorPreferences prototype) {
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
     * Protobuf type {@code CCuratorPreferences}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CCuratorPreferences)
        SteammessagesBase.CCuratorPreferencesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SteammessagesBase.internal_static_CCuratorPreferences_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SteammessagesBase.internal_static_CCuratorPreferences_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SteammessagesBase.CCuratorPreferences.class, SteammessagesBase.CCuratorPreferences.Builder.class);
      }

      // Construct using SteammessagesBase.CCuratorPreferences.newBuilder()
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
        supportedLanguages_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        platformWindows_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        platformMac_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        platformLinux_ = false;
        bitField0_ = (bitField0_ & ~0x00000008);
        vrContent_ = false;
        bitField0_ = (bitField0_ & ~0x00000010);
        adultContentViolence_ = false;
        bitField0_ = (bitField0_ & ~0x00000020);
        adultContentSex_ = false;
        bitField0_ = (bitField0_ & ~0x00000040);
        timestampUpdated_ = 0;
        bitField0_ = (bitField0_ & ~0x00000080);
        tagidsCurated_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000100);
        tagidsFiltered_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000200);
        websiteTitle_ = "";
        bitField0_ = (bitField0_ & ~0x00000400);
        websiteUrl_ = "";
        bitField0_ = (bitField0_ & ~0x00000800);
        discussionUrl_ = "";
        bitField0_ = (bitField0_ & ~0x00001000);
        showBroadcast_ = false;
        bitField0_ = (bitField0_ & ~0x00002000);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SteammessagesBase.internal_static_CCuratorPreferences_descriptor;
      }

      public SteammessagesBase.CCuratorPreferences getDefaultInstanceForType() {
        return SteammessagesBase.CCuratorPreferences.getDefaultInstance();
      }

      public SteammessagesBase.CCuratorPreferences build() {
        SteammessagesBase.CCuratorPreferences result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SteammessagesBase.CCuratorPreferences buildPartial() {
        SteammessagesBase.CCuratorPreferences result = new SteammessagesBase.CCuratorPreferences(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.supportedLanguages_ = supportedLanguages_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.platformWindows_ = platformWindows_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.platformMac_ = platformMac_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.platformLinux_ = platformLinux_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.vrContent_ = vrContent_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.adultContentViolence_ = adultContentViolence_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.adultContentSex_ = adultContentSex_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.timestampUpdated_ = timestampUpdated_;
        if (((bitField0_ & 0x00000100) == 0x00000100)) {
          tagidsCurated_ = java.util.Collections.unmodifiableList(tagidsCurated_);
          bitField0_ = (bitField0_ & ~0x00000100);
        }
        result.tagidsCurated_ = tagidsCurated_;
        if (((bitField0_ & 0x00000200) == 0x00000200)) {
          tagidsFiltered_ = java.util.Collections.unmodifiableList(tagidsFiltered_);
          bitField0_ = (bitField0_ & ~0x00000200);
        }
        result.tagidsFiltered_ = tagidsFiltered_;
        if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
          to_bitField0_ |= 0x00000100;
        }
        result.websiteTitle_ = websiteTitle_;
        if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
          to_bitField0_ |= 0x00000200;
        }
        result.websiteUrl_ = websiteUrl_;
        if (((from_bitField0_ & 0x00001000) == 0x00001000)) {
          to_bitField0_ |= 0x00000400;
        }
        result.discussionUrl_ = discussionUrl_;
        if (((from_bitField0_ & 0x00002000) == 0x00002000)) {
          to_bitField0_ |= 0x00000800;
        }
        result.showBroadcast_ = showBroadcast_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
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
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SteammessagesBase.CCuratorPreferences) {
          return mergeFrom((SteammessagesBase.CCuratorPreferences)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SteammessagesBase.CCuratorPreferences other) {
        if (other == SteammessagesBase.CCuratorPreferences.getDefaultInstance()) return this;
        if (other.hasSupportedLanguages()) {
          setSupportedLanguages(other.getSupportedLanguages());
        }
        if (other.hasPlatformWindows()) {
          setPlatformWindows(other.getPlatformWindows());
        }
        if (other.hasPlatformMac()) {
          setPlatformMac(other.getPlatformMac());
        }
        if (other.hasPlatformLinux()) {
          setPlatformLinux(other.getPlatformLinux());
        }
        if (other.hasVrContent()) {
          setVrContent(other.getVrContent());
        }
        if (other.hasAdultContentViolence()) {
          setAdultContentViolence(other.getAdultContentViolence());
        }
        if (other.hasAdultContentSex()) {
          setAdultContentSex(other.getAdultContentSex());
        }
        if (other.hasTimestampUpdated()) {
          setTimestampUpdated(other.getTimestampUpdated());
        }
        if (!other.tagidsCurated_.isEmpty()) {
          if (tagidsCurated_.isEmpty()) {
            tagidsCurated_ = other.tagidsCurated_;
            bitField0_ = (bitField0_ & ~0x00000100);
          } else {
            ensureTagidsCuratedIsMutable();
            tagidsCurated_.addAll(other.tagidsCurated_);
          }
          onChanged();
        }
        if (!other.tagidsFiltered_.isEmpty()) {
          if (tagidsFiltered_.isEmpty()) {
            tagidsFiltered_ = other.tagidsFiltered_;
            bitField0_ = (bitField0_ & ~0x00000200);
          } else {
            ensureTagidsFilteredIsMutable();
            tagidsFiltered_.addAll(other.tagidsFiltered_);
          }
          onChanged();
        }
        if (other.hasWebsiteTitle()) {
          bitField0_ |= 0x00000400;
          websiteTitle_ = other.websiteTitle_;
          onChanged();
        }
        if (other.hasWebsiteUrl()) {
          bitField0_ |= 0x00000800;
          websiteUrl_ = other.websiteUrl_;
          onChanged();
        }
        if (other.hasDiscussionUrl()) {
          bitField0_ |= 0x00001000;
          discussionUrl_ = other.discussionUrl_;
          onChanged();
        }
        if (other.hasShowBroadcast()) {
          setShowBroadcast(other.getShowBroadcast());
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
        SteammessagesBase.CCuratorPreferences parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SteammessagesBase.CCuratorPreferences) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int supportedLanguages_ ;
      /**
       * <code>optional uint32 supported_languages = 1;</code>
       */
      public boolean hasSupportedLanguages() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional uint32 supported_languages = 1;</code>
       */
      public int getSupportedLanguages() {
        return supportedLanguages_;
      }
      /**
       * <code>optional uint32 supported_languages = 1;</code>
       */
      public Builder setSupportedLanguages(int value) {
        bitField0_ |= 0x00000001;
        supportedLanguages_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 supported_languages = 1;</code>
       */
      public Builder clearSupportedLanguages() {
        bitField0_ = (bitField0_ & ~0x00000001);
        supportedLanguages_ = 0;
        onChanged();
        return this;
      }

      private boolean platformWindows_ ;
      /**
       * <code>optional bool platform_windows = 2;</code>
       */
      public boolean hasPlatformWindows() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional bool platform_windows = 2;</code>
       */
      public boolean getPlatformWindows() {
        return platformWindows_;
      }
      /**
       * <code>optional bool platform_windows = 2;</code>
       */
      public Builder setPlatformWindows(boolean value) {
        bitField0_ |= 0x00000002;
        platformWindows_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool platform_windows = 2;</code>
       */
      public Builder clearPlatformWindows() {
        bitField0_ = (bitField0_ & ~0x00000002);
        platformWindows_ = false;
        onChanged();
        return this;
      }

      private boolean platformMac_ ;
      /**
       * <code>optional bool platform_mac = 3;</code>
       */
      public boolean hasPlatformMac() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional bool platform_mac = 3;</code>
       */
      public boolean getPlatformMac() {
        return platformMac_;
      }
      /**
       * <code>optional bool platform_mac = 3;</code>
       */
      public Builder setPlatformMac(boolean value) {
        bitField0_ |= 0x00000004;
        platformMac_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool platform_mac = 3;</code>
       */
      public Builder clearPlatformMac() {
        bitField0_ = (bitField0_ & ~0x00000004);
        platformMac_ = false;
        onChanged();
        return this;
      }

      private boolean platformLinux_ ;
      /**
       * <code>optional bool platform_linux = 4;</code>
       */
      public boolean hasPlatformLinux() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional bool platform_linux = 4;</code>
       */
      public boolean getPlatformLinux() {
        return platformLinux_;
      }
      /**
       * <code>optional bool platform_linux = 4;</code>
       */
      public Builder setPlatformLinux(boolean value) {
        bitField0_ |= 0x00000008;
        platformLinux_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool platform_linux = 4;</code>
       */
      public Builder clearPlatformLinux() {
        bitField0_ = (bitField0_ & ~0x00000008);
        platformLinux_ = false;
        onChanged();
        return this;
      }

      private boolean vrContent_ ;
      /**
       * <code>optional bool vr_content = 5;</code>
       */
      public boolean hasVrContent() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional bool vr_content = 5;</code>
       */
      public boolean getVrContent() {
        return vrContent_;
      }
      /**
       * <code>optional bool vr_content = 5;</code>
       */
      public Builder setVrContent(boolean value) {
        bitField0_ |= 0x00000010;
        vrContent_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool vr_content = 5;</code>
       */
      public Builder clearVrContent() {
        bitField0_ = (bitField0_ & ~0x00000010);
        vrContent_ = false;
        onChanged();
        return this;
      }

      private boolean adultContentViolence_ ;
      /**
       * <code>optional bool adult_content_violence = 6;</code>
       */
      public boolean hasAdultContentViolence() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional bool adult_content_violence = 6;</code>
       */
      public boolean getAdultContentViolence() {
        return adultContentViolence_;
      }
      /**
       * <code>optional bool adult_content_violence = 6;</code>
       */
      public Builder setAdultContentViolence(boolean value) {
        bitField0_ |= 0x00000020;
        adultContentViolence_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool adult_content_violence = 6;</code>
       */
      public Builder clearAdultContentViolence() {
        bitField0_ = (bitField0_ & ~0x00000020);
        adultContentViolence_ = false;
        onChanged();
        return this;
      }

      private boolean adultContentSex_ ;
      /**
       * <code>optional bool adult_content_sex = 7;</code>
       */
      public boolean hasAdultContentSex() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional bool adult_content_sex = 7;</code>
       */
      public boolean getAdultContentSex() {
        return adultContentSex_;
      }
      /**
       * <code>optional bool adult_content_sex = 7;</code>
       */
      public Builder setAdultContentSex(boolean value) {
        bitField0_ |= 0x00000040;
        adultContentSex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool adult_content_sex = 7;</code>
       */
      public Builder clearAdultContentSex() {
        bitField0_ = (bitField0_ & ~0x00000040);
        adultContentSex_ = false;
        onChanged();
        return this;
      }

      private int timestampUpdated_ ;
      /**
       * <code>optional uint32 timestamp_updated = 8;</code>
       */
      public boolean hasTimestampUpdated() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional uint32 timestamp_updated = 8;</code>
       */
      public int getTimestampUpdated() {
        return timestampUpdated_;
      }
      /**
       * <code>optional uint32 timestamp_updated = 8;</code>
       */
      public Builder setTimestampUpdated(int value) {
        bitField0_ |= 0x00000080;
        timestampUpdated_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 timestamp_updated = 8;</code>
       */
      public Builder clearTimestampUpdated() {
        bitField0_ = (bitField0_ & ~0x00000080);
        timestampUpdated_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Integer> tagidsCurated_ = java.util.Collections.emptyList();
      private void ensureTagidsCuratedIsMutable() {
        if (!((bitField0_ & 0x00000100) == 0x00000100)) {
          tagidsCurated_ = new java.util.ArrayList<java.lang.Integer>(tagidsCurated_);
          bitField0_ |= 0x00000100;
         }
      }
      /**
       * <code>repeated uint32 tagids_curated = 9;</code>
       */
      public java.util.List<java.lang.Integer>
          getTagidsCuratedList() {
        return java.util.Collections.unmodifiableList(tagidsCurated_);
      }
      /**
       * <code>repeated uint32 tagids_curated = 9;</code>
       */
      public int getTagidsCuratedCount() {
        return tagidsCurated_.size();
      }
      /**
       * <code>repeated uint32 tagids_curated = 9;</code>
       */
      public int getTagidsCurated(int index) {
        return tagidsCurated_.get(index);
      }
      /**
       * <code>repeated uint32 tagids_curated = 9;</code>
       */
      public Builder setTagidsCurated(
          int index, int value) {
        ensureTagidsCuratedIsMutable();
        tagidsCurated_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 tagids_curated = 9;</code>
       */
      public Builder addTagidsCurated(int value) {
        ensureTagidsCuratedIsMutable();
        tagidsCurated_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 tagids_curated = 9;</code>
       */
      public Builder addAllTagidsCurated(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureTagidsCuratedIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tagidsCurated_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 tagids_curated = 9;</code>
       */
      public Builder clearTagidsCurated() {
        tagidsCurated_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000100);
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Integer> tagidsFiltered_ = java.util.Collections.emptyList();
      private void ensureTagidsFilteredIsMutable() {
        if (!((bitField0_ & 0x00000200) == 0x00000200)) {
          tagidsFiltered_ = new java.util.ArrayList<java.lang.Integer>(tagidsFiltered_);
          bitField0_ |= 0x00000200;
         }
      }
      /**
       * <code>repeated uint32 tagids_filtered = 10;</code>
       */
      public java.util.List<java.lang.Integer>
          getTagidsFilteredList() {
        return java.util.Collections.unmodifiableList(tagidsFiltered_);
      }
      /**
       * <code>repeated uint32 tagids_filtered = 10;</code>
       */
      public int getTagidsFilteredCount() {
        return tagidsFiltered_.size();
      }
      /**
       * <code>repeated uint32 tagids_filtered = 10;</code>
       */
      public int getTagidsFiltered(int index) {
        return tagidsFiltered_.get(index);
      }
      /**
       * <code>repeated uint32 tagids_filtered = 10;</code>
       */
      public Builder setTagidsFiltered(
          int index, int value) {
        ensureTagidsFilteredIsMutable();
        tagidsFiltered_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 tagids_filtered = 10;</code>
       */
      public Builder addTagidsFiltered(int value) {
        ensureTagidsFilteredIsMutable();
        tagidsFiltered_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 tagids_filtered = 10;</code>
       */
      public Builder addAllTagidsFiltered(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureTagidsFilteredIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tagidsFiltered_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 tagids_filtered = 10;</code>
       */
      public Builder clearTagidsFiltered() {
        tagidsFiltered_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000200);
        onChanged();
        return this;
      }

      private java.lang.Object websiteTitle_ = "";
      /**
       * <code>optional string website_title = 11;</code>
       */
      public boolean hasWebsiteTitle() {
        return ((bitField0_ & 0x00000400) == 0x00000400);
      }
      /**
       * <code>optional string website_title = 11;</code>
       */
      public java.lang.String getWebsiteTitle() {
        java.lang.Object ref = websiteTitle_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            websiteTitle_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string website_title = 11;</code>
       */
      public com.google.protobuf.ByteString
          getWebsiteTitleBytes() {
        java.lang.Object ref = websiteTitle_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          websiteTitle_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string website_title = 11;</code>
       */
      public Builder setWebsiteTitle(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000400;
        websiteTitle_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string website_title = 11;</code>
       */
      public Builder clearWebsiteTitle() {
        bitField0_ = (bitField0_ & ~0x00000400);
        websiteTitle_ = getDefaultInstance().getWebsiteTitle();
        onChanged();
        return this;
      }
      /**
       * <code>optional string website_title = 11;</code>
       */
      public Builder setWebsiteTitleBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000400;
        websiteTitle_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object websiteUrl_ = "";
      /**
       * <code>optional string website_url = 12;</code>
       */
      public boolean hasWebsiteUrl() {
        return ((bitField0_ & 0x00000800) == 0x00000800);
      }
      /**
       * <code>optional string website_url = 12;</code>
       */
      public java.lang.String getWebsiteUrl() {
        java.lang.Object ref = websiteUrl_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            websiteUrl_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string website_url = 12;</code>
       */
      public com.google.protobuf.ByteString
          getWebsiteUrlBytes() {
        java.lang.Object ref = websiteUrl_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          websiteUrl_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string website_url = 12;</code>
       */
      public Builder setWebsiteUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000800;
        websiteUrl_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string website_url = 12;</code>
       */
      public Builder clearWebsiteUrl() {
        bitField0_ = (bitField0_ & ~0x00000800);
        websiteUrl_ = getDefaultInstance().getWebsiteUrl();
        onChanged();
        return this;
      }
      /**
       * <code>optional string website_url = 12;</code>
       */
      public Builder setWebsiteUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000800;
        websiteUrl_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object discussionUrl_ = "";
      /**
       * <code>optional string discussion_url = 13;</code>
       */
      public boolean hasDiscussionUrl() {
        return ((bitField0_ & 0x00001000) == 0x00001000);
      }
      /**
       * <code>optional string discussion_url = 13;</code>
       */
      public java.lang.String getDiscussionUrl() {
        java.lang.Object ref = discussionUrl_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            discussionUrl_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string discussion_url = 13;</code>
       */
      public com.google.protobuf.ByteString
          getDiscussionUrlBytes() {
        java.lang.Object ref = discussionUrl_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          discussionUrl_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string discussion_url = 13;</code>
       */
      public Builder setDiscussionUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00001000;
        discussionUrl_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string discussion_url = 13;</code>
       */
      public Builder clearDiscussionUrl() {
        bitField0_ = (bitField0_ & ~0x00001000);
        discussionUrl_ = getDefaultInstance().getDiscussionUrl();
        onChanged();
        return this;
      }
      /**
       * <code>optional string discussion_url = 13;</code>
       */
      public Builder setDiscussionUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00001000;
        discussionUrl_ = value;
        onChanged();
        return this;
      }

      private boolean showBroadcast_ ;
      /**
       * <code>optional bool show_broadcast = 14;</code>
       */
      public boolean hasShowBroadcast() {
        return ((bitField0_ & 0x00002000) == 0x00002000);
      }
      /**
       * <code>optional bool show_broadcast = 14;</code>
       */
      public boolean getShowBroadcast() {
        return showBroadcast_;
      }
      /**
       * <code>optional bool show_broadcast = 14;</code>
       */
      public Builder setShowBroadcast(boolean value) {
        bitField0_ |= 0x00002000;
        showBroadcast_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool show_broadcast = 14;</code>
       */
      public Builder clearShowBroadcast() {
        bitField0_ = (bitField0_ & ~0x00002000);
        showBroadcast_ = false;
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


      // @@protoc_insertion_point(builder_scope:CCuratorPreferences)
    }

    // @@protoc_insertion_point(class_scope:CCuratorPreferences)
    private static final SteammessagesBase.CCuratorPreferences DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SteammessagesBase.CCuratorPreferences();
    }

    public static SteammessagesBase.CCuratorPreferences getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CCuratorPreferences>
        PARSER = new com.google.protobuf.AbstractParser<CCuratorPreferences>() {
      public CCuratorPreferences parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CCuratorPreferences(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CCuratorPreferences> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CCuratorPreferences> getParserForType() {
      return PARSER;
    }

    public SteammessagesBase.CCuratorPreferences getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public static final int MSGPOOL_SOFT_LIMIT_FIELD_NUMBER = 50000;
  /**
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      java.lang.Integer> msgpoolSoftLimit = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Integer.class,
        null);
  public static final int MSGPOOL_HARD_LIMIT_FIELD_NUMBER = 50001;
  /**
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      java.lang.Integer> msgpoolHardLimit = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Integer.class,
        null);
  public static final int FORCE_PHP_GENERATION_FIELD_NUMBER = 50000;
  /**
   * <code>extend .google.protobuf.FileOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FileOptions,
      java.lang.Boolean> forcePhpGeneration = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int PHP_OUTPUT_ALWAYS_NUMBER_FIELD_NUMBER = 50020;
  /**
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      java.lang.Boolean> phpOutputAlwaysNumber = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CMsgProtoBufHeader_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CMsgProtoBufHeader_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CMsgMulti_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CMsgMulti_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CMsgProtobufWrapped_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CMsgProtobufWrapped_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CMsgAuthTicket_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CMsgAuthTicket_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CCDDBAppDetailCommon_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CCDDBAppDetailCommon_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CMsgAppRights_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CMsgAppRights_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CCuratorPreferences_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CCuratorPreferences_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030steammessages_base.proto\032 google/proto" +
      "buf/descriptor.proto\"\263\004\n\022CMsgProtoBufHea" +
      "der\022\017\n\007steamid\030\001 \001(\006\022\030\n\020client_sessionid" +
      "\030\002 \001(\005\022\025\n\rrouting_appid\030\003 \001(\r\022*\n\014jobid_s" +
      "ource\030\n \001(\006:\02418446744073709551615\022*\n\014job" +
      "id_target\030\013 \001(\006:\02418446744073709551615\022\027\n" +
      "\017target_job_name\030\014 \001(\t\022\017\n\007seq_num\030\030 \001(\005\022" +
      "\022\n\007eresult\030\r \001(\005:\0012\022\025\n\rerror_message\030\016 \001" +
      "(\t\022\n\n\002ip\030\017 \001(\r\022\032\n\022auth_account_flags\030\020 \001" +
      "(\r\022\024\n\014token_source\030\026 \001(\r\022\033\n\023admin_spoofi" +
      "ng_user\030\027 \001(\010\022\032\n\017transport_error\030\021 \001(\005:\001" +
      "1\022\'\n\tmessageid\030\022 \001(\004:\024184467440737095516" +
      "15\022\032\n\022publisher_group_id\030\023 \001(\r\022\r\n\005sysid\030" +
      "\024 \001(\r\022\021\n\ttrace_tag\030\025 \001(\004\022\025\n\rwebapi_key_i" +
      "d\030\031 \001(\r\022\037\n\027is_from_external_source\030\032 \001(\010" +
      "\022\030\n\020forward_to_sysid\030\033 \003(\r\"8\n\tCMsgMulti\022" +
      "\025\n\rsize_unzipped\030\001 \001(\r\022\024\n\014message_body\030\002" +
      " \001(\014\"+\n\023CMsgProtobufWrapped\022\024\n\014message_b" +
      "ody\030\001 \001(\014\"\217\001\n\016CMsgAuthTicket\022\016\n\006estate\030\001" +
      " \001(\r\022\022\n\007eresult\030\002 \001(\r:\0012\022\017\n\007steamid\030\003 \001(" +
      "\006\022\016\n\006gameid\030\004 \001(\006\022\024\n\014h_steam_pipe\030\005 \001(\r\022" +
      "\022\n\nticket_crc\030\006 \001(\r\022\016\n\006ticket\030\007 \001(\014\"\366\001\n\024" +
      "CCDDBAppDetailCommon\022\r\n\005appid\030\001 \001(\r\022\014\n\004n" +
      "ame\030\002 \001(\t\022\014\n\004icon\030\003 \001(\t\022\014\n\004logo\030\004 \001(\t\022\022\n" +
      "\nlogo_small\030\005 \001(\t\022\014\n\004tool\030\006 \001(\010\022\014\n\004demo\030" +
      "\007 \001(\010\022\r\n\005media\030\010 \001(\010\022\037\n\027community_visibl" +
      "e_stats\030\t \001(\010\022\025\n\rfriendly_name\030\n \001(\t\022\023\n\013" +
      "propagation\030\013 \001(\t\022\031\n\021has_adult_content\030\014" +
      " \001(\010\"\357\002\n\rCMsgAppRights\022\021\n\tedit_info\030\001 \001(" +
      "\010\022\017\n\007publish\030\002 \001(\010\022\027\n\017view_error_data\030\003 " +
      "\001(\010\022\020\n\010download\030\004 \001(\010\022\025\n\rupload_cdkeys\030\005" +
      " \001(\010\022\027\n\017generate_cdkeys\030\006 \001(\010\022\027\n\017view_fi" +
      "nancials\030\007 \001(\010\022\022\n\nmanage_ceg\030\010 \001(\010\022\026\n\016ma" +
      "nage_signing\030\t \001(\010\022\025\n\rmanage_cdkeys\030\n \001(" +
      "\010\022\026\n\016edit_marketing\030\013 \001(\010\022\027\n\017economy_sup" +
      "port\030\014 \001(\010\022\"\n\032economy_support_supervisor" +
      "\030\r \001(\010\022\026\n\016manage_pricing\030\016 \001(\010\022\026\n\016broadc" +
      "ast_live\030\017 \001(\010\"\361\002\n\023CCuratorPreferences\022\033" +
      "\n\023supported_languages\030\001 \001(\r\022\030\n\020platform_" +
      "windows\030\002 \001(\010\022\024\n\014platform_mac\030\003 \001(\010\022\026\n\016p" +
      "latform_linux\030\004 \001(\010\022\022\n\nvr_content\030\005 \001(\010\022" +
      "\036\n\026adult_content_violence\030\006 \001(\010\022\031\n\021adult" +
      "_content_sex\030\007 \001(\010\022\031\n\021timestamp_updated\030" +
      "\010 \001(\r\022\026\n\016tagids_curated\030\t \003(\r\022\027\n\017tagids_" +
      "filtered\030\n \003(\r\022\025\n\rwebsite_title\030\013 \001(\t\022\023\n" +
      "\013website_url\030\014 \001(\t\022\026\n\016discussion_url\030\r \001" +
      "(\t\022\026\n\016show_broadcast\030\016 \001(\010:A\n\022msgpool_so" +
      "ft_limit\022\037.google.protobuf.MessageOption" +
      "s\030\320\206\003 \001(\005:\00232:B\n\022msgpool_hard_limit\022\037.go" +
      "ogle.protobuf.MessageOptions\030\321\206\003 \001(\005:\00338" +
      "4:C\n\024force_php_generation\022\034.google.proto" +
      "buf.FileOptions\030\320\206\003 \001(\010:\005false:H\n\030php_ou" +
      "tput_always_number\022\035.google.protobuf.Fie" +
      "ldOptions\030\344\206\003 \001(\010:\005falseB\005H\001\200\001\000"
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
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        }, assigner);
    internal_static_CMsgProtoBufHeader_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CMsgProtoBufHeader_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CMsgProtoBufHeader_descriptor,
        new java.lang.String[] { "Steamid", "ClientSessionid", "RoutingAppid", "JobidSource", "JobidTarget", "TargetJobName", "SeqNum", "Eresult", "ErrorMessage", "Ip", "AuthAccountFlags", "TokenSource", "AdminSpoofingUser", "TransportError", "Messageid", "PublisherGroupId", "Sysid", "TraceTag", "WebapiKeyId", "IsFromExternalSource", "ForwardToSysid", });
    internal_static_CMsgMulti_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_CMsgMulti_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CMsgMulti_descriptor,
        new java.lang.String[] { "SizeUnzipped", "MessageBody", });
    internal_static_CMsgProtobufWrapped_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_CMsgProtobufWrapped_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CMsgProtobufWrapped_descriptor,
        new java.lang.String[] { "MessageBody", });
    internal_static_CMsgAuthTicket_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_CMsgAuthTicket_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CMsgAuthTicket_descriptor,
        new java.lang.String[] { "Estate", "Eresult", "Steamid", "Gameid", "HSteamPipe", "TicketCrc", "Ticket", });
    internal_static_CCDDBAppDetailCommon_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_CCDDBAppDetailCommon_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CCDDBAppDetailCommon_descriptor,
        new java.lang.String[] { "Appid", "Name", "Icon", "Logo", "LogoSmall", "Tool", "Demo", "Media", "CommunityVisibleStats", "FriendlyName", "Propagation", "HasAdultContent", });
    internal_static_CMsgAppRights_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_CMsgAppRights_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CMsgAppRights_descriptor,
        new java.lang.String[] { "EditInfo", "Publish", "ViewErrorData", "Download", "UploadCdkeys", "GenerateCdkeys", "ViewFinancials", "ManageCeg", "ManageSigning", "ManageCdkeys", "EditMarketing", "EconomySupport", "EconomySupportSupervisor", "ManagePricing", "BroadcastLive", });
    internal_static_CCuratorPreferences_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_CCuratorPreferences_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CCuratorPreferences_descriptor,
        new java.lang.String[] { "SupportedLanguages", "PlatformWindows", "PlatformMac", "PlatformLinux", "VrContent", "AdultContentViolence", "AdultContentSex", "TimestampUpdated", "TagidsCurated", "TagidsFiltered", "WebsiteTitle", "WebsiteUrl", "DiscussionUrl", "ShowBroadcast", });
    msgpoolSoftLimit.internalInit(descriptor.getExtensions().get(0));
    msgpoolHardLimit.internalInit(descriptor.getExtensions().get(1));
    forcePhpGeneration.internalInit(descriptor.getExtensions().get(2));
    phpOutputAlwaysNumber.internalInit(descriptor.getExtensions().get(3));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
