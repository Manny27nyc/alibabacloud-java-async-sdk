// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuthorizedAppsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAuthorizedAppsRequest</p>
 */
public class DescribeAuthorizedAppsRequest extends Request {
    @Query
    @NameInMap("ApiId")
    @Validation(required = true)
    private String apiId;

    @Query
    @NameInMap("AppId")
    private Long appId;

    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("AppOwnerId")
    private Long appOwnerId;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StageName")
    private String stageName;

    private DescribeAuthorizedAppsRequest(Builder builder) {
        super(builder);
        this.apiId = builder.apiId;
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.appOwnerId = builder.appOwnerId;
        this.groupId = builder.groupId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.securityToken = builder.securityToken;
        this.stageName = builder.stageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuthorizedAppsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiId
     */
    public String getApiId() {
        return this.apiId;
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appOwnerId
     */
    public Long getAppOwnerId() {
        return this.appOwnerId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
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

    /**
     * @return stageName
     */
    public String getStageName() {
        return this.stageName;
    }

    public static final class Builder extends Request.Builder<DescribeAuthorizedAppsRequest, Builder> {
        private String apiId; 
        private Long appId; 
        private String appName; 
        private Long appOwnerId; 
        private String groupId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String securityToken; 
        private String stageName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAuthorizedAppsRequest response) {
            super(response);
            this.apiId = response.apiId;
            this.appId = response.appId;
            this.appName = response.appName;
            this.appOwnerId = response.appOwnerId;
            this.groupId = response.groupId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.securityToken = response.securityToken;
            this.stageName = response.stageName;
        } 

        /**
         * ApiId.
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(Long appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AppOwnerId.
         */
        public Builder appOwnerId(Long appOwnerId) {
            this.putQueryParameter("AppOwnerId", appOwnerId);
            this.appOwnerId = appOwnerId;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
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

        /**
         * StageName.
         */
        public Builder stageName(String stageName) {
            this.putQueryParameter("StageName", stageName);
            this.stageName = stageName;
            return this;
        }

        @Override
        public DescribeAuthorizedAppsRequest build() {
            return new DescribeAuthorizedAppsRequest(this);
        } 

    } 

}
