package com.kayaksales.dao;

import java.util.List;
import java.util.Optional;
import com.promineotech.kayak.controllers.entities.Customers;

public interface CustomerDao {

  // Method to read customers from customer table
 /**
 * 
 * @param customerPK
 * @param customer_Id
 * @return
 */
  List<Customers> fetchCustomers(Long customer_Id);
  
  // Method to create customers from customer table
  /**
   * 
   * @param customerPK
   * @param customerId
   * @param firstName
   * @param lastName
   * @param phone
   * @return
   */
  Optional<Customers> createCustomers(String customerId, String first_Name, String last_Name,
      String phone_Number);
  
  // Method to update customers from customer table
  /**
   * 
   * @param customerId
   * @param firstName
   * @param lastName
   * @param phone
   * @param newFirstName
   * @param newLastName
   * @param newPhone
   * @return
   */
  Optional<Customers> updateCustomers(String customer_Id, String first_Name, String last_Name,
      String phone_Number, String newFirst_Name, String newLast_Name, String newPhone_Number);  
}