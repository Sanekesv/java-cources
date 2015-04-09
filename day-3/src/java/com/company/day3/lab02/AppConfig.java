package com.company.day3.lab02;

import com.company.day3.lab02.dao.MigrationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan("foo.bar.day03")
public class AppConfig {

    @Autowired
    MigrationDao migrationDao;

    @Bean
    public javax.sql.DataSource dataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(org.h2.Driver.class);
        dataSource.setUsername("sa");
        dataSource.setUrl("jdbc:h2:mem");
        dataSource.setPassword("");
        return dataSource;
    }


    @PostConstruct
    public void migrate() {
        migrationDao.migrate("day03/migrations/");
    }


}
