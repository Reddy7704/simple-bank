package bank.test;

public class Savings {
	
	private float balance;
	
	public Savings() 
	{
		balance = 0;
	}
	
	public void deposit(float cash)
	{
		balance += cash;
		System.out.println("Savings Deposit Successful");
	}
	
	public void withdraw(float cash)
	{
		balance -= cash;
		System.out.println("Savings Withdrawal Successful");
	}
	
	public float getBalance() 
	{
		return balance;
	}
	
}
