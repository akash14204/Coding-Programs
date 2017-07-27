//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int p=1,q=1;
		int s=0;
		int n=in.nextInt();
		int[][] a=new int[n+1][5];
		int[][] b=new int[n+1][5];
		int[] aa=new int[n+1];
		int[] bb=new int[n+1];
		int[] ans=new int[n+1];
		
		for(int i=1;i<=n;i++){
			int x1=in.nextInt(); 
			int y1=in.nextInt();
		    int x2=in.nextInt(); 
		    int y2=in.nextInt();			
			if(y1-y2==0){
				aa[p]=i;
				//System.out.println("A");
					if(x1>x2){
						//System.out.println("B");
						a[p][1]=x2;
				        a[p][2]=y1;
				        a[p][3]=x1;
				        a[p][4]=y2;
						p++;
					 }
					else if(x1<x2){
						//System.out.println("C");
						a[p][1]=x1;
				        a[p][2]=y1;
				        a[p][3]=x2;
				        a[p][4]=y2;
				        p++;
					}
				}
				else if(x1-x2==0){
					bb[q]=i;
					if(y1>y2){
						//System.out.println("E");
						b[q][1]=x1;
				        b[q][2]=y2;
				        b[q][3]=x2;
				        b[q][4]=y1;
				        q++;
					}
					else if(y1<y2){
						//System.out.println("F");
						b[q][1]=x1;
				        b[q][2]=y1;
				        b[q][3]=x2;
				        b[q][4]=y2;
				        q++;
					}
				}
		}		
		   // System.out.println("p="+p+" q="+q);
			for(int i=1;i<p;i++){
				int c=0;
				for(int j=1;j<q;j++){
				        if((a[i][1]<=b[j][1] && a[i][3]>=b[j][1])&&(a[i][2]>=b[j][2] && a[i][2]<=b[j][4])){
							if(a[i][1]==b[j][1]&&a[i][2]==b[j][2])
								continue;
							if(a[i][1]==b[j][3]&&a[i][2]==b[j][4])
								continue;
							if(a[i][3]==b[j][1]&&a[i][4]==b[j][2])
								continue;
							if(a[i][3]==b[j][3]&&a[i][4]==b[j][4])
								continue;
							ans[aa[i]]++;
							ans[bb[j]]++;
							s++;
						}  
				    }					
			    }
		System.out.println(s);
		for(int i=1;i<=n;i++)
			System.out.print(ans[i]+" ");
	}			
}
				
