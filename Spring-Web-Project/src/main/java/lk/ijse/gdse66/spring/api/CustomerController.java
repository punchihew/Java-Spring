package lk.ijse.gdse66.spring.api;

import lk.ijse.gdse66.spring.dto.CustomerDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/customers")
public class CustomerController {


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CustomerDto> getAllCustomers(){

        ArrayList<CustomerDto> customerList = new ArrayList<>();
        customerList.add(new CustomerDto("C001","Navishka","Matara"));
        customerList.add(new CustomerDto("C002","lakshan","Galle"));
        customerList.add(new CustomerDto("C003","Savinda","Thangalla"));

        return customerList;

    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveCustomer(@RequestBody CustomerDto customer){
        System.out.println(customer);
    }
}
