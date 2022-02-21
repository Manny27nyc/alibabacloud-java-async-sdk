// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachCommonBandwidthPackageToLoadBalancerResponse} extends {@link TeaModel}
 *
 * <p>AttachCommonBandwidthPackageToLoadBalancerResponse</p>
 */
public class AttachCommonBandwidthPackageToLoadBalancerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachCommonBandwidthPackageToLoadBalancerResponseBody body;

    private AttachCommonBandwidthPackageToLoadBalancerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachCommonBandwidthPackageToLoadBalancerResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public AttachCommonBandwidthPackageToLoadBalancerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachCommonBandwidthPackageToLoadBalancerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachCommonBandwidthPackageToLoadBalancerResponseBody body);

        @Override
        AttachCommonBandwidthPackageToLoadBalancerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachCommonBandwidthPackageToLoadBalancerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachCommonBandwidthPackageToLoadBalancerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachCommonBandwidthPackageToLoadBalancerResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(AttachCommonBandwidthPackageToLoadBalancerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachCommonBandwidthPackageToLoadBalancerResponse build() {
            return new AttachCommonBandwidthPackageToLoadBalancerResponse(this);
        } 

    } 

}
