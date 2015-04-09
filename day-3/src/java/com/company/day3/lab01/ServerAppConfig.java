package com.company.day3.lab01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

@Configuration
public class ServerAppConfig {

    @Bean
    public AccountService accountService() {
        return new AccountServiceImpl();
    }

    @Bean
    public RmiServiceExporter serviceExporter() {
        RmiServiceExporter rmiExporter = new RmiServiceExporter();
        rmiExporter.setServiceName("AccountService");
        rmiExporter.setService(accountService());
        rmiExporter.setServiceInterface(AccountService.class);
        rmiExporter.setRegistryPort(1199);
        return rmiExporter;
    }

}
