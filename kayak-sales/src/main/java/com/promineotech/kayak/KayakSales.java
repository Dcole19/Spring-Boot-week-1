package com.promineotech.kayak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.promineotech.ComponentScanMarker;



@SpringBootApplication(scanBasePackageClasses = { ComponentScanMarker.class})

public class KayakSales {

  public static void main(String[] args) {
   SpringApplication.run(KayakSales.class, args);

  }

}
