package com.xworkz.di.bean;

import org.springframework.stereotype.Component;

import com.xworkz.di.bridge.Provider;
@Component
public class Jio implements Provider {
public Jio() {
	System.out.println("created jio no-arg constroctor ");
}
	@Override
	public void connect() {
		System.out.println("created connect using jio by spring...");

	}

}
