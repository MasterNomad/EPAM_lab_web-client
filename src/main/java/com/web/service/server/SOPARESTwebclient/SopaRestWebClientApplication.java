package com.web.service.server.SOPARESTwebclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

import java.math.BigInteger;

@SpringBootApplication
@EnableCaching
public class SopaRestWebClientApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SopaRestWebClientApplication.class, args);
    }

}
