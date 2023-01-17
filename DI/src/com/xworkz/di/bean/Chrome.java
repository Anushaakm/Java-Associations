package com.xworkz.di.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.di.bridge.Browser;
import com.xworkz.di.bridge.Provider;

@Component("chrome")
public class Chrome implements Browser {
	@Autowired
	@Qualifier("airtel")
	Provider provider;

	public Chrome() {
		System.out.println("created chrome no-arg constroctor ");
	}

	@Override
	public void browse() {
		System.out.println("creating browse using  chrome browser by spring");
		provider.connect();
	}

}
