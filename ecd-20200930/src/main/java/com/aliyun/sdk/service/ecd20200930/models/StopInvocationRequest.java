// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopInvocationRequest} extends {@link RequestModel}
 *
 * <p>StopInvocationRequest</p>
 */
public class StopInvocationRequest extends Request {
    @Query
    @NameInMap("DesktopId")
    private java.util.List < String > desktopId;

    @Query
    @NameInMap("InvokeId")
    @Validation(required = true)
    private String invokeId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private StopInvocationRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.invokeId = builder.invokeId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopInvocationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public java.util.List < String > getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return invokeId
     */
    public String getInvokeId() {
        return this.invokeId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<StopInvocationRequest, Builder> {
        private java.util.List < String > desktopId; 
        private String invokeId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StopInvocationRequest response) {
            super(response);
            this.desktopId = response.desktopId;
            this.invokeId = response.invokeId;
            this.regionId = response.regionId;
        } 

        /**
         * DesktopId.
         */
        public Builder desktopId(java.util.List < String > desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * InvokeId.
         */
        public Builder invokeId(String invokeId) {
            this.putQueryParameter("InvokeId", invokeId);
            this.invokeId = invokeId;
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

        @Override
        public StopInvocationRequest build() {
            return new StopInvocationRequest(this);
        } 

    } 

}
