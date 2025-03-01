// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecreateDesktopGroupResponseBody} extends {@link TeaModel}
 *
 * <p>RecreateDesktopGroupResponseBody</p>
 */
public class RecreateDesktopGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RecreateDesktopGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecreateDesktopGroupResponseBody create() {
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

        public RecreateDesktopGroupResponseBody build() {
            return new RecreateDesktopGroupResponseBody(this);
        } 

    } 

}
