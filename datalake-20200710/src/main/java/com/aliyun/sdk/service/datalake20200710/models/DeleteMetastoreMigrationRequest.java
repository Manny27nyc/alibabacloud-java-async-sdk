// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMetastoreMigrationRequest} extends {@link RequestModel}
 *
 * <p>DeleteMetastoreMigrationRequest</p>
 */
public class DeleteMetastoreMigrationRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeleteMetastoreMigrationRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMetastoreMigrationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteMetastoreMigrationRequest, Builder> {
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMetastoreMigrationRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteMetastoreMigrationRequest build() {
            return new DeleteMetastoreMigrationRequest(this);
        } 

    } 

}