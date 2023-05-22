package springboot.application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import springboot.pojo.Driver;
import springboot.service.Config;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Driver driverCar = context.getBean("driver_car",Driver.class);
        driverCar.getReadyToWork();
        Driver driverPickup = context.getBean("driver_pickup", Driver.class);
        driverPickup.getReadyToWork();
        Driver driverBus = context.getBean("driver_bus", Driver.class);
        driverBus.getReadyToWork();

    }
}
