package com.businessRules;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DemoTest {
    private final String BOOK_OFFER =
    		"create a duplicate packing slip for the royalty department";
    private final String MEMBERSHIP_OFFER =
    		"activate that membership";
    private final String PHYSICAl_PRODUCT_OFFER =
    		"generate a packing slip for shipping";
    private final String UPGRADE_OFFER =
    		"apply the upgrade";
    private final String VIDEO_OFFER =
    		"add a free First Aid video";
   

	@Test
	public void testWhenPaymentOfferIsBook() {
		assertEquals(BOOK_OFFER, Demo.businessProcess("book"));
	}
	
	@Test
	public void testWhenPaymentOfferIsMemberShip() {
		assertEquals(MEMBERSHIP_OFFER, Demo.businessProcess("membership"));
	}
	
	@Test
	public void testWhenPaymentOfferIsPysicalProduct() {
		assertEquals(PHYSICAl_PRODUCT_OFFER,
				Demo.businessProcess("physical Product"));
	}
	
	@Test
	public void testWhenPaymentOfferIsUpgrade() {
		assertEquals(UPGRADE_OFFER,
				Demo.businessProcess("upgrade"));
	}
	
	@Test
	public void testWhenPaymentOfferIsVideo() {
		assertEquals(VIDEO_OFFER,
				Demo.businessProcess("video"));
	}
	
	@Test
	public void testWhenPaymentOfferIsNotPresent() {
		assertNull(Demo.businessProcess("audio"));
	}
}
