import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
public class cf5a{
 
  public static void main(String[] args) throws IOException {
	   
	   InputStreamReader ir = new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(ir);
	   
	   long x=Long.parseLong(br.readLine());
	   String str[]=br.readLine().split("10");
	   
	   for(int i=0;i<str.length;i++){
		  //System.out.print(str[i].length()); 
		 // System.out.println(str[i]);
	   }
	   
	   for(int i=0;i<str.length-1;i++){
		  int c=0;
		   for(int j=0;j<str[i].length();j++){
			   if(str[i].charAt(j)=='1'){
				   c++;
			   }
		   }
		   
			  for(int k=0;k<str[i].length()-c;k++){  
			   System.out.print("0"); 
			  }
			   System.out.print(c+1); 
	   }
	   
	   int c=0;
	   for(int j=0;j<str[str.length-1].length();j++){
			   if(str[str.length-1].charAt(j)=='1'){
				   c++;
			   }
		   }
	   for(int k=0;k<str[str.length-1].length()-c;k++){  
			   System.out.print("0"); 
			  }
			  System.out.print(c);  	   
  }
}