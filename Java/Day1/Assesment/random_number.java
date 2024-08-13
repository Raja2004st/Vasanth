package bank;

import java.util.Scanner;

public class random_number {
	private static Scanner n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n=new Scanner (System.in);
		double v=Math.random();
		v=v*100;
		int v1=(int)v;
		System.out.println(v1);
	}

}
