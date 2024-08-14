package bank;

public class Employee {

	String name;
	String job;
	double salary;
	
	Employee(String s1,String s2,double d1)
	{
	 this.name=s1;
	 this.job=s2;
	 this.salary=d1;
	}
	void update(double d1)
	{
		this.salary=d1;
	}
	void cal()
	{
		System.out.println("Name :"+name+" "+"Job :"+job+" "+"Salary :"+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Employee e1=new Employee("Suje","IT",98760);
          e1.cal();
          e1.update(99999);
          e1.cal();
	}

}
