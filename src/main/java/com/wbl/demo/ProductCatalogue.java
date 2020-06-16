package com.wbl.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductCatalogue implements Iterable<Product> {

	    private final Set<Product> productsSet = new HashSet<>();

	    public void isSupplier(Supplier supplier) {
	        productsSet.addAll(supplier.getProducts());
	    }

	    /**
	     * Returns an iterator over elements of type {@code T}.
	     *
	     * @return an Iterator.
	     */
	    @Override
	    public Iterator<Product> iterator() {
	        return productsSet.iterator();
	    }
}
