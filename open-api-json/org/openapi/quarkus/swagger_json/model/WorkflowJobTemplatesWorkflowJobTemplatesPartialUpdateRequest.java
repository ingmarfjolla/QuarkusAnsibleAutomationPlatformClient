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
public class WorkflowJobTemplatesWorkflowJobTemplatesPartialUpdateRequest  {

    private Boolean allowSimultaneous;
    private Boolean askInventoryOnLaunch;
    private Boolean askLabelsOnLaunch;
    private Boolean askLimitOnLaunch;
    private Boolean askScmBranchOnLaunch;
    private Boolean askSkipTagsOnLaunch;
    private Boolean askTagsOnLaunch;
    private Boolean askVariablesOnLaunch;
    private String description;
    private String extraVars;
    private Integer inventory;
    private String jobTags;
    private String limit;
    private String name;
    private Integer organization;
    private String scmBranch;
    private String skipTags;
    private Boolean surveyEnabled;
    private Integer webhookCredential;
    private String webhookService;

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

    public WorkflowJobTemplatesWorkflowJobTemplatesPartialUpdateRequest allowSimultaneous(Boolean allowSimultaneous) {
        this.allowSimultaneous = allowSimultaneous;
        return this;
    }

    /**
    * Get askInventoryOnLaunch
    * @return askInventoryOnLaunch
    **/
    @JsonProperty("ask_inventory_on_launch")
    public Boolean getAskInventoryOnLaunch() {
        return askInventoryOnLaunch;
    }

    /**
     * Set askInventoryOnLaunch
     **/
    public void setAskInventoryOnLaunch(Boolean askInventoryOnLaunch) {
        this.askInventoryOnLaunch = askInventoryOnLaunch;
    }

    public WorkflowJobTemplatesWorkflowJobTemplatesPartialUpdateRequest askInventoryOnLaunch(Boolean askInventoryOnLaunch) {
        this.askInventoryOnLaunch = askInventoryOnLaunch;
        return this;
    }

    /**
    * Get askLabelsOnLaunch
    * @return askLabelsOnLaunch
    **/
    @JsonProperty("ask_labels_on_launch")
    public Boolean getAskLabelsOnLaunch() {
        return askLabelsOnLaunch;
    }

    /**
     * Set askLabelsOnLaunch
     **/
    public void setAskLabelsOnLaunch(Boolean askLabelsOnLaunch) {
        this.askLabelsOnLaunch = askLabelsOnLaunch;
    }

    public WorkflowJobTemplatesWorkflowJobTemplatesPartialUpdateRequest askLabelsOnLaunch(Boolean askLabelsOnLaunch) {
        this.askLabelsOnLaunch = askLabelsOnLaunch;
        return this;
    }

    /**
    * Get askLimitOnLaunch
    * @return askLimitOnLaunch
    **/
    @JsonProperty("ask_limit_on_launch")
    public Boolean getAskLimitOnLaunch() {
        return askLimitOnLaunch;
    }

    /**
     * Set askLimitOnLaunch
     **/
    public void setAskLimitOnLaunch(Boolean askLimitOnLaunch) {
        this.askLimitOnLaunch = askLimitOnLaunch;
    }

    public WorkflowJobTemplatesWorkflowJobTemplatesPartialUpdateRequest askLimitOnLaunch(Boolean askLimitOnLaunch) {
        this.askLimitOnLaunch = askLimitOnLaunch;
        return this;
    }

    /**
    * Get askScmBranchOnLaunch
    * @return askScmBranchOnLaunch
    **/
    @JsonProperty("ask_scm_branch_on_launch")
    public Boolean getAskScmBranchOnLaunch() {
        return askScmBranchOnLaunch;
    }

    /**
     * Set askScmBranchOnLaunch
     **/
    public void setAskScmBranchOnLaunch(Boolean askScmBranchOnLaunch) {
        this.askScmBranchOnLaunch = askScmBranchOnLaunch;
    }

    public WorkflowJobTemplatesWorkflowJobTemplatesPartialUpdateRequest askScmBranchOnLaunch(Boolean askScmBranchOnLaunch) {
        this.askScmBranchOnLaunch = askScmBranchOnLaunch;
        return this;
    }

    /**
    * Get askSkipTagsOnLaunch
    * @return askSkipTagsOnLaunch
    **/
    @JsonProperty("ask_skip_tags_on_launch")
    public Boolean getAskSkipTagsOnLaunch() {
        return askSkipTagsOnLaunch;
    }

    /**
     * Set askSkipTagsOnLaunch
     **/
    public void setAskSkipTagsOnLaunch(Boolean askSkipTagsOnLaunch) {
        this.askSkipTagsOnLaunch = askSkipTagsOnLaunch;
    }

    public WorkflowJobTemplatesWorkflowJobTemplatesPartialUpdateRequest askSkipTagsOnLaunch(Boolean askSkipTagsOnLaunch) {
        this.askSkipTagsOnLaunch = askSkipTagsOnLaunch;
        return this;
    }

    /**
    * Get askTagsOnLaunch
    * @return askTagsOnLaunch
    **/
    @JsonProperty("ask_tags_on_launch")
    public Boolean getAskTagsOnLaunch() {
        return askTagsOnLaunch;
    }

