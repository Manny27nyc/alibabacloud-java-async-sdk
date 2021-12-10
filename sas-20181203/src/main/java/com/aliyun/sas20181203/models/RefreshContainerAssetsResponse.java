// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link RefreshContainerAssetsResponse} extends {@link TeaModel}
 *
 * <p>RefreshContainerAssetsResponse</p>
 */
public class RefreshContainerAssetsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RefreshContainerAssetsResponseBody body;


    private RefreshContainerAssetsResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshContainerAssetsResponse create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public RefreshContainerAssetsResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private RefreshContainerAssetsResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(RefreshContainerAssetsResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * <p>headers.</p>
         */
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>body.</p>
         */
        public Builder body(RefreshContainerAssetsResponseBody body) {
            this.body = body;
            return this;
        }

        public RefreshContainerAssetsResponse build() {
            return new RefreshContainerAssetsResponse(this);
        } 

    } 

}