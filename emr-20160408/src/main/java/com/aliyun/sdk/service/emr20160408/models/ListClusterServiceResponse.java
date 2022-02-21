// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterServiceResponse} extends {@link TeaModel}
 *
 * <p>ListClusterServiceResponse</p>
 */
public class ListClusterServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClusterServiceResponseBody body;

    private ListClusterServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClusterServiceResponse create() {
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
    public ListClusterServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClusterServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClusterServiceResponseBody body);

        @Override
        ListClusterServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClusterServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClusterServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClusterServiceResponse response) {
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
        public Builder body(ListClusterServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClusterServiceResponse build() {
            return new ListClusterServiceResponse(this);
        } 

    } 

}
