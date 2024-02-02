package lk.ijse.gdse.api;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "lk.ijse.gdse.api.bean")
@Configuration
public class AppConfig {
    public AppConfig() {
        System.out.println("appConfig instance is created");
    }
}
