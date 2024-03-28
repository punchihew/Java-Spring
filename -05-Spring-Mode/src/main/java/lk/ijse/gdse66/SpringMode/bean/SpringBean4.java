package lk.ijse.gdse66.SpringMode.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBean4 {

    public SpringBean4() {
        System.out.println("bean 4 !!!!!!!!!!!!!!!!!");
    }

    @Bean
    public SpringBean2 setBeanTwo(){
        System.out.println("up method !!!!!");
        /*setBeanThree();
        setBeanThree();
        setBeanThree();*/
        SpringBean3 bean3 = setBeanThree();
        System.out.println("create up :"+bean3);
        return new SpringBean2(bean3); // wait
    }

    @Bean
    public SpringBean3 setBeanThree(){
        SpringBean3 ben3 = new SpringBean3();
        System.out.println("create down :"+ben3);
        return ben3;
    }


}
