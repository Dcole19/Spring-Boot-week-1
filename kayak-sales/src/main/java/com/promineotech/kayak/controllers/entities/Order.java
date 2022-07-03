package com.promineotech.kayak.controllers.entities;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Order {
  private Long orderId;
  private int quantity;
  private BigDecimal order_Total;
  
  @JsonIgnore
  public Long getOrder_Id() {
    return getOrderId();
  }

  
}
