public class Butterfly {
	public static void main(String args[])
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print("  ");
			}
			//System.out.println();
			for(int k=i;k<5;k++)
			{
				System.out.print("  ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		
		}
		for(int i=0;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("* ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("  ");
			}
			//System.out.println();
			for(int k=0;k<=i;k++)
			{
				System.out.print("  ");
			}
			for(int j=4;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();	
		}
	}
}