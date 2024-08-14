package bank;

public class Circle {

	int radius;
	void modify(int r)
	{
		this.radius=r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle();
		c1.radius=10;
		System.out.println("Circle of Area :"+(3.14*(c1.radius*c1.radius)));
		System.out.println("Circle of Circumference :"+(2*3.14*c1.radius));
		c1.radius=12;
		S
		System.out.println("Circle of Area :"+(3.14*(c1.radius*c1.radius)));
		System.out.println("Circle of Circumference :"+(2*3.14*c1.radius));
		c1.modify(15);
		System.out.println("Circle of Area :"+(3.14*(c1.radius*c1.radius)));
		System.out.println("Circle of Circumference :"+(2*3.14*c1.radius));
	}

}
