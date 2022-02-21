// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEcsInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListEcsInstancesRequest</p>
 */
public class ListEcsInstancesRequest extends Request {
    @Query
    @NameInMap("ecsInstanceIds")
    private String ecsInstanceIds;

    @Query
    @NameInMap("ecsInstanceName")
    private String ecsInstanceName;

    @Query
    @NameInMap("page")
    @Validation(maximum = 200, minimum = 1)
    private Integer page;

    @Query
    @NameInMap("size")
    @Validation(maximum = 500, minimum = 1)
    private Integer size;

    @Query
    @NameInMap("tags")
    private String tags;

    @Query
    @NameInMap("vpcId")
    private String vpcId;

    private ListEcsInstancesRequest(Builder builder) {
        super(builder);
        this.ecsInstanceIds = builder.ecsInstanceIds;
        this.ecsInstanceName = builder.ecsInstanceName;
        this.page = builder.page;
        this.size = builder.size;
        this.tags = builder.tags;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEcsInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ecsInstanceIds
     */
    public String getEcsInstanceIds() {
        return this.ecsInstanceIds;
    }

    /**
     * @return ecsInstanceName
     */
    public String getEcsInstanceName() {
        return this.ecsInstanceName;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ListEcsInstancesRequest, Builder> {
        private String ecsInstanceIds; 
        private String ecsInstanceName; 
        private Integer page; 
        private Integer size; 
        private String tags; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ListEcsInstancesRequest response) {
            super(response);
            this.ecsInstanceIds = response.ecsInstanceIds;
            this.ecsInstanceName = response.ecsInstanceName;
            this.page = response.page;
            this.size = response.size;
            this.tags = response.tags;
            this.vpcId = response.vpcId;
        } 

        /**
         * ecsInstanceIds.
         */
        public Builder ecsInstanceIds(String ecsInstanceIds) {
            this.putQueryParameter("ecsInstanceIds", ecsInstanceIds);
            this.ecsInstanceIds = ecsInstanceIds;
            return this;
        }

        /**
         * ecsInstanceName.
         */
        public Builder ecsInstanceName(String ecsInstanceName) {
            this.putQueryParameter("ecsInstanceName", ecsInstanceName);
            this.ecsInstanceName = ecsInstanceName;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * vpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("vpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public ListEcsInstancesRequest build() {
            return new ListEcsInstancesRequest(this);
        } 

    } 

}