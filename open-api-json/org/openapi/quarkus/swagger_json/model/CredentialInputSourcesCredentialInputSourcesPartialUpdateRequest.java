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
public class CredentialInputSourcesCredentialInputSourcesPartialUpdateRequest  {

    private String description;
    private String inputFieldName;
    private Object metadata;
    private Integer sourceCredential;
    private Integer targetCredential;

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

    public CredentialInputSourcesCredentialInputSourcesPartialUpdateRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
    * Get inputFieldName
    * @return inputFieldName
    **/
    @JsonProperty("input_field_name")
    public String getInputFieldName() {
        return inputFieldName;
    }

    /**
     * Set inputFieldName
     **/
    public void setInputFieldName(String inputFieldName) {
        this.inputFieldName = inputFieldName;
    }

    public CredentialInputSourcesCredentialInputSourcesPartialUpdateRequest inputFieldName(String inputFieldName) {
        this.inputFieldName = inputFieldName;
        return this;
    }

    /**
    * Get metadata
    * @return metadata
    **/
    @JsonProperty("metadata")
    public Object getMetadata() {
        return metadata;
    }

    /**
     * Set metadata
     **/
    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    public CredentialInputSourcesCredentialInputSourcesPartialUpdateRequest metadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
    * Get sourceCredential
    * @return sourceCredential
    **/
    @JsonProperty("source_credential")
    public Integer getSourceCredential() {
        return sourceCredential;
    }

    /**
     * Set sourceCredential
     **/
    public void setSourceCredential(Integer sourceCredential) {
        this.sourceCredential = sourceCredential;
    }

    public CredentialInputSourcesCredentialInputSourcesPartialUpdateRequest sourceCredential(Integer sourceCredential) {
        this.sourceCredential = sourceCredential;
        return this;
    }

    /**
    * Get targetCredential
    * @return targetCredential
    **/
    @JsonProperty("target_credential")
    public Integer getTargetCredential() {
        return targetCredential;
    }

    /**
     * Set targetCredential
     **/
    public void setTargetCredential(Integer targetCredential) {
        this.targetCredential = targetCredential;
    }

    public CredentialInputSourcesCredentialInputSourcesPartialUpdateRequest targetCredential(Integer targetCredential) {
        this.targetCredential = targetCredential;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CredentialInputSourcesCredentialInputSourcesPartialUpdateRequest {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    inputFieldName: ").append(toIndentedString(inputFieldName)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    sourceCredential: ").append(toIndentedString(sourceCredential)).append("\n");
        sb.append("    targetCredential: ").append(toIndentedString(targetCredential)).append("\n");
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