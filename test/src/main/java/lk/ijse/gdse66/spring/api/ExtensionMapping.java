package lk.ijse.gdse66.spring.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exten")
public class ExtensionMapping {


    @GetMapping
    public String myMethoad() {
        return "ExtensionMapping Connect";
    }

    @GetMapping(path = "/.php")
    public String getMethoad7(){
        return "Extension Mapping";
    }

     //path Segment walin ena value ekak ganna puluwan
  /*  http://localhost:8080/app/exten/matara*/
//        @GetMapping("/{city}") //path verible
//    public String getCustomersByCity( @PathVariable String city){
//        return String.format("getCustomersByCity(String city) :%s ",city);
//    }

    @GetMapping("/{city}/{name}") //path verible
    public String getCustomersByCity2( @PathVariable String city ,@PathVariable String name){
        return String.format("getCustomersByCity(String city,String name) :%s,%s ",city,name);
    }

    @GetMapping(value = "/{city}") //path verible
    public String getCustomersByCity3( @PathVariable(name = "city") String CusCity){
        return String.format("getCustomersByCity(String city) :%s",CusCity);
    }

    @GetMapping("/{id:C\\d{3}}")
    public String getCustomerById(@PathVariable String id){
        return String.format("getCustomerById(String Id) :%s",id);
    }


}
