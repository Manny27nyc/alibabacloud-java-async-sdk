// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClearExternalSAMLIdentityProviderResponseBody} extends {@link TeaModel}
 *
 * <p>ClearExternalSAMLIdentityProviderResponseBody</p>
 */
public class ClearExternalSAMLIdentityProviderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ClearExternalSAMLIdentityProviderResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearExternalSAMLIdentityProviderResponseBody create() {
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

        public ClearExternalSAMLIdentityProviderResponseBody build() {
            return new ClearExternalSAMLIdentityProviderResponseBody(this);
        } 

    } 

}