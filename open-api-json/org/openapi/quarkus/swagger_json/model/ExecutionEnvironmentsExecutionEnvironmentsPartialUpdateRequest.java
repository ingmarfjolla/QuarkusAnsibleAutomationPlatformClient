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
public class ExecutionEnvironmentsExecutionEnvironmentsPartialUpdateRequest  {

    private Integer credential;
    private String description;
    private String image;
    private String name;
    private Integer organization;
    private String pull;

    /**
    * Get credential
    * @return credential
    **/
    @JsonProperty("credential")
    public Integer getCredential() {
        return credential;
    }

    /**
     * Set credential
     **/
    public void setCredential(Integer credential) {
        this.credential = credential;
    }

    public ExecutionEnvironmentsExecutionEnvironmentsPartialUpdateRequest credential(Integer credential) {
        this.credential = credential;
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

    public ExecutionEnvironmentsExecutionEnvironmentsPartialUpdateRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
    * The full image location, including the container registry, image name, and version tag.
    * @return image
    **/
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * Set image
     **/
    public void setImage(String image) {
        this.image = image;
    }

    public ExecutionEnvironmentsExecutionEnvironmentsPartialUpdateRequest image(String image) {
        this.image = image;
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

    public ExecutionEnvironmentsExecutionEnvironmentsPartialUpdateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The organization used to determine access to this execution environment.
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

    public ExecutionEnvironmentsExecutionEnvironmentsPartialUpdateRequest organization(Integer organization) {
        this.organization = organization;
        return this;
    }

    /**
    * Pull image before running?
    * @return pull
    **/
    @JsonProperty("pull")
    public String getPull() {
        return pull;
    }

    /**
     * Set pull
     **/
    public void setPull(String pull) {
        this.pull = pull;
    }

    public ExecutionEnvironmentsExecutionEnvironmentsPartialUpdateRequest pull(String pull) {
        this.pull = pull;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecutionEnvironmentsExecutionEnvironmentsPartialUpdateRequest {\n");

        sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    pull: ").append(toIndentedString(pull)).append("\n");
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