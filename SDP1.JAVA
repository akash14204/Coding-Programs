//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		long t=in.nextLong();
		
		while(t-->0){
		  int n=in.nextInt();
		  long[] a=new long[n+1];
		  long[] arr1=new long[n+1];
		  long[] arr2=new long[n+1];
		  long[] arr3=new long[n+1];
		  for(int i=0;i<n;i++){
			  a[i]=in.nextLong();
		  }
		  long z=1;
		  for(int i=0;i<n;i++){
			  if(a[i]<z){
				  z=a[i];
				  arr1[i]=z;
				  z++;
			  }
			  else{
				  arr1[i]=z;
				  z++;
			  }
		  }
		  /*for(long i=0;i<n;i++){
			  System.out.prlongln(arr1[i]);
		  }*/
		  long y=1;
		  //System.out.prlongln(a[n-1]);
		  for(int i=n-1;i>=0;i--){
			  if(a[i]<y){
				  y=a[i];
				  arr2[i]=y;
				  y++;
				  //System.out.prlongln("a");
			  }
			  else{
				  arr2[i]=y;
				  y++;
				  //System.out.prlongln("b");
			  }
		  }
		  /*for(long i=0;i<n;i++){
			  System.out.prlongln(arr2[i]);
		  }*/
		  for(int i=0;i<n;i++){
			  if(arr1[i]>arr2[i]){
				  arr3[i]=arr2[i];
			  }
			  else{
				  arr3[i]=arr1[i];
			  }
		  }
		  /*for(long i=0;i<n;i++){
			  System.out.prlongln(arr3[i]);
		  }*/
		  long max=-1;
		  long sum=0;
		  for(int i=0;i<n;i++){
			  if(max<arr3[i]){
				  max=arr3[i];
			  }
			  sum+=a[i];
		  }
		  System.out.println(sum-(max*max));
		}
	}
}