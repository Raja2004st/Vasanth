package bank;

 class twowheeler
 {
	 void twowheeler()
	 {
		 System.out.println("I have the two wheeler.");
	 }
 }
 class bike extends twowheeler
 {
	 void bike()
	 {
		 System.out.println("Bike brand is Honda.");
	 }
 }
 class car extends bike
 {
	 void car()
	 {
		 System.out.println("Car brand is Suzuki");
	 }
 }
public class inheritance {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car b1=new car();
         b1.twowheeler();
         b1.bike();
         b1.car();
	}

}
