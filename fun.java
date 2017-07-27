import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
class A{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
		
        int n=in.nextInt();
		int m=in.nextInt();
		int k=in.nextInt();
		int[] a=new int[m+2];
		int[] ans=new int[m+2];
			for(int i=1;i<=n;i++){
			  a[i]=in.nextInt();
		    }
		
		
		for(int i=1;i<=k;i++){
			  int l=in.nextInt();
			  int r=in.nextInt();
              int two=0;	
              int one=l;		
			    for(int q=l;q<=r;q++){
			       if(a[l]==a[q]){
					 two=q;
				   }
		        }
				 int yo=two-one;
		         System.out.println(yo);
		    } 
           
					
		}	
	}
	