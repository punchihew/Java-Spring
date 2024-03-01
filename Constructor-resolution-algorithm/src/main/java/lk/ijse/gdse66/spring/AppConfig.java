package lk.ijse.gdse66.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;


@ComponentScan
@Configuration
public class AppConfig {

    @Bean
    public String myString(){
        return "amal";
    }


    @Bean
    public Integer myInt(){
        return 21;
    }

    @Bean
    public boolean myBoolean(){
        return true;
    }

}
