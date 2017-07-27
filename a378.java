//simple input
import java.util.*;
import java.io.*;
import java.math.*;
class A{
	
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		
		String st=in.next();
		int[] arr=new int[st.length()+100];
		int[] a=new int[st.length()+100];
		int z=1;
		int c=0;
		for(int i=0;i<st.length();i++){
			if(st.charAt(i)=='A'||st.charAt(i)=='E'||st.charAt(i)=='I'||st.charAt(i)=='O'||st.charAt(i)=='U'||st.charAt(i)=='Y'){
				arr[z]=i+1;
				z++;
				c++;
			}
		}
		if(c==0){
			System.out.println("1");	
		}
		else{
	    arr[z]=st.length()+1;
		/*for(int i=0;i<=z;i++){
			System.out.println(arr[i]);	
		}*/
		//System.out.println(z+1);	
		int k=0;
		for(int i=0;i<=z-1;i++){
				a[k]=arr[i+1]-arr[i];
				k++;
			}
		
	    int max=a[0];
		for(int i=1;i<=z-1;i++){
				if(max<a[i]){
					max=a[i];
				}
			}
		/*for(int i=0;i<k;i++){
			System.out.println(a[i]);	
		}*/
		
		System.out.println(max);
		}
	}
}
	