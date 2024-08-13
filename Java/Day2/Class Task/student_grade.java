package bank;
import java.util.*;
class student
{
	int regno;
	String name;
	int a[];
	int sum,avg;
	String grade;
	student(int r,String name)
	{
		this.regno=r;
		this.name=name;
	}
	void getmarks()
	{
		Scanner n1=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the marks");
		for(int i=0;i<5;i++)
		{
			a[i]=n1.nextInt();
		}
		this.a=a;
		this.calculate();
		this.grade();
		this.display();
	}
	void display()
	{
		System.out.println("Reg No :"+ regno);
		System.out.println("Name :"+ name);
		//System.out.println(Arrays.toString(a));
		System.out.println("Sum :"+ sum);
		System.out.println("Average :"+avg);
		
		System.out.println("Grade :"+grade);
		
		
	}
	void grade()
	{
		if(avg>=90)
		{
			this.grade="O";
		}
		else if(avg>=80)
		{
			this.grade="A";
		}
		else if(avg>=70)
		{
			this.grade="B";
		}
		else if(avg>=60)
		{
			this.grade="C";
		}
		else
		{
			this.grade="Fail";
		}
	}
	void calculate()
	{
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum+=a[i];
			
		}
		this.sum=sum;
		this.avg=sum/5;
	}
}
public class student_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       student n2=new student(5,"Raja");
       n2.getmarks();
       
	}

}
