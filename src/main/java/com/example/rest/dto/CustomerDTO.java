package com.example.rest.dto;

import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.example.persistence.domain.MembershipType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDTO {

	private String CustomerName;
	private String CustomerAddress;
	private String CustomerEmail;
	private long CustomerPhone;
	private String CustomerUsername;
	private String CustomerPassword;
	private String CustomerDOB;
	private String CustomerPaymentType;

	@Min(0)
	@Max(12)
	private Integer MembershipTypeId;

	@ManyToOne
	private MembershipType membershiptype;

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerAddress() {
		return CustomerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}

	public String getCustomerEmail() {
		return CustomerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}

	public long getCustomerPhone() {
		return CustomerPhone;
	}

	public void setCustomerPhone(long customerPhone) {
		CustomerPhone = customerPhone;
	}

	public String getCustomerUsername() {
		return CustomerUsername;
	}

	public void setCustomerUsername(String customerUsername) {
		CustomerUsername = customerUsername;
	}

	public String getCustomerPassword() {
		return CustomerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		CustomerPassword = customerPassword;
	}

	public String getCustomerDOB() {
		return CustomerDOB;
	}

	public void setCustomerDOB(String customerDOB) {
		CustomerDOB = customerDOB;
	}

	public String getCustomerPaymentType() {
		return CustomerPaymentType;
	}

	public void setCustomerPaymentType(String customerPaymentType) {
		CustomerPaymentType = customerPaymentType;
	}

	public Integer getMembershipTypeId() {
		return MembershipTypeId;
	}

	public void setMembershipTypeId(Integer membershipTypeId) {
		MembershipTypeId = membershipTypeId;
	}

	public MembershipType getMembershiptype() {
		return membershiptype;
	}

	public void setMembershiptype(MembershipType membershiptype) {
		this.membershiptype = membershiptype;
	}

	public CustomerDTO(String customerName, String customerAddress, String customerEmail, long customerPhone,
			String customerUsername, String customerPassword, String customerDOB, String customerPaymentType,
			@Min(0) @Max(12) Integer membershipTypeId, MembershipType membershiptype) {
		super();
		CustomerName = customerName;
		CustomerAddress = customerAddress;
		CustomerEmail = customerEmail;
		CustomerPhone = customerPhone;
		CustomerUsername = customerUsername;
		CustomerPassword = customerPassword;
		CustomerDOB = customerDOB;
		CustomerPaymentType = customerPaymentType;
		MembershipTypeId = membershipTypeId;
		this.membershiptype = membershiptype;
	}

	public CustomerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CustomerDTO [CustomerName=" + CustomerName + ", CustomerAddress=" + CustomerAddress + ", CustomerEmail="
				+ CustomerEmail + ", CustomerPhone=" + CustomerPhone + ", CustomerUsername=" + CustomerUsername
				+ ", CustomerPassword=" + CustomerPassword + ", CustomerDOB=" + CustomerDOB + ", CustomerPaymentType="
				+ CustomerPaymentType + ", MembershipTypeId=" + MembershipTypeId + ", membershiptype=" + membershiptype
				+ "]";
	}

}
