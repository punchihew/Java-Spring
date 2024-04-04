package lk.ijse.gdse66.hellospringboot.api;

import lk.ijse.gdse66.hellospringboot.dto.CustomerDTO;
import lk.ijse.gdse66.hellospringboot.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @version: v0.0.1
 * @author: Navishka
 * @date: 4/4/2024
 */
@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

   private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    List<CustomerDTO> getAllCustomer(){
       return customerService.getAllCustomers();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.saveCustomer(customerDTO );
    }
}
