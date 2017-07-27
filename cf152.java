import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
public class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int[] p=new int[a];
		int[] q=new int[a];
		for(int i=0;i<a;i++){
		   p[i]=in.nextInt();
		   q[i]=in.nextInt();
		}
		int b=in.nextInt();
		int[] x=new int[b];
		int[] y=new int[b];
		for(int i=0;i<b;i++){
		   x[i]=in.nextInt();
		   y[i]=in.nextInt();
		  
		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		int d=0;
		for(int m=0;m<a;m++){
			for(int n=0;n<b;n++){
			  if(x[n]-p[m]<0){
				  if(y[n]-q[m]<0){
				    if(y[n]-p[m]<0){
						if(al.isEmpty()){
	                     al.add(p[m]-y[n]);
	                    }
						else if(Collections.max(al)<p[m]-y[n]){
				          al.add(p[m]-y[n]);
						}
			        } 
			      }
			  }
			  if(p[m]-x[n]<0){
				  if(p[m]-x[n]<0){
				   if(q[m]-y[n]<0){
				    if(x[n]-q[m]>0){
						if(al.isEmpty()){
	                     al.add(p[m]-y[n]);
	                    }
						else if(Collections.max(al)<x[n]-q[m]){
				         al.add(x[n]-q[m]);
						}
			        } 
			      }
			  }
		    }
		}
	}
    if(al.isEmpty()){
	    System.out.println("0");
	}
	else{
		System.out.println(Collections.max(al));
	}
	
}
}	