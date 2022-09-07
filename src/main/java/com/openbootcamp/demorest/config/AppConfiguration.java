package com.openbootcamp.demorest.config;

import com.openbootcamp.demorest.services.BootcamperService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
  @Bean
  public BootcamperService bootcamperServiceConfig() {
    return new BootcamperService();
  }
}
