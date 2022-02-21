// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopVMDeployOrderResponse} extends {@link TeaModel}
 *
 * <p>StopVMDeployOrderResponse</p>
 */
public class StopVMDeployOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopVMDeployOrderResponseBody body;

    private StopVMDeployOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopVMDeployOrderResponse create() {
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
    public StopVMDeployOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopVMDeployOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopVMDeployOrderResponseBody body);

        @Override
        StopVMDeployOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopVMDeployOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopVMDeployOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopVMDeployOrderResponse response) {
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
        public Builder body(StopVMDeployOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopVMDeployOrderResponse build() {
            return new StopVMDeployOrderResponse(this);
        } 

    } 

}