package com.baseserv.service.configurations;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Registers the components to be used by the JAX-RS configurations
 *
 * @author Satyedra
 */
@Component
public class JerseyConfig extends ResourceConfig {
    
    /**
     * Register JAX-RS configurations components.
     * Register Swagger.
     */
    public JerseyConfig() {
        packages("com.baseserv");
        //swagger integration
        register(ApiListingResource.class);
        register(SwaggerSerializers.class);
        BeanConfig config = new BeanConfig();
        config.setTitle("Swagger sample app");
        config.setVersion("1.0.0");
        config.setResourcePackage("com.baseserv.api");
        config.setScan(true);
        
    }
}