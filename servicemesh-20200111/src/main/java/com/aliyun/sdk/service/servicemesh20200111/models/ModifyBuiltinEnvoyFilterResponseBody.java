// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBuiltinEnvoyFilterResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyBuiltinEnvoyFilterResponseBody</p>
 */
public class ModifyBuiltinEnvoyFilterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyBuiltinEnvoyFilterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBuiltinEnvoyFilterResponseBody create() {
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

        public ModifyBuiltinEnvoyFilterResponseBody build() {
            return new ModifyBuiltinEnvoyFilterResponseBody(this);
        } 

    } 

}