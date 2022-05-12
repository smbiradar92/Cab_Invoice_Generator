package com.bl.cab.invoice.generator.model;

import com.bl.cab.invoice.generator.util.Util;

public class InvoiceModel {

	private int totalNoOfRides;
	private double totalFare;
	private double avgFare;

	public int getTotalNoOfRides() {
		return totalNoOfRides;
	}

	public void setTotalNoOfRides(int totalNoOfRides) {
		this.totalNoOfRides = totalNoOfRides;
	}

	public double getTotalFare() {
		return Util.formatDoubleValue(totalFare);
	}

	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

	public double getAvgFare() {
		return Util.formatDoubleValue(avgFare);
	}

	public void setAvgFare() {
		this.avgFare = this.totalFare / this.totalNoOfRides;
	}
}