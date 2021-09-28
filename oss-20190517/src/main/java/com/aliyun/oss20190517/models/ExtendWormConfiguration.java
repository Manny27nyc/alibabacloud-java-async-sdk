// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ExtendWormConfiguration} extends {@link TeaModel}
 *
 * <p>ExtendWormConfiguration</p>
 */
public class ExtendWormConfiguration extends TeaModel {
    @NameInMap("RetentionPeriodInDays")
    private Integer retentionPeriodInDays;


    private ExtendWormConfiguration(Builder builder) {
        this.retentionPeriodInDays = builder.retentionPeriodInDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExtendWormConfiguration create() {
        return builder().build();
    }

    /**
     * @return retentionPeriodInDays
     */
    public Integer retentionPeriodInDays() {
        return this.retentionPeriodInDays;
    }

    public static final class Builder {
        private Integer retentionPeriodInDays; 

        /**
         * <p>The number of days for which objects can be retained</p>
         */
        public Builder retentionPeriodInDays(Integer retentionPeriodInDays) {
            this.retentionPeriodInDays = retentionPeriodInDays;
            return this;
        }

        public ExtendWormConfiguration build() {
            return new ExtendWormConfiguration(this);
        } 

    } 

}