//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class A{
	public static void main(String args[]) throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
		
		// Scanner in=new Scanner(System.in);
	     String str[]=br.readLine().split(" ");
		 
		 int[] arr1=new int[125];
		 int[] arr2=new int[125];
		 int v=0;
		 int flag=0;
		 for(int i=0;i<str.length;i++){
			 System.out.println(str[i]);
			  for(int j=i;j<str.length;j++){
				  System.out.println((str[i]).length());
				  System.out.println((str[j]).length());
				   if((str[i]).length()==(str[j]).length()){
					   System.out.print("JGHJ");
					    arr1=counting(str[i]);
						arr2=counting(str[j]);
				   }
			  }
		 }
		 
		 
		 
		 
		 
		 
	}
	
	public static int[] counting(String str_new ){
		int[] arr=new int[125];
		for(int p=0; p<(str_new).length();p++){
			char index=  str_new.charAt(p);
			int index1= (int)(index);
			arr[index1]=arr[index1]++;
		}
		for(int k=0;k<arr.length;k++){
			System.out.print(arr[k]);
		}
		
		return arr;
	}  
}