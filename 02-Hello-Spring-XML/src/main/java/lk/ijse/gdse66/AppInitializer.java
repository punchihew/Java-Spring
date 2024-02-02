package lk.ijse.gdse66;

import lk.ijse.gdse66.bean.SpringBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext act = new AnnotationConfigApplicationContext("context.xml");
        act.register(SpringBean.class);
        SpringBean bean = act.getBean(SpringBean.class);
        System.out.println(bean);

    }
}
