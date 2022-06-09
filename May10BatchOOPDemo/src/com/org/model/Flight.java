package com.org.model;

import java.time.LocalDate;

public class Flight {
	private int flightId;
	private String flightType;
	private LocalDate  flyDate;
	private double flightCost;
	private String flightSource;
	private String flightDestination;
	public Flight() {
		super();
	}
	public Flight(int flightId, String flightType, LocalDate flyDate, double flightCost, String flightSource,
			String flightDestination) {
		super();
		this.flightId = flightId;
		this.flightType = flightType;
		this.flyDate = flyDate;
		this.flightCost = flightCost;
		this.flightSource = flightSource;
		this.flightDestination = flightDestination;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightType() {
		return flightType;
	}
	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}
	public LocalDate getFlyDate() {
		return flyDate;
	}
	public void setFlyDate(LocalDate flyDate) {
		this.flyDate = flyDate;
	}
	public double getFlightCost() {
		return flightCost;
	}
	public void setFlightCost(double flightCost) {
		this.flightCost = flightCost;
	}
	public String getFlightSource() {
		return flightSource;
	}
	public void setFlightSource(String flightSource) {
		this.flightSource = flightSource;
	}
	public String getFlightDestination() {
		return flightDestination;
	}
	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}
	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightType=" + flightType + ", flyDate=" + flyDate + ", flightCost="
				+ flightCost + ", flightSource=" + flightSource + ", flightDestination=" + flightDestination + "]";
	}
	
	
}
