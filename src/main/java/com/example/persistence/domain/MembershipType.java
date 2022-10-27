package com.example.persistence.domain;


	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.ManyToOne;
	import javax.validation.constraints.Max;
	import javax.validation.constraints.Min;
	import javax.validation.constraints.NotNull;
	import javax.validation.constraints.Size;

	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	@Entity
	@NoArgsConstructor
	@AllArgsConstructor
	@Data
	
	public class MembershipType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	

	@NotNull
	@Size(min = 0, max = 55)
	private String MembershipDescription;

	@Min(0)
	@Max(8)
	private String MembershipExpDate;

	@NotNull
	private int MembershipTypeId;;
	

	@ManyToOne
	private Customer customer;


	public String getMembershipDescription() {
		return MembershipDescription;
	}


	public void setMembershipDescription(String membershipDescription) {
		MembershipDescription = membershipDescription;
	}


	public String getMembershipExpDate() {
		return MembershipExpDate;
	}


	public void setMembershipExpDate(String membershipExpDate) {
		MembershipExpDate = membershipExpDate;
	}


	public int getMembershipTypeId() {
		return MembershipTypeId;
	}


	public void setMembershipTypeId(int membershipTypeId) {
		MembershipTypeId = membershipTypeId;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public MembershipType(@NotNull @Size(min = 0, max = 55) String membershipDescription,
			@Min(0) @Max(8) String membershipExpDate, @NotNull int membershipTypeId, Customer customer) {
		super();
		MembershipDescription = membershipDescription;
		MembershipExpDate = membershipExpDate;
		MembershipTypeId = membershipTypeId;
		this.customer = customer;
	}


	public MembershipType() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "MembershipType [MembershipDescription=" + MembershipDescription + ", MembershipExpDate="
				+ MembershipExpDate + ", MembershipTypeId=" + MembershipTypeId + ", customer=" + customer + "]";
	}


}
