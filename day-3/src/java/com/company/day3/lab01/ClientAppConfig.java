package com.company.day3.lab01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@Configuration
public class ClientAppConfig {

    @Bean
    @DependsOn("accountService")
    public SimpleObject simpleObject(AccountService accountService) {
        SimpleObject simpleObject = new SimpleObject();
        simpleObject.setAccountService(accountService);
        return simpleObject;
    }

    @Bean
    public RmiProxyFactoryBean accountService() {
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceUrl("rmi://localhost:1199/AccountService");
        rmiProxyFactoryBean.setServiceInterface(AccountService.class);
        return rmiProxyFactoryBean;
    }
}
