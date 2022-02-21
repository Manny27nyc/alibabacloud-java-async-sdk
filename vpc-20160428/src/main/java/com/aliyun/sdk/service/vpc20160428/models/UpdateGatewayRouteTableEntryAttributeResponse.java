// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayRouteTableEntryAttributeResponse} extends {@link TeaModel}
 *
 * <p>UpdateGatewayRouteTableEntryAttributeResponse</p>
 */
public class UpdateGatewayRouteTableEntryAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateGatewayRouteTableEntryAttributeResponseBody body;

    private UpdateGatewayRouteTableEntryAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateGatewayRouteTableEntryAttributeResponse create() {
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
    public UpdateGatewayRouteTableEntryAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateGatewayRouteTableEntryAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateGatewayRouteTableEntryAttributeResponseBody body);

        @Override
        UpdateGatewayRouteTableEntryAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateGatewayRouteTableEntryAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateGatewayRouteTableEntryAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateGatewayRouteTableEntryAttributeResponse response) {
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
        public Builder body(UpdateGatewayRouteTableEntryAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateGatewayRouteTableEntryAttributeResponse build() {
            return new UpdateGatewayRouteTableEntryAttributeResponse(this);
        } 

    } 

}