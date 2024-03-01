package lk.ijse.gdse66.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {

    private String name;
    private int age;
    private boolean isMale;
    private float temp;

    //no arges contractor
//    public SpringBean() {
//        System.out.println("Spring Bean Constructor");
//    }

//    all ares contractor
    @Autowired(required = false)
    public SpringBean(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        System.out.println("SpringBean(String,int,boolean");
        System.out.printf("name=%s,age=%s,isMale=%s\n",name,age,isMale);
    }

    //full args contractor
    //same satisfy paramete  rs thiyenm random thamai spring contractor eka ganne
    @Autowired(required = false)
    public SpringBean(String name, int age, boolean isMale,@Nullable float temp) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.temp = temp;
        System.out.println("SpringBean(String,int,boolean,float");
        System.out.printf("name=%s,age=%s,isMale=%s,temp=%s\n",name,age,isMale,temp);
    }

    @Autowired(required = false)
    public SpringBean(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("SpringBean(String,int");
        System.out.printf("name=%s,age=%s\n",name,age);
    }
}
