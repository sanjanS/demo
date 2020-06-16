package com.wbl.demo;

public class ProductFixtures {
	
	    public static final Product door = new Product("Wooden Door", 35);
	    public static final Product floorPanel = new Product("Floor Panel", 25);
	    public static final Product window = new Product("Glass Window", 10);

	    public static final Supplier clays = new Supplier("Clay's Household supplies");
	    public static final Supplier bakers = new Supplier("Baker's Home Goods");

	    static {
	        clays.getProducts().add(door);
	        clays.getProducts().add(floorPanel);
	        clays.getProducts().add(window);
	        bakers.getProducts().add(door);
	        bakers.getProducts().add(new Product("Floor Panel", 25));
	        bakers.getProducts().add(window);

	    }


}
