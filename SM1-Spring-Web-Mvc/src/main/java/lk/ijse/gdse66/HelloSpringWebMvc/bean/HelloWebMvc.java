package lk.ijse.gdse66.HelloSpringWebMvc.bean;

import org.springframework.web.bind.annotation.*;

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
//    @GetMapping
//    public String myMethoad(){
//        System.out.println("myMethod Is Invoke ()");
//        return "myMethoadGet";
//    }

//    @PostMapping
//    public void myMethoad(){
//        System.out.println("myMethod Is Invoke ()");
////        return "myMethoadGet";
//    }

//    @PostMapping
//    public String myMethoad(){
//        System.out.println("myMethod 1 Is Invoke ()");
//        return "myMethoadPost";
//    }
//    @PostMapping("/two")
//    public String myMethoad2(){
//        System.out.println("myMethod 2  Is Invoke ()");
//        return "myMethoadPost";
//    }

    @DeleteMapping
    public String myMethoad2(){
        System.out.println("myMethod 2  Is Invoke ()");
        return "myMethoadDelete";
    }


}
