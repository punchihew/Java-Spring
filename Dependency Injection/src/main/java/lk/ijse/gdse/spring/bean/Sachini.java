package lk.ijse.gdse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("Long Hair")
public class Sachini  implements GoodGirl, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public Sachini() {

    }

    @Override
    public void love() {
        System.out.println("Sachini Lovers Him So Much");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Girl>> setBeanFactory...");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Girl >> setBeanName.....");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Girl >>> destroy...");


    }

    @Override
    public void afterPropertiesSet() throws Exception {


        System.out.println("Girl >>> afterPropertiesSet...");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Girl >> setApplicationContext....");
    }
}
