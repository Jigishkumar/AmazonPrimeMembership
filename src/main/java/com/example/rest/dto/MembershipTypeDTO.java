package com.example.rest.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.persistence.domain.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MembershipTypeDTO {

	private Long MembershipTypeId;
	
	private String MembershipDescription;
	
	private String MembershipExpDateValidity;
	private List<Customer> customers = new ArrayList<>();
	public Long getMembershipTypeId() {
		return MembershipTypeId;
	}
	public void setMembershipTypeId(Long membershipTypeId) {
		MembershipTypeId = membershipTypeId;
	}
	public String getMembershipDescription() {
		return MembershipDescription;
	}
	public void setMembershipDescription(String membershipDescription) {
		MembershipDescription = membershipDescription;
	}
	public String getMembershipExpDateValidity() {
		return MembershipExpDateValidity;
	}
	public void setMembershipExpDateValidity(String membershipExpDateValidity) {
		MembershipExpDateValidity = membershipExpDateValidity;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	public MembershipTypeDTO(Long membershipTypeId, String membershipDescription, String membershipExpDateValidity,
			List<Customer> customers) {
		super();
		MembershipTypeId = membershipTypeId;
		MembershipDescription = membershipDescription;
		MembershipExpDateValidity = membershipExpDateValidity;
		this.customers = customers;
	}
	public MembershipTypeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MembershipTypeDTO [MembershipTypeId=" + MembershipTypeId + ", MembershipDescription="
				+ MembershipDescription + ", MembershipExpDateValidity=" + MembershipExpDateValidity + ", customers="
				+ customers + "]";
	}
	
}
