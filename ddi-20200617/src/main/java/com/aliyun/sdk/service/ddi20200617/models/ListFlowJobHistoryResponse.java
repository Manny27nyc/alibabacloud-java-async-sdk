// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowJobHistoryResponse} extends {@link TeaModel}
 *
 * <p>ListFlowJobHistoryResponse</p>
 */
public class ListFlowJobHistoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFlowJobHistoryResponseBody body;

    private ListFlowJobHistoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFlowJobHistoryResponse create() {
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
    public ListFlowJobHistoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFlowJobHistoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFlowJobHistoryResponseBody body);

        @Override
        ListFlowJobHistoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFlowJobHistoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFlowJobHistoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFlowJobHistoryResponse response) {
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
        public Builder body(ListFlowJobHistoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFlowJobHistoryResponse build() {
            return new ListFlowJobHistoryResponse(this);
        } 

    } 

}
