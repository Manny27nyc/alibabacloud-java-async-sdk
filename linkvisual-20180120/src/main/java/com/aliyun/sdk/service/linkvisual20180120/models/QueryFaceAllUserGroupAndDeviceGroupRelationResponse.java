// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFaceAllUserGroupAndDeviceGroupRelationResponse} extends {@link TeaModel}
 *
 * <p>QueryFaceAllUserGroupAndDeviceGroupRelationResponse</p>
 */
public class QueryFaceAllUserGroupAndDeviceGroupRelationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody body;

    private QueryFaceAllUserGroupAndDeviceGroupRelationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryFaceAllUserGroupAndDeviceGroupRelationResponse create() {
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
    public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryFaceAllUserGroupAndDeviceGroupRelationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody body);

        @Override
        QueryFaceAllUserGroupAndDeviceGroupRelationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryFaceAllUserGroupAndDeviceGroupRelationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryFaceAllUserGroupAndDeviceGroupRelationResponse response) {
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
        public Builder body(QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryFaceAllUserGroupAndDeviceGroupRelationResponse build() {
            return new QueryFaceAllUserGroupAndDeviceGroupRelationResponse(this);
        } 

    } 

}