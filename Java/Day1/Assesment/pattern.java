package bank;

import java.util.Scanner;

public class pattern {
	private static Scanner n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n=new Scanner (System.in);
		System.out.println("Enter the number");
		int num=n.nextInt();
		for(int i=0;i<num;i++)
		{
			for(int j=num-1;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
