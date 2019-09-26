package com.anton.service.config;

import com.anton.dao.config.DaoConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.anton.service")
@Import(DaoConfig.class)
public class ServiceConfig {

}
