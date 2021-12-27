// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ExportVulResponseBody} extends {@link TeaModel}
 *
 * <p>ExportVulResponseBody</p>
 */
public class ExportVulResponseBody extends TeaModel {
    @NameInMap("FileName")
    private String fileName;

    @NameInMap("Id")
    private Long id;

    @NameInMap("RequestId")
    private String requestId;


    private ExportVulResponseBody(Builder builder) {
        this.fileName = builder.fileName;
        this.id = builder.id;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportVulResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String fileName; 
        private Long id; 
        private String requestId; 

        /**
         * <p>FileName.</p>
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>Id.</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExportVulResponseBody build() {
            return new ExportVulResponseBody(this);
        } 

    } 

}
