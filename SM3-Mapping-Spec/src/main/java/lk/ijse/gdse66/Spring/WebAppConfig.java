package lk.ijse.gdse66.Spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "lk.ijse.gdse66.Spring.api")
public class WebAppConfig implements WebMvcConfigurer {
    public WebAppConfig() {
        System.out.println("WebAppConfig () -- Contractor");
    }


//    @Bean
//    public MyControllerOne myControllerOne(){
//        return new MyControllerOne();
//    }


}
