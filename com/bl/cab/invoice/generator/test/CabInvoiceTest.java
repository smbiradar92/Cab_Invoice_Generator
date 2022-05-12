package com.bl.cab.invoice.generator.test;

import org.junit.Test;

import com.bl.cab.invoice.generator.CabInvoiceGenerator;

public class CabInvoiceTest {

	@Test
	public void fareAmountMultipleRide() {

		CabInvoiceGenerator generator = new CabInvoiceGenerator();

		generator.bookCabForMonth();
		
		generator.generateInvoice();
	}

}