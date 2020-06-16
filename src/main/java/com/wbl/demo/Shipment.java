package com.wbl.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<com.wbl.demo.Product> {
	    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
	    private static final int PRODUCT_IS_NOT_AVAILABLE = -1;
	    private final List<Product> products = new ArrayList<>();
	    private List<Product> lightVanProducts;
	    private List<Product> heavyVanProducts;

	    public void add(Product product) {
	        products.add(product);
	    }

	    /**
	     * Method to replace products.
	     *
	     * @param oldProduct will be replaced by new product
	     * @param newProduct will replace oldproduct
	     */
	    public void replace(Product oldProduct, Product newProduct) {
	        final int index = products.indexOf(oldProduct);
	        if (index != PRODUCT_IS_NOT_AVAILABLE) {
	            products.set(index, newProduct);
	        }
	    }

	    /**
	     * Method to Prepare Products as per weight.
	     */
	    public void prepare() {
	        products.sort(Product.BY_WEIGHT);
	        int splitPoint = findSplitPoint();
	        lightVanProducts = products.subList(0, splitPoint);
	        heavyVanProducts = products.subList(splitPoint, products.size());
	    }

	    private int findSplitPoint() {
	        for (int i = 0; i < products.size(); i++) {
	            if (products.get(i).getWeight() > LIGHT_VAN_MAX_WEIGHT) {
	                return i;
	            }
	        }
	        return 0;
	    }

	    public List<Product> getHeavyVanProducts() {

	        return heavyVanProducts;
	    }

	    public List<Product> getLightVanProducts() {

	        return lightVanProducts;
	    }

	    /**
	     * Returns an iterator over elements of type {@code T}.
	     *
	     * @return an Iterator.
	     */
	    @Override
	    public Iterator<Product> iterator() {
	        return products.iterator();
	    }

}
