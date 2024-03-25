package lk.ijse.gdse66.spring.api;

import lk.ijse.gdse66.spring.dto.CustomerDto;
import lk.ijse.gdse66.spring.services.CustomerService;
import lk.ijse.gdse66.spring.services.CustomerServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired   //propriety dependency injection nn loosely couple using CustomerServices
    CustomerService customerServices;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CustomerDto> getAllCustomers(){
      return customerServices.getAllCustomer();
//        ArrayList<CustomerDto> customerList = new ArrayList<>();
//        customerList.add(new CustomerDto("C001","Navishka","Matara"));
//        customerList.add(new CustomerDto("C002","lakshan","Galle"));
//        customerList.add(new CustomerDto("C003","Savinda","Thangalla"));



    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCustomer(@RequestBody CustomerDto customer){
      customerServices.saveCustomer(customer);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable("id") String id){
        customerServices.deleteCustomer(id);

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping(value = "/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateCustomer(@PathVariable("id") String id,@RequestBody CustomerDto customer){
        customerServices.updateCustomer(customer);

    }

    @GetMapping("/{id}")
    public CustomerDto getCustomerDetails(@PathVariable("id") String id){

        return customerServices.getCustomerDetails(id);
    }
}
