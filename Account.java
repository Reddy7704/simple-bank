package bank.test;

public class Account  {

	String accountHolder;
	String type;
	static long CUSTOMERID = 1000;
	long ID;
	static String Bank = "CTBank";
	Checking checking = new Checking();	
	Savings savings = new Savings();

	
	
	//Parameterized constructor
	public Account (String accountHolder)
	{
		type = "Individual";
		
		ID = CUSTOMERID; // This sequences can also be written
		CUSTOMERID += 1; // as ID = ++CUSTOMERID	
		
	}
	
	void transferToChecking(float amount) 
	{
		if(savings.getBalance()>=checking.getBalance()) 
		{
			savings.withdraw(amount);
			checking.deposit(amount);
			System.out.println("Transfer in the amount of " + amount + " to Checking is Successful.");
			System.out.println("New Checking Balance: " + checking.getBalance());
			System.out.println("New Savings Balance: " + savings.getBalance());
		}
		else 
		{
			System.out.println("Insufficient Funds. Cannot Transfer.");
		}
	}
	
	void transferToSavings(float amount) 
	{
		if(checking.getBalance()>=savings.getBalance()) 
		{
			checking.withdraw(amount);
			savings.deposit(amount);
			
			System.out.println("Transfer in the amount of " + amount + " to Savings is Successful.");
			System.out.println("New Checking Balance: " + checking.getBalance());
			System.out.println("New Savings Balance: " + savings.getBalance());
			
		}
		else 
		{
			System.out.println("Insufficient Funds. Cannot Transfer.");
		}
	}
	
	float getCheckingsBalance() 
	{
		return checking.getBalance();
	}
	
	float getSavingsBalance() 
	{
		return savings.getBalance();
	}
	
}
