package com.wbl.demo;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
	

	    private String name;
	    private final List<Product> products = new ArrayList<>();

	    public Supplier() {
	        // This constructor is intentionally empty. Nothing special is needed here.
	    }

	    public Supplier(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    public List<Product> getProducts() {
	        return products;
	    }

	    @Override
	    public String toString() {
	        return String.format("Supplier{ name= '%s', products= %s", name, products);
	    }


}
