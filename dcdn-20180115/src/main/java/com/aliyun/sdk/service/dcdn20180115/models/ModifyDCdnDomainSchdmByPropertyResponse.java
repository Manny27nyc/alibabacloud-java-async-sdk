// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDCdnDomainSchdmByPropertyResponse} extends {@link TeaModel}
 *
 * <p>ModifyDCdnDomainSchdmByPropertyResponse</p>
 */
public class ModifyDCdnDomainSchdmByPropertyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDCdnDomainSchdmByPropertyResponseBody body;

    private ModifyDCdnDomainSchdmByPropertyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDCdnDomainSchdmByPropertyResponse create() {
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
    public ModifyDCdnDomainSchdmByPropertyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDCdnDomainSchdmByPropertyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDCdnDomainSchdmByPropertyResponseBody body);

        @Override
        ModifyDCdnDomainSchdmByPropertyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDCdnDomainSchdmByPropertyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDCdnDomainSchdmByPropertyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDCdnDomainSchdmByPropertyResponse response) {
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
        public Builder body(ModifyDCdnDomainSchdmByPropertyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDCdnDomainSchdmByPropertyResponse build() {
            return new ModifyDCdnDomainSchdmByPropertyResponse(this);
        } 

    } 

}
