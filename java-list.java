import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer> ll=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            int val=sc.nextInt();
            ll.add(val);
        }
        int q=sc.nextInt();
        while(q>0)
        {
        String toDo=sc.next();
        if(toDo.equals("Insert"))
        {
            int index=sc.nextInt();
            int value=sc.nextInt();
            ll.add(index,value);
        }
        else
        {
            int pos=sc.nextInt();
            ll.remove(pos);
        }
        q--;
        }
        for(Integer k:ll)
        System.out.print(k+" ");
    }
}
