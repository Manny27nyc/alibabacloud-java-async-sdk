// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigNetworkRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ConfigNetworkRulesResponseBody</p>
 */
public class ConfigNetworkRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ConfigNetworkRulesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigNetworkRulesResponseBody create() {
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

        public ConfigNetworkRulesResponseBody build() {
            return new ConfigNetworkRulesResponseBody(this);
        } 

    } 

}
