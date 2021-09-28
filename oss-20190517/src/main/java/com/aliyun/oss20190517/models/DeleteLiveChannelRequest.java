// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteLiveChannelRequest} extends {@link RequestModel}
 *
 * <p>DeleteLiveChannelRequest</p>
 */
public class DeleteLiveChannelRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Path
    @NameInMap("channel")
    private String channel;


    private DeleteLiveChannelRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.channel = builder.channel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveChannelRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return channel
     */
    public String channel() {
        return this.channel;
    }

    public static final class Builder extends Request.Builder<DeleteLiveChannelRequest.Builder> {
        private String bucket; 
        private String channel; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>channel.</p>
         */
        public Builder channel(String channel) {
            this.putPathParameter("channel", channel);
            this.channel = channel;
            return this;
        }

        public DeleteLiveChannelRequest build() {
            return new DeleteLiveChannelRequest(this);
        } 

    } 

}