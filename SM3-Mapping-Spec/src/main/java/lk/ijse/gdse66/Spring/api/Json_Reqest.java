package lk.ijse.gdse66.Spring.api;


import lk.ijse.gdse66.Spring.dto.CustomerDto;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/json")
public class Json_Reqest {

    @PostMapping
    public String SaveCustomer(@ModelAttribute CustomerDto customer){
        return customer.toString();
    }
}
