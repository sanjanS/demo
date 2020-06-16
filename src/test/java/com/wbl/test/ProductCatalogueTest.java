package com.wbl.test;

import static com.wbl.demo.ProductFixtures.bakers;
import static com.wbl.demo.ProductFixtures.clays;
import static com.wbl.demo.ProductFixtures.door;
import static com.wbl.demo.ProductFixtures.floorPanel;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.MatcherAssert.assertThat;


import org.testng.annotations.Test;

import com.wbl.demo.ProductCatalogue;

public class ProductCatalogueTest {

	    ProductCatalogue catalogue;

	    @Test
	    public void shouldOnlyHoldUniqueProducts() throws Exception {
	        catalogue = new ProductCatalogue();
	        catalogue.isSupplier(clays);
	        catalogue.isSupplier(bakers);
	        assertThat(catalogue, containsInAnyOrder(door, floorPanel));
	    }
}
