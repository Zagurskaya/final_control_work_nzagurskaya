package com.gmail.zagurskaya.control.config;

import javax.sql.DataSource;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LiquibaseConfig {

    @Bean
    public SpringLiquibase liquibase(DataSource dataSource) {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setChangeLog("classpath:migrations/db-changelog.xml");
        liquibase.setDataSource(dataSource);
        return liquibase;
    }

}


