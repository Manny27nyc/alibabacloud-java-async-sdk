// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceGroupSchedulingPreviewRequest} extends {@link RequestModel}
 *
 * <p>GetServiceGroupSchedulingPreviewRequest</p>
 */
public class GetServiceGroupSchedulingPreviewRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("endTime")
    private String endTime;

    @Body
    @NameInMap("fastScheduling")
    private FastScheduling fastScheduling;

    @Body
    @NameInMap("fineScheduling")
    private FineScheduling fineScheduling;

    @Body
    @NameInMap("schedulingWay")
    @Validation(required = true)
    private String schedulingWay;

    @Body
    @NameInMap("serviceGroupId")
    @Validation(required = true)
    private Long serviceGroupId;

    @Body
    @NameInMap("startTime")
    private String startTime;

    private GetServiceGroupSchedulingPreviewRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.endTime = builder.endTime;
        this.fastScheduling = builder.fastScheduling;
        this.fineScheduling = builder.fineScheduling;
        this.schedulingWay = builder.schedulingWay;
        this.serviceGroupId = builder.serviceGroupId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceGroupSchedulingPreviewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return fastScheduling
     */
    public FastScheduling getFastScheduling() {
        return this.fastScheduling;
    }

    /**
     * @return fineScheduling
     */
    public FineScheduling getFineScheduling() {
        return this.fineScheduling;
    }

    /**
     * @return schedulingWay
     */
    public String getSchedulingWay() {
        return this.schedulingWay;
    }

    /**
     * @return serviceGroupId
     */
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetServiceGroupSchedulingPreviewRequest, Builder> {
        private String clientToken; 
        private String endTime; 
        private FastScheduling fastScheduling; 
        private FineScheduling fineScheduling; 
        private String schedulingWay; 
        private Long serviceGroupId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceGroupSchedulingPreviewRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.endTime = response.endTime;
            this.fastScheduling = response.fastScheduling;
            this.fineScheduling = response.fineScheduling;
            this.schedulingWay = response.schedulingWay;
            this.serviceGroupId = response.serviceGroupId;
            this.startTime = response.startTime;
        } 

        /**
         * 幂等号
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 排班结束时间
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * 快速排班
         */
        public Builder fastScheduling(FastScheduling fastScheduling) {
            this.putBodyParameter("fastScheduling", fastScheduling);
            this.fastScheduling = fastScheduling;
            return this;
        }

        /**
         * 精细排
         */
        public Builder fineScheduling(FineScheduling fineScheduling) {
            this.putBodyParameter("fineScheduling", fineScheduling);
            this.fineScheduling = fineScheduling;
            return this;
        }

        /**
         * 排班方式 FAST 快速排班 FINE 精细排班
         */
        public Builder schedulingWay(String schedulingWay) {
            this.putBodyParameter("schedulingWay", schedulingWay);
            this.schedulingWay = schedulingWay;
            return this;
        }

        /**
         * 服务组ID
         */
        public Builder serviceGroupId(Long serviceGroupId) {
            this.putBodyParameter("serviceGroupId", serviceGroupId);
            this.serviceGroupId = serviceGroupId;
            return this;
        }

        /**
         * 排班开始时间
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetServiceGroupSchedulingPreviewRequest build() {
            return new GetServiceGroupSchedulingPreviewRequest(this);
        } 

    } 

    public static class SchedulingUsers extends TeaModel {
        @NameInMap("schedulingOrder")
        private Integer schedulingOrder;

        @NameInMap("schedulingUserId")
        private Long schedulingUserId;

        private SchedulingUsers(Builder builder) {
            this.schedulingOrder = builder.schedulingOrder;
            this.schedulingUserId = builder.schedulingUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchedulingUsers create() {
            return builder().build();
        }

        /**
         * @return schedulingOrder
         */
        public Integer getSchedulingOrder() {
            return this.schedulingOrder;
        }

        /**
         * @return schedulingUserId
         */
        public Long getSchedulingUserId() {
            return this.schedulingUserId;
        }

        public static final class Builder {
            private Integer schedulingOrder; 
            private Long schedulingUserId; 

            /**
             * 排班顺序
             */
            public Builder schedulingOrder(Integer schedulingOrder) {
                this.schedulingOrder = schedulingOrder;
                return this;
            }

            /**
             * 轮班用户ID
             */
            public Builder schedulingUserId(Long schedulingUserId) {
                this.schedulingUserId = schedulingUserId;
                return this;
            }

            public SchedulingUsers build() {
                return new SchedulingUsers(this);
            } 

        } 

    }
    public static class FastScheduling extends TeaModel {
        @NameInMap("dutyPlan")
        private String dutyPlan;

        @NameInMap("schedulingUsers")
        private java.util.List < SchedulingUsers> schedulingUsers;

        @NameInMap("singleDuration")
        private Integer singleDuration;

        @NameInMap("singleDurationUnit")
        private String singleDurationUnit;

        private FastScheduling(Builder builder) {
            this.dutyPlan = builder.dutyPlan;
            this.schedulingUsers = builder.schedulingUsers;
            this.singleDuration = builder.singleDuration;
            this.singleDurationUnit = builder.singleDurationUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FastScheduling create() {
            return builder().build();
        }

        /**
         * @return dutyPlan
         */
        public String getDutyPlan() {
            return this.dutyPlan;
        }

        /**
         * @return schedulingUsers
         */
        public java.util.List < SchedulingUsers> getSchedulingUsers() {
            return this.schedulingUsers;
        }

        /**
         * @return singleDuration
         */
        public Integer getSingleDuration() {
            return this.singleDuration;
        }

        /**
         * @return singleDurationUnit
         */
        public String getSingleDurationUnit() {
            return this.singleDurationUnit;
        }

        public static final class Builder {
            private String dutyPlan; 
            private java.util.List < SchedulingUsers> schedulingUsers; 
            private Integer singleDuration; 
            private String singleDurationUnit; 

            /**
             * 值班方案 dutyPlan FAST_CHOICE 快速选择 CUSTOM 自定义
             */
            public Builder dutyPlan(String dutyPlan) {
                this.dutyPlan = dutyPlan;
                return this;
            }

            /**
             * 快速轮班用户
             */
            public Builder schedulingUsers(java.util.List < SchedulingUsers> schedulingUsers) {
                this.schedulingUsers = schedulingUsers;
                return this;
            }

            /**
             * 每人排班时长
             */
            public Builder singleDuration(Integer singleDuration) {
                this.singleDuration = singleDuration;
                return this;
            }

            /**
             * 每人排班时长单位 HOUR 小时 DAY 天
             */
            public Builder singleDurationUnit(String singleDurationUnit) {
                this.singleDurationUnit = singleDurationUnit;
                return this;
            }

            public FastScheduling build() {
                return new FastScheduling(this);
            } 

        } 

    }
    public static class SchedulingFineShifts extends TeaModel {
        @NameInMap("schedulingEndTime")
        private String schedulingEndTime;

        @NameInMap("schedulingOrder")
        private Long schedulingOrder;

        @NameInMap("schedulingStartTime")
        private String schedulingStartTime;

        @NameInMap("shiftName")
        private String shiftName;

        private SchedulingFineShifts(Builder builder) {
            this.schedulingEndTime = builder.schedulingEndTime;
            this.schedulingOrder = builder.schedulingOrder;
            this.schedulingStartTime = builder.schedulingStartTime;
            this.shiftName = builder.shiftName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchedulingFineShifts create() {
            return builder().build();
        }

        /**
         * @return schedulingEndTime
         */
        public String getSchedulingEndTime() {
            return this.schedulingEndTime;
        }

        /**
         * @return schedulingOrder
         */
        public Long getSchedulingOrder() {
            return this.schedulingOrder;
        }

        /**
         * @return schedulingStartTime
         */
        public String getSchedulingStartTime() {
            return this.schedulingStartTime;
        }

        /**
         * @return shiftName
         */
        public String getShiftName() {
            return this.shiftName;
        }

        public static final class Builder {
            private String schedulingEndTime; 
            private Long schedulingOrder; 
            private String schedulingStartTime; 
            private String shiftName; 

            /**
             * 排班结束时间
             */
            public Builder schedulingEndTime(String schedulingEndTime) {
                this.schedulingEndTime = schedulingEndTime;
                return this;
            }

            /**
             * 排班顺序
             */
            public Builder schedulingOrder(Long schedulingOrder) {
                this.schedulingOrder = schedulingOrder;
                return this;
            }

            /**
             * 排班开始时间
             */
            public Builder schedulingStartTime(String schedulingStartTime) {
                this.schedulingStartTime = schedulingStartTime;
                return this;
            }

            /**
             * 班次名称
             */
            public Builder shiftName(String shiftName) {
                this.shiftName = shiftName;
                return this;
            }

            public SchedulingFineShifts build() {
                return new SchedulingFineShifts(this);
            } 

        } 

    }
    public static class FineScheduling extends TeaModel {
        @NameInMap("period")
        private Integer period;

        @NameInMap("periodUnit")
        private String periodUnit;

        @NameInMap("schedulingFineShifts")
        private java.util.List < SchedulingFineShifts> schedulingFineShifts;

        @NameInMap("shiftType")
        private String shiftType;

        private FineScheduling(Builder builder) {
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.schedulingFineShifts = builder.schedulingFineShifts;
            this.shiftType = builder.shiftType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FineScheduling create() {
            return builder().build();
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return schedulingFineShifts
         */
        public java.util.List < SchedulingFineShifts> getSchedulingFineShifts() {
            return this.schedulingFineShifts;
        }

        /**
         * @return shiftType
         */
        public String getShiftType() {
            return this.shiftType;
        }

        public static final class Builder {
            private Integer period; 
            private String periodUnit; 
            private java.util.List < SchedulingFineShifts> schedulingFineShifts; 
            private String shiftType; 

            /**
             * 循环周期
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * 循环周期单位 HOUR 小时 DAY 天
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * 精细排班班次人员信息
             */
            public Builder schedulingFineShifts(java.util.List < SchedulingFineShifts> schedulingFineShifts) {
                this.schedulingFineShifts = schedulingFineShifts;
                return this;
            }

            /**
             * 班次类型 MORNING_NIGHT 早晚班 MORNING_NOON_NIGHT 早中晚班 CUSTOM 自定义
             */
            public Builder shiftType(String shiftType) {
                this.shiftType = shiftType;
                return this;
            }

            public FineScheduling build() {
                return new FineScheduling(this);
            } 

        } 

    }
}
