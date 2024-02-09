package lk.ijse.gdse.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan
@Configuration
public class AppConfig {

    public AppConfig() {
        System.out.println("appConfig instance is created");
    }


    }
