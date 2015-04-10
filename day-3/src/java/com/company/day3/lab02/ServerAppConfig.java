package com.company.day3.lab02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

@Configuration
public class ServerAppConfig {

    @Bean
    public Greeter greeter(){
        return new GreeterImpl();
    }

    @Bean
    public RmiServiceExporter rmiServiceExporter(){
         RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setServiceName("GreeterService");
        rmiServiceExporter.setService(greeter());
        rmiServiceExporter.setServiceInterface(Greeter.class);
        rmiServiceExporter.setRegistryPort(1199);
        return rmiServiceExporter;
    }
}