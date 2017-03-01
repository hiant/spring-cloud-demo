package io.github.hiant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaClientDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(EurekaClientDemoApplication.class, args);
        Service service = context.getBean(Service.class);
        System.out.println(service.uuid());
    }

    @FeignClient("UUID")
    interface Service {

        @GetMapping("/uuid")
        String uuid();
    }
}
