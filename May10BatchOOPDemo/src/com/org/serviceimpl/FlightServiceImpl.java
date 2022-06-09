package com.org.serviceimpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.org.model.Flight;
import com.org.service.FlightService;

public class FlightServiceImpl implements FlightService{

	private Map<Integer,Flight>mapOfFlight=new HashMap();
	@Override
	public void addFlight(Flight flight) {
		// TODO Auto-generated method stub
		mapOfFlight.put(flight.getFlightId(), flight);
	}

	/*@Override
	public void addFlight(Map<Integer, Flight> flightMap) {
		// TODO Auto-generated method stub
		mapOfFlight=flightMap;
		
	}*/

	@Override
	public Map<Integer, Flight> viewAllFlight() {
		// TODO Auto-generated method stub
		return mapOfFlight;
	}

	@Override
	public Flight removeFlight(int flightID) {
		// TODO Auto-generated method stub
		//list is containing key sets of map
		Set <Integer> set1=mapOfFlight.keySet();
		List<Integer> list=new ArrayList(set1);
		for(int i=0;i<mapOfFlight.size();i++) {
			if(list.get(i)==flightID) {
				Flight flight=mapOfFlight.remove(flightID);
				return flight;
			}
		}
		return null;
	}

	@Override
	public Set<Flight> searchFlightBySourceAndDestination(String source, String destination) {
		// TODO Auto-generated method stub
		Set<Entry<Integer, Flight>> setOfEntry1=mapOfFlight.entrySet();
		for(Map.Entry<Integer,Flight> me:setOfEntry1) {
			if(me.getValue().getFlightSource().equalsIgnoreCase("source")&& )
		}
		
		return null;
	}

	@Override
	public List<Flight> sortFlight() {
		// TODO Auto-generated method stub
		return null;
	}

}
