// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateSCIMServerCredentialResponse} extends {@link TeaModel}
 *
 * <p>CreateSCIMServerCredentialResponse</p>
 */
public class CreateSCIMServerCredentialResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSCIMServerCredentialResponseBody body;


    private CreateSCIMServerCredentialResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSCIMServerCredentialResponse create() {
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
    public CreateSCIMServerCredentialResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private CreateSCIMServerCredentialResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(CreateSCIMServerCredentialResponse response) {
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
        public Builder body(CreateSCIMServerCredentialResponseBody body) {
            this.body = body;
            return this;
        }

        public CreateSCIMServerCredentialResponse build() {
            return new CreateSCIMServerCredentialResponse(this);
        } 

    } 

}