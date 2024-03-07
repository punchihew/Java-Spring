package lk.ijse.gdse66.Spring.api;


import lk.ijse.gdse66.Spring.dto.CustomerDto;
import org.springframework.web.bind.annotation.*;

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
}
