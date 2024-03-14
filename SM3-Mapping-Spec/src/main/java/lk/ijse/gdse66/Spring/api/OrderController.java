package lk.ijse.gdse66.Spring.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping
    public String Getorders(@RequestHeader String token){
        return String.format("Getorders(String Token) :%s",token);
    }
}
