//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
public class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		//int[] a=new int[n];
		String str;
		int a=0;
		int d=0;
		str=in.next();
		
		for(int i=0;i<n;i++){
			if(str.charAt(i)=='A'){
				a++;
			}
			else{
				d++;
			}
		}
		
		if(a==d){
			System.out.println("Friendship");
		}
		else if(a>d){
			System.out.println("Anton");
		}
		else if(a<d){
			System.out.println("Danik");
		}
		
	}
}	
