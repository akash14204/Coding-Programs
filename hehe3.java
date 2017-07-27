 
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
				for(int j=0;j<t.length();j++){
					if(Math.abs(j-i)%4==0){
				        if(t.charAt(j)!='!'){
					if(t.charAt(j)=='R'){
						r++;
						break;
					}
					else if(t.charAt(j)=='G'){
						g++;
						break;
					}
					else if(t.charAt(j)=='Y'){
						y++;
						break;
					}
					else if(t.charAt(j)=='B'){
						b++;
						break;
					}
						}
					}
				}
			}
		}
		System.out.println(r+" "+b+" "+y+" "+g);
	}
}