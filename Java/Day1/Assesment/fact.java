package bank;

import java.util.Scanner;

public class fact {
	private static Scanner n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n=new Scanner (System.in);
		System.out.println("Enter the number");
		int num=n.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println(fact);
	}

}
