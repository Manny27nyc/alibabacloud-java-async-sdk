// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckMonitorAlertResponse} extends {@link TeaModel}
 *
 * <p>CheckMonitorAlertResponse</p>
 */
public class CheckMonitorAlertResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckMonitorAlertResponseBody body;

    private CheckMonitorAlertResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckMonitorAlertResponse create() {
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
    public CheckMonitorAlertResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckMonitorAlertResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckMonitorAlertResponseBody body);

        @Override
        CheckMonitorAlertResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckMonitorAlertResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckMonitorAlertResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckMonitorAlertResponse response) {
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
        public Builder body(CheckMonitorAlertResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckMonitorAlertResponse build() {
            return new CheckMonitorAlertResponse(this);
        } 

    } 

}
