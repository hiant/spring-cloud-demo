package io.github.hiant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author liudong.work@gmail.com Created By: 2017.03.01 10:32
 */
@RestController
public class UUIDController {

    @GetMapping("/uuid")
    public String uuid() {
        return UUID.randomUUID().toString();
    }
}
