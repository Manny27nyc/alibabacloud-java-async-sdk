// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListBucketInventoryResponse} extends {@link TeaModel}
 *
 * <p>ListBucketInventoryResponse</p>
 */
public class ListBucketInventoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBucketInventoryResponseBody body;


    private ListBucketInventoryResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBucketInventoryResponse create() {
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
    public ListBucketInventoryResponseBody body() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ListBucketInventoryResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ListBucketInventoryResponse response) {
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
        public Builder body(ListBucketInventoryResponseBody body) {
            this.body = body;
            return this;
        }

        public ListBucketInventoryResponse build() {
            return new ListBucketInventoryResponse(this);
        } 

    } 

}