package com.wbl.demo;

import static com.wbl.demo.Product.BY_NAME;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetProductCatalogue implements Iterable<Product> {


	    private final Set<Product> productsSet = new TreeSet<>(BY_NAME);

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
