// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteStackGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteStackGroupResponseBody</p>
 */
public class DeleteStackGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private DeleteStackGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteStackGroupResponseBody create() {
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

        public DeleteStackGroupResponseBody build() {
            return new DeleteStackGroupResponseBody(this);
        } 

    } 

}
