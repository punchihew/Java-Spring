package lk.ijse.gdse.api;

import com.edu.ijse.JavaBean;
import com.edu.ijse.SpringOne;
import lk.ijse.gdse.api.bean.SpringBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//two packge add with array
//@ComponentScan(basePackages = {"lk.ijse.gdse.api.bean","com.edu.ijse"})
//@ComponentScan(basePackages = "lk.ijse.gdse.api.bean")
@ComponentScan(basePackageClasses = {SpringBean.class , SpringOne.class})
@Configuration
public class AppConfig {

//    public AppConfig() {
//        System.out.println("appConfig instance is created");
//    }

    public JavaBean getjavabean(){
        return new JavaBean();

    }
}
