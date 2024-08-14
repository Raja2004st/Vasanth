package bank;

public class Person {

	String name;
	int age;
	Person(String s1,int age)
	{
		this.name=s1;
		this.age=age;
		this.display();
	}
	void display()
	{
		System.out.println("Name "+name);
		System.out.println("Age "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Person p1=new Person("Raja",20);
	}

} 

