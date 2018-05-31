
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- != 0)
	    {
	        int m = sc.nextInt();
	        int n = sc.nextInt();
	        
	        System.out.println(diffposition(m,n));
	    }
	    
	}
	
    public static int diffposition(int m,int n)
    {
        int num = m^n;
        
        return SetBitPos(num);
    }
    
    public static int SetBitPos(int num)
    {
        return (int)((Math.log10(num & -num))/Math.log10(2))+1;
    }
	
}
