package com.mentoria.estimate.services.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Estimate {

  private String name;
  private String address;
}
