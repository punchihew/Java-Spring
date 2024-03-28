package lk.ijse.gdse.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.*;

@Component
public class SpringBean {

    public SpringBean(@Qualifier("note") String[] nameList) {
        System.out.println("SpringBean() -- Constructor---" + nameList);
        System.out.println(Arrays.toString(nameList));
    }

    //bean naming thamai mean id eka thiyaganne ekai myString=IJSE kiyla enne
//    public SpringBean(Map<String,String> nameList) {
//        System.out.println("SpringBean() -- Constructor---" + nameList);
//        System.out.println(nameList);
//    }

//    @Autowired no need why this using contractor Autowired using Methoads
//    public SpringBean(List<String> nameList) {
//        System.out.println("SpringBean() -- Constructor---" + nameList);
//        System.out.println(nameList);
//    }

//    public SpringBean(Set<String> nameList) {
//        System.out.println("SpringBean() -- Constructor---" + nameList);
//        System.out.println( nameList);
//    }

//    public SpringBean(Collection<String> nameList) {
//        System.out.println("SpringBean() -- Constructor---" + nameList);
//        System.out.println( nameList);
//    }

    //    public SpringBean(List<Goodgirl> nameList) {
//        System.out.println("SpringBean() -- Constructor---" + nameList);
//        System.out.println(nameList);
//    }


}
