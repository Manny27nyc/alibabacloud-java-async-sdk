// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigWebCCTemplateResponse} extends {@link TeaModel}
 *
 * <p>ConfigWebCCTemplateResponse</p>
 */
public class ConfigWebCCTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigWebCCTemplateResponseBody body;

    private ConfigWebCCTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigWebCCTemplateResponse create() {
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
    public ConfigWebCCTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigWebCCTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigWebCCTemplateResponseBody body);

        @Override
        ConfigWebCCTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigWebCCTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigWebCCTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigWebCCTemplateResponse response) {
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
        public Builder body(ConfigWebCCTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigWebCCTemplateResponse build() {
            return new ConfigWebCCTemplateResponse(this);
        } 

    } 

}
