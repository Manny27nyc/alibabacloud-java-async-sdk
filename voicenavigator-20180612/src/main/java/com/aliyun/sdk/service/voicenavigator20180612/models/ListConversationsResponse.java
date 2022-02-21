// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConversationsResponse} extends {@link TeaModel}
 *
 * <p>ListConversationsResponse</p>
 */
public class ListConversationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListConversationsResponseBody body;

    private ListConversationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListConversationsResponse create() {
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
    public ListConversationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConversationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListConversationsResponseBody body);

        @Override
        ListConversationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConversationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListConversationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConversationsResponse response) {
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
        public Builder body(ListConversationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConversationsResponse build() {
            return new ListConversationsResponse(this);
        } 

    } 

}