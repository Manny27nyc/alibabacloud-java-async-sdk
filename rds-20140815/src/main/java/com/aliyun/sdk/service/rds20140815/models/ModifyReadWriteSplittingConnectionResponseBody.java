// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyReadWriteSplittingConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyReadWriteSplittingConnectionResponseBody</p>
 */
public class ModifyReadWriteSplittingConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyReadWriteSplittingConnectionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyReadWriteSplittingConnectionResponseBody create() {
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

        public ModifyReadWriteSplittingConnectionResponseBody build() {
            return new ModifyReadWriteSplittingConnectionResponseBody(this);
        } 

    } 

}