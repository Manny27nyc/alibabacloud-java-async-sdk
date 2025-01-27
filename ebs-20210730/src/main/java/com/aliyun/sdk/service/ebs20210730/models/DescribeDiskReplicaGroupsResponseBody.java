// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskReplicaGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiskReplicaGroupsResponseBody</p>
 */
public class DescribeDiskReplicaGroupsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("ReplicaGroups")
    private java.util.List < ReplicaGroups> replicaGroups;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDiskReplicaGroupsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.replicaGroups = builder.replicaGroups;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskReplicaGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return replicaGroups
     */
    public java.util.List < ReplicaGroups> getReplicaGroups() {
        return this.replicaGroups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List < ReplicaGroups> replicaGroups; 
        private String requestId; 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ReplicaGroups.
         */
        public Builder replicaGroups(java.util.List < ReplicaGroups> replicaGroups) {
            this.replicaGroups = replicaGroups;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDiskReplicaGroupsResponseBody build() {
            return new DescribeDiskReplicaGroupsResponseBody(this);
        } 

    } 

    public static class ReplicaGroups extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DestinationRegionId")
        private String destinationRegionId;

        @NameInMap("DestinationZoneId")
        private String destinationZoneId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("LastRecoverPoint")
        private Long lastRecoverPoint;

        @NameInMap("PairIds")
        private java.util.List < byte[] > pairIds;

        @NameInMap("PairNumber")
        private Long pairNumber;

        @NameInMap("RPO")
        private Long RPO;

        @NameInMap("ReplicaGroupId")
        private String replicaGroupId;

        @NameInMap("Site")
        private String site;

        @NameInMap("SourceRegionId")
        private String sourceRegionId;

        @NameInMap("SourceZoneId")
        private String sourceZoneId;

        @NameInMap("Status")
        private String status;

        private ReplicaGroups(Builder builder) {
            this.description = builder.description;
            this.destinationRegionId = builder.destinationRegionId;
            this.destinationZoneId = builder.destinationZoneId;
            this.groupName = builder.groupName;
            this.lastRecoverPoint = builder.lastRecoverPoint;
            this.pairIds = builder.pairIds;
            this.pairNumber = builder.pairNumber;
            this.RPO = builder.RPO;
            this.replicaGroupId = builder.replicaGroupId;
            this.site = builder.site;
            this.sourceRegionId = builder.sourceRegionId;
            this.sourceZoneId = builder.sourceZoneId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplicaGroups create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destinationRegionId
         */
        public String getDestinationRegionId() {
            return this.destinationRegionId;
        }

        /**
         * @return destinationZoneId
         */
        public String getDestinationZoneId() {
            return this.destinationZoneId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return lastRecoverPoint
         */
        public Long getLastRecoverPoint() {
            return this.lastRecoverPoint;
        }

        /**
         * @return pairIds
         */
        public java.util.List < byte[] > getPairIds() {
            return this.pairIds;
        }

        /**
         * @return pairNumber
         */
        public Long getPairNumber() {
            return this.pairNumber;
        }

        /**
         * @return RPO
         */
        public Long getRPO() {
            return this.RPO;
        }

        /**
         * @return replicaGroupId
         */
        public String getReplicaGroupId() {
            return this.replicaGroupId;
        }

        /**
         * @return site
         */
        public String getSite() {
            return this.site;
        }

        /**
         * @return sourceRegionId
         */
        public String getSourceRegionId() {
            return this.sourceRegionId;
        }

        /**
         * @return sourceZoneId
         */
        public String getSourceZoneId() {
            return this.sourceZoneId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String description; 
            private String destinationRegionId; 
            private String destinationZoneId; 
            private String groupName; 
            private Long lastRecoverPoint; 
            private java.util.List < byte[] > pairIds; 
            private Long pairNumber; 
            private Long RPO; 
            private String replicaGroupId; 
            private String site; 
            private String sourceRegionId; 
            private String sourceZoneId; 
            private String status; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DestinationRegionId.
             */
            public Builder destinationRegionId(String destinationRegionId) {
                this.destinationRegionId = destinationRegionId;
                return this;
            }

            /**
             * DestinationZoneId.
             */
            public Builder destinationZoneId(String destinationZoneId) {
                this.destinationZoneId = destinationZoneId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * LastRecoverPoint.
             */
            public Builder lastRecoverPoint(Long lastRecoverPoint) {
                this.lastRecoverPoint = lastRecoverPoint;
                return this;
            }

            /**
             * PairIds.
             */
            public Builder pairIds(java.util.List < byte[] > pairIds) {
                this.pairIds = pairIds;
                return this;
            }

            /**
             * 复制组中的复制对个数
             */
            public Builder pairNumber(Long pairNumber) {
                this.pairNumber = pairNumber;
                return this;
            }

            /**
             * RPO.
             */
            public Builder RPO(Long RPO) {
                this.RPO = RPO;
                return this;
            }

            /**
             * ReplicaGroupId.
             */
            public Builder replicaGroupId(String replicaGroupId) {
                this.replicaGroupId = replicaGroupId;
                return this;
            }

            /**
             * pair信息的后端站点来源，production或backup
             */
            public Builder site(String site) {
                this.site = site;
                return this;
            }

            /**
             * SourceRegionId.
             */
            public Builder sourceRegionId(String sourceRegionId) {
                this.sourceRegionId = sourceRegionId;
                return this;
            }

            /**
             * SourceZoneId.
             */
            public Builder sourceZoneId(String sourceZoneId) {
                this.sourceZoneId = sourceZoneId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ReplicaGroups build() {
                return new ReplicaGroups(this);
            } 

        } 

    }
}
