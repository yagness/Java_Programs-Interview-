import java.util.Scanner;
public class Palindrom {
	public static void main(String args [])
	{
		int no;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number : ");
		no = sc.nextInt();

		Palindrom obj = new Palindrom();
		//boolean ans = obj.check_palindrome(no);
		boolean ans = obj.check_pal(no);

		if(ans==true)
		{
			System.out.println("Given number "+no+" is palindrome");
		}
		else
		{
			System.out.println("Given number is not palindrome");
		}
	}
	
	//using string
	public boolean check_palindrome(int no)
	{
		String str = Integer.toString(no);
		String nstr = "";

		for(int i=str.length()-1;i>=0;i--)
		{
			nstr += str.charAt(i); 
		}
		System.out.println(nstr);

		if(nstr.equals(str))
		{
			return true;
		}
		else
		{
			return false;	
		}
	}

	//without string
	public boolean check_pal(int no)
	{
		int temp=no;
		int ans = 0;
		while(temp != 0)
		{	
			int last_digit = temp % 10;
			ans =(ans*10) + last_digit;
			temp /= 10; 
		}
	
		if(no==ans)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}