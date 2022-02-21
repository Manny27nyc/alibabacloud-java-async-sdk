// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePrePayOrderResponse} extends {@link TeaModel}
 *
 * <p>CreatePrePayOrderResponse</p>
 */
public class CreatePrePayOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePrePayOrderResponseBody body;

    private CreatePrePayOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePrePayOrderResponse create() {
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
    public CreatePrePayOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePrePayOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePrePayOrderResponseBody body);

        @Override
        CreatePrePayOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePrePayOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePrePayOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePrePayOrderResponse response) {
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
        public Builder body(CreatePrePayOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePrePayOrderResponse build() {
            return new CreatePrePayOrderResponse(this);
        } 

    } 

}
