// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateADConnectorDirectoryRequest} extends {@link RequestModel}
 *
 * <p>CreateADConnectorDirectoryRequest</p>
 */
public class CreateADConnectorDirectoryRequest extends Request {
    @Query
    @NameInMap("DesktopAccessType")
    private String desktopAccessType;

    @Query
    @NameInMap("DirectoryName")
    private String directoryName;

    @Query
    @NameInMap("DnsAddress")
    @Validation(required = true)
    private java.util.List < String > dnsAddress;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("DomainPassword")
    @Validation(required = true)
    private String domainPassword;

    @Query
    @NameInMap("DomainUserName")
    @Validation(required = true)
    private String domainUserName;

    @Query
    @NameInMap("EnableAdminAccess")
    private Boolean enableAdminAccess;

    @Query
    @NameInMap("MfaEnabled")
    private Boolean mfaEnabled;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SubDomainDnsAddress")
    private java.util.List < String > subDomainDnsAddress;

    @Query
    @NameInMap("SubDomainName")
    private String subDomainName;

    @Query
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private java.util.List < String > vSwitchId;

    private CreateADConnectorDirectoryRequest(Builder builder) {
        super(builder);
        this.desktopAccessType = builder.desktopAccessType;
        this.directoryName = builder.directoryName;
        this.dnsAddress = builder.dnsAddress;
        this.domainName = builder.domainName;
        this.domainPassword = builder.domainPassword;
        this.domainUserName = builder.domainUserName;
        this.enableAdminAccess = builder.enableAdminAccess;
        this.mfaEnabled = builder.mfaEnabled;
        this.regionId = builder.regionId;
        this.subDomainDnsAddress = builder.subDomainDnsAddress;
        this.subDomainName = builder.subDomainName;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateADConnectorDirectoryRequest create() {
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
     * @return dnsAddress
     */
    public java.util.List < String > getDnsAddress() {
        return this.dnsAddress;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return domainPassword
     */
    public String getDomainPassword() {
        return this.domainPassword;
    }

    /**
     * @return domainUserName
     */
    public String getDomainUserName() {
        return this.domainUserName;
    }

    /**
     * @return enableAdminAccess
     */
    public Boolean getEnableAdminAccess() {
        return this.enableAdminAccess;
    }

    /**
     * @return mfaEnabled
     */
    public Boolean getMfaEnabled() {
        return this.mfaEnabled;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return subDomainDnsAddress
     */
    public java.util.List < String > getSubDomainDnsAddress() {
        return this.subDomainDnsAddress;
    }

    /**
     * @return subDomainName
     */
    public String getSubDomainName() {
        return this.subDomainName;
    }

    /**
     * @return vSwitchId
     */
    public java.util.List < String > getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<CreateADConnectorDirectoryRequest, Builder> {
        private String desktopAccessType; 
        private String directoryName; 
        private java.util.List < String > dnsAddress; 
        private String domainName; 
        private String domainPassword; 
        private String domainUserName; 
        private Boolean enableAdminAccess; 
        private Boolean mfaEnabled; 
        private String regionId; 
        private java.util.List < String > subDomainDnsAddress; 
        private String subDomainName; 
        private java.util.List < String > vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateADConnectorDirectoryRequest response) {
            super(response);
            this.desktopAccessType = response.desktopAccessType;
            this.directoryName = response.directoryName;
            this.dnsAddress = response.dnsAddress;
            this.domainName = response.domainName;
            this.domainPassword = response.domainPassword;
            this.domainUserName = response.domainUserName;
            this.enableAdminAccess = response.enableAdminAccess;
            this.mfaEnabled = response.mfaEnabled;
            this.regionId = response.regionId;
            this.subDomainDnsAddress = response.subDomainDnsAddress;
            this.subDomainName = response.subDomainName;
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
         * DnsAddress.
         */
        public Builder dnsAddress(java.util.List < String > dnsAddress) {
            this.putQueryParameter("DnsAddress", dnsAddress);
            this.dnsAddress = dnsAddress;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * DomainPassword.
         */
        public Builder domainPassword(String domainPassword) {
            this.putQueryParameter("DomainPassword", domainPassword);
            this.domainPassword = domainPassword;
            return this;
        }

        /**
         * DomainUserName.
         */
        public Builder domainUserName(String domainUserName) {
            this.putQueryParameter("DomainUserName", domainUserName);
            this.domainUserName = domainUserName;
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
         * MfaEnabled.
         */
        public Builder mfaEnabled(Boolean mfaEnabled) {
            this.putQueryParameter("MfaEnabled", mfaEnabled);
            this.mfaEnabled = mfaEnabled;
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
         * SubDomainDnsAddress.
         */
        public Builder subDomainDnsAddress(java.util.List < String > subDomainDnsAddress) {
            this.putQueryParameter("SubDomainDnsAddress", subDomainDnsAddress);
            this.subDomainDnsAddress = subDomainDnsAddress;
            return this;
        }

        /**
         * SubDomainName.
         */
        public Builder subDomainName(String subDomainName) {
            this.putQueryParameter("SubDomainName", subDomainName);
            this.subDomainName = subDomainName;
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
        public CreateADConnectorDirectoryRequest build() {
            return new CreateADConnectorDirectoryRequest(this);
        } 

    } 

}
