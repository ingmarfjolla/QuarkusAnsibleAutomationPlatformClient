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
public class InventorySourcesInventorySourcesPartialUpdateRequest  {

    private Integer credential;
    private String description;
    private String enabledValue;
    private String enabledVar;
    private Integer executionEnvironment;
    private String hostFilter;
    private Integer inventory;
    private String limit;
    private String name;
    private Boolean overwrite;
    private Boolean overwriteVars;
    private String scmBranch;
    private String source;
    private String sourcePath;
    private String sourceProject;
    private String sourceVars;
    private Integer timeout;
    private Integer updateCacheTimeout;
    private Boolean updateOnLaunch;
    private String verbosity;

    /**
    * Cloud credential to use for inventory updates.
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

    public InventorySourcesInventorySourcesPartialUpdateRequest credential(Integer credential) {
        this.credential = credential;
        return this;
    }

    /**
    * Get description
    * @return description
    **/
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Set description
     **/
    public void setDescription(String description) {
        this.description = description;
    }

    public InventorySourcesInventorySourcesPartialUpdateRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
    * Only used when enabled_var is set. Value when the host is considered enabled. For example if enabled_var=\"status.power_state\"and enabled_value=\"powered_on\" with host variables:{   \"status\": {     \"power_state\": \"powered_on\",     \"created\": \"2018-02-01T08:00:00.000000Z:00\",     \"healthy\": true    },    \"name\": \"foobar\",    \"ip_address\": \"192.168.2.1\"}The host would be marked enabled. If power_state where any value other than powered_on then the host would be disabled when imported. If the key is not found then the host will be enabled
    * @return enabledValue
    **/
    @JsonProperty("enabled_value")
    public String getEnabledValue() {
        return enabledValue;
    }

    /**
     * Set enabledValue
     **/
    public void setEnabledValue(String enabledValue) {
        this.enabledValue = enabledValue;
    }

    public InventorySourcesInventorySourcesPartialUpdateRequest enabledValue(String enabledValue) {
        this.enabledValue = enabledValue;
        return this;
    }

    /**
    * Retrieve the enabled state from the given dict of host variables. The enabled variable may be specified as \"foo.bar\", in which case the lookup will traverse into nested dicts, equivalent to: from_dict.get(\"foo\", {}).get(\"bar\", default)
    * @return enabledVar
    **/
    @JsonProperty("enabled_var")
    public String getEnabledVar() {
        return enabledVar;
    }

    /**
     * Set enabledVar
     **/
    public void setEnabledVar(String enabledVar) {
        this.enabledVar = enabledVar;
    }

    public InventorySourcesInventorySourcesPartialUpdateRequest enabledVar(String enabledVar) {
        this.enabledVar = enabledVar;
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

    public InventorySourcesInventorySourcesPartialUpdateRequest executionEnvironment(Integer executionEnvironment) {
        this.executionEnvironment = executionEnvironment;
        return this;
    }

    /**
    * This field is deprecated and will be removed in a future release. Regex where only matching hosts will be imported.
    * @return hostFilter
    **/
    @JsonProperty("host_filter")
    public String getHostFilter() {
        return hostFilter;
    }

    /**
     * Set hostFilter
     **/
    public void setHostFilter(String hostFilter) {
        this.hostFilter = hostFilter;
    }

    public InventorySourcesInventorySourcesPartialUpdateRequest hostFilter(String hostFilter) {
        this.hostFilter = hostFilter;
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

    public InventorySourcesInventorySourcesPartialUpdateRequest inventory(Integer inventory) {
        this.inventory = inventory;
        return this;
    }

    /**
    * Enter host, group or pattern match
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

    public InventorySourcesInventorySourcesPartialUpdateRequest limit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
    * Get name
    * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public InventorySourcesInventorySourcesPartialUpdateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Overwrite local groups and hosts from remote inventory source.
    * @return overwrite
    **/
    @JsonProperty("overwrite")
    public Boolean getOverwrite() {
        return overwrite;
    }

    /**
     * Set overwrite
     **/
    public void setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
    }

    public InventorySourcesInventorySourcesPartialUpdateRequest overwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }

    /**
    * Overwrite local variables from remote inventory source.
    * @return overwriteVars
    **/
    @JsonProperty("overwrite_vars")
    public Boolean getOverwriteVars() {
        return overwriteVars;
    }

    /**
     * Set overwriteVars
     **/
    public void setOverwriteVars(Boolean overwriteVars) {
        this.overwriteVars = overwriteVars;
    }

    public InventorySourcesInventorySourcesPartialUpdateRequest overwriteVars(Boolean overwriteVars) {
        this.overwriteVars = overwriteVars;
        return this;
    }

