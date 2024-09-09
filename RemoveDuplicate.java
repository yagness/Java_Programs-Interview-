import java.util.ArrayList;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int a[] = new int[]{0,0,1,1,1,2,2,3,3,4};

        // ArrayList<Integer> b = new ArrayList<>();
        int b[] = new int[7];
        int count = 0;
        int cz = 0; 
        for(int i=0;i<a.length;i++)
        {
            boolean found = false;
            // if(!b.contains(a[i]))
            // {
            //     b.add(a[i]);
            // }
            for(int j=0;j<count;j++)
            {
                if(a[i]==b[j])
                {
                    found = true;
                    break;
                }
                if(cz==0 && a[i]==0)
                {
                    cz = 2;
                    b[count] = 0;
                    count++;
                    break;
                }
                
            }
            if(found==false)
            {
                b[count] = a[i];
                count++;
            }
        }

        // b.forEach(val->System.out.print(val+ " "));

        for(int i=0;i<count;i++)
        {
            System.out.print(b[i] + " ");
        }
    }
}
