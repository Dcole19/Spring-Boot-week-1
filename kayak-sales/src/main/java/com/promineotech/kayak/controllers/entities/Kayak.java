package com.promineotech.kayak.controllers.entities;


import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Kayak {
  private Long kayak_id;
  private String brand_id;
  private String name;
  private BigDecimal price;
  private BigDecimal width;
  
  
  

}
