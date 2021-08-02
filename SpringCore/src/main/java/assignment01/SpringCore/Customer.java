package assignment01.SpringCore;

public class Customer {
	private int CustomerId;
	private String CustomerName;
	private int CustomerContact;
	private Address ob;
	
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public int getCustomerContact() {
		return CustomerContact;
	}
	public void setCustomerContact(int customerContact) {
		CustomerContact = customerContact;
	}
	public Address getOb() {
		return ob;
	}
	public void setOb(Address ob) {
		this.ob = ob;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", CustomerContact="
				+ CustomerContact + ", ob=" + ob + "]";
	}
	
	
}
