// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddNetworkInterfaceToInstanceRequest} extends {@link RequestModel}
 *
 * <p>AddNetworkInterfaceToInstanceRequest</p>
 */
public class AddNetworkInterfaceToInstanceRequest extends Request {
    @Query
    @NameInMap("AutoStart")
    private Boolean autoStart;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Networks")
    @Validation(required = true)
    private String networks;

    private AddNetworkInterfaceToInstanceRequest(Builder builder) {
        super(builder);
        this.autoStart = builder.autoStart;
        this.instanceId = builder.instanceId;
        this.networks = builder.networks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddNetworkInterfaceToInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoStart
     */
    public Boolean getAutoStart() {
        return this.autoStart;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return networks
     */
    public String getNetworks() {
        return this.networks;
    }

    public static final class Builder extends Request.Builder<AddNetworkInterfaceToInstanceRequest, Builder> {
        private Boolean autoStart; 
        private String instanceId; 
        private String networks; 

        private Builder() {
            super();
        } 

        private Builder(AddNetworkInterfaceToInstanceRequest response) {
            super(response);
            this.autoStart = response.autoStart;
            this.instanceId = response.instanceId;
            this.networks = response.networks;
        } 

        /**
         * AutoStart.
         */
        public Builder autoStart(Boolean autoStart) {
            this.putQueryParameter("AutoStart", autoStart);
            this.autoStart = autoStart;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Networks.
         */
        public Builder networks(String networks) {
            this.putQueryParameter("Networks", networks);
            this.networks = networks;
            return this;
        }

        @Override
        public AddNetworkInterfaceToInstanceRequest build() {
            return new AddNetworkInterfaceToInstanceRequest(this);
        } 

    } 

}
