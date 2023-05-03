package org.openapi.quarkus.swagger_json.api.auth;

import jakarta.inject.Inject;
import jakarta.annotation.PostConstruct;
import jakarta.ws.rs.Priorities;

import jakarta.annotation.Priority;

import io.quarkiverse.openapi.generator.OpenApiGeneratorConfig;

import io.quarkiverse.openapi.generator.providers.BasicAuthenticationProvider;
import io.quarkiverse.openapi.generator.providers.AbstractCompositeAuthenticationProvider;
import io.quarkiverse.openapi.generator.providers.OperationAuthInfo;

import java.util.Optional;

@Priority(Priorities.AUTHENTICATION)
public class CompositeAuthenticationProvider extends AbstractCompositeAuthenticationProvider {

    @jakarta.inject.Inject
    OpenApiGeneratorConfig generatorConfig;


    @PostConstruct
    public void init() {

        BasicAuthenticationProvider basicAuthProvider0 = new BasicAuthenticationProvider("swagger_json", sanitizeAuthName("basic"), generatorConfig);
        this.addAuthenticationProvider(basicAuthProvider0);
    }

}