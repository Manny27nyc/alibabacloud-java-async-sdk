// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckScaleOutBalancedResponseBody} extends {@link TeaModel}
 *
 * <p>CheckScaleOutBalancedResponseBody</p>
 */
public class CheckScaleOutBalancedResponseBody extends TeaModel {
    @NameInMap("CheckCode")
    private String checkCode;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TableDetails")
    private TableDetails tableDetails;

    @NameInMap("TimeDuration")
    private String timeDuration;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private CheckScaleOutBalancedResponseBody(Builder builder) {
        this.checkCode = builder.checkCode;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.tableDetails = builder.tableDetails;
        this.timeDuration = builder.timeDuration;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckScaleOutBalancedResponseBody create() {
        return builder().build();
    }

    /**
     * @return checkCode
     */
    public String getCheckCode() {
        return this.checkCode;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tableDetails
     */
    public TableDetails getTableDetails() {
        return this.tableDetails;
    }

    /**
     * @return timeDuration
     */
    public String getTimeDuration() {
        return this.timeDuration;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String checkCode; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private TableDetails tableDetails; 
        private String timeDuration; 
        private Integer totalCount; 

        /**
         * CheckCode.
         */
        public Builder checkCode(String checkCode) {
            this.checkCode = checkCode;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TableDetails.
         */
        public Builder tableDetails(TableDetails tableDetails) {
            this.tableDetails = tableDetails;
            return this;
        }

        /**
         * TimeDuration.
         */
        public Builder timeDuration(String timeDuration) {
            this.timeDuration = timeDuration;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public CheckScaleOutBalancedResponseBody build() {
            return new CheckScaleOutBalancedResponseBody(this);
        } 

    } 

    public static class TableDetail extends TeaModel {
        @NameInMap("Cluster")
        private String cluster;

        @NameInMap("Database")
        private String database;

        @NameInMap("Detail")
        private Integer detail;

        @NameInMap("TableName")
        private String tableName;

        private TableDetail(Builder builder) {
            this.cluster = builder.cluster;
            this.database = builder.database;
            this.detail = builder.detail;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableDetail create() {
            return builder().build();
        }

        /**
         * @return cluster
         */
        public String getCluster() {
            return this.cluster;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return detail
         */
        public Integer getDetail() {
            return this.detail;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String cluster; 
            private String database; 
            private Integer detail; 
            private String tableName; 

            /**
             * Cluster.
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * Database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(Integer detail) {
                this.detail = detail;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public TableDetail build() {
                return new TableDetail(this);
            } 

        } 

    }
    public static class TableDetails extends TeaModel {
        @NameInMap("TableDetail")
        private java.util.List < TableDetail> tableDetail;

        private TableDetails(Builder builder) {
            this.tableDetail = builder.tableDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableDetails create() {
            return builder().build();
        }

        /**
         * @return tableDetail
         */
        public java.util.List < TableDetail> getTableDetail() {
            return this.tableDetail;
        }

        public static final class Builder {
            private java.util.List < TableDetail> tableDetail; 

            /**
             * TableDetail.
             */
            public Builder tableDetail(java.util.List < TableDetail> tableDetail) {
                this.tableDetail = tableDetail;
                return this;
            }

            public TableDetails build() {
                return new TableDetails(this);
            } 

        } 

    }
}
