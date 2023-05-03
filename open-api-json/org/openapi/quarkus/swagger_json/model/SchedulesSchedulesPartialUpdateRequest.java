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
public class SchedulesSchedulesPartialUpdateRequest  {

    private String description;
    private Boolean diffMode;
    private Boolean enabled;
    private Integer executionEnvironment;
    private Object extraData;
    private Integer forks;
    private Integer inventory;
    private Integer jobSliceCount;
    private String jobTags;
    private String jobType;
    private String limit;
    private String name;
    private String rrule;
    private String scmBranch;
    private String skipTags;
    private Integer timeout;
    private Integer unifiedJobTemplate;
    private String verbosity;

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

    public SchedulesSchedulesPartialUpdateRequest description(String description) {
        this.description = description;
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

    public SchedulesSchedulesPartialUpdateRequest diffMode(Boolean diffMode) {
        this.diffMode = diffMode;
        return this;
    }

    /**
    * Enables processing of this schedule.
    * @return enabled
    **/
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Set enabled
     **/
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public SchedulesSchedulesPartialUpdateRequest enabled(Boolean enabled) {
        this.enabled = enabled;
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

    public SchedulesSchedulesPartialUpdateRequest executionEnvironment(Integer executionEnvironment) {
        this.executionEnvironment = executionEnvironment;
        return this;
    }

    /**
    * Get extraData
    * @return extraData
    **/
    @JsonProperty("extra_data")
    public Object getExtraData() {
        return extraData;
    }

    /**
     * Set extraData
     **/
    public void setExtraData(Object extraData) {
        this.extraData = extraData;
    }

    public SchedulesSchedulesPartialUpdateRequest extraData(Object extraData) {
        this.extraData = extraData;
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

    public SchedulesSchedulesPartialUpdateRequest forks(Integer forks) {
        this.forks = forks;
        return this;
    }

    /**
    * Inventory applied as a prompt, assuming job template prompts for inventory
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

    public SchedulesSchedulesPartialUpdateRequest inventory(Integer inventory) {
        this.inventory = inventory;
        return this;
    }

    /**
    * Get jobSliceCount
    * @return jobSliceCount
    **/
    @JsonProperty("job_slice_count")
    public Integer getJobSliceCount() {
        return jobSliceCount;
    }

    /**
     * Set jobSliceCount
     **/
    public void setJobSliceCount(Integer jobSliceCount) {
        this.jobSliceCount = jobSliceCount;
    }

    public SchedulesSchedulesPartialUpdateRequest jobSliceCount(Integer jobSliceCount) {
        this.jobSliceCount = jobSliceCount;
        return this;
    }

    /**
    * Get jobTags
    * @return jobTags
    **/
    @JsonProperty("job_tags")
    public String getJobTags() {
        return jobTags;
    }

    /**
     * Set jobTags
     **/
    public void setJobTags(String jobTags) {
        this.jobTags = jobTags;
    }

    public SchedulesSchedulesPartialUpdateRequest jobTags(String jobTags) {
        this.jobTags = jobTags;
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

    public SchedulesSchedulesPartialUpdateRequest jobType(String jobType) {
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

    public SchedulesSchedulesPartialUpdateRequest limit(String limit) {
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

    public SchedulesSchedulesPartialUpdateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * A value representing the schedules iCal recurrence rule.
    * @return rrule
    **/
    @JsonProperty("rrule")
    public String getRrule() {
        return rrule;
    }

    /**
     * Set rrule
     **/
    public void setRrule(String rrule) {
        this.rrule = rrule;
    }

    public SchedulesSchedulesPartialUpdateRequest rrule(String rrule) {
        this.rrule = rrule;
        return this;
    }

    /**
    * Get scmBranch
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

    public SchedulesSchedulesPartialUpdateRequest scmBranch(String scmBranch) {
        this.scmBranch = scmBranch;
        return this;
    }

    /**
    * Get skipTags
    * @return skipTags
    **/
    @JsonProperty("skip_tags")
    public String getSkipTags() {
        return skipTags;
    }

    /**
     * Set skipTags
     **/
    public void setSkipTags(String skipTags) {
        this.skipTags = skipTags;
    }

    public SchedulesSchedulesPartialUpdateRequest skipTags(String skipTags) {
        this.skipTags = skipTags;
        return this;
    }

    /**
    * Get timeout
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

    public SchedulesSchedulesPartialUpdateRequest timeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
    * Get unifiedJobTemplate
    * @return unifiedJobTemplate
    **/
    @JsonProperty("unified_job_template")
    public Integer getUnifiedJobTemplate() {
        return unifiedJobTemplate;
    }

    /**
     * Set unifiedJobTemplate
     **/
    public void setUnifiedJobTemplate(Integer unifiedJobTemplate) {
        this.unifiedJobTemplate = unifiedJobTemplate;
    }

    public SchedulesSchedulesPartialUpdateRequest unifiedJobTemplate(Integer unifiedJobTemplate) {
        this.unifiedJobTemplate = unifiedJobTemplate;
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

    public SchedulesSchedulesPartialUpdateRequest verbosity(String verbosity) {
        this.verbosity = verbosity;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SchedulesSchedulesPartialUpdateRequest {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    diffMode: ").append(toIndentedString(diffMode)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    executionEnvironment: ").append(toIndentedString(executionEnvironment)).append("\n");
        sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
        sb.append("    forks: ").append(toIndentedString(forks)).append("\n");
        sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
        sb.append("    jobSliceCount: ").append(toIndentedString(jobSliceCount)).append("\n");
        sb.append("    jobTags: ").append(toIndentedString(jobTags)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    rrule: ").append(toIndentedString(rrule)).append("\n");
        sb.append("    scmBranch: ").append(toIndentedString(scmBranch)).append("\n");
        sb.append("    skipTags: ").append(toIndentedString(skipTags)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    unifiedJobTemplate: ").append(toIndentedString(unifiedJobTemplate)).append("\n");
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