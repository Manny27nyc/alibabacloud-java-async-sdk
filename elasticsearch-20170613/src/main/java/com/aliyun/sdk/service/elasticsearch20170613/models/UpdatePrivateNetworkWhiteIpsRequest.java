// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePrivateNetworkWhiteIpsRequest} extends {@link RequestModel}
 *
 * <p>UpdatePrivateNetworkWhiteIpsRequest</p>
 */
public class UpdatePrivateNetworkWhiteIpsRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("clientToken")
    private String clientToken;

    @Query
    @NameInMap("modifyMode")
    private String modifyMode;

    private UpdatePrivateNetworkWhiteIpsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clientToken = builder.clientToken;
        this.modifyMode = builder.modifyMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePrivateNetworkWhiteIpsRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return modifyMode
     */
    public String getModifyMode() {
        return this.modifyMode;
    }

    public static final class Builder extends Request.Builder<UpdatePrivateNetworkWhiteIpsRequest, Builder> {
        private String instanceId; 
        private String clientToken; 
        private String modifyMode; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePrivateNetworkWhiteIpsRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.clientToken = response.clientToken;
            this.modifyMode = response.modifyMode;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * modifyMode.
         */
        public Builder modifyMode(String modifyMode) {
            this.putQueryParameter("modifyMode", modifyMode);
            this.modifyMode = modifyMode;
            return this;
        }

        @Override
        public UpdatePrivateNetworkWhiteIpsRequest build() {
            return new UpdatePrivateNetworkWhiteIpsRequest(this);
        } 

    } 

}