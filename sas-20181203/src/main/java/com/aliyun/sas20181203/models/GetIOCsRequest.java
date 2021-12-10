// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetIOCsRequest} extends {@link RequestModel}
 *
 * <p>GetIOCsRequest</p>
 */
public class GetIOCsRequest extends Request {
    @Query
    @NameInMap("Date")
    private String date;

    @Query
    @NameInMap("Type")
    private String type;


    private GetIOCsRequest(Builder builder) {
        super(builder);
        this.date = builder.date;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIOCsRequest create() {
        return builder().build();
    }

    /**
     * @return date
     */
    public String getDate() {
        return this.date;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder {
        private String date; 
        private String type; 

        /**
         * <p>Date.</p>
         */
        public Builder date(String date) {
            this.putQueryParameter("Date", date);
            this.date = date;
            return this;
        }

        /**
         * <p>Type.</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        public GetIOCsRequest build() {
            return new GetIOCsRequest(this);
        } 

    } 

}