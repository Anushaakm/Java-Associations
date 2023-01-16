package com.xworkz.task.bean.Director;


import org.springframework.stereotype.Component;

@Component
public class Director {
private Skill skill;
private Experience experience;
public Director() {
	System.out.println("created director..");
}
}
