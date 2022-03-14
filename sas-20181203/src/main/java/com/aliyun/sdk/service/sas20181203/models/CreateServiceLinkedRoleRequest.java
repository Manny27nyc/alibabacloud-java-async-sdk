// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceLinkedRoleRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceLinkedRoleRequest</p>
 */
public class CreateServiceLinkedRoleRequest extends Request {
    private CreateServiceLinkedRoleRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceLinkedRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<CreateServiceLinkedRoleRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(CreateServiceLinkedRoleRequest request) {
            super(request);
        } 

        @Override
        public CreateServiceLinkedRoleRequest build() {
            return new CreateServiceLinkedRoleRequest(this);
        } 

    } 

}
