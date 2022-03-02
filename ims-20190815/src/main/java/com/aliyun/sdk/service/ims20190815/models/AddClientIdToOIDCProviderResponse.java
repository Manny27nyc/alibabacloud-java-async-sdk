// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddClientIdToOIDCProviderResponse} extends {@link TeaModel}
 *
 * <p>AddClientIdToOIDCProviderResponse</p>
 */
public class AddClientIdToOIDCProviderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddClientIdToOIDCProviderResponseBody body;

    private AddClientIdToOIDCProviderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddClientIdToOIDCProviderResponse create() {
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
    public AddClientIdToOIDCProviderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddClientIdToOIDCProviderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddClientIdToOIDCProviderResponseBody body);

        @Override
        AddClientIdToOIDCProviderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddClientIdToOIDCProviderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddClientIdToOIDCProviderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddClientIdToOIDCProviderResponse response) {
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
        public Builder body(AddClientIdToOIDCProviderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddClientIdToOIDCProviderResponse build() {
            return new AddClientIdToOIDCProviderResponse(this);
        } 

    } 

}