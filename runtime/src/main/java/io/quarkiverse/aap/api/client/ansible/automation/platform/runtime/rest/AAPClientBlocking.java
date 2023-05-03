package io.quarkiverse.aap.api.client.ansible.automation.platform.runtime.rest;

import jakarta.json.JsonObject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import io.quarkiverse.openapi.generator.annotations.GeneratedMethod;

@RegisterRestClient(configKey = "aap-api")
@Path("/api/v2")
@ClientHeaderParam(name = "Authorization", value = "Bearer ")
public interface AAPClientBlocking {
    @GET
    @Path("/job_templates/")
    @ClientHeaderParam(name = "Authorization", value = "Bearer ")
    JsonObject listJobTemplates();

    @POST
    @Path("/job_templates/{id}/launch/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @GeneratedMethod("Job Templates_job_templates_launch_create")
    public Response jobTemplatesJobTemplatesLaunchCreate(
            @PathParam("id") String id);

}
