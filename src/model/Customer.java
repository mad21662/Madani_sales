package model;

public class Customer
{
	private int customerID;
	private String firstname;

	public Customer(int customerID, String firstname) {
		setCustomerID(customerID);
		setFirstname(firstname);
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

}
