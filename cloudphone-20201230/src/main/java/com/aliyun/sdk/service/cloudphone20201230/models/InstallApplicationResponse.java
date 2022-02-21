// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallApplicationResponse} extends {@link TeaModel}
 *
 * <p>InstallApplicationResponse</p>
 */
public class InstallApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InstallApplicationResponseBody body;

    private InstallApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InstallApplicationResponse create() {
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
    public InstallApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InstallApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InstallApplicationResponseBody body);

        @Override
        InstallApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InstallApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InstallApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InstallApplicationResponse response) {
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
        public Builder body(InstallApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InstallApplicationResponse build() {
            return new InstallApplicationResponse(this);
        } 

    } 

}
