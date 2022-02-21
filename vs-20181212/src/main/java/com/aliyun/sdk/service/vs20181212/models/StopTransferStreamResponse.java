// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopTransferStreamResponse} extends {@link TeaModel}
 *
 * <p>StopTransferStreamResponse</p>
 */
public class StopTransferStreamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopTransferStreamResponseBody body;

    private StopTransferStreamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopTransferStreamResponse create() {
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
    public StopTransferStreamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopTransferStreamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopTransferStreamResponseBody body);

        @Override
        StopTransferStreamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopTransferStreamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopTransferStreamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopTransferStreamResponse response) {
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
        public Builder body(StopTransferStreamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopTransferStreamResponse build() {
            return new StopTransferStreamResponse(this);
        } 

    } 

}
