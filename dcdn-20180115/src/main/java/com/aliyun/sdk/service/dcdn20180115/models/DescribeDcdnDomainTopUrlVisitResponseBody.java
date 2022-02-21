// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainTopUrlVisitResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainTopUrlVisitResponseBody</p>
 */
public class DescribeDcdnDomainTopUrlVisitResponseBody extends TeaModel {
    @NameInMap("AllUrlList")
    private AllUrlList allUrlList;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("Url200List")
    private Url200List url200List;

    @NameInMap("Url300List")
    private Url300List url300List;

    @NameInMap("Url400List")
    private Url400List url400List;

    @NameInMap("Url500List")
    private Url500List url500List;

    private DescribeDcdnDomainTopUrlVisitResponseBody(Builder builder) {
        this.allUrlList = builder.allUrlList;
        this.domainName = builder.domainName;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.url200List = builder.url200List;
        this.url300List = builder.url300List;
        this.url400List = builder.url400List;
        this.url500List = builder.url500List;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainTopUrlVisitResponseBody create() {
        return builder().build();
    }

    /**
     * @return allUrlList
     */
    public AllUrlList getAllUrlList() {
        return this.allUrlList;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return url200List
     */
    public Url200List getUrl200List() {
        return this.url200List;
    }

    /**
     * @return url300List
     */
    public Url300List getUrl300List() {
        return this.url300List;
    }

    /**
     * @return url400List
     */
    public Url400List getUrl400List() {
        return this.url400List;
    }

    /**
     * @return url500List
     */
    public Url500List getUrl500List() {
        return this.url500List;
    }

    public static final class Builder {
        private AllUrlList allUrlList; 
        private String domainName; 
        private String requestId; 
        private String startTime; 
        private Url200List url200List; 
        private Url300List url300List; 
        private Url400List url400List; 
        private Url500List url500List; 

        /**
         * AllUrlList.
         */
        public Builder allUrlList(AllUrlList allUrlList) {
            this.allUrlList = allUrlList;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Url200List.
         */
        public Builder url200List(Url200List url200List) {
            this.url200List = url200List;
            return this;
        }

        /**
         * Url300List.
         */
        public Builder url300List(Url300List url300List) {
            this.url300List = url300List;
            return this;
        }

        /**
         * Url400List.
         */
        public Builder url400List(Url400List url400List) {
            this.url400List = url400List;
            return this;
        }

        /**
         * Url500List.
         */
        public Builder url500List(Url500List url500List) {
            this.url500List = url500List;
            return this;
        }

        public DescribeDcdnDomainTopUrlVisitResponseBody build() {
            return new DescribeDcdnDomainTopUrlVisitResponseBody(this);
        } 

    } 

    public static class UrlList extends TeaModel {
        @NameInMap("Flow")
        private String flow;

        @NameInMap("FlowProportion")
        private Float flowProportion;

        @NameInMap("UrlDetail")
        private String urlDetail;

        @NameInMap("VisitData")
        private String visitData;

        @NameInMap("VisitProportion")
        private Float visitProportion;

        private UrlList(Builder builder) {
            this.flow = builder.flow;
            this.flowProportion = builder.flowProportion;
            this.urlDetail = builder.urlDetail;
            this.visitData = builder.visitData;
            this.visitProportion = builder.visitProportion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UrlList create() {
            return builder().build();
        }

        /**
         * @return flow
         */
        public String getFlow() {
            return this.flow;
        }

        /**
         * @return flowProportion
         */
        public Float getFlowProportion() {
            return this.flowProportion;
        }

        /**
         * @return urlDetail
         */
        public String getUrlDetail() {
            return this.urlDetail;
        }

        /**
         * @return visitData
         */
        public String getVisitData() {
            return this.visitData;
        }

        /**
         * @return visitProportion
         */
        public Float getVisitProportion() {
            return this.visitProportion;
        }

        public static final class Builder {
            private String flow; 
            private Float flowProportion; 
            private String urlDetail; 
            private String visitData; 
            private Float visitProportion; 

            /**
             * Flow.
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * FlowProportion.
             */
            public Builder flowProportion(Float flowProportion) {
                this.flowProportion = flowProportion;
                return this;
            }

            /**
             * UrlDetail.
             */
            public Builder urlDetail(String urlDetail) {
                this.urlDetail = urlDetail;
                return this;
            }

            /**
             * VisitData.
             */
            public Builder visitData(String visitData) {
                this.visitData = visitData;
                return this;
            }

            /**
             * VisitProportion.
             */
            public Builder visitProportion(Float visitProportion) {
                this.visitProportion = visitProportion;
                return this;
            }

            public UrlList build() {
                return new UrlList(this);
            } 

        } 

    }
    public static class AllUrlList extends TeaModel {
        @NameInMap("UrlList")
        private java.util.List < UrlList> urlList;

        private AllUrlList(Builder builder) {
            this.urlList = builder.urlList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllUrlList create() {
            return builder().build();
        }

        /**
         * @return urlList
         */
        public java.util.List < UrlList> getUrlList() {
            return this.urlList;
        }

        public static final class Builder {
            private java.util.List < UrlList> urlList; 

            /**
             * UrlList.
             */
            public Builder urlList(java.util.List < UrlList> urlList) {
                this.urlList = urlList;
                return this;
            }

            public AllUrlList build() {
                return new AllUrlList(this);
            } 

        } 

    }
    public static class Url200ListUrlList extends TeaModel {
        @NameInMap("Flow")
        private String flow;

        @NameInMap("FlowProportion")
        private Float flowProportion;

        @NameInMap("UrlDetail")
        private String urlDetail;

        @NameInMap("VisitData")
        private String visitData;

        @NameInMap("VisitProportion")
        private Float visitProportion;

        private Url200ListUrlList(Builder builder) {
            this.flow = builder.flow;
            this.flowProportion = builder.flowProportion;
            this.urlDetail = builder.urlDetail;
            this.visitData = builder.visitData;
            this.visitProportion = builder.visitProportion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Url200ListUrlList create() {
            return builder().build();
        }

        /**
         * @return flow
         */
        public String getFlow() {
            return this.flow;
        }

        /**
         * @return flowProportion
         */
        public Float getFlowProportion() {
            return this.flowProportion;
        }

        /**
         * @return urlDetail
         */
        public String getUrlDetail() {
            return this.urlDetail;
        }

        /**
         * @return visitData
         */
        public String getVisitData() {
            return this.visitData;
        }

        /**
         * @return visitProportion
         */
        public Float getVisitProportion() {
            return this.visitProportion;
        }

        public static final class Builder {
            private String flow; 
            private Float flowProportion; 
            private String urlDetail; 
            private String visitData; 
            private Float visitProportion; 

            /**
             * Flow.
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * FlowProportion.
             */
            public Builder flowProportion(Float flowProportion) {
                this.flowProportion = flowProportion;
                return this;
            }

            /**
             * UrlDetail.
             */
            public Builder urlDetail(String urlDetail) {
                this.urlDetail = urlDetail;
                return this;
            }

            /**
             * VisitData.
             */
            public Builder visitData(String visitData) {
                this.visitData = visitData;
                return this;
            }

            /**
             * VisitProportion.
             */
            public Builder visitProportion(Float visitProportion) {
                this.visitProportion = visitProportion;
                return this;
            }

            public Url200ListUrlList build() {
                return new Url200ListUrlList(this);
            } 

        } 

    }
    public static class Url200List extends TeaModel {
        @NameInMap("UrlList")
        private java.util.List < Url200ListUrlList> urlList;

        private Url200List(Builder builder) {
            this.urlList = builder.urlList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Url200List create() {
            return builder().build();
        }

        /**
         * @return urlList
         */
        public java.util.List < Url200ListUrlList> getUrlList() {
            return this.urlList;
        }

        public static final class Builder {
            private java.util.List < Url200ListUrlList> urlList; 

            /**
             * UrlList.
             */
            public Builder urlList(java.util.List < Url200ListUrlList> urlList) {
                this.urlList = urlList;
                return this;
            }

            public Url200List build() {
                return new Url200List(this);
            } 

        } 

    }
    public static class Url300ListUrlList extends TeaModel {
        @NameInMap("Flow")
        private String flow;

        @NameInMap("FlowProportion")
        private Float flowProportion;

        @NameInMap("UrlDetail")
        private String urlDetail;

        @NameInMap("VisitData")
        private String visitData;

        @NameInMap("VisitProportion")
        private Float visitProportion;

        private Url300ListUrlList(Builder builder) {
            this.flow = builder.flow;
            this.flowProportion = builder.flowProportion;
            this.urlDetail = builder.urlDetail;
            this.visitData = builder.visitData;
            this.visitProportion = builder.visitProportion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Url300ListUrlList create() {
            return builder().build();
        }

        /**
         * @return flow
         */
        public String getFlow() {
            return this.flow;
        }

        /**
         * @return flowProportion
         */
        public Float getFlowProportion() {
            return this.flowProportion;
        }

        /**
         * @return urlDetail
         */
        public String getUrlDetail() {
            return this.urlDetail;
        }

        /**
         * @return visitData
         */
        public String getVisitData() {
            return this.visitData;
        }

        /**
         * @return visitProportion
         */
        public Float getVisitProportion() {
            return this.visitProportion;
        }

        public static final class Builder {
            private String flow; 
            private Float flowProportion; 
            private String urlDetail; 
            private String visitData; 
            private Float visitProportion; 

            /**
             * Flow.
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * FlowProportion.
             */
            public Builder flowProportion(Float flowProportion) {
                this.flowProportion = flowProportion;
                return this;
            }

            /**
             * UrlDetail.
             */
            public Builder urlDetail(String urlDetail) {
                this.urlDetail = urlDetail;
                return this;
            }

            /**
             * VisitData.
             */
            public Builder visitData(String visitData) {
                this.visitData = visitData;
                return this;
            }

            /**
             * VisitProportion.
             */
            public Builder visitProportion(Float visitProportion) {
                this.visitProportion = visitProportion;
                return this;
            }

            public Url300ListUrlList build() {
                return new Url300ListUrlList(this);
            } 

        } 

    }
    public static class Url300List extends TeaModel {
        @NameInMap("UrlList")
        private java.util.List < Url300ListUrlList> urlList;

        private Url300List(Builder builder) {
            this.urlList = builder.urlList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Url300List create() {
            return builder().build();
        }

        /**
         * @return urlList
         */
        public java.util.List < Url300ListUrlList> getUrlList() {
            return this.urlList;
        }

        public static final class Builder {
            private java.util.List < Url300ListUrlList> urlList; 

            /**
             * UrlList.
             */
            public Builder urlList(java.util.List < Url300ListUrlList> urlList) {
                this.urlList = urlList;
                return this;
            }

            public Url300List build() {
                return new Url300List(this);
            } 

        } 

    }
    public static class Url400ListUrlList extends TeaModel {
        @NameInMap("Flow")
        private String flow;

        @NameInMap("FlowProportion")
        private Float flowProportion;

        @NameInMap("UrlDetail")
        private String urlDetail;

        @NameInMap("VisitData")
        private String visitData;

        @NameInMap("VisitProportion")
        private Float visitProportion;

        private Url400ListUrlList(Builder builder) {
            this.flow = builder.flow;
            this.flowProportion = builder.flowProportion;
            this.urlDetail = builder.urlDetail;
            this.visitData = builder.visitData;
            this.visitProportion = builder.visitProportion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Url400ListUrlList create() {
            return builder().build();
        }

        /**
         * @return flow
         */
        public String getFlow() {
            return this.flow;
        }

        /**
         * @return flowProportion
         */
        public Float getFlowProportion() {
            return this.flowProportion;
        }

        /**
         * @return urlDetail
         */
        public String getUrlDetail() {
            return this.urlDetail;
        }

        /**
         * @return visitData
         */
        public String getVisitData() {
            return this.visitData;
        }

        /**
         * @return visitProportion
         */
        public Float getVisitProportion() {
            return this.visitProportion;
        }

        public static final class Builder {
            private String flow; 
            private Float flowProportion; 
            private String urlDetail; 
            private String visitData; 
            private Float visitProportion; 

            /**
             * Flow.
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * FlowProportion.
             */
            public Builder flowProportion(Float flowProportion) {
                this.flowProportion = flowProportion;
                return this;
            }

            /**
             * UrlDetail.
             */
            public Builder urlDetail(String urlDetail) {
                this.urlDetail = urlDetail;
                return this;
            }

            /**
             * VisitData.
             */
            public Builder visitData(String visitData) {
                this.visitData = visitData;
                return this;
            }

            /**
             * VisitProportion.
             */
            public Builder visitProportion(Float visitProportion) {
                this.visitProportion = visitProportion;
                return this;
            }

            public Url400ListUrlList build() {
                return new Url400ListUrlList(this);
            } 

        } 

    }
    public static class Url400List extends TeaModel {
        @NameInMap("UrlList")
        private java.util.List < Url400ListUrlList> urlList;

        private Url400List(Builder builder) {
            this.urlList = builder.urlList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Url400List create() {
            return builder().build();
        }

        /**
         * @return urlList
         */
        public java.util.List < Url400ListUrlList> getUrlList() {
            return this.urlList;
        }

        public static final class Builder {
            private java.util.List < Url400ListUrlList> urlList; 

            /**
             * UrlList.
             */
            public Builder urlList(java.util.List < Url400ListUrlList> urlList) {
                this.urlList = urlList;
                return this;
            }

            public Url400List build() {
                return new Url400List(this);
            } 

        } 

    }
    public static class Url500ListUrlList extends TeaModel {
        @NameInMap("Flow")
        private String flow;

        @NameInMap("FlowProportion")
        private Float flowProportion;

        @NameInMap("UrlDetail")
        private String urlDetail;

        @NameInMap("VisitData")
        private String visitData;

        @NameInMap("VisitProportion")
        private Float visitProportion;

        private Url500ListUrlList(Builder builder) {
            this.flow = builder.flow;
            this.flowProportion = builder.flowProportion;
            this.urlDetail = builder.urlDetail;
            this.visitData = builder.visitData;
            this.visitProportion = builder.visitProportion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Url500ListUrlList create() {
            return builder().build();
        }

        /**
         * @return flow
         */
        public String getFlow() {
            return this.flow;
        }

        /**
         * @return flowProportion
         */
        public Float getFlowProportion() {
            return this.flowProportion;
        }

        /**
         * @return urlDetail
         */
        public String getUrlDetail() {
            return this.urlDetail;
        }

        /**
         * @return visitData
         */
        public String getVisitData() {
            return this.visitData;
        }

        /**
         * @return visitProportion
         */
        public Float getVisitProportion() {
            return this.visitProportion;
        }

        public static final class Builder {
            private String flow; 
            private Float flowProportion; 
            private String urlDetail; 
            private String visitData; 
            private Float visitProportion; 

            /**
             * Flow.
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * FlowProportion.
             */
            public Builder flowProportion(Float flowProportion) {
                this.flowProportion = flowProportion;
                return this;
            }

            /**
             * UrlDetail.
             */
            public Builder urlDetail(String urlDetail) {
                this.urlDetail = urlDetail;
                return this;
            }

            /**
             * VisitData.
             */
            public Builder visitData(String visitData) {
                this.visitData = visitData;
                return this;
            }

            /**
             * VisitProportion.
             */
            public Builder visitProportion(Float visitProportion) {
                this.visitProportion = visitProportion;
                return this;
            }

            public Url500ListUrlList build() {
                return new Url500ListUrlList(this);
            } 

        } 

    }
    public static class Url500List extends TeaModel {
        @NameInMap("UrlList")
        private java.util.List < Url500ListUrlList> urlList;

        private Url500List(Builder builder) {
            this.urlList = builder.urlList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Url500List create() {
            return builder().build();
        }

        /**
         * @return urlList
         */
        public java.util.List < Url500ListUrlList> getUrlList() {
            return this.urlList;
        }

        public static final class Builder {
            private java.util.List < Url500ListUrlList> urlList; 

            /**
             * UrlList.
             */
            public Builder urlList(java.util.List < Url500ListUrlList> urlList) {
                this.urlList = urlList;
                return this;
            }

            public Url500List build() {
                return new Url500List(this);
            } 

        } 

    }
}
