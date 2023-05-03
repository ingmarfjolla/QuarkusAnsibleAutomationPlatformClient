package org.openapi.quarkus.swagger_json.api;

import org.openapi.quarkus.swagger_json.model.JobsJobsRelaunchCreateRequest;

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
@Path("/api/v2/jobs")
@RegisterRestClient(baseUri="https://null/", configKey="swagger_json")
@GeneratedClass(value="swagger.json", tag = "Jobs")
@RegisterProvider(CompositeAuthenticationProvider.class)
@RegisterClientHeaders(AuthenticationPropagationHeadersFactory.class)
@ApplicationScoped
public interface JobsApi {

    /**
     *  List Activity Streams for a Job
     *
     *  Make a GET request to this resource to retrieve a list of activity streams associated with the selected job.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of activity streams found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more activity stream records.    ## Results  Each activity stream data structure includes the following fields:  * `id`: Database ID for this activity stream. (integer) * `type`: Data type for this activity stream. (choice) * `url`: URL for this activity stream. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `timestamp`:  (datetime) * `operation`: The action taken with respect to the given object(s). (choice)     - `create`: Entity Created     - `update`: Entity Updated     - `delete`: Entity Deleted     - `associate`: Entity Associated with another Entity     - `disassociate`: Entity was Disassociated with another Entity * `changes`: A summary of the new and changed values when an object is created, updated, or deleted (json) * `object1`: For create, update, and delete events this is the object type that was affected. For associate and disassociate events this is the object type associated or disassociated with object2. (string) * `object2`: Unpopulated for create, update, and delete events. For associate and disassociate events this is the object type that object1 is being associated with. (string) * `object_association`: When present, shows the field name of the role or relationship that changed. (field) * `action_node`: The cluster node the activity took place on. (string) * `object_type`: When present, shows the model on which the role or relationship was defined. (field)    ## Sorting  To specify that activity streams are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @Path("/{id}/activity_stream/")
    @GeneratedMethod ("Jobs_jobs_activity_stream_list")
    public void jobsJobsActivityStreamList(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  Cancel a Job
     *
     * Make a POST request to this resource to cancel a pending or running job.  The response status code will be 202 if successful, or 405 if the job cannot be canceled.
     *
     */
    @POST
    @Path("/{id}/cancel/")
    @GeneratedMethod ("Jobs_jobs_cancel_create")
    public void jobsJobsCancelCreate(
        @GeneratedParam("id") @PathParam("id") String id
    );

