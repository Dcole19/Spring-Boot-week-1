package com.promineotech.kayak.controllers.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.kayaksales.dao.KayakDao;
import com.promineotech.kayak.controllers.entities.Kayak;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultKayakService implements KayakService{

  @Autowired
  private KayakDao kayakDao;
  
  @Transactional(readOnly = true)
  
      
  @Override
  public List<Kayak> fetchKayak(String kayak_Id, Kayak kayakBrand) {
log.info("The fetchKayak method was called with kayak_Id={} and kayakBrand{}", kayak_Id, kayakBrand);;
    
    return kayakDao.fetchKayaks(kayak_Id, kayakBrand);
    
  }

  @Override
  public Optional<Kayak> createKayak(String Kayak_Id, Kayak kayakBrand, Kayak kayakName) {
log.info("The createKayak method was called with kayak_Id={}, kayakBrand={}, kayakName={}", Kayak_Id, kayakBrand, kayakName);
    
    return kayakDao.createKayak(Kayak_Id, kayakBrand, kayakName);
  }

  @Override
  public Optional<Kayak> updateKayak(String Kayak_Id, Kayak kayakBrand, Kayak newKayakName) {
    log.info("The updateKayak method was called with kayak_Id={}, kayakBrand={}",Kayak_Id, kayakBrand);
    
    return kayakDao.updateKayaks(Kayak_Id, kayakBrand, newKayakName);
  }

  @Override
  public Optional<Kayak> deleteKayak(String kayak_Id, Kayak kayakBrand) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Kayak> fetchKayaks(String kayak_Id, Kayak kayakBrand) {
    // TODO Auto-generated method stub
    return null;
  }

  

  

  
}
