// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScaleClusterResponseBody} extends {@link TeaModel}
 *
 * <p>ScaleClusterResponseBody</p>
 */
public class ScaleClusterResponseBody extends TeaModel {
    @NameInMap("cluster_id")
    private String clusterId;

    @NameInMap("request_id")
    private String requestId;

    @NameInMap("task_id")
    private String taskId;

    private ScaleClusterResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScaleClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String clusterId; 
        private String requestId; 
        private String taskId; 

        /**
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 任务ID。
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public ScaleClusterResponseBody build() {
            return new ScaleClusterResponseBody(this);
        } 

    } 

}