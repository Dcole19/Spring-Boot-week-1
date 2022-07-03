package com.promineotech.kayak.controllers.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customers {
  private Long customerPK;
  private String first_Name;
  private String last_Name;
  private String email;
  private int phone_number;

}
