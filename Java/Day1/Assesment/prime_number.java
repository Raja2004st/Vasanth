package bank;

import java.util.Scanner;

public class prime_number {
	private static Scanner n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n=new Scanner (System.in); 
       System.out.println("Enter the number");
       int num=n.nextInt();
       int c=0;
       for(int i=2;i<=num;i++)
       {c=0;
    	   for(int j=2;j<i;j++)
    	   {
    		   if(i%j==0)
    		   {
    		      c++;	   
    		   }
    	   }
    	   if(c==0)
    	   {
    		   System.out.print(i+" ");
    	   }
       }
	}

}
