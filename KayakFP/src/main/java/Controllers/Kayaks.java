package Controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import Entity.Kayak;

@Component
@SpringBootApplication(scanBasePackageClasses = {ComponentScanMarker.class})
public class Kayaks {
  
  public static void main(String[] args) {
    SpringApplication.run(Kayaks.class, args);
    
  }

  public List<Kayak> fetchKayaks(String kayakId, Kayak kayakBrand) {
    // TODO Auto-generated method stub
    return null;
  }

  public Optional<Kayak> createKayak(String kayakId, Kayak kayakBrand, Kayak kayakName) {
    // TODO Auto-generated method stub
    return null;
  }

  public Optional<Kayak> updateKayak(String kayakId, Kayak kayakBrand, Kayak newKayakName) {
    // TODO Auto-generated method stub
    return null;
  }

  public Optional<Kayak> deleteKayak(String kayakId, Kayak kayakBrand) {
    // TODO Auto-generated method stub
    return null;
  }

}
