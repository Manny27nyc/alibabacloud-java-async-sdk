// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AsymmetricEncryptRequest} extends {@link RequestModel}
 *
 * <p>AsymmetricEncryptRequest</p>
 */
public class AsymmetricEncryptRequest extends Request {
    @Query
    @NameInMap("Algorithm")
    @Validation(required = true)
    private String algorithm;

    @Query
    @NameInMap("KeyId")
    @Validation(required = true)
    private String keyId;

    @Query
    @NameInMap("KeyVersionId")
    @Validation(required = true)
    private String keyVersionId;

    @Query
    @NameInMap("Plaintext")
    @Validation(required = true)
    private String plaintext;

    private AsymmetricEncryptRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.keyId = builder.keyId;
        this.keyVersionId = builder.keyVersionId;
        this.plaintext = builder.plaintext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsymmetricEncryptRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return keyVersionId
     */
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

    /**
     * @return plaintext
     */
    public String getPlaintext() {
        return this.plaintext;
    }

    public static final class Builder extends Request.Builder<AsymmetricEncryptRequest, Builder> {
        private String algorithm; 
        private String keyId; 
        private String keyVersionId; 
        private String plaintext; 

        private Builder() {
            super();
        } 

        private Builder(AsymmetricEncryptRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.keyId = request.keyId;
            this.keyVersionId = request.keyVersionId;
            this.plaintext = request.plaintext;
        } 

        /**
         * Algorithm.
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * KeyId.
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * KeyVersionId.
         */
        public Builder keyVersionId(String keyVersionId) {
            this.putQueryParameter("KeyVersionId", keyVersionId);
            this.keyVersionId = keyVersionId;
            return this;
        }

        /**
         * Plaintext.
         */
        public Builder plaintext(String plaintext) {
            this.putQueryParameter("Plaintext", plaintext);
            this.plaintext = plaintext;
            return this;
        }

        @Override
        public AsymmetricEncryptRequest build() {
            return new AsymmetricEncryptRequest(this);
        } 

    } 

}
