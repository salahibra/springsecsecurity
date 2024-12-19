package com.xproce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;

import org.springframework.security.provisioning.JdbcUserDetailsManager;


import javax.sql.DataSource;
@Configuration
public class ProjectSecurityConfigMYSQL {
    @Bean
    public UserDetailsService userDetailsService(DataSource datasource){
        return new JdbcUserDetailsManager(datasource);
    }

}
