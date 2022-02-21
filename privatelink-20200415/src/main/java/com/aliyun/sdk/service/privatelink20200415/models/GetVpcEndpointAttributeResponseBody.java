// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVpcEndpointAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetVpcEndpointAttributeResponseBody</p>
 */
public class GetVpcEndpointAttributeResponseBody extends TeaModel {
    @NameInMap("Bandwidth")
    private Integer bandwidth;

    @NameInMap("ConnectionStatus")
    private String connectionStatus;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("EndpointBusinessStatus")
    private String endpointBusinessStatus;

    @NameInMap("EndpointDescription")
    private String endpointDescription;

    @NameInMap("EndpointDomain")
    private String endpointDomain;

    @NameInMap("EndpointId")
    private String endpointId;

    @NameInMap("EndpointName")
    private String endpointName;

    @NameInMap("EndpointStatus")
    private String endpointStatus;

    @NameInMap("EndpointType")
    private String endpointType;

    @NameInMap("Payer")
    private String payer;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceOwner")
    private Boolean resourceOwner;

    @NameInMap("ServiceId")
    private String serviceId;

    @NameInMap("ServiceName")
    private String serviceName;

    @NameInMap("VpcId")
    private String vpcId;

    @NameInMap("ZoneAffinityEnabled")
    private Boolean zoneAffinityEnabled;

    @NameInMap("ZonePrivateIpAddressCount")
    private Long zonePrivateIpAddressCount;

    private GetVpcEndpointAttributeResponseBody(Builder builder) {
        this.bandwidth = builder.bandwidth;
        this.connectionStatus = builder.connectionStatus;
        this.createTime = builder.createTime;
        this.endpointBusinessStatus = builder.endpointBusinessStatus;
        this.endpointDescription = builder.endpointDescription;
        this.endpointDomain = builder.endpointDomain;
        this.endpointId = builder.endpointId;
        this.endpointName = builder.endpointName;
        this.endpointStatus = builder.endpointStatus;
        this.endpointType = builder.endpointType;
        this.payer = builder.payer;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceOwner = builder.resourceOwner;
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.vpcId = builder.vpcId;
        this.zoneAffinityEnabled = builder.zoneAffinityEnabled;
        this.zonePrivateIpAddressCount = builder.zonePrivateIpAddressCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVpcEndpointAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return connectionStatus
     */
    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return endpointBusinessStatus
     */
    public String getEndpointBusinessStatus() {
        return this.endpointBusinessStatus;
    }

    /**
     * @return endpointDescription
     */
    public String getEndpointDescription() {
        return this.endpointDescription;
    }

    /**
     * @return endpointDomain
     */
    public String getEndpointDomain() {
        return this.endpointDomain;
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return endpointName
     */
    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * @return endpointStatus
     */
    public String getEndpointStatus() {
        return this.endpointStatus;
    }

    /**
     * @return endpointType
     */
    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * @return payer
     */
    public String getPayer() {
        return this.payer;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceOwner
     */
    public Boolean getResourceOwner() {
        return this.resourceOwner;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneAffinityEnabled
     */
    public Boolean getZoneAffinityEnabled() {
        return this.zoneAffinityEnabled;
    }

    /**
     * @return zonePrivateIpAddressCount
     */
    public Long getZonePrivateIpAddressCount() {
        return this.zonePrivateIpAddressCount;
    }

    public static final class Builder {
        private Integer bandwidth; 
        private String connectionStatus; 
        private String createTime; 
        private String endpointBusinessStatus; 
        private String endpointDescription; 
        private String endpointDomain; 
        private String endpointId; 
        private String endpointName; 
        private String endpointStatus; 
        private String endpointType; 
        private String payer; 
        private String regionId; 
        private String requestId; 
        private Boolean resourceOwner; 
        private String serviceId; 
        private String serviceName; 
        private String vpcId; 
        private Boolean zoneAffinityEnabled; 
        private Long zonePrivateIpAddressCount; 

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * ConnectionStatus.
         */
        public Builder connectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
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
         * EndpointBusinessStatus.
         */
        public Builder endpointBusinessStatus(String endpointBusinessStatus) {
            this.endpointBusinessStatus = endpointBusinessStatus;
            return this;
        }

        /**
         * EndpointDescription.
         */
        public Builder endpointDescription(String endpointDescription) {
            this.endpointDescription = endpointDescription;
            return this;
        }

        /**
         * EndpointDomain.
         */
        public Builder endpointDomain(String endpointDomain) {
            this.endpointDomain = endpointDomain;
            return this;
        }

        /**
         * EndpointId.
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * EndpointName.
         */
        public Builder endpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }

        /**
         * EndpointStatus.
         */
        public Builder endpointStatus(String endpointStatus) {
            this.endpointStatus = endpointStatus;
            return this;
        }

        /**
         * EndpointType.
         */
        public Builder endpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }

        /**
         * Payer.
         */
        public Builder payer(String payer) {
            this.payer = payer;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceOwner.
         */
        public Builder resourceOwner(Boolean resourceOwner) {
            this.resourceOwner = resourceOwner;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * ZoneAffinityEnabled.
         */
        public Builder zoneAffinityEnabled(Boolean zoneAffinityEnabled) {
            this.zoneAffinityEnabled = zoneAffinityEnabled;
            return this;
        }

        /**
         * ZonePrivateIpAddressCount.
         */
        public Builder zonePrivateIpAddressCount(Long zonePrivateIpAddressCount) {
            this.zonePrivateIpAddressCount = zonePrivateIpAddressCount;
            return this;
        }

        public GetVpcEndpointAttributeResponseBody build() {
            return new GetVpcEndpointAttributeResponseBody(this);
        } 

    } 

}
