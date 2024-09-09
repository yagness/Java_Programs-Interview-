public class MaxInt
{
	public static void main(String args[])
	{
		int[] a = {800,85,495,3,55,66,7};
		int ans=a[0];

		for(int i=0;i<a.length;i++)
		{
			if(a[i]>ans)
			{
				ans = a[i];
			}
		}
		System.out.println("Maximum Integer : "+ans);
	}
}