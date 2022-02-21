// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDcdnDomainResponse} extends {@link TeaModel}
 *
 * <p>StopDcdnDomainResponse</p>
 */
public class StopDcdnDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopDcdnDomainResponseBody body;

    private StopDcdnDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopDcdnDomainResponse create() {
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
    public StopDcdnDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopDcdnDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopDcdnDomainResponseBody body);

        @Override
        StopDcdnDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopDcdnDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopDcdnDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopDcdnDomainResponse response) {
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
        public Builder body(StopDcdnDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopDcdnDomainResponse build() {
            return new StopDcdnDomainResponse(this);
        } 

    } 

}
