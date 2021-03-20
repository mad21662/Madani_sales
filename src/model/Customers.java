package model;

import java.util.ArrayList;

public class Customers
{
	ArrayList<Customer> customers;

	public Customers() {
		customers = new ArrayList<>(100);
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

}
