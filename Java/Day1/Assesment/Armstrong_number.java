package bank;

import java.util.*;

public class Armstrong_number {
	private static Scanner n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n=new Scanner (System.in);
		System.out.println("Enter the number");
		int num=n.nextInt();
		int sum=0;
		int temp=num;
		String s1=Integer.toString(num);
		while(num!=0)
		{
			int a=num%10;
			sum+=Math.pow(a, s1.length());
			System.out.println(sum);
			num/=10;
		}
		if(sum==temp)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
	}

}