    /**
     * Set askTagsOnLaunch
     **/
    public void setAskTagsOnLaunch(Boolean askTagsOnLaunch) {
        this.askTagsOnLaunch = askTagsOnLaunch;
    }

    public WorkflowJobTemplatesWorkflowJobTemplatesPartialUpdateRequest askTagsOnLaunch(Boolean askTagsOnLaunch) {
        this.askTagsOnLaunch = askTagsOnLaunch;
        return this;
    }

    /**
    * Get askVariablesOnLaunch
    * @return askVariablesOnLaunch
    **/
    @JsonProperty("ask_variables_on_launch")
    public Boolean getAskVariablesOnLaunch() {
        return askVariablesOnLaunch;
    }

    /**
     * Set askVariablesOnLaunch
     **/
    public void setAskVariablesOnLaunch(Boolean askVariablesOnLaunch) {
        this.askVariablesOnLaunch = askVariablesOnLaunch;
    }

    public WorkflowJobTemplatesWorkflowJobTemplatesPartialUpdateRequest askVariablesOnLaunch(Boolean askVariablesOnLaunch) {
        this.askVariablesOnLaunch = askVariablesOnLaunch;
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

    public WorkflowJobTemplatesWorkflowJobTemplatesPartialUpdateRequest description(String description) {
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

    public WorkflowJobTemplatesWorkflowJobTemplatesPartialUpdateRequest extraVars(String extraVars) {
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

    public WorkflowJobTemplatesWorkflowJobTemplatesPartialUpdateRequest inventory(Integer inventory) {
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

    public WorkflowJobTemplatesWorkflowJobTemplatesPartialUpdateRequest jobTags(String jobTags) {
        this.jobTags = jobTags;
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

    public WorkflowJobTemplatesWorkflowJobTemplatesPartialUpdateRequest limit(String limit) {
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

    public WorkflowJobTemplatesWorkflowJobTemplatesPartialUpdateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The organization used to determine access to this template.
    * @return organization
    **/
    @JsonProperty("organization")
    public Integer getOrganization() {
        return organization;
    }

    /**
     * Set organization
     **/
    public void setOrganization(Integer organization) {
        this.organization = organization;
    }

    public WorkflowJobTemplatesWorkflowJobTemplatesPartialUpdateRequest organization(Integer organization) {
        this.organization = organization;
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

    public WorkflowJobTemplatesWorkflowJobTemplatesPartialUpdateRequest scmBranch(String scmBranch) {
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

    public WorkflowJobTemplatesWorkflowJobTemplatesPartialUpdateRequest skipTags(String skipTags) {
        this.skipTags = skipTags;
        return this;
    }

    /**
    * Get surveyEnabled
    * @return surveyEnabled
    **/
    @JsonProperty("survey_enabled")
    public Boolean getSurveyEnabled() {
        return surveyEnabled;
    }

    /**
     * Set surveyEnabled
     **/
    public void setSurveyEnabled(Boolean surveyEnabled) {
        this.surveyEnabled = surveyEnabled;
    }

    public WorkflowJobTemplatesWorkflowJobTemplatesPartialUpdateRequest surveyEnabled(Boolean surveyEnabled) {
        this.surveyEnabled = surveyEnabled;
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

    public WorkflowJobTemplatesWorkflowJobTemplatesPartialUpdateRequest webhookCredential(Integer webhookCredential) {
        this.webhookCredential = webhookCredential;
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

    public WorkflowJobTemplatesWorkflowJobTemplatesPartialUpdateRequest webhookService(String webhookService) {
        this.webhookService = webhookService;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowJobTemplatesWorkflowJobTemplatesPartialUpdateRequest {\n");

        sb.append("    allowSimultaneous: ").append(toIndentedString(allowSimultaneous)).append("\n");
        sb.append("    askInventoryOnLaunch: ").append(toIndentedString(askInventoryOnLaunch)).append("\n");
        sb.append("    askLabelsOnLaunch: ").append(toIndentedString(askLabelsOnLaunch)).append("\n");
        sb.append("    askLimitOnLaunch: ").append(toIndentedString(askLimitOnLaunch)).append("\n");
        sb.append("    askScmBranchOnLaunch: ").append(toIndentedString(askScmBranchOnLaunch)).append("\n");
        sb.append("    askSkipTagsOnLaunch: ").append(toIndentedString(askSkipTagsOnLaunch)).append("\n");
        sb.append("    askTagsOnLaunch: ").append(toIndentedString(askTagsOnLaunch)).append("\n");
        sb.append("    askVariablesOnLaunch: ").append(toIndentedString(askVariablesOnLaunch)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    extraVars: ").append(toIndentedString(extraVars)).append("\n");
        sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
        sb.append("    jobTags: ").append(toIndentedString(jobTags)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    scmBranch: ").append(toIndentedString(scmBranch)).append("\n");
        sb.append("    skipTags: ").append(toIndentedString(skipTags)).append("\n");
        sb.append("    surveyEnabled: ").append(toIndentedString(surveyEnabled)).append("\n");
        sb.append("    webhookCredential: ").append(toIndentedString(webhookCredential)).append("\n");
        sb.append("    webhookService: ").append(toIndentedString(webhookService)).append("\n");
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