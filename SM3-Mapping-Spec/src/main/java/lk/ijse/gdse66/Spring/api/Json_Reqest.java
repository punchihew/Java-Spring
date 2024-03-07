package lk.ijse.gdse66.Spring.api;


import lk.ijse.gdse66.Spring.dto.CustomerDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/json")
public class Json_Reqest {

//    @PostMapping
//    public String SaveCustomer(String id , String name , int age){
//        return String.format("SaveCustomer(String id , String name , int age) : %s.%s.%s",id,name,age);
//    }

//    @PostMapping
//    public String SaveCustomer(@RequestBody CustomerDto customer){
//        return customer.toString();
//    }


    @GetMapping(produces = "application/json")
    public CustomerDto getSuplier(){
        return new CustomerDto("C001","Navishka",20);
    }


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CustomerDto> GetAllSuplier(){
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();
        customerDtos.add(new CustomerDto("C001","Navishka",20));
        customerDtos.add(new CustomerDto("C002","Punchihewa",21));
        customerDtos.add(new CustomerDto("C003","Kamal",22));

        return customerDtos;
    }
}
