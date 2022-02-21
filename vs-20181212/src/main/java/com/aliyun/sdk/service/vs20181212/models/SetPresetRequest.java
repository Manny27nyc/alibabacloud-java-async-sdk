// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPresetRequest} extends {@link RequestModel}
 *
 * <p>SetPresetRequest</p>
 */
public class SetPresetRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PresetId")
    @Validation(required = true)
    private String presetId;

    private SetPresetRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.ownerId = builder.ownerId;
        this.presetId = builder.presetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetPresetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return presetId
     */
    public String getPresetId() {
        return this.presetId;
    }

    public static final class Builder extends Request.Builder<SetPresetRequest, Builder> {
        private String id; 
        private Long ownerId; 
        private String presetId; 

        private Builder() {
            super();
        } 

        private Builder(SetPresetRequest response) {
            super(response);
            this.id = response.id;
            this.ownerId = response.ownerId;
            this.presetId = response.presetId;
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
         * PresetId.
         */
        public Builder presetId(String presetId) {
            this.putQueryParameter("PresetId", presetId);
            this.presetId = presetId;
            return this;
        }

        @Override
        public SetPresetRequest build() {
            return new SetPresetRequest(this);
        } 

    } 

}
