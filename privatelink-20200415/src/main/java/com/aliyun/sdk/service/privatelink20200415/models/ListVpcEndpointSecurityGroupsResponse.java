// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcEndpointSecurityGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointSecurityGroupsResponse</p>
 */
public class ListVpcEndpointSecurityGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVpcEndpointSecurityGroupsResponseBody body;

    private ListVpcEndpointSecurityGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVpcEndpointSecurityGroupsResponse create() {
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
    public ListVpcEndpointSecurityGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVpcEndpointSecurityGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVpcEndpointSecurityGroupsResponseBody body);

        @Override
        ListVpcEndpointSecurityGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVpcEndpointSecurityGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVpcEndpointSecurityGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVpcEndpointSecurityGroupsResponse response) {
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
        public Builder body(ListVpcEndpointSecurityGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVpcEndpointSecurityGroupsResponse build() {
            return new ListVpcEndpointSecurityGroupsResponse(this);
        } 

    } 

}
