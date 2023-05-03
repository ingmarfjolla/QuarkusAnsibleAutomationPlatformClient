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
public class OrganizationsOrganizationsAdminsCreateRequest  {

    private String email;
    private String firstName;
    private Boolean isSuperuser;
    private Boolean isSystemAuditor;
    private String lastName;
    private String password;
    private String username;

    /**
    * Get email
    * @return email
    **/
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Set email
     **/
    public void setEmail(String email) {
        this.email = email;
    }

    public OrganizationsOrganizationsAdminsCreateRequest email(String email) {
        this.email = email;
        return this;
    }

    /**
    * Get firstName
    * @return firstName
    **/
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set firstName
     **/
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public OrganizationsOrganizationsAdminsCreateRequest firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
    * Designates that this user has all permissions without explicitly assigning them.
    * @return isSuperuser
    **/
    @JsonProperty("is_superuser")
    public Boolean getIsSuperuser() {
        return isSuperuser;
    }

    /**
     * Set isSuperuser
     **/
    public void setIsSuperuser(Boolean isSuperuser) {
        this.isSuperuser = isSuperuser;
    }

    public OrganizationsOrganizationsAdminsCreateRequest isSuperuser(Boolean isSuperuser) {
        this.isSuperuser = isSuperuser;
        return this;
    }

    /**
    * Get isSystemAuditor
    * @return isSystemAuditor
    **/
    @JsonProperty("is_system_auditor")
    public Boolean getIsSystemAuditor() {
        return isSystemAuditor;
    }

    /**
     * Set isSystemAuditor
     **/
    public void setIsSystemAuditor(Boolean isSystemAuditor) {
        this.isSystemAuditor = isSystemAuditor;
    }

    public OrganizationsOrganizationsAdminsCreateRequest isSystemAuditor(Boolean isSystemAuditor) {
        this.isSystemAuditor = isSystemAuditor;
        return this;
    }

    /**
    * Get lastName
    * @return lastName
    **/
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     * Set lastName
     **/
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public OrganizationsOrganizationsAdminsCreateRequest lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
    * Field used to change the password.
    * @return password
    **/
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    /**
     * Set password
     **/
    public void setPassword(String password) {
        this.password = password;
    }

    public OrganizationsOrganizationsAdminsCreateRequest password(String password) {
        this.password = password;
        return this;
    }

    /**
    * Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only.
    * @return username
    **/
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Set username
     **/
    public void setUsername(String username) {
        this.username = username;
    }

    public OrganizationsOrganizationsAdminsCreateRequest username(String username) {
        this.username = username;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationsOrganizationsAdminsCreateRequest {\n");

        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    isSuperuser: ").append(toIndentedString(isSuperuser)).append("\n");
        sb.append("    isSystemAuditor: ").append(toIndentedString(isSystemAuditor)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
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