import java.util.ArrayList;

public class RemoveDuplicate1{
    public static void main(String args[])
    {
        int a[] = {0,1,1,2,2,33,4,5,6,5};
        int count=0;
        int z=0;
        int b[] = new int[7];

        for(int i=0;i<a.length;i++){
            // if(!b.contains(a[i]))
            // {
            //     b.add(a[i]);
            // }
            // else{
            //     break;
            // }

            boolean found = false;
            for(int j=0;j<count;j++)
            {
                if(a[i]==b[j])
                {
                    found = true;
                    break;
                }
                else if(a[i]==0 && z==0)
                {
                    z++;
                    b[count]=0;
                    count++;
                    break;
                }
            }
            if(found==false)
            {
                b[count]=a[i];
                count++;
            }
        }
        
        for(int i=0;i<count;i++)
        {
            System.out.print(b[i]+ " ");
        }
    }
}