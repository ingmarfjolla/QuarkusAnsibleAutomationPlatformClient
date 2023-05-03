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
public class InventoriesConstructedInventoriesPartialUpdateRequest  {

    private String description;
    private String limit;
    private String name;
    private Integer organization;
    private Boolean preventInstanceGroupFallback;
    private String sourceVars;
    private Integer updateCacheTimeout;
    private String variables;
    private Integer verbosity;

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

    public InventoriesConstructedInventoriesPartialUpdateRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
    * The limit to restrict the returned hosts for the related auto-created inventory source, special to constructed inventory.
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

    public InventoriesConstructedInventoriesPartialUpdateRequest limit(String limit) {
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

    public InventoriesConstructedInventoriesPartialUpdateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Organization containing this inventory.
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

    public InventoriesConstructedInventoriesPartialUpdateRequest organization(Integer organization) {
        this.organization = organization;
        return this;
    }

    /**
    * If enabled, the inventory will prevent adding any organization instance groups to the list of preferred instances groups to run associated job templates on.If this setting is enabled and you provided an empty list, the global instance groups will be applied.
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

    public InventoriesConstructedInventoriesPartialUpdateRequest preventInstanceGroupFallback(Boolean preventInstanceGroupFallback) {
        this.preventInstanceGroupFallback = preventInstanceGroupFallback;
        return this;
    }

    /**
    * The source_vars for the related auto-created inventory source, special to constructed inventory.
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

    public InventoriesConstructedInventoriesPartialUpdateRequest sourceVars(String sourceVars) {
        this.sourceVars = sourceVars;
        return this;
    }

    /**
    * The cache timeout for the related auto-created inventory source, special to constructed inventory
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

    public InventoriesConstructedInventoriesPartialUpdateRequest updateCacheTimeout(Integer updateCacheTimeout) {
        this.updateCacheTimeout = updateCacheTimeout;
        return this;
    }

    /**
    * Inventory variables in JSON or YAML format.
    * @return variables
    **/
    @JsonProperty("variables")
    public String getVariables() {
        return variables;
    }

    /**
     * Set variables
     **/
    public void setVariables(String variables) {
        this.variables = variables;
    }

    public InventoriesConstructedInventoriesPartialUpdateRequest variables(String variables) {
        this.variables = variables;
        return this;
    }

    /**
    * The verbosity level for the related auto-created inventory source, special to constructed inventory
    * @return verbosity
    **/
    @JsonProperty("verbosity")
    public Integer getVerbosity() {
        return verbosity;
    }

    /**
     * Set verbosity
     **/
    public void setVerbosity(Integer verbosity) {
        this.verbosity = verbosity;
    }

    public InventoriesConstructedInventoriesPartialUpdateRequest verbosity(Integer verbosity) {
        this.verbosity = verbosity;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InventoriesConstructedInventoriesPartialUpdateRequest {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    preventInstanceGroupFallback: ").append(toIndentedString(preventInstanceGroupFallback)).append("\n");
        sb.append("    sourceVars: ").append(toIndentedString(sourceVars)).append("\n");
        sb.append("    updateCacheTimeout: ").append(toIndentedString(updateCacheTimeout)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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