// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeDingTalkResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDingTalkResponseBody</p>
 */
public class DescribeDingTalkResponseBody extends TeaModel {
    @NameInMap("ActionList")
    private java.util.List < ActionList> actionList;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;


    private DescribeDingTalkResponseBody(Builder builder) {
        this.actionList = builder.actionList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDingTalkResponseBody create() {
        return builder().build();
    }

    /**
     * @return actionList
     */
    public java.util.List < ActionList> getActionList() {
        return this.actionList;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ActionList> actionList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>ActionList.</p>
         */
        public Builder actionList(java.util.List < ActionList> actionList) {
            this.actionList = actionList;
            return this;
        }

        /**
         * <p>PageInfo.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDingTalkResponseBody build() {
            return new DescribeDingTalkResponseBody(this);
        } 

    } 

    public static class ActionList extends TeaModel {
        @NameInMap("ActionName")
        private String actionName;

        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("ConfigList")
        private String configList;

        @NameInMap("DingTalkLang")
        private String dingTalkLang;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("GroupIdList")
        private String groupIdList;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("IntervalTime")
        private Integer intervalTime;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Url")
        private String url;


        private ActionList(Builder builder) {
            this.actionName = builder.actionName;
            this.aliUid = builder.aliUid;
            this.configList = builder.configList;
            this.dingTalkLang = builder.dingTalkLang;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.groupIdList = builder.groupIdList;
            this.id = builder.id;
            this.intervalTime = builder.intervalTime;
            this.status = builder.status;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActionList create() {
            return builder().build();
        }

        /**
         * @return actionName
         */
        public String getActionName() {
            return this.actionName;
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return configList
         */
        public String getConfigList() {
            return this.configList;
        }

        /**
         * @return dingTalkLang
         */
        public String getDingTalkLang() {
            return this.dingTalkLang;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return groupIdList
         */
        public String getGroupIdList() {
            return this.groupIdList;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return intervalTime
         */
        public Integer getIntervalTime() {
            return this.intervalTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String actionName; 
            private Long aliUid; 
            private String configList; 
            private String dingTalkLang; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String groupIdList; 
            private Integer id; 
            private Integer intervalTime; 
            private Integer status; 
            private String url; 

            /**
             * <p>ActionName.</p>
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * <p>AliUid.</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>ConfigList.</p>
             */
            public Builder configList(String configList) {
                this.configList = configList;
                return this;
            }

            /**
             * <p>DingTalkLang.</p>
             */
            public Builder dingTalkLang(String dingTalkLang) {
                this.dingTalkLang = dingTalkLang;
                return this;
            }

            /**
             * <p>GmtCreate.</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>GmtModified.</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>GroupIdList.</p>
             */
            public Builder groupIdList(String groupIdList) {
                this.groupIdList = groupIdList;
                return this;
            }

            /**
             * <p>Id.</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>IntervalTime.</p>
             */
            public Builder intervalTime(Integer intervalTime) {
                this.intervalTime = intervalTime;
                return this;
            }

            /**
             * <p>Status.</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Url.</p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ActionList build() {
                return new ActionList(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;


        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>CurrentPage.</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>PageSize.</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>TotalCount.</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}