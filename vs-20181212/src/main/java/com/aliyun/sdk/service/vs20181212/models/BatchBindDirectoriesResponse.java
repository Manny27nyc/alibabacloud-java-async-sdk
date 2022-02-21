// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchBindDirectoriesResponse} extends {@link TeaModel}
 *
 * <p>BatchBindDirectoriesResponse</p>
 */
public class BatchBindDirectoriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchBindDirectoriesResponseBody body;

    private BatchBindDirectoriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchBindDirectoriesResponse create() {
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
    public BatchBindDirectoriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchBindDirectoriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchBindDirectoriesResponseBody body);

        @Override
        BatchBindDirectoriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchBindDirectoriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchBindDirectoriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchBindDirectoriesResponse response) {
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
        public Builder body(BatchBindDirectoriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchBindDirectoriesResponse build() {
            return new BatchBindDirectoriesResponse(this);
        } 

    } 

}
