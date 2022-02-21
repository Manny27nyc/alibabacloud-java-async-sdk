// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDcdnIpaDomainResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDcdnIpaDomainResponseBody</p>
 */
public class UpdateDcdnIpaDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateDcdnIpaDomainResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDcdnIpaDomainResponseBody create() {
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

        public UpdateDcdnIpaDomainResponseBody build() {
            return new UpdateDcdnIpaDomainResponseBody(this);
        } 

    } 

}
