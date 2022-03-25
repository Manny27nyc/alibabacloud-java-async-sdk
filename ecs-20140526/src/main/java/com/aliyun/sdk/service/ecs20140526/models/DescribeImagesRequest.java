// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImagesRequest} extends {@link RequestModel}
 *
 * <p>DescribeImagesRequest</p>
 */
public class DescribeImagesRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("Filter")
    private java.util.List < Filter> filter;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("ImageName")
    private String imageName;

    @Query
    @NameInMap("IsSupportIoOptimized")
    private Boolean isSupportIoOptimized;

    @Query
    @NameInMap("OSType")
    private String OSType;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ImageOwnerAlias")
    private String imageOwnerAlias;

    @Query
    @NameInMap("SnapshotId")
    private String snapshotId;

    @Query
    @NameInMap("Architecture")
    private String architecture;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("IsSupportCloudinit")
    private Boolean isSupportCloudinit;

    @Query
    @NameInMap("ImageFamily")
    private String imageFamily;

    @Query
    @NameInMap("IsPublic")
    private Boolean isPublic;

    @Query
    @NameInMap("ActionType")
    private String actionType;

    @Query
    @NameInMap("Usage")
    private String usage;

    @Query
    @NameInMap("ShowExpired")
    private Boolean showExpired;

    @Query
    @NameInMap("ImageOwnerId")
    private Long imageOwnerId;

    private DescribeImagesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.filter = builder.filter;
        this.regionId = builder.regionId;
        this.status = builder.status;
        this.imageId = builder.imageId;
        this.imageName = builder.imageName;
        this.isSupportIoOptimized = builder.isSupportIoOptimized;
        this.OSType = builder.OSType;
        this.dryRun = builder.dryRun;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.imageOwnerAlias = builder.imageOwnerAlias;
        this.snapshotId = builder.snapshotId;
        this.architecture = builder.architecture;
        this.pageNumber = builder.pageNumber;
        this.instanceType = builder.instanceType;
        this.isSupportCloudinit = builder.isSupportCloudinit;
        this.imageFamily = builder.imageFamily;
        this.isPublic = builder.isPublic;
        this.actionType = builder.actionType;
        this.usage = builder.usage;
        this.showExpired = builder.showExpired;
        this.imageOwnerId = builder.imageOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return filter
     */
    public java.util.List < Filter> getFilter() {
        return this.filter;
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

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return isSupportIoOptimized
     */
    public Boolean getIsSupportIoOptimized() {
        return this.isSupportIoOptimized;
    }

    /**
     * @return OSType
     */
    public String getOSType() {
        return this.OSType;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return imageOwnerAlias
     */
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return architecture
     */
    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return isSupportCloudinit
     */
    public Boolean getIsSupportCloudinit() {
        return this.isSupportCloudinit;
    }

    /**
     * @return imageFamily
     */
    public String getImageFamily() {
        return this.imageFamily;
    }

    /**
     * @return isPublic
     */
    public Boolean getIsPublic() {
        return this.isPublic;
    }

    /**
     * @return actionType
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * @return usage
     */
    public String getUsage() {
        return this.usage;
    }

    /**
     * @return showExpired
     */
    public Boolean getShowExpired() {
        return this.showExpired;
    }

    /**
     * @return imageOwnerId
     */
    public Long getImageOwnerId() {
        return this.imageOwnerId;
    }

    public static final class Builder extends Request.Builder<DescribeImagesRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private java.util.List < Tag> tag; 
        private java.util.List < Filter> filter; 
        private String regionId; 
        private String status; 
        private String imageId; 
        private String imageName; 
        private Boolean isSupportIoOptimized; 
        private String OSType; 
        private Boolean dryRun; 
        private Integer pageSize; 
        private String resourceGroupId; 
        private String imageOwnerAlias; 
        private String snapshotId; 
        private String architecture; 
        private Integer pageNumber; 
        private String instanceType; 
        private Boolean isSupportCloudinit; 
        private String imageFamily; 
        private Boolean isPublic; 
        private String actionType; 
        private String usage; 
        private Boolean showExpired; 
        private Long imageOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImagesRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
            this.filter = request.filter;
            this.regionId = request.regionId;
            this.status = request.status;
            this.imageId = request.imageId;
            this.imageName = request.imageName;
            this.isSupportIoOptimized = request.isSupportIoOptimized;
            this.OSType = request.OSType;
            this.dryRun = request.dryRun;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
            this.imageOwnerAlias = request.imageOwnerAlias;
            this.snapshotId = request.snapshotId;
            this.architecture = request.architecture;
            this.pageNumber = request.pageNumber;
            this.instanceType = request.instanceType;
            this.isSupportCloudinit = request.isSupportCloudinit;
            this.imageFamily = request.imageFamily;
            this.isPublic = request.isPublic;
            this.actionType = request.actionType;
            this.usage = request.usage;
            this.showExpired = request.showExpired;
            this.imageOwnerId = request.imageOwnerId;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
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
         * Filter.
         */
        public Builder filter(java.util.List < Filter> filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * The ID of the region to which the image belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * You can call this operation to query images in a certain state. Valid values:
         * <p>
         * 
         * -Creating: The image is being created.
         * -Waiting: multiple tasks are being queued.
         * -Available (default): The image that you can use.
         * -UnAvailable: images that you cannot use.
         * -CreateFailed: the image fails to be created.
         * -Deprecated: Deprecated images.
         * 
         * Separate multiple values with commas (,).
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The ID of the image.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The name of the image.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * Indicates whether the image can run on an I/O optimized instance.
         */
        public Builder isSupportIoOptimized(Boolean isSupportIoOptimized) {
            this.putQueryParameter("IsSupportIoOptimized", isSupportIoOptimized);
            this.isSupportIoOptimized = isSupportIoOptimized;
            return this;
        }

        /**
         * The operating system type of the image. Valid values:
         * <p>
         * 
         * -Windows
         * -linux
         */
        public Builder OSType(String OSType) {
            this.putQueryParameter("OSType", OSType);
            this.OSType = OSType;
            return this;
        }

        /**
         * Specifies whether to PreCheck only this request.
         * <p>
         * 
         * -true: sends a check request without querying the resource status. Check whether the AccessKey is valid, whether the RAM user is authorized, and whether required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, an error code DryRunOperation is returned.
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
         * The number of entries to return on each page. Maximum Value: 100
         * <p>
         * 
         * Default value: 10
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the resource group to which the custom image belongs. When you use this parameter to filter resources, the number of resources cannot exceed 1,000.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The source of the image. Valid values:
         * <p>
         * 
         * <props="china">
         * -system: a public image provided by Alibaba Cloud.
         * -self: The custom image you created.
         * -others: images shared by other Alibaba Cloud users or published community images.
         * -marketplace: The image provided by the marketplace. You can directly use the cloud marketplace images that you query without subscribing to them in advance. You must pay attention to the billing details of Alibaba Cloud marketplace images.
         * 
         * </props>
         * 
         * <props="intl">
         * -system: a public image provided by Alibaba Cloud.
         * -self: The custom image you created.
         * -others: images shared by other Alibaba Cloud users or published community images. Note:
         * -The IsPublic must be true when you search for a community image.
         * -When you search for a shared image, you must set the IsPublic to false or leave no value.
         * -marketplace: The image provided by the marketplace. You can directly use the cloud marketplace images that you query without subscribing to them in advance. You must pay attention to the billing details of Alibaba Cloud marketplace images.
         * 
         * </props>
         * 
         * <props="partner">
         * -system: a public image provided by Alibaba Cloud.
         * -self: The custom image you created.
         * -others: images shared by other Alibaba Cloud users or published community images.
         * -marketplace: The image provided by the marketplace. You can directly use the cloud marketplace images that you query without subscribing to them in advance. You must pay attention to the billing details of Alibaba Cloud marketplace images.
         * 
         * </props>
         * 
         * Default value: NULL. Null indicates that the system, self, and others values are returned.
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        /**
         * A custom image created based on a snapshot ID.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * The architecture of the image. Valid values:
         * <p>
         * 
         * -i386
         * -x86_64
         * -arm64
         */
        public Builder architecture(String architecture) {
            this.putQueryParameter("Architecture", architecture);
            this.architecture = architecture;
            return this;
        }

        /**
         * The page number of the image resource list. Start value: 1
         * <p>
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * Specifies the images that can be used by the instance type.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Indicates whether the image supports cloud-init.
         */
        public Builder isSupportCloudinit(Boolean isSupportCloudinit) {
            this.putQueryParameter("IsSupportCloudinit", isSupportCloudinit);
            this.isSupportCloudinit = isSupportCloudinit;
            return this;
        }

        /**
         * The name of the Image family. You can set this parameter to filter images of the current family when querying images.
         * <p>
         * 
         * Default value: Null.
         */
        public Builder imageFamily(String imageFamily) {
            this.putQueryParameter("ImageFamily", imageFamily);
            this.imageFamily = imageFamily;
            return this;
        }

        /**
         * <props = "intl"> Whether to query published community images. Valid values:</props>
         * <p>
         * <props="intl">
         * -true: queries published community images. If you set this parameter to true, the ImageOwnerAlias must be others.
         * -false: you can call this operation to query images of other types except the Community Image. The value of the ImageOwnerAlias parameter shall prevail.
         * 
         * </props>
         * 
         * <props = "intl"> Default value: false</props>
         */
        public Builder isPublic(Boolean isPublic) {
            this.putQueryParameter("IsPublic", isPublic);
            this.isPublic = isPublic;
            return this;
        }

        /**
         * The scenario where the image needs to be used. Valid values:
         * <p>
         * 
         * -CreateEcs (default): creates an instance.
         * -ChangeOS: replace the system disk or operating system.
         */
        public Builder actionType(String actionType) {
            this.putQueryParameter("ActionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * Indicates whether the image is already running on the ECS instance. Valid values:
         * <p>
         * 
         * -instance: the image is running and is used by ECS instances.
         * -none: the image is idle and no ECS instance is available.
         */
        public Builder usage(String usage) {
            this.putQueryParameter("Usage", usage);
            this.usage = usage;
            return this;
        }

        /**
         * Indicates whether the subscription image has expired.
         * <p>
         * 
         * > This parameter will be deprecated soon. To improve compatibility, try to use other parameters.
         */
        public Builder showExpired(Boolean showExpired) {
            this.putQueryParameter("ShowExpired", showExpired);
            this.showExpired = showExpired;
            return this;
        }

        /**
         * <props = "china"> the ID of the alibaba cloud account to which the image belongs. This parameter takes effect only when you query a shared image. </props>
         * <p>
         * 
         * <props = "intl"> the ID of the alibaba cloud account to which the image belongs. This parameter takes effect only when you query shared images and community images. </props>
         * 
         * <props = "partner"> the ID of the alibaba cloud account to which the image belongs. This parameter takes effect only when you query a shared image. </props>
         */
        public Builder imageOwnerId(Long imageOwnerId) {
            this.putQueryParameter("ImageOwnerId", imageOwnerId);
            this.imageOwnerId = imageOwnerId;
            return this;
        }

        @Override
        public DescribeImagesRequest build() {
            return new DescribeImagesRequest(this);
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
             * 镜像的标签键。
             * <p>
             * 
             * >该参数即将被弃用，为提高兼容性，建议您使用另一个`Tag.N.Key`参数。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 镜像的标签值。N的取值范围：1~20
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
             * 查询资源时的筛选键。取值范围：
             * <p>
             * 
             * - 当该参数取值为`CreationStartTime`时，可以查询在指定时间点（`Filter.N.Value`）后创建的资源信息。
             * - 当该参数取值为`CreationEndTime`时，可以查询在指定时间点（`Filter.N.Value`）前创建的资源信息。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 查询资源时的筛选值。指定该参数时必须同时指定`Filter.N.Key`参数，格式为：`yyyy-MM-ddTHH:mmZ`，采用UTC +0时区。
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
}