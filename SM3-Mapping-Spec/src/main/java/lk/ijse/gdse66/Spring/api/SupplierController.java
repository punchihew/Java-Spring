package lk.ijse.gdse66.Spring.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @GetMapping/*Query parameters get value*/
    public String getMethod(String id){
       return String.format("GetMethod(String id) : %s",id) ;
    }

    @GetMapping(params = "age")
    public String getMethod2( int age){
        return String.format("GetMethod(int age) : %s",age) ;
    }

    @GetMapping(params = "age")
    public String getMethod3(String id,String name, int age){
        return String.format("GetMethod(String id,int age,String name) : %s,%s,%s ",id,name,age) ;
    }
}