package lk.ijse.gdse.spring;

import lk.ijse.gdse.spring.bean.Boy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

         AnnotationConfigApplicationContext acx = new AnnotationConfigApplicationContext();
         acx.register(AppConfig.class);
         acx.refresh();

        Boy boy1 = acx.getBean(Boy.class);
        System.out.println(boy1);

        System.out.println("------------------------------");

        Boy boy2 =acx.getBean(Boy.class);
        System.out.println(boy2);

    }
}
