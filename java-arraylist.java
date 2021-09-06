import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a,q,x,y;
    ArrayList[] al = new ArrayList[n];
    for(int i=0;i<n;i++){
        a = sc.nextInt();
        al[i] = new ArrayList();
        for(int j=0;j<a;j++){  
            al[i].add(sc.nextInt());                
        }
    }
    q=sc.nextInt();
    for(int i=0;i<q;i++){
        x=sc.nextInt();
        y=sc.nextInt();
        try{
            System.out.println(al[x-1].get(y-1));
        } catch(Exception e){
            System.out.println("ERROR!");
        }
    }
    }
}
