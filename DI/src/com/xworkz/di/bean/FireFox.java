package com.xworkz.di.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.di.bridge.Browser;
import com.xworkz.di.bridge.Provider;
@Component("fireFox")
public class FireFox implements Browser {
	//@Autowired
	//@Qualifier("jio")
	Provider provider;
	
	public FireFox() {
		System.out.println("created chrome no-arg constroctor ");
	}

	@Override
	public void browse() {
		System.out.println("created browse using FireFox browser ..");
		//provider.connect();
	}

}
