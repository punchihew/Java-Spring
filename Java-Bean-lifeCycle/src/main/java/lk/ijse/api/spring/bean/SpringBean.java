package lk.ijse.api.spring.bean;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public SpringBean() {
        System.out.println("Bean Instantiate");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware");
    }

    @Override
    public void setBeanName(String s) {

        System.out.println("Bean Name Aware >> " + s);

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean destroy ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Bean ApplicationContext Aware >>> " + applicationContext);
    }

    @PostConstruct//using annotation for initializing
    public void Initialing(){
        System.out.println("Initializing bean with Post Construct");
    }
     @PreDestroy//using annotation for destroy
    public void desposble(){
        System.out.println("Initializing bean with Pre Destroy");
    }
}
