import java.util.ArrayList;
import java.util.Collections;

public class MergeSortedArray {
    public static void main(String[] args) {
        int a1[] = {1,2,3,0,0,0};
        int m = 3;
        int a2[] = {2,5,6};
        int n = 3;
        
        ArrayList<Integer> a3 = new ArrayList<>();

        for(int i=0;i<m;i++)
        {
            a3.add(a1[i]);
        }
        for(int i=0;i<n;i++)
        {
            a3.add(a2[i]);
        }

        Collections.sort(a3);

        for(int i : a3)
        {
            System.out.print(i + " ");
        }
    }
}
