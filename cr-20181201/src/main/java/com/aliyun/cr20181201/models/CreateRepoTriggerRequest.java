// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateRepoTriggerRequest} extends {@link RequestModel}
 *
 * <p>CreateRepoTriggerRequest</p>
 */
public class CreateRepoTriggerRequest extends Request {
    @Query
    @NameInMap("RepoId")
    private String repoId;

    @Query
    @NameInMap("TriggerName")
    private String triggerName;

    @Query
    @NameInMap("TriggerTag")
    private String triggerTag;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TriggerUrl")
    private String triggerUrl;

    @Query
    @NameInMap("TriggerType")
    private String triggerType;


    private CreateRepoTriggerRequest(Builder builder) {
        super(builder);
        this.repoId = builder.repoId;
        this.triggerName = builder.triggerName;
        this.triggerTag = builder.triggerTag;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.triggerUrl = builder.triggerUrl;
        this.triggerType = builder.triggerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepoTriggerRequest create() {
        return builder().build();
    }

    /**
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    /**
     * @return triggerName
     */
    public String getTriggerName() {
        return this.triggerName;
    }

    /**
     * @return triggerTag
     */
    public String getTriggerTag() {
        return this.triggerTag;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return triggerUrl
     */
    public String getTriggerUrl() {
        return this.triggerUrl;
    }

    /**
     * @return triggerType
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    public static final class Builder extends Request.Builder {
        private String repoId; 
        private String triggerName; 
        private String triggerTag; 
        private String instanceId; 
        private String regionId; 
        private String triggerUrl; 
        private String triggerType; 

        /**
         * <p>Mirror warehouse ID</p>
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * <p>Trigger name</p>
         */
        public Builder triggerName(String triggerName) {
            this.putQueryParameter("TriggerName", triggerName);
            this.triggerName = triggerName;
            return this;
        }

        /**
         * <p>The version of the image that triggers the trigger.

> - "TriggerType" is "ALL", and "TriggerTag" can be any string, for example "*".
-"TriggerType" is "tag_list", "TriggerTag" is an array, example "[1]".
-"TriggerType" is "tag_reg_exp ", and "TriggerTag" is a string. Example" * ".


</p>
         */
        public Builder triggerTag(String triggerTag) {
            this.putQueryParameter("TriggerTag", triggerTag);
            this.triggerTag = triggerTag;
            return this;
        }

        /**
         * <p>Instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Trigger URL</p>
         */
        public Builder triggerUrl(String triggerUrl) {
            this.putQueryParameter("TriggerUrl", triggerUrl);
            this.triggerUrl = triggerUrl;
            return this;
        }

        /**
         * <p>The type of the trigger. Valid values:
-"ALL": trigger all
-"Tag_list": Tag trigger
-"Tag_reg_exp ": expression trigger

</p>
         */
        public Builder triggerType(String triggerType) {
            this.putQueryParameter("TriggerType", triggerType);
            this.triggerType = triggerType;
            return this;
        }

        public CreateRepoTriggerRequest build() {
            return new CreateRepoTriggerRequest(this);
        } 

    } 

}