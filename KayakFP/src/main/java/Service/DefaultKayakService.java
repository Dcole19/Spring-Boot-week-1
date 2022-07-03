package Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import Dao.KayakDao;
import Entity.Kayak;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultKayakService {

  @Autowired
  private KayakDao kayakDao;
  
  
  @Transactional(readOnly = true)
  public List<Kayak> fetchKayaks(String kayakId, Kayak kayakBrand){
    log.info("Teh fetchKayak method was called with kayakId={} and kayakBrand={}", kayakId, kayakBrand);
    
    return kayakDao.fetchKayaks(kayakId, kayakBrand);
  }
  
  
}
