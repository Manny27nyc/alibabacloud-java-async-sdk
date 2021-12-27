// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeAffectedMaliciousFileImagesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAffectedMaliciousFileImagesRequest</p>
 */
public class DescribeAffectedMaliciousFileImagesRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("ImageDigest")
    private String imageDigest;

    @Query
    @NameInMap("ImageLayer")
    private String imageLayer;

    @Query
    @NameInMap("ImageTag")
    private String imageTag;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("MaliciousMd5")
    private String maliciousMd5;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("RepoId")
    private String repoId;

    @Query
    @NameInMap("RepoInstanceId")
    private String repoInstanceId;

    @Query
    @NameInMap("RepoName")
    private String repoName;

    @Query
    @NameInMap("RepoNamespace")
    private String repoNamespace;

    @Query
    @NameInMap("RepoRegionId")
    private String repoRegionId;


    private DescribeAffectedMaliciousFileImagesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.imageDigest = builder.imageDigest;
        this.imageLayer = builder.imageLayer;
        this.imageTag = builder.imageTag;
        this.lang = builder.lang;
        this.maliciousMd5 = builder.maliciousMd5;
        this.pageSize = builder.pageSize;
        this.repoId = builder.repoId;
        this.repoInstanceId = builder.repoInstanceId;
        this.repoName = builder.repoName;
        this.repoNamespace = builder.repoNamespace;
        this.repoRegionId = builder.repoRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAffectedMaliciousFileImagesRequest create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return imageDigest
     */
    public String getImageDigest() {
        return this.imageDigest;
    }

    /**
     * @return imageLayer
     */
    public String getImageLayer() {
        return this.imageLayer;
    }

    /**
     * @return imageTag
     */
    public String getImageTag() {
        return this.imageTag;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return maliciousMd5
     */
    public String getMaliciousMd5() {
        return this.maliciousMd5;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    /**
     * @return repoInstanceId
     */
    public String getRepoInstanceId() {
        return this.repoInstanceId;
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return repoNamespace
     */
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

    /**
     * @return repoRegionId
     */
    public String getRepoRegionId() {
        return this.repoRegionId;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private Integer currentPage; 
        private String imageDigest; 
        private String imageLayer; 
        private String imageTag; 
        private String lang; 
        private String maliciousMd5; 
        private String pageSize; 
        private String repoId; 
        private String repoInstanceId; 
        private String repoName; 
        private String repoNamespace; 
        private String repoRegionId; 

        /**
         * <p>CurrentPage.</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>ImageDigest.</p>
         */
        public Builder imageDigest(String imageDigest) {
            this.putQueryParameter("ImageDigest", imageDigest);
            this.imageDigest = imageDigest;
            return this;
        }

        /**
         * <p>ImageLayer.</p>
         */
        public Builder imageLayer(String imageLayer) {
            this.putQueryParameter("ImageLayer", imageLayer);
            this.imageLayer = imageLayer;
            return this;
        }

        /**
         * <p>ImageTag.</p>
         */
        public Builder imageTag(String imageTag) {
            this.putQueryParameter("ImageTag", imageTag);
            this.imageTag = imageTag;
            return this;
        }

        /**
         * <p>Lang.</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>MaliciousMd5.</p>
         */
        public Builder maliciousMd5(String maliciousMd5) {
            this.putQueryParameter("MaliciousMd5", maliciousMd5);
            this.maliciousMd5 = maliciousMd5;
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
         * <p>RepoId.</p>
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * <p>RepoInstanceId.</p>
         */
        public Builder repoInstanceId(String repoInstanceId) {
            this.putQueryParameter("RepoInstanceId", repoInstanceId);
            this.repoInstanceId = repoInstanceId;
            return this;
        }

        /**
         * <p>RepoName.</p>
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * <p>RepoNamespace.</p>
         */
        public Builder repoNamespace(String repoNamespace) {
            this.putQueryParameter("RepoNamespace", repoNamespace);
            this.repoNamespace = repoNamespace;
            return this;
        }

        /**
         * <p>RepoRegionId.</p>
         */
        public Builder repoRegionId(String repoRegionId) {
            this.putQueryParameter("RepoRegionId", repoRegionId);
            this.repoRegionId = repoRegionId;
            return this;
        }

        public DescribeAffectedMaliciousFileImagesRequest build() {
            return new DescribeAffectedMaliciousFileImagesRequest(this);
        } 

    } 

}
