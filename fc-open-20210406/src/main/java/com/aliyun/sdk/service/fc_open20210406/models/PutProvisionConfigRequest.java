// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutProvisionConfigRequest} extends {@link RequestModel}
 *
 * <p>PutProvisionConfigRequest</p>
 */
public class PutProvisionConfigRequest extends Request {
    @Path
    @NameInMap("serviceName")
    @Validation(required = true)
    private String serviceName;

    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Host
    @NameInMap("AccountID")
    private String accountID;

    @Header
    @NameInMap("X-Fc-Account-Id")
    private String xFcAccountId;

    @Header
    @NameInMap("X-Fc-Code-Checksum")
    private String xFcCodeChecksum;

    @Header
    @NameInMap("X-Fc-Date")
    private String xFcDate;

    @Header
    @NameInMap("X-Fc-Invocation-Type")
    private String xFcInvocationType;

    @Header
    @NameInMap("X-Fc-Log-Type")
    private String xFcLogType;

    @Header
    @NameInMap("X-Fc-Trace-Id")
    private String xFcTraceId;

    @Body
    @NameInMap("scheduledActions")
    private java.util.List < ScheduledActions > scheduledActions;

    @Body
    @NameInMap("target")
    @Validation(required = true)
    private Long target;

    @Body
    @NameInMap("targetTrackingPolicies")
    private java.util.List < TargetTrackingPolicies > targetTrackingPolicies;

    @Query
    @NameInMap("qualifier")
    @Validation(required = true)
    private String qualifier;

    private PutProvisionConfigRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.functionName = builder.functionName;
        this.accountID = builder.accountID;
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcCodeChecksum = builder.xFcCodeChecksum;
        this.xFcDate = builder.xFcDate;
        this.xFcInvocationType = builder.xFcInvocationType;
        this.xFcLogType = builder.xFcLogType;
        this.xFcTraceId = builder.xFcTraceId;
        this.scheduledActions = builder.scheduledActions;
        this.target = builder.target;
        this.targetTrackingPolicies = builder.targetTrackingPolicies;
        this.qualifier = builder.qualifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutProvisionConfigRequest create() {
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
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return accountID
     */
    public String getAccountID() {
        return this.accountID;
    }

    /**
     * @return xFcAccountId
     */
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    /**
     * @return xFcCodeChecksum
     */
    public String getXFcCodeChecksum() {
        return this.xFcCodeChecksum;
    }

    /**
     * @return xFcDate
     */
    public String getXFcDate() {
        return this.xFcDate;
    }

    /**
     * @return xFcInvocationType
     */
    public String getXFcInvocationType() {
        return this.xFcInvocationType;
    }

    /**
     * @return xFcLogType
     */
    public String getXFcLogType() {
        return this.xFcLogType;
    }

    /**
     * @return xFcTraceId
     */
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

    /**
     * @return scheduledActions
     */
    public java.util.List < ScheduledActions > getScheduledActions() {
        return this.scheduledActions;
    }

    /**
     * @return target
     */
    public Long getTarget() {
        return this.target;
    }

    /**
     * @return targetTrackingPolicies
     */
    public java.util.List < TargetTrackingPolicies > getTargetTrackingPolicies() {
        return this.targetTrackingPolicies;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    public static final class Builder extends Request.Builder<PutProvisionConfigRequest, Builder> {
        private String serviceName; 
        private String functionName; 
        private String accountID; 
        private String xFcAccountId; 
        private String xFcCodeChecksum; 
        private String xFcDate; 
        private String xFcInvocationType; 
        private String xFcLogType; 
        private String xFcTraceId; 
        private java.util.List < ScheduledActions > scheduledActions; 
        private Long target; 
        private java.util.List < TargetTrackingPolicies > targetTrackingPolicies; 
        private String qualifier; 

        private Builder() {
            super();
        } 

        private Builder(PutProvisionConfigRequest response) {
            super(response);
            this.serviceName = response.serviceName;
            this.functionName = response.functionName;
            this.accountID = response.accountID;
            this.xFcAccountId = response.xFcAccountId;
            this.xFcCodeChecksum = response.xFcCodeChecksum;
            this.xFcDate = response.xFcDate;
            this.xFcInvocationType = response.xFcInvocationType;
            this.xFcLogType = response.xFcLogType;
            this.xFcTraceId = response.xFcTraceId;
            this.scheduledActions = response.scheduledActions;
            this.target = response.target;
            this.targetTrackingPolicies = response.targetTrackingPolicies;
            this.qualifier = response.qualifier;
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
         * 函数名称
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * AccountID.
         */
        public Builder accountID(String accountID) {
            this.putHostParameter("AccountID", accountID);
            this.accountID = accountID;
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
         * X-Fc-Code-Checksum.
         */
        public Builder xFcCodeChecksum(String xFcCodeChecksum) {
            this.putHeaderParameter("X-Fc-Code-Checksum", xFcCodeChecksum);
            this.xFcCodeChecksum = xFcCodeChecksum;
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
         * X-Fc-Invocation-Type.
         */
        public Builder xFcInvocationType(String xFcInvocationType) {
            this.putHeaderParameter("X-Fc-Invocation-Type", xFcInvocationType);
            this.xFcInvocationType = xFcInvocationType;
            return this;
        }

        /**
         * X-Fc-Log-Type.
         */
        public Builder xFcLogType(String xFcLogType) {
            this.putHeaderParameter("X-Fc-Log-Type", xFcLogType);
            this.xFcLogType = xFcLogType;
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
         * 定时策略配置
         */
        public Builder scheduledActions(java.util.List < ScheduledActions > scheduledActions) {
            this.putBodyParameter("scheduledActions", scheduledActions);
            this.scheduledActions = scheduledActions;
            return this;
        }

        /**
         * 预留的目标资源个数
         */
        public Builder target(Long target) {
            this.putBodyParameter("target", target);
            this.target = target;
            return this;
        }

        /**
         * 指标追踪伸缩策略配置
         */
        public Builder targetTrackingPolicies(java.util.List < TargetTrackingPolicies > targetTrackingPolicies) {
            this.putBodyParameter("targetTrackingPolicies", targetTrackingPolicies);
            this.targetTrackingPolicies = targetTrackingPolicies;
            return this;
        }

        /**
         * 别名名称
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        @Override
        public PutProvisionConfigRequest build() {
            return new PutProvisionConfigRequest(this);
        } 

    } 

}