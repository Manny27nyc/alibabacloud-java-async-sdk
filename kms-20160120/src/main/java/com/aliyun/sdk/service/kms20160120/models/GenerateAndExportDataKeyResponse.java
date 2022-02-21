// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateAndExportDataKeyResponse} extends {@link TeaModel}
 *
 * <p>GenerateAndExportDataKeyResponse</p>
 */
public class GenerateAndExportDataKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateAndExportDataKeyResponseBody body;

    private GenerateAndExportDataKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateAndExportDataKeyResponse create() {
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
    public GenerateAndExportDataKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateAndExportDataKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateAndExportDataKeyResponseBody body);

        @Override
        GenerateAndExportDataKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateAndExportDataKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateAndExportDataKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateAndExportDataKeyResponse response) {
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
        public Builder body(GenerateAndExportDataKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateAndExportDataKeyResponse build() {
            return new GenerateAndExportDataKeyResponse(this);
        } 

    } 

}
