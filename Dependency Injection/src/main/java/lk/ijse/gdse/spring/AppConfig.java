package lk.ijse.gdse.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;


@ComponentScan
@Configuration
public class AppConfig {

//    public AppConfig() {
//        System.out.println("appConfig instance is created");
//    }

    @Order(3)
    @Bean //bean definition using object
    @Qualifier("note")
      public String myString1(){
          return "IJSE";
      }


    @Order(2)
    @Bean
    public String myString2(){
        return "ESOFT";
    }


    @Bean
    @Order(1)
    @Primary
    @Qualifier("note")
    public String myString3(){
        return "SLIIT";
    }






}
