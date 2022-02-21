// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKeyVersionResponse} extends {@link TeaModel}
 *
 * <p>DescribeKeyVersionResponse</p>
 */
public class DescribeKeyVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeKeyVersionResponseBody body;

    private DescribeKeyVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeKeyVersionResponse create() {
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
    public DescribeKeyVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeKeyVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeKeyVersionResponseBody body);

        @Override
        DescribeKeyVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeKeyVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeKeyVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeKeyVersionResponse response) {
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
        public Builder body(DescribeKeyVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeKeyVersionResponse build() {
            return new DescribeKeyVersionResponse(this);
        } 

    } 

}
