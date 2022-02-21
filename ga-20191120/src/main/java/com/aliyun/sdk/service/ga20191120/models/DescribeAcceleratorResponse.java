// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAcceleratorResponse} extends {@link TeaModel}
 *
 * <p>DescribeAcceleratorResponse</p>
 */
public class DescribeAcceleratorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAcceleratorResponseBody body;

    private DescribeAcceleratorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAcceleratorResponse create() {
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
    public DescribeAcceleratorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAcceleratorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAcceleratorResponseBody body);

        @Override
        DescribeAcceleratorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAcceleratorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAcceleratorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAcceleratorResponse response) {
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
        public Builder body(DescribeAcceleratorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAcceleratorResponse build() {
            return new DescribeAcceleratorResponse(this);
        } 

    } 

}