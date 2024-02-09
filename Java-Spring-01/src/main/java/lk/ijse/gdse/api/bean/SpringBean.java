package lk.ijse.gdse.api.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
//two type id bean id

//@Component(value = "sb")
@Component("sb")
public class SpringBean {
    public SpringBean() {
        System.out.println(" springBean 1 instance is create ");
    }

//    public void myMethoad(){
//        System.out.println("Calling My Method is invoke");
//    }
}
