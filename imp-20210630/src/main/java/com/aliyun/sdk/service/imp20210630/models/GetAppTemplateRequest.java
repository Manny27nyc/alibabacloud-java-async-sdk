// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetAppTemplateRequest</p>
 */
public class GetAppTemplateRequest extends Request {
    @Body
    @NameInMap("AppTemplateId")
    @Validation(required = true)
    private String appTemplateId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetAppTemplateRequest(Builder builder) {
        super(builder);
        this.appTemplateId = builder.appTemplateId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appTemplateId
     */
    public String getAppTemplateId() {
        return this.appTemplateId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetAppTemplateRequest, Builder> {
        private String appTemplateId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetAppTemplateRequest response) {
            super(response);
            this.appTemplateId = response.appTemplateId;
            this.regionId = response.regionId;
        } 

        /**
         * 应用模板唯一标识
         */
        public Builder appTemplateId(String appTemplateId) {
            this.putBodyParameter("AppTemplateId", appTemplateId);
            this.appTemplateId = appTemplateId;
            return this;
        }

        /**
         * 地域
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetAppTemplateRequest build() {
            return new GetAppTemplateRequest(this);
        } 

    } 

}
