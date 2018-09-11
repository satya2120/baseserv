package com.baseserv.service.example.resources;

import com.baseserv.api.example.resources.SampleResource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

/**
 * Sample resource implementation
 */

@Component
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class SampleResourceImpl implements SampleResource {
    
    public Response getSample(HttpHeaders httpHeaders) {
        return Response.ok("{\"message\":\"Hello World\"}").build();
    }
    
}
