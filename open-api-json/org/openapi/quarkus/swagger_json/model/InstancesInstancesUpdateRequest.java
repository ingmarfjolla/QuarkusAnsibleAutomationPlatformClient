package org.openapi.quarkus.swagger_json.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InstancesInstancesUpdateRequest  {

    private BigDecimal capacityAdjustment;
    private Boolean enabled;
    private String hostname;
    private Integer listenerPort;
    private Boolean managedByPolicy;
    private String nodeState;
    private String nodeType;

    /**
    * Get capacityAdjustment
    * @return capacityAdjustment
    **/
    @JsonProperty("capacity_adjustment")
    public BigDecimal getCapacityAdjustment() {
        return capacityAdjustment;
    }

    /**
     * Set capacityAdjustment
     **/
    public void setCapacityAdjustment(BigDecimal capacityAdjustment) {
        this.capacityAdjustment = capacityAdjustment;
    }

    public InstancesInstancesUpdateRequest capacityAdjustment(BigDecimal capacityAdjustment) {
        this.capacityAdjustment = capacityAdjustment;
        return this;
    }

    /**
    * Get enabled
    * @return enabled
    **/
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Set enabled
     **/
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public InstancesInstancesUpdateRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
    * Get hostname
    * @return hostname
    **/
    @JsonProperty("hostname")
    public String getHostname() {
        return hostname;
    }

    /**
     * Set hostname
     **/
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public InstancesInstancesUpdateRequest hostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
    * Port that Receptor will listen for incoming connections on.
    * @return listenerPort
    **/
    @JsonProperty("listener_port")
    public Integer getListenerPort() {
        return listenerPort;
    }

    /**
     * Set listenerPort
     **/
    public void setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
    }

    public InstancesInstancesUpdateRequest listenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    /**
    * Get managedByPolicy
    * @return managedByPolicy
    **/
    @JsonProperty("managed_by_policy")
    public Boolean getManagedByPolicy() {
        return managedByPolicy;
    }

    /**
     * Set managedByPolicy
     **/
    public void setManagedByPolicy(Boolean managedByPolicy) {
        this.managedByPolicy = managedByPolicy;
    }

    public InstancesInstancesUpdateRequest managedByPolicy(Boolean managedByPolicy) {
        this.managedByPolicy = managedByPolicy;
        return this;
    }

    /**
    * Indicates the current life cycle stage of this instance.
    * @return nodeState
    **/
    @JsonProperty("node_state")
    public String getNodeState() {
        return nodeState;
    }

    /**
     * Set nodeState
     **/
    public void setNodeState(String nodeState) {
        this.nodeState = nodeState;
    }

    public InstancesInstancesUpdateRequest nodeState(String nodeState) {
        this.nodeState = nodeState;
        return this;
    }

    /**
    * Role that this node plays in the mesh.
    * @return nodeType
    **/
    @JsonProperty("node_type")
    public String getNodeType() {
        return nodeType;
    }

    /**
     * Set nodeType
     **/
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public InstancesInstancesUpdateRequest nodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstancesInstancesUpdateRequest {\n");

        sb.append("    capacityAdjustment: ").append(toIndentedString(capacityAdjustment)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    listenerPort: ").append(toIndentedString(listenerPort)).append("\n");
        sb.append("    managedByPolicy: ").append(toIndentedString(managedByPolicy)).append("\n");
        sb.append("    nodeState: ").append(toIndentedString(nodeState)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
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