import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
class A{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
		
        int n=in.nextInt();
		int m=in.nextInt();
		int[][] a=new int[m+2][m+2];
		for(int j=1;j<=m;j++){
			for(int i=1;i<=2;i++){
			  a[j][i]=in.nextInt();
		    }
		}
		
		int q=in.nextInt();
		for(int i=1;i<=q;i++){
			  q=in.nextInt();
			int c=0;  
			for(int j=1;j<=m;j++){
			    for(int k=1;k<=2;k++){
			       if(a[q][k]==a[j][k]){
					 c++;   
				   }
		        }
		    } 
                    if(c>=3){
					   System.out.println("Dj Rocks");
				    }	
					else{
					System.out.println("Gagan Rocks");	
					}
		}
	}
}	