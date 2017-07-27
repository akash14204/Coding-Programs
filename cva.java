//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		long[] arr=new long[110];
		String[] str=new String[110];
		long p=2;
		long q=3;
		for(int i=1;i<=105;i++){
			String with3digits = String.format("%05d", p*q);
			str[i]=with3digits;
			p=p+2;
			q=q+4;
		}
		/*for(int i=1;i<=105;i++){
			System.out.println(str[i]);
		}*/
		
		int i=1;
		int n=1;
		while(i<=t*(t+1)/2){
			for(int j=1;j<=n;j++){
                System.out.print(str[i]);
				i++;
			}
			n++;
			System.out.println();
		}
	}
}	