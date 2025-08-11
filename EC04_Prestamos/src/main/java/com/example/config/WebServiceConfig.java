package com.example.config;

import com.example.services.SolicitudService;
import com.example.services.SolicitudServiceImpl;
import jakarta.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebServiceConfig {
    private final Bus bus;
    private final SolicitudServiceImpl solicitudServiceImpl;  // la implementación anotada

    public WebServiceConfig(Bus bus, SolicitudServiceImpl solicitudServiceImpl) {
        this.bus = bus;
        this.solicitudServiceImpl = solicitudServiceImpl;
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, solicitudServiceImpl);
        endpoint.publish("/solicitudService");
        return endpoint;
    }
}

