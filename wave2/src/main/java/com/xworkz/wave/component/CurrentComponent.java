package com.xworkz.wave.component;

import org.springframework.stereotype.Component;

@Component
public class CurrentComponent {
	public CurrentComponent() {
		System.out.println("created" + this.getClass().getSimpleName());
	}
}
