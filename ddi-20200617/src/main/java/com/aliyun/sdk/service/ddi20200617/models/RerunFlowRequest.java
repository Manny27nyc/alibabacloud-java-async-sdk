// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RerunFlowRequest} extends {@link RequestModel}
 *
 * <p>RerunFlowRequest</p>
 */
public class RerunFlowRequest extends Request {
    @Query
    @NameInMap("FlowInstanceId")
    @Validation(required = true)
    private String flowInstanceId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("ReRunFail")
    private Boolean reRunFail;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private RerunFlowRequest(Builder builder) {
        super(builder);
        this.flowInstanceId = builder.flowInstanceId;
        this.projectId = builder.projectId;
        this.reRunFail = builder.reRunFail;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RerunFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flowInstanceId
     */
    public String getFlowInstanceId() {
        return this.flowInstanceId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return reRunFail
     */
    public Boolean getReRunFail() {
        return this.reRunFail;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RerunFlowRequest, Builder> {
        private String flowInstanceId; 
        private String projectId; 
        private Boolean reRunFail; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RerunFlowRequest response) {
            super(response);
            this.flowInstanceId = response.flowInstanceId;
            this.projectId = response.projectId;
            this.reRunFail = response.reRunFail;
            this.regionId = response.regionId;
        } 

        /**
         * 工作流实例ID。您可以调用ListFlowInstance查看工作流实例ID。
         */
        public Builder flowInstanceId(String flowInstanceId) {
            this.putQueryParameter("FlowInstanceId", flowInstanceId);
            this.flowInstanceId = flowInstanceId;
            return this;
        }

        /**
         * 项目ID。您可以调用ListFlowProject查看项目的ID。
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * 是否只重试失败节点。
         */
        public Builder reRunFail(Boolean reRunFail) {
            this.putQueryParameter("ReRunFail", reRunFail);
            this.reRunFail = reRunFail;
            return this;
        }

        /**
         * 地域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RerunFlowRequest build() {
            return new RerunFlowRequest(this);
        } 

    } 

}