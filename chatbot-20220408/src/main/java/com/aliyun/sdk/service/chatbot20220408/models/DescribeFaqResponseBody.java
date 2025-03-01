// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFaqResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFaqResponseBody</p>
 */
public class DescribeFaqResponseBody extends TeaModel {
    @NameInMap("CategoryId")
    private Long categoryId;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("CreateUserName")
    private String createUserName;

    @NameInMap("EffectStatus")
    private Integer effectStatus;

    @NameInMap("EndDate")
    private String endDate;

    @NameInMap("KnowledgeId")
    private Long knowledgeId;

    @NameInMap("ModifyTime")
    private String modifyTime;

    @NameInMap("ModifyUserName")
    private String modifyUserName;

    @NameInMap("Outlines")
    private java.util.List < Outlines> outlines;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SimQuestions")
    private java.util.List < SimQuestions> simQuestions;

    @NameInMap("Solutions")
    private java.util.List < Solutions> solutions;

    @NameInMap("StartDate")
    private String startDate;

    @NameInMap("Status")
    private Integer status;

    @NameInMap("Title")
    private String title;

    private DescribeFaqResponseBody(Builder builder) {
        this.categoryId = builder.categoryId;
        this.createTime = builder.createTime;
        this.createUserName = builder.createUserName;
        this.effectStatus = builder.effectStatus;
        this.endDate = builder.endDate;
        this.knowledgeId = builder.knowledgeId;
        this.modifyTime = builder.modifyTime;
        this.modifyUserName = builder.modifyUserName;
        this.outlines = builder.outlines;
        this.requestId = builder.requestId;
        this.simQuestions = builder.simQuestions;
        this.solutions = builder.solutions;
        this.startDate = builder.startDate;
        this.status = builder.status;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFaqResponseBody create() {
        return builder().build();
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createUserName
     */
    public String getCreateUserName() {
        return this.createUserName;
    }

    /**
     * @return effectStatus
     */
    public Integer getEffectStatus() {
        return this.effectStatus;
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
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return modifyUserName
     */
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    /**
     * @return outlines
     */
    public java.util.List < Outlines> getOutlines() {
        return this.outlines;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return simQuestions
     */
    public java.util.List < SimQuestions> getSimQuestions() {
        return this.simQuestions;
    }

    /**
     * @return solutions
     */
    public java.util.List < Solutions> getSolutions() {
        return this.solutions;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder {
        private Long categoryId; 
        private String createTime; 
        private String createUserName; 
        private Integer effectStatus; 
        private String endDate; 
        private Long knowledgeId; 
        private String modifyTime; 
        private String modifyUserName; 
        private java.util.List < Outlines> outlines; 
        private String requestId; 
        private java.util.List < SimQuestions> simQuestions; 
        private java.util.List < Solutions> solutions; 
        private String startDate; 
        private Integer status; 
        private String title; 

        /**
         * 类目ID
         */
        public Builder categoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        /**
         * 创建时间（UTC时间）
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * 创建人
         */
        public Builder createUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }

        /**
         * 知识生效状态,根据StartDate, EndDate计算出来: 20-生效中, 21-已失效, 22-待生效
         */
        public Builder effectStatus(Integer effectStatus) {
            this.effectStatus = effectStatus;
            return this;
        }

        /**
         * 失效时间（UTC时间）
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * 知识ID
         */
        public Builder knowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }

        /**
         * 修改时间（UTC时间）
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * 修改人
         */
        public Builder modifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }

        /**
         * 关联问列表
         */
        public Builder outlines(java.util.List < Outlines> outlines) {
            this.outlines = outlines;
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
         * 相似问列表
         */
        public Builder simQuestions(java.util.List < SimQuestions> simQuestions) {
            this.simQuestions = simQuestions;
            return this;
        }

        /**
         * 答案列表
         */
        public Builder solutions(java.util.List < Solutions> solutions) {
            this.solutions = solutions;
            return this;
        }

        /**
         * 生效时间（UTC时间）
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * 知识状态: -1-已删除未发布, 1-未发布, 2-已发布, 3-已更新未发布
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * 标题
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public DescribeFaqResponseBody build() {
            return new DescribeFaqResponseBody(this);
        } 

    } 

    public static class Outlines extends TeaModel {
        @NameInMap("ConnQuestionId")
        private Long connQuestionId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("OutlineId")
        private Long outlineId;

        @NameInMap("Title")
        private String title;

        private Outlines(Builder builder) {
            this.connQuestionId = builder.connQuestionId;
            this.createTime = builder.createTime;
            this.modifyTime = builder.modifyTime;
            this.outlineId = builder.outlineId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Outlines create() {
            return builder().build();
        }

        /**
         * @return connQuestionId
         */
        public Long getConnQuestionId() {
            return this.connQuestionId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return outlineId
         */
        public Long getOutlineId() {
            return this.outlineId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Long connQuestionId; 
            private String createTime; 
            private String modifyTime; 
            private Long outlineId; 
            private String title; 

            /**
             * 关联知识ID
             */
            public Builder connQuestionId(Long connQuestionId) {
                this.connQuestionId = connQuestionId;
                return this;
            }

            /**
             * 创建时间(UTC 时间)
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 修改时间(UTC 时间)
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * 关联关系ID
             */
            public Builder outlineId(Long outlineId) {
                this.outlineId = outlineId;
                return this;
            }

            /**
             * 关联知识标题
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Outlines build() {
                return new Outlines(this);
            } 

        } 

    }
    public static class SimQuestions extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("SimQuestionId")
        private Long simQuestionId;

        @NameInMap("Title")
        private String title;

        private SimQuestions(Builder builder) {
            this.createTime = builder.createTime;
            this.modifyTime = builder.modifyTime;
            this.simQuestionId = builder.simQuestionId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimQuestions create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return simQuestionId
         */
        public Long getSimQuestionId() {
            return this.simQuestionId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String createTime; 
            private String modifyTime; 
            private Long simQuestionId; 
            private String title; 

            /**
             * 创建时间(UTC 时间)
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 修改时间(UTC 时间)
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * 相似问ID
             */
            public Builder simQuestionId(Long simQuestionId) {
                this.simQuestionId = simQuestionId;
                return this;
            }

            /**
             * 相似问标题
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public SimQuestions build() {
                return new SimQuestions(this);
            } 

        } 

    }
    public static class Solutions extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("ContentType")
        private Integer contentType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("PerspectiveCodes")
        private java.util.List < String > perspectiveCodes;

        @NameInMap("PlainText")
        private String plainText;

        @NameInMap("SolutionId")
        private Long solutionId;

        private Solutions(Builder builder) {
            this.content = builder.content;
            this.contentType = builder.contentType;
            this.createTime = builder.createTime;
            this.modifyTime = builder.modifyTime;
            this.perspectiveCodes = builder.perspectiveCodes;
            this.plainText = builder.plainText;
            this.solutionId = builder.solutionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Solutions create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentType
         */
        public Integer getContentType() {
            return this.contentType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return perspectiveCodes
         */
        public java.util.List < String > getPerspectiveCodes() {
            return this.perspectiveCodes;
        }

        /**
         * @return plainText
         */
        public String getPlainText() {
            return this.plainText;
        }

        /**
         * @return solutionId
         */
        public Long getSolutionId() {
            return this.solutionId;
        }

        public static final class Builder {
            private String content; 
            private Integer contentType; 
            private String createTime; 
            private String modifyTime; 
            private java.util.List < String > perspectiveCodes; 
            private String plainText; 
            private Long solutionId; 

            /**
             * 答案内容
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * 答案类型(0纯文本，1富文本）
             */
            public Builder contentType(Integer contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * 创建时间(UTC 时间)
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 修改时间(UTC 时间)
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * 视角code列表
             */
            public Builder perspectiveCodes(java.util.List < String > perspectiveCodes) {
                this.perspectiveCodes = perspectiveCodes;
                return this;
            }

            /**
             * 答案纯文本内容
             */
            public Builder plainText(String plainText) {
                this.plainText = plainText;
                return this;
            }

            /**
             * 答案ID
             */
            public Builder solutionId(Long solutionId) {
                this.solutionId = solutionId;
                return this;
            }

            public Solutions build() {
                return new Solutions(this);
            } 

        } 

    }
}
