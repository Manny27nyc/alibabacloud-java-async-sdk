// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCloudAccountResponse} extends {@link TeaModel}
 *
 * <p>CreateCloudAccountResponse</p>
 */
public class CreateCloudAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCloudAccountResponseBody body;

    private CreateCloudAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCloudAccountResponse create() {
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
    public CreateCloudAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCloudAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCloudAccountResponseBody body);

        @Override
        CreateCloudAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCloudAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCloudAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCloudAccountResponse response) {
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
        public Builder body(CreateCloudAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCloudAccountResponse build() {
            return new CreateCloudAccountResponse(this);
        } 

    } 

}
