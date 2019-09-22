/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
      System.out.println("hello  steve priya!!");
	    int ans=0;
	    while(n>0)
	{  String str1=sc.next();
	   String str2=sc.next();
	   char arr1[] = str1.toCharArray();
       char arr2[] = str2.toCharArray();
       Arrays.sort(arr1);
       Arrays.sort(arr2);
	  if(Arrays.equals(arr1, arr2))
	  {
    	System.out.println(1);

	  } else
	  {
    	System.out.println(0);
      }
	    n--;
	}
		//code
	}
}
