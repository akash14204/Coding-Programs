import java.util.*;
import java.math.*;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		
		
		while(t-->0){
			int  n=in.nextInt();
			
			long a[]=new long[n];
			long arr[]=new long[n];
			long arr1[]=new long[n+1];
			for(int i=0;i<n;i++){
				a[i]=in.nextLong();
			}
			
			Arrays.sort(a);
			
			for(int i=0;i<n;i++){
				System.out.println(a[i]);
			}
		}
	}
}	