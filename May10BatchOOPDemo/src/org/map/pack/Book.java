package org.map.pack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Book {

	static HashMap<String,String> books=new HashMap<>();
	
	public static List<String> getBookBasedOnBookName(HashMap<String, String> books, String bookName ){
		
		List<String> list=books.entrySet().stream().filter(e->e.getKey().startsWith("978-0")).map(Map.Entry :: getValue).collect(Collectors.toList());
		return list;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		books.put( "978-0201633610", "Design patterns : elements of reusable object-oriented software"); 
		books.put( "978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
		books.put("978-0134685991", "Effective Java");
		System.out.println("Enter book id:");
		String bookId=sc.nextLine();
		List<String>bookList=getBookBasedOnBookName(books,bookId);
		for(String s:bookList)
			System.out.println(s);
			
	}

}
