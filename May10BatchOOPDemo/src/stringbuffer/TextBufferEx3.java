package stringbuffer;

import java.util.Scanner;

public class TextBufferEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		System.out.println("Enter positive integer ");
		int n=sc.nextInt();
		s=UserMainCode.formNewWord(s, n);
		System.out.println(s);
	}

}
