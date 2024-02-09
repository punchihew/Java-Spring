package lk.ijse.gdse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("lahiru")
public class Boy  implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    @Autowired
    private GoodGirl goodGirl;

    public Boy() {
        System.out.println("Boy Constructor");
        System.out.println("Have I Got aGirl Friend..." + goodGirl);

        GoodGirl sachini = new Sachini();
        sachini.love();
    }

    @PostConstruct//popolete proprties eka gvawadi thamai add wenne controcter ekfi dd wenne nh depencies injectionn
    public void initialize(){
        System.out.println("Have I Got aGirl Friend..." + goodGirl);

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void setBeanName(String s) {

    }

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
