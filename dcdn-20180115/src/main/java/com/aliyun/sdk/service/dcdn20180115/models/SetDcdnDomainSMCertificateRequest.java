// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDcdnDomainSMCertificateRequest} extends {@link RequestModel}
 *
 * <p>SetDcdnDomainSMCertificateRequest</p>
 */
public class SetDcdnDomainSMCertificateRequest extends Request {
    @Query
    @NameInMap("CertIdentifier")
    @Validation(required = true)
    private String certIdentifier;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SSLProtocol")
    @Validation(required = true)
    private String SSLProtocol;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private SetDcdnDomainSMCertificateRequest(Builder builder) {
        super(builder);
        this.certIdentifier = builder.certIdentifier;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.SSLProtocol = builder.SSLProtocol;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDcdnDomainSMCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certIdentifier
     */
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return SSLProtocol
     */
    public String getSSLProtocol() {
        return this.SSLProtocol;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<SetDcdnDomainSMCertificateRequest, Builder> {
        private String certIdentifier; 
        private String domainName; 
        private Long ownerId; 
        private String SSLProtocol; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetDcdnDomainSMCertificateRequest response) {
            super(response);
            this.certIdentifier = response.certIdentifier;
            this.domainName = response.domainName;
            this.ownerId = response.ownerId;
            this.SSLProtocol = response.SSLProtocol;
            this.securityToken = response.securityToken;
        } 

        /**
         * CertIdentifier.
         */
        public Builder certIdentifier(String certIdentifier) {
            this.putQueryParameter("CertIdentifier", certIdentifier);
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * SSLProtocol.
         */
        public Builder SSLProtocol(String SSLProtocol) {
            this.putQueryParameter("SSLProtocol", SSLProtocol);
            this.SSLProtocol = SSLProtocol;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public SetDcdnDomainSMCertificateRequest build() {
            return new SetDcdnDomainSMCertificateRequest(this);
        } 

    } 

}
