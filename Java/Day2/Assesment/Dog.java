package bank;

public class Dog {
  String name;
  String breed;
  Dog(String s1, String s2)
  {
	  this.name=s1;
	  this.breed=s2;
	  this.display();
  }
  void setname(String s1,String s2)
  {
	  this.name=s1;
	  this.breed=s2;
	  this.display();
  }
  void display()
  {
	  System.out.println("Name : "+name);
	  System.out.println("Breed :"+breed);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Dog d1=new Dog("Tommy","Bulldog");
         d1.setname("Jimmy","Poodle");
	}

}
