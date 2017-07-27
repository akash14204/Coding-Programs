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
		  int s=in.nextInt();
		  int[] a=new int[n];
		  int p=0;
		  for(int i=0;i<n;i++){
		    a[i]=in.nextInt();
			p=p+a[i];
		  }
		  if(p<=s/2){
			  System.out.println("YES");
		  }
		  else{
			  System.out.println("NO");
		  }
		}
	}
}	