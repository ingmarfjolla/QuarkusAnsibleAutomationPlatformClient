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
public class JobTemplatesJobTemplatesSliceWorkflowJobsCreateRequest  {

    private Boolean allowSimultaneous;
    private String description;
    private String extraVars;
    private Integer inventory;
    private Boolean isSlicedJob;
    private String jobTags;
    private String jobTemplate;
    private String limit;
    private String name;
    private String scmBranch;
    private String skipTags;
    private Integer webhookCredential;
    private String webhookGuid;
    private String webhookService;
    private String workflowJobTemplate;

    /**
    * Get allowSimultaneous
    * @return allowSimultaneous
    **/
    @JsonProperty("allow_simultaneous")
    public Boolean getAllowSimultaneous() {
        return allowSimultaneous;
    }

    /**
     * Set allowSimultaneous
     **/
    public void setAllowSimultaneous(Boolean allowSimultaneous) {
        this.allowSimultaneous = allowSimultaneous;
    }

    public JobTemplatesJobTemplatesSliceWorkflowJobsCreateRequest allowSimultaneous(Boolean allowSimultaneous) {
        this.allowSimultaneous = allowSimultaneous;
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

    public JobTemplatesJobTemplatesSliceWorkflowJobsCreateRequest description(String description) {
        this.description = description;
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

    public JobTemplatesJobTemplatesSliceWorkflowJobsCreateRequest extraVars(String extraVars) {
        this.extraVars = extraVars;
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

    public JobTemplatesJobTemplatesSliceWorkflowJobsCreateRequest inventory(Integer inventory) {
        this.inventory = inventory;
        return this;
    }

    /**
    * Get isSlicedJob
    * @return isSlicedJob
    **/
    @JsonProperty("is_sliced_job")
    public Boolean getIsSlicedJob() {
        return isSlicedJob;
    }

    /**
     * Set isSlicedJob
     **/
    public void setIsSlicedJob(Boolean isSlicedJob) {
        this.isSlicedJob = isSlicedJob;
    }

    public JobTemplatesJobTemplatesSliceWorkflowJobsCreateRequest isSlicedJob(Boolean isSlicedJob) {
        this.isSlicedJob = isSlicedJob;
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

    public JobTemplatesJobTemplatesSliceWorkflowJobsCreateRequest jobTags(String jobTags) {
        this.jobTags = jobTags;
        return this;
    }

    /**
    * If automatically created for a sliced job run, the job template the workflow job was created from.
    * @return jobTemplate
    **/
    @JsonProperty("job_template")
    public String getJobTemplate() {
        return jobTemplate;
    }

    /**
     * Set jobTemplate
     **/
    public void setJobTemplate(String jobTemplate) {
        this.jobTemplate = jobTemplate;
    }

    public JobTemplatesJobTemplatesSliceWorkflowJobsCreateRequest jobTemplate(String jobTemplate) {
        this.jobTemplate = jobTemplate;
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

    public JobTemplatesJobTemplatesSliceWorkflowJobsCreateRequest limit(String limit) {
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

    public JobTemplatesJobTemplatesSliceWorkflowJobsCreateRequest name(String name) {
        this.name = name;
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

    public JobTemplatesJobTemplatesSliceWorkflowJobsCreateRequest scmBranch(String scmBranch) {
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

    public JobTemplatesJobTemplatesSliceWorkflowJobsCreateRequest skipTags(String skipTags) {
        this.skipTags = skipTags;
        return this;
    }

    /**
    * Personal Access Token for posting back the status to the service API
    * @return webhookCredential
    **/
    @JsonProperty("webhook_credential")
    public Integer getWebhookCredential() {
        return webhookCredential;
    }

    /**
     * Set webhookCredential
     **/
    public void setWebhookCredential(Integer webhookCredential) {
        this.webhookCredential = webhookCredential;
    }

    public JobTemplatesJobTemplatesSliceWorkflowJobsCreateRequest webhookCredential(Integer webhookCredential) {
        this.webhookCredential = webhookCredential;
        return this;
    }

    /**
    * Unique identifier of the event that triggered this webhook
    * @return webhookGuid
    **/
    @JsonProperty("webhook_guid")
    public String getWebhookGuid() {
        return webhookGuid;
    }

    /**
     * Set webhookGuid
     **/
    public void setWebhookGuid(String webhookGuid) {
        this.webhookGuid = webhookGuid;
    }

    public JobTemplatesJobTemplatesSliceWorkflowJobsCreateRequest webhookGuid(String webhookGuid) {
        this.webhookGuid = webhookGuid;
        return this;
    }

    /**
    * Service that webhook requests will be accepted from
    * @return webhookService
    **/
    @JsonProperty("webhook_service")
    public String getWebhookService() {
        return webhookService;
    }

    /**
     * Set webhookService
     **/
    public void setWebhookService(String webhookService) {
        this.webhookService = webhookService;
    }

    public JobTemplatesJobTemplatesSliceWorkflowJobsCreateRequest webhookService(String webhookService) {
        this.webhookService = webhookService;
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

    public JobTemplatesJobTemplatesSliceWorkflowJobsCreateRequest workflowJobTemplate(String workflowJobTemplate) {
        this.workflowJobTemplate = workflowJobTemplate;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobTemplatesJobTemplatesSliceWorkflowJobsCreateRequest {\n");

        sb.append("    allowSimultaneous: ").append(toIndentedString(allowSimultaneous)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    extraVars: ").append(toIndentedString(extraVars)).append("\n");
        sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
        sb.append("    isSlicedJob: ").append(toIndentedString(isSlicedJob)).append("\n");
        sb.append("    jobTags: ").append(toIndentedString(jobTags)).append("\n");
        sb.append("    jobTemplate: ").append(toIndentedString(jobTemplate)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    scmBranch: ").append(toIndentedString(scmBranch)).append("\n");
        sb.append("    skipTags: ").append(toIndentedString(skipTags)).append("\n");
        sb.append("    webhookCredential: ").append(toIndentedString(webhookCredential)).append("\n");
        sb.append("    webhookGuid: ").append(toIndentedString(webhookGuid)).append("\n");
        sb.append("    webhookService: ").append(toIndentedString(webhookService)).append("\n");
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