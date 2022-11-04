package com.sporty.model;

public class ordermodel {
private int orderid;
private String ordername;
private int orderdate;
public int getOrderid() {
	return orderid;
}
public void setOrderid(int orderid) {
	this.orderid = orderid;
}
public String getOrdername() {
	return ordername;
}
public void setOrdername(String ordername) {
	this.ordername = ordername;
}
public int getOrderdate() {
	return orderdate;
}
public void setOrderdate(int orderdate) {
	this.orderdate = orderdate;
}
public ordermodel(int orderid, String ordername, int orderdate) {
	super();
	this.orderid = orderid;
	this.ordername = ordername;
	this.orderdate = orderdate;
}
@Override
public String toString() {
	return "ordermodel [orderid=" + orderid + ", ordername=" + ordername + ", orderdate=" + orderdate + "]";
}

}
