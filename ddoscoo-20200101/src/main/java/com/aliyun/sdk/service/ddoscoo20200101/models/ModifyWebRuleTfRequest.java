// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebRuleTfRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebRuleTfRequest</p>
 */
public class ModifyWebRuleTfRequest extends Request {
    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("HttpsExt")
    private String httpsExt;

    @Query
    @NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @Query
    @NameInMap("ProxyTypes")
    @Validation(required = true)
    private String proxyTypes;

    @Query
    @NameInMap("RealServers")
    @Validation(required = true)
    private java.util.List < String > realServers;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("RsType")
    @Validation(required = true)
    private Integer rsType;

    private ModifyWebRuleTfRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.httpsExt = builder.httpsExt;
        this.instanceIds = builder.instanceIds;
        this.proxyTypes = builder.proxyTypes;
        this.realServers = builder.realServers;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.rsType = builder.rsType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebRuleTfRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return httpsExt
     */
    public String getHttpsExt() {
        return this.httpsExt;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return proxyTypes
     */
    public String getProxyTypes() {
        return this.proxyTypes;
    }

    /**
     * @return realServers
     */
    public java.util.List < String > getRealServers() {
        return this.realServers;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return rsType
     */
    public Integer getRsType() {
        return this.rsType;
    }

    public static final class Builder extends Request.Builder<ModifyWebRuleTfRequest, Builder> {
        private String domain; 
        private String httpsExt; 
        private java.util.List < String > instanceIds; 
        private String proxyTypes; 
        private java.util.List < String > realServers; 
        private String regionId; 
        private String resourceGroupId; 
        private Integer rsType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWebRuleTfRequest response) {
            super(response);
            this.domain = response.domain;
            this.httpsExt = response.httpsExt;
            this.instanceIds = response.instanceIds;
            this.proxyTypes = response.proxyTypes;
            this.realServers = response.realServers;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.rsType = response.rsType;
        } 

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * HttpsExt.
         */
        public Builder httpsExt(String httpsExt) {
            this.putQueryParameter("HttpsExt", httpsExt);
            this.httpsExt = httpsExt;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * ProxyTypes.
         */
        public Builder proxyTypes(String proxyTypes) {
            this.putQueryParameter("ProxyTypes", proxyTypes);
            this.proxyTypes = proxyTypes;
            return this;
        }

        /**
         * RealServers.
         */
        public Builder realServers(java.util.List < String > realServers) {
            this.putQueryParameter("RealServers", realServers);
            this.realServers = realServers;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * RsType.
         */
        public Builder rsType(Integer rsType) {
            this.putQueryParameter("RsType", rsType);
            this.rsType = rsType;
            return this;
        }

        @Override
        public ModifyWebRuleTfRequest build() {
            return new ModifyWebRuleTfRequest(this);
        } 

    } 

}
