// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHoneyPotAuthRequest} extends {@link RequestModel}
 *
 * <p>DescribeHoneyPotAuthRequest</p>
 */
public class DescribeHoneyPotAuthRequest extends Request {
    private DescribeHoneyPotAuthRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHoneyPotAuthRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeHoneyPotAuthRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeHoneyPotAuthRequest request) {
            super(request);
        } 

        @Override
        public DescribeHoneyPotAuthRequest build() {
            return new DescribeHoneyPotAuthRequest(this);
        } 

    } 

}
