package com.gezhiwei.springshutdownhook.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
@Slf4j
public class ShutdownService implements DisposableBean {


    @Override
    public void destroy() throws Exception {
        log.info("I am shutdown ing...");
        TimeUnit.SECONDS.sleep(10);
        log.info("I am shutdown");

    }
}
