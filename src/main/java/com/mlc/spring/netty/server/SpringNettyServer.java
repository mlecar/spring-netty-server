package com.mlc.spring.netty.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;

@Controller
@EnableAutoConfiguration
public class SpringNettyServer {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringNettyServer.class, args);
        new EchoServer(8080).start();
    }

}
