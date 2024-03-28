package lk.ijse.gdse66.RuntimeInjection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan
@PropertySource("classpath:Apllication.properties") // Introducing Resource Bundle
public class AppConfig {


}
