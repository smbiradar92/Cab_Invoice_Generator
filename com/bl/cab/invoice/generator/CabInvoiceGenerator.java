package com.bl.cab.invoice.generator;

import com.bl.cab.invoice.generator.model.InvoiceModel;
import com.bl.cab.invoice.generator.model.RideModel;
import com.bl.cab.invoice.generator.service.InvoiceService;
import com.bl.cab.invoice.generator.service.InvoiceServiceImpl;
import com.bl.cab.invoice.generator.util.AppConstant;
import com.bl.cab.invoice.generator.util.Util;

public class CabInvoiceGenerator {

	AppConstant appConstant;
	InvoiceService invoiceService;

	public CabInvoiceGenerator() {
		appConstant = new AppConstant();
		invoiceService = new InvoiceServiceImpl();
	}

	public void bookCab(double distance, int duration) {
		double fare = 0;
		distance = Util.formatDoubleValue(distance);
		fare = (distance * appConstant.COST_PER_KM)
				+ (duration * appConstant.COST_PER_MIN);

		if (fare < appConstant.MIN_FARE) {
			fare = appConstant.MIN_FARE;
		}
		fare = Util.formatDoubleValue(fare);
		RideModel ride = new RideModel(distance, duration,
				fare);
		invoiceService.addRideDetails(ride);
	}

	public void bookMultipleRide() {

		int noOfRidePerDay = (int) (Math.random() * 10);

		for (int i = 0; i < noOfRidePerDay; i++) {
			double distance = Math.random() * 20;
			int duration = (int) (Math.random() * 20);
			bookCab(distance, duration);
		}
	}

	public void bookCabForMonth() {
		for (int i = 0; i < 30; i++) {
			bookMultipleRide();
		}
	}

	public void generateInvoice() {
		InvoiceModel invoice = invoiceService
				.generateInvoice();
		System.out.println("Invoice amount : "
				+ invoice.getTotalFare() + " INR");
		System.out.println("Total Rides : "
				+ invoice.getTotalNoOfRides());
		System.out.println("Avg fare price : "
				+ invoice.getAvgFare() + " INR");
	}
}