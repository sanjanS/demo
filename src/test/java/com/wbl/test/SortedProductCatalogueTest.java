package com.wbl.test;

import static com.wbl.demo.ProductFixtures.bakers;
import static com.wbl.demo.ProductFixtures.clays;
import static com.wbl.demo.ProductFixtures.door;
import static com.wbl.demo.ProductFixtures.floorPanel;
import static com.wbl.demo.ProductFixtures.window;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import org.testng.annotations.Test;

import com.wbl.demo.SortedProductCatalogue;

public class SortedProductCatalogueTest {

	    SortedProductCatalogue catalogue;

	    @Test
	    public void shouldFindLightVanProducts() {
	        catalogue = new SortedProductCatalogue();
	        catalogue.isSuppliedBy(clays);
	        catalogue.isSuppliedBy(bakers);
	        assertThat(catalogue.lightVanProducts(), containsInAnyOrder(window));
	    }

	    @Test
	    public void shouldFindHeavyVanProducts() {
	        catalogue = new SortedProductCatalogue();
	        catalogue.isSuppliedBy(clays);
	        catalogue.isSuppliedBy(bakers);
	       
}
}

