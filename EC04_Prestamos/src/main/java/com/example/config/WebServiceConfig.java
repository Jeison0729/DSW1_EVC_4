package com.example.config;

import org.apache.cxf.Bus;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebServiceConfig {
    private final Bus bus;

    public WebServiceConfig(Bus bus) {
        this.bus = bus;
    }
//    @Bean
//    public Endpoint endpoint() {
//        EndpointImpl endpoint = new EndpointImpl(bus, bonoService);
//        endpoint.publish("/BonoService");
//        return endpoint;
//    }
}
