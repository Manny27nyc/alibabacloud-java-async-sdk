// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEipAddressesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEipAddressesResponseBody</p>
 */
public class DescribeEipAddressesResponseBody extends TeaModel {
    @NameInMap("EipAddresses")
    private EipAddresses eipAddresses;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeEipAddressesResponseBody(Builder builder) {
        this.eipAddresses = builder.eipAddresses;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEipAddressesResponseBody create() {
        return builder().build();
    }

    /**
     * @return eipAddresses
     */
    public EipAddresses getEipAddresses() {
        return this.eipAddresses;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private EipAddresses eipAddresses; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * EipAddresses.
         */
        public Builder eipAddresses(EipAddresses eipAddresses) {
            this.eipAddresses = eipAddresses;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEipAddressesResponseBody build() {
            return new DescribeEipAddressesResponseBody(this);
        } 

    } 

    public static class LockReason extends TeaModel {
        @NameInMap("LockReason")
        private String lockReason;

        private LockReason(Builder builder) {
            this.lockReason = builder.lockReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LockReason create() {
            return builder().build();
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        public static final class Builder {
            private String lockReason; 

            /**
             * LockReason.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            public LockReason build() {
                return new LockReason(this);
            } 

        } 

    }
    public static class OperationLocks extends TeaModel {
        @NameInMap("LockReason")
        private java.util.List < LockReason> lockReason;

        private OperationLocks(Builder builder) {
            this.lockReason = builder.lockReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationLocks create() {
            return builder().build();
        }

        /**
         * @return lockReason
         */
        public java.util.List < LockReason> getLockReason() {
            return this.lockReason;
        }

        public static final class Builder {
            private java.util.List < LockReason> lockReason; 

            /**
             * LockReason.
             */
            public Builder lockReason(java.util.List < LockReason> lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            public OperationLocks build() {
                return new OperationLocks(this);
            } 

        } 

    }
    public static class EipAddress extends TeaModel {
        @NameInMap("AllocationId")
        private String allocationId;

        @NameInMap("AllocationTime")
        private String allocationTime;

        @NameInMap("Bandwidth")
        private String bandwidth;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("EipBandwidth")
        private String eipBandwidth;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InternetChargeType")
        private String internetChargeType;

        @NameInMap("IpAddress")
        private String ipAddress;

        @NameInMap("OperationLocks")
        private OperationLocks operationLocks;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        private EipAddress(Builder builder) {
            this.allocationId = builder.allocationId;
            this.allocationTime = builder.allocationTime;
            this.bandwidth = builder.bandwidth;
            this.chargeType = builder.chargeType;
            this.eipBandwidth = builder.eipBandwidth;
            this.expiredTime = builder.expiredTime;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.internetChargeType = builder.internetChargeType;
            this.ipAddress = builder.ipAddress;
            this.operationLocks = builder.operationLocks;
            this.regionId = builder.regionId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipAddress create() {
            return builder().build();
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return allocationTime
         */
        public String getAllocationTime() {
            return this.allocationTime;
        }

        /**
         * @return bandwidth
         */
        public String getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return eipBandwidth
         */
        public String getEipBandwidth() {
            return this.eipBandwidth;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return operationLocks
         */
        public OperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String allocationId; 
            private String allocationTime; 
            private String bandwidth; 
            private String chargeType; 
            private String eipBandwidth; 
            private String expiredTime; 
            private String instanceId; 
            private String instanceType; 
            private String internetChargeType; 
            private String ipAddress; 
            private OperationLocks operationLocks; 
            private String regionId; 
            private String status; 

            /**
             * AllocationId.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * AllocationTime.
             */
            public Builder allocationTime(String allocationTime) {
                this.allocationTime = allocationTime;
                return this;
            }

            /**
             * Bandwidth.
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * EipBandwidth.
             */
            public Builder eipBandwidth(String eipBandwidth) {
                this.eipBandwidth = eipBandwidth;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
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
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * InternetChargeType.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * IpAddress.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * OperationLocks.
             */
            public Builder operationLocks(OperationLocks operationLocks) {
                this.operationLocks = operationLocks;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EipAddress build() {
                return new EipAddress(this);
            } 

        } 

    }
    public static class EipAddresses extends TeaModel {
        @NameInMap("EipAddress")
        private java.util.List < EipAddress> eipAddress;

        private EipAddresses(Builder builder) {
            this.eipAddress = builder.eipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipAddresses create() {
            return builder().build();
        }

        /**
         * @return eipAddress
         */
        public java.util.List < EipAddress> getEipAddress() {
            return this.eipAddress;
        }

        public static final class Builder {
            private java.util.List < EipAddress> eipAddress; 

            /**
             * EipAddress.
             */
            public Builder eipAddress(java.util.List < EipAddress> eipAddress) {
                this.eipAddress = eipAddress;
                return this;
            }

            public EipAddresses build() {
                return new EipAddresses(this);
            } 

        } 

    }
}