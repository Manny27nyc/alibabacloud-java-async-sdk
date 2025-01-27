// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAclEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAclEntriesResponseBody</p>
 */
public class ListAclEntriesResponseBody extends TeaModel {
    @NameInMap("AclEntries")
    private java.util.List < AclEntries> aclEntries;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListAclEntriesResponseBody(Builder builder) {
        this.aclEntries = builder.aclEntries;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAclEntriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return aclEntries
     */
    public java.util.List < AclEntries> getAclEntries() {
        return this.aclEntries;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List < AclEntries> aclEntries; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * 访问控制列表
         */
        public Builder aclEntries(java.util.List < AclEntries> aclEntries) {
            this.aclEntries = aclEntries;
            return this;
        }

        /**
         * 本次查询返回记录数量
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 分页查询标识
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 总记录数
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAclEntriesResponseBody build() {
            return new ListAclEntriesResponseBody(this);
        } 

    } 

    public static class AclEntries extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Entry")
        private String entry;

        @NameInMap("Status")
        private String status;

        private AclEntries(Builder builder) {
            this.description = builder.description;
            this.entry = builder.entry;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclEntries create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return entry
         */
        public String getEntry() {
            return this.entry;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String description; 
            private String entry; 
            private String status; 

            /**
             * 描述信息
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IP条目
             */
            public Builder entry(String entry) {
                this.entry = entry;
                return this;
            }

            /**
             * 状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AclEntries build() {
                return new AclEntries(this);
            } 

        } 

    }
}
