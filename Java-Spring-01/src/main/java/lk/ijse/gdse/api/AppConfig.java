package lk.ijse.gdse.api;

import com.edu.ijse.JavaBean;
import com.edu.ijse.SpringOne;
import lk.ijse.gdse.api.bean.SpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//two packge add with array
//@ComponentScan(basePackages = {"lk.ijse.gdse.api.bean","com.edu.ijse"})
//@ComponentScan(basePackages = "lk.ijse.gdse.api.bean")
//@ComponentScan(basePackageClasses = {SpringBean.class , SpringOne.class})
@ComponentScan(basePackages = "com.edu.ijse")
@Configuration
public class AppConfig {

    public AppConfig() {
        System.out.println("appConfig instance is created");
    }
//     @Bean this is a bean definition  access modifier static and non access use karanna puluwan
     @Bean(name = "Javabean")
    public JavaBean getjavabean(){
        return new JavaBean();

    }
}
