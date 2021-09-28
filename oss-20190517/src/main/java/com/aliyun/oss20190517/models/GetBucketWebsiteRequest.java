// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetBucketWebsiteRequest} extends {@link RequestModel}
 *
 * <p>GetBucketWebsiteRequest</p>
 */
public class GetBucketWebsiteRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;


    private GetBucketWebsiteRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketWebsiteRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<GetBucketWebsiteRequest.Builder> {
        private String bucket; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        public GetBucketWebsiteRequest build() {
            return new GetBucketWebsiteRequest(this);
        } 

    } 

}
