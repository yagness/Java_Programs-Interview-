class SavingAccount
{
	private String name;
	private double balance;

	public SavingAccount(String hname,double balance)
	{
		this.name=hname;
		this.balance=balance;
	}

	public String getAccountName()
	{
		return name;
	}
	
	public void setAccountName(String name)
	{
		this.name=name;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	public void deposite(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}

	public void withdraw(double amount)
	{
		if(amount > 0 && amount<= balance)
		{
			balance -= amount;
		}
		else
		{
			System.out.println("Invalid withdraw transaction");
		}
	}

	public void display()
	{
		System.out.println("Account Holder Name = "+name);
		System.out.println("Account Balance = "+balance);
	}
}

public class SavingAccount1 
{
	public static void main(String args [])
	{
		SavingAccount sa = new SavingAccount("Yagnesh",50000);

		sa.display();

		sa.deposite(1000);

		System.out.println("After deposite");

		sa.display();

		sa.withdraw(500);
		
		System.out.println("After withdraw");

		sa.display();
	}
}