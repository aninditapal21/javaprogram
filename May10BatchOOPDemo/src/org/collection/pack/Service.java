package org.collection.pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Service {
	ArrayList<Citizen> showCitizensInAscendingByPin(ArrayList<Citizen> citizenList) {
		List<Citizen> list= citizenList.stream().sorted((p1,p2)->p1.getPincode()>p2.getPincode()?1:-1).collect(Collectors.toList());
		ArrayList<Citizen> al=new ArrayList(list);
		return al;
		
	}
	ArrayList<Citizen> showCitizensDescendingByPin(ArrayList<Citizen> citizenList){
		List<Citizen> list= citizenList.stream().sorted((p1,p2)->p1.getPincode()<p2.getPincode()?1:-1).collect(Collectors.toList());
		ArrayList<Citizen> al=new ArrayList(list);
		return al;
	}
	ArrayList<Citizen> showCitizensInAscendingByLoc(ArrayList<Citizen> citizenList){
		List<Citizen> list= citizenList.stream().sorted((p1,p2)->p1.getLocation().compareTo(p2.getLocation())).collect(Collectors.toList());
		ArrayList<Citizen> al=new ArrayList(list);
		return al;
	}
	ArrayList<Citizen> showCitizensInDescendingByLoc(ArrayList<Citizen> citizenList){
		List<Citizen> list= citizenList.stream().sorted((p1,p2)->p2.getLocation().compareTo(p1.getLocation())).collect(Collectors.toList());
		ArrayList<Citizen> al=new ArrayList(list);
		return al;
	}
}
