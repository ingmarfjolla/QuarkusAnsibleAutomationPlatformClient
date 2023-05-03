package org.openapi.quarkus.swagger_json.api;

import org.openapi.quarkus.swagger_json.model.CredentialTypesCredentialTypesCredentialsCreateRequest;
import org.openapi.quarkus.swagger_json.model.InstanceGroupsInstanceGroupsCreateRequest;
import org.openapi.quarkus.swagger_json.model.InventoriesInventoriesLabelsCreateRequest;
import org.openapi.quarkus.swagger_json.model.InventorySourcesInventorySourcesSchedulesCreateRequest;
import org.openapi.quarkus.swagger_json.model.SchedulesSchedulesPartialUpdateRequest;

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
@Path("/api/v2/schedules")
@RegisterRestClient(baseUri="https://null/", configKey="swagger_json")
@GeneratedClass(value="swagger.json", tag = "Schedules")
@RegisterProvider(CompositeAuthenticationProvider.class)
@RegisterClientHeaders(AuthenticationPropagationHeadersFactory.class)
@ApplicationScoped
public interface SchedulesApi {

    /**
     * Schedule Details
     *
     * ================ The following lists the expected format and details of our rrules:  * DTSTART is required and must follow the following format: DTSTART:YYYYMMDDTHHMMSSZ * DTSTART is expected to be in UTC * INTERVAL is required * SECONDLY is not supported * RRULE must precede the rule statements * BYDAY is supported but not BYDAY with a numerical prefix * BYYEARDAY and BYWEEKNO are not supported * Only one rrule statement per schedule is supported * COUNT must be < 1000  Here are some example rrules:      \"DTSTART:20500331T055000Z RRULE:FREQ=MINUTELY;INTERVAL=10;COUNT=5\"     \"DTSTART:20240331T075000Z RRULE:FREQ=DAILY;INTERVAL=1;COUNT=1\"     \"DTSTART:20140331T075000Z RRULE:FREQ=MINUTELY;INTERVAL=1;UNTIL=20230401T075000Z\"     \"DTSTART:20140331T075000Z RRULE:FREQ=WEEKLY;INTERVAL=1;BYDAY=MO,WE,FR\"     \"DTSTART:20140331T075000Z RRULE:FREQ=WEEKLY;INTERVAL=5;BYDAY=MO\"     \"DTSTART:20140331T075000Z RRULE:FREQ=MONTHLY;INTERVAL=1;BYMONTHDAY=6\"     \"DTSTART:20140331T075000Z RRULE:FREQ=MONTHLY;INTERVAL=1;BYSETPOS=4;BYDAY=SU\"     \"DTSTART:20140331T075000Z RRULE:FREQ=MONTHLY;INTERVAL=1;BYSETPOS=-1;BYDAY=MO,TU,WE,TH,FR\"     \"DTSTART:20140331T075000Z RRULE:FREQ=MONTHLY;INTERVAL=1;BYSETPOS=-1;BYDAY=MO,TU,WE,TH,FR,SA,SU\"     \"DTSTART:20140331T075000Z RRULE:FREQ=YEARLY;INTERVAL=1;BYMONTH=4;BYMONTHDAY=1\"     \"DTSTART:20140331T075000Z RRULE:FREQ=YEARLY;INTERVAL=1;BYSETPOS=-1;BYMONTH=8;BYDAY=SU\"     \"DTSTART:20140331T075000Z RRULE:FREQ=WEEKLY;INTERVAL=1;UNTIL=20230401T075000Z;BYDAY=MO,WE,FR\"     \"DTSTART:20140331T075000Z RRULE:FREQ=HOURLY;INTERVAL=1;UNTIL=20230610T075000Z\"
     *
     */
    @POST
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @GeneratedMethod ("Schedules_schedules_create")
    public void schedulesSchedulesCreate(
        Object data
    );

