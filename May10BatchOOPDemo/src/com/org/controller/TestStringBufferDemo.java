package com.org.controller;

public class TestStringBufferDemo {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			   String msg="Hi everyone very good morning";
			   //[]-16
			   //StringBuffer() which create empty string buffer object with capacity 16 characters
			  // StringBuffer sb=new StringBuffer();
			   //StringBuffer(String str)
			   //StringBuffurer(50)
			  // StringBuilder sb=new StringBuilder(msg);
			   StringBuffer sb=new StringBuffer(msg);
			   sb.replace(0, 3, "xxx");
			   System.out.println(sb);
			   
			   sb.append(123).append("abc");
			   
			   System.out.println("after appending" + "  ----> "+sb);
			   
			   sb.insert(3, "TTT");
			   System.out.println("after insert "+ " ---->"+sb);
			   
			   
			  char ch= sb.charAt(6);
			   System.out.println(ch);
			   
			   
			   sb.reverse();
			   System.out.println("after reverse" + " "+sb);
			   
			   sb.delete(5, sb.length());
			   System.out.println("after delete " + " "+sb);
			   
			   
			   sb.deleteCharAt(0);
			   
			   System.out.println("after delete specific character"+ " "+sb);
			   
			   
			   int pos=sb.indexOf("ba");
			   System.out.println(pos);
			   
			   //lastIndex()
			   
			   
			  System.out.println("subString");
			  String s= sb.substring(0,2);
			   System.out.println(s);
			   
			   
			  String s1= sb.toString();
			  System.out.println(s1);
			   System.out.println(sb.capacity());
			   
			   
			 

					
					
					
					
				}

	}

