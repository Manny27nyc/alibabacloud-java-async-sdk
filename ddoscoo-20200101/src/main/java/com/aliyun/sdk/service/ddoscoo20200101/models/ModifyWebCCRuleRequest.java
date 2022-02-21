// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebCCRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebCCRuleRequest</p>
 */
public class ModifyWebCCRuleRequest extends Request {
    @Query
    @NameInMap("Act")
    @Validation(required = true)
    private String act;

    @Query
    @NameInMap("Count")
    @Validation(required = true)
    private Integer count;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("Interval")
    @Validation(required = true)
    private Integer interval;

    @Query
    @NameInMap("Mode")
    @Validation(required = true)
    private String mode;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Ttl")
    @Validation(required = true)
    private Integer ttl;

    @Query
    @NameInMap("Uri")
    @Validation(required = true)
    private String uri;

    private ModifyWebCCRuleRequest(Builder builder) {
        super(builder);
        this.act = builder.act;
        this.count = builder.count;
        this.domain = builder.domain;
        this.interval = builder.interval;
        this.mode = builder.mode;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.ttl = builder.ttl;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebCCRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return act
     */
    public String getAct() {
        return this.act;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder extends Request.Builder<ModifyWebCCRuleRequest, Builder> {
        private String act; 
        private Integer count; 
        private String domain; 
        private Integer interval; 
        private String mode; 
        private String name; 
        private String regionId; 
        private String resourceGroupId; 
        private Integer ttl; 
        private String uri; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWebCCRuleRequest response) {
            super(response);
            this.act = response.act;
            this.count = response.count;
            this.domain = response.domain;
            this.interval = response.interval;
            this.mode = response.mode;
            this.name = response.name;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.ttl = response.ttl;
            this.uri = response.uri;
        } 

        /**
         * Act.
         */
        public Builder act(String act) {
            this.putQueryParameter("Act", act);
            this.act = act;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.putQueryParameter("Count", count);
            this.count = count;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Ttl.
         */
        public Builder ttl(Integer ttl) {
            this.putQueryParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        /**
         * Uri.
         */
        public Builder uri(String uri) {
            this.putQueryParameter("Uri", uri);
            this.uri = uri;
            return this;
        }

        @Override
        public ModifyWebCCRuleRequest build() {
            return new ModifyWebCCRuleRequest(this);
        } 

    } 

}
