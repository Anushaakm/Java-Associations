package com.xworkz.spring.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.config.ParleGConfig;

public class SpringRunner {

	public static void main(String[] args) {
		
		
				ApplicationContext spring = new AnnotationConfigApplicationContext(ParleGConfig.class);
				String[] beansName = spring.getBeanDefinitionNames();
				System.out.println(Arrays.toString(beansName));
				String refofString1 = spring.getBean("name", String.class);
				String refofString2 = spring.getBean("location", String.class);
				String refofString3 = spring.getBean("addedItems", String.class);
				String refofString4 = spring.getBean("company", String.class);
				String refofString5 = spring.getBean("owner", String.class);

				System.out.println(refofString1.hashCode());
				System.out.println(refofString2.hashCode());
				System.out.println(refofString3.hashCode());
				System.out.println(refofString4.hashCode());
				System.out.println(refofString5.hashCode());

				System.out.println("===================================================================");
				String[] beansName1 = spring.getBeanDefinitionNames();
				System.out.println(Arrays.toString(beansName1));

				StringBuffer ref1 = spring.getBean("companyName", StringBuffer.class);
				StringBuffer ref2 = spring.getBean("brandName", StringBuffer.class);
				StringBuffer ref3 = spring.getBean("firstName", StringBuffer.class);
				StringBuffer ref4 = spring.getBean("lastName", StringBuffer.class);
				StringBuffer ref5 = spring.getBean("location", StringBuffer.class);
				//System.out.println(ref.hashCode());
				

				List<Integer> list = spring.getBean("arrayListValues", ArrayList.class);
				System.out.println(list);

				Map<String, Integer> map = spring.getBean("mapCityAndPincodes", Map.class);
				System.out.println(map);

			}

		}
		
		
