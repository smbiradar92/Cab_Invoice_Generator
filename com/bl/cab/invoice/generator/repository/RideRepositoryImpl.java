package com.bl.cab.invoice.generator.repository;

import java.util.ArrayList;
import java.util.List;

import com.bl.cab.invoice.generator.model.InvoiceModel;
import com.bl.cab.invoice.generator.model.RideModel;

public class RideRepositoryImpl implements RideRepository {

	List<RideModel> rideList;

	public RideRepositoryImpl() {
		rideList = new ArrayList<>();
	}

	@Override
	public void addRideDetails(RideModel ride) {
		rideList.add(ride);
	}

	@Override
	public InvoiceModel getInvoice() {
		InvoiceModel invoice = new InvoiceModel();

		double totalFare = 0;

		for (RideModel rideModel : rideList) {
			totalFare += rideModel.getFare();
		}

		invoice.setTotalFare(totalFare);
		invoice.setTotalNoOfRides(rideList.size());
		invoice.setAvgFare();

		return invoice;
	}

}