// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateAntiBruteForceRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateAntiBruteForceRuleResponse</p>
 */
public class CreateAntiBruteForceRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAntiBruteForceRuleResponseBody body;


    private CreateAntiBruteForceRuleResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAntiBruteForceRuleResponse create() {
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
    public CreateAntiBruteForceRuleResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private CreateAntiBruteForceRuleResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(CreateAntiBruteForceRuleResponse response) {
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
        public Builder body(CreateAntiBruteForceRuleResponseBody body) {
            this.body = body;
            return this;
        }

        public CreateAntiBruteForceRuleResponse build() {
            return new CreateAntiBruteForceRuleResponse(this);
        } 

    } 

}