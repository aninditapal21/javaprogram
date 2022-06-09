package org.exception.pack;

import java.time.LocalDate;

public class BookingImpl {
	public String validate(TicketBooking tbk) throws NegativeValueException,TravelDateException {
		if(tbk.getTravelDate().isBefore(LocalDate.now()))
			throw new TravelDateException("Date is earlier than current date");
		if(tbk.getNoOfTickets()<0)
			throw new NegativeValueException ("No of tickets cannot be negative");
		
		return "Successfully validate";
	} 
	public double computerBillAmount(TicketBooking tbk) {
		double total=0;
		try {
			validate(tbk);
			//if(str.equals("Successfully validate"))
			total=tbk.getNoOfTickets()*tbk.getEachTicketAmount();
		}
		catch(TravelDateException e) {
			 System.out.println(e.getMessage());
			total=0;
		}
		catch(NegativeValueException n) {
			System.out.println(n.getMessage());
			total=-1;
		}
		return total;
		
	}
	
}
