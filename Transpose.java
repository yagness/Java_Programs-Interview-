import java.util.Scanner;
public class Transpose {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row size : ");
		int row = sc.nextInt();
		System.out.println("Enter Column size : ");
		int col = sc.nextInt();

		int arr[][] = new int[row][col];
		int temp =1;
		
		System.out.println("Enter value for matrix : ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		} 
		System.out.println("Normal matrix\n");

		/*for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}*/
		display(arr);
		
		System.out.println("Transpose matrix\n");
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.println(arr[j][i]+" ");
			}
			System.out.println();
		}
	}

	public static void display(int[][] arr)
	{
		for(int[] row:arr)
		{
			for(int ele:row)
			{
				System.out.println(ele + " ");
			}
			System.out.println();
		}
	}
}