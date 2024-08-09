package com.sonata.Product;

public class Product {
private int pId;
private String pName;
private double pPrice;

 @Override
public String toString() {
	return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + "]";
}

Product(int pid,String pName,double price){
	 super();
	 this.pId=pid;
	 this.pPrice=price;
	 this.pName=pName;
 }
}
