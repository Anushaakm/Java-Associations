package com.xworkz.Stream.dto;

import java.io.Serializable;

import com.xworkz.Stream.constant.Type;

public class DataBaseVendorDTO implements Serializable {
private String name;
private String developedBy;
private Type type;
private String size;
private double licenseCost;
public DataBaseVendorDTO() {
	super();
}
public DataBaseVendorDTO(String name, String developedBy, Type type, String size, double licenseCost) {
	super();
	this.name = name;
	this.developedBy = developedBy;
	this.type = type;
	this.size = size;
	this.licenseCost = licenseCost;
}
@Override
public String toString() {
	return "DataBaseVendorDTO [name=" + name + ", developedBy=" + developedBy + ", type=" + type + ", size=" + size
			+ ", licenseCost=" + licenseCost + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDevelopedBy() {
	return developedBy;
}
public void setDevelopedBy(String developedBy) {
	this.developedBy = developedBy;
}
public Type getType() {
	return type;
}
public void setType(Type type) {
	this.type = type;
}
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}
public double getLicenseCost() {
	return licenseCost;
}
public void setLicenseCost(double licenseCost) {
	this.licenseCost = licenseCost;
}
}
