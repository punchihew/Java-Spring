package com.edu.ijse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class SpringOne {
    public SpringOne() {
        System.out.println("Com.edu.ijse.SpringOne");
    }
}
