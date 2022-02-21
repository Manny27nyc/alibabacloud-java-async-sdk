// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCacheAnalysisJobResponse} extends {@link TeaModel}
 *
 * <p>DescribeCacheAnalysisJobResponse</p>
 */
public class DescribeCacheAnalysisJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCacheAnalysisJobResponseBody body;

    private DescribeCacheAnalysisJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCacheAnalysisJobResponse create() {
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
    public DescribeCacheAnalysisJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCacheAnalysisJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCacheAnalysisJobResponseBody body);

        @Override
        DescribeCacheAnalysisJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCacheAnalysisJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCacheAnalysisJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCacheAnalysisJobResponse response) {
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
        public Builder body(DescribeCacheAnalysisJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCacheAnalysisJobResponse build() {
            return new DescribeCacheAnalysisJobResponse(this);
        } 

    } 

}
