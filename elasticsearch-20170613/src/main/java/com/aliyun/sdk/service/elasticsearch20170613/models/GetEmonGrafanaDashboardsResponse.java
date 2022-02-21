// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEmonGrafanaDashboardsResponse} extends {@link TeaModel}
 *
 * <p>GetEmonGrafanaDashboardsResponse</p>
 */
public class GetEmonGrafanaDashboardsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEmonGrafanaDashboardsResponseBody body;

    private GetEmonGrafanaDashboardsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEmonGrafanaDashboardsResponse create() {
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
    public GetEmonGrafanaDashboardsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEmonGrafanaDashboardsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEmonGrafanaDashboardsResponseBody body);

        @Override
        GetEmonGrafanaDashboardsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEmonGrafanaDashboardsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEmonGrafanaDashboardsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEmonGrafanaDashboardsResponse response) {
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
        public Builder body(GetEmonGrafanaDashboardsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEmonGrafanaDashboardsResponse build() {
            return new GetEmonGrafanaDashboardsResponse(this);
        } 

    } 

}
