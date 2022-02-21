// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFlowJobResponse} extends {@link TeaModel}
 *
 * <p>CreateFlowJobResponse</p>
 */
public class CreateFlowJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFlowJobResponseBody body;

    private CreateFlowJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFlowJobResponse create() {
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
    public CreateFlowJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFlowJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFlowJobResponseBody body);

        @Override
        CreateFlowJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFlowJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFlowJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFlowJobResponse response) {
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
        public Builder body(CreateFlowJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFlowJobResponse build() {
            return new CreateFlowJobResponse(this);
        } 

    } 

}
