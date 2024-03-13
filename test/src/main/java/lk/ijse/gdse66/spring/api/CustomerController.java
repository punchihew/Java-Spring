package lk.ijse.gdse66.spring.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

  /*------------------value Segment walin value pass karaganna Puluwan-------------------------*/



/*    @GetMapping*//*Query parameters get value*//*
    //out put null
    public String getMethod(String id){
       return String.format("GetMethod(String id) : %s",id) ;
    }*/


//    @GetMapping(params = "age")
//    //out put value get age
//    public String getMethod2( int age){
//        return String.format("GetMethod 2 (int age) : %s",age) ;
//    }

//    http://localhost:8080/app/customer?id=C001&name=Navishka&age=10
/*    @GetMapping(params = {"id","name","age"})
    public String getMethod3(String id,String name, int age){
        return String.format("GetMethod 3 (String id,int age,String name) : %s,%s,%s ",id,name,age) ;
    }*/


    /*http://localhost:8080/app/customer?id=C001*/
//    @GetMapping
//    public String getMethod4(@RequestParam String id){
//        return String.format("GetMethod 4 (String id) : %s ",id) ;
//    }

    /*http://localhost:8080/app/customer?id=C001*/
    @GetMapping(params = "id")
    public String getMethod5(@RequestParam(value = "id") String CusId){
        return String.format("GetMethod 5 (String id) : %s ",CusId) ;
    }

}
