package uk.co.thomasc.steamkit.base.generated.discovery;

public final class BasicServerListProtos {
    private BasicServerListProtos() {}
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }
    public interface BasicServerListOrBuilder extends
            // @@protoc_insertion_point(interface_extends:BasicServerList)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>repeated .BasicServer servers = 1;</code>
         */
        java.util.List< BasicServerListProtos.BasicServer>
        getServersList();
        /**
         * <code>repeated .BasicServer servers = 1;</code>
         */
         BasicServerListProtos.BasicServer getServers(int index);
        /**
         * <code>repeated .BasicServer servers = 1;</code>
         */
        int getServersCount();
        /**
         * <code>repeated .BasicServer servers = 1;</code>
         */
        java.util.List<? extends  BasicServerListProtos.BasicServerOrBuilder>
        getServersOrBuilderList();
        /**
         * <code>repeated .BasicServer servers = 1;</code>
         */
         BasicServerListProtos.BasicServerOrBuilder getServersOrBuilder(
                int index);
    }
    /**
     * Protobuf type {@code BasicServerList}
     */
    public  static final class BasicServerList extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:BasicServerList)
            BasicServerListOrBuilder {
        // Use BasicServerList.newBuilder() to construct.
        private BasicServerList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private BasicServerList() {
            servers_ = java.util.Collections.emptyList();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private BasicServerList(
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
                            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                                servers_ = new java.util.ArrayList< BasicServerListProtos.BasicServer>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            servers_.add(
                                    input.readMessage( BasicServerListProtos.BasicServer.PARSER, extensionRegistry));
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
                if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                    servers_ = java.util.Collections.unmodifiableList(servers_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return  BasicServerListProtos.internal_static_BasicServerList_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return  BasicServerListProtos.internal_static_BasicServerList_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                             BasicServerListProtos.BasicServerList.class,  BasicServerListProtos.BasicServerList.Builder.class);
        }

        public static final int SERVERS_FIELD_NUMBER = 1;
        private java.util.List< BasicServerListProtos.BasicServer> servers_;
        /**
         * <code>repeated .BasicServer servers = 1;</code>
         */
        public java.util.List< BasicServerListProtos.BasicServer> getServersList() {
            return servers_;
        }
        /**
         * <code>repeated .BasicServer servers = 1;</code>
         */
        public java.util.List<? extends  BasicServerListProtos.BasicServerOrBuilder>
        getServersOrBuilderList() {
            return servers_;
        }
        /**
         * <code>repeated .BasicServer servers = 1;</code>
         */
        public int getServersCount() {
            return servers_.size();
        }
        /**
         * <code>repeated .BasicServer servers = 1;</code>
         */
        public  BasicServerListProtos.BasicServer getServers(int index) {
            return servers_.get(index);
        }
        /**
         * <code>repeated .BasicServer servers = 1;</code>
         */
        public  BasicServerListProtos.BasicServerOrBuilder getServersOrBuilder(
                int index) {
            return servers_.get(index);
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            for (int i = 0; i < getServersCount(); i++) {
                if (!getServers(i).isInitialized()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            for (int i = 0; i < servers_.size(); i++) {
                output.writeMessage(1, servers_.get(i));
            }
            unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            for (int i = 0; i < servers_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, servers_.get(i));
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
            if (!(obj instanceof  BasicServerListProtos.BasicServerList)) {
                return super.equals(obj);
            }
             BasicServerListProtos.BasicServerList other = ( BasicServerListProtos.BasicServerList) obj;

            boolean result = true;
            result = result && getServersList()
                    .equals(other.getServersList());
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
            if (getServersCount() > 0) {
                hash = (37 * hash) + SERVERS_FIELD_NUMBER;
                hash = (53 * hash) + getServersList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static  BasicServerListProtos.BasicServerList parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static  BasicServerListProtos.BasicServerList parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static  BasicServerListProtos.BasicServerList parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static  BasicServerListProtos.BasicServerList parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static  BasicServerListProtos.BasicServerList parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static  BasicServerListProtos.BasicServerList parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static  BasicServerListProtos.BasicServerList parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static  BasicServerListProtos.BasicServerList parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static  BasicServerListProtos.BasicServerList parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static  BasicServerListProtos.BasicServerList parseFrom(
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
        public static Builder newBuilder( BasicServerListProtos.BasicServerList prototype) {
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
         * Protobuf type {@code BasicServerList}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:BasicServerList)
                 BasicServerListProtos.BasicServerListOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return  BasicServerListProtos.internal_static_BasicServerList_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return  BasicServerListProtos.internal_static_BasicServerList_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                 BasicServerListProtos.BasicServerList.class,  BasicServerListProtos.BasicServerList.Builder.class);
            }

            // Construct using  BasicServerListProtos.BasicServerList.newBuilder()
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
                    getServersFieldBuilder();
                }
            }
            public Builder clear() {
                super.clear();
                if (serversBuilder_ == null) {
                    servers_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    serversBuilder_.clear();
                }
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return  BasicServerListProtos.internal_static_BasicServerList_descriptor;
            }

            public  BasicServerListProtos.BasicServerList getDefaultInstanceForType() {
                return  BasicServerListProtos.BasicServerList.getDefaultInstance();
            }

            public  BasicServerListProtos.BasicServerList build() {
                 BasicServerListProtos.BasicServerList result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public  BasicServerListProtos.BasicServerList buildPartial() {
                 BasicServerListProtos.BasicServerList result = new  BasicServerListProtos.BasicServerList(this);
                int from_bitField0_ = bitField0_;
                if (serversBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) == 0x00000001)) {
                        servers_ = java.util.Collections.unmodifiableList(servers_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.servers_ = servers_;
                } else {
                    result.servers_ = serversBuilder_.build();
                }
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
                if (other instanceof  BasicServerListProtos.BasicServerList) {
                    return mergeFrom(( BasicServerListProtos.BasicServerList)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom( BasicServerListProtos.BasicServerList other) {
                if (other ==  BasicServerListProtos.BasicServerList.getDefaultInstance()) return this;
                if (serversBuilder_ == null) {
                    if (!other.servers_.isEmpty()) {
                        if (servers_.isEmpty()) {
                            servers_ = other.servers_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensureServersIsMutable();
                            servers_.addAll(other.servers_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.servers_.isEmpty()) {
                        if (serversBuilder_.isEmpty()) {
                            serversBuilder_.dispose();
                            serversBuilder_ = null;
                            servers_ = other.servers_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            serversBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getServersFieldBuilder() : null;
                        } else {
                            serversBuilder_.addAllMessages(other.servers_);
                        }
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getServersCount(); i++) {
                    if (!getServers(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                 BasicServerListProtos.BasicServerList parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = ( BasicServerListProtos.BasicServerList) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private java.util.List< BasicServerListProtos.BasicServer> servers_ =
                    java.util.Collections.emptyList();
            private void ensureServersIsMutable() {
                if (!((bitField0_ & 0x00000001) == 0x00000001)) {
                    servers_ = new java.util.ArrayList< BasicServerListProtos.BasicServer>(servers_);
                    bitField0_ |= 0x00000001;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                     BasicServerListProtos.BasicServer,  BasicServerListProtos.BasicServer.Builder,  BasicServerListProtos.BasicServerOrBuilder> serversBuilder_;

            /**
             * <code>repeated .BasicServer servers = 1;</code>
             */
            public java.util.List< BasicServerListProtos.BasicServer> getServersList() {
                if (serversBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(servers_);
                } else {
                    return serversBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .BasicServer servers = 1;</code>
             */
            public int getServersCount() {
                if (serversBuilder_ == null) {
                    return servers_.size();
                } else {
                    return serversBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .BasicServer servers = 1;</code>
             */
            public  BasicServerListProtos.BasicServer getServers(int index) {
                if (serversBuilder_ == null) {
                    return servers_.get(index);
                } else {
                    return serversBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .BasicServer servers = 1;</code>
             */
            public Builder setServers(
                    int index,  BasicServerListProtos.BasicServer value) {
                if (serversBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureServersIsMutable();
                    servers_.set(index, value);
                    onChanged();
                } else {
                    serversBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .BasicServer servers = 1;</code>
             */
            public Builder setServers(
                    int index,  BasicServerListProtos.BasicServer.Builder builderForValue) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    servers_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    serversBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .BasicServer servers = 1;</code>
             */
            public Builder addServers( BasicServerListProtos.BasicServer value) {
                if (serversBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureServersIsMutable();
                    servers_.add(value);
                    onChanged();
                } else {
                    serversBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .BasicServer servers = 1;</code>
             */
            public Builder addServers(
                    int index,  BasicServerListProtos.BasicServer value) {
                if (serversBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureServersIsMutable();
                    servers_.add(index, value);
                    onChanged();
                } else {
                    serversBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .BasicServer servers = 1;</code>
             */
            public Builder addServers(
                     BasicServerListProtos.BasicServer.Builder builderForValue) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    servers_.add(builderForValue.build());
                    onChanged();
                } else {
                    serversBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .BasicServer servers = 1;</code>
             */
            public Builder addServers(
                    int index,  BasicServerListProtos.BasicServer.Builder builderForValue) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    servers_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    serversBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .BasicServer servers = 1;</code>
             */
            public Builder addAllServers(
                    java.lang.Iterable<? extends  BasicServerListProtos.BasicServer> values) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, servers_);
                    onChanged();
                } else {
                    serversBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .BasicServer servers = 1;</code>
             */
            public Builder clearServers() {
                if (serversBuilder_ == null) {
                    servers_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    serversBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .BasicServer servers = 1;</code>
             */
            public Builder removeServers(int index) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    servers_.remove(index);
                    onChanged();
                } else {
                    serversBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .BasicServer servers = 1;</code>
             */
            public  BasicServerListProtos.BasicServer.Builder getServersBuilder(
                    int index) {
                return getServersFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .BasicServer servers = 1;</code>
             */
            public  BasicServerListProtos.BasicServerOrBuilder getServersOrBuilder(
                    int index) {
                if (serversBuilder_ == null) {
                    return servers_.get(index);  } else {
                    return serversBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .BasicServer servers = 1;</code>
             */
            public java.util.List<? extends  BasicServerListProtos.BasicServerOrBuilder>
            getServersOrBuilderList() {
                if (serversBuilder_ != null) {
                    return serversBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(servers_);
                }
            }
            /**
             * <code>repeated .BasicServer servers = 1;</code>
             */
            public  BasicServerListProtos.BasicServer.Builder addServersBuilder() {
                return getServersFieldBuilder().addBuilder(
                         BasicServerListProtos.BasicServer.getDefaultInstance());
            }
            /**
             * <code>repeated .BasicServer servers = 1;</code>
             */
            public  BasicServerListProtos.BasicServer.Builder addServersBuilder(
                    int index) {
                return getServersFieldBuilder().addBuilder(
                        index,  BasicServerListProtos.BasicServer.getDefaultInstance());
            }
            /**
             * <code>repeated .BasicServer servers = 1;</code>
             */
            public java.util.List< BasicServerListProtos.BasicServer.Builder>
            getServersBuilderList() {
                return getServersFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilderV3<
                     BasicServerListProtos.BasicServer,  BasicServerListProtos.BasicServer.Builder,  BasicServerListProtos.BasicServerOrBuilder>
            getServersFieldBuilder() {
                if (serversBuilder_ == null) {
                    serversBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                             BasicServerListProtos.BasicServer,  BasicServerListProtos.BasicServer.Builder,  BasicServerListProtos.BasicServerOrBuilder>(
                            servers_,
                            ((bitField0_ & 0x00000001) == 0x00000001),
                            getParentForChildren(),
                            isClean());
                    servers_ = null;
                }
                return serversBuilder_;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:BasicServerList)
        }

        // @@protoc_insertion_point(class_scope:BasicServerList)
        private static final  BasicServerListProtos.BasicServerList DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new  BasicServerListProtos.BasicServerList();
        }

        public static  BasicServerListProtos.BasicServerList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @java.lang.Deprecated public static final com.google.protobuf.Parser<BasicServerList>
                PARSER = new com.google.protobuf.AbstractParser<BasicServerList>() {
            public BasicServerList parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new BasicServerList(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<BasicServerList> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<BasicServerList> getParserForType() {
            return PARSER;
        }

        public  BasicServerListProtos.BasicServerList getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface BasicServerOrBuilder extends
            // @@protoc_insertion_point(interface_extends:BasicServer)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>required string address = 1;</code>
         */
        boolean hasAddress();
        /**
         * <code>required string address = 1;</code>
         */
        java.lang.String getAddress();
        /**
         * <code>required string address = 1;</code>
         */
        com.google.protobuf.ByteString
        getAddressBytes();

        /**
         * <code>required int32 port = 2;</code>
         */
        boolean hasPort();
        /**
         * <code>required int32 port = 2;</code>
         */
        int getPort();

        /**
         * <code>required int32 protocol = 3;</code>
         */
        boolean hasProtocol();
        /**
         * <code>required int32 protocol = 3;</code>
         */
        int getProtocol();
    }
    /**
     * Protobuf type {@code BasicServer}
     */
    public  static final class BasicServer extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:BasicServer)
            BasicServerOrBuilder {
        // Use BasicServer.newBuilder() to construct.
        private BasicServer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private BasicServer() {
            address_ = "";
            port_ = 0;
            protocol_ = 0;
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private BasicServer(
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
                            address_ = bs;
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            port_ = input.readInt32();
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000004;
                            protocol_ = input.readInt32();
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
            return  BasicServerListProtos.internal_static_BasicServer_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return  BasicServerListProtos.internal_static_BasicServer_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                             BasicServerListProtos.BasicServer.class,  BasicServerListProtos.BasicServer.Builder.class);
        }

        private int bitField0_;
        public static final int ADDRESS_FIELD_NUMBER = 1;
        private volatile java.lang.Object address_;
        /**
         * <code>required string address = 1;</code>
         */
        public boolean hasAddress() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required string address = 1;</code>
         */
        public java.lang.String getAddress() {
            java.lang.Object ref = address_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    address_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string address = 1;</code>
         */
        public com.google.protobuf.ByteString
        getAddressBytes() {
            java.lang.Object ref = address_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                address_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int PORT_FIELD_NUMBER = 2;
        private int port_;
        /**
         * <code>required int32 port = 2;</code>
         */
        public boolean hasPort() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>required int32 port = 2;</code>
         */
        public int getPort() {
            return port_;
        }

        public static final int PROTOCOL_FIELD_NUMBER = 3;
        private int protocol_;
        /**
         * <code>required int32 protocol = 3;</code>
         */
        public boolean hasProtocol() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>required int32 protocol = 3;</code>
         */
        public int getProtocol() {
            return protocol_;
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            if (!hasAddress()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasPort()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasProtocol()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, address_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeInt32(2, port_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeInt32(3, protocol_);
            }
            unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, address_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(2, port_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(3, protocol_);
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
            if (!(obj instanceof  BasicServerListProtos.BasicServer)) {
                return super.equals(obj);
            }
             BasicServerListProtos.BasicServer other = ( BasicServerListProtos.BasicServer) obj;

            boolean result = true;
            result = result && (hasAddress() == other.hasAddress());
            if (hasAddress()) {
                result = result && getAddress()
                        .equals(other.getAddress());
            }
            result = result && (hasPort() == other.hasPort());
            if (hasPort()) {
                result = result && (getPort()
                        == other.getPort());
            }
            result = result && (hasProtocol() == other.hasProtocol());
            if (hasProtocol()) {
                result = result && (getProtocol()
                        == other.getProtocol());
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
            if (hasAddress()) {
                hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
                hash = (53 * hash) + getAddress().hashCode();
            }
            if (hasPort()) {
                hash = (37 * hash) + PORT_FIELD_NUMBER;
                hash = (53 * hash) + getPort();
            }
            if (hasProtocol()) {
                hash = (37 * hash) + PROTOCOL_FIELD_NUMBER;
                hash = (53 * hash) + getProtocol();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static  BasicServerListProtos.BasicServer parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static  BasicServerListProtos.BasicServer parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static  BasicServerListProtos.BasicServer parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static  BasicServerListProtos.BasicServer parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static  BasicServerListProtos.BasicServer parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static  BasicServerListProtos.BasicServer parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static  BasicServerListProtos.BasicServer parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static  BasicServerListProtos.BasicServer parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static  BasicServerListProtos.BasicServer parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static  BasicServerListProtos.BasicServer parseFrom(
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
        public static Builder newBuilder( BasicServerListProtos.BasicServer prototype) {
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
         * Protobuf type {@code BasicServer}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:BasicServer)
                 BasicServerListProtos.BasicServerOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return  BasicServerListProtos.internal_static_BasicServer_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return  BasicServerListProtos.internal_static_BasicServer_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                 BasicServerListProtos.BasicServer.class,  BasicServerListProtos.BasicServer.Builder.class);
            }

            // Construct using  BasicServerListProtos.BasicServer.newBuilder()
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
                address_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                port_ = 0;
                bitField0_ = (bitField0_ & ~0x00000002);
                protocol_ = 0;
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return  BasicServerListProtos.internal_static_BasicServer_descriptor;
            }

            public  BasicServerListProtos.BasicServer getDefaultInstanceForType() {
                return  BasicServerListProtos.BasicServer.getDefaultInstance();
            }

            public  BasicServerListProtos.BasicServer build() {
                 BasicServerListProtos.BasicServer result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public  BasicServerListProtos.BasicServer buildPartial() {
                 BasicServerListProtos.BasicServer result = new  BasicServerListProtos.BasicServer(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.address_ = address_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.port_ = port_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.protocol_ = protocol_;
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
                if (other instanceof  BasicServerListProtos.BasicServer) {
                    return mergeFrom(( BasicServerListProtos.BasicServer)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom( BasicServerListProtos.BasicServer other) {
                if (other ==  BasicServerListProtos.BasicServer.getDefaultInstance()) return this;
                if (other.hasAddress()) {
                    bitField0_ |= 0x00000001;
                    address_ = other.address_;
                    onChanged();
                }
                if (other.hasPort()) {
                    setPort(other.getPort());
                }
                if (other.hasProtocol()) {
                    setProtocol(other.getProtocol());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                if (!hasAddress()) {
                    return false;
                }
                if (!hasPort()) {
                    return false;
                }
                if (!hasProtocol()) {
                    return false;
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                 BasicServerListProtos.BasicServer parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = ( BasicServerListProtos.BasicServer) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private java.lang.Object address_ = "";
            /**
             * <code>required string address = 1;</code>
             */
            public boolean hasAddress() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string address = 1;</code>
             */
            public java.lang.String getAddress() {
                java.lang.Object ref = address_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        address_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>required string address = 1;</code>
             */
            public com.google.protobuf.ByteString
            getAddressBytes() {
                java.lang.Object ref = address_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    address_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string address = 1;</code>
             */
            public Builder setAddress(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                address_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required string address = 1;</code>
             */
            public Builder clearAddress() {
                bitField0_ = (bitField0_ & ~0x00000001);
                address_ = getDefaultInstance().getAddress();
                onChanged();
                return this;
            }
            /**
             * <code>required string address = 1;</code>
             */
            public Builder setAddressBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                address_ = value;
                onChanged();
                return this;
            }

            private int port_ ;
            /**
             * <code>required int32 port = 2;</code>
             */
            public boolean hasPort() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required int32 port = 2;</code>
             */
            public int getPort() {
                return port_;
            }
            /**
             * <code>required int32 port = 2;</code>
             */
            public Builder setPort(int value) {
                bitField0_ |= 0x00000002;
                port_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required int32 port = 2;</code>
             */
            public Builder clearPort() {
                bitField0_ = (bitField0_ & ~0x00000002);
                port_ = 0;
                onChanged();
                return this;
            }

            private int protocol_ ;
            /**
             * <code>required int32 protocol = 3;</code>
             */
            public boolean hasProtocol() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>required int32 protocol = 3;</code>
             */
            public int getProtocol() {
                return protocol_;
            }
            /**
             * <code>required int32 protocol = 3;</code>
             */
            public Builder setProtocol(int value) {
                bitField0_ |= 0x00000004;
                protocol_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required int32 protocol = 3;</code>
             */
            public Builder clearProtocol() {
                bitField0_ = (bitField0_ & ~0x00000004);
                protocol_ = 0;
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


            // @@protoc_insertion_point(builder_scope:BasicServer)
        }

        // @@protoc_insertion_point(class_scope:BasicServer)
        private static final  BasicServerListProtos.BasicServer DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new  BasicServerListProtos.BasicServer();
        }

        public static  BasicServerListProtos.BasicServer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @java.lang.Deprecated public static final com.google.protobuf.Parser<BasicServer>
                PARSER = new com.google.protobuf.AbstractParser<BasicServer>() {
            public BasicServer parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new BasicServer(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<BasicServer> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<BasicServer> getParserForType() {
            return PARSER;
        }

        public  BasicServerListProtos.BasicServer getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_BasicServerList_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_BasicServerList_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_BasicServer_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_BasicServer_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static  com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        java.lang.String[] descriptorData = {
                "\nHin/dragonbra/javasteam/protobufs/steam" +
                        "/discovery/basic_server_list.proto\"0\n\017Ba" +
                        "sicServerList\022\035\n\007servers\030\001 \003(\0132\014.BasicSe" +
                        "rver\">\n\013BasicServer\022\017\n\007address\030\001 \002(\t\022\014\n\004" +
                        "port\030\002 \002(\005\022\020\n\010protocol\030\003 \002(\005BK\n0in.drago" +
                        "nbra.javasteam.protobufs.steam.discovery" +
                        "B\025BasicServerListProtosH\001"
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
                        }, assigner);
        internal_static_BasicServerList_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_BasicServerList_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_BasicServerList_descriptor,
                new java.lang.String[] { "Servers", });
        internal_static_BasicServer_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_BasicServer_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_BasicServer_descriptor,
                new java.lang.String[] { "Address", "Port", "Protocol", });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
