package lk.ijse.gdse66.SpringMode.bean;

public class SpringBean2 {

    private SpringBean3 springBean3;

    public SpringBean2(SpringBean3 springBean3) {
        System.out.println("SpringBean 2 ()---- Constructor");
        this.springBean3 = springBean3;
    }

}
