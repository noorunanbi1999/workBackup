package com.sonata.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class product {
	@Id
private long p_id;
private String p_name;
private double p_price;


public long getP_id() {
	return p_id;
}
public void setP_id(long p_id) {
	this.p_id = p_id;
}
public String getP_name() {
	return p_name;
}
public void setP_name(String p_name) {
	this.p_name = p_name;
}
public double getP_price() {
	return p_price;
}
public void setP_price(double p_price) {
	this.p_price = p_price;
}
}
