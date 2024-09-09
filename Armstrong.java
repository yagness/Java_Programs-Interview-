import java.util.Scanner;

public class Armstrong{

	public static void main(String args [])
	{

		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :");
		no = sc.nextInt();

		Armstrong obj = new Armstrong();
		boolean ans = obj.check_armstrong(no);

		if(ans==true){
			System.out.println(no + " is Armstrong Number");
		}
		else{
			System.out.println(no + " is not a Armstrong Number");
		}
	}


	public boolean check_armstrong(int no)
	{
		int temp = no;
		int ans = 0;

		String str = Integer.toString(no);
		int len = str.length();

		while(temp!=0)
		{
			int last_digit = temp % 10;
			//int ldp = 1;
			
			//for(int i = 1;i <= len;i++)
			//{
			//	ldp *= last_digit;	
			//}

			ans += (last_digit*last_digit*last_digit);
			temp /= 10;
		}
		
		System.out.println("Ans :" + ans);

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