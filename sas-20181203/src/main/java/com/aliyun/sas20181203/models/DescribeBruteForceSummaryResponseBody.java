// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeBruteForceSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBruteForceSummaryResponseBody</p>
 */
public class DescribeBruteForceSummaryResponseBody extends TeaModel {
    @NameInMap("BruteForceSummary")
    private BruteForceSummary bruteForceSummary;

    @NameInMap("RequestId")
    private String requestId;


    private DescribeBruteForceSummaryResponseBody(Builder builder) {
        this.bruteForceSummary = builder.bruteForceSummary;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBruteForceSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return bruteForceSummary
     */
    public BruteForceSummary getBruteForceSummary() {
        return this.bruteForceSummary;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BruteForceSummary bruteForceSummary; 
        private String requestId; 

        /**
         * <p>BruteForceSummary.</p>
         */
        public Builder bruteForceSummary(BruteForceSummary bruteForceSummary) {
            this.bruteForceSummary = bruteForceSummary;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBruteForceSummaryResponseBody build() {
            return new DescribeBruteForceSummaryResponseBody(this);
        } 

    } 

    public static class BruteForceSummary extends TeaModel {
        @NameInMap("AllStrategyCount")
        private Integer allStrategyCount;

        @NameInMap("EffectiveCount")
        private Integer effectiveCount;


        private BruteForceSummary(Builder builder) {
            this.allStrategyCount = builder.allStrategyCount;
            this.effectiveCount = builder.effectiveCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BruteForceSummary create() {
            return builder().build();
        }

        /**
         * @return allStrategyCount
         */
        public Integer getAllStrategyCount() {
            return this.allStrategyCount;
        }

        /**
         * @return effectiveCount
         */
        public Integer getEffectiveCount() {
            return this.effectiveCount;
        }

        public static final class Builder {
            private Integer allStrategyCount; 
            private Integer effectiveCount; 

            /**
             * <p>AllStrategyCount.</p>
             */
            public Builder allStrategyCount(Integer allStrategyCount) {
                this.allStrategyCount = allStrategyCount;
                return this;
            }

            /**
             * <p>EffectiveCount.</p>
             */
            public Builder effectiveCount(Integer effectiveCount) {
                this.effectiveCount = effectiveCount;
                return this;
            }

            public BruteForceSummary build() {
                return new BruteForceSummary(this);
            } 

        } 

    }
}
