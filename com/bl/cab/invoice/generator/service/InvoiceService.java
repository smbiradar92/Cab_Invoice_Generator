package com.bl.cab.invoice.generator.service;

import com.bl.cab.invoice.generator.model.InvoiceModel;
import com.bl.cab.invoice.generator.model.RideModel;

public interface InvoiceService {

	void addRideDetails(RideModel ride);

	InvoiceModel generateInvoice();

}