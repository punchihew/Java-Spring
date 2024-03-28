package lk.ijse.api.spring;

import lk.ijse.api.spring.bean.SpringBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

         AnnotationConfigApplicationContext acx = new AnnotationConfigApplicationContext();
         acx.register(AppConfig.class);
         acx.refresh();

        SpringBean bean = acx.getBean(SpringBean.class);
        System.out.println(bean);


        SpringBean bean1 = acx.getBean(SpringBean.class);
        System.out.println(bean1 );

        acx.close();


    }
}
