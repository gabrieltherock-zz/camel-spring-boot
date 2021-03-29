package com.gabriel.camelspringboot;

import org.apache.camel.CamelContext;
import org.apache.camel.component.activemq.ActiveMQComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CamelSpringBootApplication {

    @Autowired
    private CamelContext context;

    @PostConstruct
    public void init() throws Exception {
        context.addComponent("activemq", ActiveMQComponent.activeMQComponent("tcp://localhost:61616"));
    }

    public static void main(String[] args) {
        SpringApplication.run(CamelSpringBootApplication.class, args);
    }
}
