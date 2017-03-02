package io.github.hiant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaServiceComplexDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceComplexDemoApplication.class, args);
    }
}
