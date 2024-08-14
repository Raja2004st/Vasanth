package bank;

class A
{
	int a=10;
	A(String name)
	{
		System.out.println("Welcome "+name);
	}
	void a()
	{
		System.out.println("A value of "+a);
	}
}
class B extends A
{
	B()
	{
		super("Raja");
	}
	void b()
	{
		System.out.println("Super keyword :"+super.a);
		super.a();
		
	}
}
public class super_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    B b1=new B();
    b1.b();
	}

}
