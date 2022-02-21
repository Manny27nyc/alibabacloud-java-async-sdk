// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSecretRequest} extends {@link RequestModel}
 *
 * <p>DeleteSecretRequest</p>
 */
public class DeleteSecretRequest extends Request {
    @Query
    @NameInMap("ForceDeleteWithoutRecovery")
    private String forceDeleteWithoutRecovery;

    @Query
    @NameInMap("RecoveryWindowInDays")
    private String recoveryWindowInDays;

    @Query
    @NameInMap("SecretName")
    @Validation(required = true)
    private String secretName;

    private DeleteSecretRequest(Builder builder) {
        super(builder);
        this.forceDeleteWithoutRecovery = builder.forceDeleteWithoutRecovery;
        this.recoveryWindowInDays = builder.recoveryWindowInDays;
        this.secretName = builder.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSecretRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forceDeleteWithoutRecovery
     */
    public String getForceDeleteWithoutRecovery() {
        return this.forceDeleteWithoutRecovery;
    }

    /**
     * @return recoveryWindowInDays
     */
    public String getRecoveryWindowInDays() {
        return this.recoveryWindowInDays;
    }

    /**
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    public static final class Builder extends Request.Builder<DeleteSecretRequest, Builder> {
        private String forceDeleteWithoutRecovery; 
        private String recoveryWindowInDays; 
        private String secretName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSecretRequest response) {
            super(response);
            this.forceDeleteWithoutRecovery = response.forceDeleteWithoutRecovery;
            this.recoveryWindowInDays = response.recoveryWindowInDays;
            this.secretName = response.secretName;
        } 

        /**
         * ForceDeleteWithoutRecovery.
         */
        public Builder forceDeleteWithoutRecovery(String forceDeleteWithoutRecovery) {
            this.putQueryParameter("ForceDeleteWithoutRecovery", forceDeleteWithoutRecovery);
            this.forceDeleteWithoutRecovery = forceDeleteWithoutRecovery;
            return this;
        }

        /**
         * RecoveryWindowInDays.
         */
        public Builder recoveryWindowInDays(String recoveryWindowInDays) {
            this.putQueryParameter("RecoveryWindowInDays", recoveryWindowInDays);
            this.recoveryWindowInDays = recoveryWindowInDays;
            return this;
        }

        /**
         * SecretName.
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        @Override
        public DeleteSecretRequest build() {
            return new DeleteSecretRequest(this);
        } 

    } 

}
