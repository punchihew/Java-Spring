package lk.ijse.gdse66.Spring.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    /*http://localhost:8080/app/orders*/
//    @GetMapping
//    public String Getorders(@RequestHeader("X-token") String token){
//        return String.format("Getorders(String Token) :%s",token);
//    }

    @GetMapping//required = false X-token have not definitely if not assign null
    public String Getorders(@RequestHeader(value = "X-token",required = false) String token){
        return String.format("Getorders(String Token) :%s",token);
    }


}
