// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePortConnsCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePortConnsCountResponseBody</p>
 */
public class DescribePortConnsCountResponseBody extends TeaModel {
    @NameInMap("ActConns")
    private Long actConns;

    @NameInMap("Conns")
    private Long conns;

    @NameInMap("Cps")
    private Long cps;

    @NameInMap("InActConns")
    private Long inActConns;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePortConnsCountResponseBody(Builder builder) {
        this.actConns = builder.actConns;
        this.conns = builder.conns;
        this.cps = builder.cps;
        this.inActConns = builder.inActConns;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePortConnsCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return actConns
     */
    public Long getActConns() {
        return this.actConns;
    }

    /**
     * @return conns
     */
    public Long getConns() {
        return this.conns;
    }

    /**
     * @return cps
     */
    public Long getCps() {
        return this.cps;
    }

    /**
     * @return inActConns
     */
    public Long getInActConns() {
        return this.inActConns;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long actConns; 
        private Long conns; 
        private Long cps; 
        private Long inActConns; 
        private String requestId; 

        /**
         * ActConns.
         */
        public Builder actConns(Long actConns) {
            this.actConns = actConns;
            return this;
        }

        /**
         * Conns.
         */
        public Builder conns(Long conns) {
            this.conns = conns;
            return this;
        }

        /**
         * Cps.
         */
        public Builder cps(Long cps) {
            this.cps = cps;
            return this;
        }

        /**
         * InActConns.
         */
        public Builder inActConns(Long inActConns) {
            this.inActConns = inActConns;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePortConnsCountResponseBody build() {
            return new DescribePortConnsCountResponseBody(this);
        } 

    } 

}