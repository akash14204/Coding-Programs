//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		
		while(t-->0){
			
		  int n=in.nextInt();
		  int[] a=new int[n+1];
		  
		  int max=0;
		   for(int i=1;i<=n;i++){
			  a[i]=in.nextInt();
			  if(a[i]>max){
				  max=a[i];
			  }
		  }
		  System.out.println(n-max);
		}
	}
}	