package org.openapi.quarkus.swagger_json.api;

import org.openapi.quarkus.swagger_json.model.InventorySourcesInventorySourcesNotificationTemplatesErrorCreateRequest;
import org.openapi.quarkus.swagger_json.model.InventorySourcesInventorySourcesSchedulesCreateRequest;

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
@Path("/api/v2/system_job_templates")
@RegisterRestClient(baseUri="https://null/", configKey="swagger_json")
@GeneratedClass(value="swagger.json", tag = "SystemJobTemplates")
@RegisterProvider(CompositeAuthenticationProvider.class)
@RegisterClientHeaders(AuthenticationPropagationHeadersFactory.class)
@ApplicationScoped
public interface SystemJobTemplatesApi {

    /**
     *  List System Jobs for a System Job Template
     *
     *  Make a GET request to this resource to retrieve a list of system jobs associated with the selected system job template.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of system jobs found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more system job records.    ## Results  Each system job data structure includes the following fields:  * `id`: Database ID for this system job. (integer) * `type`: Data type for this system job. (choice) * `url`: URL for this system job. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this system job was created. (datetime) * `modified`: Timestamp when this system job was last modified. (datetime) * `name`: Name of this system job. (string) * `description`: Optional description of this system job. (string) * `unified_job_template`:  (id) * `launch_type`:  (choice)     - `manual`: Manual     - `relaunch`: Relaunch     - `callback`: Callback     - `scheduled`: Scheduled     - `dependency`: Dependency     - `workflow`: Workflow     - `webhook`: Webhook     - `sync`: Sync     - `scm`: SCM Update * `status`:  (choice)     - `new`: New     - `pending`: Pending     - `waiting`: Waiting     - `running`: Running     - `successful`: Successful     - `failed`: Failed     - `error`: Error     - `canceled`: Canceled * `execution_environment`: The container image to be used for execution. (id) * `failed`:  (boolean) * `started`: The date and time the job was queued for starting. (datetime) * `finished`: The date and time the job finished execution. (datetime) * `canceled_on`: The date and time when the cancel request was sent. (datetime) * `elapsed`: Elapsed time in seconds that the job ran. (decimal) * `job_explanation`: A status field to indicate the state of the job if it wasn&#x27;t able to run and capture stdout (string) * `execution_node`: The node the job executed on. (string) * `launched_by`:  (field) * `work_unit_id`: The Receptor work unit ID associated with this job. (string) * `system_job_template`:  (id) * `job_type`:  (choice)     - `\"\"`: ---------     - `cleanup_jobs`: Remove jobs older than a certain number of days     - `cleanup_activitystream`: Remove activity stream entries older than a certain number of days     - `cleanup_sessions`: Removes expired browser sessions from the database     - `cleanup_tokens`: Removes expired OAuth 2 access tokens and refresh tokens * `extra_vars`:  (string) * `result_stdout`:  (field)    ## Sorting  To specify that system jobs are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @Path("/{id}/jobs/")
    @GeneratedMethod ("System Job Templates_system_job_templates_jobs_list")
    public void systemJobTemplatesSystemJobTemplatesJobsList(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     * Launch a Job Template
     *
     *  Make a POST request to this resource to launch the system job template.  Variables specified inside of the parameter `extra_vars` are passed to the system job task as command line parameters. These tasks can be run manually on the host system via the `awx-manage` command.  For example on `cleanup_jobs` and `cleanup_activitystream`:  `{\"extra_vars\": {\"days\": 30}}`  Which will act on data older than 30 days.  For `cleanup_activitystream` and `cleanup_jobs` commands, providing `\"dry_run\": true` inside of `extra_vars` will show items that will be removed without deleting them.  Each individual system job task has its own default values, which are applicable either when running it from the command line or launching its system job template with empty `extra_vars`.   - Defaults for `cleanup_activitystream`: days=90  - Defaults for `cleanup_jobs`: days=90  If successful, the response status code will be 202.  If the job cannot be launched, a 405 status code will be returned.
     *
     */
    @POST
    @Path("/{id}/launch/")
    @GeneratedMethod ("System Job Templates_system_job_templates_launch_create")
    public void systemJobTemplatesSystemJobTemplatesLaunchCreate(
        @GeneratedParam("id") @PathParam("id") String id
    );

