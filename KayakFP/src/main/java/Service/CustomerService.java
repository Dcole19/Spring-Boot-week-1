package Service;

import java.util.List;
import java.util.Optional;
import Entity.Customers;


public interface CustomerService {

List<Customers> fetchCustomers(Long customerPK, String customerId);

Optional<Customers> createCustomers(String customerId, String firstName,
    String lastName, String phoneNumber);

Optional<Customers> updateCustomers(String customerId, String firstName, String lastName,
    String phoneNumber, String newFirstName, String newLastName, String newPhoneNumber);
}
