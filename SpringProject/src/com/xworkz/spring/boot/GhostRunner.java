package com.xworkz.spring.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.xworkz.spring.config.GhostConfiguration;
import com.xworkz.spring.thing.Engine;
import com.xworkz.spring.thing.Ghost;

public class GhostRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(GhostConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBeanDefinitionCount());

		Ghost refOfEngine = container.getBean(Ghost.class);
		System.out.println(refOfEngine);
	}

}
