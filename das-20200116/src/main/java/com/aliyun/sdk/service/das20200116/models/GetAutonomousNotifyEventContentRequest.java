// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAutonomousNotifyEventContentRequest} extends {@link RequestModel}
 *
 * <p>GetAutonomousNotifyEventContentRequest</p>
 */
public class GetAutonomousNotifyEventContentRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("SpanId")
    private String spanId;

    @Query
    @NameInMap("__context")
    private String context;

    private GetAutonomousNotifyEventContentRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.spanId = builder.spanId;
        this.context = builder.context;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutonomousNotifyEventContentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return spanId
     */
    public String getSpanId() {
        return this.spanId;
    }

    /**
     * @return context
     */
    public String getContext() {
        return this.context;
    }

    public static final class Builder extends Request.Builder<GetAutonomousNotifyEventContentRequest, Builder> {
        private String instanceId; 
        private String spanId; 
        private String context; 

        private Builder() {
            super();
        } 

        private Builder(GetAutonomousNotifyEventContentRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.spanId = response.spanId;
            this.context = response.context;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SpanId.
         */
        public Builder spanId(String spanId) {
            this.putQueryParameter("SpanId", spanId);
            this.spanId = spanId;
            return this;
        }

        /**
         * __context.
         */
        public Builder context(String context) {
            this.putQueryParameter("__context", context);
            this.context = context;
            return this;
        }

        @Override
        public GetAutonomousNotifyEventContentRequest build() {
            return new GetAutonomousNotifyEventContentRequest(this);
        } 

    } 

}