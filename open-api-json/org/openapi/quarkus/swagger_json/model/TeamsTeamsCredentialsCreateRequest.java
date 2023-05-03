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
public class TeamsTeamsCredentialsCreateRequest  {

    private Integer credentialType;
    private String description;
    private Object inputs;
    private String name;
    private Integer team;

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

    public TeamsTeamsCredentialsCreateRequest credentialType(Integer credentialType) {
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

    public TeamsTeamsCredentialsCreateRequest description(String description) {
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

    public TeamsTeamsCredentialsCreateRequest inputs(Object inputs) {
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

    public TeamsTeamsCredentialsCreateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Write-only field used to add team to owner role. If provided, do not give either user or organization. Only valid for creation.
    * @return team
    **/
    @JsonProperty("team")
    public Integer getTeam() {
        return team;
    }

    /**
     * Set team
     **/
    public void setTeam(Integer team) {
        this.team = team;
    }

    public TeamsTeamsCredentialsCreateRequest team(Integer team) {
        this.team = team;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TeamsTeamsCredentialsCreateRequest {\n");

        sb.append("    credentialType: ").append(toIndentedString(credentialType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    team: ").append(toIndentedString(team)).append("\n");
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