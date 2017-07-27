import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String t=in.next();
		//int[] a=new int[n];
		for(int i=0; i<t.length();i++){
			if(t.length()% 2==0){
				if(i!=((t.length())/2)-1){
				  System.out.print(t.charAt(i));
				}
			}
			else{
				if(i!=((t.length())/2)){
				  System.out.print(t.charAt(i));
				}
			}
		}
	}
}	