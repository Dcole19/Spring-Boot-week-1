package Dao;

import java.util.List;
import java.util.Optional;
import Entity.Kayak;

public interface KayakDao {

  /**
   * 
   * @param kayakId
   * @param KayakBrand
   * @return
   */
  List<Kayak> fetchKayaks(String kayakId, Kayak KayakBrand);
  
  /**
   * 
   * @param kayakId
   * @param kayakBrand
   * @param KayakName
   * @return
   */
  Optional<Kayak> createKayaks(String kayakId, Kayak kayakBrand, Kayak KayakName);
  
  /**
   * 
   * @param kayakId
   * @param kayakBrand
   * @param kayakName
   * @return
   */
  Optional<Kayak> updateKayaks(String kayakId, Kayak kayakBrand, Kayak kayakName);
  
  /**
   * 
   * @param kayakId
   * @param kayakBrand
   * @return
   */
  Optional<Kayak> deleteKayaks(String kayakId, Kayak kayakBrand);
}
