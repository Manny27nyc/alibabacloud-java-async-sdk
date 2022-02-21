// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindSlbResponse} extends {@link TeaModel}
 *
 * <p>UnbindSlbResponse</p>
 */
public class UnbindSlbResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnbindSlbResponseBody body;

    private UnbindSlbResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnbindSlbResponse create() {
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
    public UnbindSlbResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindSlbResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnbindSlbResponseBody body);

        @Override
        UnbindSlbResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindSlbResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnbindSlbResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindSlbResponse response) {
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
        public Builder body(UnbindSlbResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindSlbResponse build() {
            return new UnbindSlbResponse(this);
        } 

    } 

}
