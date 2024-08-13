package bank;

public class this_ {
        String name;
        this_(String s1)
        {
        	this(10,20);
        	this.name=s1;
        	this.greet();
        	
        }
        this_(int a,int b)
        {
        	System.out.println("Addition "+a+b);
        }
        void greet()
        {
        	System.out.println("Name "+name);
        }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		this_ n1=new this_("Raja");
	}

}
