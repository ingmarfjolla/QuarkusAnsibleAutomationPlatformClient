package org.openapi.quarkus.swagger_json.api;


import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider; 
import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.openapi.quarkus.swagger_json.api.auth.CompositeAuthenticationProvider;
import org.openapi.quarkus.swagger_json.api.auth.AuthenticationPropagationHeadersFactory;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import jakarta.enterprise.context.ApplicationScoped;

import io.quarkiverse.openapi.generator.annotations.GeneratedClass;
import io.quarkiverse.openapi.generator.annotations.GeneratedMethod;
import io.quarkiverse.openapi.generator.annotations.GeneratedParam;

/**
  * Ansible Automation Platform controller API
  * <p/>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
  */
@Path("/api/v2/notifications")
@RegisterRestClient(baseUri="https://null/", configKey="swagger_json")
@GeneratedClass(value="swagger.json", tag = "Notifications")
@RegisterProvider(CompositeAuthenticationProvider.class)
@RegisterClientHeaders(AuthenticationPropagationHeadersFactory.class)
@ApplicationScoped
public interface NotificationsApi {

    /**
     *  List Notifications
     *
     *  Make a GET request to this resource to retrieve the list of notifications.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of notifications found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more notification records.    ## Results  Each notification data structure includes the following fields:  * `id`: Database ID for this notification. (integer) * `type`: Data type for this notification. (choice) * `url`: URL for this notification. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this notification was created. (datetime) * `modified`: Timestamp when this notification was last modified. (datetime) * `notification_template`:  (id) * `error`:  (string) * `status`:  (choice)     - `pending`: Pending     - `successful`: Successful     - `failed`: Failed * `notifications_sent`:  (integer) * `notification_type`:  (choice)     - `email`: Email     - `grafana`: Grafana     - `irc`: IRC     - `mattermost`: Mattermost     - `pagerduty`: Pagerduty     - `rocketchat`: Rocket.Chat     - `slack`: Slack     - `twilio`: Twilio     - `webhook`: Webhook * `recipients`:  (string) * `subject`:  (string) * `body`: Notification body (json)    ## Sorting  To specify that notifications are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @GeneratedMethod ("Notifications_notifications_list")
    public void notificationsNotificationsList(
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  Retrieve a Notification
     *
     *  Make GET request to this resource to retrieve a single notification record containing the following fields:  * `id`: Database ID for this notification. (integer) * `type`: Data type for this notification. (choice) * `url`: URL for this notification. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this notification was created. (datetime) * `modified`: Timestamp when this notification was last modified. (datetime) * `notification_template`:  (id) * `error`:  (string) * `status`:  (choice)     - `pending`: Pending     - `successful`: Successful     - `failed`: Failed * `notifications_sent`:  (integer) * `notification_type`:  (choice)     - `email`: Email     - `grafana`: Grafana     - `irc`: IRC     - `mattermost`: Mattermost     - `pagerduty`: Pagerduty     - `rocketchat`: Rocket.Chat     - `slack`: Slack     - `twilio`: Twilio     - `webhook`: Webhook * `recipients`:  (string) * `subject`:  (string) * `body`: Notification body (json)
     *
     */
    @GET
    @Path("/{id}/")
    @GeneratedMethod ("Notifications_notifications_read")
    public void notificationsNotificationsRead(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

}
