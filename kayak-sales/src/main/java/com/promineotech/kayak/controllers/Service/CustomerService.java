package com.promineotech.kayak.controllers.Service;

import java.util.List;
import java.util.Optional;
import com.promineotech.kayak.controllers.entities.Customers;


public interface CustomerService {

  /**
   * 
   * @param customer_Id
   * @return
   */
  
  List<Customers> fetchCustomers(Long customer_Id);
  
  List<Customers> createCustomers(String customer_Id, String first_Name,
      String last_Name, String phone_number, String email);
  
  Optional<Customers> updateCustomers(String customer_Id, String first_name,
      String last_Name, String phone_number, String email);

  Optional<Customers> CreateCustomers(String customer_Id, String first_Name, String last_Name,
      String email, String phone_Number);

  Optional<Customers> updateCustomers(String customer_id, String first_name, String last_name,
      String email, String phone_number, String newFirst_name, String newLast_name,
      String newPhone_number);
  
}
