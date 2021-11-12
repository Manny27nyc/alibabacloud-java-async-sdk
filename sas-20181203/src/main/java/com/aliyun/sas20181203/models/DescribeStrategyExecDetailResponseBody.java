// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeStrategyExecDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStrategyExecDetailResponseBody</p>
 */
public class DescribeStrategyExecDetailResponseBody extends TeaModel {
    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("FailCount")
    private Integer failCount;

    @NameInMap("FailedEcsList")
    private java.util.List < FailedEcsList> failedEcsList;

    @NameInMap("InProcessCount")
    private Integer inProcessCount;

    @NameInMap("Percent")
    private String percent;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Source")
    private String source;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("SuccessCount")
    private Integer successCount;


    private DescribeStrategyExecDetailResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.failCount = builder.failCount;
        this.failedEcsList = builder.failedEcsList;
        this.inProcessCount = builder.inProcessCount;
        this.percent = builder.percent;
        this.requestId = builder.requestId;
        this.source = builder.source;
        this.startTime = builder.startTime;
        this.successCount = builder.successCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStrategyExecDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return failCount
     */
    public Integer getFailCount() {
        return this.failCount;
    }

    /**
     * @return failedEcsList
     */
    public java.util.List < FailedEcsList> getFailedEcsList() {
        return this.failedEcsList;
    }

    /**
     * @return inProcessCount
     */
    public Integer getInProcessCount() {
        return this.inProcessCount;
    }

    /**
     * @return percent
     */
    public String getPercent() {
        return this.percent;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return successCount
     */
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public static final class Builder {
        private String endTime; 
        private Integer failCount; 
        private java.util.List < FailedEcsList> failedEcsList; 
        private Integer inProcessCount; 
        private String percent; 
        private String requestId; 
        private String source; 
        private String startTime; 
        private Integer successCount; 

        /**
         * <p>EndTime.</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>FailCount.</p>
         */
        public Builder failCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }

        /**
         * <p>FailedEcsList.</p>
         */
        public Builder failedEcsList(java.util.List < FailedEcsList> failedEcsList) {
            this.failedEcsList = failedEcsList;
            return this;
        }

        /**
         * <p>InProcessCount.</p>
         */
        public Builder inProcessCount(Integer inProcessCount) {
            this.inProcessCount = inProcessCount;
            return this;
        }

        /**
         * <p>Percent.</p>
         */
        public Builder percent(String percent) {
            this.percent = percent;
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
         * <p>Source.</p>
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * <p>StartTime.</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>SuccessCount.</p>
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        public DescribeStrategyExecDetailResponseBody build() {
            return new DescribeStrategyExecDetailResponseBody(this);
        } 

    } 

    public static class FailedEcsList extends TeaModel {
        @NameInMap("IP")
        private String IP;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("Reason")
        private String reason;


        private FailedEcsList(Builder builder) {
            this.IP = builder.IP;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedEcsList create() {
            return builder().build();
        }

        /**
         * @return IP
         */
        public String getIP() {
            return this.IP;
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
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private String IP; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String reason; 

            /**
             * <p>IP.</p>
             */
            public Builder IP(String IP) {
                this.IP = IP;
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
             * <p>Reason.</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public FailedEcsList build() {
                return new FailedEcsList(this);
            } 

        } 

    }
}
