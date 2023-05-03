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
public class WorkflowApprovalTemplatesWorkflowApprovalTemplatesPartialUpdateRequest  {

    private String description;
    private Integer executionEnvironment;
    private String name;
    private Integer timeout;

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

    public WorkflowApprovalTemplatesWorkflowApprovalTemplatesPartialUpdateRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
    * The container image to be used for execution.
    * @return executionEnvironment
    **/
    @JsonProperty("execution_environment")
    public Integer getExecutionEnvironment() {
        return executionEnvironment;
    }

    /**
     * Set executionEnvironment
     **/
    public void setExecutionEnvironment(Integer executionEnvironment) {
        this.executionEnvironment = executionEnvironment;
    }

    public WorkflowApprovalTemplatesWorkflowApprovalTemplatesPartialUpdateRequest executionEnvironment(Integer executionEnvironment) {
        this.executionEnvironment = executionEnvironment;
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

    public WorkflowApprovalTemplatesWorkflowApprovalTemplatesPartialUpdateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The amount of time (in seconds) before the approval node expires and fails.
    * @return timeout
    **/
    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Set timeout
     **/
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public WorkflowApprovalTemplatesWorkflowApprovalTemplatesPartialUpdateRequest timeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowApprovalTemplatesWorkflowApprovalTemplatesPartialUpdateRequest {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    executionEnvironment: ").append(toIndentedString(executionEnvironment)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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