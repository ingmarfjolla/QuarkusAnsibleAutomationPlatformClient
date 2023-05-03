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
public class JobTemplatesJobTemplatesCreateRequest  {

    private Boolean allowSimultaneous;
    private Boolean askCredentialOnLaunch;
    private Boolean askDiffModeOnLaunch;
    private Boolean askExecutionEnvironmentOnLaunch;
    private Boolean askForksOnLaunch;
    private Boolean askInstanceGroupsOnLaunch;
    private Boolean askInventoryOnLaunch;
    private Boolean askJobSliceCountOnLaunch;
    private Boolean askJobTypeOnLaunch;
    private Boolean askLabelsOnLaunch;
    private Boolean askLimitOnLaunch;
    private Boolean askScmBranchOnLaunch;
    private Boolean askSkipTagsOnLaunch;
    private Boolean askTagsOnLaunch;
    private Boolean askTimeoutOnLaunch;
    private Boolean askVariablesOnLaunch;
    private Boolean askVerbosityOnLaunch;
    private Boolean becomeEnabled;
    private String description;
    private Boolean diffMode;
    private Integer executionEnvironment;
    private String extraVars;
    private Boolean forceHandlers;
    private Integer forks;
    private String hostConfigKey;
    private Integer inventory;
    private Integer jobSliceCount;
    private String jobTags;
    private String jobType;
    private String limit;
    private String name;
    private String playbook;
    private Boolean preventInstanceGroupFallback;
    private String project;
    private String scmBranch;
    private String skipTags;
    private String startAtTask;
    private Boolean surveyEnabled;
    private Integer timeout;
    private Boolean useFactCache;
    private String verbosity;
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

    public JobTemplatesJobTemplatesCreateRequest allowSimultaneous(Boolean allowSimultaneous) {
        this.allowSimultaneous = allowSimultaneous;
        return this;
    }

    /**
    * Get askCredentialOnLaunch
    * @return askCredentialOnLaunch
    **/
    @JsonProperty("ask_credential_on_launch")
    public Boolean getAskCredentialOnLaunch() {
        return askCredentialOnLaunch;
    }

    /**
     * Set askCredentialOnLaunch
     **/
    public void setAskCredentialOnLaunch(Boolean askCredentialOnLaunch) {
        this.askCredentialOnLaunch = askCredentialOnLaunch;
    }

    public JobTemplatesJobTemplatesCreateRequest askCredentialOnLaunch(Boolean askCredentialOnLaunch) {
        this.askCredentialOnLaunch = askCredentialOnLaunch;
        return this;
    }

    /**
    * Get askDiffModeOnLaunch
    * @return askDiffModeOnLaunch
    **/
    @JsonProperty("ask_diff_mode_on_launch")
    public Boolean getAskDiffModeOnLaunch() {
        return askDiffModeOnLaunch;
    }

    /**
     * Set askDiffModeOnLaunch
     **/
    public void setAskDiffModeOnLaunch(Boolean askDiffModeOnLaunch) {
        this.askDiffModeOnLaunch = askDiffModeOnLaunch;
    }

    public JobTemplatesJobTemplatesCreateRequest askDiffModeOnLaunch(Boolean askDiffModeOnLaunch) {
        this.askDiffModeOnLaunch = askDiffModeOnLaunch;
        return this;
    }

    /**
    * Get askExecutionEnvironmentOnLaunch
    * @return askExecutionEnvironmentOnLaunch
    **/
    @JsonProperty("ask_execution_environment_on_launch")
    public Boolean getAskExecutionEnvironmentOnLaunch() {
        return askExecutionEnvironmentOnLaunch;
    }

    /**
     * Set askExecutionEnvironmentOnLaunch
     **/
    public void setAskExecutionEnvironmentOnLaunch(Boolean askExecutionEnvironmentOnLaunch) {
        this.askExecutionEnvironmentOnLaunch = askExecutionEnvironmentOnLaunch;
    }

