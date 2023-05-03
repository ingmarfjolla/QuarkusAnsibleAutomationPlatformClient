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
public class InstanceGroupsInstanceGroupsCreateRequest  {

    private Integer credential;
    private Boolean isContainerGroup;
    private Integer maxConcurrentJobs;
    private Integer maxForks;
    private String name;
    private String podSpecOverride;
    private List<String> policyInstanceList = null;
    private Integer policyInstanceMinimum;
    private Integer policyInstancePercentage;

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

    public InstanceGroupsInstanceGroupsCreateRequest credential(Integer credential) {
        this.credential = credential;
        return this;
    }

    /**
    * Indicates whether instances in this group are containerized.Containerized groups have a designated Openshift or Kubernetes cluster.
    * @return isContainerGroup
    **/
    @JsonProperty("is_container_group")
    public Boolean getIsContainerGroup() {
        return isContainerGroup;
    }

    /**
     * Set isContainerGroup
     **/
    public void setIsContainerGroup(Boolean isContainerGroup) {
        this.isContainerGroup = isContainerGroup;
    }

    public InstanceGroupsInstanceGroupsCreateRequest isContainerGroup(Boolean isContainerGroup) {
        this.isContainerGroup = isContainerGroup;
        return this;
    }

    /**
    * Maximum number of concurrent jobs to run on a group. When set to zero, no maximum is enforced.
    * @return maxConcurrentJobs
    **/
    @JsonProperty("max_concurrent_jobs")
    public Integer getMaxConcurrentJobs() {
        return maxConcurrentJobs;
    }

    /**
     * Set maxConcurrentJobs
     **/
    public void setMaxConcurrentJobs(Integer maxConcurrentJobs) {
        this.maxConcurrentJobs = maxConcurrentJobs;
    }

    public InstanceGroupsInstanceGroupsCreateRequest maxConcurrentJobs(Integer maxConcurrentJobs) {
        this.maxConcurrentJobs = maxConcurrentJobs;
        return this;
    }

    /**
    * Maximum number of forks to execute concurrently on a group. When set to zero, no maximum is enforced.
    * @return maxForks
    **/
    @JsonProperty("max_forks")
    public Integer getMaxForks() {
        return maxForks;
    }

    /**
     * Set maxForks
     **/
    public void setMaxForks(Integer maxForks) {
        this.maxForks = maxForks;
    }

    public InstanceGroupsInstanceGroupsCreateRequest maxForks(Integer maxForks) {
        this.maxForks = maxForks;
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

    public InstanceGroupsInstanceGroupsCreateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get podSpecOverride
    * @return podSpecOverride
    **/
    @JsonProperty("pod_spec_override")
    public String getPodSpecOverride() {
        return podSpecOverride;
    }

    /**
     * Set podSpecOverride
     **/
    public void setPodSpecOverride(String podSpecOverride) {
        this.podSpecOverride = podSpecOverride;
    }

    public InstanceGroupsInstanceGroupsCreateRequest podSpecOverride(String podSpecOverride) {
        this.podSpecOverride = podSpecOverride;
        return this;
    }

    /**
    * List of exact-match Instances that will be assigned to this group
    * @return policyInstanceList
    **/
    @JsonProperty("policy_instance_list")
    public List<String> getPolicyInstanceList() {
        return policyInstanceList;
    }

    /**
     * Set policyInstanceList
     **/
    public void setPolicyInstanceList(List<String> policyInstanceList) {
        this.policyInstanceList = policyInstanceList;
    }

    public InstanceGroupsInstanceGroupsCreateRequest policyInstanceList(List<String> policyInstanceList) {
        this.policyInstanceList = policyInstanceList;
        return this;
    }
    public InstanceGroupsInstanceGroupsCreateRequest addPolicyInstanceListItem(String policyInstanceListItem) {
        this.policyInstanceList.add(policyInstanceListItem);
        return this;
    }

    /**
    * Static minimum number of Instances that will be automatically assign to this group when new instances come online.
    * @return policyInstanceMinimum
    **/
    @JsonProperty("policy_instance_minimum")
    public Integer getPolicyInstanceMinimum() {
        return policyInstanceMinimum;
    }

    /**
     * Set policyInstanceMinimum
     **/
    public void setPolicyInstanceMinimum(Integer policyInstanceMinimum) {
        this.policyInstanceMinimum = policyInstanceMinimum;
    }

    public InstanceGroupsInstanceGroupsCreateRequest policyInstanceMinimum(Integer policyInstanceMinimum) {
        this.policyInstanceMinimum = policyInstanceMinimum;
        return this;
    }

    /**
    * Minimum percentage of all instances that will be automatically assigned to this group when new instances come online.
    * @return policyInstancePercentage
    **/
    @JsonProperty("policy_instance_percentage")
    public Integer getPolicyInstancePercentage() {
        return policyInstancePercentage;
    }

    /**
     * Set policyInstancePercentage
     **/
    public void setPolicyInstancePercentage(Integer policyInstancePercentage) {
        this.policyInstancePercentage = policyInstancePercentage;
    }

    public InstanceGroupsInstanceGroupsCreateRequest policyInstancePercentage(Integer policyInstancePercentage) {
        this.policyInstancePercentage = policyInstancePercentage;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceGroupsInstanceGroupsCreateRequest {\n");

        sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
        sb.append("    isContainerGroup: ").append(toIndentedString(isContainerGroup)).append("\n");
        sb.append("    maxConcurrentJobs: ").append(toIndentedString(maxConcurrentJobs)).append("\n");
        sb.append("    maxForks: ").append(toIndentedString(maxForks)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    podSpecOverride: ").append(toIndentedString(podSpecOverride)).append("\n");
        sb.append("    policyInstanceList: ").append(toIndentedString(policyInstanceList)).append("\n");
        sb.append("    policyInstanceMinimum: ").append(toIndentedString(policyInstanceMinimum)).append("\n");
        sb.append("    policyInstancePercentage: ").append(toIndentedString(policyInstancePercentage)).append("\n");
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