// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEndpointSwitchTaskResponse} extends {@link TeaModel}
 *
 * <p>GetEndpointSwitchTaskResponse</p>
 */
public class GetEndpointSwitchTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEndpointSwitchTaskResponseBody body;

    private GetEndpointSwitchTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEndpointSwitchTaskResponse create() {
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
    public GetEndpointSwitchTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEndpointSwitchTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEndpointSwitchTaskResponseBody body);

        @Override
        GetEndpointSwitchTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEndpointSwitchTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEndpointSwitchTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEndpointSwitchTaskResponse response) {
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
        public Builder body(GetEndpointSwitchTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEndpointSwitchTaskResponse build() {
            return new GetEndpointSwitchTaskResponse(this);
        } 

    } 

}
