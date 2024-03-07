package lk.ijse.gdse66.Spring.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping
    public String getCustomers(){
        return "Get Customers Controller";
    }

//    @GetMapping("/city")
//    @GetMapping("/{city}") //path verible
//    public String getCustomersByCity( @PathVariable String city){
//        return String.format("getCustomersByCity(String city) :%s ",city);
////        return "getCustomersByCity()";
//    }

//    @GetMapping("/{city}/{name}")
//    public String getCustomersByName( @PathVariable String name , @PathVariable String city){
//        return String.format("getCustomersByName(String city,String name) :%s,%s ",city,name  );
//
//    }
    @GetMapping("/{city}/{name}")
    public String getCustomersByName( @PathVariable("name") String CusName , @PathVariable String city){
        return String.format("getCustomersByName(String city,String name) :%s,%s ",city,CusName  );

    }

    @GetMapping("/{id:C\\d{3}}")
    public String getCustomerById(@PathVariable String id){
        return String.format("getCustomerById(String Id) :%s",id);
    }
}
