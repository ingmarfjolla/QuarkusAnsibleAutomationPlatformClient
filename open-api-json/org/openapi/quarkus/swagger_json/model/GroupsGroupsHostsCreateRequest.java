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
public class GroupsGroupsHostsCreateRequest  {

    private String description;
    private Boolean enabled;
    private String instanceId;
    private Integer inventory;
    private String name;
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

    public GroupsGroupsHostsCreateRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
    * Is this host online and available for running jobs?
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

    public GroupsGroupsHostsCreateRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
    * The value used by the remote inventory source to uniquely identify the host
    * @return instanceId
    **/
    @JsonProperty("instance_id")
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Set instanceId
     **/
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public GroupsGroupsHostsCreateRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
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

    public GroupsGroupsHostsCreateRequest inventory(Integer inventory) {
        this.inventory = inventory;
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

    public GroupsGroupsHostsCreateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Host variables in JSON or YAML format.
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

    public GroupsGroupsHostsCreateRequest variables(String variables) {
        this.variables = variables;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupsGroupsHostsCreateRequest {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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