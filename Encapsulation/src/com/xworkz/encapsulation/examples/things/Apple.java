package com.xworkz.encapsulation.examples.things;

public class Apple {
	private String hotelName="New Sagar";
	private double price=1000;
	private int quantity=1;
	private String starters="Gobi Manchurian";
	private String mainCourse="Veg-Biriyani";
	private String sideDish="chips";
	private boolean veg=true;
	private String chat="NA";
	private boolean water=true;
	private int orderNo=1234;
	private String orderedBy="Anusha";
	private String orderedOn="Nov2";
	private int discount=10;
	
	public void setProperties(String hotelName, double price, int quantity, String starters, String mainCourse, String sideDish,boolean veg, String chat, boolean water, int orderNo, String orderedBy, String orderedOn, int discount) {
		this.hotelName = hotelName;
		this.price = price;
		this.quantity = quantity;
		this.starters = starters;
		this.mainCourse = mainCourse;
		this.sideDish = sideDish;
		this.veg = veg;
		this.chat = chat;
		this.water = water;
		this.orderNo = orderNo;
		this.orderedBy = orderedBy;
		this.orderedOn = orderedOn;
		this.discount = discount;
	}
	
	public String getHotelName() {
		return hotelName;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public String getStarters() {
		return starters;
	}
	public String getMainCourse() {
		return mainCourse;
	}	
	public String getSideDish() {
		return sideDish;
	}
	public boolean isVeg() {
		return veg;
	}
	public String getChat() {
		return chat;
	}
	public boolean isWater() {
		return water;
	}	
	public int getOrderNo() {
		return orderNo;
	}
	public String getOrderedBy() {
		return orderedBy;
	}
	public void setOrderedBy(String orderedBy) {
		this.orderedBy = orderedBy;
	}
	public String getOrderedOn() {
		return orderedOn;
	}
	public int getDiscount() {
		return discount;
	}
	
}
