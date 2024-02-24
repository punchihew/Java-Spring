package lk.ijse.gdse66.SpringConfigaration;

import lk.ijse.gdse66.SpringConfigaration.config.RootConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(RootConfig.class);
//        ctx.register(DAOConfig.class);
//        ctx.register(BOConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

    }
}
