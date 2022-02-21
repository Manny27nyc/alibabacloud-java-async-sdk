// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExecutionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListExecutionsResponseBody</p>
 */
public class ListExecutionsResponseBody extends TeaModel {
    @NameInMap("Executions")
    private java.util.List < Executions> executions;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private ListExecutionsResponseBody(Builder builder) {
        this.executions = builder.executions;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExecutionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return executions
     */
    public java.util.List < Executions> getExecutions() {
        return this.executions;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Executions> executions; 
        private String nextToken; 
        private String requestId; 

        /**
         * Executions.
         */
        public Builder executions(java.util.List < Executions> executions) {
            this.executions = executions;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListExecutionsResponseBody build() {
            return new ListExecutionsResponseBody(this);
        } 

    } 

    public static class Executions extends TeaModel {
        @NameInMap("ExternalInputUri")
        private String externalInputUri;

        @NameInMap("ExternalOutputUri")
        private String externalOutputUri;

        @NameInMap("FlowDefinition")
        private String flowDefinition;

        @NameInMap("FlowName")
        private String flowName;

        @NameInMap("Input")
        private String input;

        @NameInMap("Name")
        private String name;

        @NameInMap("Output")
        private String output;

        @NameInMap("StartedTime")
        private String startedTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("StoppedTime")
        private String stoppedTime;

        private Executions(Builder builder) {
            this.externalInputUri = builder.externalInputUri;
            this.externalOutputUri = builder.externalOutputUri;
            this.flowDefinition = builder.flowDefinition;
            this.flowName = builder.flowName;
            this.input = builder.input;
            this.name = builder.name;
            this.output = builder.output;
            this.startedTime = builder.startedTime;
            this.status = builder.status;
            this.stoppedTime = builder.stoppedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Executions create() {
            return builder().build();
        }

        /**
         * @return externalInputUri
         */
        public String getExternalInputUri() {
            return this.externalInputUri;
        }

        /**
         * @return externalOutputUri
         */
        public String getExternalOutputUri() {
            return this.externalOutputUri;
        }

        /**
         * @return flowDefinition
         */
        public String getFlowDefinition() {
            return this.flowDefinition;
        }

        /**
         * @return flowName
         */
        public String getFlowName() {
            return this.flowName;
        }

        /**
         * @return input
         */
        public String getInput() {
            return this.input;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return startedTime
         */
        public String getStartedTime() {
            return this.startedTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return stoppedTime
         */
        public String getStoppedTime() {
            return this.stoppedTime;
        }

        public static final class Builder {
            private String externalInputUri; 
            private String externalOutputUri; 
            private String flowDefinition; 
            private String flowName; 
            private String input; 
            private String name; 
            private String output; 
            private String startedTime; 
            private String status; 
            private String stoppedTime; 

            /**
             * ExternalInputUri.
             */
            public Builder externalInputUri(String externalInputUri) {
                this.externalInputUri = externalInputUri;
                return this;
            }

            /**
             * ExternalOutputUri.
             */
            public Builder externalOutputUri(String externalOutputUri) {
                this.externalOutputUri = externalOutputUri;
                return this;
            }

            /**
             * FlowDefinition.
             */
            public Builder flowDefinition(String flowDefinition) {
                this.flowDefinition = flowDefinition;
                return this;
            }

            /**
             * FlowName.
             */
            public Builder flowName(String flowName) {
                this.flowName = flowName;
                return this;
            }

            /**
             * Input.
             */
            public Builder input(String input) {
                this.input = input;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Output.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * StartedTime.
             */
            public Builder startedTime(String startedTime) {
                this.startedTime = startedTime;
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
             * StoppedTime.
             */
            public Builder stoppedTime(String stoppedTime) {
                this.stoppedTime = stoppedTime;
                return this;
            }

            public Executions build() {
                return new Executions(this);
            } 

        } 

    }
}
