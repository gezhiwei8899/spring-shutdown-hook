package com.gezhiwei.springshutdownhook.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class TestController {

    @GetMapping("ok")
    public String ok() {
        try {
            TimeUnit.SECONDS.sleep(20L);
        } catch (InterruptedException e) {
            log.error("error: ", e);
        }
        return "ok";
    }

}
