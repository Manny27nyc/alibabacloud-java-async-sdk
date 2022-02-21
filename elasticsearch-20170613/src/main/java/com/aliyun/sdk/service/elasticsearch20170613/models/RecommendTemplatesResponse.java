// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecommendTemplatesResponse} extends {@link TeaModel}
 *
 * <p>RecommendTemplatesResponse</p>
 */
public class RecommendTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecommendTemplatesResponseBody body;

    private RecommendTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecommendTemplatesResponse create() {
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
    public RecommendTemplatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecommendTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecommendTemplatesResponseBody body);

        @Override
        RecommendTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecommendTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecommendTemplatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecommendTemplatesResponse response) {
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
        public Builder body(RecommendTemplatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecommendTemplatesResponse build() {
            return new RecommendTemplatesResponse(this);
        } 

    } 

}
