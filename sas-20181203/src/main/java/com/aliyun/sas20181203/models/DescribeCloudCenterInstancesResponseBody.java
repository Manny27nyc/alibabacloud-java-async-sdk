// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeCloudCenterInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudCenterInstancesResponseBody</p>
 */
public class DescribeCloudCenterInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;


    private DescribeCloudCenterInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudCenterInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List < Instances> instances; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>Instances.</p>
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>PageInfo.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
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
         * <p>Success.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCloudCenterInstancesResponseBody build() {
            return new DescribeCloudCenterInstancesResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @NameInMap("AlarmStatus")
        private String alarmStatus;

        @NameInMap("AssetType")
        private String assetType;

        @NameInMap("AuthModifyTime")
        private Long authModifyTime;

        @NameInMap("AuthVersion")
        private Integer authVersion;

        @NameInMap("AuthVersionName")
        private String authVersionName;

        @NameInMap("Bind")
        private Boolean bind;

        @NameInMap("ClientStatus")
        private String clientStatus;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("Cores")
        private Integer cores;

        @NameInMap("CpuInfo")
        private String cpuInfo;

        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("ExposedStatus")
        private Integer exposedStatus;

        @NameInMap("Flag")
        private Integer flag;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupTrace")
        private String groupTrace;

        @NameInMap("HcStatus")
        private String hcStatus;

        @NameInMap("HealthCheckCount")
        private Integer healthCheckCount;

        @NameInMap("Importance")
        private Integer importance;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("IpListString")
        private String ipListString;

        @NameInMap("Kernel")
        private String kernel;

        @NameInMap("LastLoginTimestamp")
        private Long lastLoginTimestamp;

        @NameInMap("MacListString")
        private String macListString;

        @NameInMap("Mem")
        private Integer mem;

        @NameInMap("Os")
        private String os;

        @NameInMap("OsName")
        private String osName;

        @NameInMap("PodCount")
        private Integer podCount;

        @NameInMap("Region")
        private String region;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegionName")
        private String regionName;

        @NameInMap("RiskCount")
        private String riskCount;

        @NameInMap("RiskStatus")
        private String riskStatus;

        @NameInMap("SafeEventCount")
        private Integer safeEventCount;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("TagId")
        private String tagId;

        @NameInMap("Uuid")
        private String uuid;

        @NameInMap("Vendor")
        private Integer vendor;

        @NameInMap("VendorName")
        private String vendorName;

        @NameInMap("VpcInstanceId")
        private String vpcInstanceId;

        @NameInMap("VulCount")
        private Integer vulCount;

        @NameInMap("VulStatus")
        private String vulStatus;


        private Instances(Builder builder) {
            this.alarmStatus = builder.alarmStatus;
            this.assetType = builder.assetType;
            this.authModifyTime = builder.authModifyTime;
            this.authVersion = builder.authVersion;
            this.authVersionName = builder.authVersionName;
            this.bind = builder.bind;
            this.clientStatus = builder.clientStatus;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.cores = builder.cores;
            this.cpuInfo = builder.cpuInfo;
            this.createdTime = builder.createdTime;
            this.exposedStatus = builder.exposedStatus;
            this.flag = builder.flag;
            this.groupId = builder.groupId;
            this.groupTrace = builder.groupTrace;
            this.hcStatus = builder.hcStatus;
            this.healthCheckCount = builder.healthCheckCount;
            this.importance = builder.importance;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.ip = builder.ip;
            this.ipListString = builder.ipListString;
            this.kernel = builder.kernel;
            this.lastLoginTimestamp = builder.lastLoginTimestamp;
            this.macListString = builder.macListString;
            this.mem = builder.mem;
            this.os = builder.os;
            this.osName = builder.osName;
            this.podCount = builder.podCount;
            this.region = builder.region;
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
            this.riskCount = builder.riskCount;
            this.riskStatus = builder.riskStatus;
            this.safeEventCount = builder.safeEventCount;
            this.status = builder.status;
            this.tag = builder.tag;
            this.tagId = builder.tagId;
            this.uuid = builder.uuid;
            this.vendor = builder.vendor;
            this.vendorName = builder.vendorName;
            this.vpcInstanceId = builder.vpcInstanceId;
            this.vulCount = builder.vulCount;
            this.vulStatus = builder.vulStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return alarmStatus
         */
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        /**
         * @return assetType
         */
        public String getAssetType() {
            return this.assetType;
        }

        /**
         * @return authModifyTime
         */
        public Long getAuthModifyTime() {
            return this.authModifyTime;
        }

        /**
         * @return authVersion
         */
        public Integer getAuthVersion() {
            return this.authVersion;
        }

        /**
         * @return authVersionName
         */
        public String getAuthVersionName() {
            return this.authVersionName;
        }

        /**
         * @return bind
         */
        public Boolean getBind() {
            return this.bind;
        }

        /**
         * @return clientStatus
         */
        public String getClientStatus() {
            return this.clientStatus;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return cores
         */
        public Integer getCores() {
            return this.cores;
        }

        /**
         * @return cpuInfo
         */
        public String getCpuInfo() {
            return this.cpuInfo;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return exposedStatus
         */
        public Integer getExposedStatus() {
            return this.exposedStatus;
        }

        /**
         * @return flag
         */
        public Integer getFlag() {
            return this.flag;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupTrace
         */
        public String getGroupTrace() {
            return this.groupTrace;
        }

        /**
         * @return hcStatus
         */
        public String getHcStatus() {
            return this.hcStatus;
        }

        /**
         * @return healthCheckCount
         */
        public Integer getHealthCheckCount() {
            return this.healthCheckCount;
        }

        /**
         * @return importance
         */
        public Integer getImportance() {
            return this.importance;
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
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return ipListString
         */
        public String getIpListString() {
            return this.ipListString;
        }

        /**
         * @return kernel
         */
        public String getKernel() {
            return this.kernel;
        }

        /**
         * @return lastLoginTimestamp
         */
        public Long getLastLoginTimestamp() {
            return this.lastLoginTimestamp;
        }

        /**
         * @return macListString
         */
        public String getMacListString() {
            return this.macListString;
        }

        /**
         * @return mem
         */
        public Integer getMem() {
            return this.mem;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return osName
         */
        public String getOsName() {
            return this.osName;
        }

        /**
         * @return podCount
         */
        public Integer getPodCount() {
            return this.podCount;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return riskCount
         */
        public String getRiskCount() {
            return this.riskCount;
        }

        /**
         * @return riskStatus
         */
        public String getRiskStatus() {
            return this.riskStatus;
        }

        /**
         * @return safeEventCount
         */
        public Integer getSafeEventCount() {
            return this.safeEventCount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return tagId
         */
        public String getTagId() {
            return this.tagId;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return vendor
         */
        public Integer getVendor() {
            return this.vendor;
        }

        /**
         * @return vendorName
         */
        public String getVendorName() {
            return this.vendorName;
        }

        /**
         * @return vpcInstanceId
         */
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        /**
         * @return vulCount
         */
        public Integer getVulCount() {
            return this.vulCount;
        }

        /**
         * @return vulStatus
         */
        public String getVulStatus() {
            return this.vulStatus;
        }

        public static final class Builder {
            private String alarmStatus; 
            private String assetType; 
            private Long authModifyTime; 
            private Integer authVersion; 
            private String authVersionName; 
            private Boolean bind; 
            private String clientStatus; 
            private String clusterId; 
            private String clusterName; 
            private Integer cores; 
            private String cpuInfo; 
            private Long createdTime; 
            private Integer exposedStatus; 
            private Integer flag; 
            private String groupId; 
            private String groupTrace; 
            private String hcStatus; 
            private Integer healthCheckCount; 
            private Integer importance; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String ip; 
            private String ipListString; 
            private String kernel; 
            private Long lastLoginTimestamp; 
            private String macListString; 
            private Integer mem; 
            private String os; 
            private String osName; 
            private Integer podCount; 
            private String region; 
            private String regionId; 
            private String regionName; 
            private String riskCount; 
            private String riskStatus; 
            private Integer safeEventCount; 
            private String status; 
            private String tag; 
            private String tagId; 
            private String uuid; 
            private Integer vendor; 
            private String vendorName; 
            private String vpcInstanceId; 
            private Integer vulCount; 
            private String vulStatus; 

            /**
             * <p>AlarmStatus.</p>
             */
            public Builder alarmStatus(String alarmStatus) {
                this.alarmStatus = alarmStatus;
                return this;
            }

            /**
             * <p>AssetType.</p>
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>AuthModifyTime.</p>
             */
            public Builder authModifyTime(Long authModifyTime) {
                this.authModifyTime = authModifyTime;
                return this;
            }

            /**
             * <p>AuthVersion.</p>
             */
            public Builder authVersion(Integer authVersion) {
                this.authVersion = authVersion;
                return this;
            }

            /**
             * <p>AuthVersionName.</p>
             */
            public Builder authVersionName(String authVersionName) {
                this.authVersionName = authVersionName;
                return this;
            }

            /**
             * <p>Bind.</p>
             */
            public Builder bind(Boolean bind) {
                this.bind = bind;
                return this;
            }

            /**
             * <p>ClientStatus.</p>
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
                return this;
            }

            /**
             * <p>ClusterId.</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>ClusterName.</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>Cores.</p>
             */
            public Builder cores(Integer cores) {
                this.cores = cores;
                return this;
            }

            /**
             * <p>CpuInfo.</p>
             */
            public Builder cpuInfo(String cpuInfo) {
                this.cpuInfo = cpuInfo;
                return this;
            }

            /**
             * <p>CreatedTime.</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>ExposedStatus.</p>
             */
            public Builder exposedStatus(Integer exposedStatus) {
                this.exposedStatus = exposedStatus;
                return this;
            }

            /**
             * <p>Flag.</p>
             */
            public Builder flag(Integer flag) {
                this.flag = flag;
                return this;
            }

            /**
             * <p>GroupId.</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>GroupTrace.</p>
             */
            public Builder groupTrace(String groupTrace) {
                this.groupTrace = groupTrace;
                return this;
            }

            /**
             * <p>HcStatus.</p>
             */
            public Builder hcStatus(String hcStatus) {
                this.hcStatus = hcStatus;
                return this;
            }

            /**
             * <p>HealthCheckCount.</p>
             */
            public Builder healthCheckCount(Integer healthCheckCount) {
                this.healthCheckCount = healthCheckCount;
                return this;
            }

            /**
             * <p>Importance.</p>
             */
            public Builder importance(Integer importance) {
                this.importance = importance;
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
             * <p>Ip.</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>IpListString.</p>
             */
            public Builder ipListString(String ipListString) {
                this.ipListString = ipListString;
                return this;
            }

            /**
             * <p>Kernel.</p>
             */
            public Builder kernel(String kernel) {
                this.kernel = kernel;
                return this;
            }

            /**
             * <p>LastLoginTimestamp.</p>
             */
            public Builder lastLoginTimestamp(Long lastLoginTimestamp) {
                this.lastLoginTimestamp = lastLoginTimestamp;
                return this;
            }

            /**
             * <p>MacListString.</p>
             */
            public Builder macListString(String macListString) {
                this.macListString = macListString;
                return this;
            }

            /**
             * <p>Mem.</p>
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            /**
             * <p>Os.</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>OsName.</p>
             */
            public Builder osName(String osName) {
                this.osName = osName;
                return this;
            }

            /**
             * <p>PodCount.</p>
             */
            public Builder podCount(Integer podCount) {
                this.podCount = podCount;
                return this;
            }

            /**
             * <p>Region.</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>RegionId.</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>RegionName.</p>
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * <p>RiskCount.</p>
             */
            public Builder riskCount(String riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * <p>RiskStatus.</p>
             */
            public Builder riskStatus(String riskStatus) {
                this.riskStatus = riskStatus;
                return this;
            }

            /**
             * <p>SafeEventCount.</p>
             */
            public Builder safeEventCount(Integer safeEventCount) {
                this.safeEventCount = safeEventCount;
                return this;
            }

            /**
             * <p>Status.</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Tag.</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>TagId.</p>
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * <p>Uuid.</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>Vendor.</p>
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            /**
             * <p>VendorName.</p>
             */
            public Builder vendorName(String vendorName) {
                this.vendorName = vendorName;
                return this;
            }

            /**
             * <p>VpcInstanceId.</p>
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            /**
             * <p>VulCount.</p>
             */
            public Builder vulCount(Integer vulCount) {
                this.vulCount = vulCount;
                return this;
            }

            /**
             * <p>VulStatus.</p>
             */
            public Builder vulStatus(String vulStatus) {
                this.vulStatus = vulStatus;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

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
             * <p>Count.</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>CurrentPage.</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>PageSize.</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>TotalCount.</p>
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
}
