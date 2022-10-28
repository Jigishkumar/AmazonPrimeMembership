
package com.example.persistence.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long CustomerId;
    private String CustomerName;
    private String CustomerAddress;
    private String CustomerEmail;
    private long   CustomerPhone;
    private String CustomerUsername;
    private String CustomerPassword;
    private String CustomerDOB;
    private String CustomerPaymentType; 
    
    @ManyToOne
    private MembershipType membershiptype;
    public long getCustomerId() {
        return CustomerId;
    }
    public void setCustomerId(long customerId) {
        CustomerId = customerId;
    }
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
    public MembershipType getMembershiptype() {
        return membershiptype;
    }
    public void setMembershiptype(MembershipType membershiptype) {
        this.membershiptype = membershiptype;
    }
	public Customer(long customerId, String customerName, String customerAddress, String customerEmail,
			long customerPhone, String customerUsername, String customerPassword, String customerDOB,
			String customerPaymentType, MembershipType membershiptype) {
		super();
		CustomerId = customerId;
		CustomerName = customerName;
		CustomerAddress = customerAddress;
		CustomerEmail = customerEmail;
		CustomerPhone = customerPhone;
		CustomerUsername = customerUsername;
		CustomerPassword = customerPassword;
		CustomerDOB = customerDOB;
		CustomerPaymentType = customerPaymentType;
		this.membershiptype = membershiptype;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", CustomerAddress="
				+ CustomerAddress + ", CustomerEmail=" + CustomerEmail + ", CustomerPhone=" + CustomerPhone
				+ ", CustomerUsername=" + CustomerUsername + ", CustomerPassword=" + CustomerPassword + ", CustomerDOB="
				+ CustomerDOB + ", CustomerPaymentType=" + CustomerPaymentType + ", membershiptype=" + membershiptype
				+ "]";
	}
    
}


    