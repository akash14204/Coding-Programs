//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class A{
	public static void main(String args[])throws IOException {
	   InputStreamReader ir = new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(ir);
	   
		String[] str=new String[10];
		for(int i=0;i<10;i++){
			str[i]=br.readLine();
	    }
		
		
		int[] a=new int[5];
		int[] b=new int[5];
		int z=0;
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(str[i].charAt(j)=='x'){
					a[z]=i;
					b[z]=j;
					z++;
					break;
				}
	        }
	    }
		
		int p=0;,q=0;
		for(int i=0;i<4;i++){
			if(a[i]==a[i+1]){
				p++;
			}
			else if(b[i]==b[i+1]){
				q++;
			}
			
		}
		
		
		
		
		
		
		
	}
}	