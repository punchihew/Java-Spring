package lk.ijse.gdse.spring.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Tharushi implements GoodGirl {

    @Override
    public void love() {
        System.out.println("Tharushi Lovers Him So Much");
    }
}