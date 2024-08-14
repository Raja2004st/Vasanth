package bank;

public class Rectangle {
        int width;
        int height;
        
    void  calculate(int w,int h)
        {
              this.width=w;
              this.height=h;
              this.display();
        }
    void display()
    {
    	System.out.println("Rectangle area :"+(width*height));
    	System.out.println("Rectangle perimeter :"+((height+width)*2W));
    }
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle();
		r1.calculate(10, 8);
	}

}
