// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHttp2EnableResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyHttp2EnableResponseBody</p>
 */
public class ModifyHttp2EnableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyHttp2EnableResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHttp2EnableResponseBody create() {
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

        public ModifyHttp2EnableResponseBody build() {
            return new ModifyHttp2EnableResponseBody(this);
        } 

    } 

}
