package lk.ijse.gdse66.spring.api;

import lk.ijse.gdse66.spring.dto.CustomerDto;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
    @RequestMapping("/suplier")
public class SupplierController {

//    @PostMapping
//    public String SaveCustomer(String id , String name , int age){
//        return String.format("SaveCustomer(String id,String Name,int Id) :%s,%s,%s" , id,name,age) ;
//    }

//    @PostMapping not working
//    public String SaveCustomer2(@ModelAttribute String id , @ModelAttribute String name , @ModelAttribute int age){
//        return String.format("SaveCustomer 2 (String id,String Name,int Id) :%s,%s,%s" , id,name,age) ;
//    }

    @PostMapping
    public String SaveCustomer3(@ModelAttribute CustomerDto customer){
        return customer.toString();
    }
}
