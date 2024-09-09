import java.util.Scanner;

public class Bubble_sort {

	public static void main(String args [])
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

		Bubble_sort obj = new Bubble_sort();
		obj.bubblesort(arr);
		
	}

	public void bubblesort(int arr[])
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("\nSorted Array : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}