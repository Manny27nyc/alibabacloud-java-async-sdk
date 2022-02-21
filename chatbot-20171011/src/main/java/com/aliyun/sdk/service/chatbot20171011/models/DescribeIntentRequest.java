// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIntentRequest} extends {@link RequestModel}
 *
 * <p>DescribeIntentRequest</p>
 */
public class DescribeIntentRequest extends Request {
    @Query
    @NameInMap("IntentId")
    @Validation(required = true)
    private Long intentId;

    private DescribeIntentRequest(Builder builder) {
        super(builder);
        this.intentId = builder.intentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIntentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return intentId
     */
    public Long getIntentId() {
        return this.intentId;
    }

    public static final class Builder extends Request.Builder<DescribeIntentRequest, Builder> {
        private Long intentId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIntentRequest response) {
            super(response);
            this.intentId = response.intentId;
        } 

        /**
         * IntentId.
         */
        public Builder intentId(Long intentId) {
            this.putQueryParameter("IntentId", intentId);
            this.intentId = intentId;
            return this;
        }

        @Override
        public DescribeIntentRequest build() {
            return new DescribeIntentRequest(this);
        } 

    } 

}