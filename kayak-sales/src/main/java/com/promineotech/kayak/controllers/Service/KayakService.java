package com.promineotech.kayak.controllers.Service;

import java.util.List;
import java.util.Optional;
import com.promineotech.kayak.controllers.entities.Kayak;


public interface KayakService {

  /**
   * 
   * @param kayak_Id
   * @param kayakBrand
   * @return
   */
  
  List<Kayak> fetchKayak(String kayak_Id, Kayak kayakBrand);
  
  Optional<Kayak> createKayak(String Kayak_Id, Kayak kayakBrand, Kayak kayakName);
  
  Optional<Kayak> updateKayak(String Kayak_Id, Kayak kayakBrand, Kayak newKayakName); 
  
  Optional<Kayak> deleteKayak(String kayak_Id, Kayak kayakBrand);

  List<Kayak> fetchKayaks(String kayak_Id, Kayak kayakBrand);
}
