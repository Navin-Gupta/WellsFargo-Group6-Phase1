package com.wf.training.spring.factory.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// treat this class as config class
@Configuration
// packages to scan
@ComponentScan("com.wf.training.spring.factory")
// loading the property file
@PropertySource("classpath:repository.properties")
public class MyConfig {

}
