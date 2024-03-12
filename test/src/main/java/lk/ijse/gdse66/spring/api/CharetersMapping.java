package lk.ijse.gdse66.spring.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/char?")
@RequestMapping("/char??")
//@RequestMapping("/ch?ar??")
public class CharetersMapping {


    @GetMapping
    public String MyMethoad(){
        return "Charters Mapping Connect";
    }

}
