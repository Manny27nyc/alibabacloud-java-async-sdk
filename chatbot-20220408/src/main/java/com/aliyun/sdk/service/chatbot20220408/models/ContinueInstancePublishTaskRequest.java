// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ContinueInstancePublishTaskRequest} extends {@link RequestModel}
 *
 * <p>ContinueInstancePublishTaskRequest</p>
 */
public class ContinueInstancePublishTaskRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ContinueInstancePublishTaskRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.id = builder.id;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContinueInstancePublishTaskRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ContinueInstancePublishTaskRequest, Builder> {
        private String agentKey; 
        private Long id; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ContinueInstancePublishTaskRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.id = request.id;
            this.instanceId = request.instanceId;
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
         * 任务ID
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ContinueInstancePublishTaskRequest build() {
            return new ContinueInstancePublishTaskRequest(this);
        } 

    } 

}