    /**
    * Inventory source SCM branch. Project default used if blank. Only allowed if project allow_override field is set to true.
    * @return scmBranch
    **/
    @JsonProperty("scm_branch")
    public String getScmBranch() {
        return scmBranch;
    }

    /**
     * Set scmBranch
     **/
    public void setScmBranch(String scmBranch) {
        this.scmBranch = scmBranch;
    }

    public InventorySourcesInventorySourcesPartialUpdateRequest scmBranch(String scmBranch) {
        this.scmBranch = scmBranch;
        return this;
    }

    /**
    * Get source
    * @return source
    **/
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     * Set source
     **/
    public void setSource(String source) {
        this.source = source;
    }

    public InventorySourcesInventorySourcesPartialUpdateRequest source(String source) {
        this.source = source;
        return this;
    }

    /**
    * Get sourcePath
    * @return sourcePath
    **/
    @JsonProperty("source_path")
    public String getSourcePath() {
        return sourcePath;
    }

    /**
     * Set sourcePath
     **/
    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    public InventorySourcesInventorySourcesPartialUpdateRequest sourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
        return this;
    }

    /**
    * Project containing inventory file used as source.
    * @return sourceProject
    **/
    @JsonProperty("source_project")
    public String getSourceProject() {
        return sourceProject;
    }

    /**
     * Set sourceProject
     **/
    public void setSourceProject(String sourceProject) {
        this.sourceProject = sourceProject;
    }

    public InventorySourcesInventorySourcesPartialUpdateRequest sourceProject(String sourceProject) {
        this.sourceProject = sourceProject;
        return this;
    }

    /**
    * Inventory source variables in YAML or JSON format.
    * @return sourceVars
    **/
    @JsonProperty("source_vars")
    public String getSourceVars() {
        return sourceVars;
    }

    /**
     * Set sourceVars
     **/
    public void setSourceVars(String sourceVars) {
        this.sourceVars = sourceVars;
    }

    public InventorySourcesInventorySourcesPartialUpdateRequest sourceVars(String sourceVars) {
        this.sourceVars = sourceVars;
        return this;
    }

    /**
    * The amount of time (in seconds) to run before the task is canceled.
    * @return timeout
    **/
    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Set timeout
     **/
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public InventorySourcesInventorySourcesPartialUpdateRequest timeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
    * Get updateCacheTimeout
    * @return updateCacheTimeout
    **/
    @JsonProperty("update_cache_timeout")
    public Integer getUpdateCacheTimeout() {
        return updateCacheTimeout;
    }

    /**
     * Set updateCacheTimeout
     **/
    public void setUpdateCacheTimeout(Integer updateCacheTimeout) {
        this.updateCacheTimeout = updateCacheTimeout;
    }

    public InventorySourcesInventorySourcesPartialUpdateRequest updateCacheTimeout(Integer updateCacheTimeout) {
        this.updateCacheTimeout = updateCacheTimeout;
        return this;
    }

    /**
    * Get updateOnLaunch
    * @return updateOnLaunch
    **/
    @JsonProperty("update_on_launch")
    public Boolean getUpdateOnLaunch() {
        return updateOnLaunch;
    }

    /**
     * Set updateOnLaunch
     **/
    public void setUpdateOnLaunch(Boolean updateOnLaunch) {
        this.updateOnLaunch = updateOnLaunch;
    }

    public InventorySourcesInventorySourcesPartialUpdateRequest updateOnLaunch(Boolean updateOnLaunch) {
        this.updateOnLaunch = updateOnLaunch;
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

    public InventorySourcesInventorySourcesPartialUpdateRequest verbosity(String verbosity) {
        this.verbosity = verbosity;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InventorySourcesInventorySourcesPartialUpdateRequest {\n");

        sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enabledValue: ").append(toIndentedString(enabledValue)).append("\n");
        sb.append("    enabledVar: ").append(toIndentedString(enabledVar)).append("\n");
        sb.append("    executionEnvironment: ").append(toIndentedString(executionEnvironment)).append("\n");
        sb.append("    hostFilter: ").append(toIndentedString(hostFilter)).append("\n");
        sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    overwrite: ").append(toIndentedString(overwrite)).append("\n");
        sb.append("    overwriteVars: ").append(toIndentedString(overwriteVars)).append("\n");
        sb.append("    scmBranch: ").append(toIndentedString(scmBranch)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    sourcePath: ").append(toIndentedString(sourcePath)).append("\n");
        sb.append("    sourceProject: ").append(toIndentedString(sourceProject)).append("\n");
        sb.append("    sourceVars: ").append(toIndentedString(sourceVars)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    updateCacheTimeout: ").append(toIndentedString(updateCacheTimeout)).append("\n");
        sb.append("    updateOnLaunch: ").append(toIndentedString(updateOnLaunch)).append("\n");
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