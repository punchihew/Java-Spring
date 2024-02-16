package lk.ijse.gdse.spring.bean;

import lk.ijse.gdse.spring.util.Injector;
import lk.ijse.gdse.spring.util.WhiteFace;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("lahiru")
public class Boy  implements  BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
   //property field injections

//    @Autowired
//    private GoodGirl goodGirl;

  //spring setter methoad injection
//    private GoodGirl goodGirl;
//    @Autowired
//    public void setGoodGirl(GoodGirl goodGirl){
//        this.goodGirl = goodGirl;
//    }

//    private GoodGirl goodGirl;

    //setter methoad injection
//    private GoodGirl goodGirl;
//    //interface
//    @Autowired
//    public void setGoodGirl(){
//
//    }


//    public Boy() {
//        System.out.println("Boy Constructor");
//        System.out.println("Constructor Have I Got aGirl Friend..." + goodGirl);
//
//        GoodGirl sachini = new Sachini();
//        sachini.love();
//    }

    //Constructor Injection

    private GoodGirl goodGirl;

  @Autowired
    public Boy(@Qualifier("Long Hair")  @WhiteFace GoodGirl girl) {
        this.goodGirl = girl;
        System.out.println("Boy Constructor");
        System.out.println("Constructor Have I Got aGirl Friend..." + girl);
        girl.love();
//        GoodGirl sachini = new Sachini();
//        sachini.love();
    }
    public Boy(){
        System.out.println("Boy() - Contractor");
    }

    //interface injection

//
//    @Override
//    public void inject(GoodGirl goodGirl) {
//        this.goodGirl = goodGirl;
//
//    }



    @PostConstruct//popolete proprties eka gvawadi thamai add wenne controcter ekfi dd wenne nh depencies injectionn
    public void initialize(){
        System.out.println("Have I Got aGirl Friend..." + goodGirl);

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Boy>> setBeanFactory...");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Boy >> setBeanName.....");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Boy >>> destroy...");

    }

    @Override
    public void afterPropertiesSet() throws Exception {

//        System.out.println("Boy >>> afterPropertiesSet...");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Boy >> setApplicationContext....");
    }


}
