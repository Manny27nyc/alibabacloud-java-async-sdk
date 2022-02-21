// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDisksRequest} extends {@link RequestModel}
 *
 * <p>DescribeDisksRequest</p>
 */
public class DescribeDisksRequest extends Request {
    @NameInMap("Filter")
    private java.util.List < Filter> filter;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("SnapshotId")
    private String snapshotId;

    @Query
    @NameInMap("DeleteAutoSnapshot")
    private Boolean deleteAutoSnapshot;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("EnableAutoSnapshot")
    private Boolean enableAutoSnapshot;

    @Query
    @NameInMap("EnableAutomatedSnapshotPolicy")
    private Boolean enableAutomatedSnapshotPolicy;

    @Query
    @NameInMap("LockReason")
    private String lockReason;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("KMSKeyId")
    private String KMSKeyId;

    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("EnableShared")
    private Boolean enableShared;

    @Query
    @NameInMap("Encrypted")
    private Boolean encrypted;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DiskType")
    private String diskType;

    @Query
    @NameInMap("Portable")
    private Boolean portable;

    @Query
    @NameInMap("DiskChargeType")
    private String diskChargeType;

    @Query
    @NameInMap("MultiAttach")
    private String multiAttach;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("DiskIds")
    private String diskIds;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("AutoSnapshotPolicyId")
    private String autoSnapshotPolicyId;

    @Query
    @NameInMap("DeleteWithInstance")
    private Boolean deleteWithInstance;

    @Query
    @NameInMap("DiskName")
    private String diskName;

    @Query
    @NameInMap("AdditionalAttributes")
    private java.util.List < String > additionalAttributes;

