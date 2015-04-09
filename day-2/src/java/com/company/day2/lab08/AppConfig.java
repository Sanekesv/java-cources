package com.company.day2.lab08;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.company.day2.lab08")
public class AppConfig {


    @Bean
    public CustomScopeConfigurer scopeConfigurer(FiveMinScope fiveMinScope) {
        CustomScopeConfigurer customScopeConfigurer = new CustomScopeConfigurer();
//        customScopeConfigurer.addScope("fiveMinScope", fiveMinScope);
        return customScopeConfigurer;
    }
}