package com.wbl.demo;


import static com.wbl.demo.Product.BY_WEIGHT;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedProductCatalogue implements Iterable<Product> {
	    private static final SortedSet<Product> products = new TreeSet<>(BY_WEIGHT);
	    private static final int WEIGHT = 20;

	    public void isSuppliedBy(Supplier supplier) {
	        products.addAll(supplier.getProducts());
	    }

	    public Set<Product> lightVanProducts() {
	        Product heaviestLightVanProduct = findHeaviestLightVanProduct();
	        return products.headSet(heaviestLightVanProduct);
	    }

	    public Set<Product> heavyVanProducts() {
	        Product heaviestLightVanProduct = findHeaviestLightVanProduct();
	        return products.tailSet(heaviestLightVanProduct);
	    }

	    private Product findHeaviestLightVanProduct() {
	        for (Product product : products) {
	            if (product.getWeight() > WEIGHT) {
	                return product;
	            }
	        }
	        return products.last();
	    }

	    @Override
	    public Iterator<Product> iterator() {
	        return products.iterator();
	    }

}
