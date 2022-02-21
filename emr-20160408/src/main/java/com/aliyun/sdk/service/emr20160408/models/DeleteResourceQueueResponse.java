// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteResourceQueueResponse} extends {@link TeaModel}
 *
 * <p>DeleteResourceQueueResponse</p>
 */
public class DeleteResourceQueueResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteResourceQueueResponseBody body;

    private DeleteResourceQueueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteResourceQueueResponse create() {
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
    public DeleteResourceQueueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteResourceQueueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteResourceQueueResponseBody body);

        @Override
        DeleteResourceQueueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteResourceQueueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteResourceQueueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteResourceQueueResponse response) {
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
        public Builder body(DeleteResourceQueueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteResourceQueueResponse build() {
            return new DeleteResourceQueueResponse(this);
        } 

    } 

}
