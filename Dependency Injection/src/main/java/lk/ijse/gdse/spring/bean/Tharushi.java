package lk.ijse.gdse.spring.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("Long Hair")
public class Tharushi implements GoodGirl {

    public Tharushi() {
        System.out.println("Tharushi()--Constructor");
    }

    @Override
    public void love() {
        System.out.println("Tharushi Lovers Him So Much");
    }
}
