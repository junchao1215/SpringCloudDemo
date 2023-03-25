package com.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class ClientApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientApplication.class);
    public static void main(String[] args) {


        SpringApplication.run(ClientApplication.class, args);

    }

}
