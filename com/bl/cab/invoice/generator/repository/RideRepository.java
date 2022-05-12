package com.bl.cab.invoice.generator.repository;

import com.bl.cab.invoice.generator.model.InvoiceModel;
import com.bl.cab.invoice.generator.model.RideModel;

public interface RideRepository {

	void addRideDetails(RideModel ride);

	InvoiceModel getInvoice();
	
}