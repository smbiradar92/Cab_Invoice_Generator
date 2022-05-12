package com.bl.cab.invoice.generator.service;

import com.bl.cab.invoice.generator.model.InvoiceModel;
import com.bl.cab.invoice.generator.model.RideModel;
import com.bl.cab.invoice.generator.repository.RideRepository;
import com.bl.cab.invoice.generator.repository.RideRepositoryImpl;

public class InvoiceServiceImpl implements InvoiceService {

	RideRepository rideRepository;

	public InvoiceServiceImpl() {
		rideRepository = new RideRepositoryImpl();
	}

	public void addRideDetails(RideModel ride) {
		rideRepository.addRideDetails(ride);
	}

	@Override
	public InvoiceModel generateInvoice() {
		return rideRepository.getInvoice();
	}
}