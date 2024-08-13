package bank;

import java.util.Scanner;

public class fibonacci {
	private static Scanner n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n=new Scanner (System.in); 
		int num1=0,num2=1;
		System.out.println("Enter the number");
		int num=n.nextInt();
		int num3=0;
		for(int i=0;i<num;i++)
		{
		   num3=num1+num2;
		  num1=num2;
		  num2=num3;
		  System.out.println(num3);
		}
		System.out.println(num3);
	}

}
