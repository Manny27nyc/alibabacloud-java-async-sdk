// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLiveRealtimeLogDeliveryInfosRequest} extends {@link RequestModel}
 *
 * <p>ListLiveRealtimeLogDeliveryInfosRequest</p>
 */
public class ListLiveRealtimeLogDeliveryInfosRequest extends Request {
    @Query
    @NameInMap("LiveOpenapiReserve")
    private String liveOpenapiReserve;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ListLiveRealtimeLogDeliveryInfosRequest(Builder builder) {
        super(builder);
        this.liveOpenapiReserve = builder.liveOpenapiReserve;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveRealtimeLogDeliveryInfosRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return liveOpenapiReserve
     */
    public String getLiveOpenapiReserve() {
        return this.liveOpenapiReserve;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListLiveRealtimeLogDeliveryInfosRequest, Builder> {
        private String liveOpenapiReserve; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListLiveRealtimeLogDeliveryInfosRequest response) {
            super(response);
            this.liveOpenapiReserve = response.liveOpenapiReserve;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
        } 

        /**
         * LiveOpenapiReserve.
         */
        public Builder liveOpenapiReserve(String liveOpenapiReserve) {
            this.putQueryParameter("LiveOpenapiReserve", liveOpenapiReserve);
            this.liveOpenapiReserve = liveOpenapiReserve;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListLiveRealtimeLogDeliveryInfosRequest build() {
            return new ListLiveRealtimeLogDeliveryInfosRequest(this);
        } 

    } 

}