//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
 class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
		  a[i]=in.nextInt();
		}
		int c=0;
		//System.out.println(a[0]+"   "+a[n-1]);
	    Arrays.sort(a);
		for(int j=0;j<n;j++){
		  if(a[j]!=a[0] && a[j]!=a[n-1]){
			  //System.out.println("p");
			  c++;
		  }
		}
		System.out.println(c);
	}
}	