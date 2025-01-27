// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryComplexJobListResponse} extends {@link TeaModel}
 *
 * <p>QueryComplexJobListResponse</p>
 */
public class QueryComplexJobListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryComplexJobListResponseBody body;

    private QueryComplexJobListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryComplexJobListResponse create() {
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
    public QueryComplexJobListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryComplexJobListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryComplexJobListResponseBody body);

        @Override
        QueryComplexJobListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryComplexJobListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryComplexJobListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryComplexJobListResponse response) {
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
        public Builder body(QueryComplexJobListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryComplexJobListResponse build() {
            return new QueryComplexJobListResponse(this);
        } 

    } 

}
