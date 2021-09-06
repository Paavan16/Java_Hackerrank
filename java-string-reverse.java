import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder B=new StringBuilder(A);
        B.reverse();
        String k=B.toString();
        if(A.equals(k))
        System.out.println("Yes");
        else
        System.out.println("No");
        /* Enter your code here. Print output to STDOUT. */
        
    }
}



