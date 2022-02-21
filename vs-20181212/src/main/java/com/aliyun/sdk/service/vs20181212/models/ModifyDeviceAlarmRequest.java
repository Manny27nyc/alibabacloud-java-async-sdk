// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDeviceAlarmRequest} extends {@link RequestModel}
 *
 * <p>ModifyDeviceAlarmRequest</p>
 */
public class ModifyDeviceAlarmRequest extends Request {
    @Query
    @NameInMap("AlarmId")
    @Validation(required = true)
    private String alarmId;

    @Query
    @NameInMap("ChannelId")
    @Validation(required = true)
    private Integer channelId;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private Integer status;

    private ModifyDeviceAlarmRequest(Builder builder) {
        super(builder);
        this.alarmId = builder.alarmId;
        this.channelId = builder.channelId;
        this.id = builder.id;
        this.ownerId = builder.ownerId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDeviceAlarmRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmId
     */
    public String getAlarmId() {
        return this.alarmId;
    }

    /**
     * @return channelId
     */
    public Integer getChannelId() {
        return this.channelId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifyDeviceAlarmRequest, Builder> {
        private String alarmId; 
        private Integer channelId; 
        private String id; 
        private Long ownerId; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDeviceAlarmRequest response) {
            super(response);
            this.alarmId = response.alarmId;
            this.channelId = response.channelId;
            this.id = response.id;
            this.ownerId = response.ownerId;
            this.status = response.status;
        } 

        /**
         * AlarmId.
         */
        public Builder alarmId(String alarmId) {
            this.putQueryParameter("AlarmId", alarmId);
            this.alarmId = alarmId;
            return this;
        }

        /**
         * ChannelId.
         */
        public Builder channelId(Integer channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModifyDeviceAlarmRequest build() {
            return new ModifyDeviceAlarmRequest(this);
        } 

    } 

}
