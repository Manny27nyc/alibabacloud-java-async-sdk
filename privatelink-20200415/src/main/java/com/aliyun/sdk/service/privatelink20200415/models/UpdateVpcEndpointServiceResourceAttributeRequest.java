// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVpcEndpointServiceResourceAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateVpcEndpointServiceResourceAttributeRequest</p>
 */
public class UpdateVpcEndpointServiceResourceAttributeRequest extends Request {
    @Query
    @NameInMap("AutoAllocatedEnabled")
    @Validation(required = true)
    private Boolean autoAllocatedEnabled;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("ServiceId")
    @Validation(required = true)
    private String serviceId;

    private UpdateVpcEndpointServiceResourceAttributeRequest(Builder builder) {
        super(builder);
        this.autoAllocatedEnabled = builder.autoAllocatedEnabled;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.regionId = builder.regionId;
        this.resourceId = builder.resourceId;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVpcEndpointServiceResourceAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoAllocatedEnabled
     */
    public Boolean getAutoAllocatedEnabled() {
        return this.autoAllocatedEnabled;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    public static final class Builder extends Request.Builder<UpdateVpcEndpointServiceResourceAttributeRequest, Builder> {
        private Boolean autoAllocatedEnabled; 
        private String clientToken; 
        private Boolean dryRun; 
        private String regionId; 
        private String resourceId; 
        private String serviceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVpcEndpointServiceResourceAttributeRequest response) {
            super(response);
            this.autoAllocatedEnabled = response.autoAllocatedEnabled;
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.regionId = response.regionId;
            this.resourceId = response.resourceId;
            this.serviceId = response.serviceId;
        } 

        /**
         * AutoAllocatedEnabled.
         */
        public Builder autoAllocatedEnabled(Boolean autoAllocatedEnabled) {
            this.putQueryParameter("AutoAllocatedEnabled", autoAllocatedEnabled);
            this.autoAllocatedEnabled = autoAllocatedEnabled;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public UpdateVpcEndpointServiceResourceAttributeRequest build() {
            return new UpdateVpcEndpointServiceResourceAttributeRequest(this);
        } 

    } 

}
