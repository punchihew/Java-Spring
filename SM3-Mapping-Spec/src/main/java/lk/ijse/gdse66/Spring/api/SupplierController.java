package lk.ijse.gdse66.Spring.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @GetMapping
    public String getMethod(String id){
       return String.format("GetMethod(String id) : %s",id) ;
    }

//    @GetMapping
//    public String getMethod2(String name){
//        return String.format("GetMethod(String name) : %s",name) ;
//    }
}