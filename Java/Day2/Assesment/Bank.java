package bank;

class Bank_Details {
	String Account_Number;
	String Account_Holder_Name;
	double balance;

	Bank_Details (String account_number,String name,double balance)
	{
	this.Account_Number=account_number;
	this.Account_Holder_Name=name;
	this.balance=balance;
	}

	void deposit(double amount)
	{
	balance+=amount;
	System.out.println("After Deposit : "+balance);
	}

	void withdraw(double amount)
	{
	balance-=amount;
	System.out.println("After Withdraw : "+balance);
	}

	void display()
	{
	System.out.println("Account Number : "+Account_Number);
	System.out.println("Account Holder Name : "+Account_Holder_Name);
	System.out.println("Account Balance : "+balance);
	}
	}
	public class Bank {

	public static void main(String[] args) {
	
	Bank_Details a=new Bank_Details("12345678","Sutharsan",50000.0);
	a.display();
	System.out.println();
	a.deposit(10000);
	System.out.println();
	a.withdraw(15000);
	}

	}