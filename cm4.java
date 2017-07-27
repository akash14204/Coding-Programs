//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class A{
	public static void main(String args[]) throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
		
		String str1;
		
		
	while ((str1 = br.readLine()) != null && str1.length()!= 0) {
		
	    String str[]=str1.split(" ");
		
		 if(str[1].equals("==")){
			 if(str[0].equals(str[2])){
				 System.out.println("1");
			 }
			 else{
				 System.out.println("0");
			 }
		 }
		 else if(str[1].equals("!=")){
			 if(Integer.parseInt(str[0])!=Integer.parseInt(str[2])){
				 System.out.println("1");
			 }
			 else{
				 System.out.println("0");
			 }
		 }
		 else if(str[1].equals(">=")){
			 if(Integer.parseInt(str[0])>=Integer.parseInt(str[2])){
				 System.out.println("1");
			 }
			 else{
				 System.out.println("0");
			 }
		 }
		 else if(str[1].equals("<=")){
			 if(Integer.parseInt(str[0])<=Integer.parseInt(str[2])){
				 System.out.println("1");
			 }
			 else{
				 System.out.println("0");
			 }
		 }
		 
		}	 
	}
}