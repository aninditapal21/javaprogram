package com.org.service;
import java.util.Map;
import java.util.Set;
import java.util.List;
import com.org.model.Flight;

public interface FlightService {
	public void addFlight(Flight flight);
	//public void addFlight(Map<Integer,Flight> flightMap);
	public Map<Integer,Flight>viewAllFlight();
	public Flight removeFlight(int flightID);
	public Set<Flight> searchFlightBySourceAndDestination(String source,String password);
	public List<Flight> sortFlight();
}
