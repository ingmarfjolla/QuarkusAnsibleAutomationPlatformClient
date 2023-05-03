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
public class JobsJobsRelaunchCreateRequest  {

    private String credentialPasswords;
    private String hosts;

    /**
    * Get credentialPasswords
    * @return credentialPasswords
    **/
    @JsonProperty("credential_passwords")
    public String getCredentialPasswords() {
        return credentialPasswords;
    }

    /**
     * Set credentialPasswords
     **/
    public void setCredentialPasswords(String credentialPasswords) {
        this.credentialPasswords = credentialPasswords;
    }

    public JobsJobsRelaunchCreateRequest credentialPasswords(String credentialPasswords) {
        this.credentialPasswords = credentialPasswords;
        return this;
    }

    /**
    * Get hosts
    * @return hosts
    **/
    @JsonProperty("hosts")
    public String getHosts() {
        return hosts;
    }

    /**
     * Set hosts
     **/
    public void setHosts(String hosts) {
        this.hosts = hosts;
    }

    public JobsJobsRelaunchCreateRequest hosts(String hosts) {
        this.hosts = hosts;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobsJobsRelaunchCreateRequest {\n");

        sb.append("    credentialPasswords: ").append(toIndentedString(credentialPasswords)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
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