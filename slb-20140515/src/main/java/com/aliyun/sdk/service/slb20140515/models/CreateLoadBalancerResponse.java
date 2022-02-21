// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLoadBalancerResponse} extends {@link TeaModel}
 *
 * <p>CreateLoadBalancerResponse</p>
 */
public class CreateLoadBalancerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateLoadBalancerResponseBody body;

    private CreateLoadBalancerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateLoadBalancerResponse create() {
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
    public CreateLoadBalancerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateLoadBalancerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateLoadBalancerResponseBody body);

        @Override
        CreateLoadBalancerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateLoadBalancerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateLoadBalancerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateLoadBalancerResponse response) {
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
        public Builder body(CreateLoadBalancerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateLoadBalancerResponse build() {
            return new CreateLoadBalancerResponse(this);
        } 

    } 

}