    /**
     *  Determine if a Job can be canceled
     *
     *  Make a GET request to this resource to determine if the job can be canceled. The response will include the following field:  * `can_cancel`: Indicates whether this job can be canceled (boolean, read-only)
     *
     */
    @GET
    @Path("/{id}/cancel/")
    @GeneratedMethod ("Jobs_jobs_cancel_read")
    public void jobsJobsCancelRead(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     * Create a schedule based on a job
     *
     *  Make a POST request to this endpoint to create a schedule that launches the job template that launched this job, and uses the same parameters that the job was launched with. These parameters include all \"prompted\" resources such as `extra_vars`, `inventory`, `limit`, etc.  Jobs that were launched with user-provided passwords cannot have a schedule created from them.  Make a GET request for information about what those prompts are and whether or not a schedule can be created.
     *
     */
    @POST
    @Path("/{id}/create_schedule/")
    @GeneratedMethod ("Jobs_jobs_create_schedule_create")
    public void jobsJobsCreateScheduleCreate(
        @GeneratedParam("id") @PathParam("id") String id
    );

    /**
     * Create a schedule based on a job
     *
     *  Make a POST request to this endpoint to create a schedule that launches the job template that launched this job, and uses the same parameters that the job was launched with. These parameters include all \"prompted\" resources such as `extra_vars`, `inventory`, `limit`, etc.  Jobs that were launched with user-provided passwords cannot have a schedule created from them.  Make a GET request for information about what those prompts are and whether or not a schedule can be created.
     *
     */
    @GET
    @Path("/{id}/create_schedule/")
    @GeneratedMethod ("Jobs_jobs_create_schedule_read")
    public void jobsJobsCreateScheduleRead(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  List Credentials for a Job
     *
     *  Make a GET request to this resource to retrieve a list of credentials associated with the selected job.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of credentials found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more credential records.    ## Results  Each credential data structure includes the following fields:  * `id`: Database ID for this credential. (integer) * `type`: Data type for this credential. (choice) * `url`: URL for this credential. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this credential was created. (datetime) * `modified`: Timestamp when this credential was last modified. (datetime) * `name`: Name of this credential. (string) * `description`: Optional description of this credential. (string) * `organization`:  (id) * `credential_type`: Specify the type of credential you want to create. Refer to the documentation for details on each type. (id) * `managed`:  (boolean) * `inputs`: Enter inputs using either JSON or YAML syntax. Refer to the documentation for example syntax. (json) * `kind`:  (field) * `cloud`:  (field) * `kubernetes`:  (field)    ## Sorting  To specify that credentials are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @Path("/{id}/credentials/")
    @GeneratedMethod ("Jobs_jobs_credentials_list")
    public void jobsJobsCredentialsList(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  Delete a Job
     *
     *  Make a DELETE request to this resource to delete this job.
     *
     */
    @DELETE
    @Path("/{id}/")
    @Produces({"application/json"})
    @GeneratedMethod ("Jobs_jobs_delete")
    public void jobsJobsDelete(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  View a summary of children events
     *
     *  Special view to facilitate processing job output in the UI. In order to collapse events and their children, the UI needs to know how many children exist for a given event. The UI also needs to know the order of the event (0 based index), which usually matches the counter, but not always. This view returns a JSON object where the key is the event counter, and the value includes the number of children (and grandchildren) events. Only events with children are included in the output.  ## Example  e.g. Demo Job Template job tuple(event counter, uuid, parent_uuid)  ``` (1, '4598d19e-93b4-4e33-a0ae-b387a7348964', '') (2, 'aae0d189-e3cb-102a-9f00-000000000006', '4598d19e-93b4-4e33-a0ae-b387a7348964') (3, 'aae0d189-e3cb-102a-9f00-00000000000c', 'aae0d189-e3cb-102a-9f00-000000000006') (4, 'f4194f14-e406-4124-8519-0fdb08b18f4b', 'aae0d189-e3cb-102a-9f00-00000000000c') (5, '39f7ad99-dbf3-41e0-93f8-9999db4004f2', 'aae0d189-e3cb-102a-9f00-00000000000c') (6, 'aae0d189-e3cb-102a-9f00-000000000008', 'aae0d189-e3cb-102a-9f00-000000000006') (7, '39a49992-5ca4-4b6c-b178-e56d0b0333da', 'aae0d189-e3cb-102a-9f00-000000000008') (8, '504f3b28-3ea8-4f6f-bd82-60cf8e807cc0', 'aae0d189-e3cb-102a-9f00-000000000008') (9, 'a242be54-ebe6-4021-afab-f2878bff2e9f', '4598d19e-93b4-4e33-a0ae-b387a7348964') ```  output  ``` { \"1\": {     \"rowNumber\": 0,     \"numChildren\": 8 }, \"2\": {     \"rowNumber\": 1,     \"numChildren\": 6 }, \"3\": {     \"rowNumber\": 2,     \"numChildren\": 2 }, \"6\": {     \"rowNumber\": 5,     \"numChildren\": 2 } } \"meta_event_nested_parent_uuid\": {} } ```  counter 1 is event 0, and has 8 children counter 2 is event 1, and has 6 children etc.  The UI also needs to be able to collapse over \"meta\" events -- events that show up due to verbosity or warnings from the system while the play is running. These events have a 0 level event, with no parent uuid.  ``` playbook_on_start verbose   playbook_on_play_start     playbook_on_task_start       runner_on_start        <- level 3 verbose                      <- jump to level 0 verbose         runner_on_ok         <- jump back to level 3       playbook_on_task_start         runner_on_start         runner_on_ok verbose verbose       playbook_on_stats ```  These verbose statements that fall in the middle of a series of children events are problematic for the UI. To help, this view will attempt to place the events into the hierarchy, without the event level jumps.  ``` playbook_on_start   verbose   playbook_on_play_start     playbook_on_task_start       runner_on_start        <- A         verbose              <- this maps to the uuid of A         verbose         runner_on_ok       playbook_on_task_start <- B         runner_on_start         runner_on_ok         verbose              <- this maps to the uuid of B         verbose       playbook_on_stats ```  The output will include a JSON object where the key is the event counter, and the value is the assigned nested uuid.
     *
     */
    @GET
    @Path("/{id}/job_events/children_summary/")
    @Produces({"application/json"})
    @GeneratedMethod ("Jobs_jobs_job_events_children_summary_list")
    public void jobsJobsJobEventsChildrenSummaryList(
        @GeneratedParam("id") @PathParam("id") String id
    );

    /**
     *  List Job Events for a Job
     *
     *  Make a GET request to this resource to retrieve a list of job events associated with the selected job.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of job events found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more job event records.    ## Results  Each job event data structure includes the following fields:  * `id`: Database ID for this job event. (integer) * `type`: Data type for this job event. (choice) * `url`: URL for this job event. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this job event was created. (datetime) * `modified`: Timestamp when this job event was last modified. (datetime) * `job`:  (id) * `event`:  (choice)     - `runner_on_failed`: Host Failed     - `runner_on_start`: Host Started     - `runner_on_ok`: Host OK     - `runner_on_error`: Host Failure     - `runner_on_skipped`: Host Skipped     - `runner_on_unreachable`: Host Unreachable     - `runner_on_no_hosts`: No Hosts Remaining     - `runner_on_async_poll`: Host Polling     - `runner_on_async_ok`: Host Async OK     - `runner_on_async_failed`: Host Async Failure     - `runner_item_on_ok`: Item OK     - `runner_item_on_failed`: Item Failed     - `runner_item_on_skipped`: Item Skipped     - `runner_retry`: Host Retry     - `runner_on_file_diff`: File Difference     - `playbook_on_start`: Playbook Started     - `playbook_on_notify`: Running Handlers     - `playbook_on_include`: Including File     - `playbook_on_no_hosts_matched`: No Hosts Matched     - `playbook_on_no_hosts_remaining`: No Hosts Remaining     - `playbook_on_task_start`: Task Started     - `playbook_on_vars_prompt`: Variables Prompted     - `playbook_on_setup`: Gathering Facts     - `playbook_on_import_for_host`: internal: on Import for Host     - `playbook_on_not_import_for_host`: internal: on Not Import for Host     - `playbook_on_play_start`: Play Started     - `playbook_on_stats`: Playbook Complete     - `debug`: Debug     - `verbose`: Verbose     - `deprecated`: Deprecated     - `warning`: Warning     - `system_warning`: System Warning     - `error`: Error * `counter`:  (integer) * `event_display`:  (string) * `event_data`:  (json) * `event_level`:  (integer) * `failed`:  (boolean) * `changed`:  (boolean) * `uuid`:  (string) * `parent_uuid`:  (string) * `host`:  (id) * `host_name`:  (string) * `playbook`:  (string) * `play`:  (string) * `task`:  (string) * `role`:  (string) * `stdout`:  (string) * `start_line`:  (integer) * `end_line`:  (integer) * `verbosity`:  (integer)    ## Sorting  To specify that job events are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @Path("/{id}/job_events/")
    @Produces({"application/json"})
    @GeneratedMethod ("Jobs_jobs_job_events_list")
    public void jobsJobsJobEventsList(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  List Job Host Summaries for a Job
     *
     *  Make a GET request to this resource to retrieve a list of job host summaries associated with the selected job.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of job host summaries found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more job host summary records.    ## Results  Each job host summary data structure includes the following fields:  * `id`: Database ID for this job host summary. (integer) * `type`: Data type for this job host summary. (choice) * `url`: URL for this job host summary. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this job host summary was created. (datetime) * `modified`: Timestamp when this job host summary was last modified. (datetime) * `job`:  (id) * `host`:  (id) * `constructed_host`: Only for jobs run against constructed inventories, this links to the host inside the constructed inventory. (id) * `host_name`:  (string) * `changed`:  (integer) * `dark`:  (integer) * `failures`:  (integer) * `ok`:  (integer) * `processed`:  (integer) * `skipped`:  (integer) * `failed`:  (boolean) * `ignored`:  (integer) * `rescued`:  (integer)    ## Sorting  To specify that job host summaries are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @Path("/{id}/job_host_summaries/")
    @GeneratedMethod ("Jobs_jobs_job_host_summaries_list")
    public void jobsJobsJobHostSummariesList(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  List Labels for a Job
     *
     *  Make a GET request to this resource to retrieve a list of labels associated with the selected job.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of labels found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more label records.    ## Results  Each label data structure includes the following fields:  * `id`: Database ID for this label. (integer) * `type`: Data type for this label. (choice) * `url`: URL for this label. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this label was created. (datetime) * `modified`: Timestamp when this label was last modified. (datetime) * `name`: Name of this label. (string) * `organization`: Organization this label belongs to. (id)    ## Sorting  To specify that labels are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @Path("/{id}/labels/")
    @GeneratedMethod ("Jobs_jobs_labels_list")
    public void jobsJobsLabelsList(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  List Jobs
     *
     *  Make a GET request to this resource to retrieve the list of jobs.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of jobs found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more job records.    ## Results  Each job data structure includes the following fields:  * `id`: Database ID for this job. (integer) * `type`: Data type for this job. (choice) * `url`: URL for this job. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this job was created. (datetime) * `modified`: Timestamp when this job was last modified. (datetime) * `name`: Name of this job. (string) * `description`: Optional description of this job. (string) * `unified_job_template`:  (id) * `launch_type`:  (choice)     - `manual`: Manual     - `relaunch`: Relaunch     - `callback`: Callback     - `scheduled`: Scheduled     - `dependency`: Dependency     - `workflow`: Workflow     - `webhook`: Webhook     - `sync`: Sync     - `scm`: SCM Update * `status`:  (choice)     - `new`: New     - `pending`: Pending     - `waiting`: Waiting     - `running`: Running     - `successful`: Successful     - `failed`: Failed     - `error`: Error     - `canceled`: Canceled * `execution_environment`: The container image to be used for execution. (id) * `failed`:  (boolean) * `started`: The date and time the job was queued for starting. (datetime) * `finished`: The date and time the job finished execution. (datetime) * `canceled_on`: The date and time when the cancel request was sent. (datetime) * `elapsed`: Elapsed time in seconds that the job ran. (decimal) * `job_explanation`: A status field to indicate the state of the job if it wasn&#x27;t able to run and capture stdout (string) * `execution_node`: The node the job executed on. (string) * `controller_node`: The instance that managed the execution environment. (string) * `launched_by`:  (field) * `work_unit_id`: The Receptor work unit ID associated with this job. (string) * `job_type`:  (choice)     - `run`: Run     - `check`: Check     - `scan`: Scan * `inventory`:  (id) * `project`:  (id) * `playbook`:  (string) * `scm_branch`: Branch to use in job run. Project default used if blank. Only allowed if project allow_override field is set to true. (string) * `forks`:  (integer) * `limit`:  (string) * `verbosity`:  (choice)     - `0`: 0 (Normal)     - `1`: 1 (Verbose)     - `2`: 2 (More Verbose)     - `3`: 3 (Debug)     - `4`: 4 (Connection Debug)     - `5`: 5 (WinRM Debug) * `extra_vars`:  (json) * `job_tags`:  (string) * `force_handlers`:  (boolean) * `skip_tags`:  (string) * `start_at_task`:  (string) * `timeout`: The amount of time (in seconds) to run before the task is canceled. (integer) * `use_fact_cache`: If enabled, the service will act as an Ansible Fact Cache Plugin; persisting facts at the end of a playbook run to the database and caching facts for use by Ansible. (boolean) * `organization`: The organization used to determine access to this unified job. (id) * `job_template`:  (id) * `passwords_needed_to_start`:  (field) * `allow_simultaneous`:  (boolean) * `artifacts`:  (json) * `scm_revision`: The SCM Revision from the Project used for this job, if available (string) * `instance_group`: The Instance group the job was run under (id) * `diff_mode`: If enabled, textual changes made to any templated files on the host are shown in the standard output (boolean) * `job_slice_number`: If part of a sliced job, the ID of the inventory slice operated on. If not part of sliced job, parameter is not used. (integer) * `job_slice_count`: If ran as part of sliced jobs, the total number of slices. If 1, job is not part of a sliced job. (integer) * `webhook_service`: Service that webhook requests will be accepted from (choice)     - `\"\"`: ---------     - `github`: GitHub     - `gitlab`: GitLab * `webhook_credential`: Personal Access Token for posting back the status to the service API (id) * `webhook_guid`: Unique identifier of the event that triggered this webhook (string)    ## Sorting  To specify that jobs are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @Produces({"application/json"})
    @GeneratedMethod ("Jobs_jobs_list")
    public void jobsJobsList(
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  List Notifications for a Job
     *
     *  Make a GET request to this resource to retrieve a list of notifications associated with the selected job.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of notifications found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more notification records.    ## Results  Each notification data structure includes the following fields:  * `id`: Database ID for this notification. (integer) * `type`: Data type for this notification. (choice) * `url`: URL for this notification. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this notification was created. (datetime) * `modified`: Timestamp when this notification was last modified. (datetime) * `notification_template`:  (id) * `error`:  (string) * `status`:  (choice)     - `pending`: Pending     - `successful`: Successful     - `failed`: Failed * `notifications_sent`:  (integer) * `notification_type`:  (choice)     - `email`: Email     - `grafana`: Grafana     - `irc`: IRC     - `mattermost`: Mattermost     - `pagerduty`: Pagerduty     - `rocketchat`: Rocket.Chat     - `slack`: Slack     - `twilio`: Twilio     - `webhook`: Webhook * `recipients`:  (string) * `subject`:  (string) * `body`: Notification body (json)    ## Sorting  To specify that notifications are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @Path("/{id}/notifications/")
    @GeneratedMethod ("Jobs_jobs_notifications_list")
    public void jobsJobsNotificationsList(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  Retrieve a Job Host Summary
     *
     *  Make GET request to this resource to retrieve a single job host summary record containing the following fields:  * `id`: Database ID for this job host summary. (integer) * `type`: Data type for this job host summary. (choice) * `url`: URL for this job host summary. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this job host summary was created. (datetime) * `modified`: Timestamp when this job host summary was last modified. (datetime) * `job`:  (id) * `host`:  (id) * `constructed_host`: Only for jobs run against constructed inventories, this links to the host inside the constructed inventory. (id) * `host_name`:  (string) * `changed`:  (integer) * `dark`:  (integer) * `failures`:  (integer) * `ok`:  (integer) * `processed`:  (integer) * `skipped`:  (integer) * `failed`:  (boolean) * `ignored`:  (integer) * `rescued`:  (integer)
     *
     */
    @GET
    @Path("/{id}/")
    @GeneratedMethod ("Jobs_jobs_read_0")
    public void jobsJobsRead0(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     * Relaunch a Job
     *
     *  Make a POST request to this resource to launch a job. If any passwords or variables are required then they should be passed in via POST data.   In order to determine what values are required in order to launch a job based on this job template you may make a GET request to this endpoint.
     *
     */
    @POST
    @Path("/{id}/relaunch/")
    @Consumes({"application/json"})
    @GeneratedMethod ("Jobs_jobs_relaunch_create")
    public void jobsJobsRelaunchCreate(
        @GeneratedParam("id") @PathParam("id") String id, 
        JobsJobsRelaunchCreateRequest data
    );

    /**
     * Relaunch a Job
     *
     *  Make a POST request to this resource to launch a job. If any passwords or variables are required then they should be passed in via POST data.   In order to determine what values are required in order to launch a job based on this job template you may make a GET request to this endpoint.
     *
     */
    @GET
    @Path("/{id}/relaunch/")
    @GeneratedMethod ("Jobs_jobs_relaunch_read")
    public void jobsJobsRelaunchRead(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  Retrieve Job Stdout
     *
     *  Make GET request to this resource to retrieve the stdout from running this job.  ## Format  Use the `format` query string parameter to specify the output format.  * Browsable API: `?format=api` * HTML: `?format=html` * Plain Text: `?format=txt` * Plain Text with ANSI color codes: `?format=ansi` * JSON structure: `?format=json` * Downloaded Plain Text: `?format=txt_download` * Downloaded Plain Text with ANSI color codes: `?format=ansi_download`  (_New in Ansible Tower 2.0.0_) When using the Browsable API, HTML and JSON formats, the `start_line` and `end_line` query string parameters can be used to specify a range of line numbers to retrieve.  Use `dark=1` or `dark=0` as a query string parameter to force or disable a dark background.  Files over 1.0 MB (configurable) will not display in the browser. Use the `txt_download` or `ansi_download` formats to download the file directly to view it.
     *
     */
    @GET
    @Path("/{id}/stdout/")
    @Produces({"text/plain"})
    @GeneratedMethod ("Jobs_jobs_stdout_read")
    public void jobsJobsStdoutRead(
        @GeneratedParam("id") @PathParam("id") String id
    );

}
