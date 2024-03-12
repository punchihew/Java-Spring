package lk.ijse.gdse66.spring.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/wild///")
//@RequestMapping("/wild/hello//")
 @RequestMapping("/wild/hello/new///")
public class WildCardMapping {


    @GetMapping
    public String MyMethoad(){
        return "WildCard Mapping Correct";
    }

}
