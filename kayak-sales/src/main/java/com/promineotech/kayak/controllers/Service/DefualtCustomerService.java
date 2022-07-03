package com.promineotech.kayak.controllers.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.kayaksales.dao.CustomerDao;
import com.promineotech.kayak.controllers.entities.Customers;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefualtCustomerService implements CustomerService{
  
  @Autowired
  private CustomerDao customerDao;
  
  @Transactional(readOnly = true)
  @Override
  public List<Customers> fetchCustomers(Long customer_Id){
    log.info("the fecthCustomers method was called with customer_Id={}",
      customer_Id);
    
    return customerDao.fetchCustomers(customer_Id);
  }
  
  @Override
  public Optional<Customers> CreateCustomers(String customer_Id,
String first_Name, String last_Name, String email, String phone_Number){
    
    log.info("The createCustomers method was called with customer_Id={},"
        +"first_Name={}, last_Name={}, email+{}, phone_Number={}");
    
    return customerDao.createCustomers(customer_Id, first_Name, last_Name, email);
    
  }
  
 @Override
 public Optional<Customers> updateCustomers(String customer_id, String first_name,
     String last_name, String email, String phone_number, String newFirst_name, 
     String newLast_name, String newPhone_number){
   log.info("The updateCustomers method was called with customer_id={}, first_name={}, "
       + "last_name={}, email={}, phone_number={}, customer_Id, first_Name,"
       + "last_Name, phone_number, newFirst_Name, newLast_Name, newPhone_number");
   
   return customerDao.updateCustomers(customer_id, first_name, last_name, phone_number,
       newFirst_name, newLast_name, newPhone_number);
 }

@Override
public List<Customers> createCustomers(String customer_Id, String first_Name, String last_Name,
    String phone_number, String email) {
  // TODO Auto-generated method stub
  return null;
}

@Override
public Optional<Customers> updateCustomers(String customer_Id, String first_name, String last_Name,
    String phone_number, String email) {
  // TODO Auto-generated method stub
  return null;
}

}
