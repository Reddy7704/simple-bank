package bank.test;

public class Checking {

	private float balance;
	
	public Checking() 
	{
		balance = 0;
	}
	
	void deposit(float cash)
	{
		balance += cash;
		System.out.println("Checking Deposit Successful");
	}
	
	void withdraw(float cash)
	{
		balance -= cash;
		System.out.println("Checking Withdrawal Successful");
	}
	
	float getBalance() 
	{
		return balance;
	}
}
