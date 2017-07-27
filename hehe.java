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
		Arrays.sort(a);
		int z=0;
		for(int i=0;i<n;i++){
			z=z+a[n-1]-a[i];
		}
		System.out.println(z);
	}
}	