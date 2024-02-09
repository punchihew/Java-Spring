package lk.ijse.gdse.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("lahiru")
public class Boy {

    @Autowired
    private GoodGirl goodGirl;

    public Boy() {
        System.out.println("Boy Constructor");
        System.out.println("Have I Got aGirl Friend..." + goodGirl);

        GoodGirl sachini = new Sachini();
        sachini.love();
    }

    @PostConstruct
    public void initialize(){
        System.out.println("Have I Got aGirl Friend..." + goodGirl);

    }
}
