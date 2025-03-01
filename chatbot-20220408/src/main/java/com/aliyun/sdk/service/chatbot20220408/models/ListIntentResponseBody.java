// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIntentResponseBody} extends {@link TeaModel}
 *
 * <p>ListIntentResponseBody</p>
 */
public class ListIntentResponseBody extends TeaModel {
    @NameInMap("Intents")
    private java.util.List < Intents> intents;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListIntentResponseBody(Builder builder) {
        this.intents = builder.intents;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntentResponseBody create() {
        return builder().build();
    }

    /**
     * @return intents
     */
    public java.util.List < Intents> getIntents() {
        return this.intents;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Intents> intents; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Intents.
         */
        public Builder intents(java.util.List < Intents> intents) {
            this.intents = intents;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListIntentResponseBody build() {
            return new ListIntentResponseBody(this);
        } 

    } 

    public static class SlotInfos extends TeaModel {
        @NameInMap("Array")
        private Boolean array;

        @NameInMap("Encrypt")
        private Boolean encrypt;

        @NameInMap("Interactive")
        private Boolean interactive;

        @NameInMap("Name")
        private String name;

        @NameInMap("SlotId")
        private String slotId;

        @NameInMap("Value")
        private String value;

        private SlotInfos(Builder builder) {
            this.array = builder.array;
            this.encrypt = builder.encrypt;
            this.interactive = builder.interactive;
            this.name = builder.name;
            this.slotId = builder.slotId;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlotInfos create() {
            return builder().build();
        }

        /**
         * @return array
         */
        public Boolean getArray() {
            return this.array;
        }

        /**
         * @return encrypt
         */
        public Boolean getEncrypt() {
            return this.encrypt;
        }

        /**
         * @return interactive
         */
        public Boolean getInteractive() {
            return this.interactive;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return slotId
         */
        public String getSlotId() {
            return this.slotId;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Boolean array; 
            private Boolean encrypt; 
            private Boolean interactive; 
            private String name; 
            private String slotId; 
            private String value; 

            /**
             * 是否数组
             */
            public Builder array(Boolean array) {
                this.array = array;
                return this;
            }

            /**
             * 是否敏感
             */
            public Builder encrypt(Boolean encrypt) {
                this.encrypt = encrypt;
                return this;
            }

            /**
             * 是否交互式收集
             */
            public Builder interactive(Boolean interactive) {
                this.interactive = interactive;
                return this;
            }

            /**
             * 槽位名
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 槽位ID
             */
            public Builder slotId(String slotId) {
                this.slotId = slotId;
                return this;
            }

            /**
             * 槽位值（实体名）
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SlotInfos build() {
                return new SlotInfos(this);
            } 

        } 

    }
    public static class Intents extends TeaModel {
        @NameInMap("AliasName")
        private String aliasName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateUserId")
        private String createUserId;

        @NameInMap("CreateUserName")
        private String createUserName;

        @NameInMap("IntentId")
        private Long intentId;

        @NameInMap("IntentName")
        private String intentName;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("ModifyUserId")
        private String modifyUserId;

        @NameInMap("ModifyUserName")
        private String modifyUserName;

        @NameInMap("SlotInfos")
        private java.util.List < SlotInfos> slotInfos;

        private Intents(Builder builder) {
            this.aliasName = builder.aliasName;
            this.createTime = builder.createTime;
            this.createUserId = builder.createUserId;
            this.createUserName = builder.createUserName;
            this.intentId = builder.intentId;
            this.intentName = builder.intentName;
            this.modifyTime = builder.modifyTime;
            this.modifyUserId = builder.modifyUserId;
            this.modifyUserName = builder.modifyUserName;
            this.slotInfos = builder.slotInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Intents create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUserId
         */
        public String getCreateUserId() {
            return this.createUserId;
        }

        /**
         * @return createUserName
         */
        public String getCreateUserName() {
            return this.createUserName;
        }

        /**
         * @return intentId
         */
        public Long getIntentId() {
            return this.intentId;
        }

        /**
         * @return intentName
         */
        public String getIntentName() {
            return this.intentName;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return modifyUserId
         */
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        /**
         * @return modifyUserName
         */
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        /**
         * @return slotInfos
         */
        public java.util.List < SlotInfos> getSlotInfos() {
            return this.slotInfos;
        }

        public static final class Builder {
            private String aliasName; 
            private String createTime; 
            private String createUserId; 
            private String createUserName; 
            private Long intentId; 
            private String intentName; 
            private String modifyTime; 
            private String modifyUserId; 
            private String modifyUserName; 
            private java.util.List < SlotInfos> slotInfos; 

            /**
             * AliasName.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUserId.
             */
            public Builder createUserId(String createUserId) {
                this.createUserId = createUserId;
                return this;
            }

            /**
             * CreateUserName.
             */
            public Builder createUserName(String createUserName) {
                this.createUserName = createUserName;
                return this;
            }

            /**
             * IntentId.
             */
            public Builder intentId(Long intentId) {
                this.intentId = intentId;
                return this;
            }

            /**
             * IntentName.
             */
            public Builder intentName(String intentName) {
                this.intentName = intentName;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * ModifyUserId.
             */
            public Builder modifyUserId(String modifyUserId) {
                this.modifyUserId = modifyUserId;
                return this;
            }

            /**
             * ModifyUserName.
             */
            public Builder modifyUserName(String modifyUserName) {
                this.modifyUserName = modifyUserName;
                return this;
            }

            /**
             * SlotInfos.
             */
            public Builder slotInfos(java.util.List < SlotInfos> slotInfos) {
                this.slotInfos = slotInfos;
                return this;
            }

            public Intents build() {
                return new Intents(this);
            } 

        } 

    }
}
