package com.wbl.demo;


public class Enquiry {

	    public final Customer customer;
	    public final Category category;

		public   Enquiry(Customer customer, Category category) {
	        this.customer = customer;
	        this.category = category;
	    }
	    public Category getCategory() {
	        return category;
	    }

	    public Customer getCustomer() {
	        return customer;
	    }

	    @Override
	    public String toString() {
	        return "Enquiry{"
	                + "customer="
	                + customer
	                + ", category=" + category
	                + '}';
	    }

	  
}
