// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp20180408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IEResponse} extends {@link TeaModel}
 *
 * <p>IEResponse</p>
 */
public class IEResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private IEResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static IEResponse create() {
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

    public interface Builder extends Response.Builder<IEResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        IEResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<IEResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(IEResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public IEResponse build() {
            return new IEResponse(this);
        } 

    } 

}
