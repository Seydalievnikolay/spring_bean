package springboot.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springboot.pojo.*;

@Configuration
public class Config {
    @Bean
    public Transport car() {
        return new Car();
    }
    @Bean
    public Transport pickup() {
        return new Pickup();
    }
    @Bean
    public Transport bus() {
        return new Bus();
    }
    @Bean(name = "driver_car")
    public Driver getDriverCarBean() {
        return new Driver("Frank", car());
    }
    @Bean(name = "driver_pickup")
    public Driver getDriverPickupBen() {
        return new Driver("Alonso", pickup());
    }
    @Bean(name = "driver_bus")
    public Driver getDriverBusBean() {

        return new Driver("Michael", bus());
    }

}
