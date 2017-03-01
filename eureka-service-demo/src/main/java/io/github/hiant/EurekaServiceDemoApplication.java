package io.github.hiant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaServiceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceDemoApplication.class, args);
    }
}
