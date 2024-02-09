package lk.ijse.gdse.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class Sachini  implements GoodGirl{
    public Sachini() {

    }

    @Override
    public void love() {
        System.out.println("Sachini Constructor");
    }
}
