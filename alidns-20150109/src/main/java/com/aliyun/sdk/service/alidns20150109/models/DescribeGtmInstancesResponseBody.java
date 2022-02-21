// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGtmInstancesResponseBody</p>
 */
public class DescribeGtmInstancesResponseBody extends TeaModel {
    @NameInMap("GtmInstances")
    private GtmInstances gtmInstances;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalItems")
    private Integer totalItems;

    @NameInMap("TotalPages")
    private Integer totalPages;

    private DescribeGtmInstancesResponseBody(Builder builder) {
        this.gtmInstances = builder.gtmInstances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGtmInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return gtmInstances
     */
    public GtmInstances getGtmInstances() {
        return this.gtmInstances;
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
     * @return totalItems
     */
    public Integer getTotalItems() {
        return this.totalItems;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private GtmInstances gtmInstances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 

        /**
         * GtmInstances.
         */
        public Builder gtmInstances(GtmInstances gtmInstances) {
            this.gtmInstances = gtmInstances;
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
         * TotalItems.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * TotalPages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeGtmInstancesResponseBody build() {
            return new DescribeGtmInstancesResponseBody(this);
        } 

    } 

    public static class GtmInstance extends TeaModel {
        @NameInMap("AccessStrategyNum")
        private Integer accessStrategyNum;

        @NameInMap("AddressPoolNum")
        private Integer addressPoolNum;

        @NameInMap("AlertGroup")
        private String alertGroup;

        @NameInMap("Cname")
        private String cname;

        @NameInMap("CnameMode")
        private String cnameMode;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("ExpireTimestamp")
        private Long expireTimestamp;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("LbaStrategy")
        private String lbaStrategy;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Ttl")
        private Integer ttl;

        @NameInMap("UserDomainName")
        private String userDomainName;

        @NameInMap("VersionCode")
        private String versionCode;

        private GtmInstance(Builder builder) {
            this.accessStrategyNum = builder.accessStrategyNum;
            this.addressPoolNum = builder.addressPoolNum;
            this.alertGroup = builder.alertGroup;
            this.cname = builder.cname;
            this.cnameMode = builder.cnameMode;
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.expireTime = builder.expireTime;
            this.expireTimestamp = builder.expireTimestamp;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.lbaStrategy = builder.lbaStrategy;
            this.resourceGroupId = builder.resourceGroupId;
            this.ttl = builder.ttl;
            this.userDomainName = builder.userDomainName;
            this.versionCode = builder.versionCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GtmInstance create() {
            return builder().build();
        }

        /**
         * @return accessStrategyNum
         */
        public Integer getAccessStrategyNum() {
            return this.accessStrategyNum;
        }

        /**
         * @return addressPoolNum
         */
        public Integer getAddressPoolNum() {
            return this.addressPoolNum;
        }

        /**
         * @return alertGroup
         */
        public String getAlertGroup() {
            return this.alertGroup;
        }

        /**
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return cnameMode
         */
        public String getCnameMode() {
            return this.cnameMode;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return expireTimestamp
         */
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
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
         * @return lbaStrategy
         */
        public String getLbaStrategy() {
            return this.lbaStrategy;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return ttl
         */
        public Integer getTtl() {
            return this.ttl;
        }

        /**
         * @return userDomainName
         */
        public String getUserDomainName() {
            return this.userDomainName;
        }

        /**
         * @return versionCode
         */
        public String getVersionCode() {
            return this.versionCode;
        }

        public static final class Builder {
            private Integer accessStrategyNum; 
            private Integer addressPoolNum; 
            private String alertGroup; 
            private String cname; 
            private String cnameMode; 
            private String createTime; 
            private Long createTimestamp; 
            private String expireTime; 
            private Long expireTimestamp; 
            private String instanceId; 
            private String instanceName; 
            private String lbaStrategy; 
            private String resourceGroupId; 
            private Integer ttl; 
            private String userDomainName; 
            private String versionCode; 

            /**
             * AccessStrategyNum.
             */
            public Builder accessStrategyNum(Integer accessStrategyNum) {
                this.accessStrategyNum = accessStrategyNum;
                return this;
            }

            /**
             * AddressPoolNum.
             */
            public Builder addressPoolNum(Integer addressPoolNum) {
                this.addressPoolNum = addressPoolNum;
                return this;
            }

            /**
             * AlertGroup.
             */
            public Builder alertGroup(String alertGroup) {
                this.alertGroup = alertGroup;
                return this;
            }

            /**
             * Cname.
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * CnameMode.
             */
            public Builder cnameMode(String cnameMode) {
                this.cnameMode = cnameMode;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * ExpireTimestamp.
             */
            public Builder expireTimestamp(Long expireTimestamp) {
                this.expireTimestamp = expireTimestamp;
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
             * LbaStrategy.
             */
            public Builder lbaStrategy(String lbaStrategy) {
                this.lbaStrategy = lbaStrategy;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Ttl.
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * UserDomainName.
             */
            public Builder userDomainName(String userDomainName) {
                this.userDomainName = userDomainName;
                return this;
            }

            /**
             * VersionCode.
             */
            public Builder versionCode(String versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            public GtmInstance build() {
                return new GtmInstance(this);
            } 

        } 

    }
    public static class GtmInstances extends TeaModel {
        @NameInMap("GtmInstance")
        private java.util.List < GtmInstance> gtmInstance;

        private GtmInstances(Builder builder) {
            this.gtmInstance = builder.gtmInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GtmInstances create() {
            return builder().build();
        }

        /**
         * @return gtmInstance
         */
        public java.util.List < GtmInstance> getGtmInstance() {
            return this.gtmInstance;
        }

        public static final class Builder {
            private java.util.List < GtmInstance> gtmInstance; 

            /**
             * GtmInstance.
             */
            public Builder gtmInstance(java.util.List < GtmInstance> gtmInstance) {
                this.gtmInstance = gtmInstance;
                return this;
            }

            public GtmInstances build() {
                return new GtmInstances(this);
            } 

        } 

    }
}