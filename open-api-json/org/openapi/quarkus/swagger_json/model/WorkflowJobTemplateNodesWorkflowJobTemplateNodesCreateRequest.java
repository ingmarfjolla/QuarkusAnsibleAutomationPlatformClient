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
public class WorkflowJobTemplateNodesWorkflowJobTemplateNodesCreateRequest  {

    private Boolean allParentsMustConverge;
    private Boolean diffMode;
    private Integer executionEnvironment;
    private Object extraData;
    private Integer forks;
    private String identifier;
    private Integer inventory;
    private Integer jobSliceCount;
    private String jobTags;
    private String jobType;
    private String limit;
    private String scmBranch;
    private String skipTags;
    private Integer timeout;
    private Integer unifiedJobTemplate;
    private String verbosity;
    private String workflowJobTemplate;

    /**
    * If enabled then the node will only run if all of the parent nodes have met the criteria to reach this node
    * @return allParentsMustConverge
    **/
    @JsonProperty("all_parents_must_converge")
    public Boolean getAllParentsMustConverge() {
        return allParentsMustConverge;
    }

    /**
     * Set allParentsMustConverge
     **/
    public void setAllParentsMustConverge(Boolean allParentsMustConverge) {
        this.allParentsMustConverge = allParentsMustConverge;
    }

    public WorkflowJobTemplateNodesWorkflowJobTemplateNodesCreateRequest allParentsMustConverge(Boolean allParentsMustConverge) {
        this.allParentsMustConverge = allParentsMustConverge;
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

    public WorkflowJobTemplateNodesWorkflowJobTemplateNodesCreateRequest diffMode(Boolean diffMode) {
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

    public WorkflowJobTemplateNodesWorkflowJobTemplateNodesCreateRequest executionEnvironment(Integer executionEnvironment) {
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

    public WorkflowJobTemplateNodesWorkflowJobTemplateNodesCreateRequest extraData(Object extraData) {
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

    public WorkflowJobTemplateNodesWorkflowJobTemplateNodesCreateRequest forks(Integer forks) {
        this.forks = forks;
        return this;
    }

    /**
    * An identifier for this node that is unique within its workflow. It is copied to workflow job nodes corresponding to this node.
    * @return identifier
    **/
    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Set identifier
     **/
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public WorkflowJobTemplateNodesWorkflowJobTemplateNodesCreateRequest identifier(String identifier) {
        this.identifier = identifier;
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

    public WorkflowJobTemplateNodesWorkflowJobTemplateNodesCreateRequest inventory(Integer inventory) {
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

    public WorkflowJobTemplateNodesWorkflowJobTemplateNodesCreateRequest jobSliceCount(Integer jobSliceCount) {
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

    public WorkflowJobTemplateNodesWorkflowJobTemplateNodesCreateRequest jobTags(String jobTags) {
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

    public WorkflowJobTemplateNodesWorkflowJobTemplateNodesCreateRequest jobType(String jobType) {
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

    public WorkflowJobTemplateNodesWorkflowJobTemplateNodesCreateRequest limit(String limit) {
        this.limit = limit;
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

    public WorkflowJobTemplateNodesWorkflowJobTemplateNodesCreateRequest scmBranch(String scmBranch) {
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

    public WorkflowJobTemplateNodesWorkflowJobTemplateNodesCreateRequest skipTags(String skipTags) {
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

    public WorkflowJobTemplateNodesWorkflowJobTemplateNodesCreateRequest timeout(Integer timeout) {
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

    public WorkflowJobTemplateNodesWorkflowJobTemplateNodesCreateRequest unifiedJobTemplate(Integer unifiedJobTemplate) {
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

    public WorkflowJobTemplateNodesWorkflowJobTemplateNodesCreateRequest verbosity(String verbosity) {
        this.verbosity = verbosity;
        return this;
    }

    /**
    * Get workflowJobTemplate
    * @return workflowJobTemplate
    **/
    @JsonProperty("workflow_job_template")
    public String getWorkflowJobTemplate() {
        return workflowJobTemplate;
    }

    /**
     * Set workflowJobTemplate
     **/
    public void setWorkflowJobTemplate(String workflowJobTemplate) {
        this.workflowJobTemplate = workflowJobTemplate;
    }

    public WorkflowJobTemplateNodesWorkflowJobTemplateNodesCreateRequest workflowJobTemplate(String workflowJobTemplate) {
        this.workflowJobTemplate = workflowJobTemplate;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowJobTemplateNodesWorkflowJobTemplateNodesCreateRequest {\n");

        sb.append("    allParentsMustConverge: ").append(toIndentedString(allParentsMustConverge)).append("\n");
        sb.append("    diffMode: ").append(toIndentedString(diffMode)).append("\n");
        sb.append("    executionEnvironment: ").append(toIndentedString(executionEnvironment)).append("\n");
        sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
        sb.append("    forks: ").append(toIndentedString(forks)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
        sb.append("    jobSliceCount: ").append(toIndentedString(jobSliceCount)).append("\n");
        sb.append("    jobTags: ").append(toIndentedString(jobTags)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    scmBranch: ").append(toIndentedString(scmBranch)).append("\n");
        sb.append("    skipTags: ").append(toIndentedString(skipTags)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    unifiedJobTemplate: ").append(toIndentedString(unifiedJobTemplate)).append("\n");
        sb.append("    verbosity: ").append(toIndentedString(verbosity)).append("\n");
        sb.append("    workflowJobTemplate: ").append(toIndentedString(workflowJobTemplate)).append("\n");
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