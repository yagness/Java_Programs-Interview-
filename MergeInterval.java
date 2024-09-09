import java.util.*;

public class MergeInterval {
    public static void main(String[] args) {
        int arr[][] = {{2,6},{1,3},{8,12},{14,15}};

        //sorting
        for(int i=0;i<arr.length-1;i++)
        {
            // System.out.println(i[0] + " " + i[1]);
            if(arr[i][0] > arr[i+1][0])
            {
                int temp[] = {arr[i][0],arr[i][1]};
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        List<Integer[]> l = new ArrayList<>();
        // main logic for merging
        for(int i=0;i<arr.length;i++)
        {
            if(i!=arr.length-1)
            {

            if(arr[i][1] >= arr[i+1][0])
            {
                l.add(new Integer[]{arr[i][0],arr[i+1][1]});
                i++;
            }
            else 
            {
                l.add(new Integer[]{arr[i][0],arr[i][1]});
            }
            }
            else 
            {
                l.add(new Integer[]{arr[i][0],arr[i][1]});
            }
        }

        // display
        for(Integer i[] : l)
        {
            System.out.println(i[0] + " " + i[1]);
        }
    }
}
