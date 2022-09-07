package com.openbootcamp.demorest.models;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
public class Bootcamper {
  
  @Getter
  @Setter
  private  String nombre;
  
  @Getter
  @Setter
  private  String valor;
  
}
