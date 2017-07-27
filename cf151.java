import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
public class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		long p=0;
		for(int i=0;i<t;i++){
			String str=in.next();
			if(str.equals("Tetrahedron")){
				p+=4;
			}
			if(str.equals("Cube")){
				p+=6;
			}
			if(str.equals("Octahedron")){
				p+=8;
			}
			if(str.equals("Dodecahedron")){
				p+=12;
			}
			if(str.equals("Icosahedron")){
				p+=20;
			}
		}
		System.out.println(p);
	}
}	