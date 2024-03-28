package lk.ijse.gdse66.SpringMode;

import lk.ijse.gdse66.SpringMode.bean.SpringBean2;
import lk.ijse.gdse66.SpringMode.bean.SpringBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("lk.ijse.gdse66.SpringMode.bean")
public class AppConfig {
    public AppConfig() {
        System.out.println("config");
    }

    // Full MOde

   /* @Bean//bean method
    public SpringBean2 passBeanTwo(){
        // inter bean dependency
        return new SpringBean2(passBeanThree());
    }

    @Bean//bean method
    public SpringBean3 passBeanThree(){
        return new SpringBean3();
    }*/

}
