// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClassDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetClassDetailResponseBody</p>
 */
public class GetClassDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private GetClassDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClassDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * API请求的返回结果结构体。
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetClassDetailResponseBody build() {
            return new GetClassDetailResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("ClassId")
        private String classId;

        @NameInMap("ConfId")
        private String confId;

        @NameInMap("CreateNickname")
        private String createNickname;

        @NameInMap("CreateUserId")
        private String createUserId;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("LiveId")
        private String liveId;

        @NameInMap("RoomId")
        private String roomId;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Title")
        private String title;

        @NameInMap("WhiteboardId")
        private String whiteboardId;

        @NameInMap("WhiteboardRecordId")
        private String whiteboardRecordId;

        private Result(Builder builder) {
            this.classId = builder.classId;
            this.confId = builder.confId;
            this.createNickname = builder.createNickname;
            this.createUserId = builder.createUserId;
            this.endTime = builder.endTime;
            this.liveId = builder.liveId;
            this.roomId = builder.roomId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.title = builder.title;
            this.whiteboardId = builder.whiteboardId;
            this.whiteboardRecordId = builder.whiteboardRecordId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return classId
         */
        public String getClassId() {
            return this.classId;
        }

        /**
         * @return confId
         */
        public String getConfId() {
            return this.confId;
        }

        /**
         * @return createNickname
         */
        public String getCreateNickname() {
            return this.createNickname;
        }

        /**
         * @return createUserId
         */
        public String getCreateUserId() {
            return this.createUserId;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return liveId
         */
        public String getLiveId() {
            return this.liveId;
        }

        /**
         * @return roomId
         */
        public String getRoomId() {
            return this.roomId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
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

        /**
         * @return whiteboardId
         */
        public String getWhiteboardId() {
            return this.whiteboardId;
        }

        /**
         * @return whiteboardRecordId
         */
        public String getWhiteboardRecordId() {
            return this.whiteboardRecordId;
        }

        public static final class Builder {
            private String classId; 
            private String confId; 
            private String createNickname; 
            private String createUserId; 
            private Long endTime; 
            private String liveId; 
            private String roomId; 
            private Long startTime; 
            private Integer status; 
            private String title; 
            private String whiteboardId; 
            private String whiteboardRecordId; 

            /**
             * 课堂唯一标识，由调用CreateClass返回。
             */
            public Builder classId(String classId) {
                this.classId = classId;
                return this;
            }

            /**
             * 连麦会议唯一标识。
             */
            public Builder confId(String confId) {
                this.confId = confId;
                return this;
            }

            /**
             * 创建人昵称。
             */
            public Builder createNickname(String createNickname) {
                this.createNickname = createNickname;
                return this;
            }

            /**
             * 创建人ID。
             */
            public Builder createUserId(String createUserId) {
                this.createUserId = createUserId;
                return this;
            }

            /**
             * 下课时间戳，毫秒。
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 直播的唯一标识ID。
             */
            public Builder liveId(String liveId) {
                this.liveId = liveId;
                return this;
            }

            /**
             * 房间ID
             */
            public Builder roomId(String roomId) {
                this.roomId = roomId;
                return this;
            }

            /**
             * 开始上课时间戳，毫秒。
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * 课堂状态，0:未开始 1:上课中 2:已下课。
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * 课堂标题。
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * 白板ID
             */
            public Builder whiteboardId(String whiteboardId) {
                this.whiteboardId = whiteboardId;
                return this;
            }

            /**
             * 白板录制ID
             */
            public Builder whiteboardRecordId(String whiteboardRecordId) {
                this.whiteboardRecordId = whiteboardRecordId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
