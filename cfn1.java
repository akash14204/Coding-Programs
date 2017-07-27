//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		 ArrayList<Integer> list=new ArrayList<Integer>();
		int t=in.nextInt();
		int[] a=new int[t];
		int z=t;
		for(int i=1;i<=t;i++){
			 //System.out.println("a");
		  int p=in.nextInt();
		  if(p==z){
			   //System.out.println("b");
			  System.out.print(z+" ");
			  z--;
			  int k=z;
			  
			  for(int h=0;h<list.size();h++){
				   //System.out.println("c");
				  if(k==list.get(h)){
					   //System.out.print("d");
					  System.out.print(z+" ");
					  k--;
					  z--;
				  }
				   
			  }
			  //System.out.print(z+" "+k);
		  }
		else{
			 //System.out.println("e");
			 list.add(p);
			 System.out.println("");
		}
		}
	}
}	