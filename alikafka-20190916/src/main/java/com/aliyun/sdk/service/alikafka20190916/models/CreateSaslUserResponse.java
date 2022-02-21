// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSaslUserResponse} extends {@link TeaModel}
 *
 * <p>CreateSaslUserResponse</p>
 */
public class CreateSaslUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSaslUserResponseBody body;

    private CreateSaslUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSaslUserResponse create() {
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
    public CreateSaslUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSaslUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSaslUserResponseBody body);

        @Override
        CreateSaslUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSaslUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSaslUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSaslUserResponse response) {
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
        public Builder body(CreateSaslUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSaslUserResponse build() {
            return new CreateSaslUserResponse(this);
        } 

    } 

}
