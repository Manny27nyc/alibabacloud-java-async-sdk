// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindPurchasedDeviceRequest} extends {@link RequestModel}
 *
 * <p>UnbindPurchasedDeviceRequest</p>
 */
public class UnbindPurchasedDeviceRequest extends Request {
    @Query
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private UnbindPurchasedDeviceRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindPurchasedDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<UnbindPurchasedDeviceRequest, Builder> {
        private String deviceId; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(UnbindPurchasedDeviceRequest response) {
            super(response);
            this.deviceId = response.deviceId;
            this.ownerId = response.ownerId;
        } 

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public UnbindPurchasedDeviceRequest build() {
            return new UnbindPurchasedDeviceRequest(this);
        } 

    } 

}
