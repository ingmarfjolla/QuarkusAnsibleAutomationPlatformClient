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
public class CredentialTypesCredentialTypesUpdateRequest  {

    private String description;
    private Object injectors;
    private Object inputs;
    private String kind;
    private String name;

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

    public CredentialTypesCredentialTypesUpdateRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
    * Enter injectors using either JSON or YAML syntax. Refer to the documentation for example syntax.
    * @return injectors
    **/
    @JsonProperty("injectors")
    public Object getInjectors() {
        return injectors;
    }

    /**
     * Set injectors
     **/
    public void setInjectors(Object injectors) {
        this.injectors = injectors;
    }

    public CredentialTypesCredentialTypesUpdateRequest injectors(Object injectors) {
        this.injectors = injectors;
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

    public CredentialTypesCredentialTypesUpdateRequest inputs(Object inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
    * Get kind
    * @return kind
    **/
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * Set kind
     **/
    public void setKind(String kind) {
        this.kind = kind;
    }

    public CredentialTypesCredentialTypesUpdateRequest kind(String kind) {
        this.kind = kind;
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

    public CredentialTypesCredentialTypesUpdateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CredentialTypesCredentialTypesUpdateRequest {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    injectors: ").append(toIndentedString(injectors)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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