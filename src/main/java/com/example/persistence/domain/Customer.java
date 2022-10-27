package com.example.persistence.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

@Entity
//@NoArgsConstructor
//@AllArgsConstructor
@Data
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String Name;
	private String Address;
	private String Email;
	private long Phone;
	private String Username;
	private String DOB;
	private int MembershipTypeId;
	private String PaymentType;


@OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
@OnDelete(action = OnDeleteAction.CASCADE)
//@JsonManagedReference
@JsonIgnore
private List<MembershipType> membershiptypes = new ArrayList<>();


public String getName() {
	return Name;
}


public void setName(String name) {
	Name = name;
}


public String getAddress() {
	return Address;
}


public void setAddress(String address) {
	Address = address;
}


public String getEmail() {
	return Email;
}


public void setEmail(String email) {
	Email = email;
}


public long getPhone() {
	return Phone;
}


public void setPhone(long phone) {
	Phone = phone;
}


public String getUsername() {
	return Username;
}


public void setUsername(String username) {
	Username = username;
}


public String getDOB() {
	return DOB;
}


public void setDOB(String dOB) {
	DOB = dOB;
}


public int getMembershipTypeId() {
	return MembershipTypeId;
}


public void setMembershipTypeId(int membershipTypeId) {
	MembershipTypeId = membershipTypeId;
}


public String getPaymentType() {
	return PaymentType;
}


public void setPaymentType(String paymentType) {
	PaymentType = paymentType;
}


public List<MembershipType> getMembershiptypes() {
	return membershiptypes;
}


public void setMembershiptypes(List<MembershipType> membershiptypes) {
	this.membershiptypes = membershiptypes;
}


public Customer(String name, String address, String email, long phone, String username, String dOB,
		int membershipTypeId, String paymentType, List<MembershipType> membershiptypes) {
	super();
	Name = name;
	Address = address;
	Email = email;
	Phone = phone;
	Username = username;
	DOB = dOB;
	MembershipTypeId = membershipTypeId;
	PaymentType = paymentType;
	this.membershiptypes = membershiptypes;
}


public Customer() {
	super();
	// TODO Auto-generated constructor stub
}


@Override
public String toString() {
	return "Customer [Name=" + Name + ", Address=" + Address + ", Email=" + Email + ", Phone=" + Phone + ", Username="
			+ Username + ", DOB=" + DOB + ", MembershipTypeId=" + MembershipTypeId + ", PaymentType=" + PaymentType
			+ ", membershiptypes=" + membershiptypes + "]";
}


}