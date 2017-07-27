//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		long l=in.nextLong();
		long r=in.nextLong();
		long[] num=new long[n];
		for(int i=0;i<n;i++){
			 num[i]=in.nextLong();
		}
		
		long p=0,q=0,z=0;
		for(long i=l;i<=r;i++){
			for(int j=0;j<n;j++){
			   p=Math.abs(i-num[j]);
			   q=i+num[j];
			   
			   for(int k=0;k<n;k++){
				   if(num[k]>p && num[k]<q && num[k]!=num[j]){
					   z++;
					   break;
				   }
			   }
			   break;
		    }
		}
		System.out.println(z);
	}
}	