// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutSecretValueResponseBody} extends {@link TeaModel}
 *
 * <p>PutSecretValueResponseBody</p>
 */
public class PutSecretValueResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecretName")
    private String secretName;

    @NameInMap("VersionId")
    private String versionId;

    @NameInMap("VersionStages")
    private VersionStages versionStages;

    private PutSecretValueResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.secretName = builder.secretName;
        this.versionId = builder.versionId;
        this.versionStages = builder.versionStages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutSecretValueResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    /**
     * @return versionStages
     */
    public VersionStages getVersionStages() {
        return this.versionStages;
    }

    public static final class Builder {
        private String requestId; 
        private String secretName; 
        private String versionId; 
        private VersionStages versionStages; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecretName.
         */
        public Builder secretName(String secretName) {
            this.secretName = secretName;
            return this;
        }

        /**
         * VersionId.
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        /**
         * VersionStages.
         */
        public Builder versionStages(VersionStages versionStages) {
            this.versionStages = versionStages;
            return this;
        }

        public PutSecretValueResponseBody build() {
            return new PutSecretValueResponseBody(this);
        } 

    } 

    public static class VersionStages extends TeaModel {
        @NameInMap("VersionStage")
        private java.util.List < String > versionStage;

        private VersionStages(Builder builder) {
            this.versionStage = builder.versionStage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionStages create() {
            return builder().build();
        }

        /**
         * @return versionStage
         */
        public java.util.List < String > getVersionStage() {
            return this.versionStage;
        }

        public static final class Builder {
            private java.util.List < String > versionStage; 

            /**
             * VersionStage.
             */
            public Builder versionStage(java.util.List < String > versionStage) {
                this.versionStage = versionStage;
                return this;
            }

            public VersionStages build() {
                return new VersionStages(this);
            } 

        } 

    }
}
