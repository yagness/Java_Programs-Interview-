public class MergeInterval1
{
    public static void main(String[] args) {
        int arr[][] = {{2,6},{1,3},{8,12},{14,15}};

        for(int i=0;i<arr.length-1;i++)
        {
           // System.out.println(i[1]+" "+i[0]);
           if(arr[i][0]>arr[i+1][0])
           {
                int temp[] = {arr[i][0],arr[i][1]};
                arr[i]=arr[i+1];
                arr[i+1]=temp;
           }
        }
    }
}