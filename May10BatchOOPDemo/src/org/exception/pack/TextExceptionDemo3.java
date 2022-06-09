package org.exception.pack;

import java.io.FileOutputStream;
import java.io.IOException;

public class TextExceptionDemo3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout=new FileOutputStream("G://xyz.txt");
			fout.write("Hello".getBytes());
			try {
				Thread.sleep(-1);
				System.out.println("hi");
			}
			catch(InterruptedException ie) {
				System.out.println("error in thread");
			}
		}
		catch(IOException e) {
			System.out.println("error in program"+" "+e.getMessage());
		}
	}

}
