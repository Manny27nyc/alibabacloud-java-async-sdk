// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallUserPluginsResponse} extends {@link TeaModel}
 *
 * <p>InstallUserPluginsResponse</p>
 */
public class InstallUserPluginsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InstallUserPluginsResponseBody body;

    private InstallUserPluginsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InstallUserPluginsResponse create() {
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
    public InstallUserPluginsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InstallUserPluginsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InstallUserPluginsResponseBody body);

        @Override
        InstallUserPluginsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InstallUserPluginsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InstallUserPluginsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InstallUserPluginsResponse response) {
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
        public Builder body(InstallUserPluginsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InstallUserPluginsResponse build() {
            return new InstallUserPluginsResponse(this);
        } 

    } 

}
