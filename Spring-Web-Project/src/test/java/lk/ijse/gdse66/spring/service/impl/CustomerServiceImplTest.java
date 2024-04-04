package lk.ijse.gdse66.spring.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse66.spring.config.WebRootConfig;
import lk.ijse.gdse66.spring.dto.CustomerDto;
import lk.ijse.gdse66.spring.service.CustomerService;
import lk.ijse.gdse66.spring.service.exception.NotFoundException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith({SpringExtension.class})
@ContextConfiguration(classes = WebRootConfig.class)
@Transactional //not save database
//@SpringJUnitConfig
class CustomerServiceImplTest {
  
    @Autowired
    CustomerService customerService;
    CustomerDto addOnCustomer(){

        CustomerDto customerDto = new CustomerDto("C001", "Punchihewa", "Galle", "ProfilelUp");
        return customerService.saveCustomer(customerDto);
    }

    void AddAllCustomer(){

    }

    @Test  //test case ekak
    void getAllCustomers() {
        assertNotEquals("null",customerService.getAllCustomers());

    }

    @Test  //test case ekak
    void getCustomerDetails() {

        CustomerDto customerDto = new CustomerDto("C001", "Punchihewa", "Galle", "ProfilelUp");
        CustomerDto customer = customerService.saveCustomer(customerDto);

        assertDoesNotThrow(() -> customerService.getCustomerDetails(customerDto.getId()));

//        assertThrows(NotFoundException.class, () ->customerService.getCustomerDetails("C001"));
    }

    @Test
    void saveCustomer() {
        CustomerDto customerDto = new CustomerDto("C001", "Punchihewa", "Galle", "ProfilelUp");
        CustomerDto customer = customerService.saveCustomer(customerDto);

        assertNotEquals(null,customer);

        
    }

    @Test
    void updateCustomer() {
        CustomerDto customerDto = addOnCustomer();

        assertThrows(NotFoundException.class, () ->customerService.updateCustomer(new CustomerDto("C001", "lakshan", "Galle", "Profilel")));
    }


    @Test
    void deleteCustomer() {

        CustomerDto customerDto = addOnCustomer();
        assertThrows(NotFoundException.class,() ->customerService.deleteCustomer("C001"));

     }
}