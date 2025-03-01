// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

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
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
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
         * SuspEvents.
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
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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
             * TotalCount.
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
    public static class TacticItems extends TeaModel {
        @NameInMap("TacticDisplayName")
        private String tacticDisplayName;

        @NameInMap("TacticId")
        private String tacticId;

        private TacticItems(Builder builder) {
            this.tacticDisplayName = builder.tacticDisplayName;
            this.tacticId = builder.tacticId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TacticItems create() {
            return builder().build();
        }

        /**
         * @return tacticDisplayName
         */
        public String getTacticDisplayName() {
            return this.tacticDisplayName;
        }

        /**
         * @return tacticId
         */
        public String getTacticId() {
            return this.tacticId;
        }

        public static final class Builder {
            private String tacticDisplayName; 
            private String tacticId; 

            /**
             * TacticDisplayName.
             */
            public Builder tacticDisplayName(String tacticDisplayName) {
                this.tacticDisplayName = tacticDisplayName;
                return this;
            }

            /**
             * TacticId.
             */
            public Builder tacticId(String tacticId) {
                this.tacticId = tacticId;
                return this;
            }

            public TacticItems build() {
                return new TacticItems(this);
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

        @NameInMap("CanBeDealOnLine")
        private Boolean canBeDealOnLine;

        @NameInMap("CanCancelFault")
        private Boolean canCancelFault;

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

        @NameInMap("TacticItems")
        private java.util.List < TacticItems> tacticItems;

        @NameInMap("Uuid")
        private String uuid;

        private SuspEvents(Builder builder) {
            this.alarmEventName = builder.alarmEventName;
            this.alarmEventNameOriginal = builder.alarmEventNameOriginal;
            this.alarmEventType = builder.alarmEventType;
            this.alarmUniqueInfo = builder.alarmUniqueInfo;
            this.canBeDealOnLine = builder.canBeDealOnLine;
            this.canCancelFault = builder.canCancelFault;
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
            this.level = builder.level;
            this.operateErrorCode = builder.operateErrorCode;
            this.operateTime = builder.operateTime;
            this.saleVersion = builder.saleVersion;
            this.securityEventIds = builder.securityEventIds;
            this.solution = builder.solution;
            this.stages = builder.stages;
            this.startTime = builder.startTime;
            this.suspiciousEventCount = builder.suspiciousEventCount;
            this.tacticItems = builder.tacticItems;
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
         * @return tacticItems
         */
        public java.util.List < TacticItems> getTacticItems() {
            return this.tacticItems;
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
            private Boolean canBeDealOnLine; 
            private Boolean canCancelFault; 
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
            private String level; 
            private String operateErrorCode; 
            private Long operateTime; 
            private String saleVersion; 
            private String securityEventIds; 
            private String solution; 
            private String stages; 
            private Long startTime; 
            private Integer suspiciousEventCount; 
            private java.util.List < TacticItems> tacticItems; 
            private String uuid; 

            /**
             * AlarmEventName.
             */
            public Builder alarmEventName(String alarmEventName) {
                this.alarmEventName = alarmEventName;
                return this;
            }

            /**
             * AlarmEventNameOriginal.
             */
            public Builder alarmEventNameOriginal(String alarmEventNameOriginal) {
                this.alarmEventNameOriginal = alarmEventNameOriginal;
                return this;
            }

            /**
             * AlarmEventType.
             */
            public Builder alarmEventType(String alarmEventType) {
                this.alarmEventType = alarmEventType;
                return this;
            }

            /**
             * AlarmUniqueInfo.
             */
            public Builder alarmUniqueInfo(String alarmUniqueInfo) {
                this.alarmUniqueInfo = alarmUniqueInfo;
                return this;
            }

            /**
             * CanBeDealOnLine.
             */
            public Builder canBeDealOnLine(Boolean canBeDealOnLine) {
                this.canBeDealOnLine = canBeDealOnLine;
                return this;
            }

            /**
             * CanCancelFault.
             */
            public Builder canCancelFault(Boolean canCancelFault) {
                this.canCancelFault = canCancelFault;
                return this;
            }

            /**
             * DataSource.
             */
            public Builder dataSource(String dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * Dealed.
             */
            public Builder dealed(Boolean dealed) {
                this.dealed = dealed;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * HasTraceInfo.
             */
            public Builder hasTraceInfo(Boolean hasTraceInfo) {
                this.hasTraceInfo = hasTraceInfo;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InternetIp.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * IntranetIp.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * OperateErrorCode.
             */
            public Builder operateErrorCode(String operateErrorCode) {
                this.operateErrorCode = operateErrorCode;
                return this;
            }

            /**
             * OperateTime.
             */
            public Builder operateTime(Long operateTime) {
                this.operateTime = operateTime;
                return this;
            }

            /**
             * SaleVersion.
             */
            public Builder saleVersion(String saleVersion) {
                this.saleVersion = saleVersion;
                return this;
            }

            /**
             * SecurityEventIds.
             */
            public Builder securityEventIds(String securityEventIds) {
                this.securityEventIds = securityEventIds;
                return this;
            }

            /**
             * Solution.
             */
            public Builder solution(String solution) {
                this.solution = solution;
                return this;
            }

            /**
             * Stages.
             */
            public Builder stages(String stages) {
                this.stages = stages;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * SuspiciousEventCount.
             */
            public Builder suspiciousEventCount(Integer suspiciousEventCount) {
                this.suspiciousEventCount = suspiciousEventCount;
                return this;
            }

            /**
             * 攻击阶段展示名
             */
            public Builder tacticItems(java.util.List < TacticItems> tacticItems) {
                this.tacticItems = tacticItems;
                return this;
            }

            /**
             * Uuid.
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
