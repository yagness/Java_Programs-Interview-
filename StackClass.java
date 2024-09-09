import java.util.*;
public class StackClass
{
   static ArrayList<Integer> list = new ArrayList<>();
   public static boolean isEmpty()
   {
        return list.size()==0;
   }

   public static void push(int data)
   {
    list.add(data);
   }

   public static int pop()
   {
        if(isEmpty())
        {
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;

   }

   public static int peek()
   {
        if(isEmpty())
        {
            return -1;
        }
        return list.get(list.size()-1);
   }

   public static void main(String args[])
   {
    push(1);
    push(2);
    push(3);
    push(4);
    while(!list.isEmpty())
    {
        System.out.println(peek());
        pop();
    }
   }
}