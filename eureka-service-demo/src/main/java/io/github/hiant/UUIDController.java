package io.github.hiant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author liudong.work@gmail.com Created By: 2017.03.01 10:32
 */
@RestController
public class UUIDController {

    @Autowired
    EurekaServiceDemoApplication.Service service;

    /**
     * name="{@link UUIDController io.github.hiant.UUIDController}"
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(UUIDController.class);

    @GetMapping("/uuid")
    public String uuid() {
        LOGGER.info("{}", LOGGER);
        return UUID.randomUUID().toString() + "-" + service.now();
    }

}
