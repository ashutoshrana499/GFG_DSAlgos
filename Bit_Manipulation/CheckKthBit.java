import java.util.*;
import java.lang.*;
import java.io.*;

//Shift the number by k-1 no of times and the kth bit is your lsb.
//now AND your new number with 1
class GFG 
{
	public static void main (String[] args)
	{
		
	  Scanner sc = new Scanner(System.in);
	  int t=sc.nextInt();
	  
	  while(t-- != 0)
	  {
	      int n = sc.nextInt();
	      int k = sc.nextInt();
	      
	      if(Kthbit(n,k) == 1)
	       System.out.println("Yes");
	      if(Kthbit(n,k) == 0)
	       System.out.println("No");
	  }
	    
	}
	
	public static int Kthbit(int n, int k)
	{
	    int num = n >> (k); //k-1 if lsb's position is assumed as 1
	    
	    return (num & 1);
	}
}
