// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceConsoleOutputRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceConsoleOutputRequest</p>
 */
public class GetInstanceConsoleOutputRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RemoveSymbols")
    private Boolean removeSymbols;

    private GetInstanceConsoleOutputRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.instanceId = builder.instanceId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.removeSymbols = builder.removeSymbols;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceConsoleOutputRequest create() {
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
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return removeSymbols
     */
    public Boolean getRemoveSymbols() {
        return this.removeSymbols;
    }

    public static final class Builder extends Request.Builder<GetInstanceConsoleOutputRequest, Builder> {
        private String sourceRegionId; 
        private String ownerAccount; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String instanceId; 
        private Long ownerId; 
        private Long resourceOwnerId; 
        private Boolean removeSymbols; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceConsoleOutputRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.ownerAccount = response.ownerAccount;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.instanceId = response.instanceId;
            this.ownerId = response.ownerId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.removeSymbols = response.removeSymbols;
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
         * The region ID of the instance. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * Whether remove returns in the text typesetting symbol. Valid values:
         * <p>
         * -true: remove
         * -false: no remover
         * 
         * Default value: false
         */
        public Builder removeSymbols(Boolean removeSymbols) {
            this.putQueryParameter("RemoveSymbols", removeSymbols);
            this.removeSymbols = removeSymbols;
            return this;
        }

        @Override
        public GetInstanceConsoleOutputRequest build() {
            return new GetInstanceConsoleOutputRequest(this);
        } 

    } 

}