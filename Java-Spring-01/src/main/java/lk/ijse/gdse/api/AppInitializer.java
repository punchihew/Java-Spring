package lk.ijse.gdse.api;

import lk.ijse.gdse.api.bean.SpringBean;
import lk.ijse.gdse.api.bean.SpringBean2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        //jvm eka shutdown unma thami acx eka close wenne
//        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable(){
//            @Override
//            public void run() {
//                System.out.println(" JVM is about to shutdown");
//            }
//        }));


         AnnotationConfigApplicationContext acx = new AnnotationConfigApplicationContext();
         acx.register(AppConfig.class);
         acx.refresh();

         //context eke athule dewal access karanna puluwan
//         AppConfig bean = acx.getBean(AppConfig.class);
//         System.out.println(bean);

        //using annoation
//        SpringBean springBean = (SpringBean) acx.getBean("springBean");
//        System.out.println(springBean);

        //change bean name
        SpringBean sb = (SpringBean) acx.getBean("sb");
        System.out.println(sb);

//         SpringBean bean1 = acx.getBean(SpringBean.class);
//         System.out.println(bean1);
//
//         SpringBean2 bean2 = acx.getBean(SpringBean2.class);
//         System.out.println(bean2);
//
//         acx.close();
//
//        System.out.println(acx);
//        System.out.println(bean1);
//        bean1.myMethoad();

//        acx.close();//applicationContext shutdown context
//        acx.registerShutdownHook();//close context after shutdown JVM one moment





    }
}
