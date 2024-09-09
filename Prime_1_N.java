import java.util.Scanner;
public class Prime_1_N {
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length : ");
		int size = sc.nextInt();

		for(int i=1;i<=size;i++)
		{
			boolean temp = false;
			if(i==1)
			{
				continue;
			}
			else if(i==2)
			{
				temp = false;
			}
			else
			{
				for(int j=2;i<i;j++)
				{
					if(i%j==0)
					{
						temp= true;
						break;
	
					}
				}
			}			
		}
	}
}