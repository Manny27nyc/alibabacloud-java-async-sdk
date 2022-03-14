// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PauseClientRequest} extends {@link RequestModel}
 *
 * <p>PauseClientRequest</p>
 */
public class PauseClientRequest extends Request {
    @Query
    @NameInMap("Uuids")
    @Validation(required = true)
    private String uuids;

    @Query
    @NameInMap("Value")
    @Validation(required = true)
    private String value;

    private PauseClientRequest(Builder builder) {
        super(builder);
        this.uuids = builder.uuids;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PauseClientRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<PauseClientRequest, Builder> {
        private String uuids; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(PauseClientRequest request) {
            super(request);
            this.uuids = request.uuids;
            this.value = request.value;
        } 

        /**
         * Uuids.
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public PauseClientRequest build() {
            return new PauseClientRequest(this);
        } 

    } 

}
