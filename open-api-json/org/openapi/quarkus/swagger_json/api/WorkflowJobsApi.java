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
@Path("/api/v2/workflow_jobs")
@RegisterRestClient(baseUri="https://null/", configKey="swagger_json")
@GeneratedClass(value="swagger.json", tag = "WorkflowJobs")
@RegisterProvider(CompositeAuthenticationProvider.class)
@RegisterClientHeaders(AuthenticationPropagationHeadersFactory.class)
@ApplicationScoped
public interface WorkflowJobsApi {

    /**
     *  List Activity Streams for a Workflow Job
     *
     *  Make a GET request to this resource to retrieve a list of activity streams associated with the selected workflow job.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of activity streams found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more activity stream records.    ## Results  Each activity stream data structure includes the following fields:  * `id`: Database ID for this activity stream. (integer) * `type`: Data type for this activity stream. (choice) * `url`: URL for this activity stream. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `timestamp`:  (datetime) * `operation`: The action taken with respect to the given object(s). (choice)     - `create`: Entity Created     - `update`: Entity Updated     - `delete`: Entity Deleted     - `associate`: Entity Associated with another Entity     - `disassociate`: Entity was Disassociated with another Entity * `changes`: A summary of the new and changed values when an object is created, updated, or deleted (json) * `object1`: For create, update, and delete events this is the object type that was affected. For associate and disassociate events this is the object type associated or disassociated with object2. (string) * `object2`: Unpopulated for create, update, and delete events. For associate and disassociate events this is the object type that object1 is being associated with. (string) * `object_association`: When present, shows the field name of the role or relationship that changed. (field) * `action_node`: The cluster node the activity took place on. (string) * `object_type`: When present, shows the model on which the role or relationship was defined. (field)    ## Sorting  To specify that activity streams are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @Path("/{id}/activity_stream/")
    @GeneratedMethod ("Workflow Jobs_workflow_jobs_activity_stream_list")
    public void workflowJobsWorkflowJobsActivityStreamList(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  Cancel Workflow Job
     *
     *  Make a GET request to this resource to determine if the workflow job can be canceled. The response will include the following field:  * `can_cancel`: Indicates whether this workflow job is in a state that can   be canceled (boolean, read-only)  Make a POST request to this endpoint to submit a request to cancel a pending or running workflow job.  The response status code will be 202 if the request to cancel was successfully submitted, or 405 if the workflow job cannot be canceled.
     *
     */
    @POST
    @Path("/{id}/cancel/")
    @Produces({"application/json"})
    @GeneratedMethod ("Workflow Jobs_workflow_jobs_cancel_create")
    public void workflowJobsWorkflowJobsCancelCreate(
        @GeneratedParam("id") @PathParam("id") String id
    );

