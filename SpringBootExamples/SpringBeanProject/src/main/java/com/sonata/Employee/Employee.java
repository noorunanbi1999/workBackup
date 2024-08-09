package com.sonata.Employee;

public class Employee {
private int eId;
private String eName;
private double eSal;
private Address address;
public int geteId() {
	return eId;
}
public void seteId(int eId) {
	this.eId = eId;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public double geteSal() {
	return eSal;
}
public void seteSal(double eSal) {
	this.eSal = eSal;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
}
