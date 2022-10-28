
package com.example.persistence.domain;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class MembershipType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MembershipTypeId;
    
    
    private String MembershipDescription;
    
    
    private String MembershipExpDateValidity;
    @OneToMany(mappedBy = "membershiptype", fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    //@JsonManagedReference
    @JsonIgnore
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
	public MembershipType(Long membershipTypeId, @NotNull String membershipDescription,
			 String membershipExpDateValidity, List<Customer> customers) {
		super();
		MembershipTypeId = membershipTypeId;
		MembershipDescription = membershipDescription;
		MembershipExpDateValidity = membershipExpDateValidity;
		this.customers = customers;
	}
	public MembershipType() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MembershipType [MembershipTypeId=" + MembershipTypeId + ", MembershipDescription="
				+ MembershipDescription + ", MembershipExpDateValidity=" + MembershipExpDateValidity + ", customers="
				+ customers + "]";
	}
	
}