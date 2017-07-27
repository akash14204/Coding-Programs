//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class A{

	
	
//FUNCTION TO FIND END INDEX	
	    int binarySearch(long arr[], long x){
		int m=0;
        int l = 0, r = arr.length - 1;
        while (l <= r){
            m = l + (r-l)/2;
            if (arr[m] == x)
                return m+1;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return l;
        }
	
	
	
	
	
	
	public static void main(String args[])  throws IOException{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		
		while(t-->0){
		  int x=in.nextInt();
		  int y=in.nextInt();
		  int z=in.nextInt();
		 
		  long[] xrr=new long[x];
		  long[] yrr=new long[y];
		  long[] zrr=new long[z];
		    for(int i=0;i<x;i++){
			  xrr[i]=in.nextLong();
		    }
			for(int i=0;i<y;i++){
			  yrr[i]=in.nextLong();
		    }
			for(int i=0;i<z;i++){
			  zrr[i]=in.nextLong();
		    }
			
			Arrays.sort(xrr);
			Arrays.sort(zrr);
		
		  long d=0L,e=0L;	
		  long[] Nxrr=new long[x];
		  long[] Nyrr=new long[y];
		  long[] Nzrr=new long[z];
			for(int i=0;i<x;i++){
				d+=xrr[i];
			    Nxrr[i]=d;
			}
			for(int i=0;i<z;i++){
				e+=zrr[i];
			    Nzrr[i]=e;
			}
			
			
		   BigInteger c=BigInteger.valueOf(0);
		   int n1=0,n3=0;
		    for(int i=0;i<y;i++){
				BigInteger tempx=BigInteger.valueOf(0);
				BigInteger tempy=BigInteger.valueOf(0);
				A ob = new A();
				
//................................................................	
                  long z1=0;	
				  n1 = ob.binarySearch(xrr, yrr[i]);
                  if(n1==0) z1=0;				  
				  else z1=(n1*yrr[i])+(Nxrr[n1-1]);
				  tempx=BigInteger.valueOf(z1);
			   		   
//....................................................................
                  long z2=0;		
				  n3 = ob.binarySearch(zrr, yrr[i]);  
				  if(n3==0) z2=0;	
				  else z2=(n3*yrr[i])+(Nzrr[n3-1]);
                  tempy=BigInteger.valueOf(z2);			  
			 
			   c = c.add((tempx).multiply(tempy));
			   System.out.println(c);
			}  	
			System.out.println(c.mod(BigInteger.valueOf(1000000007)));	
		}
	}
}	