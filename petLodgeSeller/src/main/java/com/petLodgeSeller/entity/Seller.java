package com.petLodgeSeller.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "SellerTable")
public class Seller {

	@Id
	@Column(name = "ID",nullable = false)
	private String sellerId;
	
	@Column(name = "Name",nullable = false)
	private String sellerName;
	
	@Column(name = "Address",nullable = false)
	private String sellerAddress;
	
	@Column(name = "ContactNo",nullable = false)
	private String sellerContactNo;
	
	@Column(name = "Email",nullable = false)
	private String sellerEmail;
	
	@Column(name = "Password",nullable = false)
	private String sellerPassword;
	
	@Column(name = "Status",nullable = false)
	private String sellerStatus;
	
	//public Seller(String sellerId, String sellerName, String sellerAddress, String sellerContactNo, String sellerEmail,
//			String sellerPassword, String sellerStatus) {
//		super();
//		this.sellerId = sellerId;
//		this.sellerName = sellerName;
//		this.sellerAddress = sellerAddress;
//		this.sellerContactNo = sellerContactNo;
//		this.sellerEmail = sellerEmail;
//		this.sellerPassword = sellerPassword;
//		this.sellerStatus = sellerStatus;
//	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getSellerAddress() {
		return sellerAddress;
	}
	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}
	public String getSellerContactNo() {
		return sellerContactNo;
	}
	public void setSellerContactNo(String sellerContactNo) {
		this.sellerContactNo = sellerContactNo;
	}
	public String getSellerEmail() {
		return sellerEmail;
	}
	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}
	public String getSellerPassword() {
		return sellerPassword;
	}
	public void setSellerPassword(String sellerPassword) {
		this.sellerPassword = sellerPassword;
	}
	public String getSellerStatus() {
		return sellerStatus;
	}
	public void setSellerStatus(String sellerStatus) {
		this.sellerStatus = sellerStatus;
	}
	
}

