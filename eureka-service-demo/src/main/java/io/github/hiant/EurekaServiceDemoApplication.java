package io.github.hiant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaServiceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceDemoApplication.class, args);
    }

    @FeignClient("TIME")
    interface Service {

        @GetMapping("/now")
        long now();
    }
}
