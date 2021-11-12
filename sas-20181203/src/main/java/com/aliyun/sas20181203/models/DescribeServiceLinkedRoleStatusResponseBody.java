// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeServiceLinkedRoleStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceLinkedRoleStatusResponseBody</p>
 */
public class DescribeServiceLinkedRoleStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RoleStatus")
    private RoleStatus roleStatus;


    private DescribeServiceLinkedRoleStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.roleStatus = builder.roleStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceLinkedRoleStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roleStatus
     */
    public RoleStatus getRoleStatus() {
        return this.roleStatus;
    }

    public static final class Builder {
        private String requestId; 
        private RoleStatus roleStatus; 

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>RoleStatus.</p>
         */
        public Builder roleStatus(RoleStatus roleStatus) {
            this.roleStatus = roleStatus;
            return this;
        }

        public DescribeServiceLinkedRoleStatusResponseBody build() {
            return new DescribeServiceLinkedRoleStatusResponseBody(this);
        } 

    } 

    public static class RoleStatus extends TeaModel {
        @NameInMap("Status")
        private Boolean status;


        private RoleStatus(Builder builder) {
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleStatus create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public Boolean getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean status; 

            /**
             * <p>Status.</p>
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            public RoleStatus build() {
                return new RoleStatus(this);
            } 

        } 

    }
}
