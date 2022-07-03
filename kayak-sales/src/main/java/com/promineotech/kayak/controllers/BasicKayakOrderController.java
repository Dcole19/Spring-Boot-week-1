package com.promineotech.kayak.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import com.mysql.cj.x.protobuf.MysqlxCrud.Order;
import com.promineotech.kayak.controllers.Service.KayakOrderService;
import com.promineotech.kayak.controllers.entities.OrderRequest;
import lombok.extern.slf4j.Slf4j;

@Component
@RestController
@Slf4j
public class BasicKayakOrderController implements KayakOrderController {
  
  @Autowired
  private KayakOrderService kayakOrderService;
  
  @Override
  public Order createOrder(OrderRequest orderRequest) {
    log.debug("Order={}", orderRequest);
    return kayakOrderService.createOrder(orderRequest);
    
  }

  @Override
  public com.mysql.cj.x.protobuf.MysqlxCrud.Order Order(OrderRequest orderRequest) {
    // TODO Auto-generated method stub
    return null;
  }
  

}
