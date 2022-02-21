// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesOfUserRequest} extends {@link RequestModel}
 *
 * <p>ListInstancesOfUserRequest</p>
 */
public class ListInstancesOfUserRequest extends Request {
    private ListInstancesOfUserRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesOfUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListInstancesOfUserRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListInstancesOfUserRequest response) {
            super(response);
        } 

        @Override
        public ListInstancesOfUserRequest build() {
            return new ListInstancesOfUserRequest(this);
        } 

    } 

}