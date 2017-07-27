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
		  String n=in.next();
		  
		  if(n.contains("EC") || n.contains("SC") || n.contains("SE")){
			  System.out.println("no");
		  }
		  else{
			  System.out.println("yes");
		  }
		}
	}
}	