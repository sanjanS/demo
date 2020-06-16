package com.wbl.test;

import static com.wbl.demo.ProductFixtures.door;
import static com.wbl.demo.ProductFixtures.floorPanel;
import static com.wbl.demo.ProductFixtures.window;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;
import org.testng.annotations.Test;

import com.wbl.demo.Shipment;

public class ShipmentTest {

	private Shipment shipment;

    @Test
    public void shouldAddProducts() throws Exception {
        shipment = new Shipment();
        shipment.add(door);
        shipment.add(window);
        assertThat(shipment, contains(door, window));
    }

    @Test
    public void shouldReplaceProducts() throws Exception {
        shipment = new Shipment();
        shipment.add(door);
        shipment.add(window);
        shipment.replace(door, floorPanel);
        assertThat(shipment, contains(floorPanel, window));
    }

    @Test
    public void shouldNotReplaceMissingProducts() throws Exception {
        shipment = new Shipment();
        shipment.add(window);
        shipment.replace(door, floorPanel);
        assertThat(shipment, contains(window));
    }

    @Test
    public void shouldIdentifyVanRequirements() throws Exception {
        shipment = new Shipment();
        shipment.add(window);
        shipment.add(door);
        shipment.add(floorPanel);
        shipment.prepare();
        assertThat(shipment.getLightVanProducts(), contains(window));
        assertThat(shipment.getHeavyVanProducts(), contains(floorPanel, door));
    }

}
