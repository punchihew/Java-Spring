package lk.ijse.gdse.api;

import com.edu.ijse.JavaBean;
import com.edu.ijse.SpringOne;
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
//        SpringBean sb = (SpringBean) acx.getBean("sb");
//        System.out.println(sb);

//        Object springbean3 = acx.getBean("springBean3");
//        System.out.println(springbean3);

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

          //explicitly concept
        acx.registerShutdownHook();
//        boolean isExistJavaBeanDifinition = acx.containsBeanDefinition("getjavabean");
//        System.out.println(isExistJavaBeanDifinition);
//        boolean isExistBeanOneDifi = acx.containsBeanDefinition("SpringOne");
//        System.out.println(isExistJavaBeanDifinition);
        //defult name changing
//        JavaBean bean = (JavaBean) acx.getBean("Javabean");
//        System.out.println(bean);

        SpringOne bean = acx.getBean(SpringOne.class);
        System.out.println(bean);

        SpringOne bean1 = acx.getBean(SpringOne.class);
        System.out.println(bean1);

    }
}
