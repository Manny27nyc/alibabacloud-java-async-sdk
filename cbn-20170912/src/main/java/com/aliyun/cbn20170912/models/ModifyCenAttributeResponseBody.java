// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyCenAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCenAttributeResponseBody</p>
 */
public class ModifyCenAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private ModifyCenAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCenAttributeResponseBody create() {
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

        public ModifyCenAttributeResponseBody build() {
            return new ModifyCenAttributeResponseBody(this);
        } 

    } 

}