// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTagKeysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTagKeysResponseBody</p>
 */
public class DescribeTagKeysResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TagKeys")
    private java.util.List < TagKeys> tagKeys;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeTagKeysResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.tagKeys = builder.tagKeys;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTagKeysResponseBody create() {
        return builder().build();
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
     * @return tagKeys
     */
    public java.util.List < TagKeys> getTagKeys() {
        return this.tagKeys;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < TagKeys> tagKeys; 
        private Integer totalCount; 

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
         * TagKeys.
         */
        public Builder tagKeys(java.util.List < TagKeys> tagKeys) {
            this.tagKeys = tagKeys;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTagKeysResponseBody build() {
            return new DescribeTagKeysResponseBody(this);
        } 

    } 

    public static class TagKeys extends TeaModel {
        @NameInMap("TagCount")
        private Integer tagCount;

        @NameInMap("TagKey")
        private String tagKey;

        private TagKeys(Builder builder) {
            this.tagCount = builder.tagCount;
            this.tagKey = builder.tagKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagKeys create() {
            return builder().build();
        }

        /**
         * @return tagCount
         */
        public Integer getTagCount() {
            return this.tagCount;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        public static final class Builder {
            private Integer tagCount; 
            private String tagKey; 

            /**
             * TagCount.
             */
            public Builder tagCount(Integer tagCount) {
                this.tagCount = tagCount;
                return this;
            }

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            public TagKeys build() {
                return new TagKeys(this);
            } 

        } 

    }
}
