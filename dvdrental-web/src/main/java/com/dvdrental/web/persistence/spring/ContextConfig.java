package com.dvdrental.web.persistence.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by atul on 1/22/2018.
 */
@Configuration
@ComponentScan(basePackages = "com.dvdrental.web")
@Import(JPAConfig.class)
public class ContextConfig {
}
