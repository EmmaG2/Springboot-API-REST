package com.openbootcamp.demorest.services;

import com.openbootcamp.demorest.models.Bootcamper;
import org.jvnet.hk2.annotations.Service;

import java.util.HashMap;

@Service
public class BootcamperService {

  private static final HashMap<String, Bootcamper> users = new HashMap<>();
  
  public HashMap<String, Bootcamper> getAll() {
    return users;
  }
  
  public void Add(Bootcamper user) {
    users.put(user.getNombre(), user);
  }
  
  public Bootcamper getByName(String name) {
    return users.get(name);
  }
  
}
