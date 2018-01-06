package com.mlc.spring.netty.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringNettyServer {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = SpringApplication.run(SpringNettyServer.class, args);
        EchoServer echoServer = ctx.getBean(EchoServer.class);
        echoServer.start(8080);
    }

}
