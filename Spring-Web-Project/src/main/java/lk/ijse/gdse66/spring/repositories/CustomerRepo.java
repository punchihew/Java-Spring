package lk.ijse.gdse66.spring.repositories;

import lk.ijse.gdse66.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer,String> {


 List<Customer> findCustomersByName(String name); //query method

 Customer searchByNameAndAddress(String name,String address);

 int countCustomerByAddressStartsWith(String letters);


}

