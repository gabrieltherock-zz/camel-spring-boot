package com.gabriel.camelspringboot;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class OrderRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:orders?noop=true")
                .to("activemq:queue:orders");
    }
}
