// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecretVersionIdsResponse} extends {@link TeaModel}
 *
 * <p>ListSecretVersionIdsResponse</p>
 */
public class ListSecretVersionIdsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSecretVersionIdsResponseBody body;

    private ListSecretVersionIdsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSecretVersionIdsResponse create() {
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
    public ListSecretVersionIdsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSecretVersionIdsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSecretVersionIdsResponseBody body);

        @Override
        ListSecretVersionIdsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSecretVersionIdsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSecretVersionIdsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSecretVersionIdsResponse response) {
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
        public Builder body(ListSecretVersionIdsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSecretVersionIdsResponse build() {
            return new ListSecretVersionIdsResponse(this);
        } 

    } 

}