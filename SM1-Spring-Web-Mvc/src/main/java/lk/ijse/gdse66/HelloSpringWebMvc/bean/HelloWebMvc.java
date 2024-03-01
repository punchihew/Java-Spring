package lk.ijse.gdse66.HelloSpringWebMvc.bean;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWebMvc {
    public HelloWebMvc() {
        System.out.println("HelloWebMvc RestController");
    }
    //request handle
//    @GetMapping
//    public void myMethoad(){
//        System.out.println("myMethod Is Invoke ()");
//    }

    //response handle
    @GetMapping
    public String myMethoad(){
        System.out.println("myMethod Is Invoke ()");
        return "myMethoad";
    }
}