    /**
     * Launch a Job Template
     *
     *  Make a POST request to this resource to launch the system job template.  Variables specified inside of the parameter `extra_vars` are passed to the system job task as command line parameters. These tasks can be run manually on the host system via the `awx-manage` command.  For example on `cleanup_jobs` and `cleanup_activitystream`:  `{\"extra_vars\": {\"days\": 30}}`  Which will act on data older than 30 days.  For `cleanup_activitystream` and `cleanup_jobs` commands, providing `\"dry_run\": true` inside of `extra_vars` will show items that will be removed without deleting them.  Each individual system job task has its own default values, which are applicable either when running it from the command line or launching its system job template with empty `extra_vars`.   - Defaults for `cleanup_activitystream`: days=90  - Defaults for `cleanup_jobs`: days=90  If successful, the response status code will be 202.  If the job cannot be launched, a 405 status code will be returned.
     *
     */
    @GET
    @Path("/{id}/launch/")
    @GeneratedMethod ("System Job Templates_system_job_templates_launch_list")
    public void systemJobTemplatesSystemJobTemplatesLaunchList(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  List System Job Templates
     *
     *  Make a GET request to this resource to retrieve the list of system job templates.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of system job templates found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more system job template records.    ## Results  Each system job template data structure includes the following fields:  * `id`: Database ID for this system job template. (integer) * `type`: Data type for this system job template. (choice) * `url`: URL for this system job template. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this system job template was created. (datetime) * `modified`: Timestamp when this system job template was last modified. (datetime) * `name`: Name of this system job template. (string) * `description`: Optional description of this system job template. (string) * `last_job_run`:  (datetime) * `last_job_failed`:  (boolean) * `next_job_run`:  (datetime) * `status`:  (choice)     - `new`: New     - `pending`: Pending     - `waiting`: Waiting     - `running`: Running     - `successful`: Successful     - `failed`: Failed     - `error`: Error     - `canceled`: Canceled     - `never updated`: Never Updated     - `ok`: OK     - `missing`: Missing     - `none`: No External Source     - `updating`: Updating * `execution_environment`: The container image to be used for execution. (id) * `job_type`:  (choice)     - `\"\"`: ---------     - `cleanup_jobs`: Remove jobs older than a certain number of days     - `cleanup_activitystream`: Remove activity stream entries older than a certain number of days     - `cleanup_sessions`: Removes expired browser sessions from the database     - `cleanup_tokens`: Removes expired OAuth 2 access tokens and refresh tokens    ## Sorting  To specify that system job templates are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @GeneratedMethod ("System Job Templates_system_job_templates_list")
    public void systemJobTemplatesSystemJobTemplatesList(
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  Create a Notification Template for a System Job Template
     *
     *  Make a POST request to this resource with the following notification template fields to create a new notification template associated with this system job template.          * `name`: Name of this notification template. (string, required) * `description`: Optional description of this notification template. (string, default=`\"\"`) * `organization`:  (id, required) * `notification_type`:  (choice, required)     - `email`: Email     - `grafana`: Grafana     - `irc`: IRC     - `mattermost`: Mattermost     - `pagerduty`: Pagerduty     - `rocketchat`: Rocket.Chat     - `slack`: Slack     - `twilio`: Twilio     - `webhook`: Webhook * `notification_configuration`:  (json, default=`{}`) * `messages`: Optional custom messages for notification template. (json, default=`{&#x27;started&#x27;: None, &#x27;success&#x27;: None, &#x27;error&#x27;: None, &#x27;workflow_approval&#x27;: None}`)         # Add Notification Templates for a System Job Template:  Make a POST request to this resource with only an `id` field to associate an existing notification template with this system job template.  # Remove Notification Templates from this System Job Template:  Make a POST request to this resource with `id` and `disassociate` fields to remove the notification template from this system job template  without deleting the notification template.
     *
     */
    @POST
    @Path("/{id}/notification_templates_error/")
    @Consumes({"application/json"})
    @GeneratedMethod ("System Job Templates_system_job_templates_notification_templates_error_create")
    public void systemJobTemplatesSystemJobTemplatesNotificationTemplatesErrorCreate(
        @GeneratedParam("id") @PathParam("id") String id, 
        InventorySourcesInventorySourcesNotificationTemplatesErrorCreateRequest data
    );

    /**
     *  List Notification Templates for a System Job Template
     *
     *  Make a GET request to this resource to retrieve a list of notification templates associated with the selected system job template.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of notification templates found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more notification template records.    ## Results  Each notification template data structure includes the following fields:  * `id`: Database ID for this notification template. (integer) * `type`: Data type for this notification template. (choice) * `url`: URL for this notification template. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this notification template was created. (datetime) * `modified`: Timestamp when this notification template was last modified. (datetime) * `name`: Name of this notification template. (string) * `description`: Optional description of this notification template. (string) * `organization`:  (id) * `notification_type`:  (choice)     - `email`: Email     - `grafana`: Grafana     - `irc`: IRC     - `mattermost`: Mattermost     - `pagerduty`: Pagerduty     - `rocketchat`: Rocket.Chat     - `slack`: Slack     - `twilio`: Twilio     - `webhook`: Webhook * `notification_configuration`:  (json) * `messages`: Optional custom messages for notification template. (json)    ## Sorting  To specify that notification templates are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @Path("/{id}/notification_templates_error/")
    @GeneratedMethod ("System Job Templates_system_job_templates_notification_templates_error_list")
    public void systemJobTemplatesSystemJobTemplatesNotificationTemplatesErrorList(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  Create a Notification Template for a System Job Template
     *
     *  Make a POST request to this resource with the following notification template fields to create a new notification template associated with this system job template.          * `name`: Name of this notification template. (string, required) * `description`: Optional description of this notification template. (string, default=`\"\"`) * `organization`:  (id, required) * `notification_type`:  (choice, required)     - `email`: Email     - `grafana`: Grafana     - `irc`: IRC     - `mattermost`: Mattermost     - `pagerduty`: Pagerduty     - `rocketchat`: Rocket.Chat     - `slack`: Slack     - `twilio`: Twilio     - `webhook`: Webhook * `notification_configuration`:  (json, default=`{}`) * `messages`: Optional custom messages for notification template. (json, default=`{&#x27;started&#x27;: None, &#x27;success&#x27;: None, &#x27;error&#x27;: None, &#x27;workflow_approval&#x27;: None}`)         # Add Notification Templates for a System Job Template:  Make a POST request to this resource with only an `id` field to associate an existing notification template with this system job template.  # Remove Notification Templates from this System Job Template:  Make a POST request to this resource with `id` and `disassociate` fields to remove the notification template from this system job template  without deleting the notification template.
     *
     */
    @POST
    @Path("/{id}/notification_templates_started/")
    @Consumes({"application/json"})
    @GeneratedMethod ("System Job Templates_system_job_templates_notification_templates_started_create")
    public void systemJobTemplatesSystemJobTemplatesNotificationTemplatesStartedCreate(
        @GeneratedParam("id") @PathParam("id") String id, 
        InventorySourcesInventorySourcesNotificationTemplatesErrorCreateRequest data
    );

    /**
     *  List Notification Templates for a System Job Template
     *
     *  Make a GET request to this resource to retrieve a list of notification templates associated with the selected system job template.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of notification templates found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more notification template records.    ## Results  Each notification template data structure includes the following fields:  * `id`: Database ID for this notification template. (integer) * `type`: Data type for this notification template. (choice) * `url`: URL for this notification template. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this notification template was created. (datetime) * `modified`: Timestamp when this notification template was last modified. (datetime) * `name`: Name of this notification template. (string) * `description`: Optional description of this notification template. (string) * `organization`:  (id) * `notification_type`:  (choice)     - `email`: Email     - `grafana`: Grafana     - `irc`: IRC     - `mattermost`: Mattermost     - `pagerduty`: Pagerduty     - `rocketchat`: Rocket.Chat     - `slack`: Slack     - `twilio`: Twilio     - `webhook`: Webhook * `notification_configuration`:  (json) * `messages`: Optional custom messages for notification template. (json)    ## Sorting  To specify that notification templates are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @Path("/{id}/notification_templates_started/")
    @GeneratedMethod ("System Job Templates_system_job_templates_notification_templates_started_list")
    public void systemJobTemplatesSystemJobTemplatesNotificationTemplatesStartedList(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  Create a Notification Template for a System Job Template
     *
     *  Make a POST request to this resource with the following notification template fields to create a new notification template associated with this system job template.          * `name`: Name of this notification template. (string, required) * `description`: Optional description of this notification template. (string, default=`\"\"`) * `organization`:  (id, required) * `notification_type`:  (choice, required)     - `email`: Email     - `grafana`: Grafana     - `irc`: IRC     - `mattermost`: Mattermost     - `pagerduty`: Pagerduty     - `rocketchat`: Rocket.Chat     - `slack`: Slack     - `twilio`: Twilio     - `webhook`: Webhook * `notification_configuration`:  (json, default=`{}`) * `messages`: Optional custom messages for notification template. (json, default=`{&#x27;started&#x27;: None, &#x27;success&#x27;: None, &#x27;error&#x27;: None, &#x27;workflow_approval&#x27;: None}`)         # Add Notification Templates for a System Job Template:  Make a POST request to this resource with only an `id` field to associate an existing notification template with this system job template.  # Remove Notification Templates from this System Job Template:  Make a POST request to this resource with `id` and `disassociate` fields to remove the notification template from this system job template  without deleting the notification template.
     *
     */
    @POST
    @Path("/{id}/notification_templates_success/")
    @Consumes({"application/json"})
    @GeneratedMethod ("System Job Templates_system_job_templates_notification_templates_success_create")
    public void systemJobTemplatesSystemJobTemplatesNotificationTemplatesSuccessCreate(
        @GeneratedParam("id") @PathParam("id") String id, 
        InventorySourcesInventorySourcesNotificationTemplatesErrorCreateRequest data
    );

    /**
     *  List Notification Templates for a System Job Template
     *
     *  Make a GET request to this resource to retrieve a list of notification templates associated with the selected system job template.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of notification templates found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more notification template records.    ## Results  Each notification template data structure includes the following fields:  * `id`: Database ID for this notification template. (integer) * `type`: Data type for this notification template. (choice) * `url`: URL for this notification template. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this notification template was created. (datetime) * `modified`: Timestamp when this notification template was last modified. (datetime) * `name`: Name of this notification template. (string) * `description`: Optional description of this notification template. (string) * `organization`:  (id) * `notification_type`:  (choice)     - `email`: Email     - `grafana`: Grafana     - `irc`: IRC     - `mattermost`: Mattermost     - `pagerduty`: Pagerduty     - `rocketchat`: Rocket.Chat     - `slack`: Slack     - `twilio`: Twilio     - `webhook`: Webhook * `notification_configuration`:  (json) * `messages`: Optional custom messages for notification template. (json)    ## Sorting  To specify that notification templates are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @Path("/{id}/notification_templates_success/")
    @GeneratedMethod ("System Job Templates_system_job_templates_notification_templates_success_list")
    public void systemJobTemplatesSystemJobTemplatesNotificationTemplatesSuccessList(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  Retrieve a System Job Template
     *
     *  Make GET request to this resource to retrieve a single system job template record containing the following fields:  * `id`: Database ID for this system job template. (integer) * `type`: Data type for this system job template. (choice) * `url`: URL for this system job template. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this system job template was created. (datetime) * `modified`: Timestamp when this system job template was last modified. (datetime) * `name`: Name of this system job template. (string) * `description`: Optional description of this system job template. (string) * `last_job_run`:  (datetime) * `last_job_failed`:  (boolean) * `next_job_run`:  (datetime) * `status`:  (choice)     - `new`: New     - `pending`: Pending     - `waiting`: Waiting     - `running`: Running     - `successful`: Successful     - `failed`: Failed     - `error`: Error     - `canceled`: Canceled     - `never updated`: Never Updated     - `ok`: OK     - `missing`: Missing     - `none`: No External Source     - `updating`: Updating * `execution_environment`: The container image to be used for execution. (id) * `job_type`:  (choice)     - `\"\"`: ---------     - `cleanup_jobs`: Remove jobs older than a certain number of days     - `cleanup_activitystream`: Remove activity stream entries older than a certain number of days     - `cleanup_sessions`: Removes expired browser sessions from the database     - `cleanup_tokens`: Removes expired OAuth 2 access tokens and refresh tokens
     *
     */
    @GET
    @Path("/{id}/")
    @GeneratedMethod ("System Job Templates_system_job_templates_read")
    public void systemJobTemplatesSystemJobTemplatesRead(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  Create a Schedule for a System Job Template
     *
     *  Make a POST request to this resource with the following schedule fields to create a new schedule associated with this system job template.   * `rrule`: A value representing the schedules iCal recurrence rule. (string, required)        * `name`: Name of this schedule. (string, required) * `description`: Optional description of this schedule. (string, default=`\"\"`) * `extra_data`:  (json, default=`{}`) * `inventory`: Inventory applied as a prompt, assuming job template prompts for inventory (id, default=``) * `scm_branch`:  (string, default=`\"\"`) * `job_type`:  (choice)     - `None`: --------- (default)     - `\"\"`: ---------     - `run`: Run     - `check`: Check * `job_tags`:  (string, default=`\"\"`) * `skip_tags`:  (string, default=`\"\"`) * `limit`:  (string, default=`\"\"`) * `diff_mode`:  (boolean, default=`None`) * `verbosity`:  (choice)     - `None`: --------- (default)     - `0`: 0 (Normal)     - `1`: 1 (Verbose)     - `2`: 2 (More Verbose)     - `3`: 3 (Debug)     - `4`: 4 (Connection Debug)     - `5`: 5 (WinRM Debug) * `execution_environment`: The container image to be used for execution. (id, default=``) * `forks`:  (integer, default=`None`) * `job_slice_count`:  (integer, default=`None`) * `timeout`:  (integer, default=`None`)  * `enabled`: Enables processing of this schedule. (boolean, default=`True`)
     *
     */
    @POST
    @Path("/{id}/schedules/")
    @Consumes({"application/json"})
    @GeneratedMethod ("System Job Templates_system_job_templates_schedules_create")
    public void systemJobTemplatesSystemJobTemplatesSchedulesCreate(
        @GeneratedParam("id") @PathParam("id") String id, 
        InventorySourcesInventorySourcesSchedulesCreateRequest data
    );

    /**
     *  List Schedules for a System Job Template
     *
     *  Make a GET request to this resource to retrieve a list of schedules associated with the selected system job template.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of schedules found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more schedule records.    ## Results  Each schedule data structure includes the following fields:  * `rrule`: A value representing the schedules iCal recurrence rule. (string) * `id`: Database ID for this schedule. (integer) * `type`: Data type for this schedule. (choice) * `url`: URL for this schedule. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this schedule was created. (datetime) * `modified`: Timestamp when this schedule was last modified. (datetime) * `name`: Name of this schedule. (string) * `description`: Optional description of this schedule. (string) * `extra_data`:  (json) * `inventory`: Inventory applied as a prompt, assuming job template prompts for inventory (id) * `scm_branch`:  (string) * `job_type`:  (choice)     - `None`: ---------     - `\"\"`: ---------     - `run`: Run     - `check`: Check * `job_tags`:  (string) * `skip_tags`:  (string) * `limit`:  (string) * `diff_mode`:  (boolean) * `verbosity`:  (choice)     - `None`: ---------     - `0`: 0 (Normal)     - `1`: 1 (Verbose)     - `2`: 2 (More Verbose)     - `3`: 3 (Debug)     - `4`: 4 (Connection Debug)     - `5`: 5 (WinRM Debug) * `execution_environment`: The container image to be used for execution. (id) * `forks`:  (integer) * `job_slice_count`:  (integer) * `timeout`:  (integer) * `unified_job_template`:  (id) * `enabled`: Enables processing of this schedule. (boolean) * `dtstart`: The first occurrence of the schedule occurs on or after this time. (datetime) * `dtend`: The last occurrence of the schedule occurs before this time, aftewards the schedule expires. (datetime) * `next_run`: The next time that the scheduled action will run. (datetime) * `timezone`: The timezone this schedule runs in. This field is extracted from the RRULE. If the timezone in the RRULE is a link to another timezone, the link will be reflected in this field. (field) * `until`: The date this schedule will end. This field is computed from the RRULE. If the schedule does not end an empty string will be returned (field)    ## Sorting  To specify that schedules are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @Path("/{id}/schedules/")
    @GeneratedMethod ("System Job Templates_system_job_templates_schedules_list")
    public void systemJobTemplatesSystemJobTemplatesSchedulesList(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

}
