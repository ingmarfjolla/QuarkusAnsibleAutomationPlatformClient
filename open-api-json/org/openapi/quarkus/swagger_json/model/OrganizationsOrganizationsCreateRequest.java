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
public class OrganizationsOrganizationsCreateRequest  {

    private Integer defaultEnvironment;
    private String description;
    private Integer maxHosts;
    private String name;

    /**
    * The default execution environment for jobs run by this organization.
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

    public OrganizationsOrganizationsCreateRequest defaultEnvironment(Integer defaultEnvironment) {
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

    public OrganizationsOrganizationsCreateRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
    * Maximum number of hosts allowed to be managed by this organization.
    * @return maxHosts
    **/
    @JsonProperty("max_hosts")
    public Integer getMaxHosts() {
        return maxHosts;
    }

    /**
     * Set maxHosts
     **/
    public void setMaxHosts(Integer maxHosts) {
        this.maxHosts = maxHosts;
    }

    public OrganizationsOrganizationsCreateRequest maxHosts(Integer maxHosts) {
        this.maxHosts = maxHosts;
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

    public OrganizationsOrganizationsCreateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationsOrganizationsCreateRequest {\n");

        sb.append("    defaultEnvironment: ").append(toIndentedString(defaultEnvironment)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    maxHosts: ").append(toIndentedString(maxHosts)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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