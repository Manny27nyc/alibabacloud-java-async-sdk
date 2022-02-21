// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUniqueDeviceStatRequest} extends {@link RequestModel}
 *
 * <p>QueryUniqueDeviceStatRequest</p>
 */
public class QueryUniqueDeviceStatRequest extends Request {
    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private Long appKey;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("Granularity")
    @Validation(required = true)
    private String granularity;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private QueryUniqueDeviceStatRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.endTime = builder.endTime;
        this.granularity = builder.granularity;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUniqueDeviceStatRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<QueryUniqueDeviceStatRequest, Builder> {
        private Long appKey; 
        private String endTime; 
        private String granularity; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(QueryUniqueDeviceStatRequest response) {
            super(response);
            this.appKey = response.appKey;
            this.endTime = response.endTime;
            this.granularity = response.granularity;
            this.startTime = response.startTime;
        } 

        /**
         * AppKey.
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Granularity.
         */
        public Builder granularity(String granularity) {
            this.putQueryParameter("Granularity", granularity);
            this.granularity = granularity;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public QueryUniqueDeviceStatRequest build() {
            return new QueryUniqueDeviceStatRequest(this);
        } 

    } 

}