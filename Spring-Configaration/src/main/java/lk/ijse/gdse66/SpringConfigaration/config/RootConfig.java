package lk.ijse.gdse66.SpringConfigaration.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

//multiple configuration
@Configuration
@ImportResource("classpath:sample.xml") // set xml configurations !
@ComponentScan("lk.ijse.gdse66.SpringConfigaration.bean")
@Import({boConfig.class , daoConfig.class}) // config other config classes !
public class RootConfig {
}
