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
public class InventoriesInventoriesVariableDataUpdateRequest  {

    private String variables;

    /**
    * Inventory variables in JSON or YAML format.
    * @return variables
    **/
    @JsonProperty("variables")
    public String getVariables() {
        return variables;
    }

    /**
     * Set variables
     **/
    public void setVariables(String variables) {
        this.variables = variables;
    }

    public InventoriesInventoriesVariableDataUpdateRequest variables(String variables) {
        this.variables = variables;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InventoriesInventoriesVariableDataUpdateRequest {\n");

        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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