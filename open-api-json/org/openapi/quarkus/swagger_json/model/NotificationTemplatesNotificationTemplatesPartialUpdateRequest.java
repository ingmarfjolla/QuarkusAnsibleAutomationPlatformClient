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
public class NotificationTemplatesNotificationTemplatesPartialUpdateRequest  {

    private String description;
    private Object messages;
    private String name;
    private Object notificationConfiguration;
    private String notificationType;
    private Integer organization;

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

    public NotificationTemplatesNotificationTemplatesPartialUpdateRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
    * Optional custom messages for notification template.
    * @return messages
    **/
    @JsonProperty("messages")
    public Object getMessages() {
        return messages;
    }

    /**
     * Set messages
     **/
    public void setMessages(Object messages) {
        this.messages = messages;
    }

    public NotificationTemplatesNotificationTemplatesPartialUpdateRequest messages(Object messages) {
        this.messages = messages;
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

    public NotificationTemplatesNotificationTemplatesPartialUpdateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get notificationConfiguration
    * @return notificationConfiguration
    **/
    @JsonProperty("notification_configuration")
    public Object getNotificationConfiguration() {
        return notificationConfiguration;
    }

    /**
     * Set notificationConfiguration
     **/
    public void setNotificationConfiguration(Object notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }

    public NotificationTemplatesNotificationTemplatesPartialUpdateRequest notificationConfiguration(Object notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
        return this;
    }

    /**
    * Get notificationType
    * @return notificationType
    **/
    @JsonProperty("notification_type")
    public String getNotificationType() {
        return notificationType;
    }

    /**
     * Set notificationType
     **/
    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public NotificationTemplatesNotificationTemplatesPartialUpdateRequest notificationType(String notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /**
    * Get organization
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

    public NotificationTemplatesNotificationTemplatesPartialUpdateRequest organization(Integer organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotificationTemplatesNotificationTemplatesPartialUpdateRequest {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    notificationConfiguration: ").append(toIndentedString(notificationConfiguration)).append("\n");
        sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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