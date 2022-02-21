// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcEndpointServicesByEndUserResponse} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointServicesByEndUserResponse</p>
 */
public class ListVpcEndpointServicesByEndUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVpcEndpointServicesByEndUserResponseBody body;

    private ListVpcEndpointServicesByEndUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVpcEndpointServicesByEndUserResponse create() {
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
    public ListVpcEndpointServicesByEndUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVpcEndpointServicesByEndUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVpcEndpointServicesByEndUserResponseBody body);

        @Override
        ListVpcEndpointServicesByEndUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVpcEndpointServicesByEndUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVpcEndpointServicesByEndUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVpcEndpointServicesByEndUserResponse response) {
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
        public Builder body(ListVpcEndpointServicesByEndUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVpcEndpointServicesByEndUserResponse build() {
            return new ListVpcEndpointServicesByEndUserResponse(this);
        } 

    } 

}