    public JobTemplatesJobTemplatesCreateRequest askExecutionEnvironmentOnLaunch(Boolean askExecutionEnvironmentOnLaunch) {
        this.askExecutionEnvironmentOnLaunch = askExecutionEnvironmentOnLaunch;
        return this;
    }

    /**
    * Get askForksOnLaunch
    * @return askForksOnLaunch
    **/
    @JsonProperty("ask_forks_on_launch")
    public Boolean getAskForksOnLaunch() {
        return askForksOnLaunch;
    }

    /**
     * Set askForksOnLaunch
     **/
    public void setAskForksOnLaunch(Boolean askForksOnLaunch) {
        this.askForksOnLaunch = askForksOnLaunch;
    }

    public JobTemplatesJobTemplatesCreateRequest askForksOnLaunch(Boolean askForksOnLaunch) {
        this.askForksOnLaunch = askForksOnLaunch;
        return this;
    }

    /**
    * Get askInstanceGroupsOnLaunch
    * @return askInstanceGroupsOnLaunch
    **/
    @JsonProperty("ask_instance_groups_on_launch")
    public Boolean getAskInstanceGroupsOnLaunch() {
        return askInstanceGroupsOnLaunch;
    }

    /**
     * Set askInstanceGroupsOnLaunch
     **/
    public void setAskInstanceGroupsOnLaunch(Boolean askInstanceGroupsOnLaunch) {
        this.askInstanceGroupsOnLaunch = askInstanceGroupsOnLaunch;
    }

