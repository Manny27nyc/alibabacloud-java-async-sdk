// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRAMDirectoryRequest} extends {@link RequestModel}
 *
 * <p>CreateRAMDirectoryRequest</p>
 */
public class CreateRAMDirectoryRequest extends Request {
    @Query
    @NameInMap("DesktopAccessType")
    private String desktopAccessType;

    @Query
    @NameInMap("DirectoryName")
    private String directoryName;

    @Query
    @NameInMap("EnableAdminAccess")
    private Boolean enableAdminAccess;

    @Query
    @NameInMap("EnableInternetAccess")
    private Boolean enableInternetAccess;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private java.util.List < String > vSwitchId;

    private CreateRAMDirectoryRequest(Builder builder) {
        super(builder);
        this.desktopAccessType = builder.desktopAccessType;
        this.directoryName = builder.directoryName;
        this.enableAdminAccess = builder.enableAdminAccess;
        this.enableInternetAccess = builder.enableInternetAccess;
        this.regionId = builder.regionId;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRAMDirectoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopAccessType
     */
    public String getDesktopAccessType() {
        return this.desktopAccessType;
    }

    /**
     * @return directoryName
     */
    public String getDirectoryName() {
        return this.directoryName;
    }

    /**
     * @return enableAdminAccess
     */
    public Boolean getEnableAdminAccess() {
        return this.enableAdminAccess;
    }

    /**
     * @return enableInternetAccess
     */
    public Boolean getEnableInternetAccess() {
        return this.enableInternetAccess;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vSwitchId
     */
    public java.util.List < String > getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<CreateRAMDirectoryRequest, Builder> {
        private String desktopAccessType; 
        private String directoryName; 
        private Boolean enableAdminAccess; 
        private Boolean enableInternetAccess; 
        private String regionId; 
        private java.util.List < String > vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRAMDirectoryRequest response) {
            super(response);
            this.desktopAccessType = response.desktopAccessType;
            this.directoryName = response.directoryName;
            this.enableAdminAccess = response.enableAdminAccess;
            this.enableInternetAccess = response.enableInternetAccess;
            this.regionId = response.regionId;
            this.vSwitchId = response.vSwitchId;
        } 

        /**
         * DesktopAccessType.
         */
        public Builder desktopAccessType(String desktopAccessType) {
            this.putQueryParameter("DesktopAccessType", desktopAccessType);
            this.desktopAccessType = desktopAccessType;
            return this;
        }

        /**
         * DirectoryName.
         */
        public Builder directoryName(String directoryName) {
            this.putQueryParameter("DirectoryName", directoryName);
            this.directoryName = directoryName;
            return this;
        }

        /**
         * EnableAdminAccess.
         */
        public Builder enableAdminAccess(Boolean enableAdminAccess) {
            this.putQueryParameter("EnableAdminAccess", enableAdminAccess);
            this.enableAdminAccess = enableAdminAccess;
            return this;
        }

        /**
         * EnableInternetAccess.
         */
        public Builder enableInternetAccess(Boolean enableInternetAccess) {
            this.putQueryParameter("EnableInternetAccess", enableInternetAccess);
            this.enableInternetAccess = enableInternetAccess;
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
         * VSwitchId.
         */
        public Builder vSwitchId(java.util.List < String > vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public CreateRAMDirectoryRequest build() {
            return new CreateRAMDirectoryRequest(this);
        } 

    } 

}
