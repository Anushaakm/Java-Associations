package com.xworkz.di.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.di.bridge.Browser;
import com.xworkz.di.configuration.BrowserConfiguration;

public class BrowserRunner {

	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(BrowserConfiguration.class);
		Browser browser=container.getBean("chrome",Browser.class);
		browser.browse();
	}

}
