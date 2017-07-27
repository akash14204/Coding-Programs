//simple input
import java.util.*;
import java.io.*;
public class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		  int[] a1=new int[n+1];
		  int[] a2=new int[n+1];
		  int sum1=0;
		  int sum2=0;
		  for(int i=1;i<=n;i++){
				a1[i]=in.nextInt();
				a2[i]=in.nextInt();
				sum1=sum1+a1[i];
				sum2=sum2+a2[i];
		  }
		  
		  int diff=Math.abs(sum1-sum2);
		  int max=diff;
		  int z=0;
		   for(int i=1;i<=n;i++){
			 int ans=Math.abs((sum1-a1[i]+a2[i])-(sum2-a2[i]+a1[i]));
			 if(ans>max){
				 max=ans;
				 z=i;
			 }
		  }
		  
		  System.out.println(z);
	}
}	
