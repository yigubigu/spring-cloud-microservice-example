package example.hystrix.turbine;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@SpringBootApplication
public class HystrixTurbineApplicationBoot {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HystrixTurbineApplicationBoot.class).web(true).run(args);
    }

}
