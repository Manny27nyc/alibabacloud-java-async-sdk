// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainViewTopCostTimeResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainViewTopCostTimeResponse</p>
 */
public class DescribeDomainViewTopCostTimeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainViewTopCostTimeResponseBody body;

    private DescribeDomainViewTopCostTimeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainViewTopCostTimeResponse create() {
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
    public DescribeDomainViewTopCostTimeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainViewTopCostTimeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainViewTopCostTimeResponseBody body);

        @Override
        DescribeDomainViewTopCostTimeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainViewTopCostTimeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainViewTopCostTimeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainViewTopCostTimeResponse response) {
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
        public Builder body(DescribeDomainViewTopCostTimeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainViewTopCostTimeResponse build() {
            return new DescribeDomainViewTopCostTimeResponse(this);
        } 

    } 

}
