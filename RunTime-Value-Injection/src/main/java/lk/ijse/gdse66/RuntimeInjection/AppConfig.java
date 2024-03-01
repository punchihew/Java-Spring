package lk.ijse.api.RunTimeInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/22/2024
 */

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class AppConfig {
    
    /*public AppConfig() {
        System.out.println("AppConfig() - Constructor");
    }*/

    /*@Bean
    public String getString(){
        return "IJSE";
    }*/


}
