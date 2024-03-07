package lk.ijse.gdse66.Spring.api;


import lk.ijse.gdse66.Spring.dto.CustomerDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

//    @PostMapping
//    public String SaveCustomer(String id , String name , int age){
//        return String.format("SaveCustomer(String id,String Name,int Id) :%s,%s,%s" , id,name,age) ;
//    }

    @PostMapping
    public String SaveCustomer(@ModelAttribute CustomerDto customer){
        return customer.toString();
    }
}
