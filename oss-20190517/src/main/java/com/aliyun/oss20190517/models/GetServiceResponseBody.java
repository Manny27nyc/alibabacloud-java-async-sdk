// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetServiceResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceResponseBody</p>
 */
public class GetServiceResponseBody extends TeaModel {
    @ParentIgnore("ListAllMyBucketsResult")
    @NameInMap("Owner")
    private Owner owner;

    @ParentIgnore("ListAllMyBucketsResult,Buckets")
    @NameInMap("Bucket")
    private java.util.List < Bucket > buckets;


    private GetServiceResponseBody(Builder builder) {
        this.owner = builder.owner;
        this.buckets = builder.buckets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return owner
     */
    public Owner owner() {
        return this.owner;
    }

    /**
     * @return buckets
     */
    public java.util.List < Bucket > buckets() {
        return this.buckets;
    }

    public static final class Builder {
        private Owner owner; 
        private java.util.List < Bucket > buckets; 

        /**
         * <p>Owner.</p>
         */
        public Builder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        /**
         * <p>Bucket.</p>
         */
        public Builder buckets(java.util.List < Bucket > buckets) {
            this.buckets = buckets;
            return this;
        }

        public GetServiceResponseBody build() {
            return new GetServiceResponseBody(this);
        } 

    } 

}