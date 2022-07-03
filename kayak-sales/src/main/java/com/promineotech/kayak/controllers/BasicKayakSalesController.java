package com.promineotech.kayak.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.kayak.controllers.Service.KayakSalesService;
import com.promineotech.kayak.controllers.entities.Kayak;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j

public class BasicKayakSalesController implements KayakSalesController {
  
  @Autowired
  private KayakSalesService kayakSalesService;

  @Override
  public List<Kayak> fetchKayaks(Kayak brand, String name) {
    log.debug("brand = {}, name={}", brand, name);
      return kayakSalesService.fetchkayaks(brand, name);
    

  }

  @Override
  public List<Kayak> fetchKayaks(String kayakId, String name) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Optional<Kayak> createKayak(String kayakId, String name) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Optional<Kayak> updateKayak(String kayakId, String name) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Optional<Kayak> deleteKayaks(String kayakId, String name) {
    // TODO Auto-generated method stub
    return null;
  }

}
