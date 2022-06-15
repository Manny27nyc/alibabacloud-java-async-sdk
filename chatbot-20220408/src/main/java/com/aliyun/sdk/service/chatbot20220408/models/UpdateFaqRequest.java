// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFaqRequest} extends {@link RequestModel}
 *
 * <p>UpdateFaqRequest</p>
 */
public class UpdateFaqRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Body
    @NameInMap("CategoryId")
    @Validation(required = true)
    private Long categoryId;

    @Body
    @NameInMap("EndDate")
    private String endDate;

    @Body
    @NameInMap("KnowledgeId")
    @Validation(required = true)
    private Long knowledgeId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("StartDate")
    private String startDate;

    @Body
    @NameInMap("Title")
    @Validation(required = true)
    private String title;

    private UpdateFaqRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.categoryId = builder.categoryId;
        this.endDate = builder.endDate;
        this.knowledgeId = builder.knowledgeId;
        this.regionId = builder.regionId;
        this.startDate = builder.startDate;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFaqRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return knowledgeId
     */
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<UpdateFaqRequest, Builder> {
        private String agentKey; 
        private Long categoryId; 
        private String endDate; 
        private Long knowledgeId; 
        private String regionId; 
        private String startDate; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFaqRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.categoryId = request.categoryId;
            this.endDate = request.endDate;
            this.knowledgeId = request.knowledgeId;
            this.regionId = request.regionId;
            this.startDate = request.startDate;
            this.title = request.title;
        } 

        /**
         * 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * 知识的类目ID
         */
        public Builder categoryId(Long categoryId) {
            this.putBodyParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * 失效时间
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * 知识ID
         */
        public Builder knowledgeId(Long knowledgeId) {
            this.putBodyParameter("KnowledgeId", knowledgeId);
            this.knowledgeId = knowledgeId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 生效时间
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * 知识标题
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public UpdateFaqRequest build() {
            return new UpdateFaqRequest(this);
        } 

    } 

}