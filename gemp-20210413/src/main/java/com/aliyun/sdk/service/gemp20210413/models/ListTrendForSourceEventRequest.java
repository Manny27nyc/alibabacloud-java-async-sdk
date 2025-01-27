// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrendForSourceEventRequest} extends {@link RequestModel}
 *
 * <p>ListTrendForSourceEventRequest</p>
 */
public class ListTrendForSourceEventRequest extends Request {
    @Body
    @NameInMap("endTime")
    private String endTime;

    @Body
    @NameInMap("instanceId")
    private Long instanceId;

    @Body
    @NameInMap("instanceType")
    private String instanceType;

    @Body
    @NameInMap("requestId")
    private String requestId;

    @Body
    @NameInMap("startTime")
    private String startTime;

    @Body
    @NameInMap("timeUnit")
    private Long timeUnit;

    private ListTrendForSourceEventRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.timeUnit = builder.timeUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrendForSourceEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return timeUnit
     */
    public Long getTimeUnit() {
        return this.timeUnit;
    }

    public static final class Builder extends Request.Builder<ListTrendForSourceEventRequest, Builder> {
        private String endTime; 
        private Long instanceId; 
        private String instanceType; 
        private String requestId; 
        private String startTime; 
        private Long timeUnit; 

        private Builder() {
            super();
        } 

        private Builder(ListTrendForSourceEventRequest response) {
            super(response);
            this.endTime = response.endTime;
            this.instanceId = response.instanceId;
            this.instanceType = response.instanceType;
            this.requestId = response.requestId;
            this.startTime = response.startTime;
            this.timeUnit = response.timeUnit;
        } 

        /**
         * 结束时间
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * 报警ID
         */
        public Builder instanceId(Long instanceId) {
            this.putBodyParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 类型
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("instanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * 开始时间
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * 时间单位毫秒
         */
        public Builder timeUnit(Long timeUnit) {
            this.putBodyParameter("timeUnit", timeUnit);
            this.timeUnit = timeUnit;
            return this;
        }

        @Override
        public ListTrendForSourceEventRequest build() {
            return new ListTrendForSourceEventRequest(this);
        } 

    } 

}
