package com.company.day2.lab05;

import com.company.day2.lab02.StringBuilderFactoryBean;
import com.company.day2.lab04.Quoter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;

import java.awt.*;

@PropertySource(value = "classpath:file.properties")
@Configuration
public class ApplicationConfig {

    @Autowired
    private StringBuilder stringBuilder;

    @Bean
    public PropertyPlaceholderConfigurer placeholderConfigurer() {
        return new PropertyPlaceholderConfigurer();
    }

    @Bean(name = "sdfdsf")
    @DependsOn("getMFileWriter")
    public MFileReader getMFileReader() {
        return new MFileReader();
    }

    @Bean
    public StringBuilderFactoryBean stringBuilder() throws Exception {
        StringBuilderFactoryBean factoryBean = new StringBuilderFactoryBean();
        factoryBean.setStart("start ");
        factoryBean.setFinish(" finish");
        factoryBean.setMiddle(" middle");
        return factoryBean;
    }


    @Bean
    public Quoter terminatorQuoter() {
        return new CustomQuoter(stringBuilder);
    }

    @Bean
    public Robot robot() throws AWTException {
        return new Robot();
    }

    @Bean
    public MFileWriter getMFileWriter() {
        return new MFileWriter();
    }

}