// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetControlPolicyEnablementStatusRequest} extends {@link RequestModel}
 *
 * <p>GetControlPolicyEnablementStatusRequest</p>
 */
public class GetControlPolicyEnablementStatusRequest extends Request {
    private GetControlPolicyEnablementStatusRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetControlPolicyEnablementStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetControlPolicyEnablementStatusRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetControlPolicyEnablementStatusRequest response) {
            super(response);
        } 

        @Override
        public GetControlPolicyEnablementStatusRequest build() {
            return new GetControlPolicyEnablementStatusRequest(this);
        } 

    } 

}
