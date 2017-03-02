package io.github.hiant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liudong.work@gmail.com Created By: 2017.03.01 10:32
 */
@RestController
public class TimeController {

    /**
     * name="{@link TimeController io.github.hiant.UUIDController}"
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(TimeController.class);

    @GetMapping("/now")
    public long now() {
        LOGGER.info("{}", LOGGER);
        return System.currentTimeMillis();
    }
}
