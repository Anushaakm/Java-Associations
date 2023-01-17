package com.xworkz.di.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.xworkz.di.bean.Diesel;
import com.xworkz.di.bean.Petrol;
import com.xworkz.di.bean.Shell;
import com.xworkz.di.boot.Runner;
import com.xworkz.di.bridge.Fuel;


@Configuration
@ComponentScan(basePackages = "com.xworkz.di", excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = {Diesel.class,Petrol.class,Shell.class ,Runner.class,Petrol.class,Fuel.class}) })
public class BrowserConfiguration {
	

}
