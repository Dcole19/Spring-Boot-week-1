package Controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import Entity.Kayak;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j  
public class DefaultKayakController implements KayakController{

  @Autowired
  private Kayaks kayakService;
  
  @Override
  public List<Kayak> fetchKayaks(String KayakId, Kayak kayakBrand){
    log.info("kayakId={}, kayakBrand={}", KayakId, kayakBrand);
    
    return kayakService.fetchKayaks(KayakId, kayakBrand); 
  }
  
  @Override
  public Optional<Kayak> createKayaks(String kayakId, Kayak kayakBrand, Kayak kayakName) {
log.info("kayakId={}, kayakBrand={}, kayakName={}", kayakId, kayakBrand, kayakName);
    
    return kayakService.createKayak(kayakId, kayakBrand, kayakName);
  }

  @Override
  public Optional<Kayak> updatekayaks(String kayakId, Kayak kayakBrand, Kayak newKayakName) {
log.info("kayakId={}, kayakBrand={}, newKayakBrand={}", kayakId, kayakBrand, newKayakName);
    
    return kayakService.updateKayak(kayakId, kayakBrand, newKayakName);
  }

  @Override
  public Optional<Kayak> deleteKayaks(String kayakId, Kayak kayakBrand) {
log.info("kayakId={}", kayakId);
    
    return kayakService.deleteKayak(kayakId, kayakBrand);
  }
}
