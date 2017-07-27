//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;


// Java implementation of iterative Binary Search
class A
{
    // Returns index of x if it is present in arr[], else
    // return -1
    int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r)
        {
            int m = l + (r-l)/2;
 
            // Check if x is present at mid
            if (arr[m] == x)
                return m;
 
            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
        // if we reach here, then element was not present
        return l-1;
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
		Scanner in=new Scanner(System.in);
        A ob = new A();
        int t=in.nextInt();
		int[] arr=new int[t+1];
		for(int i=1;i<=t;i++){arr[i]=in.nextInt();}
        int x = in.nextInt();
        int result = ob.binarySearch(arr, x);
		//System.out.println("result "+result);
		int res1=result;
		if(arr[t]<x){res1=t; System.out.println("res1 b"+res1);}
		else if(arr[1]>x){res1=0; System.out.println("res1 c"+res1);}
		else{
			for(int j=result;j<=t;j++){
			        if(x==arr[j]){res1=j;  continue;} else break;
		    }
			System.out.println("res1 a"+res1);
		}
			
			
		
    }
}