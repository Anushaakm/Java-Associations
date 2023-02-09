package com.xworkz.bakery.configuratin;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BekeryWebInitConfig 
extends AbstractAnnotationConfigDispatcherServletInitializer
implements WebMvcConfigurer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running : getRootConfigClasses ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses");
		Class[] class1 = { SpringConfiguration.class };
		System.out.println("Creating " + Arrays.toString(class1));
		return class1;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletConfigClasses ");
		String[] ref = { "/" };
		System.out.println("Creating  : " + Arrays.toString(ref));
		return ref;
	}
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running configureDefaultServletHandling");
		configurer.enable();
	}

}
