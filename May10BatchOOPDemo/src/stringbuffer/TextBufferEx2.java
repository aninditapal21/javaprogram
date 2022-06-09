package stringbuffer;

import java.util.Scanner;

/*class UserMainCode1{
	public static int checkCharacters (String str) {
		StringBuffer sb=new StringBuffer(str);
		if(sb.charAt(0)==sb.charAt(str.length()-1))
			return 1;
		else
			return -1;
	}
}*/
public class TextBufferEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int m=UserMainCode.checkCharacters(str);
		if(m==1)
			System.out.println("valid");
		else
			System.out.println("Not valid");
	}

}
