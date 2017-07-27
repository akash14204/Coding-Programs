//simple input
import java.util.*;
import java.lang.*;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		
		int c=0;
		for(int i=0;i<n-1;i++){
			if(k-(a[i]+a[i+1])>0){
				c=c+(k-(a[i]+a[i+1]));
				a[i+1]=a[i+1]+(k-(a[i]+a[i+1]));
			}
		}
		
		System.out.println(c);
		for(int i=0;i<n;i++){
		  System.out.print(a[i]+" ");	
		}
		
	}
}	
