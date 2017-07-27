import java.util.*;
import java.io.*;
class A{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
           int m=in.nextInt();
           int n=in.nextInt();
           int c=in.nextInt(); 
		   
           int i=1;
		   int j=n;
		   int res=0;
            while(i<=m&&j>=1){
				if(i*j>c){
					j--;
				}
				else if(i*j==c){
					j--;
					i++;
					res++;
				}
				else if(i*j<c){
					i++;
				}
			}			
			System.out.println(res);
			
        }
	}
}	