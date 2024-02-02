package lk.ijse.gdse.api.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    public SpringBean() {
        System.out.println("Is springBean instance is create ");
    }
}
