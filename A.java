//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		long[] arr=new long[106];
		long p=2;
		long q=3;
		for(int i=1;i<=105;i++){
			arr[i]=p*q;
			p=p+2;
			q=q+4;
		}
		/*for(int i=1;i<=105;i++){
			System.out.println(arr[i]);
		}*/
		
		int i=1;
		int n=1;
		while(i<=t*(t+1)/2){
			for(int j=1;j<=n;j++){
				String with3digits = String.format("%05d", arr[i]);
                System.out.print(with3digits+" ");
				i++;
			}
			n++;
			System.out.println("");
		}
	}
}	