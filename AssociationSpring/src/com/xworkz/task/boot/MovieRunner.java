package com.xworkz.task.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.xworkz.task.bean.Company;
//import com.xworkz.task.bean.Location;
import com.xworkz.task.bean.Producer;
import com.xworkz.task.bean.CameraManFile.Camera;
import com.xworkz.task.configuration.MovieConfiguration;

public class MovieRunner {

	public static void main(String[] args) {
		ApplicationContext ref=new AnnotationConfigApplicationContext(MovieConfiguration.class);
		Producer ref1=ref.getBean(Producer.class);	
		//System.out.println(ref1);
		System.out.println("================================================================================");
		Camera re2=ref.getBean(Camera.class);
		
	}

}
