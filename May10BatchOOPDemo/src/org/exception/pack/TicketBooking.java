package org.exception.pack;
import java.time.LocalDate;

public class TicketBooking {
	private String passengerName;
	private LocalDate travelDate;
	int noOfTickets;
	double eachTicketAmount;
	public TicketBooking(String passengerName, LocalDate travelDate,int noOfTickets, double eachTicketAmount) {
		super();
		this.passengerName = passengerName;
		this.travelDate = travelDate;
		this.noOfTickets = noOfTickets;
		this.eachTicketAmount = eachTicketAmount;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public LocalDate getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public double getEachTicketAmount() {
		return eachTicketAmount;
	}
	public void setEachTicketAmount(double eachTicketAmount) {
		this.eachTicketAmount = eachTicketAmount;
	}
	
	
}
