package com.sporty.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products_")
public class productsmodel {
@Id
@GeneratedValue
@Column(name="productid")
private int productid;
@Column(name="productname")
private int productname;
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public int getProductname() {
	return productname;
}
public void setProductname(int productname) {
	this.productname = productname;
}
public productsmodel(int productid, int productname) {
	super();
	this.productid = productid;
	this.productname = productname;
}
@Override
public String toString() {
	return "productsmodel [productid=" + productid + ", productname=" + productname + "]";
}

}
