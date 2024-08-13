package bank;
public class OopsConcept {
  public void method1()
  {
	  System.out.println("Instance");
  }
  static void method2()
  {
	  System.out.println("Static");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  OopsConcept n1=new OopsConcept();
	  n1.method1();
	   method2();
	}
}