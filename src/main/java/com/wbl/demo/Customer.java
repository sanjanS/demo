package com.wbl.demo;

import java.util.logging.Logger;

public class Customer {
	    private static final Logger log = 
	    		Logger.getLogger(Customer.class.getName());
	    private transient String name;

	    public Customer() {

	    }

	    public Customer(String name) {
	        this.name = name;
	    }

	    public void reply(String message) {
	        log.info(name + ":" + message);
	    }
}
