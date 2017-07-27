//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
public class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		
		
		int n=in.nextInt();
		
		
		if(n%2==0){
			System.out.println(n/2);
			for(int i=1;i<=n/2;i++){
				System.out.println("2 ");
			}
		}
		else{
		   System.out.println(((n+1)/2)-1);	
		   for(int j=1;j<=((n+1)/2)-2;j++){
				System.out.print("2 ");
			}
			System.out.print("3");
		}
		
		
		
	}
}	
