package com.pravin.tutorial.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
	return new Class[] {};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
	return new Class[] { webConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
	return new String[] { "/" };
    }

}
