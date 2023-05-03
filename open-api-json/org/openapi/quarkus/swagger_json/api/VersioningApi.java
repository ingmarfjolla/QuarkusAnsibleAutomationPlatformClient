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
@Path("/api")
@RegisterRestClient(baseUri="https://null/", configKey="swagger_json")
@GeneratedClass(value="swagger.json", tag = "Versioning")
@RegisterProvider(CompositeAuthenticationProvider.class)
@RegisterClientHeaders(AuthenticationPropagationHeadersFactory.class)
@ApplicationScoped
public interface VersioningApi {

    /**
     * List supported API versions
     *
     */
    @GET
    @GeneratedMethod ("Versioning_list")
    public void versioningList(
    );

    /**
     * List top level resources
     *
     */
    @GET
    @Path("/v2/")
    @Produces({"application/json"})
    @GeneratedMethod ("Versioning_read")
    public void versioningRead(
    );

}
