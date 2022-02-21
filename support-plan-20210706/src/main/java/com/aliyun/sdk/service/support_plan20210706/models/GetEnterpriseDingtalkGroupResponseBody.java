// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnterpriseDingtalkGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetEnterpriseDingtalkGroupResponseBody</p>
 */
public class GetEnterpriseDingtalkGroupResponseBody extends TeaModel {
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

    private GetEnterpriseDingtalkGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEnterpriseDingtalkGroupResponseBody create() {
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
         * 接口请求结果返回码
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
         * 错误信息, 当success=false的时候, 可以取到message
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 接口请求的唯一ID, 每次调用requestID唯一
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 调用接口返回是否成功, true代表调用正常
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetEnterpriseDingtalkGroupResponseBody build() {
            return new GetEnterpriseDingtalkGroupResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("OpenGroupId")
        private String openGroupId;

        private Data(Builder builder) {
            this.groupName = builder.groupName;
            this.openGroupId = builder.openGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return openGroupId
         */
        public String getOpenGroupId() {
            return this.openGroupId;
        }

        public static final class Builder {
            private String groupName; 
            private String openGroupId; 

            /**
             * 企业服务群的群名
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * 企业服务群的ID
             */
            public Builder openGroupId(String openGroupId) {
                this.openGroupId = openGroupId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
