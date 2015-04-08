package com.company.day2.lab06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("com.company.day2.lab06")
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public List<String> mailToList() {
        ArrayList<String> mailToList = new ArrayList<>();
        mailToList.add("sdfdsfds");
        mailToList.add("sdfdsfds1");
        mailToList.add("sdfdsfds2");
        mailToList.add("sdfdsfds3");
        return mailToList;
    }

}