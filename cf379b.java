//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
public class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		
		
		int c=0;
		
		int[] a=new int[3];
		
		 a[0]=in.nextInt();
		int p=a[0];
		
		int n=in.nextInt();
		
		 a[1]=in.nextInt();
		int q=a[1];
		
		 a[2]=in.nextInt();
		int r=a[2];
	
		
		Arrays.sort(a);
		
		c=a[0]*256;
		
		p=p-a[0];
		q=q-a[0];
		r=r-a[0];
		
		if(n>p){
			System.out.println(c+(p*32));
		}
		else{
			System.out.println(c+(n*32));
		}
	}
}	
