package lk.ijse.gdse66.SpringConfigaration.bo;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class BOSpringBean {

    public BOSpringBean() {
        System.out.println("BOSpringBean() - Constructor");
    }

    public BOSpringBean boSpringBean(){
        return new BOSpringBean();
    }
}
