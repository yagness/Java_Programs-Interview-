import java.util.Scanner;

public class Factorial {

	public static void main(String args[])
	{
		int no;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Any Number : ");
		no = sc.nextInt();

		Factorial obj = new Factorial();
		int fact = obj.factorial(no);
		int fact1 = obj.factorial_recursion(no);
		
		System.out.println("Factorial of "+no+ " is "+fact);
		System.out.println("Factorial of "+no+ " is "+fact1);
	
	}

	public int factorial(int no)
	{
		int ans = 1;
		for(int i=1;i<=no;i++)
		{
			ans = ans * i;
		}
		return ans;
	}

	public int factorial_recursion(int no)
	{
		if(no==1)
		{
			return 1;
		}
		else
		{
			int ans = no * factorial_recursion(no - 1);
			return ans;
		}
	}
}