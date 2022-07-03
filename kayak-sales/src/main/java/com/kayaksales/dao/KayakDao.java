package com.kayaksales.dao;

import java.util.List;
import java.util.Optional;
import com.promineotech.kayak.controllers.entities.Kayak;


public interface KayakDao {

  /**
   * 
   * @param kayak_Id
   * @param kayakBrand
   * @return
   */
  
  List<Kayak> fetchKayaks(String kayak_Id, Kayak kayakBrand);

  /**
   * 
   * @param kayak_Id
   * @param kayakBrand
   * @param kayakBrand
   * @return
   */
  
 Optional<Kayak> updateKayaks(String kayak_Id, Kayak kayakBrand, Kayak kayakName);

  /**
   * 
   * @param kayak_Id
   * @param kayakBrand
   * @param newKayakBrand
   * @return
   */
 
 Optional<Kayak> createKayak(String kayak_Id, Kayak kayakBrand, Kayak newKayakBrand);

  /**
   * 
   * @param kayak_Id
   * @param kayakBrand
   * @return
   */

Optional<Kayak> deleteKayak(String kayak_Id, Kayak kayakBrand);
}
