// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebCacheCustomRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyWebCacheCustomRuleResponseBody</p>
 */
public class ModifyWebCacheCustomRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyWebCacheCustomRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebCacheCustomRuleResponseBody create() {
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

        public ModifyWebCacheCustomRuleResponseBody build() {
            return new ModifyWebCacheCustomRuleResponseBody(this);
        } 

    } 

}