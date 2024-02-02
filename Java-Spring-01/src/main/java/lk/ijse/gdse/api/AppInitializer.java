package lk.ijse.gdse.api;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
         AnnotationConfigApplicationContext acx = new AnnotationConfigApplicationContext();
         acx.register(AppConfig.class);
         acx.refresh();
    }
}
