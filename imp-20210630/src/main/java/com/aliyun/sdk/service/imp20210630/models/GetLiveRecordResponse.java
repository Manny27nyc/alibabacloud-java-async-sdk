// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLiveRecordResponse} extends {@link TeaModel}
 *
 * <p>GetLiveRecordResponse</p>
 */
public class GetLiveRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLiveRecordResponseBody body;

    private GetLiveRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLiveRecordResponse create() {
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
    public GetLiveRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLiveRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLiveRecordResponseBody body);

        @Override
        GetLiveRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLiveRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLiveRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLiveRecordResponse response) {
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
        public Builder body(GetLiveRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLiveRecordResponse build() {
            return new GetLiveRecordResponse(this);
        } 

    } 

}
