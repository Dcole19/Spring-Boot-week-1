package com.kayaksales.dao;


import java.util.List;
import com.promineotech.kayak.controllers.entities.Kayak;




public interface KayakSalesDao {

  /**
   * 
   * @param brand
   * @param name
   * @return
   */
  

  List<Kayak> fetchKayaks(String brand, String name);
  
  
}
