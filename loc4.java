//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		
		int t=in.nextInt();
		
		int[][] a=new int[3][3];
		for(int i=1;i<t;i++){
			for(int j=1;j<=3;j++){
			  a[i][j]=in.nextInt();
			}
		}
		
		int flag=0;
		int z=0;
		int[] yo=new yo[t];
		for(int i=1;i<t;i++){
			for(int j=1;j<=3;j++){
			  if(Math.abs(a[i][2]-a[j][2])<=a[j][3]){
				  flag++;
			  }
			}
			yo[z]=flag;
			z++;
		}
		for(int i=1;i<z;i++){
		   System.out.println();
		}
	}
}