package com.wbl.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionEX {
	    private static Collection<Product> products;
	    private static List<Product> list;

	    /**
	     * Method to add elements in Collection.
	     *
	     * @param list of elements
	     * @return Collection of elements as Products
	     */
	    public static Collection<Product> addElements(List<Product> list) {
	        products = new ArrayList<Product>();
	        products.addAll(list);
	        return products;
	    }

	    /**
	     * Method to iterate elements with given Weight.
	     *
	     * @param products Collection of products
	     * @param weight   of product
	     * @return matched weight products
	     */
	    public static Collection<Product> iterateElementsWithWeight(
	    		Collection<Product> products, int weight) {
	        Iterator<Product> productsIterator = products.iterator();
	        while (productsIterator.hasNext()) {
	            Product product = productsIterator.next();
	            if (product.getWeight() > weight) {
	                products.add(product);
	            } else {
	                products.remove(product);
	            }
	        }
	        return products;
	    }

	    /**
	     * Method to iterate elements with given Weight using ForEach.
	     *
	     * @param products Collection of products
	     * @param weight   of product
	     * @return ConcurrentModificationException Exception
	     */
	    public static Collection<Product> iterateElementsWithForEach(
	    		Collection<Product> products, int weight) {
	        list = new ArrayList<>();
	        for (Product product : products) {
	            if (product.getWeight() > weight) {
	                products.add(product);
	            } else {
	                products.remove(product);
	            }
	        }
	        return products;
	    }
}
