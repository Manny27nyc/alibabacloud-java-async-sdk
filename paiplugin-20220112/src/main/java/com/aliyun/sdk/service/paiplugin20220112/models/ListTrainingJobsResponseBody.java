// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrainingJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrainingJobsResponseBody</p>
 */
public class ListTrainingJobsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    private ListTrainingJobsResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrainingJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private Integer errorCode; 
        private String errorMessage; 
        private String requestId; 

        /**
         * 返回数据。
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 错误码。
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息。
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTrainingJobsResponseBody build() {
            return new ListTrainingJobsResponseBody(this);
        } 

    } 

    public static class TrainingJobs extends TeaModel {
        @NameInMap("Algorithm")
        private String algorithm;

        @NameInMap("CampaignId")
        private String campaignId;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("DataPath")
        private String dataPath;

        @NameInMap("History")
        private String history;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("UpdatedTime")
        private String updatedTime;

        @NameInMap("UserConfig")
        private String userConfig;

        private TrainingJobs(Builder builder) {
            this.algorithm = builder.algorithm;
            this.campaignId = builder.campaignId;
            this.createdTime = builder.createdTime;
            this.dataPath = builder.dataPath;
            this.history = builder.history;
            this.id = builder.id;
            this.name = builder.name;
            this.remark = builder.remark;
            this.status = builder.status;
            this.updatedTime = builder.updatedTime;
            this.userConfig = builder.userConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrainingJobs create() {
            return builder().build();
        }

        /**
         * @return algorithm
         */
        public String getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return campaignId
         */
        public String getCampaignId() {
            return this.campaignId;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return dataPath
         */
        public String getDataPath() {
            return this.dataPath;
        }

        /**
         * @return history
         */
        public String getHistory() {
            return this.history;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return updatedTime
         */
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        /**
         * @return userConfig
         */
        public String getUserConfig() {
            return this.userConfig;
        }

        public static final class Builder {
            private String algorithm; 
            private String campaignId; 
            private String createdTime; 
            private String dataPath; 
            private String history; 
            private String id; 
            private String name; 
            private String remark; 
            private Integer status; 
            private String updatedTime; 
            private String userConfig; 

            /**
             * 关联算法Id。
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * 关联运营活动Id。
             */
            public Builder campaignId(String campaignId) {
                this.campaignId = campaignId;
                return this;
            }

            /**
             * 创建时间 (UTC+8)。
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * 训练数据路径。
             */
            public Builder dataPath(String dataPath) {
                this.dataPath = dataPath;
                return this;
            }

            /**
             * 训练任务日志。
             */
            public Builder history(String history) {
                this.history = history;
                return this;
            }

            /**
             * 训练任务Id。
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 训练任务名称。
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 备注。
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * 训练任务状态。
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * 更新时间 (UTC+8)。
             */
            public Builder updatedTime(String updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * 用户配置。
             */
            public Builder userConfig(String userConfig) {
                this.userConfig = userConfig;
                return this;
            }

            public TrainingJobs build() {
                return new TrainingJobs(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("TrainingJobs")
        private java.util.List < TrainingJobs> trainingJobs;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.trainingJobs = builder.trainingJobs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return trainingJobs
         */
        public java.util.List < TrainingJobs> getTrainingJobs() {
            return this.trainingJobs;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 
            private java.util.List < TrainingJobs> trainingJobs; 

            /**
             * 分页数，从1开始，默认为1。
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * 分页大小，默认为10。
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * 总训练任务数量。
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * 训练任务列表。
             */
            public Builder trainingJobs(java.util.List < TrainingJobs> trainingJobs) {
                this.trainingJobs = trainingJobs;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}