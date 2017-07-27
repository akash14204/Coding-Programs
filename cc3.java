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
		int x=in.nextInt();
		int n=2*x;
		int[] a=new int[n+1];
		int[] b=new int[n+1];
		int z=0;
		
		  for(int i=1;i<=n;i++){
			  a[i]=in.nextInt();
		  }
		  Arrays.sort(a);
		   z=((3*n)+2)/4;
		  
		  System.out.println(a[z]);
		  
		  int p=1;
		  for(int i=1;i<=n/2;i++){
			  b[p]=a[i];
			  p=p+2;
		  }
		  int q=2;
		  for(int i=n;i>n/2;i--){
			  b[q]=a[i];
			  q=q+2;
		  }
		  for(int i=1;i<=n;i++){
			  System.out.print(b[i]+" ");
		  }
		  System.out.println( "");
		}
	}
}	