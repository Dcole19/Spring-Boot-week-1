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
public class Orders {
  private Long orderPK;
  private int quantity;
  private BigDecimal order_total;
  
}
