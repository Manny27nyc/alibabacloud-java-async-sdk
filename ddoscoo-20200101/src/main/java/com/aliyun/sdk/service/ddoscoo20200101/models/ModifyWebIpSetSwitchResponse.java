// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebIpSetSwitchResponse} extends {@link TeaModel}
 *
 * <p>ModifyWebIpSetSwitchResponse</p>
 */
public class ModifyWebIpSetSwitchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyWebIpSetSwitchResponseBody body;

    private ModifyWebIpSetSwitchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyWebIpSetSwitchResponse create() {
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
    public ModifyWebIpSetSwitchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyWebIpSetSwitchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyWebIpSetSwitchResponseBody body);

        @Override
        ModifyWebIpSetSwitchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyWebIpSetSwitchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyWebIpSetSwitchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyWebIpSetSwitchResponse response) {
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
        public Builder body(ModifyWebIpSetSwitchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyWebIpSetSwitchResponse build() {
            return new ModifyWebIpSetSwitchResponse(this);
        } 

    } 

}
