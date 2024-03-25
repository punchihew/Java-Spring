package lk.ijse.gdse66.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"lk.ijse.gdse66.spring.services","lk.ijse.gdse66.spring.repository"})
@Import(JPAConfig.class) //
public class WebRootConfig {
    public WebRootConfig() {
        System.out.println("WebRootConfig () -- Contractor");
    }
}
