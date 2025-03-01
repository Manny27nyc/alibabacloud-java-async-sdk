// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesktopGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyDesktopGroupRequest</p>
 */
public class ModifyDesktopGroupRequest extends Request {
    @Query
    @NameInMap("AllowAutoSetup")
    @Validation(maximum = 1)
    private Integer allowAutoSetup;

    @Query
    @NameInMap("AllowBufferCount")
    @Validation(maximum = 1000)
    private Integer allowBufferCount;

    @Query
    @NameInMap("Comments")
    private String comments;

    @Query
    @NameInMap("DesktopGroupId")
    @Validation(required = true)
    private String desktopGroupId;

    @Query
    @NameInMap("DesktopGroupName")
    private String desktopGroupName;

    @Query
    @NameInMap("KeepDuration")
    private Long keepDuration;

    @Query
    @NameInMap("MaxDesktopsCount")
    @Validation(maximum = 1000, minimum = 1)
    private Integer maxDesktopsCount;

    @Query
    @NameInMap("MinDesktopsCount")
    @Validation(maximum = 500)
    private Integer minDesktopsCount;

    @Query
    @NameInMap("OwnBundleId")
    private String ownBundleId;

    @Query
    @NameInMap("PolicyGroupId")
    private String policyGroupId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResetType")
    private Long resetType;

    @Query
    @NameInMap("ScaleStrategyId")
    private String scaleStrategyId;

    private ModifyDesktopGroupRequest(Builder builder) {
        super(builder);
        this.allowAutoSetup = builder.allowAutoSetup;
        this.allowBufferCount = builder.allowBufferCount;
        this.comments = builder.comments;
        this.desktopGroupId = builder.desktopGroupId;
        this.desktopGroupName = builder.desktopGroupName;
        this.keepDuration = builder.keepDuration;
        this.maxDesktopsCount = builder.maxDesktopsCount;
        this.minDesktopsCount = builder.minDesktopsCount;
        this.ownBundleId = builder.ownBundleId;
        this.policyGroupId = builder.policyGroupId;
        this.regionId = builder.regionId;
        this.resetType = builder.resetType;
        this.scaleStrategyId = builder.scaleStrategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowAutoSetup
     */
    public Integer getAllowAutoSetup() {
        return this.allowAutoSetup;
    }

    /**
     * @return allowBufferCount
     */
    public Integer getAllowBufferCount() {
        return this.allowBufferCount;
    }

    /**
     * @return comments
     */
    public String getComments() {
        return this.comments;
    }

    /**
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    /**
     * @return desktopGroupName
     */
    public String getDesktopGroupName() {
        return this.desktopGroupName;
    }

    /**
     * @return keepDuration
     */
    public Long getKeepDuration() {
        return this.keepDuration;
    }

    /**
     * @return maxDesktopsCount
     */
    public Integer getMaxDesktopsCount() {
        return this.maxDesktopsCount;
    }

    /**
     * @return minDesktopsCount
     */
    public Integer getMinDesktopsCount() {
        return this.minDesktopsCount;
    }

    /**
     * @return ownBundleId
     */
    public String getOwnBundleId() {
        return this.ownBundleId;
    }

    /**
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resetType
     */
    public Long getResetType() {
        return this.resetType;
    }

    /**
     * @return scaleStrategyId
     */
    public String getScaleStrategyId() {
        return this.scaleStrategyId;
    }

    public static final class Builder extends Request.Builder<ModifyDesktopGroupRequest, Builder> {
        private Integer allowAutoSetup; 
        private Integer allowBufferCount; 
        private String comments; 
        private String desktopGroupId; 
        private String desktopGroupName; 
        private Long keepDuration; 
        private Integer maxDesktopsCount; 
        private Integer minDesktopsCount; 
        private String ownBundleId; 
        private String policyGroupId; 
        private String regionId; 
        private Long resetType; 
        private String scaleStrategyId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDesktopGroupRequest response) {
            super(response);
            this.allowAutoSetup = response.allowAutoSetup;
            this.allowBufferCount = response.allowBufferCount;
            this.comments = response.comments;
            this.desktopGroupId = response.desktopGroupId;
            this.desktopGroupName = response.desktopGroupName;
            this.keepDuration = response.keepDuration;
            this.maxDesktopsCount = response.maxDesktopsCount;
            this.minDesktopsCount = response.minDesktopsCount;
            this.ownBundleId = response.ownBundleId;
            this.policyGroupId = response.policyGroupId;
            this.regionId = response.regionId;
            this.resetType = response.resetType;
            this.scaleStrategyId = response.scaleStrategyId;
        } 

        /**
         * AllowAutoSetup.
         */
        public Builder allowAutoSetup(Integer allowAutoSetup) {
            this.putQueryParameter("AllowAutoSetup", allowAutoSetup);
            this.allowAutoSetup = allowAutoSetup;
            return this;
        }

        /**
         * AllowBufferCount.
         */
        public Builder allowBufferCount(Integer allowBufferCount) {
            this.putQueryParameter("AllowBufferCount", allowBufferCount);
            this.allowBufferCount = allowBufferCount;
            return this;
        }

        /**
         * Comments.
         */
        public Builder comments(String comments) {
            this.putQueryParameter("Comments", comments);
            this.comments = comments;
            return this;
        }

        /**
         * DesktopGroupId.
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * DesktopGroupName.
         */
        public Builder desktopGroupName(String desktopGroupName) {
            this.putQueryParameter("DesktopGroupName", desktopGroupName);
            this.desktopGroupName = desktopGroupName;
            return this;
        }

        /**
         * KeepDuration.
         */
        public Builder keepDuration(Long keepDuration) {
            this.putQueryParameter("KeepDuration", keepDuration);
            this.keepDuration = keepDuration;
            return this;
        }

        /**
         * MaxDesktopsCount.
         */
        public Builder maxDesktopsCount(Integer maxDesktopsCount) {
            this.putQueryParameter("MaxDesktopsCount", maxDesktopsCount);
            this.maxDesktopsCount = maxDesktopsCount;
            return this;
        }

        /**
         * MinDesktopsCount.
         */
        public Builder minDesktopsCount(Integer minDesktopsCount) {
            this.putQueryParameter("MinDesktopsCount", minDesktopsCount);
            this.minDesktopsCount = minDesktopsCount;
            return this;
        }

        /**
         * OwnBundleId.
         */
        public Builder ownBundleId(String ownBundleId) {
            this.putQueryParameter("OwnBundleId", ownBundleId);
            this.ownBundleId = ownBundleId;
            return this;
        }

        /**
         * PolicyGroupId.
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResetType.
         */
        public Builder resetType(Long resetType) {
            this.putQueryParameter("ResetType", resetType);
            this.resetType = resetType;
            return this;
        }

        /**
         * ScaleStrategyId.
         */
        public Builder scaleStrategyId(String scaleStrategyId) {
            this.putQueryParameter("ScaleStrategyId", scaleStrategyId);
            this.scaleStrategyId = scaleStrategyId;
            return this;
        }

        @Override
        public ModifyDesktopGroupRequest build() {
            return new ModifyDesktopGroupRequest(this);
        } 

    } 

}
