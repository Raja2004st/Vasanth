package bank;

import java.util.Scanner;

public class compare_object {
	private static Scanner n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  		n=new Scanner (System.in);
       String n1=n.next();
       String n2=n.next();
       if(n1.equals(n2))
       {
    	   System.out.println("Equal");
       }
       else
       {
    	   System.out.println("Not Equal");
       }
       
	}

}
