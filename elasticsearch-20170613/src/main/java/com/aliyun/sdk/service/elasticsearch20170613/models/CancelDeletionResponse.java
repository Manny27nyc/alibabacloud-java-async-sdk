// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelDeletionResponse} extends {@link TeaModel}
 *
 * <p>CancelDeletionResponse</p>
 */
public class CancelDeletionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelDeletionResponseBody body;

    private CancelDeletionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelDeletionResponse create() {
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
    public CancelDeletionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelDeletionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelDeletionResponseBody body);

        @Override
        CancelDeletionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelDeletionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelDeletionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelDeletionResponse response) {
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
        public Builder body(CancelDeletionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelDeletionResponse build() {
            return new CancelDeletionResponse(this);
        } 

    } 

}
