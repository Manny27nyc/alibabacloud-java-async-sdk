// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListObjectsResponse} extends {@link TeaModel}
 *
 * <p>ListObjectsResponse</p>
 */
public class ListObjectsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListObjectsResponseBody body;


    private ListObjectsResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListObjectsResponse create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > headers() {
        return this.headers;
    }

    /**
     * @return body
     */
    public ListObjectsResponseBody body() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ListObjectsResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ListObjectsResponse response) {
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
        public Builder body(ListObjectsResponseBody body) {
            this.body = body;
            return this;
        }

        public ListObjectsResponse build() {
            return new ListObjectsResponse(this);
        } 

    } 

}