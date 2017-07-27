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
		  
		  int l=in.nextInt();
		  String report=in.next();
		  
		  int i=0;
		  int z=0;
		  String[] a=new String[1000000];
		  while(i<l){
			  if(report.charAt(i)=='.'){
				 i++; 
			  }
			  else if(report.charAt(i)=='T'){
				  a[z]="T";
				  z++;
				  i++;
			  }
			  else if(report.charAt(i)=='H'){
				  a[z]="H";
				  z++;
				  i++;
			  }
		    }
		   /*for(int k=0;k<z;k++){
			   System.out.print(a[k]);
		   }*/
		   //System.out.print(z);
		   
		   
		   if(z==0){
			   System.out.println("Valid");  
		   }
		   int k=0;
		   while(k<z){
			   if(a[k]=="H"){
				   if(k!=z-1){
				   if(a[k+1]=="H"){
				     System.out.println("Invalid");
					 break;
			       }
				   else{
					   //System.out.print(z);
					   //System.out.print(k);
					   if(a[k+1]=="T" & k+1==z-1){
						 System.out.println("Valid");  
						 break;
					   }
					   else{
						   k=k+2;
					   }
				    }
				   }
				   else{
					 System.out.println("Invalid");
					 break;
				   }
			   }
			   else{
				   System.out.println("Invalid");
				   break;  
			   }
		   }
		   
		}
	}
}	