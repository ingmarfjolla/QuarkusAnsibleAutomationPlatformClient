package io.quarkiverse.aap.api.client.ansible.automation.platform.runtime;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.json.JsonObject;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.quarkiverse.aap.api.client.ansible.automation.platform.runtime.rest.AAPClientBlocking;

@ApplicationScoped
public class AAPClient {
    @RestClient
    AAPClientBlocking aapClientBlocking;

    public JsonObject listJobTemplates() {
        return aapClientBlocking.listJobTemplates();
    }

    public Response launchJobTemplateById(@PathParam("id") String id) {
        return aapClientBlocking.jobTemplatesJobTemplatesLaunchCreate(id);
    }
}
