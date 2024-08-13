package bank;

import java.util.Scanner;

public class ascii_value {
	private static Scanner n;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		n=new Scanner (System.in);
		System.out.println("Enter the string");
		String s1=n.next();
	 
		char c1[]=s1.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			System.out.println((int)c1[i]);
		}
	}

}
