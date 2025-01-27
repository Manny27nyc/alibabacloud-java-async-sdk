// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAliasRequest} extends {@link RequestModel}
 *
 * <p>CreateAliasRequest</p>
 */
public class CreateAliasRequest extends Request {
    @Path
    @NameInMap("serviceName")
    @Validation(required = true)
    private String serviceName;

    @Header
    @NameInMap("X-Fc-Account-Id")
    private String xFcAccountId;

    @Header
    @NameInMap("X-Fc-Date")
    private String xFcDate;

    @Header
    @NameInMap("X-Fc-Trace-Id")
    private String xFcTraceId;

    @Body
    @NameInMap("additionalVersionWeight")
    private java.util.Map < String, Float > additionalVersionWeight;

    @Body
    @NameInMap("aliasName")
    @Validation(required = true)
    private String aliasName;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("versionId")
    @Validation(required = true)
    private String versionId;

    private CreateAliasRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcDate = builder.xFcDate;
        this.xFcTraceId = builder.xFcTraceId;
        this.additionalVersionWeight = builder.additionalVersionWeight;
        this.aliasName = builder.aliasName;
        this.description = builder.description;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAliasRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return xFcAccountId
     */
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    /**
     * @return xFcDate
     */
    public String getXFcDate() {
        return this.xFcDate;
    }

    /**
     * @return xFcTraceId
     */
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

    /**
     * @return additionalVersionWeight
     */
    public java.util.Map < String, Float > getAdditionalVersionWeight() {
        return this.additionalVersionWeight;
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<CreateAliasRequest, Builder> {
        private String serviceName; 
        private String xFcAccountId; 
        private String xFcDate; 
        private String xFcTraceId; 
        private java.util.Map < String, Float > additionalVersionWeight; 
        private String aliasName; 
        private String description; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAliasRequest request) {
            super(request);
            this.serviceName = request.serviceName;
            this.xFcAccountId = request.xFcAccountId;
            this.xFcDate = request.xFcDate;
            this.xFcTraceId = request.xFcTraceId;
            this.additionalVersionWeight = request.additionalVersionWeight;
            this.aliasName = request.aliasName;
            this.description = request.description;
            this.versionId = request.versionId;
        } 

        /**
         * 服务名称
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * X-Fc-Account-Id.
         */
        public Builder xFcAccountId(String xFcAccountId) {
            this.putHeaderParameter("X-Fc-Account-Id", xFcAccountId);
            this.xFcAccountId = xFcAccountId;
            return this;
        }

        /**
         * X-Fc-Date.
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * X-Fc-Trace-Id.
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * 额外版本权重
         */
        public Builder additionalVersionWeight(java.util.Map < String, Float > additionalVersionWeight) {
            this.putBodyParameter("additionalVersionWeight", additionalVersionWeight);
            this.additionalVersionWeight = additionalVersionWeight;
            return this;
        }

        /**
         * 别名名称
         */
        public Builder aliasName(String aliasName) {
            this.putBodyParameter("aliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * 别名描述
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * 版本ID
         */
        public Builder versionId(String versionId) {
            this.putBodyParameter("versionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public CreateAliasRequest build() {
            return new CreateAliasRequest(this);
        } 

    } 

}
