// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListKeyPairsResponse} extends {@link TeaModel}
 *
 * <p>ListKeyPairsResponse</p>
 */
public class ListKeyPairsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListKeyPairsResponseBody body;

    private ListKeyPairsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListKeyPairsResponse create() {
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
    public ListKeyPairsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListKeyPairsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListKeyPairsResponseBody body);

        @Override
        ListKeyPairsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListKeyPairsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListKeyPairsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListKeyPairsResponse response) {
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
        public Builder body(ListKeyPairsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListKeyPairsResponse build() {
            return new ListKeyPairsResponse(this);
        } 

    } 

}
