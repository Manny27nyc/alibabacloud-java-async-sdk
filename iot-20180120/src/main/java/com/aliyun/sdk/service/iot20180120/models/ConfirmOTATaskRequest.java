// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmOTATaskRequest} extends {@link RequestModel}
 *
 * <p>ConfirmOTATaskRequest</p>
 */
public class ConfirmOTATaskRequest extends Request {
    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private java.util.List < String > taskId;

    private ConfirmOTATaskRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmOTATaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return taskId
     */
    public java.util.List < String > getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<ConfirmOTATaskRequest, Builder> {
        private String iotInstanceId; 
        private java.util.List < String > taskId; 

        private Builder() {
            super();
        } 

        private Builder(ConfirmOTATaskRequest response) {
            super(response);
            this.iotInstanceId = response.iotInstanceId;
            this.taskId = response.taskId;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(java.util.List < String > taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public ConfirmOTATaskRequest build() {
            return new ConfirmOTATaskRequest(this);
        } 

    } 

}
