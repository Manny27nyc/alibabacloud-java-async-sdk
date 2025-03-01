// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpControlsRequest} extends {@link RequestModel}
 *
 * <p>DescribeIpControlsRequest</p>
 */
public class DescribeIpControlsRequest extends Request {
    @Query
    @NameInMap("IpControlId")
    private String ipControlId;

    @Query
    @NameInMap("IpControlName")
    private String ipControlName;

    @Query
    @NameInMap("IpControlType")
    private String ipControlType;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeIpControlsRequest(Builder builder) {
        super(builder);
        this.ipControlId = builder.ipControlId;
        this.ipControlName = builder.ipControlName;
        this.ipControlType = builder.ipControlType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpControlsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipControlId
     */
    public String getIpControlId() {
        return this.ipControlId;
    }

    /**
     * @return ipControlName
     */
    public String getIpControlName() {
        return this.ipControlName;
    }

    /**
     * @return ipControlType
     */
    public String getIpControlType() {
        return this.ipControlType;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeIpControlsRequest, Builder> {
        private String ipControlId; 
        private String ipControlName; 
        private String ipControlType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIpControlsRequest response) {
            super(response);
            this.ipControlId = response.ipControlId;
            this.ipControlName = response.ipControlName;
            this.ipControlType = response.ipControlType;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.securityToken = response.securityToken;
        } 

        /**
         * IpControlId.
         */
        public Builder ipControlId(String ipControlId) {
            this.putQueryParameter("IpControlId", ipControlId);
            this.ipControlId = ipControlId;
            return this;
        }

        /**
         * IpControlName.
         */
        public Builder ipControlName(String ipControlName) {
            this.putQueryParameter("IpControlName", ipControlName);
            this.ipControlName = ipControlName;
            return this;
        }

        /**
         * IpControlType.
         */
        public Builder ipControlType(String ipControlType) {
            this.putQueryParameter("IpControlType", ipControlType);
            this.ipControlType = ipControlType;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribeIpControlsRequest build() {
            return new DescribeIpControlsRequest(this);
        } 

    } 

}
