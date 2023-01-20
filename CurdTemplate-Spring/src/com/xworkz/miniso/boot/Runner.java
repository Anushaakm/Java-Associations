package com.xworkz.miniso.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.miniso.configuration.SpringConfiguration;
import com.xworkz.miniso.dto.FirstAidDTO;
import com.xworkz.miniso.dto.MissileDTO;
import com.xworkz.miniso.dto.ResortDTO;
import com.xworkz.miniso.service.FirstAidService;
import com.xworkz.miniso.service.MissileService;
import com.xworkz.miniso.service.ResortService;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		FirstAidService service= container.getBean(FirstAidService.class);
		boolean saved=service.validateAndSave(new FirstAidDTO());
		System.out.println("Saved FirstAid data"+saved);
		
		MissileService service2=container.getBean(MissileService.class);
		boolean saved2=service2.validateAndSave(new MissileDTO());
		System.out.println("Saved Missile data"+saved2);
		
		ResortService service3= container.getBean(ResortService.class);
		boolean saved3=service3.validateAndSave(new ResortDTO());
		System.out.println("Saved Resort data");
		

	}

}
