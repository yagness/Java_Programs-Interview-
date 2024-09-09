import java.util.Scanner;

public class Selection_sort {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter value for "+i+" : ");
			arr[i] = sc.nextInt();
		}

		for(int i=0;i<size;i++)
		{
			for(int j=i;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				//System.out.println(arr[i]);
			}
		}
	
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
}