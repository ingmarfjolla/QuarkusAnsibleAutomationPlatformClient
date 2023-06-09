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
@Path("/api/v2/host_metrics")
@RegisterRestClient(baseUri="https://null/", configKey="swagger_json")
@GeneratedClass(value="swagger.json", tag = "HostMetrics")
@RegisterProvider(CompositeAuthenticationProvider.class)
@RegisterClientHeaders(AuthenticationPropagationHeadersFactory.class)
@ApplicationScoped
public interface HostMetricsApi {

    /**
     *  Delete a Host Metric
     *
     *  Make a DELETE request to this resource to soft-delete this host metric.  A soft deletion will mark the `deleted` field as true and exclude the host metric from license calculations. This may be undone later if the same hostname is automated again afterwards.
     *
     */
    @DELETE
    @Path("/{id}/")
    @GeneratedMethod ("Host Metrics_host_metrics_delete")
    public void hostMetricsHostMetricsDelete(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  List Host Metrics
     *
     *  Make a GET request to this resource to retrieve the list of host metrics.  The resulting data structure contains:      {         \"count\": 99,         \"next\": null,         \"previous\": null,         \"results\": [             ...         ]     }  The `count` field indicates the total number of host metrics found for the given query.  The `next` and `previous` fields provides links to additional results if there are more than will fit on a single page.  The `results` list contains zero or more host metric records.    ## Results  Each host metric data structure includes the following fields:  * `id`: Database ID for this host metric. (integer) * `hostname`:  (string) * `url`: URL for this host metric. (string) * `first_automation`: When the host was first automated against (datetime) * `last_automation`: When the host was last automated against (datetime) * `last_deleted`: When the host was last deleted (datetime) * `automated_counter`: How many times was the host automated (integer) * `deleted_counter`: How many times was the host deleted (integer) * `deleted`: Boolean flag saying whether the host is deleted and therefore not counted into the subscription consumption (boolean) * `used_in_inventories`: How many inventories contain this host (integer)    ## Sorting  To specify that host metrics are returned in a particular order, use the `order_by` query string parameter on the GET request.      ?order_by=name  Prefix the field name with a dash `-` to sort in reverse:      ?order_by=-name  Multiple sorting fields may be specified by separating the field names with a comma `,`:      ?order_by=name,some_other_field  ## Pagination  Use the `page_size` query string parameter to change the number of results returned for each request.  Use the `page` query string parameter to retrieve a particular page of results.      ?page_size=100&page=2  The `previous` and `next` links returned with the results will set these query string parameters automatically.  ## Searching  Use the `search` query string parameter to perform a case-insensitive search within all designated text fields of a model.      ?search=findme  (_Added in Ansible Tower 3.1.0_) Search across related fields:      ?related__search=findme
     *
     */
    @GET
    @GeneratedMethod ("Host Metrics_host_metrics_list")
    public void hostMetricsHostMetricsList(
        @GeneratedParam("page") @QueryParam("page") Integer page, 
        @GeneratedParam("page_size") @QueryParam("page_size") Integer pageSize, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

    /**
     *  Retrieve a Host Metric
     *
     *  Make GET request to this resource to retrieve a single host metric record containing the following fields:  * `id`: Database ID for this host metric. (integer) * `hostname`:  (string) * `url`: URL for this host metric. (string) * `first_automation`: When the host was first automated against (datetime) * `last_automation`: When the host was last automated against (datetime) * `last_deleted`: When the host was last deleted (datetime) * `automated_counter`: How many times was the host automated (integer) * `deleted_counter`: How many times was the host deleted (integer) * `deleted`: Boolean flag saying whether the host is deleted and therefore not counted into the subscription consumption (boolean) * `used_in_inventories`: How many inventories contain this host (integer)
     *
     */
    @GET
    @Path("/{id}/")
    @GeneratedMethod ("Host Metrics_host_metrics_read")
    public void hostMetricsHostMetricsRead(
        @GeneratedParam("id") @PathParam("id") String id, 
        @GeneratedParam("search") @QueryParam("search") String search
    );

}
