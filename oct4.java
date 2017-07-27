import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
class A{
    public static void main(String args[]) throws Exception{
        Scanner in=new Scanner(System.in);
		
		try{
			int n=in.nextInt();
			long[][] a=new long[n+100][n+100];
			long[][] sqrt=new long[n+100][n+100];
			long[] check=new long[n*1000];
			
			for(int i=1;i<=n;i++){
				for(int j=1;j<=2;j++){
					a[i][j]=in.nextLong();
			    }	
			}
			
			
			
			
			for(int i=1;i<=n;i++){
				for(int j=i+1;j<=n;j++){
					sqrt[i][j]=((a[i][1]-a[j][1])*(a[i][1]-a[j][1]))+((a[i][2]-a[j][2])*(a[i][2]-a[j][2]));
			    }	
			}
			/*
			for(int i=1;i<=n;i++){
				for(int j=i+1;j<=n;j++){
					System.out.println(sqrt[i][j]);
			    }	
			}*/







			
			for(int p=1;p<=n;p++){
				int x=0;
				for(int i=1;i<=n;i++){
				  for(int j=i+1;j<=p;j++){
					check[x]=sqrt[i][j];
					x++;
			      }	
			    }
				long max=check[0];
				for(int s=1;s<x;s++){
					if(max<check[s]){
						max=check[s];
					}
				}
				System.out.println(max);
			}
			
			
			
		
}
catch(Exception ee)
{}

		}
}	