// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link CreateOrganizationalUnitRequest} extends {@link RequestModel}
 *
 * <p>CreateOrganizationalUnitRequest</p>
 */
public class CreateOrganizationalUnitRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("applicationId")
    @Validation(required = true)
    private String applicationId;

    @Header
    @NameInMap("Authorization")
    @Validation(required = true)
    private String authorization;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("organizationalUnitExternalId")
    private String organizationalUnitExternalId;

    @Body
    @NameInMap("organizationalUnitName")
    @Validation(required = true)
    private String organizationalUnitName;

    @Body
    @NameInMap("parentId")
    @Validation(required = true)
    private String parentId;

    @Host
    @NameInMap("regionId")
    private String regionId;

    private CreateOrganizationalUnitRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.applicationId = builder.applicationId;
        this.authorization = builder.authorization;
        this.description = builder.description;
        this.organizationalUnitExternalId = builder.organizationalUnitExternalId;
        this.organizationalUnitName = builder.organizationalUnitName;
        this.parentId = builder.parentId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrganizationalUnitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return authorization
     */
    public String getAuthorization() {
        return this.authorization;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return organizationalUnitExternalId
     */
    public String getOrganizationalUnitExternalId() {
        return this.organizationalUnitExternalId;
    }

    /**
     * @return organizationalUnitName
     */
    public String getOrganizationalUnitName() {
        return this.organizationalUnitName;
    }

    /**
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateOrganizationalUnitRequest, Builder> {
        private String instanceId; 
        private String applicationId; 
        private String authorization; 
        private String description; 
        private String organizationalUnitExternalId; 
        private String organizationalUnitName; 
        private String parentId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrganizationalUnitRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.applicationId = request.applicationId;
            this.authorization = request.authorization;
            this.description = request.description;
            this.organizationalUnitExternalId = request.organizationalUnitExternalId;
            this.organizationalUnitName = request.organizationalUnitName;
            this.parentId = request.parentId;
            this.regionId = request.regionId;
        } 

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 应用ID
         */
        public Builder applicationId(String applicationId) {
            this.putPathParameter("applicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * 认证信息，格式:Bearer access_token
         */
        public Builder authorization(String authorization) {
            this.putHeaderParameter("Authorization", authorization);
            this.authorization = authorization;
            return this;
        }

        /**
         * 描述
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * 机构外部ID
         */
        public Builder organizationalUnitExternalId(String organizationalUnitExternalId) {
            this.putBodyParameter("organizationalUnitExternalId", organizationalUnitExternalId);
            this.organizationalUnitExternalId = organizationalUnitExternalId;
            return this;
        }

        /**
         * 机构名称
         */
        public Builder organizationalUnitName(String organizationalUnitName) {
            this.putBodyParameter("organizationalUnitName", organizationalUnitName);
            this.organizationalUnitName = organizationalUnitName;
            return this;
        }

        /**
         * 父机构ID
         */
        public Builder parentId(String parentId) {
            this.putBodyParameter("parentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateOrganizationalUnitRequest build() {
            return new CreateOrganizationalUnitRequest(this);
        } 

    } 

}