    /**
     *  Create a Credential for a Schedule
     *
     *  Make a POST request to this resource with the following credential fields to create a new credential associated with this schedule.          * `name`: Name of this credential. (string, required) * `description`: Optional description of this credential. (string, default=`\"\"`) * `organization`:  (id, default=`None`) * `credential_type`: Specify the type of credential you want to create. Refer to the documentation for details on each type. (id, required)  * `inputs`: Enter inputs using either JSON or YAML syntax. Refer to the documentation for example syntax. (json, default=`{}`)            # Add Credentials for a Schedule:  Make a POST request to this resource with only an `id` field to associate an existing credential with this schedule.  # Remove Credentials from this Schedule:  Make a POST request to this resource with `id` and `disassociate` fields to remove the credential from this schedule  without deleting the credential.
     *
     */
    @POST
    @Path("/{id}/credentials/")
    @Consumes({"application/json"})
    @GeneratedMethod ("Schedules_schedules_credentials_create")
    public void schedulesSchedulesCredentialsCreate(
        @GeneratedParam("id") @PathParam("id") String id, 
        CredentialTypesCredentialTypesCredentialsCreateRequest data
    );

    /**
     *  List Credentials for a Schedule
     *
     *  Make a GET request to this resource to retrieve a list of credentials associated with the selected schedule.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of credentials found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more credential records.    ## Results  Each credential data structure includes the following fields:  * `id`: Database ID for this credential. (integer) * `type`: Data type for this credential. (choice) * `url`: URL for this credential. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this credential was created. (datetime) * `modified`: Timestamp when this credential was last modified. (datetime) * `name`: Name of this credential. (string) * `description`: Optional description of this credential. (string) * `organization`:  (id) * `credential_type`: Specify the type of credential you want to create. Refer to the documentation for details on each type. (id) * `managed`:  (boolean) * `inputs`: Enter inputs using either JSON or YAML syntax. Refer to the documentation for example syntax. (json) * `kind`:  (field) * `cloud`:  (field) * `kubernetes`:  (field)    ## Sorting  To specify that credentials are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @Path("/{id}/credentials/")
    @GeneratedMethod ("Schedules_schedules_credentials_list")
    public void schedulesSchedulesCredentialsList(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  Delete a Schedule
     *
     *  Make a DELETE request to this resource to delete this schedule.
     *
     */
    @DELETE
    @Path("/{id}/")
    @GeneratedMethod ("Schedules_schedules_delete")
    public void schedulesSchedulesDelete(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  Create an Instance Group for a Schedule
     *
     *  Make a POST request to this resource with the following instance group fields to create a new instance group associated with this schedule.       * `name`: Name of this instance group. (string, required)       * `max_concurrent_jobs`: Maximum number of concurrent jobs to run on a group. When set to zero, no maximum is enforced. (integer, default=`0`) * `max_forks`: Maximum number of forks to execute concurrently on a group. When set to zero, no maximum is enforced. (integer, default=`0`)   * `is_container_group`: Indicates whether instances in this group are containerized.Containerized groups have a designated Openshift or Kubernetes cluster. (boolean, default=``) * `credential`:  (id, default=``) * `policy_instance_percentage`: Minimum percentage of all instances that will be automatically assigned to this group when new instances come online. (integer, default=`0`) * `policy_instance_minimum`: Static minimum number of Instances that will be automatically assign to this group when new instances come online. (integer, default=`0`) * `policy_instance_list`: List of exact-match Instances that will be assigned to this group (json, default=``) * `pod_spec_override`:  (string, default=`\"\"`)          # Add Instance Groups for a Schedule:  Make a POST request to this resource with only an `id` field to associate an existing instance group with this schedule.  # Remove Instance Groups from this Schedule:  Make a POST request to this resource with `id` and `disassociate` fields to remove the instance group from this schedule  without deleting the instance group.
     *
     */
    @POST
    @Path("/{id}/instance_groups/")
    @Consumes({"application/json"})
    @GeneratedMethod ("Schedules_schedules_instance_groups_create")
    public void schedulesSchedulesInstanceGroupsCreate(
        @GeneratedParam("id") @PathParam("id") String id, 
        InstanceGroupsInstanceGroupsCreateRequest data
    );

    /**
     *  List Instance Groups for a Schedule
     *
     *  Make a GET request to this resource to retrieve a list of instance groups associated with the selected schedule.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of instance groups found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more instance group records.    ## Results  Each instance group data structure includes the following fields:  * `id`: Database ID for this instance group. (integer) * `type`: Data type for this instance group. (choice) * `url`: URL for this instance group. (string) * `related`: Data structure with URLs of related resources. (object) * `name`: Name of this instance group. (string) * `created`: Timestamp when this instance group was created. (datetime) * `modified`: Timestamp when this instance group was last modified. (datetime) * `capacity`:  (field) * `consumed_capacity`:  (field) * `percent_capacity_remaining`:  (field) * `jobs_running`:  (field) * `max_concurrent_jobs`: Maximum number of concurrent jobs to run on a group. When set to zero, no maximum is enforced. (integer) * `max_forks`: Maximum number of forks to execute concurrently on a group. When set to zero, no maximum is enforced. (integer) * `jobs_total`: Count of all jobs that target this instance group (integer) * `instances`:  (field) * `is_container_group`: Indicates whether instances in this group are containerized.Containerized groups have a designated Openshift or Kubernetes cluster. (boolean) * `credential`:  (id) * `policy_instance_percentage`: Minimum percentage of all instances that will be automatically assigned to this group when new instances come online. (integer) * `policy_instance_minimum`: Static minimum number of Instances that will be automatically assign to this group when new instances come online. (integer) * `policy_instance_list`: List of exact-match Instances that will be assigned to this group (json) * `pod_spec_override`:  (string) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object)    ## Sorting  To specify that instance groups are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @Path("/{id}/instance_groups/")
    @GeneratedMethod ("Schedules_schedules_instance_groups_list")
    public void schedulesSchedulesInstanceGroupsList(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  List Unified Jobs for a Schedule
     *
     *  Make a GET request to this resource to retrieve a list of unified jobs associated with the selected schedule.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of unified jobs found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more unified job records.    ## Results  Each unified job data structure includes the following fields:  * `id`: Database ID for this unified job. (integer) * `type`: Data type for this unified job. (choice) * `url`: URL for this unified job. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this unified job was created. (datetime) * `modified`: Timestamp when this unified job was last modified. (datetime) * `name`: Name of this unified job. (string) * `description`: Optional description of this unified job. (string) * `unified_job_template`:  (id) * `launch_type`:  (choice)     - `manual`: Manual     - `relaunch`: Relaunch     - `callback`: Callback     - `scheduled`: Scheduled     - `dependency`: Dependency     - `workflow`: Workflow     - `webhook`: Webhook     - `sync`: Sync     - `scm`: SCM Update * `status`:  (choice)     - `new`: New     - `pending`: Pending     - `waiting`: Waiting     - `running`: Running     - `successful`: Successful     - `failed`: Failed     - `error`: Error     - `canceled`: Canceled * `execution_environment`: The container image to be used for execution. (id) * `failed`:  (boolean) * `started`: The date and time the job was queued for starting. (datetime) * `finished`: The date and time the job finished execution. (datetime) * `canceled_on`: The date and time when the cancel request was sent. (datetime) * `elapsed`: Elapsed time in seconds that the job ran. (decimal) * `job_explanation`: A status field to indicate the state of the job if it wasn&#x27;t able to run and capture stdout (string) * `execution_node`: The node the job executed on. (string) * `controller_node`: The instance that managed the execution environment. (string) * `launched_by`:  (field) * `work_unit_id`: The Receptor work unit ID associated with this job. (string)    ## Sorting  To specify that unified jobs are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @Path("/{id}/jobs/")
    @GeneratedMethod ("Schedules_schedules_jobs_list")
    public void schedulesSchedulesJobsList(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  Create a Label for a Schedule
     *
     *  Make a POST request to this resource with the following label fields to create a new label associated with this schedule.          * `name`: Name of this label. (string, required) * `organization`: Organization this label belongs to. (id, required)         # Add Labels for a Schedule:  Make a POST request to this resource with only an `id` field to associate an existing label with this schedule.  # Remove Labels from this Schedule:  Make a POST request to this resource with `id` and `disassociate` fields to remove the label from this schedule .
     *
     */
    @POST
    @Path("/{id}/labels/")
    @Consumes({"application/json"})
    @GeneratedMethod ("Schedules_schedules_labels_create")
    public void schedulesSchedulesLabelsCreate(
        @GeneratedParam("id") @PathParam("id") String id, 
        InventoriesInventoriesLabelsCreateRequest data
    );

    /**
     *  List Labels for a Schedule
     *
     *  Make a GET request to this resource to retrieve a list of labels associated with the selected schedule.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of labels found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more label records.    ## Results  Each label data structure includes the following fields:  * `id`: Database ID for this label. (integer) * `type`: Data type for this label. (choice) * `url`: URL for this label. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this label was created. (datetime) * `modified`: Timestamp when this label was last modified. (datetime) * `name`: Name of this label. (string) * `organization`: Organization this label belongs to. (id)    ## Sorting  To specify that labels are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @Path("/{id}/labels/")
    @GeneratedMethod ("Schedules_schedules_labels_list")
    public void schedulesSchedulesLabelsList(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  List Schedules
     *
     *  Make a GET request to this resource to retrieve the list of schedules.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of schedules found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more schedule records.    ## Results  Each schedule data structure includes the following fields:  * `rrule`: A value representing the schedules iCal recurrence rule. (string) * `id`: Database ID for this schedule. (integer) * `type`: Data type for this schedule. (choice) * `url`: URL for this schedule. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this schedule was created. (datetime) * `modified`: Timestamp when this schedule was last modified. (datetime) * `name`: Name of this schedule. (string) * `description`: Optional description of this schedule. (string) * `extra_data`:  (json) * `inventory`: Inventory applied as a prompt, assuming job template prompts for inventory (id) * `scm_branch`:  (string) * `job_type`:  (choice)     - `None`: ---------     - `\"\"`: ---------     - `run`: Run     - `check`: Check * `job_tags`:  (string) * `skip_tags`:  (string) * `limit`:  (string) * `diff_mode`:  (boolean) * `verbosity`:  (choice)     - `None`: ---------     - `0`: 0 (Normal)     - `1`: 1 (Verbose)     - `2`: 2 (More Verbose)     - `3`: 3 (Debug)     - `4`: 4 (Connection Debug)     - `5`: 5 (WinRM Debug) * `execution_environment`: The container image to be used for execution. (id) * `forks`:  (integer) * `job_slice_count`:  (integer) * `timeout`:  (integer) * `unified_job_template`:  (id) * `enabled`: Enables processing of this schedule. (boolean) * `dtstart`: The first occurrence of the schedule occurs on or after this time. (datetime) * `dtend`: The last occurrence of the schedule occurs before this time, aftewards the schedule expires. (datetime) * `next_run`: The next time that the scheduled action will run. (datetime) * `timezone`: The timezone this schedule runs in. This field is extracted from the RRULE. If the timezone in the RRULE is a link to another timezone, the link will be reflected in this field. (field) * `until`: The date this schedule will end. This field is computed from the RRULE. If the schedule does not end an empty string will be returned (field)    ## Sorting  To specify that schedules are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @GeneratedMethod ("Schedules_schedules_list")
    public void schedulesSchedulesList(
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  Update a Schedule
     *
     *  Make a PUT or PATCH request to this resource to update this schedule.  The following fields may be modified:   * `rrule`: A value representing the schedules iCal recurrence rule. (string, required)        * `name`: Name of this schedule. (string, required) * `description`: Optional description of this schedule. (string, default=`\"\"`) * `extra_data`:  (json, default=`{}`) * `inventory`: Inventory applied as a prompt, assuming job template prompts for inventory (id, default=``) * `scm_branch`:  (string, default=`\"\"`) * `job_type`:  (choice)     - `None`: --------- (default)     - `\"\"`: ---------     - `run`: Run     - `check`: Check * `job_tags`:  (string, default=`\"\"`) * `skip_tags`:  (string, default=`\"\"`) * `limit`:  (string, default=`\"\"`) * `diff_mode`:  (boolean, default=`None`) * `verbosity`:  (choice)     - `None`: --------- (default)     - `0`: 0 (Normal)     - `1`: 1 (Verbose)     - `2`: 2 (More Verbose)     - `3`: 3 (Debug)     - `4`: 4 (Connection Debug)     - `5`: 5 (WinRM Debug) * `execution_environment`: The container image to be used for execution. (id, default=``) * `forks`:  (integer, default=`None`) * `job_slice_count`:  (integer, default=`None`) * `timeout`:  (integer, default=`None`) * `unified_job_template`:  (id, required) * `enabled`: Enables processing of this schedule. (boolean, default=`True`)              For a PATCH request, include only the fields that are being modified.
     *
     */
    @PATCH
    @Path("/{id}/")
    @Consumes({"application/json"})
    @GeneratedMethod ("Schedules_schedules_partial_update")
    public void schedulesSchedulesPartialUpdate(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("search") @QueryParam("search") String search, 
        SchedulesSchedulesPartialUpdateRequest data
    );

    @POST
    @Path("/preview/")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @GeneratedMethod ("Schedules_schedules_preview_create")
    public void schedulesSchedulesPreviewCreate(
        Object data
    );

    /**
     *  Retrieve a Schedule
     *
     *  Make GET request to this resource to retrieve a single schedule record containing the following fields:  * `rrule`: A value representing the schedules iCal recurrence rule. (string) * `id`: Database ID for this schedule. (integer) * `type`: Data type for this schedule. (choice) * `url`: URL for this schedule. (string) * `related`: Data structure with URLs of related resources. (object) * `summary_fields`: Data structure with name/description for related resources.  The output for some objects may be limited for performance reasons. (object) * `created`: Timestamp when this schedule was created. (datetime) * `modified`: Timestamp when this schedule was last modified. (datetime) * `name`: Name of this schedule. (string) * `description`: Optional description of this schedule. (string) * `extra_data`:  (json) * `inventory`: Inventory applied as a prompt, assuming job template prompts for inventory (id) * `scm_branch`:  (string) * `job_type`:  (choice)     - `None`: ---------     - `\"\"`: ---------     - `run`: Run     - `check`: Check * `job_tags`:  (string) * `skip_tags`:  (string) * `limit`:  (string) * `diff_mode`:  (boolean) * `verbosity`:  (choice)     - `None`: ---------     - `0`: 0 (Normal)     - `1`: 1 (Verbose)     - `2`: 2 (More Verbose)     - `3`: 3 (Debug)     - `4`: 4 (Connection Debug)     - `5`: 5 (WinRM Debug) * `execution_environment`: The container image to be used for execution. (id) * `forks`:  (integer) * `job_slice_count`:  (integer) * `timeout`:  (integer) * `unified_job_template`:  (id) * `enabled`: Enables processing of this schedule. (boolean) * `dtstart`: The first occurrence of the schedule occurs on or after this time. (datetime) * `dtend`: The last occurrence of the schedule occurs before this time, aftewards the schedule expires. (datetime) * `next_run`: The next time that the scheduled action will run. (datetime) * `timezone`: The timezone this schedule runs in. This field is extracted from the RRULE. If the timezone in the RRULE is a link to another timezone, the link will be reflected in this field. (field) * `until`: The date this schedule will end. This field is computed from the RRULE. If the schedule does not end an empty string will be returned (field)
     *
     */
    @GET
    @Path("/{id}/")
    @GeneratedMethod ("Schedules_schedules_read")
    public void schedulesSchedulesRead(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  Update a Schedule
     *
     *  Make a PUT or PATCH request to this resource to update this schedule.  The following fields may be modified:   * `rrule`: A value representing the schedules iCal recurrence rule. (string, required)        * `name`: Name of this schedule. (string, required) * `description`: Optional description of this schedule. (string, default=`\"\"`) * `extra_data`:  (json, default=`{}`) * `inventory`: Inventory applied as a prompt, assuming job template prompts for inventory (id, default=``) * `scm_branch`:  (string, default=`\"\"`) * `job_type`:  (choice)     - `None`: --------- (default)     - `\"\"`: ---------     - `run`: Run     - `check`: Check * `job_tags`:  (string, default=`\"\"`) * `skip_tags`:  (string, default=`\"\"`) * `limit`:  (string, default=`\"\"`) * `diff_mode`:  (boolean, default=`None`) * `verbosity`:  (choice)     - `None`: --------- (default)     - `0`: 0 (Normal)     - `1`: 1 (Verbose)     - `2`: 2 (More Verbose)     - `3`: 3 (Debug)     - `4`: 4 (Connection Debug)     - `5`: 5 (WinRM Debug) * `execution_environment`: The container image to be used for execution. (id, default=``) * `forks`:  (integer, default=`None`) * `job_slice_count`:  (integer, default=`None`) * `timeout`:  (integer, default=`None`) * `unified_job_template`:  (id, required) * `enabled`: Enables processing of this schedule. (boolean, default=`True`)            For a PUT request, include **all** fields in the request.
     *
     */
    @PUT
    @Path("/{id}/")
    @Consumes({"application/json"})
    @GeneratedMethod ("Schedules_schedules_update")
    public void schedulesSchedulesUpdate(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("search") @QueryParam("search") String search, 
        InventorySourcesInventorySourcesSchedulesCreateRequest data
    );

    @GET
    @Path("/zoneinfo/")
    @Produces({"application/json"})
    @GeneratedMethod ("Schedules_schedules_zoneinfo_list")
    public void schedulesSchedulesZoneinfoList(
    );

}
