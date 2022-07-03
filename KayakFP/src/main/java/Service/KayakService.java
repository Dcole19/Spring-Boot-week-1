package Service;

import java.util.List;
import java.util.Optional;
import Entity.Kayak;

public interface KayakService {

  /**
   * 
   * @param kayakId
   * @param kayakBrand
   * @return
   */
  List<Kayak> fetchKayak(String kayakId, Kayak kayakBrand);
  
  Optional<Kayak> createKayak(String kayakId, Kayak kayakBrand, Kayak kayakName);
  
  Optional<Kayak> updateKayak(String kayakId, Kayak kayakBrand, Kayak kayakName);
  
  Optional<Kayak> deleteKayak(String kayakId, Kayak kayakBrand);

}
