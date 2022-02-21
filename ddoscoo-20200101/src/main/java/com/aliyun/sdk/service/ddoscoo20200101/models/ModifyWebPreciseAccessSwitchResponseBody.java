// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebPreciseAccessSwitchResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyWebPreciseAccessSwitchResponseBody</p>
 */
public class ModifyWebPreciseAccessSwitchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyWebPreciseAccessSwitchResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebPreciseAccessSwitchResponseBody create() {
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

        public ModifyWebPreciseAccessSwitchResponseBody build() {
            return new ModifyWebPreciseAccessSwitchResponseBody(this);
        } 

    } 

}
