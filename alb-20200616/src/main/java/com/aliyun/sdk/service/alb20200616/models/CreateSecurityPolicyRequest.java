// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSecurityPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateSecurityPolicyRequest</p>
 */
public class CreateSecurityPolicyRequest extends Request {
    @Query
    @NameInMap("Ciphers")
    @Validation(required = true)
    private java.util.List < String > ciphers;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SecurityPolicyName")
    @Validation(required = true)
    private String securityPolicyName;

    @Query
    @NameInMap("TLSVersions")
    @Validation(required = true)
    private java.util.List < String > TLSVersions;

    private CreateSecurityPolicyRequest(Builder builder) {
        super(builder);
        this.ciphers = builder.ciphers;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityPolicyName = builder.securityPolicyName;
        this.TLSVersions = builder.TLSVersions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecurityPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ciphers
     */
    public java.util.List < String > getCiphers() {
        return this.ciphers;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return securityPolicyName
     */
    public String getSecurityPolicyName() {
        return this.securityPolicyName;
    }

    /**
     * @return TLSVersions
     */
    public java.util.List < String > getTLSVersions() {
        return this.TLSVersions;
    }

    public static final class Builder extends Request.Builder<CreateSecurityPolicyRequest, Builder> {
        private java.util.List < String > ciphers; 
        private String clientToken; 
        private Boolean dryRun; 
        private String resourceGroupId; 
        private String securityPolicyName; 
        private java.util.List < String > TLSVersions; 

        private Builder() {
            super();
        } 

        private Builder(CreateSecurityPolicyRequest response) {
            super(response);
            this.ciphers = response.ciphers;
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.resourceGroupId = response.resourceGroupId;
            this.securityPolicyName = response.securityPolicyName;
            this.TLSVersions = response.TLSVersions;
        } 

        /**
         * 加密套件
         */
        public Builder ciphers(java.util.List < String > ciphers) {
            this.putQueryParameter("Ciphers", ciphers);
            this.ciphers = ciphers;
            return this;
        }

        /**
         * 幂等标识
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         *  是否只预检此次请求
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * 资源组id
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * 安全策略名称
         */
        public Builder securityPolicyName(String securityPolicyName) {
            this.putQueryParameter("SecurityPolicyName", securityPolicyName);
            this.securityPolicyName = securityPolicyName;
            return this;
        }

        /**
         * tls版本
         */
        public Builder TLSVersions(java.util.List < String > TLSVersions) {
            this.putQueryParameter("TLSVersions", TLSVersions);
            this.TLSVersions = TLSVersions;
            return this;
        }

        @Override
        public CreateSecurityPolicyRequest build() {
            return new CreateSecurityPolicyRequest(this);
        } 

    } 

}
