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
public class UsersUsersCredentialsCreateRequest  {

    private Integer credentialType;
    private String description;
    private Object inputs;
    private String name;
    private Integer user;

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

    public UsersUsersCredentialsCreateRequest credentialType(Integer credentialType) {
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

    public UsersUsersCredentialsCreateRequest description(String description) {
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

    public UsersUsersCredentialsCreateRequest inputs(Object inputs) {
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

    public UsersUsersCredentialsCreateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Write-only field used to add user to owner role. If provided, do not give either team or organization. Only valid for creation.
    * @return user
    **/
    @JsonProperty("user")
    public Integer getUser() {
        return user;
    }

    /**
     * Set user
     **/
    public void setUser(Integer user) {
        this.user = user;
    }

    public UsersUsersCredentialsCreateRequest user(Integer user) {
        this.user = user;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsersUsersCredentialsCreateRequest {\n");

        sb.append("    credentialType: ").append(toIndentedString(credentialType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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