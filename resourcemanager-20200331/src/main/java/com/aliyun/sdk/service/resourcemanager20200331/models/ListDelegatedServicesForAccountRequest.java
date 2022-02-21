// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDelegatedServicesForAccountRequest} extends {@link RequestModel}
 *
 * <p>ListDelegatedServicesForAccountRequest</p>
 */
public class ListDelegatedServicesForAccountRequest extends Request {
    @Query
    @NameInMap("AccountId")
    @Validation(required = true)
    private String accountId;

    private ListDelegatedServicesForAccountRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDelegatedServicesForAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    public static final class Builder extends Request.Builder<ListDelegatedServicesForAccountRequest, Builder> {
        private String accountId; 

        private Builder() {
            super();
        } 

        private Builder(ListDelegatedServicesForAccountRequest response) {
            super(response);
            this.accountId = response.accountId;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        @Override
        public ListDelegatedServicesForAccountRequest build() {
            return new ListDelegatedServicesForAccountRequest(this);
        } 

    } 

}
