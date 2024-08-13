package bank;

import java.util.Scanner;

public class palindrome {
	private static Scanner n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n=new Scanner (System.in);
		System.out.println("Enter the string");
		String s1=n.next();
		StringBuilder n1=new StringBuilder(s1);
		String s2=n1.reverse().toString();
		if(s1.equals(s2))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
