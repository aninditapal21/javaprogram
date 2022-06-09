package com.org.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.*;

public class TestStreamDemo1 {
	/*
	 * interface Predicate
	 * {
	 * boolean abc(T a)
	 * }
	 * filter()
	 * 
	 * 
	 * 
	 */
	
	// if the marks in stream will >=35 the passed
	// passed marks should be listed in different  list
	public static List<Integer>getPassedScore(Stream<Integer> streamOfMarks){
		return streamOfMarks.filter(m->m>=35).collect(Collectors.toList());
	}
	public static int countPassesStudent(Stream<Integer> streamOfMarks) {
		return (int)streamOfMarks.filter(m->m>=35).count();
	}
	//This method fetch the integer object and if object >=30 but less than <35 , then I will 5 more marks to that integer object
		//return as List
	public static List<Integer> getGraceMarks(List<Integer> listOfMarks){
		return listOfMarks.stream().filter(marks->marks>=30 && marks<35).map(marks->marks+5).collect(Collectors.toList());
	}
	public static List<Integer> getSortedOrder(List<Integer> marks){
		return marks.stream().sorted().distinct().collect(Collectors.toList());
	}
	//map()reduce()
	public static int getTotal(List<Integer> list)
	{
		return list.stream().reduce((sum,marks)->sum+marks).get();
		//reduce(0.(sum,marks)->sum+marks
	}
	//max()
	public static int getMaxMarks(List<Integer> list)
	{
		/*Interface Comparator
		 * int compare
		 * if(m>n)
		 * 	return m;
		 * else
		 * return n;
		 * */
		return list.stream().max((m,n)->(m>n)?1:-1).get(); 
	}
	//min()
	public static int getMinMarks(List<Integer> list)
	{
		return list.stream().min((m,n)->(m>n)?1:-1).get(); 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Repository 
				//This is consisting original data
				//I do not want to modify this orginal source
				//I want to process as per my expectation
		List<Integer> listOfMarks=new ArrayList();
		int count=0,total=0;
		listOfMarks.add(45);
		listOfMarks.add(4);
		listOfMarks.add(32);
		listOfMarks.add(40);
		listOfMarks.add(31);
		listOfMarks.add(18);
		listOfMarks.add(55);
		//I want to create one stream object on same list, set, array
		Stream<Integer>steamOfMarks=listOfMarks.stream();
		getPassedScore(steamOfMarks).forEach(n->System.out.println(n));
		System.out.println("count");
		count=countPassesStudent(listOfMarks.stream());
		System.out.println(count);
		System.out.println("---------");
		List<Integer>list=getGraceMarks(listOfMarks);
		list.forEach(marks->System.out.println(marks));
		
		System.out.println("After sorting.....");
		getSortedOrder(listOfMarks).forEach(n->System.out.println(n));
		total=getTotal(listOfMarks);
		
		System.out.println("Total marks:"+total);
		System.out.println(getMaxMarks(listOfMarks));
		System.out.println(getMinMarks(listOfMarks));
		
	}

}
