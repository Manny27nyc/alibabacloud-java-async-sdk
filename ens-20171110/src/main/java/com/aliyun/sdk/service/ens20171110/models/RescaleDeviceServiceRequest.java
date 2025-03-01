// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RescaleDeviceServiceRequest} extends {@link RequestModel}
 *
 * <p>RescaleDeviceServiceRequest</p>
 */
public class RescaleDeviceServiceRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("IpType")
    private Integer ipType;

    @Query
    @NameInMap("RescaleLevel")
    @Validation(required = true)
    private String rescaleLevel;

    @Query
    @NameInMap("RescaleType")
    @Validation(required = true)
    private String rescaleType;

    @Body
    @NameInMap("ResourceInfo")
    private String resourceInfo;

    @Body
    @NameInMap("ResourceSelector")
    @Validation(required = true)
    private String resourceSelector;

    @Query
    @NameInMap("ResourceSpec")
    private String resourceSpec;

    @Query
    @NameInMap("ServiceId")
    private String serviceId;

    @Query
    @NameInMap("Timeout")
    private Long timeout;

    private RescaleDeviceServiceRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.imageId = builder.imageId;
        this.ipType = builder.ipType;
        this.rescaleLevel = builder.rescaleLevel;
        this.rescaleType = builder.rescaleType;
        this.resourceInfo = builder.resourceInfo;
        this.resourceSelector = builder.resourceSelector;
        this.resourceSpec = builder.resourceSpec;
        this.serviceId = builder.serviceId;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RescaleDeviceServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return ipType
     */
    public Integer getIpType() {
        return this.ipType;
    }

    /**
     * @return rescaleLevel
     */
    public String getRescaleLevel() {
        return this.rescaleLevel;
    }

    /**
     * @return rescaleType
     */
    public String getRescaleType() {
        return this.rescaleType;
    }

    /**
     * @return resourceInfo
     */
    public String getResourceInfo() {
        return this.resourceInfo;
    }

    /**
     * @return resourceSelector
     */
    public String getResourceSelector() {
        return this.resourceSelector;
    }

    /**
     * @return resourceSpec
     */
    public String getResourceSpec() {
        return this.resourceSpec;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<RescaleDeviceServiceRequest, Builder> {
        private String appId; 
        private String imageId; 
        private Integer ipType; 
        private String rescaleLevel; 
        private String rescaleType; 
        private String resourceInfo; 
        private String resourceSelector; 
        private String resourceSpec; 
        private String serviceId; 
        private Long timeout; 

        private Builder() {
            super();
        } 

        private Builder(RescaleDeviceServiceRequest response) {
            super(response);
            this.appId = response.appId;
            this.imageId = response.imageId;
            this.ipType = response.ipType;
            this.rescaleLevel = response.rescaleLevel;
            this.rescaleType = response.rescaleType;
            this.resourceInfo = response.resourceInfo;
            this.resourceSelector = response.resourceSelector;
            this.resourceSpec = response.resourceSpec;
            this.serviceId = response.serviceId;
            this.timeout = response.timeout;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * IpType.
         */
        public Builder ipType(Integer ipType) {
            this.putQueryParameter("IpType", ipType);
            this.ipType = ipType;
            return this;
        }

        /**
         * RescaleLevel.
         */
        public Builder rescaleLevel(String rescaleLevel) {
            this.putQueryParameter("RescaleLevel", rescaleLevel);
            this.rescaleLevel = rescaleLevel;
            return this;
        }

        /**
         * RescaleType.
         */
        public Builder rescaleType(String rescaleType) {
            this.putQueryParameter("RescaleType", rescaleType);
            this.rescaleType = rescaleType;
            return this;
        }

        /**
         * ResourceInfo.
         */
        public Builder resourceInfo(String resourceInfo) {
            this.putBodyParameter("ResourceInfo", resourceInfo);
            this.resourceInfo = resourceInfo;
            return this;
        }

        /**
         * ResourceSelector.
         */
        public Builder resourceSelector(String resourceSelector) {
            this.putBodyParameter("ResourceSelector", resourceSelector);
            this.resourceSelector = resourceSelector;
            return this;
        }

        /**
         * ResourceSpec.
         */
        public Builder resourceSpec(String resourceSpec) {
            this.putQueryParameter("ResourceSpec", resourceSpec);
            this.resourceSpec = resourceSpec;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * Timeout.
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public RescaleDeviceServiceRequest build() {
            return new RescaleDeviceServiceRequest(this);
        } 

    } 

}
