// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLgfRequest} extends {@link RequestModel}
 *
 * <p>UpdateLgfRequest</p>
 */
public class UpdateLgfRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("LgfDefinition")
    @Validation(required = true)
    private LgfDefinition lgfDefinition;

    @Query
    @NameInMap("LgfId")
    @Validation(required = true)
    private Long lgfId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private UpdateLgfRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.instanceId = builder.instanceId;
        this.lgfDefinition = builder.lgfDefinition;
        this.lgfId = builder.lgfId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLgfRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lgfDefinition
     */
    public LgfDefinition getLgfDefinition() {
        return this.lgfDefinition;
    }

    /**
     * @return lgfId
     */
    public Long getLgfId() {
        return this.lgfId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateLgfRequest, Builder> {
        private String agentKey; 
        private String instanceId; 
        private LgfDefinition lgfDefinition; 
        private Long lgfId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLgfRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.instanceId = request.instanceId;
            this.lgfDefinition = request.lgfDefinition;
            this.lgfId = request.lgfId;
            this.regionId = request.regionId;
        } 

        /**
         * 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * 机器人ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LgfDefinition.
         */
        public Builder lgfDefinition(LgfDefinition lgfDefinition) {
            String lgfDefinitionShrink = shrink(lgfDefinition, "LgfDefinition", "json");
            this.putQueryParameter("LgfDefinition", lgfDefinitionShrink);
            this.lgfDefinition = lgfDefinition;
            return this;
        }

        /**
         * LGF ID
         */
        public Builder lgfId(Long lgfId) {
            this.putQueryParameter("LgfId", lgfId);
            this.lgfId = lgfId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateLgfRequest build() {
            return new UpdateLgfRequest(this);
        } 

    } 

    public static class LgfDefinition extends TeaModel {
        @NameInMap("IntentId")
        @Validation(required = true)
        private Long intentId;

        @NameInMap("RuleText")
        @Validation(required = true)
        private String ruleText;

        private LgfDefinition(Builder builder) {
            this.intentId = builder.intentId;
            this.ruleText = builder.ruleText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LgfDefinition create() {
            return builder().build();
        }

        /**
         * @return intentId
         */
        public Long getIntentId() {
            return this.intentId;
        }

        /**
         * @return ruleText
         */
        public String getRuleText() {
            return this.ruleText;
        }

        public static final class Builder {
            private Long intentId; 
            private String ruleText; 

            /**
             * 意图ID
             */
            public Builder intentId(Long intentId) {
                this.intentId = intentId;
                return this;
            }

            /**
             * LGF配置
             */
            public Builder ruleText(String ruleText) {
                this.ruleText = ruleText;
                return this;
            }

            public LgfDefinition build() {
                return new LgfDefinition(this);
            } 

        } 

    }
}
