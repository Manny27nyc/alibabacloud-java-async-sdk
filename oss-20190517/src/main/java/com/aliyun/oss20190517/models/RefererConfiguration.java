// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link RefererConfiguration} extends {@link TeaModel}
 *
 * <p>RefererConfiguration</p>
 */
public class RefererConfiguration extends TeaModel {
    @NameInMap("AllowEmptyReferer")
    private Boolean allowEmptyReferer;

    @NameInMap("RefererList")
    private RefererList refererList;


    private RefererConfiguration(Builder builder) {
        this.allowEmptyReferer = builder.allowEmptyReferer;
        this.refererList = builder.refererList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefererConfiguration create() {
        return builder().build();
    }

    /**
     * @return allowEmptyReferer
     */
    public Boolean allowEmptyReferer() {
        return this.allowEmptyReferer;
    }

    /**
     * @return refererList
     */
    public RefererList refererList() {
        return this.refererList;
    }

    public static final class Builder {
        private Boolean allowEmptyReferer; 
        private RefererList refererList; 

        /**
         * <p>是否允许Referer字段为空的请求访问</p>
         */
        public Builder allowEmptyReferer(Boolean allowEmptyReferer) {
            this.allowEmptyReferer = allowEmptyReferer;
            return this;
        }

        /**
         * <p>保存Referer访问白名单</p>
         */
        public Builder refererList(RefererList refererList) {
            this.refererList = refererList;
            return this;
        }

        public RefererConfiguration build() {
            return new RefererConfiguration(this);
        } 

    } 

    public static class RefererList extends TeaModel {
        @NameInMap("Referer")
        private java.util.List < String > referer;


        private RefererList(Builder builder) {
            this.referer = builder.referer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefererList create() {
            return builder().build();
        }

        /**
         * @return referer
         */
        public java.util.List < String > referer() {
            return this.referer;
        }

        public static final class Builder {
            private java.util.List < String > referer; 

            /**
             * <p>指定一条Referer访问白名单</p>
             */
            public Builder referer(java.util.List < String > referer) {
                this.referer = referer;
                return this;
            }

            public RefererList build() {
                return new RefererList(this);
            } 

        } 

    }
}
