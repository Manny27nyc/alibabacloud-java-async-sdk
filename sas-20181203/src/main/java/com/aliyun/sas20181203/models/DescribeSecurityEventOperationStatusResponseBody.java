// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeSecurityEventOperationStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityEventOperationStatusResponseBody</p>
 */
public class DescribeSecurityEventOperationStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityEventOperationStatusResponse")
    private SecurityEventOperationStatusResponse securityEventOperationStatusResponse;


    private DescribeSecurityEventOperationStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityEventOperationStatusResponse = builder.securityEventOperationStatusResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityEventOperationStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityEventOperationStatusResponse
     */
    public SecurityEventOperationStatusResponse getSecurityEventOperationStatusResponse() {
        return this.securityEventOperationStatusResponse;
    }

    public static final class Builder {
        private String requestId; 
        private SecurityEventOperationStatusResponse securityEventOperationStatusResponse; 

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>SecurityEventOperationStatusResponse.</p>
         */
        public Builder securityEventOperationStatusResponse(SecurityEventOperationStatusResponse securityEventOperationStatusResponse) {
            this.securityEventOperationStatusResponse = securityEventOperationStatusResponse;
            return this;
        }

        public DescribeSecurityEventOperationStatusResponseBody build() {
            return new DescribeSecurityEventOperationStatusResponseBody(this);
        } 

    } 

    public static class SecurityEventOperationStatuses extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("SecurityEventId")
        private String securityEventId;

        @NameInMap("Status")
        private String status;


        private SecurityEventOperationStatuses(Builder builder) {
            this.errorCode = builder.errorCode;
            this.securityEventId = builder.securityEventId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityEventOperationStatuses create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return securityEventId
         */
        public String getSecurityEventId() {
            return this.securityEventId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorCode; 
            private String securityEventId; 
            private String status; 

            /**
             * <p>ErrorCode.</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>SecurityEventId.</p>
             */
            public Builder securityEventId(String securityEventId) {
                this.securityEventId = securityEventId;
                return this;
            }

            /**
             * <p>Status.</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SecurityEventOperationStatuses build() {
                return new SecurityEventOperationStatuses(this);
            } 

        } 

    }
    public static class SecurityEventOperationStatusResponse extends TeaModel {
        @NameInMap("SecurityEventOperationStatuses")
        private java.util.List < SecurityEventOperationStatuses> securityEventOperationStatuses;

        @NameInMap("TaskStatus")
        private String taskStatus;


        private SecurityEventOperationStatusResponse(Builder builder) {
            this.securityEventOperationStatuses = builder.securityEventOperationStatuses;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityEventOperationStatusResponse create() {
            return builder().build();
        }

        /**
         * @return securityEventOperationStatuses
         */
        public java.util.List < SecurityEventOperationStatuses> getSecurityEventOperationStatuses() {
            return this.securityEventOperationStatuses;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private java.util.List < SecurityEventOperationStatuses> securityEventOperationStatuses; 
            private String taskStatus; 

            /**
             * <p>SecurityEventOperationStatuses.</p>
             */
            public Builder securityEventOperationStatuses(java.util.List < SecurityEventOperationStatuses> securityEventOperationStatuses) {
                this.securityEventOperationStatuses = securityEventOperationStatuses;
                return this;
            }

            /**
             * <p>TaskStatus.</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public SecurityEventOperationStatusResponse build() {
                return new SecurityEventOperationStatusResponse(this);
            } 

        } 

    }
}
