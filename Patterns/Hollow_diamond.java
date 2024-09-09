public class Hollow_diamond{
	public static void main(String args[])
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				if(i==0 || k==0 || i==k)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}			
			}
			System.out.println();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=i;j>=0;j--)
			{
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--)
			{
				if(i==4 || k==4 || k==i)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}