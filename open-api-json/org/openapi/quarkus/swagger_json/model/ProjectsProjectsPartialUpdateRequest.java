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
public class ProjectsProjectsPartialUpdateRequest  {

    private Boolean allowOverride;
    private Integer credential;
    private Integer defaultEnvironment;
    private String description;
    private String localPath;
    private String name;
    private Integer organization;
    private String scmBranch;
    private Boolean scmClean;
    private Boolean scmDeleteOnUpdate;
    private String scmRefspec;
    private Boolean scmTrackSubmodules;
    private String scmType;
    private Integer scmUpdateCacheTimeout;
    private Boolean scmUpdateOnLaunch;
    private String scmUrl;
    private Integer signatureValidationCredential;
    private Integer timeout;

    /**
    * Allow changing the SCM branch or revision in a job template that uses this project.
    * @return allowOverride
    **/
    @JsonProperty("allow_override")
    public Boolean getAllowOverride() {
        return allowOverride;
    }

    /**
     * Set allowOverride
     **/
    public void setAllowOverride(Boolean allowOverride) {
        this.allowOverride = allowOverride;
    }

    public ProjectsProjectsPartialUpdateRequest allowOverride(Boolean allowOverride) {
        this.allowOverride = allowOverride;
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

    public ProjectsProjectsPartialUpdateRequest credential(Integer credential) {
        this.credential = credential;
        return this;
    }

    /**
    * The default execution environment for jobs run using this project.
    * @return defaultEnvironment
    **/
    @JsonProperty("default_environment")
    public Integer getDefaultEnvironment() {
        return defaultEnvironment;
    }

    /**
     * Set defaultEnvironment
     **/
    public void setDefaultEnvironment(Integer defaultEnvironment) {
        this.defaultEnvironment = defaultEnvironment;
    }

    public ProjectsProjectsPartialUpdateRequest defaultEnvironment(Integer defaultEnvironment) {
        this.defaultEnvironment = defaultEnvironment;
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

    public ProjectsProjectsPartialUpdateRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
    * Local path (relative to PROJECTS_ROOT) containing playbooks and related files for this project.
    * @return localPath
    **/
    @JsonProperty("local_path")
    public String getLocalPath() {
        return localPath;
    }

    /**
     * Set localPath
     **/
    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    public ProjectsProjectsPartialUpdateRequest localPath(String localPath) {
        this.localPath = localPath;
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

    public ProjectsProjectsPartialUpdateRequest name(String name) {
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

    public ProjectsProjectsPartialUpdateRequest organization(Integer organization) {
        this.organization = organization;
        return this;
    }

    /**
    * Specific branch, tag or commit to checkout.
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

    public ProjectsProjectsPartialUpdateRequest scmBranch(String scmBranch) {
        this.scmBranch = scmBranch;
        return this;
    }

    /**
    * Discard any local changes before syncing the project.
    * @return scmClean
    **/
    @JsonProperty("scm_clean")
    public Boolean getScmClean() {
        return scmClean;
    }

    /**
     * Set scmClean
     **/
    public void setScmClean(Boolean scmClean) {
        this.scmClean = scmClean;
    }

    public ProjectsProjectsPartialUpdateRequest scmClean(Boolean scmClean) {
        this.scmClean = scmClean;
        return this;
    }

    /**
    * Delete the project before syncing.
    * @return scmDeleteOnUpdate
    **/
    @JsonProperty("scm_delete_on_update")
    public Boolean getScmDeleteOnUpdate() {
        return scmDeleteOnUpdate;
    }

    /**
     * Set scmDeleteOnUpdate
     **/
    public void setScmDeleteOnUpdate(Boolean scmDeleteOnUpdate) {
        this.scmDeleteOnUpdate = scmDeleteOnUpdate;
    }

    public ProjectsProjectsPartialUpdateRequest scmDeleteOnUpdate(Boolean scmDeleteOnUpdate) {
        this.scmDeleteOnUpdate = scmDeleteOnUpdate;
        return this;
    }

    /**
    * For git projects, an additional refspec to fetch.
    * @return scmRefspec
    **/
    @JsonProperty("scm_refspec")
    public String getScmRefspec() {
        return scmRefspec;
    }

    /**
     * Set scmRefspec
     **/
    public void setScmRefspec(String scmRefspec) {
        this.scmRefspec = scmRefspec;
    }

    public ProjectsProjectsPartialUpdateRequest scmRefspec(String scmRefspec) {
        this.scmRefspec = scmRefspec;
        return this;
    }

    /**
    * Track submodules latest commits on defined branch.
    * @return scmTrackSubmodules
    **/
    @JsonProperty("scm_track_submodules")
    public Boolean getScmTrackSubmodules() {
        return scmTrackSubmodules;
    }

    /**
     * Set scmTrackSubmodules
     **/
    public void setScmTrackSubmodules(Boolean scmTrackSubmodules) {
        this.scmTrackSubmodules = scmTrackSubmodules;
    }

    public ProjectsProjectsPartialUpdateRequest scmTrackSubmodules(Boolean scmTrackSubmodules) {
        this.scmTrackSubmodules = scmTrackSubmodules;
        return this;
    }

    /**
    * Specifies the source control system used to store the project.
    * @return scmType
    **/
    @JsonProperty("scm_type")
    public String getScmType() {
        return scmType;
    }

    /**
     * Set scmType
     **/
    public void setScmType(String scmType) {
        this.scmType = scmType;
    }

    public ProjectsProjectsPartialUpdateRequest scmType(String scmType) {
        this.scmType = scmType;
        return this;
    }

    /**
    * The number of seconds after the last project update ran that a new project update will be launched as a job dependency.
    * @return scmUpdateCacheTimeout
    **/
    @JsonProperty("scm_update_cache_timeout")
    public Integer getScmUpdateCacheTimeout() {
        return scmUpdateCacheTimeout;
    }

    /**
     * Set scmUpdateCacheTimeout
     **/
    public void setScmUpdateCacheTimeout(Integer scmUpdateCacheTimeout) {
        this.scmUpdateCacheTimeout = scmUpdateCacheTimeout;
    }

    public ProjectsProjectsPartialUpdateRequest scmUpdateCacheTimeout(Integer scmUpdateCacheTimeout) {
        this.scmUpdateCacheTimeout = scmUpdateCacheTimeout;
        return this;
    }

    /**
    * Update the project when a job is launched that uses the project.
    * @return scmUpdateOnLaunch
    **/
    @JsonProperty("scm_update_on_launch")
    public Boolean getScmUpdateOnLaunch() {
        return scmUpdateOnLaunch;
    }

    /**
     * Set scmUpdateOnLaunch
     **/
    public void setScmUpdateOnLaunch(Boolean scmUpdateOnLaunch) {
        this.scmUpdateOnLaunch = scmUpdateOnLaunch;
    }

    public ProjectsProjectsPartialUpdateRequest scmUpdateOnLaunch(Boolean scmUpdateOnLaunch) {
        this.scmUpdateOnLaunch = scmUpdateOnLaunch;
        return this;
    }

    /**
    * The location where the project is stored.
    * @return scmUrl
    **/
    @JsonProperty("scm_url")
    public String getScmUrl() {
        return scmUrl;
    }

    /**
     * Set scmUrl
     **/
    public void setScmUrl(String scmUrl) {
        this.scmUrl = scmUrl;
    }

    public ProjectsProjectsPartialUpdateRequest scmUrl(String scmUrl) {
        this.scmUrl = scmUrl;
        return this;
    }

    /**
    * An optional credential used for validating files in the project against unexpected changes.
    * @return signatureValidationCredential
    **/
    @JsonProperty("signature_validation_credential")
    public Integer getSignatureValidationCredential() {
        return signatureValidationCredential;
    }

    /**
     * Set signatureValidationCredential
     **/
    public void setSignatureValidationCredential(Integer signatureValidationCredential) {
        this.signatureValidationCredential = signatureValidationCredential;
    }

    public ProjectsProjectsPartialUpdateRequest signatureValidationCredential(Integer signatureValidationCredential) {
        this.signatureValidationCredential = signatureValidationCredential;
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

    public ProjectsProjectsPartialUpdateRequest timeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsProjectsPartialUpdateRequest {\n");

        sb.append("    allowOverride: ").append(toIndentedString(allowOverride)).append("\n");
        sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
        sb.append("    defaultEnvironment: ").append(toIndentedString(defaultEnvironment)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    localPath: ").append(toIndentedString(localPath)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    scmBranch: ").append(toIndentedString(scmBranch)).append("\n");
        sb.append("    scmClean: ").append(toIndentedString(scmClean)).append("\n");
        sb.append("    scmDeleteOnUpdate: ").append(toIndentedString(scmDeleteOnUpdate)).append("\n");
        sb.append("    scmRefspec: ").append(toIndentedString(scmRefspec)).append("\n");
        sb.append("    scmTrackSubmodules: ").append(toIndentedString(scmTrackSubmodules)).append("\n");
        sb.append("    scmType: ").append(toIndentedString(scmType)).append("\n");
        sb.append("    scmUpdateCacheTimeout: ").append(toIndentedString(scmUpdateCacheTimeout)).append("\n");
        sb.append("    scmUpdateOnLaunch: ").append(toIndentedString(scmUpdateOnLaunch)).append("\n");
        sb.append("    scmUrl: ").append(toIndentedString(scmUrl)).append("\n");
        sb.append("    signatureValidationCredential: ").append(toIndentedString(signatureValidationCredential)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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