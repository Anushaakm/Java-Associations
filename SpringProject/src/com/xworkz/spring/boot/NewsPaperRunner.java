package com.xworkz.spring.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.config.NewsPaperConfiguration;
import com.xworkz.spring.thing.NewsPaper;

public class NewsPaperRunner {

	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(NewsPaperConfiguration.class);
		
		String[] beansName = container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beansName));
		
		System.out.println(container.getBeanDefinitionCount());

		NewsPaper refOfPaper = container.getBean(NewsPaper.class);
		System.out.println(refOfPaper);
		
	}

}
