package com.promineotech.kayak.controllers.Service;

import java.util.List;
import com.promineotech.kayak.controllers.entities.Kayak;


public interface KayakSalesService {

  /**
   * 
   * @param brand
   * @param name
   * @return
   */
  
  List<Kayak> fetchkayaks(Kayak brand, String name);

}
