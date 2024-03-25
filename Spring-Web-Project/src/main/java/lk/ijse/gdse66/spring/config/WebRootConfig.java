package lk.ijse.gdse66.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse66.spring.services")
public class WebRootConfig {
    public WebRootConfig() {
        System.out.println("WebRootConfig () -- Contractor");
    }
}
