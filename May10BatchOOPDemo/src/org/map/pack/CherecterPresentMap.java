package org.map.pack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CherecterPresentMap {

	public static Map<Character,Integer> countChar(char [] array){
		ArrayList<Character> character=new ArrayList();
		ArrayList<Integer> countChar=new ArrayList();
		Map<Character,Integer> listOfChar=new HashMap();
		for(int i=0;i<array.length;i++) {
			int count=0;
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j])
					count++;
			}
			character.add(array[i]);
			countChar.add((count+1));
		}
		System.out.println("key array print");
		for(Character i:character)
			System.out.println(i);
		System.out.println("value array print");
		for(Integer i:countChar)
			System.out.println(i);
		for(int i=0;i<character.size();i++)
			listOfChar.put(character.get(i),countChar.get(i));
		return listOfChar;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		int n=5;
		System.out.println("enter a sting");
		String str=sc.nextLine();
		char[]array=str.toCharArray();
		//String []a1=new String[5];
		//System.out.println("Enter the character");
		/*for(int i=0;i<array.length;i++) {
			array[i]=sc.next.;
		}*/
		
		Map<Character,Integer> newMap=countChar(array);
		System.out.println("print");
		for(Map.Entry<Character, Integer> me:newMap.entrySet())
			System.out.println(me.getKey()+" "+me.getValue());
		
		
	}

}
