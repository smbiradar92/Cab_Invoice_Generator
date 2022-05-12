package com.bl.cab.invoice.generator.model;

public class RideModel {

	private double distance;
	private int duration;
	private double fare;

	public RideModel(double distance, int duration,
			double fare) {
		super();
		this.distance = distance;
		this.duration = duration;
		this.fare = fare;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}
}