// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GatewayService} extends {@link TeaModel}
 *
 * <p>GatewayService</p>
 */
public class GatewayService extends TeaModel {
    @NameInMap("GatewayTrafficPolicy")
    private TrafficPolicy gatewayTrafficPolicy;

    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @NameInMap("GroupName")
    private String groupName;

    @NameInMap("Id")
    private Long id;

    @NameInMap("MetaInfo")
    private String metaInfo;

    @NameInMap("Name")
    private String name;

    @NameInMap("Namespace")
    private String namespace;

    @NameInMap("SourceType")
    private String sourceType;

    private GatewayService(Builder builder) {
        this.gatewayTrafficPolicy = builder.gatewayTrafficPolicy;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.groupName = builder.groupName;
        this.id = builder.id;
        this.metaInfo = builder.metaInfo;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GatewayService create() {
        return builder().build();
    }

    /**
     * @return gatewayTrafficPolicy
     */
    public TrafficPolicy getGatewayTrafficPolicy() {
        return this.gatewayTrafficPolicy;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return metaInfo
     */
    public String getMetaInfo() {
        return this.metaInfo;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder {
        private TrafficPolicy gatewayTrafficPolicy; 
        private String gatewayUniqueId; 
        private String groupName; 
        private Long id; 
        private String metaInfo; 
        private String name; 
        private String namespace; 
        private String sourceType; 

        /**
         * 服务的策略
         */
        public Builder gatewayTrafficPolicy(TrafficPolicy gatewayTrafficPolicy) {
            this.gatewayTrafficPolicy = gatewayTrafficPolicy;
            return this;
        }

        /**
         * 网关uniqueId
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * 服务所属group
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * 服务id
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * 元信息
         */
        public Builder metaInfo(String metaInfo) {
            this.metaInfo = metaInfo;
            return this;
        }

        /**
         * 服务名
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 服务所属namesapce
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * 服务来源
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        public GatewayService build() {
            return new GatewayService(this);
        } 

    } 

}
