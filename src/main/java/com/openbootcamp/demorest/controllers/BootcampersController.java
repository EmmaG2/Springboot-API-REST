package com.openbootcamp.demorest.controllers;

import com.openbootcamp.demorest.models.Bootcamper;
import com.openbootcamp.demorest.services.BootcamperService;
import org.springframework.stereotype.Component;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.HashMap;


@Component
@Path("/")
public class BootcampersController {
  
  private final BootcamperService bootcamperService;
  
  public BootcampersController(BootcamperService bsc) {
    this.bootcamperService = bsc;
  }
  
  @GET
  @Path("/bootcampers")
  @Produces("application/json")
  public HashMap<String, Bootcamper> listarTodos() {
    return bootcamperService.getAll();
  }
  
  @GET
  @Path("/bootcampers/{name}")
  @Produces("application/json")
  public Bootcamper getByName(@PathParam("name") String name) {
    return bootcamperService.getByName(name);
  }



  @POST
  @Path("/bootcampers")
  @Produces("application/json")
  @Consumes("application/json")
  public Response addUser(Bootcamper bootcamper) {
    bootcamperService.Add(bootcamper);
    
    return Response.created(URI.create("/bootcampers/" + bootcamper.getNombre())).build();
  }
}
