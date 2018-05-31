import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) 
	{
		//code
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- != 0)
	    {
	        long n = sc.nextLong();
	        
	        if(powerof2(n)==1)
	         System.out.println("YES");
	        else 
	         System.out.println("NO");
	    }
	        
	}
	
	public static int powerof2(long n)
	{
	    int count =0;
	    while(n>0)
	    {
	     count+=(n&1);
	     n=n>>1;
	    }
	    return count;
	}
}
