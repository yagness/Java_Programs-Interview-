import java.util.Scanner;
public class SortArray
{
	public static void main(String args[])
	{
		try{
			int size;
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter the size of array : ");
			size = sc.nextInt();
			int[] a = new int[size];
			
			if(size>0)
			{
				for(int i=0;i<size;i++)
				{
					System.out.print("Enter value for "+i+" : ");	
					a[i]=sc.nextInt();
				}
			}
			else
			{
				System.out.println("Enter the valid size of array..");
			}

			//printing the unsorted array
			System.out.println("----Unsorted Array----");
			for(int i=0;i<size;i++)
			{
				System.out.print(a[i]+",");
			}

			//logic for sorting array in ascending order
			for(int i=0;i<size;i++)
			{
				for(int j=0;j<size;j++)
				{
					if(a[i]<a[j])
					{
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp; 
					}
				}	
			}

			//printing sorted array
			System.out.println();
			System.out.println("------Sorted Array------");
			for(int i=0;i<size;i++)
			{
				System.out.print(a[i]+",");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}