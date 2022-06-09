package org.exception.pack;
import java.util.Scanner;

public class Division2 {
    String str="";
    public String divideTwoNumbers(int number1,int number2) {
        double result=0.0;
        try {
            result=number1/number2;
            str="The answer is "+result;
        }
        catch(ArithmeticException e) {
            str= "Division by zero is not possible";
        }
        
        
        finally {
        	str=str+"."+"Thanks for using the application"+".";
            //return str+"Thanks";
        }
       return str;
        
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner (System.in);
        Division d=new Division();
        System.out.println("Enter the numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.print(d.divideTwoNumbers(n1,n2));
        
    }

 

 

 

}
