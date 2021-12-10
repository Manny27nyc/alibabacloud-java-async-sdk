// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeSuspEventQuaraFilesRequest} extends {@link RequestModel}
 *
 * <p>DescribeSuspEventQuaraFilesRequest</p>
 */
public class DescribeSuspEventQuaraFilesRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private String currentPage;

    @Query
    @NameInMap("From")
    private String from;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("QuaraTag")
    private String quaraTag;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Status")
    private String status;


    private DescribeSuspEventQuaraFilesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.from = builder.from;
        this.groupId = builder.groupId;
        this.pageSize = builder.pageSize;
        this.quaraTag = builder.quaraTag;
        this.sourceIp = builder.sourceIp;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSuspEventQuaraFilesRequest create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return quaraTag
     */
    public String getQuaraTag() {
        return this.quaraTag;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder {
        private String currentPage; 
        private String from; 
        private String groupId; 
        private String pageSize; 
        private String quaraTag; 
        private String sourceIp; 
        private String status; 

        /**
         * <p>CurrentPage.</p>
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>From.</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>GroupId.</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>PageSize.</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>QuaraTag.</p>
         */
        public Builder quaraTag(String quaraTag) {
            this.putQueryParameter("QuaraTag", quaraTag);
            this.quaraTag = quaraTag;
            return this;
        }

        /**
         * <p>SourceIp.</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>Status.</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        public DescribeSuspEventQuaraFilesRequest build() {
            return new DescribeSuspEventQuaraFilesRequest(this);
        } 

    } 

}