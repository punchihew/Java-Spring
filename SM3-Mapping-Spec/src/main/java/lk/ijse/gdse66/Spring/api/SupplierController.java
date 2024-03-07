package lk.ijse.gdse66.Spring.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @GetMapping
    public String getMethod(){
       return "GetMethod()";
    }
}
