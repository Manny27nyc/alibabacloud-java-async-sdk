// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackSourceCidrResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackSourceCidrResponseBody</p>
 */
public class DescribeBackSourceCidrResponseBody extends TeaModel {
    @NameInMap("Cidrs")
    private java.util.List < String > cidrs;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBackSourceCidrResponseBody(Builder builder) {
        this.cidrs = builder.cidrs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackSourceCidrResponseBody create() {
        return builder().build();
    }

    /**
     * @return cidrs
     */
    public java.util.List < String > getCidrs() {
        return this.cidrs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > cidrs; 
        private String requestId; 

        /**
         * Cidrs.
         */
        public Builder cidrs(java.util.List < String > cidrs) {
            this.cidrs = cidrs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackSourceCidrResponseBody build() {
            return new DescribeBackSourceCidrResponseBody(this);
        } 

    } 

}
