// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLgfResponseBody} extends {@link TeaModel}
 *
 * <p>ListLgfResponseBody</p>
 */
public class ListLgfResponseBody extends TeaModel {
    @NameInMap("Lgfs")
    private java.util.List < Lgfs> lgfs;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListLgfResponseBody(Builder builder) {
        this.lgfs = builder.lgfs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLgfResponseBody create() {
        return builder().build();
    }

    /**
     * @return lgfs
     */
    public java.util.List < Lgfs> getLgfs() {
        return this.lgfs;
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
        private java.util.List < Lgfs> lgfs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Lgfs.
         */
        public Builder lgfs(java.util.List < Lgfs> lgfs) {
            this.lgfs = lgfs;
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

        public ListLgfResponseBody build() {
            return new ListLgfResponseBody(this);
        } 

    } 

    public static class Lgfs extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("IntentId")
        private Long intentId;

        @NameInMap("LgfId")
        private Long lgfId;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("RuleText")
        private String ruleText;

        private Lgfs(Builder builder) {
            this.createTime = builder.createTime;
            this.intentId = builder.intentId;
            this.lgfId = builder.lgfId;
            this.modifyTime = builder.modifyTime;
            this.ruleText = builder.ruleText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Lgfs create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return intentId
         */
        public Long getIntentId() {
            return this.intentId;
        }

        /**
         * @return lgfId
         */
        public Long getLgfId() {
            return this.lgfId;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return ruleText
         */
        public String getRuleText() {
            return this.ruleText;
        }

        public static final class Builder {
            private String createTime; 
            private Long intentId; 
            private Long lgfId; 
            private String modifyTime; 
            private String ruleText; 

            /**
             * 创建时间
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 意图ID
             */
            public Builder intentId(Long intentId) {
                this.intentId = intentId;
                return this;
            }

            /**
             * LGF ID
             */
            public Builder lgfId(Long lgfId) {
                this.lgfId = lgfId;
                return this;
            }

            /**
             * 修改时间
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * LGF规则
             */
            public Builder ruleText(String ruleText) {
                this.ruleText = ruleText;
                return this;
            }

            public Lgfs build() {
                return new Lgfs(this);
            } 

        } 

    }
}
