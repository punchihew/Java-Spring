package lk.ijse.gdse66.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {

    private String name;
    private int age;
    private boolean isMale;

//    public SpringBean() {
//        System.out.println("Spring Bean Constructor");
//    }

    //all ares contractor
    public SpringBean(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }
}
