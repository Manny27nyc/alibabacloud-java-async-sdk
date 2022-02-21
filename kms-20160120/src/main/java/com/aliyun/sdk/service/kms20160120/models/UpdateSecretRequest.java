// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSecretRequest} extends {@link RequestModel}
 *
 * <p>UpdateSecretRequest</p>
 */
public class UpdateSecretRequest extends Request {
    @NameInMap("ExtendedConfig")
    private ExtendedConfig extendedConfig;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("SecretName")
    @Validation(required = true)
    private String secretName;

    private UpdateSecretRequest(Builder builder) {
        super(builder);
        this.extendedConfig = builder.extendedConfig;
        this.description = builder.description;
        this.secretName = builder.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSecretRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extendedConfig
     */
    public ExtendedConfig getExtendedConfig() {
        return this.extendedConfig;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    public static final class Builder extends Request.Builder<UpdateSecretRequest, Builder> {
        private ExtendedConfig extendedConfig; 
        private String description; 
        private String secretName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSecretRequest response) {
            super(response);
            this.extendedConfig = response.extendedConfig;
            this.description = response.description;
            this.secretName = response.secretName;
        } 

        /**
         * ExtendedConfig.
         */
        public Builder extendedConfig(ExtendedConfig extendedConfig) {
            this.extendedConfig = extendedConfig;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
        public UpdateSecretRequest build() {
            return new UpdateSecretRequest(this);
        } 

    } 

    public static class ExtendedConfig extends TeaModel {
        @NameInMap("CustomData")
        private java.util.Map < String, ? > customData;

        private ExtendedConfig(Builder builder) {
            this.customData = builder.customData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendedConfig create() {
            return builder().build();
        }

        /**
         * @return customData
         */
        public java.util.Map < String, ? > getCustomData() {
            return this.customData;
        }

        public static final class Builder {
            private java.util.Map < String, ? > customData; 

            /**
             * CustomData.
             */
            public Builder customData(java.util.Map < String, ? > customData) {
                this.customData = customData;
                return this;
            }

            public ExtendedConfig build() {
                return new ExtendedConfig(this);
            } 

        } 

    }
}
