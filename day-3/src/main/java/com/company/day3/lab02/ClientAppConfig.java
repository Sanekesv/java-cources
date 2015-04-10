package com.company.day3.lab02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@Configuration
public class ClientAppConfig {

    @Bean
    public RmiProxyFactoryBean rmiProxyFactoryBean (){
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceUrl("rmi://localhost:1199/GreeterService");
        rmiProxyFactoryBean.setServiceInterface(Greeter.class);
        return rmiProxyFactoryBean;
    }
}