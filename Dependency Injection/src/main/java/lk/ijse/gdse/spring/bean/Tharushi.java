package lk.ijse.gdse.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class Tharushi implements GoodGirl {

    @Override
    public void love() {
        System.out.println("Tharushi Lovers Him So Much");
    }
}
