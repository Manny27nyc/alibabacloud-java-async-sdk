// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountListResponse} extends {@link TeaModel}
 *
 * <p>GetAccountListResponse</p>
 */
public class GetAccountListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAccountListResponseBody body;

    private GetAccountListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAccountListResponse create() {
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
    public GetAccountListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAccountListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAccountListResponseBody body);

        @Override
        GetAccountListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAccountListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAccountListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAccountListResponse response) {
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
        public Builder body(GetAccountListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAccountListResponse build() {
            return new GetAccountListResponse(this);
        } 

    } 

}