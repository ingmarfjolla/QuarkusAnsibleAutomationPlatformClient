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
public class InventoriesInventoriesPartialUpdateRequest  {

    private String description;
    private String hostFilter;
    private String kind;
    private String name;
    private Integer organization;
    private Boolean preventInstanceGroupFallback;
    private String variables;

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

    public InventoriesInventoriesPartialUpdateRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
    * Filter that will be applied to the hosts of this inventory.
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

    public InventoriesInventoriesPartialUpdateRequest hostFilter(String hostFilter) {
        this.hostFilter = hostFilter;
        return this;
    }

    /**
    * Kind of inventory being represented.
    * @return kind
    **/
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * Set kind
     **/
    public void setKind(String kind) {
        this.kind = kind;
    }

    public InventoriesInventoriesPartialUpdateRequest kind(String kind) {
        this.kind = kind;
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

    public InventoriesInventoriesPartialUpdateRequest name(String name) {
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

    public InventoriesInventoriesPartialUpdateRequest organization(Integer organization) {
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

    public InventoriesInventoriesPartialUpdateRequest preventInstanceGroupFallback(Boolean preventInstanceGroupFallback) {
        this.preventInstanceGroupFallback = preventInstanceGroupFallback;
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

    public InventoriesInventoriesPartialUpdateRequest variables(String variables) {
        this.variables = variables;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InventoriesInventoriesPartialUpdateRequest {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    hostFilter: ").append(toIndentedString(hostFilter)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    preventInstanceGroupFallback: ").append(toIndentedString(preventInstanceGroupFallback)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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