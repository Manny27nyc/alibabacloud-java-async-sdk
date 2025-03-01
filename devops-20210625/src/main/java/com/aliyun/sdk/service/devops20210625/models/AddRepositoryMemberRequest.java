// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddRepositoryMemberRequest} extends {@link RequestModel}
 *
 * <p>AddRepositoryMemberRequest</p>
 */
public class AddRepositoryMemberRequest extends Request {
    @Path
    @NameInMap("repositoryId")
    @Validation(required = true)
    private Long repositoryId;

    @Query
    @NameInMap("AccessToken")
    private String accessToken;

    @Body
    @NameInMap("accessLevel")
    @Validation(required = true)
    private Integer accessLevel;

    @Body
    @NameInMap("aliyunPks")
    @Validation(required = true)
    private String aliyunPks;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    private AddRepositoryMemberRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.accessToken = builder.accessToken;
        this.accessLevel = builder.accessLevel;
        this.aliyunPks = builder.aliyunPks;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddRepositoryMemberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return repositoryId
     */
    public Long getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return accessLevel
     */
    public Integer getAccessLevel() {
        return this.accessLevel;
    }

    /**
     * @return aliyunPks
     */
    public String getAliyunPks() {
        return this.aliyunPks;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<AddRepositoryMemberRequest, Builder> {
        private Long repositoryId; 
        private String accessToken; 
        private Integer accessLevel; 
        private String aliyunPks; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(AddRepositoryMemberRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.accessToken = request.accessToken;
            this.accessLevel = request.accessLevel;
            this.aliyunPks = request.aliyunPks;
            this.organizationId = request.organizationId;
        } 

        /**
         * 代码库ID
         */
        public Builder repositoryId(Long repositoryId) {
            this.putPathParameter("repositoryId", repositoryId);
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * Codeup访问令牌，使用AK/SK方式访问可以不用填AccessToken
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("AccessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * 成员权限
         */
        public Builder accessLevel(Integer accessLevel) {
            this.putBodyParameter("accessLevel", accessLevel);
            this.accessLevel = accessLevel;
            return this;
        }

        /**
         * 需要添加为代码库成员的用户阿里云ID。支持多个，以","分割
         */
        public Builder aliyunPks(String aliyunPks) {
            this.putBodyParameter("aliyunPks", aliyunPks);
            this.aliyunPks = aliyunPks;
            return this;
        }

        /**
         * 企业ID
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public AddRepositoryMemberRequest build() {
            return new AddRepositoryMemberRequest(this);
        } 

    } 

}
