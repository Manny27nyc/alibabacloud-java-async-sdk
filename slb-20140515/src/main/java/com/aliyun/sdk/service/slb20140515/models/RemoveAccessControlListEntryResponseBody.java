// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveAccessControlListEntryResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveAccessControlListEntryResponseBody</p>
 */
public class RemoveAccessControlListEntryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RemoveAccessControlListEntryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveAccessControlListEntryResponseBody create() {
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

        public RemoveAccessControlListEntryResponseBody build() {
            return new RemoveAccessControlListEntryResponseBody(this);
        } 

    } 

}