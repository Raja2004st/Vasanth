package bank;
import java.util.*;
public class Book {
 
	String title;
	String author;
	String ISBN;
	String s1[];
	int k=0;
	void add()
	{
	 Scanner n1=new Scanner(System.in);
	 int num=n1.nextInt();
	 String s1[]=new String[num];
	 for(int i=0;i<num;i++)
	 {
		 String s2=n1.next();
		 String s3=n1.next();
		 String s4=n1.next();
		 s1[i]=s2+"-"+s3+"-"+s4;
	 }
	 this.s1=s1;
	     this. display();
	}
	void remove(String name)
	{
		for(int i=0;i<s1.length;i++)
		{
			String s2[]=s1[i].split("-");
			if(s2[0].equals(name))
			{
				s1[i]="";
			}
		}
		this.display();
	}
	void display()
	{
		System.out.println();
		for(int i=0;i<s1.length;i++)
		{
			if(!s1[i].equals(""))
			{
				System.out.print(s1[i]+" ");
			}
		}
//		System.out.println(Arrays.toString(s1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Book b1=new Book();
       b1.add();
       b1.remove("Raja");
	}

}
