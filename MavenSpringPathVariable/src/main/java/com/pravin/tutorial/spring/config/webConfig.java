package com.pravin.tutorial.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.pravin.tutorial.spring.controller" })
public class webConfig extends WebMvcConfigurerAdapter {

    @Bean
    public InternalResourceViewResolver resolver() {
	InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
	internalResourceViewResolver.setViewClass(JstlView.class);
	internalResourceViewResolver.setPrefix("/WEB-INF/views/");
	internalResourceViewResolver.setSuffix(".jsp");
	return internalResourceViewResolver;
    }
}
