package com.xworkz.spring.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.config.EngineConfiguration;
import com.xworkz.spring.thing.Engine;

public class EngineRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(EngineConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBeanDefinitionCount());

		Engine refOfEngine = container.getBean(Engine.class);
		System.out.println(refOfEngine);


	}

}
