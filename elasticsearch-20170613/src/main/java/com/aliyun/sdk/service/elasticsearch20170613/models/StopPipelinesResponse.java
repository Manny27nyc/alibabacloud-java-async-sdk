// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopPipelinesResponse} extends {@link TeaModel}
 *
 * <p>StopPipelinesResponse</p>
 */
public class StopPipelinesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopPipelinesResponseBody body;

    private StopPipelinesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopPipelinesResponse create() {
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
    public StopPipelinesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopPipelinesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopPipelinesResponseBody body);

        @Override
        StopPipelinesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopPipelinesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopPipelinesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopPipelinesResponse response) {
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
        public Builder body(StopPipelinesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopPipelinesResponse build() {
            return new StopPipelinesResponse(this);
        } 

    } 

}
