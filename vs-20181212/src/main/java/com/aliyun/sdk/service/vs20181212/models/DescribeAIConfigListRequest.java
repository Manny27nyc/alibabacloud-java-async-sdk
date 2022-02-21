// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAIConfigListRequest} extends {@link RequestModel}
 *
 * <p>DescribeAIConfigListRequest</p>
 */
public class DescribeAIConfigListRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNo")
    private Long pageNo;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    private DescribeAIConfigListRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIConfigListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeAIConfigListRequest, Builder> {
        private Long ownerId; 
        private Long pageNo; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAIConfigListRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.pageNo = response.pageNo;
            this.pageSize = response.pageSize;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeAIConfigListRequest build() {
            return new DescribeAIConfigListRequest(this);
        } 

    } 

}