    public JobTemplatesJobTemplatesCreateRequest askInstanceGroupsOnLaunch(Boolean askInstanceGroupsOnLaunch) {
        this.askInstanceGroupsOnLaunch = askInstanceGroupsOnLaunch;
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

    public JobTemplatesJobTemplatesCreateRequest askInventoryOnLaunch(Boolean askInventoryOnLaunch) {
        this.askInventoryOnLaunch = askInventoryOnLaunch;
        return this;
    }

    /**
    * Get askJobSliceCountOnLaunch
    * @return askJobSliceCountOnLaunch
    **/
    @JsonProperty("ask_job_slice_count_on_launch")
    public Boolean getAskJobSliceCountOnLaunch() {
        return askJobSliceCountOnLaunch;
    }

    /**
     * Set askJobSliceCountOnLaunch
     **/
    public void setAskJobSliceCountOnLaunch(Boolean askJobSliceCountOnLaunch) {
        this.askJobSliceCountOnLaunch = askJobSliceCountOnLaunch;
    }

    public JobTemplatesJobTemplatesCreateRequest askJobSliceCountOnLaunch(Boolean askJobSliceCountOnLaunch) {
        this.askJobSliceCountOnLaunch = askJobSliceCountOnLaunch;
        return this;
    }

    /**
    * Get askJobTypeOnLaunch
    * @return askJobTypeOnLaunch
    **/
    @JsonProperty("ask_job_type_on_launch")
    public Boolean getAskJobTypeOnLaunch() {
        return askJobTypeOnLaunch;
    }

    /**
     * Set askJobTypeOnLaunch
     **/
    public void setAskJobTypeOnLaunch(Boolean askJobTypeOnLaunch) {
        this.askJobTypeOnLaunch = askJobTypeOnLaunch;
    }

    public JobTemplatesJobTemplatesCreateRequest askJobTypeOnLaunch(Boolean askJobTypeOnLaunch) {
        this.askJobTypeOnLaunch = askJobTypeOnLaunch;
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

    public JobTemplatesJobTemplatesCreateRequest askLabelsOnLaunch(Boolean askLabelsOnLaunch) {
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

    public JobTemplatesJobTemplatesCreateRequest askLimitOnLaunch(Boolean askLimitOnLaunch) {
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

    public JobTemplatesJobTemplatesCreateRequest askScmBranchOnLaunch(Boolean askScmBranchOnLaunch) {
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

    public JobTemplatesJobTemplatesCreateRequest askSkipTagsOnLaunch(Boolean askSkipTagsOnLaunch) {
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

    public JobTemplatesJobTemplatesCreateRequest askTagsOnLaunch(Boolean askTagsOnLaunch) {
        this.askTagsOnLaunch = askTagsOnLaunch;
        return this;
    }

    /**
    * Get askTimeoutOnLaunch
    * @return askTimeoutOnLaunch
    **/
    @JsonProperty("ask_timeout_on_launch")
    public Boolean getAskTimeoutOnLaunch() {
        return askTimeoutOnLaunch;
    }

    /**
     * Set askTimeoutOnLaunch
     **/
    public void setAskTimeoutOnLaunch(Boolean askTimeoutOnLaunch) {
        this.askTimeoutOnLaunch = askTimeoutOnLaunch;
    }

    public JobTemplatesJobTemplatesCreateRequest askTimeoutOnLaunch(Boolean askTimeoutOnLaunch) {
        this.askTimeoutOnLaunch = askTimeoutOnLaunch;
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

    public JobTemplatesJobTemplatesCreateRequest askVariablesOnLaunch(Boolean askVariablesOnLaunch) {
        this.askVariablesOnLaunch = askVariablesOnLaunch;
        return this;
    }

    /**
    * Get askVerbosityOnLaunch
    * @return askVerbosityOnLaunch
    **/
    @JsonProperty("ask_verbosity_on_launch")
    public Boolean getAskVerbosityOnLaunch() {
        return askVerbosityOnLaunch;
    }

    /**
     * Set askVerbosityOnLaunch
     **/
    public void setAskVerbosityOnLaunch(Boolean askVerbosityOnLaunch) {
        this.askVerbosityOnLaunch = askVerbosityOnLaunch;
    }

    public JobTemplatesJobTemplatesCreateRequest askVerbosityOnLaunch(Boolean askVerbosityOnLaunch) {
        this.askVerbosityOnLaunch = askVerbosityOnLaunch;
        return this;
    }

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

    public JobTemplatesJobTemplatesCreateRequest becomeEnabled(Boolean becomeEnabled) {
        this.becomeEnabled = becomeEnabled;
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

    public JobTemplatesJobTemplatesCreateRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
    * If enabled, textual changes made to any templated files on the host are shown in the standard output
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

    public JobTemplatesJobTemplatesCreateRequest diffMode(Boolean diffMode) {
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

    public JobTemplatesJobTemplatesCreateRequest executionEnvironment(Integer executionEnvironment) {
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

    public JobTemplatesJobTemplatesCreateRequest extraVars(String extraVars) {
        this.extraVars = extraVars;
        return this;
    }

    /**
    * Get forceHandlers
    * @return forceHandlers
    **/
    @JsonProperty("force_handlers")
    public Boolean getForceHandlers() {
        return forceHandlers;
    }

    /**
     * Set forceHandlers
     **/
    public void setForceHandlers(Boolean forceHandlers) {
        this.forceHandlers = forceHandlers;
    }

    public JobTemplatesJobTemplatesCreateRequest forceHandlers(Boolean forceHandlers) {
        this.forceHandlers = forceHandlers;
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

    public JobTemplatesJobTemplatesCreateRequest forks(Integer forks) {
        this.forks = forks;
        return this;
    }

    /**
    * Get hostConfigKey
    * @return hostConfigKey
    **/
    @JsonProperty("host_config_key")
    public String getHostConfigKey() {
        return hostConfigKey;
    }

    /**
     * Set hostConfigKey
     **/
    public void setHostConfigKey(String hostConfigKey) {
        this.hostConfigKey = hostConfigKey;
    }

    public JobTemplatesJobTemplatesCreateRequest hostConfigKey(String hostConfigKey) {
        this.hostConfigKey = hostConfigKey;
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

    public JobTemplatesJobTemplatesCreateRequest inventory(Integer inventory) {
        this.inventory = inventory;
        return this;
    }

    /**
    * The number of jobs to slice into at runtime. Will cause the Job Template to launch a workflow if value is greater than 1.
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

    public JobTemplatesJobTemplatesCreateRequest jobSliceCount(Integer jobSliceCount) {
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

    public JobTemplatesJobTemplatesCreateRequest jobTags(String jobTags) {
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

    public JobTemplatesJobTemplatesCreateRequest jobType(String jobType) {
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

    public JobTemplatesJobTemplatesCreateRequest limit(String limit) {
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

    public JobTemplatesJobTemplatesCreateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get playbook
    * @return playbook
    **/
    @JsonProperty("playbook")
    public String getPlaybook() {
        return playbook;
    }

    /**
     * Set playbook
     **/
    public void setPlaybook(String playbook) {
        this.playbook = playbook;
    }

    public JobTemplatesJobTemplatesCreateRequest playbook(String playbook) {
        this.playbook = playbook;
        return this;
    }

    /**
    * If enabled, the job template will prevent adding any inventory or organization instance groups to the list of preferred instances groups to run on.If this setting is enabled and you provided an empty list, the global instance groups will be applied.
    * @return preventInstanceGroupFallback
    **/
    @JsonProperty("prevent_instance_group_fallback")
    public Boolean getPreventInstanceGroupFallback() {
        return preventInstanceGroupFallback;
    }

    /**
     * Set preventInstanceGroupFallback
     **/
    public void setPreventInstanceGroupFallback(Boolean preventInstanceGroupFallback) {
        this.preventInstanceGroupFallback = preventInstanceGroupFallback;
    }

    public JobTemplatesJobTemplatesCreateRequest preventInstanceGroupFallback(Boolean preventInstanceGroupFallback) {
        this.preventInstanceGroupFallback = preventInstanceGroupFallback;
        return this;
    }

    /**
    * Get project
    * @return project
    **/
    @JsonProperty("project")
    public String getProject() {
        return project;
    }

    /**
     * Set project
     **/
    public void setProject(String project) {
        this.project = project;
    }

    public JobTemplatesJobTemplatesCreateRequest project(String project) {
        this.project = project;
        return this;
    }

    /**
    * Branch to use in job run. Project default used if blank. Only allowed if project allow_override field is set to true.
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

    public JobTemplatesJobTemplatesCreateRequest scmBranch(String scmBranch) {
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

    public JobTemplatesJobTemplatesCreateRequest skipTags(String skipTags) {
        this.skipTags = skipTags;
        return this;
    }

    /**
    * Get startAtTask
    * @return startAtTask
    **/
    @JsonProperty("start_at_task")
    public String getStartAtTask() {
        return startAtTask;
    }

    /**
     * Set startAtTask
     **/
    public void setStartAtTask(String startAtTask) {
        this.startAtTask = startAtTask;
    }

    public JobTemplatesJobTemplatesCreateRequest startAtTask(String startAtTask) {
        this.startAtTask = startAtTask;
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

    public JobTemplatesJobTemplatesCreateRequest surveyEnabled(Boolean surveyEnabled) {
        this.surveyEnabled = surveyEnabled;
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

    public JobTemplatesJobTemplatesCreateRequest timeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
    * If enabled, the service will act as an Ansible Fact Cache Plugin; persisting facts at the end of a playbook run to the database and caching facts for use by Ansible.
    * @return useFactCache
    **/
    @JsonProperty("use_fact_cache")
    public Boolean getUseFactCache() {
        return useFactCache;
    }

    /**
     * Set useFactCache
     **/
    public void setUseFactCache(Boolean useFactCache) {
        this.useFactCache = useFactCache;
    }

    public JobTemplatesJobTemplatesCreateRequest useFactCache(Boolean useFactCache) {
        this.useFactCache = useFactCache;
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

    public JobTemplatesJobTemplatesCreateRequest verbosity(String verbosity) {
        this.verbosity = verbosity;
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

    public JobTemplatesJobTemplatesCreateRequest webhookCredential(Integer webhookCredential) {
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

    public JobTemplatesJobTemplatesCreateRequest webhookService(String webhookService) {
        this.webhookService = webhookService;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobTemplatesJobTemplatesCreateRequest {\n");

        sb.append("    allowSimultaneous: ").append(toIndentedString(allowSimultaneous)).append("\n");
        sb.append("    askCredentialOnLaunch: ").append(toIndentedString(askCredentialOnLaunch)).append("\n");
        sb.append("    askDiffModeOnLaunch: ").append(toIndentedString(askDiffModeOnLaunch)).append("\n");
        sb.append("    askExecutionEnvironmentOnLaunch: ").append(toIndentedString(askExecutionEnvironmentOnLaunch)).append("\n");
        sb.append("    askForksOnLaunch: ").append(toIndentedString(askForksOnLaunch)).append("\n");
        sb.append("    askInstanceGroupsOnLaunch: ").append(toIndentedString(askInstanceGroupsOnLaunch)).append("\n");
        sb.append("    askInventoryOnLaunch: ").append(toIndentedString(askInventoryOnLaunch)).append("\n");
        sb.append("    askJobSliceCountOnLaunch: ").append(toIndentedString(askJobSliceCountOnLaunch)).append("\n");
        sb.append("    askJobTypeOnLaunch: ").append(toIndentedString(askJobTypeOnLaunch)).append("\n");
        sb.append("    askLabelsOnLaunch: ").append(toIndentedString(askLabelsOnLaunch)).append("\n");
        sb.append("    askLimitOnLaunch: ").append(toIndentedString(askLimitOnLaunch)).append("\n");
        sb.append("    askScmBranchOnLaunch: ").append(toIndentedString(askScmBranchOnLaunch)).append("\n");
        sb.append("    askSkipTagsOnLaunch: ").append(toIndentedString(askSkipTagsOnLaunch)).append("\n");
        sb.append("    askTagsOnLaunch: ").append(toIndentedString(askTagsOnLaunch)).append("\n");
        sb.append("    askTimeoutOnLaunch: ").append(toIndentedString(askTimeoutOnLaunch)).append("\n");
        sb.append("    askVariablesOnLaunch: ").append(toIndentedString(askVariablesOnLaunch)).append("\n");
        sb.append("    askVerbosityOnLaunch: ").append(toIndentedString(askVerbosityOnLaunch)).append("\n");
        sb.append("    becomeEnabled: ").append(toIndentedString(becomeEnabled)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    diffMode: ").append(toIndentedString(diffMode)).append("\n");
        sb.append("    executionEnvironment: ").append(toIndentedString(executionEnvironment)).append("\n");
        sb.append("    extraVars: ").append(toIndentedString(extraVars)).append("\n");
        sb.append("    forceHandlers: ").append(toIndentedString(forceHandlers)).append("\n");
        sb.append("    forks: ").append(toIndentedString(forks)).append("\n");
        sb.append("    hostConfigKey: ").append(toIndentedString(hostConfigKey)).append("\n");
        sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
        sb.append("    jobSliceCount: ").append(toIndentedString(jobSliceCount)).append("\n");
        sb.append("    jobTags: ").append(toIndentedString(jobTags)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    playbook: ").append(toIndentedString(playbook)).append("\n");
        sb.append("    preventInstanceGroupFallback: ").append(toIndentedString(preventInstanceGroupFallback)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    scmBranch: ").append(toIndentedString(scmBranch)).append("\n");
        sb.append("    skipTags: ").append(toIndentedString(skipTags)).append("\n");
        sb.append("    startAtTask: ").append(toIndentedString(startAtTask)).append("\n");
        sb.append("    surveyEnabled: ").append(toIndentedString(surveyEnabled)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    useFactCache: ").append(toIndentedString(useFactCache)).append("\n");
        sb.append("    verbosity: ").append(toIndentedString(verbosity)).append("\n");
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