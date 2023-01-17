package com.xworkz.di.bean;

import org.springframework.stereotype.Component;

import com.xworkz.di.bridge.Provider;
@Component
public class Airtel implements Provider {
	public Airtel() {
		System.out.println("created Airtel no-arg constroctor ");
	}

	@Override
	public void connect() {
		System.out.println("created connect using Airtel provider");
	}

}
