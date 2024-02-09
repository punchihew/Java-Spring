package com.edu.ijse;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class JavaBean {
    public JavaBean() {
        System.out.println("Java Bean Instance Be Create");
    }
}
