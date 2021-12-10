// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeAlarmEventListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlarmEventListResponseBody</p>
 */
public class DescribeAlarmEventListResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuspEvents")
    private java.util.List < SuspEvents> suspEvents;


    private DescribeAlarmEventListResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.suspEvents = builder.suspEvents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlarmEventListResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return suspEvents
     */
    public java.util.List < SuspEvents> getSuspEvents() {
        return this.suspEvents;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List < SuspEvents> suspEvents; 

        /**
         * <p>PageInfo.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>SuspEvents.</p>
         */
        public Builder suspEvents(java.util.List < SuspEvents> suspEvents) {
            this.suspEvents = suspEvents;
            return this;
        }

        public DescribeAlarmEventListResponseBody build() {
            return new DescribeAlarmEventListResponseBody(this);
        } 

    } 

    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;


        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
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

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>Count.</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>CurrentPage.</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>PageSize.</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>TotalCount.</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    public static class SuspEvents extends TeaModel {
        @NameInMap("AlarmEventName")
        private String alarmEventName;

        @NameInMap("AlarmEventNameOriginal")
        private String alarmEventNameOriginal;

        @NameInMap("AlarmEventType")
        private String alarmEventType;

        @NameInMap("AlarmUniqueInfo")
        private String alarmUniqueInfo;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("CanBeDealOnLine")
        private Boolean canBeDealOnLine;

        @NameInMap("CanCancelFault")
        private Boolean canCancelFault;

        @NameInMap("ContainHwMode")
        private Boolean containHwMode;

        @NameInMap("ContainerId")
        private String containerId;

        @NameInMap("ContainerImageId")
        private String containerImageId;

        @NameInMap("ContainerImageName")
        private String containerImageName;

        @NameInMap("DataSource")
        private String dataSource;

        @NameInMap("Dealed")
        private Boolean dealed;

        @NameInMap("Description")
        private String description;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("HasTraceInfo")
        private Boolean hasTraceInfo;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("K8sClusterId")
        private String k8sClusterId;

        @NameInMap("K8sClusterName")
        private String k8sClusterName;

        @NameInMap("K8sNamespace")
        private String k8sNamespace;

        @NameInMap("K8sNodeId")
        private String k8sNodeId;

        @NameInMap("K8sNodeName")
        private String k8sNodeName;

        @NameInMap("K8sPodName")
        private String k8sPodName;

        @NameInMap("Level")
        private String level;

        @NameInMap("OperateErrorCode")
        private String operateErrorCode;

        @NameInMap("OperateTime")
        private Long operateTime;

        @NameInMap("SaleVersion")
        private String saleVersion;

        @NameInMap("SecurityEventIds")
        private String securityEventIds;

        @NameInMap("Solution")
        private String solution;

        @NameInMap("Stages")
        private String stages;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("SuspiciousEventCount")
        private Integer suspiciousEventCount;

        @NameInMap("Uuid")
        private String uuid;


        private SuspEvents(Builder builder) {
            this.alarmEventName = builder.alarmEventName;
            this.alarmEventNameOriginal = builder.alarmEventNameOriginal;
            this.alarmEventType = builder.alarmEventType;
            this.alarmUniqueInfo = builder.alarmUniqueInfo;
            this.appName = builder.appName;
            this.canBeDealOnLine = builder.canBeDealOnLine;
            this.canCancelFault = builder.canCancelFault;
            this.containHwMode = builder.containHwMode;
            this.containerId = builder.containerId;
            this.containerImageId = builder.containerImageId;
            this.containerImageName = builder.containerImageName;
            this.dataSource = builder.dataSource;
            this.dealed = builder.dealed;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.gmtModified = builder.gmtModified;
            this.hasTraceInfo = builder.hasTraceInfo;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.k8sClusterId = builder.k8sClusterId;
            this.k8sClusterName = builder.k8sClusterName;
            this.k8sNamespace = builder.k8sNamespace;
            this.k8sNodeId = builder.k8sNodeId;
            this.k8sNodeName = builder.k8sNodeName;
            this.k8sPodName = builder.k8sPodName;
            this.level = builder.level;
            this.operateErrorCode = builder.operateErrorCode;
            this.operateTime = builder.operateTime;
            this.saleVersion = builder.saleVersion;
            this.securityEventIds = builder.securityEventIds;
            this.solution = builder.solution;
            this.stages = builder.stages;
            this.startTime = builder.startTime;
            this.suspiciousEventCount = builder.suspiciousEventCount;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuspEvents create() {
            return builder().build();
        }

        /**
         * @return alarmEventName
         */
        public String getAlarmEventName() {
            return this.alarmEventName;
        }

        /**
         * @return alarmEventNameOriginal
         */
        public String getAlarmEventNameOriginal() {
            return this.alarmEventNameOriginal;
        }

        /**
         * @return alarmEventType
         */
        public String getAlarmEventType() {
            return this.alarmEventType;
        }

        /**
         * @return alarmUniqueInfo
         */
        public String getAlarmUniqueInfo() {
            return this.alarmUniqueInfo;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return canBeDealOnLine
         */
        public Boolean getCanBeDealOnLine() {
            return this.canBeDealOnLine;
        }

        /**
         * @return canCancelFault
         */
        public Boolean getCanCancelFault() {
            return this.canCancelFault;
        }

        /**
         * @return containHwMode
         */
        public Boolean getContainHwMode() {
            return this.containHwMode;
        }

        /**
         * @return containerId
         */
        public String getContainerId() {
            return this.containerId;
        }

        /**
         * @return containerImageId
         */
        public String getContainerImageId() {
            return this.containerImageId;
        }

        /**
         * @return containerImageName
         */
        public String getContainerImageName() {
            return this.containerImageName;
        }

        /**
         * @return dataSource
         */
        public String getDataSource() {
            return this.dataSource;
        }

        /**
         * @return dealed
         */
        public Boolean getDealed() {
            return this.dealed;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return hasTraceInfo
         */
        public Boolean getHasTraceInfo() {
            return this.hasTraceInfo;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return k8sClusterId
         */
        public String getK8sClusterId() {
            return this.k8sClusterId;
        }

        /**
         * @return k8sClusterName
         */
        public String getK8sClusterName() {
            return this.k8sClusterName;
        }

        /**
         * @return k8sNamespace
         */
        public String getK8sNamespace() {
            return this.k8sNamespace;
        }

        /**
         * @return k8sNodeId
         */
        public String getK8sNodeId() {
            return this.k8sNodeId;
        }

        /**
         * @return k8sNodeName
         */
        public String getK8sNodeName() {
            return this.k8sNodeName;
        }

        /**
         * @return k8sPodName
         */
        public String getK8sPodName() {
            return this.k8sPodName;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return operateErrorCode
         */
        public String getOperateErrorCode() {
            return this.operateErrorCode;
        }

        /**
         * @return operateTime
         */
        public Long getOperateTime() {
            return this.operateTime;
        }

        /**
         * @return saleVersion
         */
        public String getSaleVersion() {
            return this.saleVersion;
        }

        /**
         * @return securityEventIds
         */
        public String getSecurityEventIds() {
            return this.securityEventIds;
        }

        /**
         * @return solution
         */
        public String getSolution() {
            return this.solution;
        }

        /**
         * @return stages
         */
        public String getStages() {
            return this.stages;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return suspiciousEventCount
         */
        public Integer getSuspiciousEventCount() {
            return this.suspiciousEventCount;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String alarmEventName; 
            private String alarmEventNameOriginal; 
            private String alarmEventType; 
            private String alarmUniqueInfo; 
            private String appName; 
            private Boolean canBeDealOnLine; 
            private Boolean canCancelFault; 
            private Boolean containHwMode; 
            private String containerId; 
            private String containerImageId; 
            private String containerImageName; 
            private String dataSource; 
            private Boolean dealed; 
            private String description; 
            private Long endTime; 
            private Long gmtModified; 
            private Boolean hasTraceInfo; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String k8sClusterId; 
            private String k8sClusterName; 
            private String k8sNamespace; 
            private String k8sNodeId; 
            private String k8sNodeName; 
            private String k8sPodName; 
            private String level; 
            private String operateErrorCode; 
            private Long operateTime; 
            private String saleVersion; 
            private String securityEventIds; 
            private String solution; 
            private String stages; 
            private Long startTime; 
            private Integer suspiciousEventCount; 
            private String uuid; 

            /**
             * <p>AlarmEventName.</p>
             */
            public Builder alarmEventName(String alarmEventName) {
                this.alarmEventName = alarmEventName;
                return this;
            }

            /**
             * <p>AlarmEventNameOriginal.</p>
             */
            public Builder alarmEventNameOriginal(String alarmEventNameOriginal) {
                this.alarmEventNameOriginal = alarmEventNameOriginal;
                return this;
            }

            /**
             * <p>AlarmEventType.</p>
             */
            public Builder alarmEventType(String alarmEventType) {
                this.alarmEventType = alarmEventType;
                return this;
            }

            /**
             * <p>AlarmUniqueInfo.</p>
             */
            public Builder alarmUniqueInfo(String alarmUniqueInfo) {
                this.alarmUniqueInfo = alarmUniqueInfo;
                return this;
            }

            /**
             * <p>AppName.</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>CanBeDealOnLine.</p>
             */
            public Builder canBeDealOnLine(Boolean canBeDealOnLine) {
                this.canBeDealOnLine = canBeDealOnLine;
                return this;
            }

            /**
             * <p>CanCancelFault.</p>
             */
            public Builder canCancelFault(Boolean canCancelFault) {
                this.canCancelFault = canCancelFault;
                return this;
            }

            /**
             * <p>ContainHwMode.</p>
             */
            public Builder containHwMode(Boolean containHwMode) {
                this.containHwMode = containHwMode;
                return this;
            }

            /**
             * <p>ContainerId.</p>
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * <p>ContainerImageId.</p>
             */
            public Builder containerImageId(String containerImageId) {
                this.containerImageId = containerImageId;
                return this;
            }

            /**
             * <p>ContainerImageName.</p>
             */
            public Builder containerImageName(String containerImageName) {
                this.containerImageName = containerImageName;
                return this;
            }

            /**
             * <p>DataSource.</p>
             */
            public Builder dataSource(String dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * <p>Dealed.</p>
             */
            public Builder dealed(Boolean dealed) {
                this.dealed = dealed;
                return this;
            }

            /**
             * <p>Description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>EndTime.</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>GmtModified.</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>HasTraceInfo.</p>
             */
            public Builder hasTraceInfo(Boolean hasTraceInfo) {
                this.hasTraceInfo = hasTraceInfo;
                return this;
            }

            /**
             * <p>InstanceId.</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>InstanceName.</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>InternetIp.</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>IntranetIp.</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>K8sClusterId.</p>
             */
            public Builder k8sClusterId(String k8sClusterId) {
                this.k8sClusterId = k8sClusterId;
                return this;
            }

            /**
             * <p>K8sClusterName.</p>
             */
            public Builder k8sClusterName(String k8sClusterName) {
                this.k8sClusterName = k8sClusterName;
                return this;
            }

            /**
             * <p>K8sNamespace.</p>
             */
            public Builder k8sNamespace(String k8sNamespace) {
                this.k8sNamespace = k8sNamespace;
                return this;
            }

            /**
             * <p>K8sNodeId.</p>
             */
            public Builder k8sNodeId(String k8sNodeId) {
                this.k8sNodeId = k8sNodeId;
                return this;
            }

            /**
             * <p>K8sNodeName.</p>
             */
            public Builder k8sNodeName(String k8sNodeName) {
                this.k8sNodeName = k8sNodeName;
                return this;
            }

            /**
             * <p>K8sPodName.</p>
             */
            public Builder k8sPodName(String k8sPodName) {
                this.k8sPodName = k8sPodName;
                return this;
            }

            /**
             * <p>Level.</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>OperateErrorCode.</p>
             */
            public Builder operateErrorCode(String operateErrorCode) {
                this.operateErrorCode = operateErrorCode;
                return this;
            }

            /**
             * <p>OperateTime.</p>
             */
            public Builder operateTime(Long operateTime) {
                this.operateTime = operateTime;
                return this;
            }

            /**
             * <p>SaleVersion.</p>
             */
            public Builder saleVersion(String saleVersion) {
                this.saleVersion = saleVersion;
                return this;
            }

            /**
             * <p>SecurityEventIds.</p>
             */
            public Builder securityEventIds(String securityEventIds) {
                this.securityEventIds = securityEventIds;
                return this;
            }

            /**
             * <p>Solution.</p>
             */
            public Builder solution(String solution) {
                this.solution = solution;
                return this;
            }

            /**
             * <p>Stages.</p>
             */
            public Builder stages(String stages) {
                this.stages = stages;
                return this;
            }

            /**
             * <p>StartTime.</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>SuspiciousEventCount.</p>
             */
            public Builder suspiciousEventCount(Integer suspiciousEventCount) {
                this.suspiciousEventCount = suspiciousEventCount;
                return this;
            }

            /**
             * <p>Uuid.</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public SuspEvents build() {
                return new SuspEvents(this);
            } 

        } 

    }
}