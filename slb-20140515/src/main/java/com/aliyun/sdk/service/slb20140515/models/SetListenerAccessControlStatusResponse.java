// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetListenerAccessControlStatusResponse} extends {@link TeaModel}
 *
 * <p>SetListenerAccessControlStatusResponse</p>
 */
public class SetListenerAccessControlStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetListenerAccessControlStatusResponseBody body;

    private SetListenerAccessControlStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetListenerAccessControlStatusResponse create() {
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
    public SetListenerAccessControlStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetListenerAccessControlStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetListenerAccessControlStatusResponseBody body);

        @Override
        SetListenerAccessControlStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetListenerAccessControlStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetListenerAccessControlStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetListenerAccessControlStatusResponse response) {
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
        public Builder body(SetListenerAccessControlStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetListenerAccessControlStatusResponse build() {
            return new SetListenerAccessControlStatusResponse(this);
        } 

    } 

}