import java.util.Scanner;

public class Sequential_search {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the value for "+i+" : ");
			arr[i] = sc.nextInt();	
		}
		
		/*Print array using for each loop
		for(int value:arr)
		{
			System.out.println(value);
		}*/

		for(int i=0;i<size;i++)
		{
			System.out.println(i+" : "+arr[i]);
		}

		System.out.println("Enter the value for search : ");
		int ele = sc.nextInt();

		Sequential_search obj= new Sequential_search();
		obj.search(arr,ele);
	}
	
	public void search(int arr[],int ele)
	{
		//boolean found = false;
		int pos = -1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				//found = true;
				pos = i;
				break;
			}
		}

		if(pos!=-1)
		{
			System.out.println(ele+" Found at position "+pos);
		}
		else
		{
			System.out.println(ele+" Not found in the array");
		}
	}
}