// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDcdnDomainCertificateResponse} extends {@link TeaModel}
 *
 * <p>SetDcdnDomainCertificateResponse</p>
 */
public class SetDcdnDomainCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDcdnDomainCertificateResponseBody body;

    private SetDcdnDomainCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDcdnDomainCertificateResponse create() {
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
    public SetDcdnDomainCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDcdnDomainCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDcdnDomainCertificateResponseBody body);

        @Override
        SetDcdnDomainCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDcdnDomainCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDcdnDomainCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDcdnDomainCertificateResponse response) {
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
        public Builder body(SetDcdnDomainCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDcdnDomainCertificateResponse build() {
            return new SetDcdnDomainCertificateResponse(this);
        } 

    } 

}
