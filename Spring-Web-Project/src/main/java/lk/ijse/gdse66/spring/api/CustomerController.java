package lk.ijse.gdse66.spring.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    public String myMethoad(){
        return "Hi";
    }
}
