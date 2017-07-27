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
		  String str1=in.next();
          String str2=in.next();
		  
		  int flag=0;
		  int[] arr1=new int[n];
		  int[] arr2=new int[n];
		  int x=0;
		  for(int i=0;i<n;i++){
			  if(str1.charAt(i)=='*'){
				  flag=1;
				  arr1[x]=i;
				  x++;
			  }
		  }
		  int c=0;
		  if(flag==1){
			for(int i=0;i<n;i++){
			  if(str2.charAt(i)=='*'){
				  c=1;
			    }
		    } 
		  }
		  int y=0;
		  for(int i=0;i<n;i++){
			  if(str2.charAt(i)=='*'){
				  arr2[y]=i;
				  y++;
			    }
		    } 
		  
		  /*for(int i=0;i<x;i++){
			  System.out.print(arr1[i]);
		    } 
			  System.out.println("");
		    for(int i=0;i<y;i++){
			  System.out.print(arr2[i]);
		    } 
			System.out.println("");*/
			int u=0;
			int[] bol=new int[y+1];
			int yes=0;
			for(int i=0;i<x-1;i++){
			  for(int j=0;j<y-1;j++){
				  if(bol[j]==0){
			       if(arr1[i]>=arr2[j] && arr1[i]<arr2[j+1]){
					   //System.out.println(arr1[i]+" "+arr1[i+1]);
					   //System.out.println(arr2[j]+" "+arr2[j+1]);
					   u++;
					   yes=1;
					   bol[j]=1;
					   break;
				   }
				   else if(arr1[i+1]>arr2[j] && arr1[i+1]<=arr2[j+1]){
					   u++;
					   yes=1;
					   bol[j]=1;
					   break;
				   }
				   else if(arr1[i]<=arr2[j] && arr1[i+1]>=arr2[j+1]){
					   u++;
					   yes=1;
					   bol[j]=1;
					   break;
				   }
				   else if(arr1[i]>arr2[j] && arr1[i+1]<arr2[j+1]){
					   u++;
					   yes=1;
					   bol[j]=1;
					   break;
				   }
		         }
			  }
		    }
			
		 /*System.out.println(c);
		 System.out.println(u);
		 System.out.println(x+y);*/
		 if(x==0){
		 System.out.println(c+u+(x+y-1)-(2*u));
		 }
		 else if(y==0){
		 System.out.println(c+u+(x+y-1)-(2*u));
		 }
		 else if(y==0 && x==0){
		 System.out.println("0");
		 }
		 else{
		 System.out.println(c+u+(x+y-2)-(2*u));
		 }
		}
	}
}	