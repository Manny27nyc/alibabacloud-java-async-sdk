// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDevicesByAccountRequest} extends {@link RequestModel}
 *
 * <p>QueryDevicesByAccountRequest</p>
 */
public class QueryDevicesByAccountRequest extends Request {
    @Query
    @NameInMap("Account")
    @Validation(required = true)
    private String account;

    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private Long appKey;

    private QueryDevicesByAccountRequest(Builder builder) {
        super(builder);
        this.account = builder.account;
        this.appKey = builder.appKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDevicesByAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return account
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
    }

    public static final class Builder extends Request.Builder<QueryDevicesByAccountRequest, Builder> {
        private String account; 
        private Long appKey; 

        private Builder() {
            super();
        } 

        private Builder(QueryDevicesByAccountRequest request) {
            super(request);
            this.account = request.account;
            this.appKey = request.appKey;
        } 

        /**
         * Account.
         */
        public Builder account(String account) {
            this.putQueryParameter("Account", account);
            this.account = account;
            return this;
        }

        /**
         * AppKey.
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        @Override
        public QueryDevicesByAccountRequest build() {
            return new QueryDevicesByAccountRequest(this);
        } 

    } 

}
