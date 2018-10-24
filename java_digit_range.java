import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            String str[] = sc.nextLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int d = Integer.parseInt(str[1]);
            if(d>n) System.out.print(-1);
            else
            for (int i = 0; i <=n ; i++)
              if(String.valueOf(i).contains(String.valueOf(d)))
                  System.out.print(i+" ");
                  
                System.out.println();   
        }
    }//main
}