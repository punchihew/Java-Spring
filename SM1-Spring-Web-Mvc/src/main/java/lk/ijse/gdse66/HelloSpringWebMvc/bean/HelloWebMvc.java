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
    @GetMapping
    public void myMethoad(){
        System.out.println("myMethod Invoke");
    }
}
