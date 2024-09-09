import java.util.Scanner;
public class Prime {
	
	public static void main(String [] args)
	{
		int no;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number : ");
		no = sc.nextInt();
		boolean cp = chekprime(no);
		if(cp==true)
		{
			System.out.println(no+ " is prime number");
		}
		else
		{
			System.out.println(no+ " is not a prime number ");
		}
	}

	public static Boolean chekprime(int no)
	{
		int temp = 0;
		if(no == 2)
		{
			return true;
		}
		else
		{
			for(int i = 2;i < no; i++)
			{
				if(no % i == 0)
				{
					temp =1;
					break;
				}
			}
			
			
			if(temp==0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
	}
	
}