package lk.ijse.gdse66.spring.repositories;

import lk.ijse.gdse66.spring.config.WebRootConfig;
import lk.ijse.gdse66.spring.entity.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith({SpringExtension.class})
@ContextConfiguration(classes = WebRootConfig.class)
class CustomerRepoTest {

    @Autowired
    CustomerRepo customerRepo;

    void addAllCustomers(){
        Customer customer1 = new Customer("C001", "Kasun Sampath", "Galle", "ProfilePic1");
        Customer customer2 = new Customer("C002", "Saman Kumara", "Matara", "ProfilePic2");
        Customer customer3 = new Customer("C003", "Amal Perera", "Panadura", "ProfilePic3");

        customerRepo.save(customer1);
        customerRepo.save(customer2);
        customerRepo.save(customer3);
    }

    @Test
    void saveCustomer(){
        Customer customer = new Customer("C001", "Navishka", "Galle", "Photo");
        Customer saveCustomer = customerRepo.save(customer);

        assertNotNull(saveCustomer);
    }

}