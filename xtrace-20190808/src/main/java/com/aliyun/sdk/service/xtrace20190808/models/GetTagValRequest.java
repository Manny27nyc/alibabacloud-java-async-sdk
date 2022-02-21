// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTagValRequest} extends {@link RequestModel}
 *
 * <p>GetTagValRequest</p>
 */
public class GetTagValRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ServiceName")
    private String serviceName;

    @Query
    @NameInMap("SpanName")
    private String spanName;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    @Query
    @NameInMap("TagKey")
    @Validation(required = true)
    private String tagKey;

    private GetTagValRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.regionId = builder.regionId;
        this.serviceName = builder.serviceName;
        this.spanName = builder.spanName;
        this.startTime = builder.startTime;
        this.tagKey = builder.tagKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTagValRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return spanName
     */
    public String getSpanName() {
        return this.spanName;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return tagKey
     */
    public String getTagKey() {
        return this.tagKey;
    }

    public static final class Builder extends Request.Builder<GetTagValRequest, Builder> {
        private Long endTime; 
        private String regionId; 
        private String serviceName; 
        private String spanName; 
        private Long startTime; 
        private String tagKey; 

        private Builder() {
            super();
        } 

        private Builder(GetTagValRequest response) {
            super(response);
            this.endTime = response.endTime;
            this.regionId = response.regionId;
            this.serviceName = response.serviceName;
            this.spanName = response.spanName;
            this.startTime = response.startTime;
            this.tagKey = response.tagKey;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * SpanName.
         */
        public Builder spanName(String spanName) {
            this.putQueryParameter("SpanName", spanName);
            this.spanName = spanName;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TagKey.
         */
        public Builder tagKey(String tagKey) {
            this.putQueryParameter("TagKey", tagKey);
            this.tagKey = tagKey;
            return this;
        }

        @Override
        public GetTagValRequest build() {
            return new GetTagValRequest(this);
        } 

    } 

}