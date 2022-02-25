// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryJenkinsImageRegistryPersistenceDayRequest} extends {@link RequestModel}
 *
 * <p>QueryJenkinsImageRegistryPersistenceDayRequest</p>
 */
public class QueryJenkinsImageRegistryPersistenceDayRequest extends Request {
    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private QueryJenkinsImageRegistryPersistenceDayRequest(Builder builder) {
        super(builder);
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryJenkinsImageRegistryPersistenceDayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<QueryJenkinsImageRegistryPersistenceDayRequest, Builder> {
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryJenkinsImageRegistryPersistenceDayRequest response) {
            super(response);
            this.sourceIp = response.sourceIp;
        } 

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public QueryJenkinsImageRegistryPersistenceDayRequest build() {
            return new QueryJenkinsImageRegistryPersistenceDayRequest(this);
        } 

    } 

}
