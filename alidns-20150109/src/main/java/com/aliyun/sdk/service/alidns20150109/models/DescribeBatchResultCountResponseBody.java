// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBatchResultCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBatchResultCountResponseBody</p>
 */
public class DescribeBatchResultCountResponseBody extends TeaModel {
    @NameInMap("BatchType")
    private String batchType;

    @NameInMap("FailedCount")
    private Integer failedCount;

    @NameInMap("Reason")
    private String reason;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private Integer status;

    @NameInMap("SuccessCount")
    private Integer successCount;

    @NameInMap("TaskId")
    private Long taskId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeBatchResultCountResponseBody(Builder builder) {
        this.batchType = builder.batchType;
        this.failedCount = builder.failedCount;
        this.reason = builder.reason;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.successCount = builder.successCount;
        this.taskId = builder.taskId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBatchResultCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return batchType
     */
    public String getBatchType() {
        return this.batchType;
    }

    /**
     * @return failedCount
     */
    public Integer getFailedCount() {
        return this.failedCount;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return successCount
     */
    public Integer getSuccessCount() {
        return this.successCount;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String batchType; 
        private Integer failedCount; 
        private String reason; 
        private String requestId; 
        private Integer status; 
        private Integer successCount; 
        private Long taskId; 
        private Integer totalCount; 

        /**
         * BatchType.
         */
        public Builder batchType(String batchType) {
            this.batchType = batchType;
            return this;
        }

        /**
         * FailedCount.
         */
        public Builder failedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * SuccessCount.
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeBatchResultCountResponseBody build() {
            return new DescribeBatchResultCountResponseBody(this);
        } 

    } 

}