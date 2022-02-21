// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunPipelinesResponse} extends {@link TeaModel}
 *
 * <p>RunPipelinesResponse</p>
 */
public class RunPipelinesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RunPipelinesResponseBody body;

    private RunPipelinesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RunPipelinesResponse create() {
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
    public RunPipelinesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RunPipelinesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RunPipelinesResponseBody body);

        @Override
        RunPipelinesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RunPipelinesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RunPipelinesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RunPipelinesResponse response) {
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
        public Builder body(RunPipelinesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RunPipelinesResponse build() {
            return new RunPipelinesResponse(this);
        } 

    } 

}
