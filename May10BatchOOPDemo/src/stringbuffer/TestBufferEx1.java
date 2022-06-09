package stringbuffer;

import java.util.Scanner;

class UserMainCode{
	public static String getMiddleChars(String str) {
		 StringBuffer sb=new StringBuffer(str);
		 return sb.substring((str.length()/2)-1,(str.length()/2)+1 );
	}
	public static int checkCharacters (String str) {
		StringBuffer sb=new StringBuffer(str);
		if(sb.charAt(0)==sb.charAt(str.length()-1))
			return 1;
		else
			return -1;
	}
	public static String formNewWord (String str,int n) {
		StringBuffer sb=new StringBuffer(str);
			return sb.substring(0,n).concat(sb.substring(str.length()-n,str.length())); 
		//return null;
	}
}
public class TestBufferEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String string=sc.nextLine();
		if(string.length()%2==0) {
			string=UserMainCode.getMiddleChars(string);
			System.out.println(string);
		}
		else
			System.out.println("String length should be even");
	}

}
