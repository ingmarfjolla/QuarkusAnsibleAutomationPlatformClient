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
public class OrganizationsOrganizationsCredentialsCreateRequest  {

    private Integer credentialType;
    private String description;
    private Object inputs;
    private String name;
    private Integer organization;

    /**
    * Specify the type of credential you want to create. Refer to the documentation for details on each type.
    * @return credentialType
    **/
    @JsonProperty("credential_type")
    public Integer getCredentialType() {
        return credentialType;
    }

    /**
     * Set credentialType
     **/
    public void setCredentialType(Integer credentialType) {
        this.credentialType = credentialType;
    }

    public OrganizationsOrganizationsCredentialsCreateRequest credentialType(Integer credentialType) {
        this.credentialType = credentialType;
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

    public OrganizationsOrganizationsCredentialsCreateRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
    * Enter inputs using either JSON or YAML syntax. Refer to the documentation for example syntax.
    * @return inputs
    **/
    @JsonProperty("inputs")
    public Object getInputs() {
        return inputs;
    }

    /**
     * Set inputs
     **/
    public void setInputs(Object inputs) {
        this.inputs = inputs;
    }

    public OrganizationsOrganizationsCredentialsCreateRequest inputs(Object inputs) {
        this.inputs = inputs;
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

    public OrganizationsOrganizationsCredentialsCreateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Inherit permissions from organization roles. If provided on creation, do not give either user or team.
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

    public OrganizationsOrganizationsCredentialsCreateRequest organization(Integer organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationsOrganizationsCredentialsCreateRequest {\n");

        sb.append("    credentialType: ").append(toIndentedString(credentialType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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