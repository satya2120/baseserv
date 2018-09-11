package com.baseserv.api.example.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Sample resource
 */


@Path("/sample")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Api(value = "/sample", description = "Operations on the hello object")
public interface SampleResource {
    
    @GET
    @Path("/")
    @ApiOperation(value = "Return a simple greeting", notes = "Return a simple greeting")
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid ID")})
    Response getSample(HttpHeaders httpHeaders);
    
}
