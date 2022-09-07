package com.openbootcamp.demorest.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
@Component
public class JerseyCongif extends ResourceConfig {
  public JerseyCongif() {
    this.packages("com.openbootcamp.demorest.controllers");
  }
}
