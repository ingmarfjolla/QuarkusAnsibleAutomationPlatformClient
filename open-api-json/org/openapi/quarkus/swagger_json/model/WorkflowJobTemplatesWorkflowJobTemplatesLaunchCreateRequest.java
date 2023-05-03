package org.openapi.quarkus.swagger_json.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkflowJobTemplatesWorkflowJobTemplatesLaunchCreateRequest  {

    private String extraVars;
    private Integer inventory;
    private String jobTags;
    private List<String> labels = null;
    private String limit;
    private String scmBranch;
    private String skipTags;

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

    public WorkflowJobTemplatesWorkflowJobTemplatesLaunchCreateRequest extraVars(String extraVars) {
        this.extraVars = extraVars;
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

    public WorkflowJobTemplatesWorkflowJobTemplatesLaunchCreateRequest inventory(Integer inventory) {
        this.inventory = inventory;
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

    public WorkflowJobTemplatesWorkflowJobTemplatesLaunchCreateRequest jobTags(String jobTags) {
        this.jobTags = jobTags;
        return this;
    }

    /**
    * Get labels
    * @return labels
    **/
    @JsonProperty("labels")
    public List<String> getLabels() {
        return labels;
    }

    /**
     * Set labels
     **/
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public WorkflowJobTemplatesWorkflowJobTemplatesLaunchCreateRequest labels(List<String> labels) {
        this.labels = labels;
        return this;
    }
    public WorkflowJobTemplatesWorkflowJobTemplatesLaunchCreateRequest addLabelsItem(String labelsItem) {
        this.labels.add(labelsItem);
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

    public WorkflowJobTemplatesWorkflowJobTemplatesLaunchCreateRequest limit(String limit) {
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

    public WorkflowJobTemplatesWorkflowJobTemplatesLaunchCreateRequest scmBranch(String scmBranch) {
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

    public WorkflowJobTemplatesWorkflowJobTemplatesLaunchCreateRequest skipTags(String skipTags) {
        this.skipTags = skipTags;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowJobTemplatesWorkflowJobTemplatesLaunchCreateRequest {\n");

        sb.append("    extraVars: ").append(toIndentedString(extraVars)).append("\n");
        sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
        sb.append("    jobTags: ").append(toIndentedString(jobTags)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    scmBranch: ").append(toIndentedString(scmBranch)).append("\n");
        sb.append("    skipTags: ").append(toIndentedString(skipTags)).append("\n");
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