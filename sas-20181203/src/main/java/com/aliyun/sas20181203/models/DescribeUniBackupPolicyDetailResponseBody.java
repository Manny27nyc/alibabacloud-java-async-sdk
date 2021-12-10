// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeUniBackupPolicyDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUniBackupPolicyDetailResponseBody</p>
 */
public class DescribeUniBackupPolicyDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UniBackupPolicyDTO")
    private UniBackupPolicyDTO uniBackupPolicyDTO;


    private DescribeUniBackupPolicyDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.uniBackupPolicyDTO = builder.uniBackupPolicyDTO;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUniBackupPolicyDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uniBackupPolicyDTO
     */
    public UniBackupPolicyDTO getUniBackupPolicyDTO() {
        return this.uniBackupPolicyDTO;
    }

    public static final class Builder {
        private String requestId; 
        private UniBackupPolicyDTO uniBackupPolicyDTO; 

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>UniBackupPolicyDTO.</p>
         */
        public Builder uniBackupPolicyDTO(UniBackupPolicyDTO uniBackupPolicyDTO) {
            this.uniBackupPolicyDTO = uniBackupPolicyDTO;
            return this;
        }

        public DescribeUniBackupPolicyDetailResponseBody build() {
            return new DescribeUniBackupPolicyDetailResponseBody(this);
        } 

    } 

    public static class FullPlan extends TeaModel {
        @NameInMap("Days")
        private java.util.List < String > days;

        @NameInMap("Interval")
        private Integer interval;

        @NameInMap("PlanType")
        private String planType;

        @NameInMap("StartTime")
        private String startTime;


        private FullPlan(Builder builder) {
            this.days = builder.days;
            this.interval = builder.interval;
            this.planType = builder.planType;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullPlan create() {
            return builder().build();
        }

        /**
         * @return days
         */
        public java.util.List < String > getDays() {
            return this.days;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return planType
         */
        public String getPlanType() {
            return this.planType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private java.util.List < String > days; 
            private Integer interval; 
            private String planType; 
            private String startTime; 

            /**
             * <p>Days.</p>
             */
            public Builder days(java.util.List < String > days) {
                this.days = days;
                return this;
            }

            /**
             * <p>Interval.</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>PlanType.</p>
             */
            public Builder planType(String planType) {
                this.planType = planType;
                return this;
            }

            /**
             * <p>StartTime.</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public FullPlan build() {
                return new FullPlan(this);
            } 

        } 

    }
    public static class IncPlan extends TeaModel {
        @NameInMap("Days")
        private java.util.List < String > days;

        @NameInMap("Interval")
        private Integer interval;

        @NameInMap("PlanType")
        private String planType;

        @NameInMap("StartTime")
        private String startTime;


        private IncPlan(Builder builder) {
            this.days = builder.days;
            this.interval = builder.interval;
            this.planType = builder.planType;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IncPlan create() {
            return builder().build();
        }

        /**
         * @return days
         */
        public java.util.List < String > getDays() {
            return this.days;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return planType
         */
        public String getPlanType() {
            return this.planType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private java.util.List < String > days; 
            private Integer interval; 
            private String planType; 
            private String startTime; 

            /**
             * <p>Days.</p>
             */
            public Builder days(java.util.List < String > days) {
                this.days = days;
                return this;
            }

            /**
             * <p>Interval.</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>PlanType.</p>
             */
            public Builder planType(String planType) {
                this.planType = planType;
                return this;
            }

            /**
             * <p>StartTime.</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public IncPlan build() {
                return new IncPlan(this);
            } 

        } 

    }
    public static class UniBackupPolicyDTO extends TeaModel {
        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("AgentStatus")
        private String agentStatus;

        @NameInMap("DatabaseType")
        private String databaseType;

        @NameInMap("FullPlan")
        private FullPlan fullPlan;

        @NameInMap("IncPlan")
        private IncPlan incPlan;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("PolicyId")
        private Long policyId;

        @NameInMap("PolicyName")
        private String policyName;

        @NameInMap("PolicyStatus")
        private String policyStatus;

        @NameInMap("Retention")
        private Integer retention;

        @NameInMap("SpeedLimiter")
        private Long speedLimiter;

        @NameInMap("UniBackUpCount")
        private Integer uniBackUpCount;


        private UniBackupPolicyDTO(Builder builder) {
            this.accountName = builder.accountName;
            this.agentStatus = builder.agentStatus;
            this.databaseType = builder.databaseType;
            this.fullPlan = builder.fullPlan;
            this.incPlan = builder.incPlan;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.policyStatus = builder.policyStatus;
            this.retention = builder.retention;
            this.speedLimiter = builder.speedLimiter;
            this.uniBackUpCount = builder.uniBackUpCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UniBackupPolicyDTO create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return agentStatus
         */
        public String getAgentStatus() {
            return this.agentStatus;
        }

        /**
         * @return databaseType
         */
        public String getDatabaseType() {
            return this.databaseType;
        }

        /**
         * @return fullPlan
         */
        public FullPlan getFullPlan() {
            return this.fullPlan;
        }

        /**
         * @return incPlan
         */
        public IncPlan getIncPlan() {
            return this.incPlan;
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
         * @return policyId
         */
        public Long getPolicyId() {
            return this.policyId;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return policyStatus
         */
        public String getPolicyStatus() {
            return this.policyStatus;
        }

        /**
         * @return retention
         */
        public Integer getRetention() {
            return this.retention;
        }

        /**
         * @return speedLimiter
         */
        public Long getSpeedLimiter() {
            return this.speedLimiter;
        }

        /**
         * @return uniBackUpCount
         */
        public Integer getUniBackUpCount() {
            return this.uniBackUpCount;
        }

        public static final class Builder {
            private String accountName; 
            private String agentStatus; 
            private String databaseType; 
            private FullPlan fullPlan; 
            private IncPlan incPlan; 
            private String instanceId; 
            private String instanceName; 
            private Long policyId; 
            private String policyName; 
            private String policyStatus; 
            private Integer retention; 
            private Long speedLimiter; 
            private Integer uniBackUpCount; 

            /**
             * <p>AccountName.</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>AgentStatus.</p>
             */
            public Builder agentStatus(String agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * <p>DatabaseType.</p>
             */
            public Builder databaseType(String databaseType) {
                this.databaseType = databaseType;
                return this;
            }

            /**
             * <p>FullPlan.</p>
             */
            public Builder fullPlan(FullPlan fullPlan) {
                this.fullPlan = fullPlan;
                return this;
            }

            /**
             * <p>IncPlan.</p>
             */
            public Builder incPlan(IncPlan incPlan) {
                this.incPlan = incPlan;
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
             * <p>PolicyId.</p>
             */
            public Builder policyId(Long policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>PolicyName.</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>PolicyStatus.</p>
             */
            public Builder policyStatus(String policyStatus) {
                this.policyStatus = policyStatus;
                return this;
            }

            /**
             * <p>Retention.</p>
             */
            public Builder retention(Integer retention) {
                this.retention = retention;
                return this;
            }

            /**
             * <p>SpeedLimiter.</p>
             */
            public Builder speedLimiter(Long speedLimiter) {
                this.speedLimiter = speedLimiter;
                return this;
            }

            /**
             * <p>UniBackUpCount.</p>
             */
            public Builder uniBackUpCount(Integer uniBackUpCount) {
                this.uniBackUpCount = uniBackUpCount;
                return this;
            }

            public UniBackupPolicyDTO build() {
                return new UniBackupPolicyDTO(this);
            } 

        } 

    }
}