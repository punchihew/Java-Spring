package lk.ijse.gdse66.RuntimeInjection;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


//runtime value injection
@Component


public class bean implements InitializingBean {

    @Value("Colombo , Srilanka")
    String address;

    @Value("${app.baseUrl}") // using place holders
    String baseUrl;

    @Value("${app.password}") // using place holders
    String password;

    @Value("${app.user}") // using place holders
    String user;

    public bean(
            @Value("10") int x//runtime value inject
            , @Value("20.5") double y
            , @Value("true") boolean b
            , @Value("A") char c
            , @Value("Navishka") String name
            , @Value("10, 10 ,20, 30, 40") int[] arr
            , @Value("10.5,90.5 ,40.4,5,5") List<String> floats
    ) {
        System.out.println(x);
        System.out.println(y);
        System.out.println(b);
        System.out.println(c);
        System.out.println(name);
        System.out.println(Arrays.toString(arr));
        System.out.println(floats);
        System.out.println(address);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(address);
        System.out.println(baseUrl);
        System.out.println(password);
        System.out.println(user);
    }
}

