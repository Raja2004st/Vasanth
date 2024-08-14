package bank;

class 	a
{
	a()
	{
		this(5);
		System.out.println("A");
	}
	a(int v)
	{
		super(
				);
		System.out.println("A 1");
	}
}
class b extends a
{
	b()
	{
		super(50);
		System.out.println("B");
	}
	b(int v)
	{
		System.out.println("B 1");
	}
}
public class Constructor_invokation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            b b1=new b();
            
	}

}
