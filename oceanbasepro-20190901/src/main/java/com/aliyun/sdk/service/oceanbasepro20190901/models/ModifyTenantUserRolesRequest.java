// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTenantUserRolesRequest} extends {@link RequestModel}
 *
 * <p>ModifyTenantUserRolesRequest</p>
 */
public class ModifyTenantUserRolesRequest extends Request {
    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("ModifyType")
    private String modifyType;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    @Body
    @NameInMap("UserName")
    @Validation(required = true)
    private String userName;

    @Body
    @NameInMap("UserRole")
    @Validation(required = true)
    private String userRole;

    private ModifyTenantUserRolesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.modifyType = builder.modifyType;
        this.regionId = builder.regionId;
        this.tenantId = builder.tenantId;
        this.userName = builder.userName;
        this.userRole = builder.userRole;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTenantUserRolesRequest create() {
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
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return userRole
     */
    public String getUserRole() {
        return this.userRole;
    }

    public static final class Builder extends Request.Builder<ModifyTenantUserRolesRequest, Builder> {
        private String instanceId; 
        private String modifyType; 
        private String regionId; 
        private String tenantId; 
        private String userName; 
        private String userRole; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTenantUserRolesRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.modifyType = response.modifyType;
            this.regionId = response.regionId;
            this.tenantId = response.tenantId;
            this.userName = response.userName;
            this.userRole = response.userRole;
        } 

        /**
         * Oceanbase集群ID。
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 用户权限修改类型。 可支持以下几种方式： update：全量更新权限，默认值； add：新增权限； delete：删除权限。 默认值：update。
         */
        public Builder modifyType(String modifyType) {
            this.putBodyParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
            return this;
        }

        /**
         * 地域ID。
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 租户ID。
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * 数据库账号名称。 不能使用某些预留关键字，如 SYS、root等。
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * 数据库的账号角色信息。
         */
        public Builder userRole(String userRole) {
            this.putBodyParameter("UserRole", userRole);
            this.userRole = userRole;
            return this;
        }

        @Override
        public ModifyTenantUserRolesRequest build() {
            return new ModifyTenantUserRolesRequest(this);
        } 

    } 

}