    /**
     *  Cancel Workflow Job
     *
     *  Make a GET request to this resource to determine if the workflow job can be canceled. The response will include the following field:  * `can_cancel`: Indicates whether this workflow job is in a state that can   be canceled (boolean, read-only)  Make a POST request to this endpoint to submit a request to cancel a pending or running workflow job.  The response status code will be 202 if the request to cancel was successfully submitted, or 405 if the workflow job cannot be canceled.
     *
     */
    @GET
    @Path("/{id}/cancel/")
    @GeneratedMethod ("Workflow Jobs_workflow_jobs_cancel_read")
    public void workflowJobsWorkflowJobsCancelRead(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  Delete a Workflow Job
     *
     *  Make a DELETE request to this resource to delete this workflow job.
     *
     */
    @DELETE
    @Path("/{id}/")
    @GeneratedMethod ("Workflow Jobs_workflow_jobs_delete")
    public void workflowJobsWorkflowJobsDelete(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  List Labels for a Workflow Job
     *
     *  Make a GET request to this resource to retrieve a list of labels associated with the selected workflow job.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of labels found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more label records.    ## Results  Each label data structure includes the following fields:  * `id`: Database ID for this label. (integer) * `type`: Data type for this label. (choice) * `url`: URL for this label. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this label was created. (datetime) * `modified`: Timestamp when this label was last modified. (datetime) * `name`: Name of this label. (string) * `organization`: Organization this label belongs to. (id)    ## Sorting  To specify that labels are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @Path("/{id}/labels/")
    @GeneratedMethod ("Workflow Jobs_workflow_jobs_labels_list")
    public void workflowJobsWorkflowJobsLabelsList(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  List Workflow Jobs
     *
     *  Make a GET request to this resource to retrieve the list of workflow jobs.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of workflow jobs found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more workflow job records.    ## Results  Each workflow job data structure includes the following fields:  * `id`: Database ID for this workflow job. (integer) * `type`: Data type for this workflow job. (choice) * `url`: URL for this workflow job. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this workflow job was created. (datetime) * `modified`: Timestamp when this workflow job was last modified. (datetime) * `name`: Name of this workflow job. (string) * `description`: Optional description of this workflow job. (string) * `unified_job_template`:  (id) * `launch_type`:  (choice)     - `manual`: Manual     - `relaunch`: Relaunch     - `callback`: Callback     - `scheduled`: Scheduled     - `dependency`: Dependency     - `workflow`: Workflow     - `webhook`: Webhook     - `sync`: Sync     - `scm`: SCM Update * `status`:  (choice)     - `new`: New     - `pending`: Pending     - `waiting`: Waiting     - `running`: Running     - `successful`: Successful     - `failed`: Failed     - `error`: Error     - `canceled`: Canceled * `failed`:  (boolean) * `started`: The date and time the job was queued for starting. (datetime) * `finished`: The date and time the job finished execution. (datetime) * `canceled_on`: The date and time when the cancel request was sent. (datetime) * `elapsed`: Elapsed time in seconds that the job ran. (decimal) * `job_explanation`: A status field to indicate the state of the job if it wasn&#x27;t able to run and capture stdout (string) * `launched_by`:  (field) * `work_unit_id`: The Receptor work unit ID associated with this job. (string) * `workflow_job_template`:  (id) * `extra_vars`:  (json) * `allow_simultaneous`:  (boolean) * `job_template`: If automatically created for a sliced job run, the job template the workflow job was created from. (id) * `is_sliced_job`:  (boolean) * `inventory`: Inventory applied as a prompt, assuming job template prompts for inventory (id) * `limit`:  (string) * `scm_branch`:  (string) * `webhook_service`: Service that webhook requests will be accepted from (choice)     - `\"\"`: ---------     - `github`: GitHub     - `gitlab`: GitLab * `webhook_credential`: Personal Access Token for posting back the status to the service API (id) * `webhook_guid`: Unique identifier of the event that triggered this webhook (string) * `skip_tags`:  (string) * `job_tags`:  (string)    ## Sorting  To specify that workflow jobs are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @GeneratedMethod ("Workflow Jobs_workflow_jobs_list")
    public void workflowJobsWorkflowJobsList(
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  List Notifications for a Workflow Job
     *
     *  Make a GET request to this resource to retrieve a list of notifications associated with the selected workflow job.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of notifications found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more notification records.    ## Results  Each notification data structure includes the following fields:  * `id`: Database ID for this notification. (integer) * `type`: Data type for this notification. (choice) * `url`: URL for this notification. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this notification was created. (datetime) * `modified`: Timestamp when this notification was last modified. (datetime) * `notification_template`:  (id) * `error`:  (string) * `status`:  (choice)     - `pending`: Pending     - `successful`: Successful     - `failed`: Failed * `notifications_sent`:  (integer) * `notification_type`:  (choice)     - `email`: Email     - `grafana`: Grafana     - `irc`: IRC     - `mattermost`: Mattermost     - `pagerduty`: Pagerduty     - `rocketchat`: Rocket.Chat     - `slack`: Slack     - `twilio`: Twilio     - `webhook`: Webhook * `recipients`:  (string) * `subject`:  (string) * `body`: Notification body (json)    ## Sorting  To specify that notifications are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @Path("/{id}/notifications/")
    @GeneratedMethod ("Workflow Jobs_workflow_jobs_notifications_list")
    public void workflowJobsWorkflowJobsNotificationsList(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  Retrieve a Workflow Job
     *
     *  Make GET request to this resource to retrieve a single workflow job record containing the following fields:  * `id`: Database ID for this workflow job. (integer) * `type`: Data type for this workflow job. (choice) * `url`: URL for this workflow job. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this workflow job was created. (datetime) * `modified`: Timestamp when this workflow job was last modified. (datetime) * `name`: Name of this workflow job. (string) * `description`: Optional description of this workflow job. (string) * `unified_job_template`:  (id) * `launch_type`:  (choice)     - `manual`: Manual     - `relaunch`: Relaunch     - `callback`: Callback     - `scheduled`: Scheduled     - `dependency`: Dependency     - `workflow`: Workflow     - `webhook`: Webhook     - `sync`: Sync     - `scm`: SCM Update * `status`:  (choice)     - `new`: New     - `pending`: Pending     - `waiting`: Waiting     - `running`: Running     - `successful`: Successful     - `failed`: Failed     - `error`: Error     - `canceled`: Canceled * `failed`:  (boolean) * `started`: The date and time the job was queued for starting. (datetime) * `finished`: The date and time the job finished execution. (datetime) * `canceled_on`: The date and time when the cancel request was sent. (datetime) * `elapsed`: Elapsed time in seconds that the job ran. (decimal) * `job_args`:  (string) * `job_cwd`:  (string) * `job_env`:  (json) * `job_explanation`: A status field to indicate the state of the job if it wasn&#x27;t able to run and capture stdout (string) * `result_traceback`:  (string) * `launched_by`:  (field) * `work_unit_id`: The Receptor work unit ID associated with this job. (string) * `workflow_job_template`:  (id) * `extra_vars`:  (json) * `allow_simultaneous`:  (boolean) * `job_template`: If automatically created for a sliced job run, the job template the workflow job was created from. (id) * `is_sliced_job`:  (boolean) * `inventory`: Inventory applied as a prompt, assuming job template prompts for inventory (id) * `limit`:  (string) * `scm_branch`:  (string) * `webhook_service`: Service that webhook requests will be accepted from (choice)     - `\"\"`: ---------     - `github`: GitHub     - `gitlab`: GitLab * `webhook_credential`: Personal Access Token for posting back the status to the service API (id) * `webhook_guid`: Unique identifier of the event that triggered this webhook (string) * `skip_tags`:  (string) * `job_tags`:  (string)
     *
     */
    @GET
    @Path("/{id}/")
    @GeneratedMethod ("Workflow Jobs_workflow_jobs_read")
    public void workflowJobsWorkflowJobsRead(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     * Relaunch a workflow job
     *
     *  Make a POST request to this endpoint to launch a workflow job identical to the parent workflow job. This will spawn jobs, project updates, or inventory updates based on the unified job templates referenced in the workflow nodes in the workflow job. No POST data is accepted for this action.  If successful, the response status code will be 201 and serialized data of the new workflow job will be returned.
     *
     */
    @POST
    @Path("/{id}/relaunch/")
    @Produces({"application/json"})
    @GeneratedMethod ("Workflow Jobs_workflow_jobs_relaunch_create")
    public void workflowJobsWorkflowJobsRelaunchCreate(
        @GeneratedParam("id") @PathParam("id") String id
    );

    /**
     * Relaunch a workflow job
     *
     *  Make a POST request to this endpoint to launch a workflow job identical to the parent workflow job. This will spawn jobs, project updates, or inventory updates based on the unified job templates referenced in the workflow nodes in the workflow job. No POST data is accepted for this action.  If successful, the response status code will be 201 and serialized data of the new workflow job will be returned.
     *
     */
    @GET
    @Path("/{id}/relaunch/")
    @GeneratedMethod ("Workflow Jobs_workflow_jobs_relaunch_list")
    public void workflowJobsWorkflowJobsRelaunchList(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  List Workflow Job Nodes for a Workflow Job
     *
     *  Make a GET request to this resource to retrieve a list of workflow job nodes associated with the selected workflow job.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of workflow job nodes found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more workflow job node records.    ## Results  Each workflow job node data structure includes the following fields:  * `id`: Database ID for this workflow job node. (integer) * `type`: Data type for this workflow job node. (choice) * `url`: URL for this workflow job node. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this workflow job node was created. (datetime) * `modified`: Timestamp when this workflow job node was last modified. (datetime) * `extra_data`:  (json) * `inventory`: Inventory applied as a prompt, assuming job template prompts for inventory (id) * `scm_branch`:  (string) * `job_type`:  (choice)     - `None`: ---------     - `\"\"`: ---------     - `run`: Run     - `check`: Check * `job_tags`:  (string) * `skip_tags`:  (string) * `limit`:  (string) * `diff_mode`:  (boolean) * `verbosity`:  (choice)     - `None`: ---------     - `0`: 0 (Normal)     - `1`: 1 (Verbose)     - `2`: 2 (More Verbose)     - `3`: 3 (Debug)     - `4`: 4 (Connection Debug)     - `5`: 5 (WinRM Debug) * `execution_environment`: The container image to be used for execution. (id) * `forks`:  (integer) * `job_slice_count`:  (integer) * `timeout`:  (integer) * `job`:  (id) * `workflow_job`:  (id) * `unified_job_template`:  (id) * `success_nodes`:  (field) * `failure_nodes`:  (field) * `always_nodes`:  (field) * `all_parents_must_converge`: If enabled then the node will only run if all of the parent nodes have met the criteria to reach this node (boolean) * `do_not_run`: Indicates that a job will not be created when True. Workflow runtime semantics will mark this True if the node is in a path that will decidedly not be ran. A value of False means the node may not run. (boolean) * `identifier`: An identifier coresponding to the workflow job template node that this node was created from. (string)    ## Sorting  To specify that workflow job nodes are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @Path("/{id}/workflow_nodes/")
    @GeneratedMethod ("Workflow Jobs_workflow_jobs_workflow_nodes_list")
    public void workflowJobsWorkflowJobsWorkflowNodesList(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

}
