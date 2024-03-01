package lk.ijse.gdse66.spring.web;

import lk.ijse.gdse66.spring.web.api.MyControllerOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class WebAppConfig {
    public WebAppConfig() {
        System.out.println("WebAppConfig () -- Contractor");
    }

    @Bean
    public MyControllerOne myControllerOne(){
        return new MyControllerOne();
    }
}
