//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class cvb2{
	public static void main(String args[]) throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
		
		// Scanner in=new Scanner(System.in);
	     String str[]=br.readLine().split(" ");
		 
		 for(int i=0;i<str.length;i++){
			  //System.out.println(str[i]);
			  for(int j=0;j<(str[i]).length();j++){
				  if((j+1)%2!=0){
					 int ascii= (int) str[i].charAt(j);
					 //System.out.println((ascii-64)+"hhh");
					  for(int k=0;k<ascii-64;k++){
						  System.out.print("0");
					  }
				  }
				  else{
					  int ascii= (int) str[i].charAt(j);
					  //System.out.println(ascii+"kkk");
					  for(int k=0;k<ascii-64;k++){
						  System.out.print("!");
					  }
				  }
			  }
			  System.out.println("");
		 }	 
	}
}
