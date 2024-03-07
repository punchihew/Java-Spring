package lk.ijse.gdse66.Spring.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @PostMapping
    public String SaveCustomer(String id , String name , int age){
        return String.format("SaveCustomer(String id,String Name,int Id) :%s,%s,%s" , id,name,age) ;
    }
}
