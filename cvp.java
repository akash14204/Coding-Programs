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
		  String S="abcdefghijklmnopqrstuvwxyz";
		  String inp=in.next();
		  int[] arr=new int[26];
		  for(int i=0;i<=25;i++){
			  int p=0;
			  for(int j=0;j<=inp.length()-1;j++){
				  //System.out.print(i+"n");
				  if(S.charAt(i)==inp.charAt(j)){
					  p++;
					  arr[i]=p;
				  }
		      }
		  }
		  
		  
		   
		   
		   int flag=0;
		   for(int j=0;j<26;j++){
			   if(arr[j]!=j+1 && arr[j]!=0){
				  //System.out.println(j); 
				  System.out.println("No");
				  flag=1;
                  break; 				  
			   }
		   }
		   if(flag==0){
			   System.out.println("Yes");
		   }
		  
		  
		}
	}
}	