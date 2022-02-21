// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunCommandRequest} extends {@link RequestModel}
 *
 * <p>RunCommandRequest</p>
 */
public class RunCommandRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("WindowsPasswordName")
    private String windowsPasswordName;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("KeepCommand")
    private Boolean keepCommand;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("EnableParameter")
    private Boolean enableParameter;

    @Query
    @NameInMap("Parameters")
    private java.util.Map < String, ? > parameters;

    @Query
    @NameInMap("Username")
    private String username;

    @Query
    @NameInMap("Timed")
    private Boolean timed;

    @Query
    @NameInMap("InstanceId")
    private java.util.List < String > instanceId;

    @Query
    @NameInMap("ContentEncoding")
    private String contentEncoding;

    @Query
    @NameInMap("WorkingDir")
    private String workingDir;

    @Query
    @NameInMap("RepeatMode")
    private String repeatMode;

    @Query
    @NameInMap("CommandContent")
    private String commandContent;

    @Query
    @NameInMap("Timeout")
    private Long timeout;

    @Query
    @NameInMap("Frequency")
    private String frequency;

    private RunCommandRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.windowsPasswordName = builder.windowsPasswordName;
        this.type = builder.type;
        this.keepCommand = builder.keepCommand;
        this.name = builder.name;
        this.enableParameter = builder.enableParameter;
        this.parameters = builder.parameters;
        this.username = builder.username;
        this.timed = builder.timed;
        this.instanceId = builder.instanceId;
        this.contentEncoding = builder.contentEncoding;
        this.workingDir = builder.workingDir;
        this.repeatMode = builder.repeatMode;
        this.commandContent = builder.commandContent;
        this.timeout = builder.timeout;
        this.frequency = builder.frequency;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCommandRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return windowsPasswordName
     */
    public String getWindowsPasswordName() {
        return this.windowsPasswordName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return keepCommand
     */
    public Boolean getKeepCommand() {
        return this.keepCommand;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return enableParameter
     */
    public Boolean getEnableParameter() {
        return this.enableParameter;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, ? > getParameters() {
        return this.parameters;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return timed
     */
    public Boolean getTimed() {
        return this.timed;
    }

    /**
     * @return instanceId
     */
    public java.util.List < String > getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return contentEncoding
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * @return workingDir
     */
    public String getWorkingDir() {
        return this.workingDir;
    }

    /**
     * @return repeatMode
     */
    public String getRepeatMode() {
        return this.repeatMode;
    }

    /**
     * @return commandContent
     */
    public String getCommandContent() {
        return this.commandContent;
    }

    /**
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    /**
     * @return frequency
     */
    public String getFrequency() {
        return this.frequency;
    }

    public static final class Builder extends Request.Builder<RunCommandRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String description; 
        private String windowsPasswordName; 
        private String type; 
        private Boolean keepCommand; 
        private String name; 
        private Boolean enableParameter; 
        private java.util.Map < String, ? > parameters; 
        private String username; 
        private Boolean timed; 
        private java.util.List < String > instanceId; 
        private String contentEncoding; 
        private String workingDir; 
        private String repeatMode; 
        private String commandContent; 
        private Long timeout; 
        private String frequency; 

        private Builder() {
            super();
        } 

        private Builder(RunCommandRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.regionId = response.regionId;
            this.description = response.description;
            this.windowsPasswordName = response.windowsPasswordName;
            this.type = response.type;
            this.keepCommand = response.keepCommand;
            this.name = response.name;
            this.enableParameter = response.enableParameter;
            this.parameters = response.parameters;
            this.username = response.username;
            this.timed = response.timed;
            this.instanceId = response.instanceId;
            this.contentEncoding = response.contentEncoding;
            this.workingDir = response.workingDir;
            this.repeatMode = response.repeatMode;
            this.commandContent = response.commandContent;
            this.timeout = response.timeout;
            this.frequency = response.frequency;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the region. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The description of the command. The full character set is supported and cannot exceed 512 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The password of the user who runs the command in the Windows instance.
         * <p>
         * 
         * If you want to run a command in a Windows instance as a non-default user (System), you must specify "Username" and this parameter at the same time. To reduce the risk of password leakage, you must host the password in plaintext in the parameter repository of O & M orchestration service. Only the password name is specified here. For more information, see [encryption parameters](~~ 186828 ~~) and [set common users to run cloud assistant commands](~~ 203771 ~~).
         * 
         * > This parameter is not required when you use the root user of a Linux instance or the System user of a Windows instance to run commands.
         */
        public Builder windowsPasswordName(String windowsPasswordName) {
            this.putQueryParameter("WindowsPasswordName", windowsPasswordName);
            this.windowsPasswordName = windowsPasswordName;
            return this;
        }

        /**
         * The language of the O & M command. Valid values:
         * <p>
         * 
         * -RunBatScript: Bat commands for Windows instances.
         * -RunPowerShellScript: the Windows command that applies to PowerShell instances.
         * -RunShellScript: Applicable to Linux Shell commands.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Specifies whether to retain the command after it is executed. Valid values:
         * <p>
         * 
         * -true: RETAIN. You can run the InvokeCommand again. The quota of cloud assistant commands is occupied.
         * -false: this parameter is not reserved. Automatically deleted after execution, does not occupy the quota of cloud assistant commands.
         * 
         * Default value: false
         */
        public Builder keepCommand(Boolean keepCommand) {
            this.putQueryParameter("KeepCommand", keepCommand);
            this.keepCommand = keepCommand;
            return this;
        }

        /**
         * The name of the command. The full character set is supported and cannot exceed 128 characters in length.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Indicates whether the command contains custom parameters.
         * <p>
         * 
         * Default value: false
         */
        public Builder enableParameter(Boolean enableParameter) {
            this.putQueryParameter("EnableParameter", enableParameter);
            this.enableParameter = enableParameter;
            return this;
        }

        /**
         * The key-value pair of the custom parameter passed in when the command is executed when the custom parameter is included in the command. For example, if the command content is "echo {{name}}", you can use the "Parameter" parameter to pass in the key-value pair "{ "name":"Jack"}". The custom parameter automatically replaces the variable value "name" to obtain a new command. The actual command is "echo Jack ".
         * <p>
         * 
         * The number of custom parameters ranges from 0 to 10.
         * 
         * The-key cannot be an empty string. It can be up to 64 characters in length.
         * -The value can be an empty string.
         * -After the custom parameters and the original command content are encoded in Base64, the total length cannot exceed 16kB.
         * -The set of custom parameter names must be a subset of the parameter set defined when the command is created. For parameters that are not specified, you can use an empty string instead.
         * 
         * Default value: NULL. This parameter is disabled.
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * The name of the user who runs the command on the ECS instance.
         * <p>
         * 
         * -Linux ECS instances run commands as root users by default.
         * -Windows the ECS instance of the System. By default, the System user runs the command.
         * 
         * You can also specify other users that already exist in the instance to run commands. It is more secure for ordinary users to run cloud assistant commands. For more information, see [set common users to run cloud assistant commands](~~ 203771 ~~).
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * Specifies whether to run the command periodically. Valid values:
         * <p>
         * 
         * -true: The execution is scheduled based on the time frequency set by the "ence" parameter. The last execution result does not affect the next execution.
         * -false: run only once.
         * 
         * Default value: false
         */
        public Builder timed(Boolean timed) {
            this.putQueryParameter("Timed", timed);
            this.timed = timed;
            return this;
        }

        /**
         * The ID of the ECS instance. N indicates that you can set multiple instance IDs at the same time. Valid values of N: 1 to 50.
         * <p>
         * 
         * If multiple instances are specified and one of the instances does not meet the execution conditions, you must select another instance.
         */
        public Builder instanceId(java.util.List < String > instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The encoding method of the command content ("CommandContent"). Valid values: case insensitive:
         * <p>
         * 
         * -PlainText: no encoding, PlainText transmission.
         * -Base64: base64-encoded.
         * 
         * Default value: PlainText. If you set this parameter randomly or incorrectly, it will be treated as PlainText.
         */
        public Builder contentEncoding(String contentEncoding) {
            this.putQueryParameter("ContentEncoding", contentEncoding);
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * The running Directory of the command in the ECS instance.
         * <p>
         * 
         * Default value:
         * 
         * -Linux instances are in the home directory of the administrator (root user) by default, that is, "/root".
         * -By default, Windows system instance is located in the directory where the cloud assistant client process is located, for example, "C:WindowsSystem32 ".
         */
        public Builder workingDir(String workingDir) {
            this.putQueryParameter("WorkingDir", workingDir);
            this.workingDir = workingDir;
            return this;
        }

        /**
         * Set the command execution method. Valid values:
         * <p>
         * 
         * -Once: run the command immediately.
         * -Period: run the command regularly. When this parameter is set to **, you must specify both the "** = true" parameter and the "ence" parameter.
         * -NextRebootOnly: When the instance starts next time, the command is automatically executed.
         * -EveryReboot: The command is automatically executed each time the instance is started.
         * 
         * Default value:
         * -If you do not specify the value of the "1" = true" parameter and the "ence" parameter, the default value is "Once ".
         * -If you specify the "1" = true" parameter value and the "ence" parameter, the parameter is processed as "1" regardless of whether the parameter value has been set.
         * 
         * Note:
         * -When this parameter is set to "1", "n"bootonly", or "EveryReboot", you can call [StopInvocation](~~ 64838 ~~) to stop the pending or periodic commands.
         * -If this parameter is set to "1" or "EveryReboot", you can call [DescribeInvocationResults](~~ 64845 ~~) and specify "IncludeHistory = true" to view the execution history of the command cycle.
         */
        public Builder repeatMode(String repeatMode) {
            this.putQueryParameter("RepeatMode", repeatMode);
            this.repeatMode = repeatMode;
            return this;
        }

        /**
         * The content of the command. The command content can be plaintext or base64-encoded content. Note:
         * <p>
         * 
         * -The size of the command content after Base64 encoding cannot exceed 16KB.
         * -If your command content is Base64-encoded, you must set "ContentEncoding = Base64 ".
         * -Specify the parameter "EnableParameter = true" to enable custom parameters in the command content:
         * -Define custom parameters in the format of "{}} ". Spaces and line breaks before and after the parameter names in "{}}" are ignored.
         * -The number of custom parameters cannot exceed 20.
         * -Custom parameter names can be combined a-zA-Z0-9-_. Other characters are not supported. Parameter names are case insensitive.
         * -A single custom parameter name cannot exceed 64 bytes.
         */
        public Builder commandContent(String commandContent) {
            this.putQueryParameter("CommandContent", commandContent);
            this.commandContent = commandContent;
            return this;
        }

        /**
         * The timeout period for executing the command. Unit: seconds.
         * <p>
         * 
         * When a command cannot be run due to process reasons, missing modules, or missing cloud assistant clients, a timeout occurs. After a timeout, the command process is forcibly terminated.
         * 
         * Default value: 60
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * The execution cycle of a periodic command. When the parameter "timed" value of "true" when the parameter is required arguments. Twice cycle command time interval cannot be under 10 miao.
         * <p>
         * 
         * The parameters follow Cron expression, see [set scheduled command](~~ 64769 ~~).
         */
        public Builder frequency(String frequency) {
            this.putQueryParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        @Override
        public RunCommandRequest build() {
            return new RunCommandRequest(this);
        } 

    } 

}