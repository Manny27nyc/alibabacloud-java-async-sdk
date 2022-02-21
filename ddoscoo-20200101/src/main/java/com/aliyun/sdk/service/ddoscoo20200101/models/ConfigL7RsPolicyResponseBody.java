// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigL7RsPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ConfigL7RsPolicyResponseBody</p>
 */
public class ConfigL7RsPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ConfigL7RsPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigL7RsPolicyResponseBody create() {
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

        public ConfigL7RsPolicyResponseBody build() {
            return new ConfigL7RsPolicyResponseBody(this);
        } 

    } 

}
