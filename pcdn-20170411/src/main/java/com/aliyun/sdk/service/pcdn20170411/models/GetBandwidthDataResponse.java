// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBandwidthDataResponse} extends {@link TeaModel}
 *
 * <p>GetBandwidthDataResponse</p>
 */
public class GetBandwidthDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBandwidthDataResponseBody body;

    private GetBandwidthDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBandwidthDataResponse create() {
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
    public GetBandwidthDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBandwidthDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBandwidthDataResponseBody body);

        @Override
        GetBandwidthDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBandwidthDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBandwidthDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBandwidthDataResponse response) {
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
        public Builder body(GetBandwidthDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBandwidthDataResponse build() {
            return new GetBandwidthDataResponse(this);
        } 

    } 

}
