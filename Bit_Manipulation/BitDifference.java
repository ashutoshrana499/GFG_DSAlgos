//Convert A to B 
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- != 0)
	    {
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        
	        System.out.println(Flip(a,b));
	        
	    }
	}
	
	public static int Flip(int a, int b)
	{
	    int num = a^b;
	    
	    int count = 0;
	    while(num > 0){
	        count+=(num&1);
	        num = num>>1;
	    }
	    
	    return count;
	}
}
