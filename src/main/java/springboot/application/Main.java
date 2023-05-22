package springboot.application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import springboot.pojo.Driver;
import springboot.service.Config;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Driver driver = context.getBean(Driver.class);
        driver.getReadyToWork();

    }
}
