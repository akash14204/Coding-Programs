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
		  int m=in.nextInt();
		  long p=0;
		  for(int i=0;i<n-1;i++){
		    p=p+(long)Math.pow(2,i);
			//System.out.println(p); 
		  }
		  System.out.println(Math.round(p+Math.pow(2,(n+m-1)))); 
		}
	}
}	