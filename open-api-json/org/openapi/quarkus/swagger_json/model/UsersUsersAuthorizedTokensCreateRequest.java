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
public class UsersUsersAuthorizedTokensCreateRequest  {

    private Integer application;
    private String description;
    private String scope;

    /**
    * Get application
    * @return application
    **/
    @JsonProperty("application")
    public Integer getApplication() {
        return application;
    }

    /**
     * Set application
     **/
    public void setApplication(Integer application) {
        this.application = application;
    }

    public UsersUsersAuthorizedTokensCreateRequest application(Integer application) {
        this.application = application;
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

    public UsersUsersAuthorizedTokensCreateRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
    * Allowed scopes, further restricts user's permissions. Must be a simple space-separated string with allowed scopes ['read', 'write'].
    * @return scope
    **/
    @JsonProperty("scope")
    public String getScope() {
        return scope;
    }

    /**
     * Set scope
     **/
    public void setScope(String scope) {
        this.scope = scope;
    }

    public UsersUsersAuthorizedTokensCreateRequest scope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsersUsersAuthorizedTokensCreateRequest {\n");

        sb.append("    application: ").append(toIndentedString(application)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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