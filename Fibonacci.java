public class Fibonacci {
	public static void main(String args [])
	{
		fibonacci_rec(0,1,15);
		fibonacci_loop(5);
	}
	
	//using recursion
	public static void fibonacci_rec(int f,int s,int n)
	{
		if(n==1)
		{
			System.out.println(f + " ");
		}
		else
		{
			//System.out.println(f + " " +s+ " "+n+ " ");
			System.out.println(f+ " ");
			fibonacci_rec(s, f+s, n-1);
		}
	}

	//using loop
	public static void fibonacci_loop(int size)
	{
		int n1 = 0;
		int n2 = 1,n3=n1+n2;

		for(int i=size;i>0;i--)
		{
			System.out.println(n1 + " ");
			n1 = n2;
			n2 = n3;
			n3 = n1+n2;
		}
	}
}