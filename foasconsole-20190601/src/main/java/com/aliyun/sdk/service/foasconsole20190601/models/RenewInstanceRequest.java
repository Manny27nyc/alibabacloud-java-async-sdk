// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewInstanceRequest} extends {@link RequestModel}
 *
 * <p>RenewInstanceRequest</p>
 */
public class RenewInstanceRequest extends Request {
    @Body
    @NameInMap("RenewInstanceRequest")
    @Validation(required = true)
    private RenewInstanceRequestRenewInstanceRequest renewInstanceRequest;

    private RenewInstanceRequest(Builder builder) {
        super(builder);
        this.renewInstanceRequest = builder.renewInstanceRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return renewInstanceRequest
     */
    public RenewInstanceRequestRenewInstanceRequest getRenewInstanceRequest() {
        return this.renewInstanceRequest;
    }

    public static final class Builder extends Request.Builder<RenewInstanceRequest, Builder> {
        private RenewInstanceRequestRenewInstanceRequest renewInstanceRequest; 

        private Builder() {
            super();
        } 

        private Builder(RenewInstanceRequest response) {
            super(response);
            this.renewInstanceRequest = response.renewInstanceRequest;
        } 

        /**
         * RenewInstanceRequest.
         */
        public Builder renewInstanceRequest(RenewInstanceRequestRenewInstanceRequest renewInstanceRequest) {
            this.putBodyParameter("RenewInstanceRequest", renewInstanceRequest);
            this.renewInstanceRequest = renewInstanceRequest;
            return this;
        }

        @Override
        public RenewInstanceRequest build() {
            return new RenewInstanceRequest(this);
        } 

    } 

    public static class RenewInstanceRequestRenewInstanceRequest extends TeaModel {
        @NameInMap("Duration")
        @Validation(required = true)
        private Integer duration;

        @NameInMap("InstanceId")
        @Validation(required = true)
        private String instanceId;

        @NameInMap("PricingCycle")
        @Validation(required = true)
        private String pricingCycle;

        @NameInMap("Region")
        @Validation(required = true)
        private String region;

        private RenewInstanceRequestRenewInstanceRequest(Builder builder) {
            this.duration = builder.duration;
            this.instanceId = builder.instanceId;
            this.pricingCycle = builder.pricingCycle;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RenewInstanceRequestRenewInstanceRequest create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return pricingCycle
         */
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private Integer duration; 
            private String instanceId; 
            private String pricingCycle; 
            private String region; 

            /**
             * 订购周期数量
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * 实例id
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * 订购周期
             */
            public Builder pricingCycle(String pricingCycle) {
                this.pricingCycle = pricingCycle;
                return this;
            }

            /**
             * 地域id
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public RenewInstanceRequestRenewInstanceRequest build() {
                return new RenewInstanceRequestRenewInstanceRequest(this);
            } 

        } 

    }
}
