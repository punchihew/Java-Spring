package lk.ijse.gdse.api;

import lk.ijse.gdse.api.bean.SpringBean;
import lk.ijse.gdse.api.bean.SpringBean2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
         AnnotationConfigApplicationContext acx = new AnnotationConfigApplicationContext();
         acx.register(AppConfig.class);
         acx.refresh();


         //context eke athule dewal access karanna puluwan
         AppConfig bean = acx.getBean(AppConfig.class);
         System.out.println(bean);

        SpringBean bean1 = acx.getBean(SpringBean.class);
        System.out.println(bean1);

        acx.close();//applicationContext shutdown context

        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("Runnable Method");
            }
        }));

//        SpringBean2 bean2 = acx.getBean(SpringBean2.class);
//        System.out.println(bean2);
    }
}
