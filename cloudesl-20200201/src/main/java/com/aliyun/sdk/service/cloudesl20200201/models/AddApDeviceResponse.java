// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddApDeviceResponse} extends {@link TeaModel}
 *
 * <p>AddApDeviceResponse</p>
 */
public class AddApDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddApDeviceResponseBody body;

    private AddApDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddApDeviceResponse create() {
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
    public AddApDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddApDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddApDeviceResponseBody body);

        @Override
        AddApDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddApDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddApDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddApDeviceResponse response) {
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
        public Builder body(AddApDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddApDeviceResponse build() {
            return new AddApDeviceResponse(this);
        } 

    } 

}
