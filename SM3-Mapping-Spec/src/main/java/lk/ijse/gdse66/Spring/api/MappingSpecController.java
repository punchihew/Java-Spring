package lk.ijse.gdse66.Spring.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class MappingSpecController {
    public MappingSpecController() {
        System.out.println("MyControllerOne()-- Contractor");
    }

    @GetMapping
    public String getMethod(){
        return "My Controller One";
    }

    @GetMapping(path = "/hello") //path segment(/hello)
    public String getMethoad2(){
        return "Mapping Spec Controller";
    }
}