    private DescribeDisksRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.tag = builder.tag;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.zoneId = builder.zoneId;
        this.instanceId = builder.instanceId;
        this.snapshotId = builder.snapshotId;
        this.deleteAutoSnapshot = builder.deleteAutoSnapshot;
        this.nextToken = builder.nextToken;
        this.enableAutoSnapshot = builder.enableAutoSnapshot;
        this.enableAutomatedSnapshotPolicy = builder.enableAutomatedSnapshotPolicy;
        this.lockReason = builder.lockReason;
        this.dryRun = builder.dryRun;
        this.KMSKeyId = builder.KMSKeyId;
        this.category = builder.category;
        this.enableShared = builder.enableShared;
        this.encrypted = builder.encrypted;
        this.pageNumber = builder.pageNumber;
        this.maxResults = builder.maxResults;
        this.regionId = builder.regionId;
        this.diskType = builder.diskType;
        this.portable = builder.portable;
        this.diskChargeType = builder.diskChargeType;
        this.multiAttach = builder.multiAttach;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.ownerId = builder.ownerId;
        this.diskIds = builder.diskIds;
        this.pageSize = builder.pageSize;
        this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
        this.deleteWithInstance = builder.deleteWithInstance;
        this.diskName = builder.diskName;
        this.additionalAttributes = builder.additionalAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDisksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filter
     */
    public java.util.List < Filter> getFilter() {
        return this.filter;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return deleteAutoSnapshot
     */
    public Boolean getDeleteAutoSnapshot() {
        return this.deleteAutoSnapshot;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return enableAutoSnapshot
     */
    public Boolean getEnableAutoSnapshot() {
        return this.enableAutoSnapshot;
    }

    /**
     * @return enableAutomatedSnapshotPolicy
     */
    public Boolean getEnableAutomatedSnapshotPolicy() {
        return this.enableAutomatedSnapshotPolicy;
    }

    /**
     * @return lockReason
     */
    public String getLockReason() {
        return this.lockReason;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return KMSKeyId
     */
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return enableShared
     */
    public Boolean getEnableShared() {
        return this.enableShared;
    }

    /**
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return diskType
     */
    public String getDiskType() {
        return this.diskType;
    }

    /**
     * @return portable
     */
    public Boolean getPortable() {
        return this.portable;
    }

    /**
     * @return diskChargeType
     */
    public String getDiskChargeType() {
        return this.diskChargeType;
    }

    /**
     * @return multiAttach
     */
    public String getMultiAttach() {
        return this.multiAttach;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return diskIds
     */
    public String getDiskIds() {
        return this.diskIds;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return autoSnapshotPolicyId
     */
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    /**
     * @return deleteWithInstance
     */
    public Boolean getDeleteWithInstance() {
        return this.deleteWithInstance;
    }

    /**
     * @return diskName
     */
    public String getDiskName() {
        return this.diskName;
    }

    /**
     * @return additionalAttributes
     */
    public java.util.List < String > getAdditionalAttributes() {
        return this.additionalAttributes;
    }

    public static final class Builder extends Request.Builder<DescribeDisksRequest, Builder> {
        private java.util.List < Filter> filter; 
        private String sourceRegionId; 
        private String ownerAccount; 
        private java.util.List < Tag> tag; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String zoneId; 
        private String instanceId; 
        private String snapshotId; 
        private Boolean deleteAutoSnapshot; 
        private String nextToken; 
        private Boolean enableAutoSnapshot; 
        private Boolean enableAutomatedSnapshotPolicy; 
        private String lockReason; 
        private Boolean dryRun; 
        private String KMSKeyId; 
        private String category; 
        private Boolean enableShared; 
        private Boolean encrypted; 
        private Integer pageNumber; 
        private Integer maxResults; 
        private String regionId; 
        private String diskType; 
        private Boolean portable; 
        private String diskChargeType; 
        private String multiAttach; 
        private String resourceGroupId; 
        private String status; 
        private Long ownerId; 
        private String diskIds; 
        private Integer pageSize; 
        private String autoSnapshotPolicyId; 
        private Boolean deleteWithInstance; 
        private String diskName; 
        private java.util.List < String > additionalAttributes; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDisksRequest response) {
            super(response);
            this.filter = response.filter;
            this.sourceRegionId = response.sourceRegionId;
            this.ownerAccount = response.ownerAccount;
            this.tag = response.tag;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.zoneId = response.zoneId;
            this.instanceId = response.instanceId;
            this.snapshotId = response.snapshotId;
            this.deleteAutoSnapshot = response.deleteAutoSnapshot;
            this.nextToken = response.nextToken;
            this.enableAutoSnapshot = response.enableAutoSnapshot;
            this.enableAutomatedSnapshotPolicy = response.enableAutomatedSnapshotPolicy;
            this.lockReason = response.lockReason;
            this.dryRun = response.dryRun;
            this.KMSKeyId = response.KMSKeyId;
            this.category = response.category;
            this.enableShared = response.enableShared;
            this.encrypted = response.encrypted;
            this.pageNumber = response.pageNumber;
            this.maxResults = response.maxResults;
            this.regionId = response.regionId;
            this.diskType = response.diskType;
            this.portable = response.portable;
            this.diskChargeType = response.diskChargeType;
            this.multiAttach = response.multiAttach;
            this.resourceGroupId = response.resourceGroupId;
            this.status = response.status;
            this.ownerId = response.ownerId;
            this.diskIds = response.diskIds;
            this.pageSize = response.pageSize;
            this.autoSnapshotPolicyId = response.autoSnapshotPolicyId;
            this.deleteWithInstance = response.deleteWithInstance;
            this.diskName = response.diskName;
            this.additionalAttributes = response.additionalAttributes;
        } 

        /**
         * Filter.
         */
        public Builder filter(java.util.List < Filter> filter) {
            this.filter = filter;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The account name of the resource master account.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the zone.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The ID of the instance to which the cloud disk or local disk is attached.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the snapshot used to create the disk.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * Indicates whether automatic snapshots are released at the same time when the disk is released.
         * <p>
         * 
         * Default value: false
         */
        public Builder deleteAutoSnapshot(Boolean deleteAutoSnapshot) {
            this.putQueryParameter("DeleteAutoSnapshot", deleteAutoSnapshot);
            this.deleteAutoSnapshot = deleteAutoSnapshot;
            return this;
        }

        /**
         * The Token returned by the last API call.
         * <p>
         * 
         * For more information about how to view the returned data, see the preceding API description.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Specifies whether to enable automatic snapshot policies for disks.
         * <p>
         * 
         * -true: enabled
         * -false: Disabled
         * 
         * > by default, the automatic snapshot policy function is enabled for the created Cloud Disk. You only need to bind an automatic snapshot policy to the cloud disk to use it.
         */
        public Builder enableAutoSnapshot(Boolean enableAutoSnapshot) {
            this.putQueryParameter("EnableAutoSnapshot", enableAutoSnapshot);
            this.enableAutoSnapshot = enableAutoSnapshot;
            return this;
        }

        /**
         * Indicates whether the automatic snapshot policy is set for the disk.
         * <p>
         * -true: set
         * -false: not set
         * 
         * Default value: false
         */
        public Builder enableAutomatedSnapshotPolicy(Boolean enableAutomatedSnapshotPolicy) {
            this.putQueryParameter("EnableAutomatedSnapshotPolicy", enableAutomatedSnapshotPolicy);
            this.enableAutomatedSnapshotPolicy = enableAutomatedSnapshotPolicy;
            return this;
        }

        /**
         * The reason why the cloud disk or local disk is locked. Valid values:
         * <p>
         * 
         * -financial: locked due to overdue payments.
         * -security: locked for security reasons.
         * -recycling: the status of the preemptible instance to be released is locked.
         * -dedicatedhostfinancial: the ECS instance is locked because the dedicated host is overdue.
         */
        public Builder lockReason(String lockReason) {
            this.putQueryParameter("LockReason", lockReason);
            this.lockReason = lockReason;
            return this;
        }

        /**
         * Specifies whether to PreCheck only this request. Valid values:
         * <p>
         * 
         * -true: sends a check request without querying the resource status. Check whether the AccessKey is valid, whether the RAM user is authorized, and whether required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, the error code "DryRunOperation" is returned ".
         * -false: a normal request is sent. After the request passes the check, the 2XX HTTP status code is returned and the resource status is directly queried.
         * 
         * Default value: false
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The ID of the KMS key used by the cloud disk.
         */
        public Builder KMSKeyId(String KMSKeyId) {
            this.putQueryParameter("KMSKeyId", KMSKeyId);
            this.KMSKeyId = KMSKeyId;
            return this;
        }

        /**
         * The type of the cloud disk or local disk. Valid values:
         * <p>
         * 
         * -all: all cloud disks and local disks
         * -cloud: basic cloud disk
         * -cloud_efficiency: Ultra disk
         * -cloud_ssd:SSD
         * -cloud_essd:ESSD
         * -local_ssd_pro:I/O-intensive local disks
         * -local_hdd_pro: Throughput-intensive local disks
         * -ephemeral:(discontinued) local disk
         * -ephemeral_ssd:(phased out) local SSD
         * 
         * Default value: all
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * Indicates whether the storage class is shared block storage.
         */
        public Builder enableShared(Boolean enableShared) {
            this.putQueryParameter("EnableShared", enableShared);
            this.enableShared = enableShared;
            return this;
        }

        /**
         * Specifies whether to filter out only encrypted disks.
         * <p>
         * 
         * Default value: false
         */
        public Builder encrypted(Boolean encrypted) {
            this.putQueryParameter("Encrypted", encrypted);
            this.encrypted = encrypted;
            return this;
        }

        /**
         * The page number of the status list of the cloud disk or local disk.
         * <p>
         * 
         * Start value: 1
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The maximum number of entries returned. Valid values: 1 to 500.
         * <p>
         * 
         * Default value: 10.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The ID of the region to which the block storage belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of the cloud disk or local disk to be queried. Valid values:
         * <p>
         * 
         * -all: query both the system disk and the data disk.
         * -system: only system disks are queried.
         * -data: only data disks are queried.
         * 
         * Default value: all
         */
        public Builder diskType(String diskType) {
            this.putQueryParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * Whether the cloud disk or local disk can be detached. Valid values:
         * <p>
         * 
         * -true: supported. Can exist independently, and can be freely mounted and unmounted in the zone.
         * 
         * -false: not supported. It cannot exist independently and cannot be mounted or unmounted freely in the zone.
         * 
         * The "Portable" attribute of the following block storage types is "false", and the lifecycle is the same as that of the instance:
         * 
         * -Local disk
         * -Local SSD
         * -Subscription data disk
         */
        public Builder portable(Boolean portable) {
            this.putQueryParameter("Portable", portable);
            this.portable = portable;
            return this;
        }

        /**
         * The billing method of the cloud disk or local disk. Valid values:
         * <p>
         * 
         * -PrePaid: Subscription
         * -PostPaid: pay-as-you-go
         */
        public Builder diskChargeType(String diskChargeType) {
            this.putQueryParameter("DiskChargeType", diskChargeType);
            this.diskChargeType = diskChargeType;
            return this;
        }

        /**
         * Indicates whether the multi-Mount feature is enabled. Valid values:
         * <p>
         * 
         * -Disabled: Disabled
         * -Enabled: Enabled
         * -LegacyShared: used to query shared block storage
         * 
         * <props = "china"> the multi-Mount feature is being invited for testing. To use this feature, [submit a ticket](https://selfservice.console.aliyun.com/ticket/createIndex). </props>
         * 
         * <props = "intl"> the multi-Mount feature is being invited for testing. To use this feature, [submit a ticket](https://workorder-intl.console.aliyun.com/console.htm#/ticket/list). </props>
         * 
         * <props = "partner"> the multi-Mount feature is being invited for testing. If you need to use this feature, submit a ticket. </props>
         */
        public Builder multiAttach(String multiAttach) {
            this.putQueryParameter("MultiAttach", multiAttach);
            this.multiAttach = multiAttach;
            return this;
        }

        /**
         * The ID of the enterprise resource group to which the cloud disk or local disk belongs. When you use this parameter to filter resources, the number of resources cannot exceed 1,000.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The status of the disk. For more information, see [disk status](~~ 25689 ~~). Valid values:
         * <p>
         * 
         * -In_use
         * -Available
         * -Attaching
         * -Detaching
         * -Creating
         * -ReIniting
         * -All
         * 
         * Default value: All
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The ID of the RAM user.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The ID of the cloud disk or local disk. A JSON Array with a maximum of 100 IDs. Separate multiple IDs with commas (,).
         */
        public Builder diskIds(String diskIds) {
            this.putQueryParameter("DiskIds", diskIds);
            this.diskIds = diskIds;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Maximum Value: 100
         * 
         * Default value: 10
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Queries disks based on the ID of the automatic snapshot policy.
         */
        public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.putQueryParameter("AutoSnapshotPolicyId", autoSnapshotPolicyId);
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }

        /**
         * Indicates whether the disk is released with the instance. Valid values:
         * <p>
         * 
         * -true: the disk is released along with the instance.
         * -false: The disk is retained but not released. It is converted to a pay-as-you-go data disk.
         * 
         * Default value: false
         */
        public Builder deleteWithInstance(Boolean deleteWithInstance) {
            this.putQueryParameter("DeleteWithInstance", deleteWithInstance);
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }

        /**
         * Cloud or local disk name.
         */
        public Builder diskName(String diskName) {
            this.putQueryParameter("DiskName", diskName);
            this.diskName = diskName;
            return this;
        }

        /**
         * Other property values. Currently supports only incoming values for IOPS, represents the query current disk IOPS limit.
         */
        public Builder additionalAttributes(java.util.List < String > additionalAttributes) {
            this.putQueryParameter("AdditionalAttributes", additionalAttributes);
            this.additionalAttributes = additionalAttributes;
            return this;
        }

        @Override
        public DescribeDisksRequest build() {
            return new DescribeDisksRequest(this);
        } 

    } 

    public static class Filter extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Filter(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The filter key used to query resources. The value must be "CreationStartTime ". Set "Filter.1.Key" and "Filter.1.Value" to query resource information created after a specified time point.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The filter value when you query resources. When you specify this parameter, you must specify the "Filter.1.Key" parameter in the format of "yyyy-MM-ddTHH:mmZ", in UTC +0 time zone.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * 云盘或本地盘的标签键。
             * <p>
             * 
             * >为提高代码兼容性，请尽量使用Tag.N.Key参数。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 云盘或本地盘的标签值。N的取值范围：1~20
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}