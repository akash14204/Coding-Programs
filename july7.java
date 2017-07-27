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
			
		  int n=in.nextInt();
		  int q=in.nextInt();
		  int[] arr=new int[n+1];
		  int[] temp1=new int[n+1];
		  int[] temp2=new int[n+1];
		  for(int i=1;i<=n;i++){
			  arr[i]=in.nextInt();
		  }	  
		  
		  for(int i=1;i<=q;i++){
			  int a=in.nextInt();
			  int b=in.nextInt();
			  int c=in.nextInt();
			  int d=in.nextInt();
			  
			  
			  for(int l=1;l<=n;l++){
			     temp1[l]=arr[l];
			     temp2[l]=arr[l];
		       }
			   
			   
			  Arrays.sort(temp1, a, b+1);
		      Arrays.sort(temp2, c, d+1);
			  
			   //for(int h=1;h<=n;h++){System.out.print(temp1[h]+" ");}System.out.println(" ");
		       //for(int h=1;h<=n;h++){System.out.print(temp2[h]+" ");}System.out.println(" ");
               
			   
			   
			   
			   
			   int res=0;		
               int flag=0;			   
			   while(a<=b){
				   //System.out.println(a+" "+c);
				   //System.out.println(temp1[a]+"temp"+temp2[c]);
				   if(temp1[a]!=temp2[c]){
					 res++;  
				   }
				   if(res>=2){
					   flag=1;
					   break;
				   }
				   a++;
				   c++;
			   }
			    if(flag==1){
				   System.out.println("NO");
			   }
			   else{
				    System.out.println("YES");
			   }
		  }
		  
		  
		}
	}
}	
