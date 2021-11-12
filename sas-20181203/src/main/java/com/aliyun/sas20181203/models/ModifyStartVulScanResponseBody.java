// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyStartVulScanResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyStartVulScanResponseBody</p>
 */
public class ModifyStartVulScanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private ModifyStartVulScanResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyStartVulScanResponseBody create() {
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
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyStartVulScanResponseBody build() {
            return new ModifyStartVulScanResponseBody(this);
        } 

    } 

}
