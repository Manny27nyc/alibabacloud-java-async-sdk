// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceCapacityReservationAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyInstanceCapacityReservationAttributesResponseBody</p>
 */
public class ModifyInstanceCapacityReservationAttributesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyInstanceCapacityReservationAttributesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceCapacityReservationAttributesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyInstanceCapacityReservationAttributesResponseBody build() {
            return new ModifyInstanceCapacityReservationAttributesResponseBody(this);
        } 

    } 

}