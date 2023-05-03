package org.openapi.quarkus.swagger_json.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupsGroupsAdHocCommandsCreateRequest  {

    private Boolean becomeEnabled;
    private Integer credential;
    private Boolean diffMode;
    private Integer executionEnvironment;
    private String extraVars;
    private Integer forks;
    private Integer inventory;
    private String jobType;
    private String limit;
    private String moduleArgs;
    private String moduleName;
    private String verbosity;

    /**
    * Get becomeEnabled
    * @return becomeEnabled
    **/
    @JsonProperty("become_enabled")
    public Boolean getBecomeEnabled() {
        return becomeEnabled;
    }

    /**
     * Set becomeEnabled
     **/
    public void setBecomeEnabled(Boolean becomeEnabled) {
        this.becomeEnabled = becomeEnabled;
    }

    public GroupsGroupsAdHocCommandsCreateRequest becomeEnabled(Boolean becomeEnabled) {
        this.becomeEnabled = becomeEnabled;
        return this;
    }

    /**
    * Get credential
    * @return credential
    **/
    @JsonProperty("credential")
    public Integer getCredential() {
        return credential;
    }

    /**
     * Set credential
     **/
    public void setCredential(Integer credential) {
        this.credential = credential;
    }

    public GroupsGroupsAdHocCommandsCreateRequest credential(Integer credential) {
        this.credential = credential;
        return this;
    }

    /**
    * Get diffMode
    * @return diffMode
    **/
    @JsonProperty("diff_mode")
    public Boolean getDiffMode() {
        return diffMode;
    }

    /**
     * Set diffMode
     **/
    public void setDiffMode(Boolean diffMode) {
        this.diffMode = diffMode;
    }

    public GroupsGroupsAdHocCommandsCreateRequest diffMode(Boolean diffMode) {
        this.diffMode = diffMode;
        return this;
    }

    /**
    * The container image to be used for execution.
    * @return executionEnvironment
    **/
    @JsonProperty("execution_environment")
    public Integer getExecutionEnvironment() {
        return executionEnvironment;
    }

    /**
     * Set executionEnvironment
     **/
    public void setExecutionEnvironment(Integer executionEnvironment) {
        this.executionEnvironment = executionEnvironment;
    }

    public GroupsGroupsAdHocCommandsCreateRequest executionEnvironment(Integer executionEnvironment) {
        this.executionEnvironment = executionEnvironment;
        return this;
    }

    /**
    * Get extraVars
    * @return extraVars
    **/
    @JsonProperty("extra_vars")
    public String getExtraVars() {
        return extraVars;
    }

    /**
     * Set extraVars
     **/
    public void setExtraVars(String extraVars) {
        this.extraVars = extraVars;
    }

    public GroupsGroupsAdHocCommandsCreateRequest extraVars(String extraVars) {
        this.extraVars = extraVars;
        return this;
    }

    /**
    * Get forks
    * @return forks
    **/
    @JsonProperty("forks")
    public Integer getForks() {
        return forks;
    }

    /**
     * Set forks
     **/
    public void setForks(Integer forks) {
        this.forks = forks;
    }

    public GroupsGroupsAdHocCommandsCreateRequest forks(Integer forks) {
        this.forks = forks;
        return this;
    }

    /**
    * Get inventory
    * @return inventory
    **/
    @JsonProperty("inventory")
    public Integer getInventory() {
        return inventory;
    }

    /**
     * Set inventory
     **/
    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public GroupsGroupsAdHocCommandsCreateRequest inventory(Integer inventory) {
        this.inventory = inventory;
        return this;
    }

    /**
    * Get jobType
    * @return jobType
    **/
    @JsonProperty("job_type")
    public String getJobType() {
        return jobType;
    }

    /**
     * Set jobType
     **/
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public GroupsGroupsAdHocCommandsCreateRequest jobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
    * Get limit
    * @return limit
    **/
    @JsonProperty("limit")
    public String getLimit() {
        return limit;
    }

    /**
     * Set limit
     **/
    public void setLimit(String limit) {
        this.limit = limit;
    }

    public GroupsGroupsAdHocCommandsCreateRequest limit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
    * Get moduleArgs
    * @return moduleArgs
    **/
    @JsonProperty("module_args")
    public String getModuleArgs() {
        return moduleArgs;
    }

    /**
     * Set moduleArgs
     **/
    public void setModuleArgs(String moduleArgs) {
        this.moduleArgs = moduleArgs;
    }

    public GroupsGroupsAdHocCommandsCreateRequest moduleArgs(String moduleArgs) {
        this.moduleArgs = moduleArgs;
        return this;
    }

    /**
    * Get moduleName
    * @return moduleName
    **/
    @JsonProperty("module_name")
    public String getModuleName() {
        return moduleName;
    }

    /**
     * Set moduleName
     **/
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public GroupsGroupsAdHocCommandsCreateRequest moduleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }

    /**
    * Get verbosity
    * @return verbosity
    **/
    @JsonProperty("verbosity")
    public String getVerbosity() {
        return verbosity;
    }

    /**
     * Set verbosity
     **/
    public void setVerbosity(String verbosity) {
        this.verbosity = verbosity;
    }

    public GroupsGroupsAdHocCommandsCreateRequest verbosity(String verbosity) {
        this.verbosity = verbosity;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupsGroupsAdHocCommandsCreateRequest {\n");

        sb.append("    becomeEnabled: ").append(toIndentedString(becomeEnabled)).append("\n");
        sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
        sb.append("    diffMode: ").append(toIndentedString(diffMode)).append("\n");
        sb.append("    executionEnvironment: ").append(toIndentedString(executionEnvironment)).append("\n");
        sb.append("    extraVars: ").append(toIndentedString(extraVars)).append("\n");
        sb.append("    forks: ").append(toIndentedString(forks)).append("\n");
        sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    moduleArgs: ").append(toIndentedString(moduleArgs)).append("\n");
        sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
        sb.append("    verbosity: ").append(toIndentedString(verbosity)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}