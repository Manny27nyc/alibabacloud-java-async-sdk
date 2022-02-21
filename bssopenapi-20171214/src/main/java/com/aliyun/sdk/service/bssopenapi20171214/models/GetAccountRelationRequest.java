// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountRelationRequest} extends {@link RequestModel}
 *
 * <p>GetAccountRelationRequest</p>
 */
public class GetAccountRelationRequest extends Request {
    @Query
    @NameInMap("RelationId")
    private Long relationId;

    @Query
    @NameInMap("RequestId")
    private String requestId;

    private GetAccountRelationRequest(Builder builder) {
        super(builder);
        this.relationId = builder.relationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountRelationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return relationId
     */
    public Long getRelationId() {
        return this.relationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder extends Request.Builder<GetAccountRelationRequest, Builder> {
        private Long relationId; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(GetAccountRelationRequest response) {
            super(response);
            this.relationId = response.relationId;
            this.requestId = response.requestId;
        } 

        /**
         * relationId
         */
        public Builder relationId(Long relationId) {
            this.putQueryParameter("RelationId", relationId);
            this.relationId = relationId;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        @Override
        public GetAccountRelationRequest build() {
            return new GetAccountRelationRequest(this);
        } 

    } 

}