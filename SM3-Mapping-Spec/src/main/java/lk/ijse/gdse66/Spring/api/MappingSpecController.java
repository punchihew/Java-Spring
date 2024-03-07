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

           /* pathMapping */
    /*http://localhost:8080/app/customer/hello/gdse///////*/

    @GetMapping(path = "/hello/gdse")
    public String getMethoad3(){
        return " Path Mapping ";
    }


          /* Character Mapping */
 /*   @GetMapping(path = "/hello/gdse?") */
/*    @GetMapping(path = "/hello/gdse???") */

    @GetMapping(path = "/hello/gd?se")
    public String getMethoad4(){
        return "Character Mapping";
    }


       /*WildCrad Mapping*/
/*http://localhost:8080/app/customer/hello/ab/gdse  */
/*http://localhost:8080/app/customer/hello/ab/gdse///////*/
     /*any only one segment */
    /*@GetMapping(path = "/hello/gdse/*")*/

    @GetMapping(path = "/hello/*/gdse")
    public String getMethoad5(){
        return "WildCard Mapping";
    }
}
