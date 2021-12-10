// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link StartPreCheckDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>StartPreCheckDatabaseResponseBody</p>
 */
public class StartPreCheckDatabaseResponseBody extends TeaModel {
    @NameInMap("CreateMark")
    private String createMark;

    @NameInMap("RequestId")
    private String requestId;


    private StartPreCheckDatabaseResponseBody(Builder builder) {
        this.createMark = builder.createMark;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartPreCheckDatabaseResponseBody create() {
        return builder().build();
    }

    /**
     * @return createMark
     */
    public String getCreateMark() {
        return this.createMark;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String createMark; 
        private String requestId; 

        /**
         * <p>CreateMark.</p>
         */
        public Builder createMark(String createMark) {
            this.createMark = createMark;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StartPreCheckDatabaseResponseBody build() {
            return new StartPreCheckDatabaseResponseBody(this);
        } 

    } 

}