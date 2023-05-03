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
public class AuthenticationApplicationsCreate0Request  {

    private String authorizationGrantType;
    private String clientType;
    private String description;
    private String name;
    private Integer organization;
    private String redirectUris;
    private Boolean skipAuthorization;

    /**
    * The Grant type the user must use for acquire tokens for this application.
    * @return authorizationGrantType
    **/
    @JsonProperty("authorization_grant_type")
    public String getAuthorizationGrantType() {
        return authorizationGrantType;
    }

    /**
     * Set authorizationGrantType
     **/
    public void setAuthorizationGrantType(String authorizationGrantType) {
        this.authorizationGrantType = authorizationGrantType;
    }

    public AuthenticationApplicationsCreate0Request authorizationGrantType(String authorizationGrantType) {
        this.authorizationGrantType = authorizationGrantType;
        return this;
    }

    /**
    * Set to Public or Confidential depending on how secure the client device is.
    * @return clientType
    **/
    @JsonProperty("client_type")
    public String getClientType() {
        return clientType;
    }

    /**
     * Set clientType
     **/
    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public AuthenticationApplicationsCreate0Request clientType(String clientType) {
        this.clientType = clientType;
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

    public AuthenticationApplicationsCreate0Request description(String description) {
        this.description = description;
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

    public AuthenticationApplicationsCreate0Request name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Organization containing this application.
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

    public AuthenticationApplicationsCreate0Request organization(Integer organization) {
        this.organization = organization;
        return this;
    }

    /**
    * Allowed URIs list, space separated
    * @return redirectUris
    **/
    @JsonProperty("redirect_uris")
    public String getRedirectUris() {
        return redirectUris;
    }

    /**
     * Set redirectUris
     **/
    public void setRedirectUris(String redirectUris) {
        this.redirectUris = redirectUris;
    }

    public AuthenticationApplicationsCreate0Request redirectUris(String redirectUris) {
        this.redirectUris = redirectUris;
        return this;
    }

    /**
    * Set True to skip authorization step for completely trusted applications.
    * @return skipAuthorization
    **/
    @JsonProperty("skip_authorization")
    public Boolean getSkipAuthorization() {
        return skipAuthorization;
    }

    /**
     * Set skipAuthorization
     **/
    public void setSkipAuthorization(Boolean skipAuthorization) {
        this.skipAuthorization = skipAuthorization;
    }

    public AuthenticationApplicationsCreate0Request skipAuthorization(Boolean skipAuthorization) {
        this.skipAuthorization = skipAuthorization;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthenticationApplicationsCreate0Request {\n");

        sb.append("    authorizationGrantType: ").append(toIndentedString(authorizationGrantType)).append("\n");
        sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
        sb.append("    skipAuthorization: ").append(toIndentedString(skipAuthorization)).append("\n");
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