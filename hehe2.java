//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
public class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String t=in.next();
		int r=0,g=0,y=0,b=0;
		for(int i=0;i<t.length();i++){
			if(t.charAt(i)=='!'){
				if(i+4<=t.length()-1){
					if(t.charAt(i+4)=='R'){
						r++;
					}
					else if(t.charAt(i+4)=='G'){
						g++;
					}
					else if(t.charAt(i+4)=='Y'){
						y++;
					}
					else if(t.charAt(i+4)=='B'){
						b++;
					}
					else if(t.charAt(i+4)=='!'){
						
					}
				}
				else{
					if(t.charAt(i-4)=='R'){
						r++;
					}
					else if(t.charAt(i-4)=='G'){
						g++;
					}
					else if(t.charAt(i-4)=='Y'){
						y++;
					}
					else if(t.charAt(i-4)=='B'){
						b++;
					}
				}
			}
		}
		System.out.println(r+" "+b+" "+y+" "+g);
	}
}	