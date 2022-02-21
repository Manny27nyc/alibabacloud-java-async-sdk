// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateClusterPublicConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>AllocateClusterPublicConnectionResponseBody</p>
 */
public class AllocateClusterPublicConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private AllocateClusterPublicConnectionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateClusterPublicConnectionResponseBody create() {
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

        public AllocateClusterPublicConnectionResponseBody build() {
            return new AllocateClusterPublicConnectionResponseBody(this);
        } 

    } 

}
