import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MajorityEle {
   public static void main(String[] args) {
        int a[] = {3,2,3,2,3,2,3,3,3};

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(a[i]))
            {
                // int val = map.get(a[i]);
                map.put(a[i], (map.get(a[i])+1));
            }
            else
            {
                map.put(a[i],1);
            }
        }
        
        map.forEach((x,y) -> {
            if(y>(a.length/2))
            {
                System.out.println(x);
                return;
            }
        });
   } 
}
