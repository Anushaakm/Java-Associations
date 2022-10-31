package com.xworkz.associationExample.two;

public class State {
	public String name;
	public String oldName;
	public String newName;
	public String stateCapital;
	
	public State(String name,String oldName,String newName,String stateCapital) {
		this.name=name;
		this.oldName=oldName;
		this.newName=newName;
		this.stateCapital=stateCapital;
	}
	 public void showOff() {
		 System.out.println(name);
		 System.out.println(oldName);
		 System.out.println(newName);
		 System.out.println(stateCapital);
	 }
}
