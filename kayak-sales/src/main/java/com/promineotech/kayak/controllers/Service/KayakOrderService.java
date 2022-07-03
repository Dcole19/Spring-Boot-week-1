package com.promineotech.kayak.controllers.Service;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;
import com.promineotech.kayak.controllers.entities.OrderRequest;

public interface KayakOrderService {

  Order createOrder(OrderRequest orderRequest);

 

}
