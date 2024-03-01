package lk.ijse.gdse66.spring.web;

import lk.ijse.gdse66.spring.web.api.MyControllerOne;
import lk.ijse.gdse66.spring.web.api.MyControllerTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
public class WebAppConfig {
    public WebAppConfig() {
        System.out.println("WebAppConfig () -- Contractor");
    }
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        return resolver;
    }

    @Bean
    public MyControllerOne myControllerOne(){
        return new MyControllerOne();
    }

    @Bean
    public MyControllerTwo myControllerTwo(){
        return new MyControllerTwo();
    }
}
