// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSavingsPlansUsageDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSavingsPlansUsageDetailResponseBody</p>
 */
public class DescribeSavingsPlansUsageDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeSavingsPlansUsageDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSavingsPlansUsageDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSavingsPlansUsageDetailResponseBody build() {
            return new DescribeSavingsPlansUsageDetailResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("Currency")
        private String currency;

        @NameInMap("DeductValue")
        private Float deductValue;

        @NameInMap("EndPeriod")
        private String endPeriod;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("PoolValue")
        private Float poolValue;

        @NameInMap("PostpaidCost")
        private Float postpaidCost;

        @NameInMap("SavedCost")
        private Float savedCost;

        @NameInMap("StartPeriod")
        private String startPeriod;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        @NameInMap("UsagePercentage")
        private Float usagePercentage;

        @NameInMap("UserId")
        private Long userId;

        @NameInMap("UserName")
        private String userName;

        private Items(Builder builder) {
            this.currency = builder.currency;
            this.deductValue = builder.deductValue;
            this.endPeriod = builder.endPeriod;
            this.instanceId = builder.instanceId;
            this.poolValue = builder.poolValue;
            this.postpaidCost = builder.postpaidCost;
            this.savedCost = builder.savedCost;
            this.startPeriod = builder.startPeriod;
            this.status = builder.status;
            this.type = builder.type;
            this.usagePercentage = builder.usagePercentage;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return deductValue
         */
        public Float getDeductValue() {
            return this.deductValue;
        }

        /**
         * @return endPeriod
         */
        public String getEndPeriod() {
            return this.endPeriod;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return poolValue
         */
        public Float getPoolValue() {
            return this.poolValue;
        }

        /**
         * @return postpaidCost
         */
        public Float getPostpaidCost() {
            return this.postpaidCost;
        }

        /**
         * @return savedCost
         */
        public Float getSavedCost() {
            return this.savedCost;
        }

        /**
         * @return startPeriod
         */
        public String getStartPeriod() {
            return this.startPeriod;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return usagePercentage
         */
        public Float getUsagePercentage() {
            return this.usagePercentage;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String currency; 
            private Float deductValue; 
            private String endPeriod; 
            private String instanceId; 
            private Float poolValue; 
            private Float postpaidCost; 
            private Float savedCost; 
            private String startPeriod; 
            private String status; 
            private String type; 
            private Float usagePercentage; 
            private Long userId; 
            private String userName; 

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * DeductValue.
             */
            public Builder deductValue(Float deductValue) {
                this.deductValue = deductValue;
                return this;
            }

            /**
             * EndPeriod.
             */
            public Builder endPeriod(String endPeriod) {
                this.endPeriod = endPeriod;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * PoolValue.
             */
            public Builder poolValue(Float poolValue) {
                this.poolValue = poolValue;
                return this;
            }

            /**
             * PostpaidCost.
             */
            public Builder postpaidCost(Float postpaidCost) {
                this.postpaidCost = postpaidCost;
                return this;
            }

            /**
             * SavedCost.
             */
            public Builder savedCost(Float savedCost) {
                this.savedCost = savedCost;
                return this;
            }

            /**
             * StartPeriod.
             */
            public Builder startPeriod(String startPeriod) {
                this.startPeriod = startPeriod;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UsagePercentage.
             */
            public Builder usagePercentage(Float usagePercentage) {
                this.usagePercentage = usagePercentage;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Items")
        private java.util.List < Items> items;

        @NameInMap("NextToken")
        private String nextToken;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.items = builder.items;
            this.nextToken = builder.nextToken;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Items> items; 
            private String nextToken; 
            private Integer totalCount; 

            /**
             * Items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}